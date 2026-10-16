package com.waze.jni.protos;

import com.waze.jni.protos.GetCurrencyStringRequest;
import com.waze.jni.protos.common.Price;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class GetCurrencyStringRequestKt {
    public static final GetCurrencyStringRequestKt INSTANCE = new GetCurrencyStringRequestKt();

    private GetCurrencyStringRequestKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final GetCurrencyStringRequest.Builder _builder;

        private Dsl(GetCurrencyStringRequest.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ GetCurrencyStringRequest _build() {
            GetCurrencyStringRequest getCurrencyStringRequestBuild = this._builder.build();
            x.e(getCurrencyStringRequestBuild, "build(...)");
            return getCurrencyStringRequestBuild;
        }

        public final void clearPrice() {
            this._builder.clearPrice();
        }

        public final void clearRequestId() {
            this._builder.clearRequestId();
        }

        public final Price getPrice() {
            Price price = this._builder.getPrice();
            x.e(price, "getPrice(...)");
            return price;
        }

        public final Price getPriceOrNull(Dsl dsl) {
            x.f(dsl, "<this>");
            return GetCurrencyStringRequestKtKt.getPriceOrNull(dsl._builder);
        }

        public final int getRequestId() {
            return this._builder.getRequestId();
        }

        public final boolean hasPrice() {
            return this._builder.hasPrice();
        }

        public final void setPrice(Price price) {
            x.f(price, "value");
            this._builder.setPrice(price);
        }

        public final void setRequestId(int i2) {
            this._builder.setRequestId(i2);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(GetCurrencyStringRequest.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(GetCurrencyStringRequest.Builder builder, o oVar) {
            this(builder);
        }
    }
}
