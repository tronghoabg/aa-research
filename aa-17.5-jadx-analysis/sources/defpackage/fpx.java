package defpackage;

/* loaded from: classes2.dex */
public final class fpx extends fpz {
    private final cmw a;

    public fpx(cmw cmwVar) {
        this.a = cmwVar;
    }

    @Override // defpackage.fpz
    public final cmw a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fpx) && affa.f(this.a, ((fpx) obj).a);
    }

    public final int hashCode() {
        cmw cmwVar = this.a;
        if (cmwVar == null) {
            return 0;
        }
        return cmwVar.hashCode();
    }

    public final String toString() {
        return "Loading(painter=" + this.a + ")";
    }
}
