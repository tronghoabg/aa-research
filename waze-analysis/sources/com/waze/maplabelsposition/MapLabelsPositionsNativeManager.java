package com.waze.maplabelsposition;

import com.waze.ab.ab;
import com.waze.shared_infra.i.e;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public class MapLabelsPositionsNativeManager extends ab {
    /* JADX WARN: Illegal instructions before constructor call */
    public MapLabelsPositionsNativeManager() {
        e eVarD = com.waze.shared_infra.i.a.d("MapLabelsPositionsNativeManager");
        x.e(eVarD, "create(...)");
        this(eVarD);
    }

    public native byte[] nativeGenerateEtaLabelPositionsNTV(byte[] bArr);

    public MapLabelsPositionsNativeManager(e eVar) {
        x.f(eVar, "logger");
    }
}
