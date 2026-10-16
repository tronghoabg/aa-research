package com.waze.alerters;

import com.google.v.eu;
import com.waze.NativeManager;
import com.waze.hw;
import com.waze.jni.protos.alerters.NativeAlertRepositoryUpdate;
import com.waze.jni.protos.alerters.RejectedAlert;
import h.ab;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class f {
    public static final int $stable = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void onAlertAction$default(f fVar, byte[] bArr, int i2, h.g.a.l lVar, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onAlertAction");
        }
        if ((i3 & 4) != 0) {
            lVar = null;
        }
        fVar.onAlertAction(bArr, i2, lVar);
    }

    static final ab onAlertAction$lambda$0(f fVar, byte[] bArr, int i2) {
        x.d(fVar, "null cannot be cast to non-null type com.waze.alerters.AlerterNativeManager");
        ((AlerterNativeManager) fVar).onAlertActionNTV(bArr, i2);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void onAlertEnd$default(f fVar, byte[] bArr, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onAlertEnd");
        }
        if ((i2 & 2) != 0) {
            lVar = null;
        }
        fVar.onAlertEnd(bArr, lVar);
    }

    static final ab onAlertEnd$lambda$0(f fVar, byte[] bArr) {
        x.d(fVar, "null cannot be cast to non-null type com.waze.alerters.AlerterNativeManager");
        ((AlerterNativeManager) fVar).onAlertEndNTV(bArr);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void onAlertRejected$default(f fVar, RejectedAlert rejectedAlert, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onAlertRejected");
        }
        if ((i2 & 2) != 0) {
            lVar = null;
        }
        fVar.onAlertRejected(rejectedAlert, lVar);
    }

    static final ab onAlertRejected$lambda$0(f fVar, RejectedAlert rejectedAlert) {
        x.d(fVar, "null cannot be cast to non-null type com.waze.alerters.AlerterNativeManager");
        ((AlerterNativeManager) fVar).onAlertRejectedNTV(rejectedAlert != null ? rejectedAlert.toByteArray() : null);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void onAlertStart$default(f fVar, byte[] bArr, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onAlertStart");
        }
        if ((i2 & 2) != 0) {
            lVar = null;
        }
        fVar.onAlertStart(bArr, lVar);
    }

    static final ab onAlertStart$lambda$0(f fVar, byte[] bArr) {
        x.d(fVar, "null cannot be cast to non-null type com.waze.alerters.AlerterNativeManager");
        ((AlerterNativeManager) fVar).onAlertStartNTV(bArr);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void onAlertTimeoutStarted$default(f fVar, byte[] bArr, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onAlertTimeoutStarted");
        }
        if ((i2 & 2) != 0) {
            lVar = null;
        }
        fVar.onAlertTimeoutStarted(bArr, lVar);
    }

    static final ab onAlertTimeoutStarted$lambda$0(f fVar, byte[] bArr) {
        x.d(fVar, "null cannot be cast to non-null type com.waze.alerters.AlerterNativeManager");
        ((AlerterNativeManager) fVar).onAlertTimeoutStartedNTV(bArr);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void playSound$default(f fVar, byte[] bArr, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: playSound");
        }
        if ((i2 & 2) != 0) {
            lVar = null;
        }
        fVar.playSound(bArr, lVar);
    }

    static final ab playSound$lambda$0(f fVar, byte[] bArr) {
        x.d(fVar, "null cannot be cast to non-null type com.waze.alerters.AlerterNativeManager");
        ((AlerterNativeManager) fVar).playSoundNTV(bArr);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void playZoneAlertExitSound$default(f fVar, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: playZoneAlertExitSound");
        }
        if (1 == (i2 & 1)) {
            lVar = null;
        }
        fVar.playZoneAlertExitSound(lVar);
    }

    static final ab playZoneAlertExitSound$lambda$0(f fVar) {
        x.d(fVar, "null cannot be cast to non-null type com.waze.alerters.AlerterNativeManager");
        ((AlerterNativeManager) fVar).playZoneAlertExitSoundNTV();
        return null;
    }

    public void onAlertAction(final byte[] bArr, final int i2, h.g.a.l<? super ab, ab> lVar) {
        NativeManager.runNativeTask(new hw() { // from class: com.waze.alerters.c
            @Override // com.waze.hw
            public final Object a() {
                f.onAlertAction$lambda$0(this.f14267a, bArr, i2);
                return null;
            }
        }, lVar != null ? new d(lVar, 0) : null);
    }

    public void onAlertEnd(byte[] bArr, h.g.a.l<? super ab, ab> lVar) {
        NativeManager.runNativeTask(new b(this, bArr, 0), lVar != null ? new d(lVar, 1) : null);
    }

    public void onAlertRejected(RejectedAlert rejectedAlert, h.g.a.l<? super ab, ab> lVar) {
        NativeManager.runNativeTask(new b(this, rejectedAlert, 3), lVar != null ? new d(lVar, 4) : null);
    }

    public void onAlertStart(byte[] bArr, h.g.a.l<? super ab, ab> lVar) {
        NativeManager.runNativeTask(new b(this, bArr, 4), lVar != null ? new d(lVar, 6) : null);
    }

    public void onAlertTimeoutStarted(byte[] bArr, h.g.a.l<? super ab, ab> lVar) {
        NativeManager.runNativeTask(new b(this, bArr, 2), lVar != null ? new d(lVar, 3) : null);
    }

    public void playSound(byte[] bArr, h.g.a.l<? super ab, ab> lVar) {
        NativeManager.runNativeTask(new b(this, bArr, 1), lVar != null ? new d(lVar, 2) : null);
    }

    public void playZoneAlertExitSound(h.g.a.l<? super ab, ab> lVar) {
        NativeManager.runNativeTask(new hw() { // from class: com.waze.alerters.e
            @Override // com.waze.hw
            public final Object a() {
                f.playZoneAlertExitSound$lambda$0(this.f14272a);
                return null;
            }
        }, lVar != null ? new d(lVar, 5) : null);
    }

    protected final void updateAlertersRepositoryJNI(byte[] bArr) {
        x.f(bArr, "updateMessage");
        try {
            ((AlerterNativeManager) this).updateAlertersRepository((NativeAlertRepositoryUpdate) NativeAlertRepositoryUpdate.parser().c(bArr));
        } catch (eu unused) {
        }
    }

    public final void onAlertAction(byte[] bArr, int i2) {
        onAlertAction$default(this, bArr, i2, null, 4, null);
    }

    public final void playZoneAlertExitSound() {
        playZoneAlertExitSound$default(this, null, 1, null);
    }

    public final void onAlertEnd(byte[] bArr) {
        onAlertEnd$default(this, bArr, null, 2, null);
    }

    public final void onAlertRejected(RejectedAlert rejectedAlert) {
        onAlertRejected$default(this, rejectedAlert, null, 2, null);
    }

    public final void onAlertStart(byte[] bArr) {
        onAlertStart$default(this, bArr, null, 2, null);
    }

    public final void onAlertTimeoutStarted(byte[] bArr) {
        onAlertTimeoutStarted$default(this, bArr, null, 2, null);
    }

    public final void playSound(byte[] bArr) {
        playSound$default(this, bArr, null, 2, null);
    }
}
