package com.waze.main_screen.a;

import h.ab;
import h.c.e;
import h.g.b.am;
import kotlinx.coroutines.b.l;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class b implements l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ am f25566a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ d f25567b;

    b(am amVar, d dVar) {
        this.f25566a = amVar;
        this.f25567b = dVar;
    }

    @Override // kotlinx.coroutines.b.l
    public final /* bridge */ /* synthetic */ Object emit(Object obj, e eVar) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        am amVar = this.f25566a;
        if (zBooleanValue) {
            amVar.f48101a = true;
            this.f25567b.f25603a.f();
        } else if (amVar.f48101a) {
            amVar.f48101a = false;
            this.f25567b.f25603a.e();
        }
        return ab.f48028a;
    }
}
