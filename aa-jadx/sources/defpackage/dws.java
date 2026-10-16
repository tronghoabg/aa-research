package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class dws {
    public final int a;
    public final int b;
    public final boolean c;
    public final java.lang.String d;
    public final int e;
    public final java.lang.Object f;

    public dws(java.lang.String str, java.lang.String str2) {
        this.f = new android.net.Uri.Builder().scheme("systemfont").authority(str).build();
        this.a = 0;
        this.b = 400;
        this.c = false;
        this.d = str2;
        this.e = 0;
    }

    public final boolean a() {
        return j$.util.Objects.equals(((android.net.Uri) this.f).getScheme(), "systemfont");
    }

    public dws(android.net.Uri uri, int i, int i2, boolean z, java.lang.String str, int i3) {
        defpackage.ebl.q(uri);
        this.f = uri;
        this.a = i;
        this.b = i2;
        this.c = z;
        this.d = str;
        this.e = i3;
    }

    public dws(java.lang.String str, int i, boolean z, java.lang.String str2, int i2, int i3) {
        this.f = str;
        this.b = i;
        this.c = z;
        this.d = str2;
        this.a = i2;
        this.e = i3;
    }
}
