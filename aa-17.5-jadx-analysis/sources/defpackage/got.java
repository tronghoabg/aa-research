package defpackage;

/* loaded from: classes2.dex */
public final class got implements gmo {
    private final afec a;

    public got(afec afecVar) {
        this.a = afecVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof got) && affa.f(this.a, ((got) obj).a);
    }

    public final int hashCode() {
        afec afecVar = this.a;
        if (afecVar == null) {
            return 0;
        }
        return afecVar.hashCode();
    }

    public final String toString() {
        return "PanModeChangedInternal(onPanModeChanged=" + this.a + ")";
    }

    public got() {
        this(null);
    }
}
