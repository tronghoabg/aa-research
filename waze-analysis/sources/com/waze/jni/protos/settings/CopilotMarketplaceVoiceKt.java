package com.waze.jni.protos.settings;

import com.waze.jni.protos.settings.CopilotMarketplaceVoice;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class CopilotMarketplaceVoiceKt {
    public static final CopilotMarketplaceVoiceKt INSTANCE = new CopilotMarketplaceVoiceKt();

    private CopilotMarketplaceVoiceKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final CopilotMarketplaceVoice.Builder _builder;

        private Dsl(CopilotMarketplaceVoice.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ CopilotMarketplaceVoice _build() {
            CopilotMarketplaceVoice copilotMarketplaceVoiceBuild = this._builder.build();
            x.e(copilotMarketplaceVoiceBuild, "build(...)");
            return copilotMarketplaceVoiceBuild;
        }

        public final void clearId() {
            this._builder.clearId();
        }

        public final void clearLang() {
            this._builder.clearLang();
        }

        public final void clearLocale() {
            this._builder.clearLocale();
        }

        public final void clearName() {
            this._builder.clearName();
        }

        public final String getId() {
            String id = this._builder.getId();
            x.e(id, "getId(...)");
            return id;
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

        public final String getName() {
            String name = this._builder.getName();
            x.e(name, "getName(...)");
            return name;
        }

        public final void setId(String str) {
            x.f(str, "value");
            this._builder.setId(str);
        }

        public final void setLang(String str) {
            x.f(str, "value");
            this._builder.setLang(str);
        }

        public final void setLocale(String str) {
            x.f(str, "value");
            this._builder.setLocale(str);
        }

        public final void setName(String str) {
            x.f(str, "value");
            this._builder.setName(str);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(CopilotMarketplaceVoice.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(CopilotMarketplaceVoice.Builder builder, o oVar) {
            this(builder);
        }
    }
}
