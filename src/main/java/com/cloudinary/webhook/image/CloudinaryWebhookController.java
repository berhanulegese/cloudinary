package com.cloudinary.webhook.image;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class CloudinaryWebhookController {
    private static final Logger logger = LogManager.getLogger(CloudinaryWebhookController.class);

    @PostMapping("/webhook/cloudinary")
    public void handleWebhookNotification(@RequestBody String notification) {
        // Log the Cloudinary webhook notification at the INFO level
        logger.info("Received Cloudinary Webhook Notification:");
        logger.info(notification);
        // Add your logic here to handle the webhook notification
    }
}