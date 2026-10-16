package F4;

import Y4.m;
import android.graphics.Bitmap;

/* loaded from: classes.dex */
public final class j implements h {

    /* renamed from: a, reason: collision with root package name */
    public final e f3862a;

    /* renamed from: b, reason: collision with root package name */
    public int f3863b;

    /* renamed from: c, reason: collision with root package name */
    public Bitmap.Config f3864c;

    public j(e eVar) {
        this.f3862a = eVar;
    }

    @Override // F4.h
    public final void a() {
        this.f3862a.M(this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f3863b == jVar.f3863b && m.a(this.f3864c, jVar.f3864c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i5 = this.f3863b * 31;
        Bitmap.Config config = this.f3864c;
        return i5 + (config != null ? config.hashCode() : 0);
    }

    public final String toString() {
        return k.c(this.f3863b, this.f3864c);
    }
}
