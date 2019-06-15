package com.yrw.im.transfer.server.config;

/**
 * Date: 2019-06-09
 * Time: 15:18
 *
 * @author yrw
 */
public class TransferConfig {

    private Integer port;

    private String redisHost;

    private Integer redisPort;

    private String rabbitmqHost;

    private Integer rabbitmqPort;

    private String logPath;

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getRedisHost() {
        return redisHost;
    }

    public void setRedisHost(String redisHost) {
        this.redisHost = redisHost;
    }

    public Integer getRedisPort() {
        return redisPort;
    }

    public void setRedisPort(Integer redisPort) {
        this.redisPort = redisPort;
    }

    public String getRabbitmqHost() {
        return rabbitmqHost;
    }

    public void setRabbitmqHost(String rabbitmqHost) {
        this.rabbitmqHost = rabbitmqHost;
    }

    public Integer getRabbitmqPort() {
        return rabbitmqPort;
    }

    public void setRabbitmqPort(Integer rabbitmqPort) {
        this.rabbitmqPort = rabbitmqPort;
    }

    public String getLogPath() {
        return logPath;
    }

    public void setLogPath(String logPath) {
        this.logPath = logPath;
    }
}