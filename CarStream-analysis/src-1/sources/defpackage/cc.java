package defpackage;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class cc implements Runnable {
    public final /* synthetic */ double a;
    public final /* synthetic */ double b;
    public final /* synthetic */ Double c;
    public final /* synthetic */ dc d;

    public cc(dc dcVar, double d, double d2, Double d3) {
        this.d = dcVar;
        this.a = d;
        this.b = d2;
        this.c = d3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yb ybVarA;
        try {
            ybVarA = this.d.b.a(this.a, this.b, this.c);
        } catch (Throwable th) {
            String.valueOf(th);
            ybVarA = null;
        }
        this.d.e = false;
        if (dc.k) {
            this.d.d.post(new r9(this, ybVarA, this.c != null));
        }
    }
}
