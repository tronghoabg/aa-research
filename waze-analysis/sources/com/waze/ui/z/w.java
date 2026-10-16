package com.waze.ui.z;

import com.waze.map.b.bg;
import com.waze.map.b.bi;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class w implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.waze.ui.p.i f44022a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f44023b;

    w(com.waze.ui.p.i iVar, int i2) {
        this.f44023b = i2;
        this.f44022a = iVar;
    }

    @Override // kotlinx.coroutines.b.l
    public final /* synthetic */ Object emit(Object obj, h.c.e eVar) {
        if (this.f44023b == 0) {
            this.f44022a.d((bg) obj);
            return h.ab.f48028a;
        }
        bi biVar = (bi) obj;
        if (biVar != null) {
            this.f44022a.e(biVar);
        }
        return h.ab.f48028a;
    }
}
