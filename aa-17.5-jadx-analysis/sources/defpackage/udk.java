package defpackage;

/* loaded from: classes3.dex */
final class udk {
    public final int a;
    public final xxh b;

    public udk(int i, xxh xxhVar) {
        this.a = i;
        this.b = xxhVar;
    }

    public static udk a(int i, udo udoVar) {
        return new udk(i, xxh.h(udoVar));
    }

    public final String toString() {
        return "{renderId=" + this.a + ", placement=" + this.b.toString() + "}";
    }
}
