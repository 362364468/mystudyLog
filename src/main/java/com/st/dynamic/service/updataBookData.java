package com.st.dynamic.service;

import com.baowei.utils.kit.DateUtils;

/**
 * author: pan haobo
 * data: 2021/7/2 11:08
 * description:
 */

public interface updataBookData {
    @Override
    public void updateTheDeviceID(String userId, DeviceIDParamVO deviceID) {
        boxDeviceMapper.updateTheDeviceID(DateUtils.getCurrentTime(), userId, deviceID.getList());
    }
}
