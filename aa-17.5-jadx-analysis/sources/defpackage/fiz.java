package defpackage;

import android.net.Uri;

/* loaded from: classes2.dex */
public final class fiz {
    public final Uri a;
    public final boolean b;

    public fiz(Uri uri, boolean z) {
        this.a = uri;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!affa.f(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        fiz fizVar = (fiz) obj;
        return affa.f(this.a, fizVar.a) && this.b == fizVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + a.f(this.b);
    }
}
