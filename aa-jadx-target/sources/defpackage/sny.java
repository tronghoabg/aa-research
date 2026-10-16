package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class sny {
    public defpackage.snv a;
    public com.google.android.gms.common.Feature[] b;
    private boolean d = false;
    private boolean e = false;
    public int c = 0;

    public final defpackage.snz a() {
        defpackage.sqs.ar(this.a != null, "execute parameter required");
        if (!this.e) {
            com.google.android.gms.common.Feature[] featureArr = this.b;
            this.d = featureArr != null && featureArr[0].c;
        }
        return new defpackage.snz(this, this.b, this.d, this.c);
    }

    public final void b() {
        this.e = true;
        this.d = false;
    }
}
