package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class otn {
    private static volatile defpackage.adng a;
    public static volatile adom b;
    private static volatile defpackage.adng c;
    private static volatile defpackage.adng d;
    private static volatile defpackage.adng e;
    private static volatile defpackage.adng f;
    private static volatile defpackage.adng g;
    private static volatile defpackage.adng h;
    private static volatile defpackage.adng i;
    private static volatile defpackage.adng j;
    private static volatile defpackage.adng k;
    private static volatile defpackage.adng l;
    private static volatile defpackage.adng m;
    private static volatile defpackage.adng n;
    private static volatile defpackage.adng o;
    private static volatile defpackage.adng p;

    private otn() {
    }

    public static void A(int i2, defpackage.abor aborVar) {
        aborVar.t();
        osx osxVar = aborVar.b;
        osx osxVar2 = osx.a;
        osxVar.c = i2 - 1;
        osxVar.b |= 1;
    }

    public static void B(defpackage.abor aborVar) {
        java.util.List listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(aborVar.b.f);
        listUnmodifiableList.getClass();
        new abrl(listUnmodifiableList);
    }

    public static void C(osj osjVar, defpackage.abor aborVar) {
        osjVar.getClass();
        aborVar.t();
        osk oskVar = aborVar.b;
        osk oskVar2 = osk.a;
        oskVar.d = osjVar;
        oskVar.c = 7;
    }

    public static /* synthetic */ osj D(defpackage.abor aborVar) {
        osj osjVarQ = aborVar.q();
        osjVarQ.getClass();
        return osjVarQ;
    }

    public static /* synthetic */ pcl E(defpackage.abor aborVar) {
        pcl pclVarQ = aborVar.q();
        pclVarQ.getClass();
        return pclVarQ;
    }

    public static /* synthetic */ abrn F(defpackage.abor aborVar) {
        java.util.Map mapUnmodifiableMap = j$.util.DesugarCollections.unmodifiableMap(j$.util.DesugarCollections.unmodifiableMap(aborVar.b.d));
        mapUnmodifiableMap.getClass();
        return new abrn(mapUnmodifiableMap);
    }

    public static pav I(pck pckVar) {
        java.lang.String str = pckVar.c;
        str.getClass();
        java.lang.String str2 = pckVar.e;
        str2.getClass();
        java.lang.String str3 = pckVar.d;
        str3.getClass();
        xqw xqwVarB = xqw.b(pckVar.f);
        if (xqwVarB == null) {
            xqwVarB = xqw.a;
        }
        defpackage.abpf abpfVar = pckVar.g;
        abpfVar.getClass();
        return new pav(str, str2, str3, xqwVarB, defpackage.afga.aZ(abpfVar));
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public static oyj J(defpackage.oyk oykVar) {
        return (oyj) oykVar.a(oyj.class);
    }

    public static int K(android.app.Notification notification) {
        android.os.Bundle bundle;
        android.os.Bundle bundle2 = notification.extras;
        return (bundle2 == null || (bundle = bundle2.getBundle("android.car.EXTENSIONS")) == null || bundle.getInt("type", 1) != 0) ? 1 : 0;
    }

    public static boolean L(oxe oxeVar, android.content.Context context, android.content.res.Resources resources) {
        oxe oxeVar2 = oxe.a;
        java.lang.String str = oxeVar.d;
        int identifier = resources.getIdentifier(str, "bool", context.getPackageName());
        if (identifier != 0) {
            return resources.getBoolean(identifier);
        }
        java.lang.Boolean bool = oxeVar.e;
        if (bool == null) {
            throw new android.content.res.Resources.NotFoundException("Can't find resource: @bool/".concat(java.lang.String.valueOf(str)));
        }
        bool.booleanValue();
        return false;
    }

    public static void M(com.google.android.apps.auto.sdk.MenuItem menuItem) {
        if (android.text.TextUtils.isEmpty(menuItem.c)) {
            android.util.Log.w("CSL.MenuItem", "MenuItem title should be non-empty");
        }
        int i2 = menuItem.a;
        if (i2 != 1 && menuItem.m) {
            throw new java.lang.IllegalArgumentException("MenuItem is not a checkbox type but is checked");
        }
        if (i2 != 3 && menuItem.n != null) {
            throw new java.lang.IllegalArgumentException("The menu is not a special view, but has remote views");
        }
        if ((menuItem.g != null ? 1 : 0) + (menuItem.e != 0 ? 1 : 0) + (menuItem.h != null ? 1 : 0) > 1) {
            throw new java.lang.IllegalArgumentException("Cannot set multiple icon types.");
        }
        if (menuItem.i != 0 && i2 != 0) {
            throw new java.lang.IllegalArgumentException("Cannot set right icon on non ITEM types.");
        }
    }

    public static /* synthetic */ oss N(defpackage.abor aborVar) {
        oss ossVarQ = aborVar.q();
        ossVarQ.getClass();
        return ossVarQ;
    }

    public static defpackage.adng g() {
        defpackage.adng adngVarA;
        defpackage.adng adngVar = d;
        if (adngVar != null) {
            return adngVar;
        }
        synchronized (defpackage.otn.class) {
            adngVarA = d;
            if (adngVarA == null) {
                defpackage.xo xoVarC = defpackage.adng.c();
                xoVarC.b = defpackage.adnf.a;
                xoVarC.d = defpackage.adng.b("wireless.android.auto.proto.assistant.CarAssistantCallbacksService", "AssistantSessionEnded");
                xoVarC.b();
                otk otkVar = otk.a;
                defpackage.abol abolVar = defpackage.aedu.a;
                xoVarC.e = new defpackage.aedt(otkVar);
                xoVarC.c = new defpackage.aedt(otr.a);
                adngVarA = xoVarC.a();
                d = adngVarA;
            }
        }
        return adngVarA;
    }

    public static defpackage.adng h() {
        defpackage.adng adngVarA;
        defpackage.adng adngVar = e;
        if (adngVar != null) {
            return adngVar;
        }
        synchronized (defpackage.otn.class) {
            adngVarA = e;
            if (adngVarA == null) {
                defpackage.xo xoVarC = defpackage.adng.c();
                xoVarC.b = defpackage.adnf.a;
                xoVarC.d = defpackage.adng.b("wireless.android.auto.proto.assistant.CarAssistantCallbacksService", "AssistantSessionResult");
                xoVarC.b();
                otk otkVar = otk.a;
                defpackage.abol abolVar = defpackage.aedu.a;
                xoVarC.e = new defpackage.aedt(otkVar);
                xoVarC.c = new defpackage.aedt(osu.a);
                adngVarA = xoVarC.a();
                e = adngVarA;
            }
        }
        return adngVarA;
    }

    public static defpackage.adng i() {
        defpackage.adng adngVarA;
        defpackage.adng adngVar = o;
        if (adngVar != null) {
            return adngVar;
        }
        synchronized (defpackage.otn.class) {
            adngVarA = o;
            if (adngVarA == null) {
                defpackage.xo xoVarC = defpackage.adng.c();
                xoVarC.b = defpackage.adnf.a;
                xoVarC.d = defpackage.adng.b("wireless.android.auto.proto.assistant.CarAssistantCallbacksService", "GeminiStateUpdate");
                xoVarC.b();
                otk otkVar = otk.a;
                defpackage.abol abolVar = defpackage.aedu.a;
                xoVarC.e = new defpackage.aedt(otkVar);
                xoVarC.c = new defpackage.aedt(otr.a);
                adngVarA = xoVarC.a();
                o = adngVarA;
            }
        }
        return adngVarA;
    }

    public static defpackage.adng j() {
        defpackage.adng adngVarA;
        defpackage.adng adngVar = p;
        if (adngVar != null) {
            return adngVar;
        }
        synchronized (defpackage.otn.class) {
            adngVarA = p;
            if (adngVarA == null) {
                defpackage.xo xoVarC = defpackage.adng.c();
                xoVarC.b = defpackage.adnf.a;
                xoVarC.d = defpackage.adng.b("wireless.android.auto.proto.assistant.CarAssistantCallbacksService", "GetCarActions");
                xoVarC.b();
                otk otkVar = otk.a;
                defpackage.abol abolVar = defpackage.aedu.a;
                xoVarC.e = new defpackage.aedt(otkVar);
                xoVarC.c = new defpackage.aedt(otm.a);
                adngVarA = xoVarC.a();
                p = adngVarA;
            }
        }
        return adngVarA;
    }

    public static defpackage.adng k() {
        defpackage.adng adngVarA;
        defpackage.adng adngVar = n;
        if (adngVar != null) {
            return adngVar;
        }
        synchronized (defpackage.otn.class) {
            adngVarA = n;
            if (adngVarA == null) {
                defpackage.xo xoVarC = defpackage.adng.c();
                xoVarC.b = defpackage.adnf.a;
                xoVarC.d = defpackage.adng.b("wireless.android.auto.proto.assistant.CarAssistantCallbacksService", "GetCarProperties");
                xoVarC.b();
                otk otkVar = otk.a;
                defpackage.abol abolVar = defpackage.aedu.a;
                xoVarC.e = new defpackage.aedt(otkVar);
                xoVarC.c = new defpackage.aedt(otq.a);
                adngVarA = xoVarC.a();
                n = adngVarA;
            }
        }
        return adngVarA;
    }

    public static defpackage.adng l() {
        defpackage.adng adngVarA;
        defpackage.adng adngVar = i;
        if (adngVar != null) {
            return adngVar;
        }
        synchronized (defpackage.otn.class) {
            adngVarA = i;
            if (adngVarA == null) {
                defpackage.xo xoVarC = defpackage.adng.c();
                xoVarC.b = defpackage.adnf.a;
                xoVarC.d = defpackage.adng.b("wireless.android.auto.proto.assistant.CarAssistantCallbacksService", "GetDirectActions");
                xoVarC.b();
                otk otkVar = otk.a;
                defpackage.abol abolVar = defpackage.aedu.a;
                xoVarC.e = new defpackage.aedt(otkVar);
                xoVarC.c = new defpackage.aedt(oty.a);
                adngVarA = xoVarC.a();
                i = adngVarA;
            }
        }
        return adngVarA;
    }

    public static defpackage.adng m() {
        defpackage.adng adngVarA;
        defpackage.adng adngVar = c;
        if (adngVar != null) {
            return adngVar;
        }
        synchronized (defpackage.otn.class) {
            adngVarA = c;
            if (adngVarA == null) {
                defpackage.xo xoVarC = defpackage.adng.c();
                xoVarC.b = defpackage.adnf.a;
                xoVarC.d = defpackage.adng.b("wireless.android.auto.proto.assistant.CarAssistantCallbacksService", "GetSessionData");
                xoVarC.b();
                otk otkVar = otk.a;
                defpackage.abol abolVar = defpackage.aedu.a;
                xoVarC.e = new defpackage.aedt(otkVar);
                xoVarC.c = new defpackage.aedt(otp.a);
                adngVarA = xoVarC.a();
                c = adngVarA;
            }
        }
        return adngVarA;
    }

    public static defpackage.adng n() {
        defpackage.adng adngVarA;
        defpackage.adng adngVar = k;
        if (adngVar != null) {
            return adngVar;
        }
        synchronized (defpackage.otn.class) {
            adngVarA = k;
            if (adngVarA == null) {
                defpackage.xo xoVarC = defpackage.adng.c();
                xoVarC.b = defpackage.adnf.a;
                xoVarC.d = defpackage.adng.b("wireless.android.auto.proto.assistant.CarAssistantCallbacksService", "ModifySettings");
                xoVarC.b();
                otk otkVar = otk.a;
                defpackage.abol abolVar = defpackage.aedu.a;
                xoVarC.e = new defpackage.aedt(otkVar);
                xoVarC.c = new defpackage.aedt(otr.a);
                adngVarA = xoVarC.a();
                k = adngVarA;
            }
        }
        return adngVarA;
    }

    public static defpackage.adng o() {
        defpackage.adng adngVarA;
        defpackage.adng adngVar = m;
        if (adngVar != null) {
            return adngVar;
        }
        synchronized (defpackage.otn.class) {
            adngVarA = m;
            if (adngVarA == null) {
                defpackage.xo xoVarC = defpackage.adng.c();
                xoVarC.b = defpackage.adnf.a;
                xoVarC.d = defpackage.adng.b("wireless.android.auto.proto.assistant.CarAssistantCallbacksService", "PerformCarControl");
                xoVarC.b();
                otk otkVar = otk.a;
                defpackage.abol abolVar = defpackage.aedu.a;
                xoVarC.e = new defpackage.aedt(otkVar);
                xoVarC.c = new defpackage.aedt(oub.a);
                adngVarA = xoVarC.a();
                m = adngVarA;
            }
        }
        return adngVarA;
    }

    public static defpackage.adng p() {
        defpackage.adng adngVarA;
        defpackage.adng adngVar = j;
        if (adngVar != null) {
            return adngVar;
        }
        synchronized (defpackage.otn.class) {
            adngVarA = j;
            if (adngVarA == null) {
                defpackage.xo xoVarC = defpackage.adng.c();
                xoVarC.b = defpackage.adnf.a;
                xoVarC.d = defpackage.adng.b("wireless.android.auto.proto.assistant.CarAssistantCallbacksService", "PerformDirectAction");
                xoVarC.b();
                otk otkVar = otk.a;
                defpackage.abol abolVar = defpackage.aedu.a;
                xoVarC.e = new defpackage.aedt(otkVar);
                xoVarC.c = new defpackage.aedt(ouc.a);
                adngVarA = xoVarC.a();
                j = adngVarA;
            }
        }
        return adngVarA;
    }

    public static defpackage.adng q() {
        defpackage.adng adngVarA;
        defpackage.adng adngVar = g;
        if (adngVar != null) {
            return adngVar;
        }
        synchronized (defpackage.otn.class) {
            adngVarA = g;
            if (adngVarA == null) {
                defpackage.xo xoVarC = defpackage.adng.c();
                xoVarC.b = defpackage.adnf.a;
                xoVarC.d = defpackage.adng.b("wireless.android.auto.proto.assistant.CarAssistantCallbacksService", "PostAssistantSuggestions");
                xoVarC.b();
                otk otkVar = otk.a;
                defpackage.abol abolVar = defpackage.aedu.a;
                xoVarC.e = new defpackage.aedt(otkVar);
                xoVarC.c = new defpackage.aedt(otr.a);
                adngVarA = xoVarC.a();
                g = adngVarA;
            }
        }
        return adngVarA;
    }

    public static defpackage.adng r() {
        defpackage.adng adngVarA;
        defpackage.adng adngVar = h;
        if (adngVar != null) {
            return adngVar;
        }
        synchronized (defpackage.otn.class) {
            adngVarA = h;
            if (adngVarA == null) {
                defpackage.xo xoVarC = defpackage.adng.c();
                xoVarC.b = defpackage.adnf.a;
                xoVarC.d = defpackage.adng.b("wireless.android.auto.proto.assistant.CarAssistantCallbacksService", "PostMediaRecommendations");
                xoVarC.b();
                otk otkVar = otk.a;
                defpackage.abol abolVar = defpackage.aedu.a;
                xoVarC.e = new defpackage.aedt(otkVar);
                xoVarC.c = new defpackage.aedt(otr.a);
                adngVarA = xoVarC.a();
                h = adngVarA;
            }
        }
        return adngVarA;
    }

    public static defpackage.adng s() {
        defpackage.adng adngVarA;
        defpackage.adng adngVar = a;
        if (adngVar != null) {
            return adngVar;
        }
        synchronized (defpackage.otn.class) {
            adngVarA = a;
            if (adngVarA == null) {
                defpackage.xo xoVarC = defpackage.adng.c();
                xoVarC.b = defpackage.adnf.a;
                xoVarC.d = defpackage.adng.b("wireless.android.auto.proto.assistant.CarAssistantCallbacksService", "RequestAssistantSession");
                xoVarC.b();
                otk otkVar = otk.a;
                defpackage.abol abolVar = defpackage.aedu.a;
                xoVarC.e = new defpackage.aedt(otkVar);
                xoVarC.c = new defpackage.aedt(otr.a);
                adngVarA = xoVarC.a();
                a = adngVarA;
            }
        }
        return adngVarA;
    }

    public static defpackage.adng t() {
        defpackage.adng adngVarA;
        defpackage.adng adngVar = f;
        if (adngVar != null) {
            return adngVar;
        }
        synchronized (defpackage.otn.class) {
            adngVarA = f;
            if (adngVarA == null) {
                defpackage.xo xoVarC = defpackage.adng.c();
                xoVarC.b = defpackage.adnf.a;
                xoVarC.d = defpackage.adng.b("wireless.android.auto.proto.assistant.CarAssistantCallbacksService", "SendTranscriptionSessionEvent");
                xoVarC.b();
                otk otkVar = otk.a;
                defpackage.abol abolVar = defpackage.aedu.a;
                xoVarC.e = new defpackage.aedt(otkVar);
                xoVarC.c = new defpackage.aedt(otr.a);
                adngVarA = xoVarC.a();
                f = adngVarA;
            }
        }
        return adngVarA;
    }

    public static defpackage.adng u() {
        defpackage.adng adngVarA;
        defpackage.adng adngVar = l;
        if (adngVar != null) {
            return adngVar;
        }
        synchronized (defpackage.otn.class) {
            adngVarA = l;
            if (adngVarA == null) {
                defpackage.xo xoVarC = defpackage.adng.c();
                xoVarC.b = defpackage.adnf.a;
                xoVarC.d = defpackage.adng.b("wireless.android.auto.proto.assistant.CarAssistantCallbacksService", "VoiceSessionTypeUpdate");
                xoVarC.b();
                otk otkVar = otk.a;
                defpackage.abol abolVar = defpackage.aedu.a;
                xoVarC.e = new defpackage.aedt(otkVar);
                xoVarC.c = new defpackage.aedt(otr.a);
                adngVarA = xoVarC.a();
                l = adngVarA;
            }
        }
        return adngVarA;
    }

    public static /* synthetic */ otr v(defpackage.abor aborVar) {
        otr otrVarQ = aborVar.q();
        otrVarQ.getClass();
        return otrVarQ;
    }

    public static void w(oss ossVar, defpackage.abor aborVar) {
        aborVar.t();
        osm osmVar = aborVar.b;
        osm osmVar2 = osm.a;
        osmVar.h = ossVar;
        osmVar.b |= 32;
    }

    public static /* synthetic */ java.lang.String x(int i2) {
        if (i2 == 1) {
            return "PRIORITY_UNSPECIFIED";
        }
        if (i2 == 2) {
            return "PRIORITY_MIN";
        }
        if (i2 == 3) {
            return "PRIORITY_LOW";
        }
        if (i2 != 4) {
            return i2 != 5 ? "PRIORITY_MAX" : "PRIORITY_HIGH";
        }
        return "PRIORITY_DEFAULT";
    }

    public static /* synthetic */ osx y(defpackage.abor aborVar) {
        osx osxVarQ = aborVar.q();
        osxVarQ.getClass();
        return osxVarQ;
    }

    public static /* synthetic */ void z(java.lang.Iterable iterable, defpackage.abor aborVar) {
        aborVar.t();
        osx osxVar = aborVar.b;
        osx osxVar2 = osx.a;
        defpackage.abpj abpjVar = osxVar.f;
        if (!abpjVar.c()) {
            osxVar.f = defpackage.abox.I(abpjVar);
        }
        defpackage.abnf.i(iterable, osxVar.f);
    }

    public otn(byte[] bArr) {
    }

    public void c() {
    }

    public void d() {
    }

    public void e(int i2) {
    }

    public void f(int i2) {
    }

    public void a(android.support.v7.widget.RecyclerView recyclerView, int i2) {
    }

    public void b(android.support.v7.widget.RecyclerView recyclerView, int i2, int i3) {
    }
}
