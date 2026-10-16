package com.waze.jni.protos.planned_drive;

import com.waze.jni.protos.VenueData;
import com.waze.jni.protos.planned_drive.CreatePlannedDriveRequest;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class CreatePlannedDriveRequestKt {
    public static final CreatePlannedDriveRequestKt INSTANCE = new CreatePlannedDriveRequestKt();

    private CreatePlannedDriveRequestKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final CreatePlannedDriveRequest.Builder _builder;

        private Dsl(CreatePlannedDriveRequest.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ CreatePlannedDriveRequest _build() {
            CreatePlannedDriveRequest createPlannedDriveRequestBuild = this._builder.build();
            x.e(createPlannedDriveRequestBuild, "build(...)");
            return createPlannedDriveRequestBuild;
        }

        public final void clearDestination() {
            this._builder.clearDestination();
        }

        public final void clearOrigin() {
            this._builder.clearOrigin();
        }

        public final void clearStartTimeSec() {
            this._builder.clearStartTimeSec();
        }

        public final VenueData getDestination() {
            VenueData destination = this._builder.getDestination();
            x.e(destination, "getDestination(...)");
            return destination;
        }

        public final VenueData getDestinationOrNull(Dsl dsl) {
            x.f(dsl, "<this>");
            return CreatePlannedDriveRequestKtKt.getDestinationOrNull(dsl._builder);
        }

        public final VenueData getOrigin() {
            VenueData origin = this._builder.getOrigin();
            x.e(origin, "getOrigin(...)");
            return origin;
        }

        public final VenueData getOriginOrNull(Dsl dsl) {
            x.f(dsl, "<this>");
            return CreatePlannedDriveRequestKtKt.getOriginOrNull(dsl._builder);
        }

        public final long getStartTimeSec() {
            return this._builder.getStartTimeSec();
        }

        public final boolean hasDestination() {
            return this._builder.hasDestination();
        }

        public final boolean hasOrigin() {
            return this._builder.hasOrigin();
        }

        public final void setDestination(VenueData venueData) {
            x.f(venueData, "value");
            this._builder.setDestination(venueData);
        }

        public final void setOrigin(VenueData venueData) {
            x.f(venueData, "value");
            this._builder.setOrigin(venueData);
        }

        public final void setStartTimeSec(long j2) {
            this._builder.setStartTimeSec(j2);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(CreatePlannedDriveRequest.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(CreatePlannedDriveRequest.Builder builder, o oVar) {
            this(builder);
        }
    }
}
