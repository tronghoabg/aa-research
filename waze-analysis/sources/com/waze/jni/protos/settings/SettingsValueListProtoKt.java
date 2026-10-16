package com.waze.jni.protos.settings;

import com.google.v.b.a;
import com.google.v.b.c;
import com.waze.jni.protos.settings.SettingsValueListProto;
import h.g.b.o;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class SettingsValueListProtoKt {
    public static final SettingsValueListProtoKt INSTANCE = new SettingsValueListProtoKt();

    private SettingsValueListProtoKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final SettingsValueListProto.Builder _builder;

        /* compiled from: WazeSource */
        public final class ValuesProxy extends c {
            private ValuesProxy() {
            }
        }

        private Dsl(SettingsValueListProto.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ SettingsValueListProto _build() {
            SettingsValueListProto settingsValueListProtoBuild = this._builder.build();
            x.e(settingsValueListProtoBuild, "build(...)");
            return settingsValueListProtoBuild;
        }

        public final /* synthetic */ void addAllValues(a aVar, Iterable iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            this._builder.addAllValues(iterable);
        }

        public final /* synthetic */ void addValues(a aVar, SettingsValueProto settingsValueProto) {
            x.f(aVar, "<this>");
            x.f(settingsValueProto, "value");
            this._builder.addValues(settingsValueProto);
        }

        public final /* synthetic */ void clearValues(a aVar) {
            x.f(aVar, "<this>");
            this._builder.clearValues();
        }

        public final /* synthetic */ a getValues() {
            List<SettingsValueProto> valuesList = this._builder.getValuesList();
            x.e(valuesList, "getValuesList(...)");
            return new a(valuesList);
        }

        public final /* synthetic */ void plusAssignAllValues(a<SettingsValueProto, ValuesProxy> aVar, Iterable<SettingsValueProto> iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            addAllValues(aVar, iterable);
        }

        public final /* synthetic */ void plusAssignValues(a<SettingsValueProto, ValuesProxy> aVar, SettingsValueProto settingsValueProto) {
            x.f(aVar, "<this>");
            x.f(settingsValueProto, "value");
            addValues(aVar, settingsValueProto);
        }

        public final /* synthetic */ void setValues(a aVar, int i2, SettingsValueProto settingsValueProto) {
            x.f(aVar, "<this>");
            x.f(settingsValueProto, "value");
            this._builder.setValues(i2, settingsValueProto);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(SettingsValueListProto.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(SettingsValueListProto.Builder builder, o oVar) {
            this(builder);
        }
    }
}
