package com.waze.jni.protos.planned_drive;

import com.waze.jni.protos.planned_drive.FetchPlannedDriveTimeResponse;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class FetchPlannedDriveTimeResponseKt {
    public static final FetchPlannedDriveTimeResponseKt INSTANCE = new FetchPlannedDriveTimeResponseKt();

    private FetchPlannedDriveTimeResponseKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final FetchPlannedDriveTimeResponse.Builder _builder;

        private Dsl(FetchPlannedDriveTimeResponse.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ FetchPlannedDriveTimeResponse _build() {
            FetchPlannedDriveTimeResponse fetchPlannedDriveTimeResponseBuild = this._builder.build();
            x.e(fetchPlannedDriveTimeResponseBuild, "build(...)");
            return fetchPlannedDriveTimeResponseBuild;
        }

        public final void clearDriveTimeSec() {
            this._builder.clearDriveTimeSec();
        }

        public final void clearMeetingId() {
            this._builder.clearMeetingId();
        }

        public final int getDriveTimeSec() {
            return this._builder.getDriveTimeSec();
        }

        public final String getMeetingId() {
            String meetingId = this._builder.getMeetingId();
            x.e(meetingId, "getMeetingId(...)");
            return meetingId;
        }

        public final void setDriveTimeSec(int i2) {
            this._builder.setDriveTimeSec(i2);
        }

        public final void setMeetingId(String str) {
            x.f(str, "value");
            this._builder.setMeetingId(str);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(FetchPlannedDriveTimeResponse.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(FetchPlannedDriveTimeResponse.Builder builder, o oVar) {
            this(builder);
        }
    }
}
