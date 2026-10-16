package com.waze.an.a.a;

import com.waze.jni.protos.nav_connect.NavConnectPartnerAppInfo;
import com.waze.jni.protos.nav_connect.NavConnectState;
import com.waze.map.Cdo;
import com.waze.map.dn;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class bd {
    public /* synthetic */ bd(byte[] bArr) {
    }

    public static /* synthetic */ com.waze.an.a.s a(com.waze.an.a.v vVar) {
        String name = vVar.b().getClass().getName();
        h.g.b.x.e(name, "getName(...)");
        return new com.waze.an.a.s(new com.waze.k(name, vVar.c(), name + ":" + vVar.c()));
    }

    public static /* synthetic */ boolean e(com.waze.alerters.a.c cVar) {
        return m(cVar) || k(cVar) || l(cVar);
    }

    static /* synthetic */ h.ab f(h.g.a.l lVar, com.waze.an.a.u uVar, com.waze.an.a.u uVar2) {
        h.g.b.x.f(uVar2, "it");
        lVar.invoke(uVar);
        return h.ab.f48028a;
    }

    public static String g(bd bdVar) {
        h.g.b.x.f(bdVar, "<this>");
        if (h.g.b.x.n(bdVar, dn.f28759a)) {
            return null;
        }
        if (!(bdVar instanceof Cdo)) {
            throw new h.i();
        }
        Cdo cdo = (Cdo) bdVar;
        if (cdo.k() instanceof com.waze.map.ab) {
            return ((com.waze.map.ab) cdo.k()).i();
        }
        return null;
    }

    public static com.waze.native_managers.o h() {
        return (com.waze.native_managers.o) com.waze.native_managers.o.f30706b.getValue();
    }

    public static com.waze.native_managers.d i(int i2) {
        Object next;
        Iterator<E> it = com.waze.native_managers.d.b().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((com.waze.native_managers.d) next).a() == i2) {
                break;
            }
        }
        return (com.waze.native_managers.d) next;
    }

    public static /* synthetic */ com.waze.map.isolated.k j(NavConnectState navConnectState) {
        NavConnectState.StateCase stateCase = navConnectState.getStateCase();
        NavConnectState.StateCase stateCase2 = NavConnectState.StateCase.INACTIVE;
        NavConnectState.PendingUserConsent.InvalidationReason invalidationReason = NavConnectState.PendingUserConsent.InvalidationReason.ABSENT;
        int iOrdinal = stateCase.ordinal();
        if (iOrdinal == 0) {
            return com.waze.nav_connect.a.m.f30742a;
        }
        if (iOrdinal == 1) {
            String externalTripToken = navConnectState.getPendingTokenValidation().getExternalTripToken();
            h.g.b.x.e(externalTripToken, "getExternalTripToken(...)");
            return new com.waze.nav_connect.a.o(externalTripToken);
        }
        if (iOrdinal == 2) {
            NavConnectPartnerAppInfo partnerAppInfo = navConnectState.getPendingUserConsent().getPartnerAppInfo();
            h.g.b.x.e(partnerAppInfo, "getPartnerAppInfo(...)");
            com.waze.nav_connect.a.e eVarN = n(partnerAppInfo);
            String externalTripToken2 = navConnectState.getPendingUserConsent().getExternalTripToken();
            h.g.b.x.e(externalTripToken2, "getExternalTripToken(...)");
            NavConnectState.PendingUserConsent.InvalidationReason invalidationReason2 = navConnectState.getPendingUserConsent().getInvalidationReason();
            h.g.b.x.e(invalidationReason2, "getInvalidationReason(...)");
            int iOrdinal2 = invalidationReason2.ordinal();
            return new com.waze.nav_connect.a.p(eVarN, externalTripToken2, iOrdinal2 != 0 ? iOrdinal2 != 1 ? iOrdinal2 != 2 ? com.waze.nav_connect.a.a.f30711a : com.waze.nav_connect.a.a.f30713c : com.waze.nav_connect.a.a.f30712b : com.waze.nav_connect.a.a.f30711a);
        }
        if (iOrdinal == 3) {
            NavConnectPartnerAppInfo partnerAppInfo2 = navConnectState.getActive().getPartnerAppInfo();
            h.g.b.x.e(partnerAppInfo2, "getPartnerAppInfo(...)");
            com.waze.nav_connect.a.e eVarN2 = n(partnerAppInfo2);
            String externalTripToken3 = navConnectState.getActive().getExternalTripToken();
            h.g.b.x.e(externalTripToken3, "getExternalTripToken(...)");
            return new com.waze.nav_connect.a.l(eVarN2, externalTripToken3);
        }
        if (iOrdinal != 4) {
            return com.waze.nav_connect.a.m.f30742a;
        }
        NavConnectPartnerAppInfo partnerAppInfo3 = navConnectState.getPaused().getPartnerAppInfo();
        h.g.b.x.e(partnerAppInfo3, "getPartnerAppInfo(...)");
        com.waze.nav_connect.a.e eVarN3 = n(partnerAppInfo3);
        String externalTripToken4 = navConnectState.getPaused().getExternalTripToken();
        h.g.b.x.e(externalTripToken4, "getExternalTripToken(...)");
        return new com.waze.nav_connect.a.n(eVarN3, externalTripToken4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean k(com.waze.alerters.a.c cVar) {
        return h.g.b.x.n(((com.waze.j) cVar.d().d()).f().a(), com.waze.e.f23615h.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean l(com.waze.alerters.a.c cVar) {
        return h.g.b.x.n(((com.waze.j) cVar.d().d()).f().a(), com.waze.e.f23616i.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean m(com.waze.alerters.a.c cVar) {
        return h.g.b.x.n(((com.waze.j) cVar.d().d()).f().a(), com.waze.e.f23612e.a());
    }

    private static com.waze.nav_connect.a.e n(NavConnectPartnerAppInfo navConnectPartnerAppInfo) {
        String isvPrivacyPolicyUrl;
        String isvBusinessName = navConnectPartnerAppInfo.getIsvBusinessName();
        com.waze.nav_connect.a.d dVar = null;
        if (isvBusinessName != null && isvBusinessName.length() != 0 && (isvPrivacyPolicyUrl = navConnectPartnerAppInfo.getIsvPrivacyPolicyUrl()) != null && isvPrivacyPolicyUrl.length() != 0) {
            String isvBusinessName2 = navConnectPartnerAppInfo.getIsvBusinessName();
            h.g.b.x.e(isvBusinessName2, "getIsvBusinessName(...)");
            String isvPrivacyPolicyUrl2 = navConnectPartnerAppInfo.getIsvPrivacyPolicyUrl();
            h.g.b.x.e(isvPrivacyPolicyUrl2, "getIsvPrivacyPolicyUrl(...)");
            dVar = new com.waze.nav_connect.a.d(isvBusinessName2, isvPrivacyPolicyUrl2);
        }
        String partnerAppId = navConnectPartnerAppInfo.getPartnerAppId();
        h.g.b.x.e(partnerAppId, "getPartnerAppId(...)");
        String title = navConnectPartnerAppInfo.getTitle();
        h.g.b.x.e(title, "getTitle(...)");
        com.google.v.v iconData = navConnectPartnerAppInfo.getIconData();
        h.g.b.x.e(iconData, "getIconData(...)");
        String privacyPolicyUrl = navConnectPartnerAppInfo.getPrivacyPolicyUrl();
        h.g.b.x.e(privacyPolicyUrl, "getPrivacyPolicyUrl(...)");
        return new com.waze.nav_connect.a.e(partnerAppId, title, iconData, privacyPolicyUrl, dVar);
    }

    private bd() {
        throw null;
    }
}
