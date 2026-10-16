package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class syx {
    public boolean a = false;
    public boolean b = false;

    public final void a(android.content.Context context) {
        if (this.b) {
            defpackage.sza.a(context);
            defpackage.sza.b();
        } else if (this.a) {
            defpackage.sza.b();
        }
    }

    public final boolean b() {
        return this.a || this.b;
    }
}
