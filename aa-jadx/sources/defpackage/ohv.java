package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ohv {
    public final java.lang.Object a;
    public final java.lang.Object b;
    public final java.lang.Object c;

    public ohv() {
        this.a = "g";
        this.b = "h";
        this.c = "i";
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Map] */
    public final void a(final boolean z) {
        defpackage.yqm yqmVar = defpackage.oib.b;
        ((defpackage.yqj) yqmVar.f()).u("onVoipCallSilenceStateChanged");
        ?? r1 = this.b;
        java.lang.Object obj = this.a;
        defpackage.ohz ohzVar = (defpackage.ohz) r1.get(obj);
        if (ohzVar == null) {
            ((defpackage.yqj) yqmVar.h()).y("No entry in call silence map for call %s", obj);
            return;
        }
        ohzVar.a();
        ohzVar.c = z;
        ((defpackage.ajnd) this.c).o(new defpackage.ohr() { // from class: ohu
            @Override // defpackage.ohr
            public final void a(defpackage.ajnd ajndVar) {
                defpackage.ohj ohjVar = (defpackage.ohj) ajndVar.a;
                defpackage.ogw ogwVar = ohjVar.b;
                ogwVar.getClass();
                android.telecom.Call call = (android.telecom.Call) this.a.a;
                final com.google.android.apps.auto.components.telecom.call.CarCall carCallC = ogwVar.c(call);
                carCallC.getClass();
                ((defpackage.yqj) ((defpackage.yqj) defpackage.ohj.a.f()).ai(5912)).w("onVoipCallSilenceStateChanged for call: %s", carCallC.a);
                call.registerCallback(ohjVar.c);
                final boolean z2 = z;
                ohjVar.a(new defpackage.ohi() { // from class: ohg
                    @Override // defpackage.ohi
                    public final void a(defpackage.ohm ohmVar) throws android.os.RemoteException {
                        ohmVar.s(carCallC, z2);
                    }
                });
            }
        });
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, qdz] */
    public final void b(java.lang.Throwable th) {
        android.os.Bundle bundle = new android.os.Bundle(com.google.android.enterprise.connectedapps.internal.Bundler.class.getClassLoader());
        bundle.putSerializable("throwable", th);
        try {
            new defpackage.qen(this.a).makeBundleCall(bundle);
        } catch (defpackage.qei unused) {
            android.util.Log.e("FutureResult", "Connection was dropped before response");
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [afak, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [afak, java.lang.Object] */
    public final /* synthetic */ defpackage.qsv c(defpackage.qct qctVar) {
        defpackage.tmy tmyVar = (defpackage.tmy) this.b.a();
        tmyVar.getClass();
        defpackage.zhw zhwVarB = ((defpackage.uyr) this.a).b();
        defpackage.pmi pmiVar = (defpackage.pmi) this.c.a();
        pmiVar.getClass();
        qctVar.getClass();
        return new defpackage.qsv(tmyVar, zhwVarB, pmiVar, qctVar);
    }

    public ohv(byte[] bArr) {
        this.b = "b";
        this.c = "c";
        this.a = "d";
    }

    public ohv(byte[] bArr, byte[] bArr2) {
        this.a = "e";
        this.c = "f";
        this.b = "g";
    }

    public ohv(char[] cArr) {
        this.a = "g";
        this.c = "h";
        this.b = "i";
    }

    public ohv(defpackage.ajnd ajndVar, android.telecom.Call call, java.util.Map map) {
        ajndVar.getClass();
        map.getClass();
        this.c = ajndVar;
        this.a = call;
        this.b = map;
    }

    public ohv(defpackage.afak afakVar, defpackage.afak afakVar2, defpackage.afak afakVar3) {
        afakVar.getClass();
        this.b = afakVar;
        afakVar2.getClass();
        this.a = afakVar2;
        this.c = afakVar3;
    }

    public ohv(defpackage.qdz qdzVar, com.google.android.enterprise.connectedapps.internal.Bundler bundler, com.google.android.enterprise.connectedapps.internal.BundlerType bundlerType) {
        qdzVar.getClass();
        this.a = qdzVar;
        this.c = bundler;
        this.b = bundlerType;
    }
}
