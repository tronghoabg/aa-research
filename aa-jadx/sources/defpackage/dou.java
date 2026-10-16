package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class dou {
    public final defpackage.dpt a;
    public int b;
    public int c;
    private int d;
    private final java.util.ArrayList e;
    private defpackage.ajnd f;

    public dou(byte[] bArr) {
        new java.util.ArrayList();
        this.a = new defpackage.dpt(new char[0]);
        this.c = 1000;
    }

    public static defpackage.cgf h(defpackage.cgf cgfVar, defpackage.dor dorVar, defpackage.affc affcVar) {
        return cgfVar.a(new defpackage.dow(dorVar, affcVar));
    }

    public final int a() {
        int i = this.c;
        this.c = i + 1;
        return i;
    }

    public final defpackage.dos b(float f) {
        defpackage.dpa dpaVar = new defpackage.dpa(java.lang.Integer.valueOf(a()));
        defpackage.dpt dptVarD = d(dpaVar);
        dptVarD.t(com.google.android.sidekick.shared.remoteapi.RemoteApiConstants.BROADCAST_INTENT_TYPE_EXTRA, "hGuideline");
        dptVarD.s("start", f);
        e(7);
        e(java.lang.Float.floatToIntBits(f));
        return new defpackage.dos(dpaVar.h, 0, dpaVar);
    }

    public final defpackage.dot c(float f) {
        defpackage.dpa dpaVar = new defpackage.dpa(java.lang.Integer.valueOf(a()));
        defpackage.dpt dptVarD = d(dpaVar);
        dptVarD.t(com.google.android.sidekick.shared.remoteapi.RemoteApiConstants.BROADCAST_INTENT_TYPE_EXTRA, "vGuideline");
        dptVarD.s("start", f);
        e(1);
        e(java.lang.Float.floatToIntBits(f));
        return new defpackage.dot(dpaVar.h, 0, dpaVar);
    }

    public final defpackage.dpt d(defpackage.dpa dpaVar) throws defpackage.dpu {
        java.lang.String string = dpaVar.a().toString();
        defpackage.dpt dptVar = this.a;
        if (dptVar.l(string) == null) {
            dptVar.r(string, new defpackage.dpt(new char[0]));
        }
        defpackage.dpp dppVarI = dptVar.i(string);
        if (dppVarI instanceof defpackage.dpt) {
            return (defpackage.dpt) dppVarI;
        }
        throw new defpackage.dpu("no object found for key <" + string + ">, found [" + dppVarI.y() + "] : " + java.lang.String.valueOf(dppVarI), dptVar);
    }

    public final void e(int i) {
        this.b = ((this.b * 1009) + i) % 1000000007;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.dou) {
            return defpackage.afga.f(this.a, ((defpackage.dou) obj).a);
        }
        return false;
    }

    public final defpackage.dor f() {
        int i = this.d;
        this.d = i + 1;
        java.util.ArrayList arrayList = this.e;
        defpackage.dor dorVar = (defpackage.dor) defpackage.afga.aC(arrayList, i);
        if (dorVar != null) {
            return dorVar;
        }
        defpackage.dor dorVar2 = new defpackage.dor(java.lang.Integer.valueOf(this.d));
        arrayList.add(dorVar2);
        return dorVar2;
    }

    public final void g() {
        ((defpackage.dpo) this.a).a.clear();
        this.c = 1000;
        this.b = 0;
        this.d = 0;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final defpackage.dos i(defpackage.dpa[] dpaVarArr) {
        defpackage.dpa dpaVar = new defpackage.dpa(java.lang.Integer.valueOf(a()));
        defpackage.dpn dpnVar = new defpackage.dpn(new char[0]);
        int i = 0;
        while (true) {
            if (i >= dpaVarArr.length) {
                break;
            }
            dpnVar.q(defpackage.dpv.a(dpaVarArr[i].a().toString()));
            i++;
        }
        defpackage.dpt dptVarD = d(dpaVar);
        dptVarD.t(com.google.android.sidekick.shared.remoteapi.RemoteApiConstants.BROADCAST_INTENT_TYPE_EXTRA, "barrier");
        dptVarD.t("direction", "bottom");
        dptVarD.s("margin", com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
        dptVarD.r("contains", dpnVar);
        e(15);
        for (defpackage.dpa dpaVar2 : dpaVarArr) {
            e(dpaVar2.hashCode());
        }
        e(0);
        return new defpackage.dos(dpaVar.h, 0, dpaVar);
    }

    public final defpackage.dot j(defpackage.dpa[] dpaVarArr) {
        defpackage.dpa dpaVar = new defpackage.dpa(java.lang.Integer.valueOf(a()));
        defpackage.dpn dpnVar = new defpackage.dpn(new char[0]);
        int i = 0;
        while (true) {
            if (i >= dpaVarArr.length) {
                break;
            }
            dpnVar.q(defpackage.dpv.a(dpaVarArr[i].a().toString()));
            i++;
        }
        defpackage.dpt dptVarD = d(dpaVar);
        dptVarD.t(com.google.android.sidekick.shared.remoteapi.RemoteApiConstants.BROADCAST_INTENT_TYPE_EXTRA, "barrier");
        dptVarD.t("direction", "end");
        dptVarD.s("margin", com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
        dptVarD.r("contains", dpnVar);
        e(13);
        for (defpackage.dpa dpaVar2 : dpaVarArr) {
            e(dpaVar2.hashCode());
        }
        e(0);
        return new defpackage.dot(dpaVar.h, 0, dpaVar);
    }

    public final defpackage.dot k(defpackage.dpa[] dpaVarArr) throws defpackage.dpu {
        defpackage.dpa dpaVar = new defpackage.dpa(java.lang.Integer.valueOf(a()));
        defpackage.dpn dpnVar = new defpackage.dpn(new char[0]);
        int i = 0;
        while (true) {
            if (i >= dpaVarArr.length) {
                break;
            }
            dpnVar.q(defpackage.dpv.a(dpaVarArr[i].a().toString()));
            i++;
        }
        defpackage.dpt dptVarD = d(dpaVar);
        dptVarD.t(com.google.android.sidekick.shared.remoteapi.RemoteApiConstants.BROADCAST_INTENT_TYPE_EXTRA, "barrier");
        dptVarD.t("direction", "start");
        dptVarD.s("margin", com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
        dptVarD.r("contains", dpnVar);
        e(10);
        for (defpackage.dpa dpaVar2 : dpaVarArr) {
            e(dpaVar2.hashCode());
        }
        e(0);
        return new defpackage.dot(dpaVar.h, 0, dpaVar);
    }

    public final defpackage.ajnd l() {
        defpackage.ajnd ajndVar = this.f;
        if (ajndVar != null) {
            return ajndVar;
        }
        defpackage.ajnd ajndVar2 = new defpackage.ajnd(this, null);
        this.f = ajndVar2;
        return ajndVar2;
    }

    public dou() {
        this((byte[]) null);
    }

    public dou(char[] cArr) {
        this((byte[]) null);
        this.d = 0;
        this.e = new java.util.ArrayList();
    }
}
