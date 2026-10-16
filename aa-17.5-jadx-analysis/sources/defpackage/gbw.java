package defpackage;

/* loaded from: classes2.dex */
public final class gbw implements gmo {
    public final uo a;
    public final boolean b;
    public final boolean c;

    public gbw(uo uoVar, boolean z, boolean z2) {
        this.a = uoVar;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gbw)) {
            return false;
        }
        gbw gbwVar = (gbw) obj;
        return affa.f(this.a, gbwVar.a) && this.b == gbwVar.b && this.c == gbwVar.c;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + a.f(this.b)) * 31) + a.f(this.c);
    }

    public final String toString() {
        return "ToggleInternal(onCheckedChangedDelegate=" + this.a + ", isChecked=" + this.b + ", isEnabled=" + this.c + ")";
    }
}
