package defpackage;

/* loaded from: classes2.dex */
public final class aitn {
    public final Object a;
    public final aite b;
    public final afeh c;
    public final Object d = null;
    public final Throwable e;

    public aitn(Object obj, aite aiteVar, afeh afehVar, Throwable th) {
        this.a = obj;
        this.b = aiteVar;
        this.c = afehVar;
        this.e = th;
    }

    public static /* synthetic */ aitn b(aitn aitnVar, aite aiteVar, Throwable th, int i) {
        Object obj = (i & 1) != 0 ? aitnVar.a : null;
        if ((i & 2) != 0) {
            aiteVar = aitnVar.b;
        }
        afeh afehVar = (i & 4) != 0 ? aitnVar.c : null;
        if ((i & 8) != 0) {
            Object obj2 = aitnVar.d;
        }
        if ((i & 16) != 0) {
            th = aitnVar.e;
        }
        return new aitn(obj, aiteVar, afehVar, th);
    }

    public final boolean a() {
        return this.e != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aitn)) {
            return false;
        }
        aitn aitnVar = (aitn) obj;
        if (!affa.f(this.a, aitnVar.a) || !affa.f(this.b, aitnVar.b) || !affa.f(this.c, aitnVar.c)) {
            return false;
        }
        Object obj2 = aitnVar.d;
        return affa.f(null, null) && affa.f(this.e, aitnVar.e);
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        aite aiteVar = this.b;
        int iHashCode2 = aiteVar == null ? 0 : aiteVar.hashCode();
        int i = iHashCode * 31;
        afeh afehVar = this.c;
        int iHashCode3 = afehVar == null ? 0 : afehVar.hashCode();
        int i2 = (i + iHashCode2) * 31;
        Throwable th = this.e;
        return ((i2 + iHashCode3) * 961) + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.a + ", cancelHandler=" + this.b + ", onCancellation=" + this.c + ", idempotentResume=null, cancelCause=" + this.e + ")";
    }
}
