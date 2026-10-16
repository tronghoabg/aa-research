package defpackage;

@afdo
/* loaded from: classes3.dex */
public final class xqo {
    private final String a;

    public /* synthetic */ xqo(String str) {
        this.a = str;
    }

    public static String a(String str) {
        return affa.f(str, "return 1;") ? "None" : affa.f(str, "return blurredSdfMask;") ? "Panel" : affa.f(str, "return smoothstep(100,-100,p.y)*saturate(calculatePulse()*2);") ? "Loader" : "Unknown";
    }

    public final boolean equals(Object obj) {
        return (obj instanceof xqo) && affa.f(this.a, ((xqo) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return a(this.a);
    }
}
