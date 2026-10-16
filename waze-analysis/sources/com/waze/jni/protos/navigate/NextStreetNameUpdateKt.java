package com.waze.jni.protos.navigate;

import com.waze.jni.protos.navigate.NextStreetNameUpdate;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class NextStreetNameUpdateKt {
    public static final NextStreetNameUpdateKt INSTANCE = new NextStreetNameUpdateKt();

    private NextStreetNameUpdateKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final NextStreetNameUpdate.Builder _builder;

        private Dsl(NextStreetNameUpdate.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ NextStreetNameUpdate _build() {
            NextStreetNameUpdate nextStreetNameUpdateBuild = this._builder.build();
            x.e(nextStreetNameUpdateBuild, "build(...)");
            return nextStreetNameUpdateBuild;
        }

        public final void clearDisplayArrowBeforeText() {
            this._builder.clearDisplayArrowBeforeText();
        }

        public final void clearRoadSign() {
            this._builder.clearRoadSign();
        }

        public final void clearSegmentIdx() {
            this._builder.clearSegmentIdx();
        }

        public final void clearStreetName() {
            this._builder.clearStreetName();
        }

        public final boolean getDisplayArrowBeforeText() {
            return this._builder.getDisplayArrowBeforeText();
        }

        public final NavigationRoadSign getRoadSign() {
            NavigationRoadSign roadSign = this._builder.getRoadSign();
            x.e(roadSign, "getRoadSign(...)");
            return roadSign;
        }

        public final NavigationRoadSign getRoadSignOrNull(Dsl dsl) {
            x.f(dsl, "<this>");
            return NextStreetNameUpdateKtKt.getRoadSignOrNull(dsl._builder);
        }

        public final int getSegmentIdx() {
            return this._builder.getSegmentIdx();
        }

        public final String getStreetName() {
            String streetName = this._builder.getStreetName();
            x.e(streetName, "getStreetName(...)");
            return streetName;
        }

        public final boolean hasRoadSign() {
            return this._builder.hasRoadSign();
        }

        public final void setDisplayArrowBeforeText(boolean z) {
            this._builder.setDisplayArrowBeforeText(z);
        }

        public final void setRoadSign(NavigationRoadSign navigationRoadSign) {
            x.f(navigationRoadSign, "value");
            this._builder.setRoadSign(navigationRoadSign);
        }

        public final void setSegmentIdx(int i2) {
            this._builder.setSegmentIdx(i2);
        }

        public final void setStreetName(String str) {
            x.f(str, "value");
            this._builder.setStreetName(str);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(NextStreetNameUpdate.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(NextStreetNameUpdate.Builder builder, o oVar) {
            this(builder);
        }
    }
}
