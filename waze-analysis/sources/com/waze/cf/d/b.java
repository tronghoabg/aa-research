package com.waze.cf.d;

import com.waze.NativeManager;
import com.waze.car_lib.be;
import com.waze.search.bm;
import h.ab;
import h.c.e;
import kotlinx.coroutines.b.l;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class b implements l {
    @Override // kotlinx.coroutines.b.l
    public final /* bridge */ /* synthetic */ Object emit(Object obj, e eVar) {
        NativeManager.runMainThreadTask(new be((bm) obj, 15));
        return ab.f48028a;
    }
}
