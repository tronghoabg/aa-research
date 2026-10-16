package com.waze.jni.protos.settings;

import com.waze.jni.protos.settings.SettingsValueProto;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class SettingsValueProtoKt {
    public static final SettingsValueProtoKt INSTANCE = new SettingsValueProtoKt();

    private SettingsValueProtoKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final SettingsValueProto.Builder _builder;

        private Dsl(SettingsValueProto.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ SettingsValueProto _build() {
            SettingsValueProto settingsValueProtoBuild = this._builder.build();
            x.e(settingsValueProtoBuild, "build(...)");
            return settingsValueProtoBuild;
        }

        public final void clearDisplay() {
            this._builder.clearDisplay();
        }

        public final void clearIsSelected() {
            this._builder.clearIsSelected();
        }

        public final void clearType() {
            this._builder.clearType();
        }

        public final void clearValue() {
            this._builder.clearValue();
        }

        public final String getDisplay() {
            String display = this._builder.getDisplay();
            x.e(display, "getDisplay(...)");
            return display;
        }

        public final boolean getIsSelected() {
            return this._builder.getIsSelected();
        }

        public final String getType() {
            String type = this._builder.getType();
            x.e(type, "getType(...)");
            return type;
        }

        public final String getValue() {
            String value = this._builder.getValue();
            x.e(value, "getValue(...)");
            return value;
        }

        public final boolean hasType() {
            return this._builder.hasType();
        }

        public final void setDisplay(String str) {
            x.f(str, "value");
            this._builder.setDisplay(str);
        }

        public final void setIsSelected(boolean z) {
            this._builder.setIsSelected(z);
        }

        public final void setType(String str) {
            x.f(str, "value");
            this._builder.setType(str);
        }

        public final void setValue(String str) {
            x.f(str, "value");
            this._builder.setValue(str);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(SettingsValueProto.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(SettingsValueProto.Builder builder, o oVar) {
            this(builder);
        }
    }
}
