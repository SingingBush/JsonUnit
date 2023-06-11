module net.javacrumbs.jsonunit.core {
    requires com.fasterxml.jackson.databind;
    requires org.jetbrains.annotations;
    requires org.slf4j;
    requires org.hamcrest;
    requires org.opentest4j;
    requires com.squareup.moshi;
    requires javax.json;
    requires org.json;
    requires com.google.gson;

    // next Johnzon release has Automatic-Module-Name configured in manifest
    requires johnzon.mapper; // filename-based automodule needs removing/updating before being able to publish to maven central
    requires johnzon.core; // filename-based automodule needs removing/updating before being able to publish to maven central

    uses net.javacrumbs.jsonunit.providers.Jackson2ObjectMapperProvider;

    // the internal classes need exposing to other net.javacrumbs.jsonunit modules
    exports net.javacrumbs.jsonunit.core.internal to net.javacrumbs.jsonunit.assertj, net.javacrumbs.jsonunit.json.path, net.javacrumbs.jsonunit.fluent, net.javacrumbs.jsonunit.classic;
    exports net.javacrumbs.jsonunit.core.internal.matchers to net.javacrumbs.jsonunit.assertj, net.javacrumbs.jsonunit.json.path, net.javacrumbs.jsonunit.fluent, net.javacrumbs.jsonunit.classic;

    exports net.javacrumbs.jsonunit.providers;
    exports net.javacrumbs.jsonunit.core.listener;
    exports net.javacrumbs.jsonunit.core.util;
    exports net.javacrumbs.jsonunit.core;
}
