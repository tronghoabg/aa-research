package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
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
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                this.g = ((java.lang.Integer) obj).intValue();
                return;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                this.e = (java.lang.String) obj;
                return;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                this.f = ((java.lang.Boolean) obj).booleanValue();
                return;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
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
