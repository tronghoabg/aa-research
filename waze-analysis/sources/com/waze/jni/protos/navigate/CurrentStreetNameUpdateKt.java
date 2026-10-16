package com.waze.jni.protos.navigate;

import com.waze.jni.protos.navigate.CurrentStreetNameUpdate;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class CurrentStreetNameUpdateKt {
    public static final CurrentStreetNameUpdateKt INSTANCE = new CurrentStreetNameUpdateKt();

    private CurrentStreetNameUpdateKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final CurrentStreetNameUpdate.Builder _builder;

        private Dsl(CurrentStreetNameUpdate.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ CurrentStreetNameUpdate _build() {
            CurrentStreetNameUpdate currentStreetNameUpdateBuild = this._builder.build();
            x.e(currentStreetNameUpdateBuild, "build(...)");
            return currentStreetNameUpdateBuild;
        }

        public final void clearRoadSign() {
            this._builder.clearRoadSign();
        }

        public final void clearSegmentIdx() {
            this._builder.clearSegmentIdx();
        }

        public final void clearShowHov() {
            this._builder.clearShowHov();
        }

        public final void clearStreetName() {
            this._builder.clearStreetName();
        }

        public final NavigationRoadSign getRoadSign() {
            NavigationRoadSign roadSign = this._builder.getRoadSign();
            x.e(roadSign, "getRoadSign(...)");
            return roadSign;
        }

        public final NavigationRoadSign getRoadSignOrNull(Dsl dsl) {
            x.f(dsl, "<this>");
            return CurrentStreetNameUpdateKtKt.getRoadSignOrNull(dsl._builder);
        }

        public final int getSegmentIdx() {
            return this._builder.getSegmentIdx();
        }

        public final boolean getShowHov() {
            return this._builder.getShowHov();
        }

        public final String getStreetName() {
            String streetName = this._builder.getStreetName();
            x.e(streetName, "getStreetName(...)");
            return streetName;
        }

        public final boolean hasRoadSign() {
            return this._builder.hasRoadSign();
        }

        public final void setRoadSign(NavigationRoadSign navigationRoadSign) {
            x.f(navigationRoadSign, "value");
            this._builder.setRoadSign(navigationRoadSign);
        }

        public final void setSegmentIdx(int i2) {
            this._builder.setSegmentIdx(i2);
        }

        public final void setShowHov(boolean z) {
            this._builder.setShowHov(z);
        }

        public final void setStreetName(String str) {
            x.f(str, "value");
            this._builder.setStreetName(str);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(CurrentStreetNameUpdate.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(CurrentStreetNameUpdate.Builder builder, o oVar) {
            this(builder);
        }
    }
}
