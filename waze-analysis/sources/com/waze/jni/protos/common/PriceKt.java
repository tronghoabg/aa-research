package com.waze.jni.protos.common;

import com.waze.jni.protos.common.Price;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class PriceKt {
    public static final PriceKt INSTANCE = new PriceKt();

    private PriceKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final Price.Builder _builder;

        private Dsl(Price.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ Price _build() {
            Price priceBuild = this._builder.build();
            x.e(priceBuild, "build(...)");
            return priceBuild;
        }

        public final void clearCurrencyCode() {
            this._builder.clearCurrencyCode();
        }

        public final void clearPrice() {
            this._builder.clearPrice();
        }

        public final String getCurrencyCode() {
            String currencyCode = this._builder.getCurrencyCode();
            x.e(currencyCode, "getCurrencyCode(...)");
            return currencyCode;
        }

        public final double getPrice() {
            return this._builder.getPrice();
        }

        public final void setCurrencyCode(String str) {
            x.f(str, "value");
            this._builder.setCurrencyCode(str);
        }

        public final void setPrice(double d2) {
            this._builder.setPrice(d2);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(Price.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(Price.Builder builder, o oVar) {
            this(builder);
        }
    }
}
