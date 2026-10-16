package defpackage;

import android.graphics.Bitmap;
import android.graphics.Picture;
import android.graphics.Rect;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class upy {
    public static final yob a = yob.c("com/google/android/libraries/geo/mapcore/internal/store/resource/model/Resource");
    public boolean b;
    public byte[] c;
    public long d;
    private final ArrayList e;
    private int f;
    private boolean g;
    private upv h;
    private long i;
    private final Object j;

    public upy(Object obj) {
        this.j = obj;
        this.f = 0;
        this.e = new ArrayList();
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

    public final Bitmap c() {
        upv upvVar;
        if (this.f != 3 || (upvVar = this.h) == null) {
            return null;
        }
        Bitmap bitmap = (Bitmap) upvVar.b();
        if (bitmap == null) {
            o();
        }
        return bitmap;
    }

    public final Picture d() {
        upv upvVar;
        if (this.f != 6 || (upvVar = this.h) == null) {
            return null;
        }
        Picture picture = (Picture) upvVar.b();
        if (picture == null) {
            o();
        }
        return picture;
    }

    public final synchronized void e(upw upwVar) {
        if (upwVar != null) {
            this.e.add(upwVar);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof upy) {
            return Objects.equals(this.j, ((upy) obj).j);
        }
        return false;
    }

    public final synchronized void f() {
        ArrayList arrayList = this.e;
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        for (int i = 0; i < arrayList2.size(); i++) {
            ((upw) arrayList2.get(i)).a(this);
        }
    }

    public final synchronized void g(boolean z) {
        this.g = z;
    }

    public final synchronized void h(Rect rect) {
        new Rect(rect);
    }

    public final int hashCode() {
        return this.j.hashCode();
    }

    public final synchronized void i(Bitmap bitmap) {
        this.g = false;
        this.f = 3;
        this.h = new upu(bitmap);
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

    @ResultIgnorabilityUnspecified
    public final synchronized boolean n(achw achwVar) {
        this.g = false;
        int i = achwVar.d;
        if (i != 200) {
            if (i != 304) {
            }
            return false;
        }
        if ((achwVar.b & 16) != 0) {
            String lowerCase = achwVar.g.toLowerCase(Locale.US);
            this.d = achwVar.e;
            if (lowerCase.startsWith("image/svg")) {
                this.c = achwVar.f.D();
                this.f = 6;
                this.h = new upx(this.c);
            } else if (lowerCase.startsWith("image/")) {
                this.c = achwVar.f.D();
                this.f = 3;
                this.h = new upt(this.c);
            } else if (lowerCase.equals("application/binary") || lowerCase.equals("application/octet-stream") || lowerCase.equals("application/zip") || lowerCase.equals("application/vnd.google.octet-stream-compressible")) {
                this.c = achwVar.f.D();
                this.f = 4;
            } else {
                if (!lowerCase.equals("text/html")) {
                    ((ynz) ((ynz) a.d()).ai((char) 9600)).y("Unhandled content-type: %s", lowerCase);
                    this.f = 1;
                    return false;
                }
                this.c = achwVar.f.D();
                this.f = 5;
            }
            return true;
        }
        this.f = 1;
        return false;
    }

    public upy() {
        this(new Object());
    }
}
