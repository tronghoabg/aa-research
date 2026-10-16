package com.waze.jni.protos.planned_drive;

import com.waze.jni.protos.planned_drive.UpdatePlannedDriveRequest;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class UpdatePlannedDriveRequestKt {
    public static final UpdatePlannedDriveRequestKt INSTANCE = new UpdatePlannedDriveRequestKt();

    private UpdatePlannedDriveRequestKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final UpdatePlannedDriveRequest.Builder _builder;

        private Dsl(UpdatePlannedDriveRequest.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ UpdatePlannedDriveRequest _build() {
            UpdatePlannedDriveRequest updatePlannedDriveRequestBuild = this._builder.build();
            x.e(updatePlannedDriveRequestBuild, "build(...)");
            return updatePlannedDriveRequestBuild;
        }

        public final void clearMeetingId() {
            this._builder.clearMeetingId();
        }

        public final void clearNewStartTimeSec() {
            this._builder.clearNewStartTimeSec();
        }

        public final String getMeetingId() {
            String meetingId = this._builder.getMeetingId();
            x.e(meetingId, "getMeetingId(...)");
            return meetingId;
        }

        public final long getNewStartTimeSec() {
            return this._builder.getNewStartTimeSec();
        }

        public final void setMeetingId(String str) {
            x.f(str, "value");
            this._builder.setMeetingId(str);
        }

        public final void setNewStartTimeSec(long j2) {
            this._builder.setNewStartTimeSec(j2);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(UpdatePlannedDriveRequest.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(UpdatePlannedDriveRequest.Builder builder, o oVar) {
            this(builder);
        }
    }
}
