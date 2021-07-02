package com.st.dynamic.service;

/**
 * author: pan haobo
 * data: 2021/7/2 11:05
 * description:
 */
public interface deleteBookData {
    @Override
    public void removeBoxDeviceById(String id) {
        boxDeviceMapper.deleteById(id);
    }
}
