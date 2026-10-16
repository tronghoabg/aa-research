package defpackage;

/* loaded from: classes.dex */
public final class afc implements aec {
    private final aer a;
    private final long b = 0;
    private final int c;

    public afc(aer aerVar, int i) {
        this.a = aerVar;
        this.c = i;
        if (aerVar instanceof agl) {
            agl aglVar = (agl) aerVar;
            if (aglVar.a != 0 || aglVar.b != 0) {
                return;
            }
        } else if (aerVar instanceof afr) {
            if (((afr) aerVar).a != 0) {
                return;
            }
        } else {
            if (!(aerVar instanceof afk)) {
                if (aerVar instanceof afl) {
                    throw null;
                }
                if (aerVar instanceof aek) {
                    throw null;
                }
                return;
            }
            if (((afk) aerVar).a.a != 0) {
                return;
            }
        }
        throw new IllegalArgumentException("Animation to be infinitely repeated cannot have a 0-duration");
    }

    @Override // defpackage.aec
    /* renamed from: a */
    public final agn c(bii biiVar) {
        return new agv(this.a.c(biiVar), this.c);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof afc)) {
            return false;
        }
        afc afcVar = (afc) obj;
        if (!affa.f(afcVar.a, this.a) || afcVar.c != this.c) {
            return false;
        }
        long j = afcVar.b;
        return true;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        a.aW(this.c);
        return (iHashCode + 1) * 31;
    }
}
