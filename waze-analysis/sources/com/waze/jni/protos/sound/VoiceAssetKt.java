package com.waze.jni.protos.sound;

import com.waze.jni.protos.sound.VoiceAsset;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class VoiceAssetKt {
    public static final VoiceAssetKt INSTANCE = new VoiceAssetKt();

    private VoiceAssetKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final VoiceAsset.Builder _builder;

        private Dsl(VoiceAsset.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ VoiceAsset _build() {
            VoiceAsset voiceAssetBuild = this._builder.build();
            x.e(voiceAssetBuild, "build(...)");
            return voiceAssetBuild;
        }

        public final void clearId() {
            this._builder.clearId();
        }

        public final void clearLanguage() {
            this._builder.clearLanguage();
        }

        public final void clearLocale() {
            this._builder.clearLocale();
        }

        public final void clearType() {
            this._builder.clearType();
        }

        public final void clearVersion() {
            this._builder.clearVersion();
        }

        public final String getId() {
            String id = this._builder.getId();
            x.e(id, "getId(...)");
            return id;
        }

        public final String getLanguage() {
            String language = this._builder.getLanguage();
            x.e(language, "getLanguage(...)");
            return language;
        }

        public final String getLocale() {
            String locale = this._builder.getLocale();
            x.e(locale, "getLocale(...)");
            return locale;
        }

        public final VoiceAsset.Type getType() {
            VoiceAsset.Type type = this._builder.getType();
            x.e(type, "getType(...)");
            return type;
        }

        public final int getTypeValue() {
            return this._builder.getTypeValue();
        }

        public final int getVersion() {
            return this._builder.getVersion();
        }

        public final void setId(String str) {
            x.f(str, "value");
            this._builder.setId(str);
        }

        public final void setLanguage(String str) {
            x.f(str, "value");
            this._builder.setLanguage(str);
        }

        public final void setLocale(String str) {
            x.f(str, "value");
            this._builder.setLocale(str);
        }

        public final void setType(VoiceAsset.Type type) {
            x.f(type, "value");
            this._builder.setType(type);
        }

        public final void setTypeValue(int i2) {
            this._builder.setTypeValue(i2);
        }

        public final void setVersion(int i2) {
            this._builder.setVersion(i2);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(VoiceAsset.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(VoiceAsset.Builder builder, o oVar) {
            this(builder);
        }
    }
}
