package defpackage;

import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public final class fsu extends fsz {
    public final Drawable a = null;
    public final fsy b;
    public final Throwable c;

    public fsu(fsy fsyVar, Throwable th) {
        this.b = fsyVar;
        this.c = th;
    }

    @Override // defpackage.fsz
    public final Drawable a() {
        return null;
    }

    @Override // defpackage.fsz
    public final fsy b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fsu)) {
            return false;
        }
        fsu fsuVar = (fsu) obj;
        Drawable drawable = fsuVar.a;
        return affa.f(null, null) && affa.f(this.b, fsuVar.b) && affa.f(this.c, fsuVar.c);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.c.hashCode();
    }
}
