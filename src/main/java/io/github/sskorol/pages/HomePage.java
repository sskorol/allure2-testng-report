package io.github.sskorol.pages;

import io.qameta.allure.Step;

import static io.qameta.allure.Allure.addStreamAttachmentAsync;
import static java.lang.ClassLoader.getSystemResourceAsStream;

@SuppressWarnings("JavadocType")
public class HomePage implements Page {

    @Step("Display balance")
    public HomePage displayBalance() {
        addStreamAttachmentAsync("Archive", "application/gzip", () ->
                getSystemResourceAsStream("attachments/archive.gz"));
        addStreamAttachmentAsync("Config", "application/xml", () ->
                getSystemResourceAsStream("attachments/config.xml"));
        addStreamAttachmentAsync("Data", "application/json", () ->
                getSystemResourceAsStream("attachments/data.json"));
        addStreamAttachmentAsync("Links", "text/uri-list", () ->
                getSystemResourceAsStream("attachments/links.uri"));
        addStreamAttachmentAsync("Log", "text/plain", () ->
                getSystemResourceAsStream("attachments/log.txt"));
        addStreamAttachmentAsync("Table", "text/csv", () ->
                getSystemResourceAsStream("attachments/table.csv"));
        addStreamAttachmentAsync("Video", "video/webm", () ->
                getSystemResourceAsStream("attachments/video.webm"));
        return this;
    }
}
