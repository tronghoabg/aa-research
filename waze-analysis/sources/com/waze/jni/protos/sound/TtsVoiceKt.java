package com.waze.jni.protos.sound;

import com.waze.jni.protos.sound.TtsVoice;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class TtsVoiceKt {
    public static final TtsVoiceKt INSTANCE = new TtsVoiceKt();

    private TtsVoiceKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final TtsVoice.Builder _builder;

        private Dsl(TtsVoice.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ TtsVoice _build() {
            TtsVoice ttsVoiceBuild = this._builder.build();
            x.e(ttsVoiceBuild, "build(...)");
            return ttsVoiceBuild;
        }

        public final void clearLang() {
            this._builder.clearLang();
        }

        public final void clearLocale() {
            this._builder.clearLocale();
        }

        public final void clearVersion() {
            this._builder.clearVersion();
        }

        public final void clearVoiceId() {
            this._builder.clearVoiceId();
        }

        public final String getLang() {
            String lang = this._builder.getLang();
            x.e(lang, "getLang(...)");
            return lang;
        }

        public final String getLocale() {
            String locale = this._builder.getLocale();
            x.e(locale, "getLocale(...)");
            return locale;
        }

        public final int getVersion() {
            return this._builder.getVersion();
        }

        public final String getVoiceId() {
            String voiceId = this._builder.getVoiceId();
            x.e(voiceId, "getVoiceId(...)");
            return voiceId;
        }

        public final void setLang(String str) {
            x.f(str, "value");
            this._builder.setLang(str);
        }

        public final void setLocale(String str) {
            x.f(str, "value");
            this._builder.setLocale(str);
        }

        public final void setVersion(int i2) {
            this._builder.setVersion(i2);
        }

        public final void setVoiceId(String str) {
            x.f(str, "value");
            this._builder.setVoiceId(str);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(TtsVoice.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(TtsVoice.Builder builder, o oVar) {
            this(builder);
        }
    }
}
