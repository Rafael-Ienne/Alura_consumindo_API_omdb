package com.example.screenmach.service;

public interface IConvertData {
    <T> T obtainData(String json, Class<T> classe);
}
