package defpackage;

/* loaded from: classes3.dex */
public final class thl {
    public final String a;
    public final wb b;

    public thl(String str, wb wbVar) {
        this.a = str;
        this.b = wbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof thl)) {
            return false;
        }
        thl thlVar = (thl) obj;
        return affa.f(this.a, thlVar.a) && affa.f(this.b, thlVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "ActiveContentTemplate(activeTabContentId=" + this.a + ", activeTabContentTemplate=" + this.b + ")";
    }
}
