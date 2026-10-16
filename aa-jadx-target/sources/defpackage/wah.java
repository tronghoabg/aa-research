package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class wah implements defpackage.vzq {
    private final boolean a;
    private final boolean b;
    private final defpackage.pja c;

    public wah(android.content.ContentResolver contentResolver, boolean z, boolean z2) {
        this.c = new defpackage.pja(contentResolver, "primes." + android.os.Process.myPid() + "." + java.lang.System.currentTimeMillis());
        this.a = z;
        this.b = z2;
    }

    @Override // defpackage.vzq
    public final /* synthetic */ vzp a() {
        return vzp.a;
    }

    @Override // defpackage.vzq
    public final defpackage.zhs b(ajht ajhtVar) {
        java.lang.String str;
        ajhtVar.getClass();
        defpackage.aclu acluVar = new defpackage.aclu(ajhtVar);
        defpackage.yhx<defpackage.wag> yhxVarT = defpackage.yhx.t((defpackage.wag) defpackage.acls.c(new defpackage.vrx(acluVar, 0)).a(), (defpackage.wag) defpackage.acls.c(new defpackage.vrx(acluVar, 11)).a(), (defpackage.wag) defpackage.acls.c(new defpackage.vrx(acluVar, 12)).a(), (defpackage.wag) defpackage.acls.c(new defpackage.vrx(acluVar, 13)).a(), (defpackage.wag) defpackage.acls.c(new defpackage.vrx(acluVar, 15)).a(), (defpackage.wag) defpackage.acls.c(new defpackage.vrx(acluVar, 17)).a(), (defpackage.wag) defpackage.acls.c(new defpackage.vrx(acluVar, 18)).a(), (defpackage.wag) defpackage.acls.c(new defpackage.vrx(acluVar, 19)).a());
        java.lang.String strB = null;
        defpackage.npc npcVar = new defpackage.npc((byte[]) null);
        for (defpackage.wag wagVar : yhxVarT) {
            defpackage.npc npcVar2 = new defpackage.npc((byte[]) null);
            java.lang.String strB2 = wagVar.b();
            wagVar.a(new defpackage.rkq(npcVar2, strB2, this.a));
            if (!npcVar2.b()) {
                if (!android.text.TextUtils.isEmpty(strB2)) {
                    if (this.b) {
                        npcVar2.d("metadata:tag", "evt=".concat(java.lang.String.valueOf(strB2)));
                    }
                    npcVar2.d("CEN", strB2);
                }
                java.lang.Object obj = npcVar.a;
                defpackage.abpj abpjVar = npcVar2.a(-1L).d;
                defpackage.abor aborVar = (defpackage.abor) obj;
                aborVar.t();
                defpackage.acaq acaqVar = (defpackage.acaq) aborVar.b;
                acaqVar.b();
                defpackage.abnf.i(abpjVar, acaqVar.d);
            }
        }
        if (!npcVar.b()) {
            defpackage.pja pjaVar = this.c;
            if ((ajhtVar.b & 4194304) != 0) {
                ajhb ajhbVar = ajhtVar.z;
                if (ajhbVar == null) {
                    ajhbVar = ajhb.a;
                }
                if ((ajhbVar.b & 1) != 0) {
                    ajhb ajhbVar2 = ajhtVar.z;
                    if (ajhbVar2 == null) {
                        ajhbVar2 = ajhb.a;
                    }
                    str = ajhbVar2.c;
                } else {
                    str = null;
                }
                ajgd ajgdVar = ajhtVar.f;
                if (ajgdVar == null) {
                    ajgdVar = ajgd.a;
                }
                ajgw ajgwVar = ajgdVar.d;
                if (ajgwVar == null) {
                    ajgwVar = ajgw.a;
                }
                ajgv ajgvVar = ajgwVar.c;
                if (ajgvVar == null) {
                    ajgvVar = ajgv.a;
                }
                strB = (ajgvVar.b & 8) != 0 ? defpackage.vrn.b(str, ajgvVar.f) : null;
                if (strB == null) {
                    ajhb ajhbVar3 = ajhtVar.z;
                    if (((ajhbVar3 == null ? ajhb.a : ajhbVar3).b & 16) != 0) {
                        if (ajhbVar3 == null) {
                            ajhbVar3 = ajhb.a;
                        }
                        strB = ajhbVar3.g;
                    } else if (str != null) {
                        strB = str;
                    }
                }
            }
            if (strB != null) {
                npcVar.d("metadata:tag", "process=".concat(strB));
            }
            npcVar.d("metadata:tag", "sdk=" + android.os.Build.VERSION.SDK_INT);
            npcVar.d("metadata:tag", "model=".concat(java.lang.String.valueOf(android.os.Build.MODEL.replace(' ', '_'))));
            npcVar.d("metadata:tag", "source=Primes");
            long micros = java.util.concurrent.TimeUnit.MILLISECONDS.toMicros(java.lang.System.currentTimeMillis());
            java.lang.Long.valueOf(micros).getClass();
            pjaVar.a(npcVar, micros);
        }
        return defpackage.zho.a;
    }
}
