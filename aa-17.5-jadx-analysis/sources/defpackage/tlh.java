package defpackage;

import android.graphics.drawable.Drawable;

/* loaded from: classes3.dex */
public final class tlh {
    public final String a;
    public final tll b;
    public final String c;
    public final Drawable d;

    public tlh(String str, tll tllVar, String str2, Drawable drawable) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = tllVar;
        this.c = str2;
        this.d = drawable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!affa.f(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        tlh tlhVar = (tlh) obj;
        return affa.f(this.a, tlhVar.a) && affa.f(this.b, tlhVar.b) && affa.f(this.c, tlhVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "RemoteAppDescription(id=" + this.a + ", key=" + this.b + ", label=" + this.c + ", icon=" + this.d + ")";
    }
}
