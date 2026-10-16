package com.waze.jni.protos;

import com.google.v.b.a;
import com.google.v.b.c;
import com.waze.jni.protos.AuditEventMessage;
import h.g.b.o;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class AuditEventMessageKt {
    public static final AuditEventMessageKt INSTANCE = new AuditEventMessageKt();

    private AuditEventMessageKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final AuditEventMessage.Builder _builder;

        /* compiled from: WazeSource */
        public final class DisplayStringsProxy extends c {
            private DisplayStringsProxy() {
            }
        }

        private Dsl(AuditEventMessage.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ AuditEventMessage _build() {
            AuditEventMessage auditEventMessageBuild = this._builder.build();
            x.e(auditEventMessageBuild, "build(...)");
            return auditEventMessageBuild;
        }

        public final /* synthetic */ void addAllDisplayStrings(a aVar, Iterable iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            this._builder.addAllDisplayStrings(iterable);
        }

        public final /* synthetic */ void addDisplayStrings(a aVar, int i2) {
            x.f(aVar, "<this>");
            this._builder.addDisplayStrings(i2);
        }

        public final void clearContext() {
            this._builder.clearContext();
        }

        public final /* synthetic */ void clearDisplayStrings(a aVar) {
            x.f(aVar, "<this>");
            this._builder.clearDisplayStrings();
        }

        public final void clearName() {
            this._builder.clearName();
        }

        public final void clearSelectedOption() {
            this._builder.clearSelectedOption();
        }

        public final void clearValue() {
            this._builder.clearValue();
        }

        public final int getContext() {
            return this._builder.getContext();
        }

        public final /* synthetic */ a getDisplayStrings() {
            List<Integer> displayStringsList = this._builder.getDisplayStringsList();
            x.e(displayStringsList, "getDisplayStringsList(...)");
            return new a(displayStringsList);
        }

        public final int getName() {
            return this._builder.getName();
        }

        public final String getSelectedOption() {
            String selectedOption = this._builder.getSelectedOption();
            x.e(selectedOption, "getSelectedOption(...)");
            return selectedOption;
        }

        public final int getValue() {
            return this._builder.getValue();
        }

        public final /* synthetic */ void plusAssignAllDisplayStrings(a<Integer, DisplayStringsProxy> aVar, Iterable<Integer> iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            addAllDisplayStrings(aVar, iterable);
        }

        public final /* synthetic */ void plusAssignDisplayStrings(a<Integer, DisplayStringsProxy> aVar, int i2) {
            x.f(aVar, "<this>");
            addDisplayStrings(aVar, i2);
        }

        public final void setContext(int i2) {
            this._builder.setContext(i2);
        }

        public final /* synthetic */ void setDisplayStrings(a aVar, int i2, int i3) {
            x.f(aVar, "<this>");
            this._builder.setDisplayStrings(i2, i3);
        }

        public final void setName(int i2) {
            this._builder.setName(i2);
        }

        public final void setSelectedOption(String str) {
            x.f(str, "value");
            this._builder.setSelectedOption(str);
        }

        public final void setValue(int i2) {
            this._builder.setValue(i2);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(AuditEventMessage.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(AuditEventMessage.Builder builder, o oVar) {
            this(builder);
        }
    }
}
