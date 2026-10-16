package defpackage;

import android.content.ComponentName;
import java.util.List;

/* loaded from: classes2.dex */
public final class grf implements gmw {
    public final fzg a;
    public final ComponentName b;
    public final boolean c;
    public final boolean d;
    private final List e;

    public grf(List list, fzg fzgVar, ComponentName componentName, boolean z, boolean z2) {
        this.e = list;
        this.a = fzgVar;
        this.b = componentName;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof grf)) {
            return false;
        }
        grf grfVar = (grf) obj;
        return affa.f(this.e, grfVar.e) && affa.f(this.a, grfVar.a) && affa.f(this.b, grfVar.b) && this.c == grfVar.c && this.d == grfVar.d;
    }

    public final int hashCode() {
        int iHashCode = this.e.hashCode() * 31;
        fzg fzgVar = this.a;
        int iHashCode2 = (iHashCode + (fzgVar == null ? 0 : fzgVar.hashCode())) * 31;
        ComponentName componentName = this.b;
        return ((((iHashCode2 + (componentName != null ? componentName.hashCode() : 0)) * 31) + a.f(this.c)) * 31) + a.f(this.d);
    }

    public final String toString() {
        return "MediaPlaybackTemplateInternal(actionStrip=" + this.e + ", header=" + this.a + ", overrideComponent=" + this.b + ", isRadio=" + this.c + ", hasInternalAttributionIcon=" + this.d + ")";
    }
}
