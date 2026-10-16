package com.waze.ac.c;

import com.waze.NativeManager;
import h.ab;
import h.c.e;
import kotlinx.coroutines.b.l;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class a implements l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ b f13846a;

    a(b bVar) {
        this.f13846a = bVar;
    }

    @Override // kotlinx.coroutines.b.l
    public final /* bridge */ /* synthetic */ Object emit(Object obj, e eVar) {
        com.waze.ac.a.a aVar = (com.waze.ac.a.a) obj;
        NativeManager.UiReadyToShowEncouragement(aVar.a());
        this.f13846a.f13847a.b(aVar);
        return ab.f48028a;
    }
}
