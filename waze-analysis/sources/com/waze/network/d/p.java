package com.waze.network.d;

import e.a.am;
import e.a.cd;
import e.a.ch;
import e.a.cm;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class p extends am {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ q f32216a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    p(q qVar, e.a.k kVar) {
        super(kVar);
        this.f32216a = qVar;
    }

    @Override // e.a.an, e.a.k
    public final void e(com.waze.uid.f fVar, cm cmVar) {
        x.f(fVar, "responseListener");
        x.f(cmVar, "headers");
        cd cdVar = cm.f46534a;
        ch chVarC = ch.c("CLIENT-PLATFORM", cdVar);
        q qVar = this.f32216a;
        cmVar.i(chVarC, qVar.f32217a.b());
        cmVar.i(ch.c("CLIENT-VERSION", cdVar), qVar.f32217a.d());
        if (qVar.f32218b) {
            cmVar.i(ch.c("CLIENT-SESSION", cdVar), qVar.f32217a.c());
            String str = (String) qVar.f32217a.g().invoke();
            if (str != null) {
                cmVar.i(ch.c("USER-NAME", cdVar), str);
            }
            cmVar.i(ch.c("INSTALLATION-ID", cdVar), qVar.f32217a.a());
            String str2 = (String) qVar.f32217a.f().invoke();
            if (str2 != null) {
                cmVar.i(ch.c("SERVER-SESSION-UUID", cdVar), str2);
            }
        } else {
            cmVar.i(ch.c("INSTALLATION-ID", cdVar), qVar.f32217a.e());
        }
        qVar.f32217a.h();
        String strI = s.i();
        if (strI != null) {
            cmVar.i(ch.c("TRANSACTION-ID", cdVar), strI);
        }
        qVar.f32219c.a("gRPC headers added");
        super.e(new o(fVar, qVar), cmVar);
    }
}
