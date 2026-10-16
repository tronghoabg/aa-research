package com.waze.resume_drive;

import com.google.v.eu;
import com.waze.NativeManager;
import com.waze.hw;
import com.waze.jni.protos.resume_drive.GenericPlaceOrVenueData;
import h.ab;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public abstract class m {
    public static final int $stable = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void cancelResumedDrive$default(m mVar, int i2, h.g.a.l lVar, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancelResumedDrive");
        }
        if ((i3 & 2) != 0) {
            lVar = null;
        }
        mVar.cancelResumedDrive(i2, lVar);
    }

    static final ab cancelResumedDrive$lambda$0(m mVar, int i2) {
        x.d(mVar, "null cannot be cast to non-null type com.waze.resume_drive.ResumeDriveNativeManager");
        ((ResumeDriveNativeManager) mVar).cancelResumedDriveNTV(i2);
        return null;
    }

    static final void handleNoResumeDriveResultJNI$lambda$0(m mVar) {
        x.d(mVar, "null cannot be cast to non-null type com.waze.resume_drive.ResumeDriveNativeManager");
        ((ResumeDriveNativeManager) mVar).handleNoResumeDriveResult();
    }

    static final void handleResumeDriveCallbackResultJNI$lambda$0(m mVar, GenericPlaceOrVenueData genericPlaceOrVenueData) {
        x.d(mVar, "null cannot be cast to non-null type com.waze.resume_drive.ResumeDriveNativeManager");
        x.c(genericPlaceOrVenueData);
        ((ResumeDriveNativeManager) mVar).handleResumeDriveCallbackResult(genericPlaceOrVenueData);
    }

    public void cancelResumedDrive(final int i2, final h.g.a.l<? super ab, ab> lVar) {
        NativeManager.runNativeTask(new hw() { // from class: com.waze.resume_drive.j
            @Override // com.waze.hw
            public final Object a() {
                m.cancelResumedDrive$lambda$0(this.f35107a, i2);
                return null;
            }
        }, lVar != null ? new com.waze.jni.a() { // from class: com.waze.resume_drive.k
            @Override // com.waze.jni.a
            public final void a(Object obj) {
                lVar.invoke((ab) obj);
            }
        } : null);
    }

    public abstract void handleNoResumeDriveResult();

    protected final void handleNoResumeDriveResultJNI() {
        NativeManager.runMainThreadTask(new Runnable() { // from class: com.waze.resume_drive.i
            @Override // java.lang.Runnable
            public final void run() {
                m.handleNoResumeDriveResultJNI$lambda$0(this.f35106a);
            }
        });
    }

    public abstract void handleResumeDriveCallbackResult(GenericPlaceOrVenueData genericPlaceOrVenueData);

    protected final void handleResumeDriveCallbackResultJNI(byte[] bArr) {
        x.f(bArr, "placeOrVenue");
        try {
            final GenericPlaceOrVenueData genericPlaceOrVenueData = (GenericPlaceOrVenueData) GenericPlaceOrVenueData.parser().c(bArr);
            NativeManager.runMainThreadTask(new Runnable() { // from class: com.waze.resume_drive.l
                @Override // java.lang.Runnable
                public final void run() {
                    m.handleResumeDriveCallbackResultJNI$lambda$0(this.f35110a, genericPlaceOrVenueData);
                }
            });
        } catch (eu unused) {
        }
    }

    public final void cancelResumedDrive(int i2) {
        cancelResumedDrive$default(this, i2, null, 2, null);
    }
}
