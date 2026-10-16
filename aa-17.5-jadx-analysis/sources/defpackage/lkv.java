package defpackage;

import android.net.Uri;

/* loaded from: classes2.dex */
public final class lkv {
    public final boolean a;
    public final Object b;

    public lkv(boolean z, Object obj) {
        this.a = z;
        this.b = obj;
    }

    public final Uri a() {
        Uri uriBuild = new Uri.Builder().appendPath(String.valueOf(this.a)).appendPath(String.valueOf(this.b)).build();
        uriBuild.getClass();
        return uriBuild;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lkv)) {
            return false;
        }
        lkv lkvVar = (lkv) obj;
        return this.a == lkvVar.a && affa.f(this.b, lkvVar.b);
    }

    public final int hashCode() {
        Object obj = this.b;
        return (a.f(this.a) * 31) + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "CategoryKey(isCategoryItem=" + this.a + ", delegateKey=" + this.b + ")";
    }
}
