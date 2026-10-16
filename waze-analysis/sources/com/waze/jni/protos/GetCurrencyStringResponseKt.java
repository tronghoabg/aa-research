package com.waze.jni.protos;

import com.waze.jni.protos.GetCurrencyStringResponse;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class GetCurrencyStringResponseKt {
    public static final GetCurrencyStringResponseKt INSTANCE = new GetCurrencyStringResponseKt();

    private GetCurrencyStringResponseKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final GetCurrencyStringResponse.Builder _builder;

        private Dsl(GetCurrencyStringResponse.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ GetCurrencyStringResponse _build() {
            GetCurrencyStringResponse getCurrencyStringResponseBuild = this._builder.build();
            x.e(getCurrencyStringResponseBuild, "build(...)");
            return getCurrencyStringResponseBuild;
        }

        public final void clearPrice() {
            this._builder.clearPrice();
        }

        public final void clearRequestId() {
            this._builder.clearRequestId();
        }

        public final String getPrice() {
            String price = this._builder.getPrice();
            x.e(price, "getPrice(...)");
            return price;
        }

        public final int getRequestId() {
            return this._builder.getRequestId();
        }

        public final void setPrice(String str) {
            x.f(str, "value");
            this._builder.setPrice(str);
        }

        public final void setRequestId(int i2) {
            this._builder.setRequestId(i2);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(GetCurrencyStringResponse.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(GetCurrencyStringResponse.Builder builder, o oVar) {
            this(builder);
        }
    }
}
