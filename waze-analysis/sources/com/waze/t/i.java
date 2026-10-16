package com.waze.t;

import com.waze.copilot.data.ag;
import h.ab;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class i implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f40895a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f40896b;

    i(Object obj, int i2) {
        this.f40896b = i2;
        this.f40895a = obj;
    }

    @Override // kotlinx.coroutines.b.l
    public final /* synthetic */ Object emit(Object obj, h.c.e eVar) {
        ag agVarA;
        int i2 = this.f40896b;
        if (i2 == 0) {
            ((k) this.f40895a).f40903d = (String) obj;
            return ab.f48028a;
        }
        if (i2 != 1) {
            ((q) this.f40895a).f40910b = ((com.waze.sharedui.e.c) obj).f();
            return ab.f48028a;
        }
        com.waze.sound.a.b bVar = (com.waze.sound.a.b) obj;
        String strH = null;
        if (bVar != null && (agVarA = bVar.a()) != null) {
            strH = agVarA.h();
        }
        ((h) this.f40895a).f40894d = strH;
        return ab.f48028a;
    }
}
