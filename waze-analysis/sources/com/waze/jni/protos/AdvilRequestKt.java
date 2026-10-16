package com.waze.jni.protos;

import com.waze.jni.protos.AdvilRequest;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class AdvilRequestKt {
    public static final AdvilRequestKt INSTANCE = new AdvilRequestKt();

    private AdvilRequestKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final AdvilRequest.Builder _builder;

        private Dsl(AdvilRequest.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ AdvilRequest _build() {
            AdvilRequest advilRequestBuild = this._builder.build();
            x.e(advilRequestBuild, "build(...)");
            return advilRequestBuild;
        }

        public final void clearOfferJson() {
            this._builder.clearOfferJson();
        }

        public final void clearPageUrl() {
            this._builder.clearPageUrl();
        }

        public final String getOfferJson() {
            String offerJson = this._builder.getOfferJson();
            x.e(offerJson, "getOfferJson(...)");
            return offerJson;
        }

        public final String getPageUrl() {
            String pageUrl = this._builder.getPageUrl();
            x.e(pageUrl, "getPageUrl(...)");
            return pageUrl;
        }

        public final boolean hasOfferJson() {
            return this._builder.hasOfferJson();
        }

        public final boolean hasPageUrl() {
            return this._builder.hasPageUrl();
        }

        public final void setOfferJson(String str) {
            x.f(str, "value");
            this._builder.setOfferJson(str);
        }

        public final void setPageUrl(String str) {
            x.f(str, "value");
            this._builder.setPageUrl(str);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(AdvilRequest.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(AdvilRequest.Builder builder, o oVar) {
            this(builder);
        }
    }
}
