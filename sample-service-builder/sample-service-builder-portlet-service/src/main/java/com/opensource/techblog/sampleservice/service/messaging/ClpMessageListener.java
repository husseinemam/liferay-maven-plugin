package com.opensource.techblog.sampleservice.service.messaging;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

import com.opensource.techblog.sampleservice.service.ClpSerializer;
import com.opensource.techblog.sampleservice.service.StudentLocalServiceUtil;
import com.opensource.techblog.sampleservice.service.StudentServiceUtil;
import com.opensource.techblog.sampleservice.service.TeacherLocalServiceUtil;
import com.opensource.techblog.sampleservice.service.TeacherServiceUtil;


public class ClpMessageListener extends BaseMessageListener {
    public static String getServletContextName() {
        return ClpSerializer.getServletContextName();
    }

    @Override
    protected void doReceive(Message message) throws Exception {
        String command = message.getString("command");
        String servletContextName = message.getString("servletContextName");

        if (command.equals("undeploy") &&
                servletContextName.equals(getServletContextName())) {
            StudentLocalServiceUtil.clearService();

            StudentServiceUtil.clearService();
            TeacherLocalServiceUtil.clearService();

            TeacherServiceUtil.clearService();
        }
    }
}
