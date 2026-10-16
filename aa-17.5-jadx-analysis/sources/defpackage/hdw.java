package defpackage;

/* loaded from: classes2.dex */
public final class hdw extends hdy {
    public final aizz a;
    public final boolean b;

    public hdw() {
        this(ajac.a(false), true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hdw)) {
            return false;
        }
        hdw hdwVar = (hdw) obj;
        return affa.f(this.a, hdwVar.a) && this.b == hdwVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + a.f(this.b);
    }

    public final String toString() {
        return "RowTrailingSwitchUiModel(isChecked=" + this.a + ", isEnabled=" + this.b + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hdw(aizz aizzVar, boolean z) {
        super(false);
        aizzVar.getClass();
        this.a = aizzVar;
        this.b = z;
    }
}
