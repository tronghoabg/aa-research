package defpackage;

/* loaded from: classes2.dex */
public final class mra {
    public final mqz a;
    public final boolean b;

    public mra(mqz mqzVar, boolean z) {
        mqzVar.getClass();
        this.a = mqzVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mra)) {
            return false;
        }
        mra mraVar = (mra) obj;
        return affa.f(this.a, mraVar.a) && this.b == mraVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + a.f(this.b);
    }

    public final String toString() {
        return "AppLauncherItemWithStatus(appLauncherItem=" + this.a + ", hasNotification=" + this.b + ")";
    }
}
