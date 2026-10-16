package com.waze.jni.protos.planned_drive;

import com.waze.jni.protos.Position;
import com.waze.jni.protos.VenueData;
import com.waze.jni.protos.planned_drive.LoadPlannedDriveOptionsRequest;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class LoadPlannedDriveOptionsRequestKt {
    public static final LoadPlannedDriveOptionsRequestKt INSTANCE = new LoadPlannedDriveOptionsRequestKt();

    private LoadPlannedDriveOptionsRequestKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final LoadPlannedDriveOptionsRequest.Builder _builder;

        private Dsl(LoadPlannedDriveOptionsRequest.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ LoadPlannedDriveOptionsRequest _build() {
            LoadPlannedDriveOptionsRequest loadPlannedDriveOptionsRequestBuild = this._builder.build();
            x.e(loadPlannedDriveOptionsRequestBuild, "build(...)");
            return loadPlannedDriveOptionsRequestBuild;
        }

        public final void clearDaysFromNow() {
            this._builder.clearDaysFromNow();
        }

        public final void clearDestination() {
            this._builder.clearDestination();
        }

        public final void clearOrigin() {
            this._builder.clearOrigin();
        }

        public final int getDaysFromNow() {
            return this._builder.getDaysFromNow();
        }

        public final VenueData getDestination() {
            VenueData destination = this._builder.getDestination();
            x.e(destination, "getDestination(...)");
            return destination;
        }

        public final VenueData getDestinationOrNull(Dsl dsl) {
            x.f(dsl, "<this>");
            return LoadPlannedDriveOptionsRequestKtKt.getDestinationOrNull(dsl._builder);
        }

        public final Position.IntPosition getOrigin() {
            Position.IntPosition origin = this._builder.getOrigin();
            x.e(origin, "getOrigin(...)");
            return origin;
        }

        public final Position.IntPosition getOriginOrNull(Dsl dsl) {
            x.f(dsl, "<this>");
            return LoadPlannedDriveOptionsRequestKtKt.getOriginOrNull(dsl._builder);
        }

        public final boolean hasDestination() {
            return this._builder.hasDestination();
        }

        public final boolean hasOrigin() {
            return this._builder.hasOrigin();
        }

        public final void setDaysFromNow(int i2) {
            this._builder.setDaysFromNow(i2);
        }

        public final void setDestination(VenueData venueData) {
            x.f(venueData, "value");
            this._builder.setDestination(venueData);
        }

        public final void setOrigin(Position.IntPosition intPosition) {
            x.f(intPosition, "value");
            this._builder.setOrigin(intPosition);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(LoadPlannedDriveOptionsRequest.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(LoadPlannedDriveOptionsRequest.Builder builder, o oVar) {
            this(builder);
        }
    }
}
