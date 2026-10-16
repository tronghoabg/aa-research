package com.waze.navigate;

import com.waze.NativeManager;
import com.waze.jni.protos.navigate.NewVenuePin;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public abstract class ew {
    public static final int $stable = 0;

    static final void onNewVenueChangedJNI$lambda$0(ew ewVar, NewVenuePin newVenuePin) {
        h.g.b.x.d(ewVar, "null cannot be cast to non-null type com.waze.navigate.NewVenuePinNativeManager");
        h.g.b.x.c(newVenuePin);
        ((NewVenuePinNativeManager) ewVar).onNewVenueChanged(newVenuePin);
    }

    static final void onNewVenueRemovedJNI$lambda$0(ew ewVar) {
        h.g.b.x.d(ewVar, "null cannot be cast to non-null type com.waze.navigate.NewVenuePinNativeManager");
        ((NewVenuePinNativeManager) ewVar).onNewVenueRemoved();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void postInit$default(ew ewVar, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postInit");
        }
        if (1 == (i2 & 1)) {
            lVar = null;
        }
        ewVar.postInit(lVar);
    }

    static final h.ab postInit$lambda$0(ew ewVar) {
        h.g.b.x.d(ewVar, "null cannot be cast to non-null type com.waze.navigate.NewVenuePinNativeManager");
        ((NewVenuePinNativeManager) ewVar).postInitNTV();
        return null;
    }

    public abstract void onNewVenueChanged(NewVenuePin newVenuePin);

    protected final void onNewVenueChangedJNI(byte[] bArr) {
        h.g.b.x.f(bArr, "newVenuePin");
        try {
            NativeManager.runMainThreadTask(new ba(this, (NewVenuePin) NewVenuePin.parser().c(bArr), 20, null));
        } catch (com.google.v.eu unused) {
        }
    }

    public abstract void onNewVenueRemoved();

    protected final void onNewVenueRemovedJNI() {
        NativeManager.runMainThreadTask(new e(this, 15));
    }

    public void postInit(h.g.a.l<? super h.ab, h.ab> lVar) {
        NativeManager.runNativeTask(new bj(this, 18), lVar != null ? new Cdo(lVar, 11) : null);
    }

    public final void postInit() {
        postInit$default(this, null, 1, null);
    }
}
