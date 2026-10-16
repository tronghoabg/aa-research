package com.fasterxml.jackson.databind.jsonFormatVisitors;

import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public interface JsonValueFormatVisitor {

    /* compiled from: WazeSource */
    public class Base implements JsonValueFormatVisitor {
        @Override // com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormatVisitor
        public void enumTypes(Set<String> set) {
        }

        @Override // com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormatVisitor
        public void format(JsonValueFormat jsonValueFormat) {
        }
    }

    void enumTypes(Set<String> set);

    void format(JsonValueFormat jsonValueFormat);
}
