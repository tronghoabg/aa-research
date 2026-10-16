package com.waze.navigate;

import com.waze.NativeManager;
import com.waze.hw;
import com.waze.jni.protos.navigate.ParkedHere;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public abstract class fh {
    public static final int $stable = 0;

    static final void onParkedChangedJNI$lambda$0(fh fhVar, ParkedHere parkedHere) {
        h.g.b.x.d(fhVar, "null cannot be cast to non-null type com.waze.navigate.ParkedHereNativeManager");
        h.g.b.x.c(parkedHere);
        ((ParkedHereNativeManager) fhVar).onParkedChanged(parkedHere);
    }

    static final void onParkedRemovedJNI$lambda$0(fh fhVar) {
        h.g.b.x.d(fhVar, "null cannot be cast to non-null type com.waze.navigate.ParkedHereNativeManager");
        ((ParkedHereNativeManager) fhVar).onParkedRemoved();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void removeParked$default(fh fhVar, int i2, h.g.a.l lVar, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: removeParked");
        }
        if ((i3 & 2) != 0) {
            lVar = null;
        }
        fhVar.removeParked(i2, lVar);
    }

    static final h.ab removeParked$lambda$0(fh fhVar, int i2) {
        h.g.b.x.d(fhVar, "null cannot be cast to non-null type com.waze.navigate.ParkedHereNativeManager");
        ((ParkedHereNativeManager) fhVar).removeParkedNTV(i2);
        return null;
    }

    public static /* synthetic */ void setParked$default(fh fhVar, int i2, int i3, long j2, boolean z, h.g.a.l lVar, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setParked");
        }
        if ((i4 & 16) != 0) {
            lVar = null;
        }
        fhVar.setParked(i2, i3, j2, z, lVar);
    }

    static final h.ab setParked$lambda$0(fh fhVar, int i2, int i3, long j2, boolean z) {
        h.g.b.x.d(fhVar, "null cannot be cast to non-null type com.waze.navigate.ParkedHereNativeManager");
        ((ParkedHereNativeManager) fhVar).setParkedNTV(i2, i3, j2, z);
        return null;
    }

    public abstract void onParkedChanged(ParkedHere parkedHere);

    protected final void onParkedChangedJNI(byte[] bArr) {
        h.g.b.x.f(bArr, "parkedHere");
        try {
            final ParkedHere parkedHere = (ParkedHere) ParkedHere.parser().c(bArr);
            NativeManager.runMainThreadTask(new Runnable() { // from class: com.waze.navigate.fg
                @Override // java.lang.Runnable
                public final void run() {
                    fh.onParkedChangedJNI$lambda$0(this.f31359a, parkedHere);
                }
            });
        } catch (com.google.v.eu unused) {
        }
    }

    public abstract void onParkedRemoved();

    protected final void onParkedRemovedJNI() {
        NativeManager.runMainThreadTask(new e(this, 16));
    }

    public void removeParked(int i2, h.g.a.l<? super h.ab, h.ab> lVar) {
        NativeManager.runNativeTask(new bs(this, i2, 4), lVar != null ? new Cdo(lVar, 12) : null);
    }

    public void setParked(final int i2, final int i3, final long j2, final boolean z, h.g.a.l<? super h.ab, h.ab> lVar) {
        NativeManager.runNativeTask(new hw() { // from class: com.waze.navigate.ff
            @Override // com.waze.hw
            public final Object a() {
                fh.setParked$lambda$0(this.f31354a, i2, i3, j2, z);
                return null;
            }
        }, lVar != null ? new Cdo(lVar, 13) : null);
    }

    public final void removeParked(int i2) {
        removeParked$default(this, i2, null, 2, null);
    }

    public final void setParked(int i2, int i3, long j2, boolean z) {
        setParked$default(this, i2, i3, j2, z, null, 16, null);
    }
}
