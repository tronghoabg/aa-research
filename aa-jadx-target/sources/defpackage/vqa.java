package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class vqa implements defpackage.aclt {
    private final defpackage.aclw a;
    private final defpackage.aclw b;
    private final defpackage.aclw c;
    private final defpackage.aclw d;
    private final /* synthetic */ int e;

    public vqa(defpackage.aclw aclwVar, defpackage.aclw aclwVar2, defpackage.aclw aclwVar3, defpackage.aclw aclwVar4, int i) {
        this.e = i;
        this.a = aclwVar;
        this.b = aclwVar2;
        this.c = aclwVar3;
        this.d = aclwVar4;
    }

    @Override // defpackage.afak, defpackage.afaj
    public final /* synthetic */ java.lang.Object a() {
        int i = this.e;
        if (i == 0) {
            return new defpackage.vpz(this.b, this.c, this.d);
        }
        if (i == 1) {
            java.util.concurrent.Executor executor = (!((defpackage.vmg) this.b.a()).c || ((defpackage.xyn) ((defpackage.aclu) this.d).b).f()) ? (java.util.concurrent.Executor) this.c.a() : (java.util.concurrent.Executor) this.a.a();
            executor.getClass();
            return executor;
        }
        if (i == 2) {
            return new defpackage.vra((defpackage.vsl) this.d.a(), (defpackage.vrl) this.c.a(), this.b, this.a);
        }
        java.lang.Object obj = ((defpackage.aclu) this.c).b;
        return new defpackage.vzg((java.util.Random) ((defpackage.xyn) obj).d((java.util.Random) this.d.a()), (defpackage.vyo) this.a.a(), (defpackage.zfw) this.b.a());
    }

    public vqa(defpackage.aclw aclwVar, defpackage.aclw aclwVar2, defpackage.aclw aclwVar3, defpackage.aclw aclwVar4, int i, byte[] bArr) {
        this.e = i;
        this.a = aclwVar;
        this.c = aclwVar2;
        this.b = aclwVar3;
        this.d = aclwVar4;
    }

    public vqa(defpackage.aclw aclwVar, defpackage.aclw aclwVar2, defpackage.aclw aclwVar3, defpackage.aclw aclwVar4, int i, char[] cArr) {
        this.e = i;
        this.d = aclwVar;
        this.c = aclwVar2;
        this.b = aclwVar3;
        this.a = aclwVar4;
    }

    public vqa(defpackage.aclw aclwVar, defpackage.aclw aclwVar2, defpackage.aclw aclwVar3, defpackage.aclw aclwVar4, int i, short[] sArr) {
        this.e = i;
        this.c = aclwVar;
        this.d = aclwVar2;
        this.a = aclwVar3;
        this.b = aclwVar4;
    }
}
