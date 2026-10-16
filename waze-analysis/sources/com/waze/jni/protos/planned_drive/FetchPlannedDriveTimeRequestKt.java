package com.waze.jni.protos.planned_drive;

import com.waze.jni.protos.planned_drive.FetchPlannedDriveTimeRequest;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class FetchPlannedDriveTimeRequestKt {
    public static final FetchPlannedDriveTimeRequestKt INSTANCE = new FetchPlannedDriveTimeRequestKt();

    private FetchPlannedDriveTimeRequestKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final FetchPlannedDriveTimeRequest.Builder _builder;

        private Dsl(FetchPlannedDriveTimeRequest.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ FetchPlannedDriveTimeRequest _build() {
            FetchPlannedDriveTimeRequest fetchPlannedDriveTimeRequestBuild = this._builder.build();
            x.e(fetchPlannedDriveTimeRequestBuild, "build(...)");
            return fetchPlannedDriveTimeRequestBuild;
        }

        public final void clearMeetingId() {
            this._builder.clearMeetingId();
        }

        public final String getMeetingId() {
            String meetingId = this._builder.getMeetingId();
            x.e(meetingId, "getMeetingId(...)");
            return meetingId;
        }

        public final void setMeetingId(String str) {
            x.f(str, "value");
            this._builder.setMeetingId(str);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(FetchPlannedDriveTimeRequest.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(FetchPlannedDriveTimeRequest.Builder builder, o oVar) {
            this(builder);
        }
    }
}
