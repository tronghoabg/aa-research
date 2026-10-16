package com.waze.reports_v2.c;

import android.content.Context;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class bt implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bu f34287a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f34288b;

    bt(bu buVar, Context context) {
        this.f34287a = buVar;
        this.f34288b = context;
    }

    @Override // kotlinx.coroutines.b.l
    public final /* bridge */ /* synthetic */ Object emit(Object obj, h.c.e eVar) {
        String strB;
        com.waze.copilot.data.ag agVarA;
        com.waze.sound.a.b bVar = (com.waze.sound.a.b) obj;
        if (bVar == null || (agVarA = bVar.a()) == null || (strB = agVarA.f()) == null) {
            strB = bVar != null ? bVar.b() : null;
        }
        bu buVar = this.f34287a;
        buVar.f34291c.a("Selected voice was changed to a voice with id: " + strB + "., updating Conversational reporting state");
        Object objA = buVar.f34289a.a(this.f34288b, eVar);
        return objA == h.c.a.a.f48038a ? objA : h.ab.f48028a;
    }
}
