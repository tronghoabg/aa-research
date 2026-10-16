package com.waze.jni.protos.settings;

import com.waze.jni.protos.settings.VoiceData;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class VoiceDataKt {
    public static final VoiceDataKt INSTANCE = new VoiceDataKt();

    private VoiceDataKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final VoiceData.Builder _builder;

        private Dsl(VoiceData.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ VoiceData _build() {
            VoiceData voiceDataBuild = this._builder.build();
            x.e(voiceDataBuild, "build(...)");
            return voiceDataBuild;
        }

        public final void clearDescription() {
            this._builder.clearDescription();
        }

        public final void clearId() {
            this._builder.clearId();
        }

        public final void clearIsCurrentVoice() {
            this._builder.clearIsCurrentVoice();
        }

        public final void clearLang() {
            this._builder.clearLang();
        }

        public final void clearName() {
            this._builder.clearName();
        }

        public final void clearShortName() {
            this._builder.clearShortName();
        }

        public final void clearType() {
            this._builder.clearType();
        }

        public final String getDescription() {
            String description = this._builder.getDescription();
            x.e(description, "getDescription(...)");
            return description;
        }

        public final String getId() {
            String id = this._builder.getId();
            x.e(id, "getId(...)");
            return id;
        }

        public final boolean getIsCurrentVoice() {
            return this._builder.getIsCurrentVoice();
        }

        public final String getLang() {
            String lang = this._builder.getLang();
            x.e(lang, "getLang(...)");
            return lang;
        }

        public final String getName() {
            String name = this._builder.getName();
            x.e(name, "getName(...)");
            return name;
        }

        public final String getShortName() {
            String shortName = this._builder.getShortName();
            x.e(shortName, "getShortName(...)");
            return shortName;
        }

        public final VoiceData.Type getType() {
            VoiceData.Type type = this._builder.getType();
            x.e(type, "getType(...)");
            return type;
        }

        public final int getTypeValue() {
            return this._builder.getTypeValue();
        }

        public final void setDescription(String str) {
            x.f(str, "value");
            this._builder.setDescription(str);
        }

        public final void setId(String str) {
            x.f(str, "value");
            this._builder.setId(str);
        }

        public final void setIsCurrentVoice(boolean z) {
            this._builder.setIsCurrentVoice(z);
        }

        public final void setLang(String str) {
            x.f(str, "value");
            this._builder.setLang(str);
        }

        public final void setName(String str) {
            x.f(str, "value");
            this._builder.setName(str);
        }

        public final void setShortName(String str) {
            x.f(str, "value");
            this._builder.setShortName(str);
        }

        public final void setType(VoiceData.Type type) {
            x.f(type, "value");
            this._builder.setType(type);
        }

        public final void setTypeValue(int i2) {
            this._builder.setTypeValue(i2);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(VoiceData.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(VoiceData.Builder builder, o oVar) {
            this(builder);
        }
    }
}
