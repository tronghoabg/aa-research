package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zyz extends defpackage.ztq {
    public defpackage.zyy b;
    private final com.google.android.libraries.maps.model.LatLng c;
    private final float d;
    private defpackage.zzx[] e = null;

    public zyz(com.google.android.libraries.maps.model.LatLng latLng, float f) {
        this.c = latLng;
        this.d = f;
    }

    private static int m(double d) {
        return (int) java.lang.Math.round(d * 1000000.0d);
    }

    private static defpackage.aciv n(com.google.android.libraries.maps.model.LatLng latLng) {
        defpackage.abor aborVarN = defpackage.aciv.a.n();
        int iM = m(latLng.latitude);
        aborVarN.t();
        defpackage.aciv acivVar = (defpackage.aciv) aborVarN.b;
        acivVar.b |= 1;
        acivVar.c = iM;
        int iM2 = m(latLng.longitude);
        aborVarN.t();
        defpackage.aciv acivVar2 = (defpackage.aciv) aborVarN.b;
        acivVar2.b |= 2;
        acivVar2.d = iM2;
        return (defpackage.aciv) aborVarN.q();
    }

    @Override // defpackage.ztq, defpackage.ztv
    public final void a() {
        g("onComplete");
        defpackage.zyy zyyVar = this.b;
        if (zyyVar != null) {
            zyyVar.a(this);
        }
    }

    @Override // defpackage.ztv
    public final int h() {
        return 50;
    }

    @Override // defpackage.ztv
    public final void i(java.io.DataOutputStream dataOutputStream) throws java.io.IOException {
        defpackage.abor aborVarN = defpackage.acge.a.n();
        defpackage.abor aborVarN2 = defpackage.acit.a.n();
        aborVarN2.t();
        defpackage.acit acitVar = (defpackage.acit) aborVarN2.b;
        acitVar.c = 1;
        acitVar.b |= 1;
        com.google.android.libraries.maps.model.LatLng latLng = this.c;
        defpackage.aciv acivVarN = n(latLng);
        aborVarN2.t();
        defpackage.acit acitVar2 = (defpackage.acit) aborVarN2.b;
        acivVarN.getClass();
        acitVar2.d = acivVarN;
        acitVar2.b |= 2;
        defpackage.acit acitVar3 = (defpackage.acit) aborVarN2.q();
        aborVarN.t();
        defpackage.acge acgeVar = (defpackage.acge) aborVarN.b;
        acitVar3.getClass();
        acgeVar.c = acitVar3;
        acgeVar.b |= 1;
        defpackage.abor aborVarN3 = defpackage.aciu.a.n();
        defpackage.aciv acivVarN2 = n(latLng);
        aborVarN3.t();
        defpackage.aciu aciuVar = (defpackage.aciu) aborVarN3.b;
        acivVarN2.getClass();
        aciuVar.c = acivVarN2;
        aciuVar.b |= 1;
        int iM = m(1.0E-6d);
        aborVarN3.t();
        defpackage.aciu aciuVar2 = (defpackage.aciu) aborVarN3.b;
        aciuVar2.b |= 2;
        aciuVar2.d = iM;
        int iM2 = m(1.0E-6d);
        aborVarN3.t();
        defpackage.aciu aciuVar3 = (defpackage.aciu) aborVarN3.b;
        aciuVar3.b |= 4;
        aciuVar3.e = iM2;
        float f = this.d;
        if (f > com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
            aborVarN3.t();
            defpackage.aciu aciuVar4 = (defpackage.aciu) aborVarN3.b;
            aciuVar4.b |= 8;
            aciuVar4.f = (int) f;
        }
        defpackage.aciu aciuVar5 = (defpackage.aciu) aborVarN3.q();
        aborVarN.t();
        defpackage.acge acgeVar2 = (defpackage.acge) aborVarN.b;
        aciuVar5.getClass();
        acgeVar2.d = aciuVar5;
        acgeVar2.b |= 4;
        aborVarN.t();
        defpackage.acge acgeVar3 = (defpackage.acge) aborVarN.b;
        acgeVar3.b |= 8;
        acgeVar3.e = true;
        defpackage.zst.b(dataOutputStream, (defpackage.acge) aborVarN.q());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ztv
    public final void j(java.io.DataInputStream dataInputStream) throws java.io.IOException {
        defpackage.acgf acgfVar = defpackage.acgf.a;
        defpackage.acgf acgfVar2 = (defpackage.acgf) defpackage.zst.a(defpackage.abox.L(defpackage.acgf.class), dataInputStream);
        int iAx = defpackage.a.ax(acgfVar2.b);
        if (iAx == 0 || iAx == 1) {
            this.e = new defpackage.zzx[acgfVar2.c.size()];
            int i = 0;
            for (defpackage.acgg acggVar : acgfVar2.c) {
                java.lang.String str = acggVar.b.size() > 0 ? (java.lang.String) acggVar.b.get(0) : "";
                if (acggVar.b.size() > 1) {
                    str = (java.lang.String) acggVar.b.get(1);
                }
                this.e[i] = new defpackage.zzx(str);
                i++;
            }
        }
    }

    public final int k() {
        defpackage.zzx[] zzxVarArr = this.e;
        if (zzxVarArr != null) {
            return zzxVarArr.length;
        }
        return 0;
    }

    public final defpackage.zzx l() {
        defpackage.zzx[] zzxVarArr = this.e;
        if (zzxVarArr.length <= 0) {
            return null;
        }
        return zzxVarArr[0];
    }
}
