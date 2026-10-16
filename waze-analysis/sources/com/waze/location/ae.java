package com.waze.location;

import com.google.v.eu;
import com.waze.NativeManager;
import com.waze.jni.protos.location.ProviderPosition;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public abstract class ae {
    public static final int $stable = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getSavedLocation$default(ae aeVar, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSavedLocation");
        }
        if (1 == (i2 & 1)) {
            lVar = null;
        }
        aeVar.getSavedLocation(lVar);
    }

    static final byte[] getSavedLocation$lambda$0(ae aeVar) {
        h.g.b.x.d(aeVar, "null cannot be cast to non-null type com.waze.location.LocationNativeManager");
        return ((LocationNativeManager) aeVar).getSavedLocationNTV();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void hasGPSReception$default(ae aeVar, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: hasGPSReception");
        }
        if (1 == (i2 & 1)) {
            lVar = null;
        }
        aeVar.hasGPSReception(lVar);
    }

    static final Boolean hasGPSReception$lambda$0(ae aeVar) {
        h.g.b.x.d(aeVar, "null cannot be cast to non-null type com.waze.location.LocationNativeManager");
        return Boolean.valueOf(((LocationNativeManager) aeVar).hasGPSReceptionNTV());
    }

    public void getSavedLocation(h.g.a.l<? super byte[], h.ab> lVar) {
        int i2 = 0;
        NativeManager.runNativeTask(new ac(this, i2), lVar != null ? new ad(lVar, i2) : null);
    }

    public void hasGPSReception(h.g.a.l<? super Boolean, h.ab> lVar) {
        int i2 = 1;
        NativeManager.runNativeTask(new ac(this, i2), lVar != null ? new ad(lVar, i2) : null);
    }

    public abstract void onPosition(ProviderPosition providerPosition);

    protected final void onPositionJNI(byte[] bArr) {
        h.g.b.x.f(bArr, "providerPosition");
        try {
            ProviderPosition providerPosition = (ProviderPosition) ProviderPosition.parser().c(bArr);
            h.g.b.x.c(providerPosition);
            ((LocationNativeManager) this).onPosition(providerPosition);
        } catch (eu unused) {
        }
    }

    public final void getSavedLocation() {
        getSavedLocation$default(this, null, 1, null);
    }

    public final void hasGPSReception() {
        hasGPSReception$default(this, null, 1, null);
    }
}
