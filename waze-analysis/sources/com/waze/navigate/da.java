package com.waze.navigate;

import com.waze.NativeManager;
import com.waze.jni.protos.Position;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public class da {
    public static final int $stable = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getRouteArea$default(da daVar, boolean z, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getRouteArea");
        }
        if ((i2 & 2) != 0) {
            lVar = null;
        }
        daVar.getRouteArea(z, lVar);
    }

    static final byte[] getRouteArea$lambda$0(da daVar, boolean z) {
        h.g.b.x.d(daVar, "null cannot be cast to non-null type com.waze.navigate.NavigateUtilsNativeManager");
        return ((NavigateUtilsNativeManager) daVar).getRouteAreaNTV(z);
    }

    static final void getRouteArea$lambda$1(h.g.a.l lVar, byte[] bArr) {
        Position.IntArea intArea = null;
        if (bArr == null) {
            if (lVar != null) {
                lVar.invoke(null);
            }
        } else {
            try {
                intArea = (Position.IntArea) Position.IntArea.parser().c(bArr);
            } catch (com.google.v.eu unused) {
            }
            if (lVar != null) {
                lVar.invoke(intArea);
            }
        }
    }

    public void getRouteArea(boolean z, h.g.a.l<? super Position.IntArea, h.ab> lVar) {
        NativeManager.runNativeTask(new bk(this, z, 5), new Cdo(lVar, 1));
    }

    public final void getRouteArea(boolean z) {
        getRouteArea$default(this, z, null, 2, null);
    }
}
