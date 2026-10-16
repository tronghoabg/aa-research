package com.waze.d;

import com.waze.NativeManager;
import com.waze.ak;
import com.waze.al;
import com.waze.am;
import com.waze.an;
import com.waze.cf;
import h.ab;
import h.i;
import kotlinx.coroutines.b.l;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class g implements l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ h f23270a;

    g(h hVar) {
        this.f23270a = hVar;
    }

    @Override // kotlinx.coroutines.b.l
    public final /* bridge */ /* synthetic */ Object emit(Object obj, h.c.e eVar) {
        h hVar = this.f23270a;
        cf cfVar = (cf) obj;
        h.e(hVar, cfVar);
        if ((cfVar instanceof an) || (cfVar instanceof al) || (cfVar instanceof ak)) {
            NativeManager.runOnNativeManagerReady(new Runnable() { // from class: com.waze.d.e
                @Override // java.lang.Runnable
                public final void run() {
                    h.d(this.f23265a, z);
                }
            });
        } else {
            if (!(cfVar instanceof am)) {
                throw new i();
            }
            NativeManager.runOnNativeManagerReady(new Runnable() { // from class: com.waze.d.e
                @Override // java.lang.Runnable
                public final void run() {
                    h.d(this.f23265a, z);
                }
            });
        }
        return ab.f48028a;
    }
}
