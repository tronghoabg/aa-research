package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
final class aiv {
    private final Context a;
    private final dlg b;
    private final avp c;

    public aiv(Context context, dlg dlgVar, avp avpVar) {
        this.a = context;
        this.b = dlgVar;
        this.c = avpVar;
    }

    public final aiu a() {
        return new aiu(this.a, this.b, this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!affa.f(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        aiv aivVar = (aiv) obj;
        return affa.f(this.a, aivVar.a) && affa.f(this.b, aivVar.b) && affa.f(this.c, aivVar.c);
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) - 10066330) * 31) + this.c.hashCode();
    }
}
