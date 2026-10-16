package com.waze.jni.protos.navigate;

import com.waze.jni.protos.navigate.BeaconInformation;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class BeaconInformationKt {
    public static final BeaconInformationKt INSTANCE = new BeaconInformationKt();

    private BeaconInformationKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final BeaconInformation.Builder _builder;

        private Dsl(BeaconInformation.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ BeaconInformation _build() {
            BeaconInformation beaconInformationBuild = this._builder.build();
            x.e(beaconInformationBuild, "build(...)");
            return beaconInformationBuild;
        }

        public final void clearHasBeacons() {
            this._builder.clearHasBeacons();
        }

        public final boolean getHasBeacons() {
            return this._builder.getHasBeacons();
        }

        public final boolean hasHasBeacons() {
            return this._builder.hasHasBeacons();
        }

        public final void setHasBeacons(boolean z) {
            this._builder.setHasBeacons(z);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(BeaconInformation.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(BeaconInformation.Builder builder, o oVar) {
            this(builder);
        }
    }
}
