package defpackage;

/* loaded from: classes3.dex */
public class yva {
    public final Object a;

    public yva(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !affa.f(getClass(), obj.getClass())) {
            return false;
        }
        return affa.f(this.a, ((yva) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
