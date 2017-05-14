package io.github.sskorol.pages;

import io.qameta.allure.Step;

import static io.qameta.allure.Allure.addStreamAttachmentAsync;

@SuppressWarnings("JavadocType")
public class HomePage implements Page {

    @Step("Display balance")
    public HomePage displayBalance() {
        addStreamAttachmentAsync("Archive",
                "application/gzip",
                () -> ClassLoader.getSystemResourceAsStream("attachments/archive.gz"));
        addStreamAttachmentAsync("Config",
                "application/xml",
                () -> ClassLoader.getSystemResourceAsStream("attachments/config.xml"));
        addStreamAttachmentAsync("Data",
                "application/json",
                () -> ClassLoader.getSystemResourceAsStream("attachments/data.json"));
        addStreamAttachmentAsync("Links",
                "text/uri-list",
                () -> ClassLoader.getSystemResourceAsStream("attachments/links.uri"));
        addStreamAttachmentAsync("Log",
                "text/plain",
                () -> ClassLoader.getSystemResourceAsStream("attachments/log.txt"));
        addStreamAttachmentAsync("Table",
                "text/csv",
                () -> ClassLoader.getSystemResourceAsStream("attachments/table.csv"));
        addStreamAttachmentAsync("Video",
                "video/webm",
                () -> ClassLoader.getSystemResourceAsStream("attachments/video.webm"));
        return this;
    }
}
