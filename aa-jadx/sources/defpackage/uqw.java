package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class uqw {
    public static final defpackage.ypg a = defpackage.ypg.c("com/google/android/libraries/geo/mapcore/internal/store/resource/model/Resource");
    public boolean b;
    public byte[] c;
    public long d;
    private final java.util.ArrayList e;
    private int f;
    private boolean g;
    private defpackage.uqt h;
    private long i;
    private final java.lang.Object j;

    public uqw(java.lang.Object obj) {
        this.j = obj;
        this.f = 0;
        this.e = new java.util.ArrayList();
        this.i = -1L;
    }

    private final synchronized void o() {
        this.f = 1;
        this.c = null;
        this.h = null;
    }

    public final synchronized int a() {
        return this.f;
    }

    public final synchronized long b() {
        return this.i;
    }

    public final android.graphics.Bitmap c() {
        defpackage.uqt uqtVar;
        if (this.f != 3 || (uqtVar = this.h) == null) {
            return null;
        }
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) uqtVar.b();
        if (bitmap == null) {
            o();
        }
        return bitmap;
    }

    public final android.graphics.Picture d() {
        defpackage.uqt uqtVar;
        if (this.f != 6 || (uqtVar = this.h) == null) {
            return null;
        }
        android.graphics.Picture picture = (android.graphics.Picture) uqtVar.b();
        if (picture == null) {
            o();
        }
        return picture;
    }

    public final synchronized void e(defpackage.uqu uquVar) {
        if (uquVar != null) {
            this.e.add(uquVar);
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.uqw) {
            return j$.util.Objects.equals(this.j, ((defpackage.uqw) obj).j);
        }
        return false;
    }

    public final synchronized void f() {
        java.util.ArrayList arrayList = this.e;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(arrayList);
        arrayList.clear();
        for (int i = 0; i < arrayList2.size(); i++) {
            ((defpackage.uqu) arrayList2.get(i)).a(this);
        }
    }

    public final synchronized void g(boolean z) {
        this.g = z;
    }

    public final synchronized void h(android.graphics.Rect rect) {
        new android.graphics.Rect(rect);
    }

    public final int hashCode() {
        return this.j.hashCode();
    }

    public final synchronized void i(android.graphics.Bitmap bitmap) {
        this.g = false;
        this.f = 3;
        this.h = new defpackage.uqs(bitmap);
    }

    public final synchronized void j(long j) {
        this.i = j;
    }

    public final synchronized void k(int i) {
        this.f = i;
    }

    public final synchronized boolean l() {
        int i = this.f;
        return (i == 0 || i == 1 || i == 2) ? false : true;
    }

    public final synchronized boolean m() {
        return this.g;
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final synchronized boolean n(defpackage.aciy aciyVar) {
        this.g = false;
        int i = aciyVar.d;
        if (i != 200) {
            if (i != 304) {
            }
            return false;
        }
        if ((aciyVar.b & 16) != 0) {
            java.lang.String lowerCase = aciyVar.g.toLowerCase(java.util.Locale.US);
            this.d = aciyVar.e;
            if (lowerCase.startsWith("image/svg")) {
                this.c = aciyVar.f.D();
                this.f = 6;
                this.h = new defpackage.uqv(this.c);
            } else if (lowerCase.startsWith("image/")) {
                this.c = aciyVar.f.D();
                this.f = 3;
                this.h = new defpackage.uqr(this.c);
            } else if (lowerCase.equals("application/binary") || lowerCase.equals("application/octet-stream") || lowerCase.equals("application/zip") || lowerCase.equals("application/vnd.google.octet-stream-compressible")) {
                this.c = aciyVar.f.D();
                this.f = 4;
            } else {
                if (!lowerCase.equals("text/html")) {
                    ((defpackage.ype) ((defpackage.ype) a.d()).ai((char) 9627)).y("Unhandled content-type: %s", lowerCase);
                    this.f = 1;
                    return false;
                }
                this.c = aciyVar.f.D();
                this.f = 5;
            }
            return true;
        }
        this.f = 1;
        return false;
    }

    public uqw() {
        this(new java.lang.Object());
    }
}
