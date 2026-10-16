package com.waze.uid.c;

import l.a.aoh;
import l.a.brg;
import l.a.bri;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class al {
    public /* synthetic */ al(byte[] bArr) {
    }

    public static void c(aoh aohVar, ak akVar) {
        l.a.g gVar;
        h.g.b.x.f(aohVar, "context");
        h.g.b.x.f(akVar, "action");
        l.a.h hVarNewBuilder = l.a.i.newBuilder();
        h.g.b.x.e(hVarNewBuilder, "newBuilder(...)");
        hVarNewBuilder.c(com.waze.ui.w.a.b.b());
        hVarNewBuilder.b(aohVar);
        ak akVar2 = ak.f44209a;
        int iOrdinal = akVar.ordinal();
        if (iOrdinal == 0) {
            gVar = l.a.g.TRY_AGAIN;
        } else {
            if (iOrdinal != 1) {
                throw new h.i();
            }
            gVar = l.a.g.CREATE_A_NEW_ACCOUNT;
        }
        hVarNewBuilder.a(gVar);
        com.waze.stats.ax axVarA = com.waze.stats.ax.f40550a.a();
        brg brgVarNewBuilder = bri.newBuilder();
        brgVarNewBuilder.b(hVarNewBuilder.build());
        bri briVarBuild = brgVarNewBuilder.build();
        h.g.b.x.e(briVarBuild, "build(...)");
        com.waze.sharedui.utils.o.f(axVarA, briVarBuild);
    }

    public static void d(aoh aohVar) {
        cb.p(aohVar);
    }

    private al() {
        throw null;
    }

    public al(char[] cArr) {
    }
}
