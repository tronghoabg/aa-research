package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class drs {
    public final boolean a;
    final java.lang.String b;
    public int c;
    public float d;
    public java.lang.String e;
    boolean f;
    public int g;
    public final int h;

    public drs(defpackage.drs drsVar, java.lang.Object obj) {
        this.a = false;
        this.b = drsVar.b;
        this.h = drsVar.h;
        a(obj);
    }

    public final void a(java.lang.Object obj) {
        int i = this.h;
        if (i == 0) {
            throw null;
        }
        switch (i - 1) {
            case 1:
                this.d = ((java.lang.Float) obj).floatValue();
                return;
            case 2:
            case 3:
                this.g = ((java.lang.Integer) obj).intValue();
                return;
            case 4:
                this.e = (java.lang.String) obj;
                return;
            case 5:
                this.f = ((java.lang.Boolean) obj).booleanValue();
                return;
            case 6:
                this.d = ((java.lang.Float) obj).floatValue();
                return;
            default:
                this.c = ((java.lang.Integer) obj).intValue();
                return;
        }
    }

    public drs(java.lang.String str, int i, java.lang.Object obj, boolean z) {
        this.b = str;
        this.h = i;
        this.a = z;
        a(obj);
    }
}
