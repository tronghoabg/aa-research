package defpackage;

import android.content.ComponentName;

/* loaded from: classes2.dex */
public final class loz {
    public final ComponentName a;
    public final boolean b;
    public final llu c;

    public loz(ComponentName componentName, llu lluVar, boolean z) {
        this.a = componentName;
        this.c = lluVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof loz)) {
            return false;
        }
        loz lozVar = (loz) obj;
        return affa.f(this.a, lozVar.a) && affa.f(this.c, lozVar.c) && this.b == lozVar.b;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.c.hashCode()) * 31) + a.f(this.b);
    }

    public final String toString() {
        return "MediaSessionIdentifier(app=" + this.a + ", sessionToken=" + this.c + ", playbackOnly=" + this.b + ")";
    }
}
