package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class hmx implements hju {
    public final String a;
    public final List b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final afec f;
    public final afdr g;
    public final afdr h;
    public final afdr i;

    public hmx(String str, List list, boolean z, boolean z2, boolean z3, afec afecVar, afdr afdrVar, afdr afdrVar2, afdr afdrVar3) {
        this.a = str;
        this.b = list;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = afecVar;
        this.g = afdrVar;
        this.h = afdrVar2;
        this.i = afdrVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hmx)) {
            return false;
        }
        hmx hmxVar = (hmx) obj;
        return affa.f(this.a, hmxVar.a) && affa.f(this.b, hmxVar.b) && this.c == hmxVar.c && this.d == hmxVar.d && this.e == hmxVar.e && affa.f(this.f, hmxVar.f) && affa.f(this.g, hmxVar.g) && affa.f(this.h, hmxVar.h) && affa.f(this.i, hmxVar.i);
    }

    public final int hashCode() {
        String str = this.a;
        return ((((((((((((((((str == null ? 0 : str.hashCode()) * 31) + this.b.hashCode()) * 31) + a.f(this.c)) * 31) + a.f(this.d)) * 31) + a.f(this.e)) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode();
    }

    public final String toString() {
        return "WebViewUiModel(url=" + this.a + ", headerStartActions=" + this.b + ", isDomStorageEnabled=" + this.c + ", shouldBlockNetworkLoads=" + this.d + ", isJavascriptEnabled=" + this.e + ", onUrlLoadingOverridden=" + this.f + ", onLoadError=" + this.g + ", onRequestAudioFocus=" + this.h + ", onReleaseAudioFocus=" + this.i + ")";
    }
}
