package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bva extends java.lang.RuntimeException {
    public final defpackage.aan a;
    public final defpackage.aan b;
    public final defpackage.zm c;
    public final int d;

    public bva(defpackage.aan aanVar, defpackage.aan aanVar2, defpackage.zm zmVar, int i, java.lang.Throwable th) {
        super(th);
        this.a = aanVar;
        this.b = aanVar2;
        this.c = zmVar;
        this.d = i;
    }

    @Override // java.lang.Throwable
    public final java.lang.String getMessage() throws java.io.IOException {
        return afzh.Q("\n            |Failed to execute op number " + this.d + ":\n            |" + defpackage.afga.bo(defpackage.afga.aY(afsg.j(new defpackage.afcb(new defpackage.buz(this, null), 3)), 50), "\n", null, null, null, 62) + "\n            ");
    }
}
