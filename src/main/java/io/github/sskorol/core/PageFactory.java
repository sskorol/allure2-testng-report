package io.github.sskorol.core;

import io.github.sskorol.pages.Page;
import io.qameta.allure.Step;

import static org.joor.Reflect.on;

@SuppressWarnings("JavadocType")
public final class PageFactory {

    private PageFactory() {
        throw new UnsupportedOperationException("Illegal access to private constructor!");
    }

    public static <T extends Page> T open(final Class<T> pageClass) {
        return at(pageClass);
    }

    public static <T extends Page> T at(final Class<T> pageClass) {
        prettify(pageClass.getSimpleName());
        return on(pageClass).create().get();
    }

    @Step("Open {name}")
    @SuppressWarnings("PMD.UnusedFormalParameter")
    private static void prettify(final String name) {
        // not implemented
    }
}
