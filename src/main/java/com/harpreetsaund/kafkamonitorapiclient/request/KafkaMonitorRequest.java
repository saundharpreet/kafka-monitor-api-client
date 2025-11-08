package com.harpreetsaund.kafkamonitorapiclient.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.constraints.NotBlank;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Tag(name = "KafkaMonitorRequest", description = "Kafka Monitor Request Model")
@JsonIgnoreProperties(ignoreUnknown = true)
public class KafkaMonitorRequest {

    public KafkaMonitorRequest() {
        // Default constructor to prevent instantiation
    }

    @Tag(name = "KafkaMonitorRequest.Version1", description = "Version 1 of Kafka Monitor Request")
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Version1 {

        @NotBlank
        private String topicName;

        @NotBlank
        private String consumerGroup;

        public String getTopicName() {
            return topicName;
        }

        public void setTopicName(String topicName) {
            this.topicName = topicName;
        }

        public String getConsumerGroup() {
            return consumerGroup;
        }

        public void setConsumerGroup(String consumerGroup) {
            this.consumerGroup = consumerGroup;
        }

        @Override
        public String toString() {
            return new ToStringBuilder(this).append("topicName", topicName).append("consumerGroup", consumerGroup)
                    .toString();
        }
    }
}
