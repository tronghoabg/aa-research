package com.waze.jni.protos.planned_drive;

import com.waze.jni.protos.planned_drive.DeletePlannedDriveRequest;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class DeletePlannedDriveRequestKt {
    public static final DeletePlannedDriveRequestKt INSTANCE = new DeletePlannedDriveRequestKt();

    private DeletePlannedDriveRequestKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final DeletePlannedDriveRequest.Builder _builder;

        private Dsl(DeletePlannedDriveRequest.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ DeletePlannedDriveRequest _build() {
            DeletePlannedDriveRequest deletePlannedDriveRequestBuild = this._builder.build();
            x.e(deletePlannedDriveRequestBuild, "build(...)");
            return deletePlannedDriveRequestBuild;
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

            public final /* synthetic */ Dsl _create(DeletePlannedDriveRequest.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(DeletePlannedDriveRequest.Builder builder, o oVar) {
            this(builder);
        }
    }
}
