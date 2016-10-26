package org.voovan.docker.test.message;

import org.voovan.docker.message.Volume.Volume;
import org.voovan.docker.message.container.ContainerInfo;
import org.voovan.tools.log.Logger;

import java.text.ParseException;
import java.util.List;

/**
 * 类文字命名
 *
 * @author helyho
 *         <p>
 *         DockerFly Framework.
 *         WebSite: https://github.com/helyho/DockerFly
 *         Licence: Apache v2 License
 */
public class VolumeTest {

    public static String tmp = "{\n" +
            "  \"Volumes\": [\n" +
            "    {\n" +
            "      \"Name\": \"v_t1\",\n" +
            "      \"Driver\": \"local\",\n" +
            "      \"Mountpoint\": \"/var/lib/docker/volumes/v_t1/_data\",\n" +
            "      \"Labels\": null,\n" +
            "      \"Scope\": \"local\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"Name\": \"v_t2\",\n" +
            "      \"Driver\": \"local\",\n" +
            "      \"Mountpoint\": \"/var/lib/docker/volumes/v_t2/_data\",\n" +
            "      \"Labels\": {\n" +
            "        \"Author\": \"helyho\"\n" +
            "      },\n" +
            "      \"Scope\": \"local\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"Name\": \"v_t3\",\n" +
            "      \"Driver\": \"local\",\n" +
            "      \"Mountpoint\": \"/var/lib/docker/volumes/v_t3/_data\",\n" +
            "      \"Labels\": {\n" +
            "        \"Author\": \"helyho\"\n" +
            "      },\n" +
            "      \"Scope\": \"local\"\n" +
            "    }\n" +
            "  ],\n" +
            "  \"Warnings\": null\n" +
            "}";

    public static void main(String[] args) throws ParseException, ReflectiveOperationException {
        List<Volume> volumes = Volume.load(tmp);

        Logger.simple("----");

    }
}
