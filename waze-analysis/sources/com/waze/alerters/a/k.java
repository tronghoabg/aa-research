package com.waze.alerters.a;

import com.waze.AlerterController$Alerter$Type;
import com.waze.app_nav.ah;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class k {
    public /* synthetic */ k(byte[] bArr) {
    }

    public static boolean a(i iVar, com.waze.j jVar, h.g.a.a aVar, h.g.a.a aVar2, h.g.a.a aVar3, h.g.a.a aVar4) {
        h.g.b.x.f(iVar, "<this>");
        h.g.b.x.f(jVar, "data");
        h.g.b.x.f(aVar, "onShow");
        h.g.b.x.f(aVar2, "onEnd");
        h.g.b.x.f(aVar3, "onPrimary");
        h.g.b.x.f(aVar4, "onSecondary");
        return iVar.c(new j(jVar, new com.waze.a.aa(iVar, jVar, 4), aVar, aVar2, aVar3, aVar4));
    }

    public static long b(AlerterController$Alerter$Type alerterController$Alerter$Type) {
        h.g.b.x.f(alerterController$Alerter$Type, "<this>");
        AlerterController$Alerter$Type alerterController$Alerter$Type2 = AlerterController$Alerter$Type.UNSPECIFIED;
        switch (alerterController$Alerter$Type.ordinal()) {
            case 0:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
                return -1L;
            case 1:
                return 0L;
            case 2:
                return 1L;
            case 3:
                return 2L;
            case 4:
                return 3L;
            case 5:
                return 4L;
            case 6:
                return 5L;
            case 7:
                return 6L;
            case 8:
                return 7L;
            case 9:
                return 8L;
            case 10:
                return 9L;
            case 11:
                return 10L;
            case 12:
                return 11L;
            case 13:
                return 12L;
            case 14:
                return 15L;
            case 15:
                return 16L;
            case 16:
                return 17L;
            case 17:
                return 18L;
            case 18:
                return 19L;
            case 19:
                return 20L;
            case 20:
                return 21L;
            case 21:
                return 22L;
            case 22:
                return 23L;
            case 23:
                return 24L;
            case 24:
                return 25L;
            case 25:
                return 26L;
            default:
                throw new h.i();
        }
    }

    public static com.waze.app_nav.r c(com.waze.app_nav.w wVar, com.waze.app_nav.p pVar, ah ahVar) {
        h.g.b.x.f(wVar, "<this>");
        h.g.b.x.f(pVar, "flow");
        h.g.b.x.f(ahVar, "options");
        return wVar.a(new com.waze.app_nav.m(pVar, ahVar));
    }

    public static com.waze.app_nav.w e() {
        return com.waze.app_nav.w.f15441a.a();
    }

    private k() {
        throw null;
    }
}
