package com.waze.jni.protos;

import com.waze.jni.protos.CopilotMarketplaceCar;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class CopilotMarketplaceCarKt {
    public static final CopilotMarketplaceCarKt INSTANCE = new CopilotMarketplaceCarKt();

    private CopilotMarketplaceCarKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final CopilotMarketplaceCar.Builder _builder;

        private Dsl(CopilotMarketplaceCar.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ CopilotMarketplaceCar _build() {
            CopilotMarketplaceCar copilotMarketplaceCarBuild = this._builder.build();
            x.e(copilotMarketplaceCarBuild, "build(...)");
            return copilotMarketplaceCarBuild;
        }

        public final void clearCar3DInfo() {
            this._builder.clearCar3DInfo();
        }

        public final void clearCarId() {
            this._builder.clearCarId();
        }

        public final void clearCarName() {
            this._builder.clearCarName();
        }

        public final void clearIsAds() {
            this._builder.clearIsAds();
        }

        public final void clearIsHidden() {
            this._builder.clearIsHidden();
        }

        public final Car3DInfo getCar3DInfo() {
            Car3DInfo car3DInfo = this._builder.getCar3DInfo();
            x.e(car3DInfo, "getCar3DInfo(...)");
            return car3DInfo;
        }

        public final Car3DInfo getCar3DInfoOrNull(Dsl dsl) {
            x.f(dsl, "<this>");
            return CopilotMarketplaceCarKtKt.getCar3DInfoOrNull(dsl._builder);
        }

        public final long getCarId() {
            return this._builder.getCarId();
        }

        public final String getCarName() {
            String carName = this._builder.getCarName();
            x.e(carName, "getCarName(...)");
            return carName;
        }

        public final boolean getIsAds() {
            return this._builder.getIsAds();
        }

        public final boolean getIsHidden() {
            return this._builder.getIsHidden();
        }

        public final boolean hasCar3DInfo() {
            return this._builder.hasCar3DInfo();
        }

        public final void setCar3DInfo(Car3DInfo car3DInfo) {
            x.f(car3DInfo, "value");
            this._builder.setCar3DInfo(car3DInfo);
        }

        public final void setCarId(long j2) {
            this._builder.setCarId(j2);
        }

        public final void setCarName(String str) {
            x.f(str, "value");
            this._builder.setCarName(str);
        }

        public final void setIsAds(boolean z) {
            this._builder.setIsAds(z);
        }

        public final void setIsHidden(boolean z) {
            this._builder.setIsHidden(z);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(CopilotMarketplaceCar.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(CopilotMarketplaceCar.Builder builder, o oVar) {
            this(builder);
        }
    }
}
