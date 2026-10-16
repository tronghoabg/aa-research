package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@defpackage.afeo
public final class ted {
    private final float a;

    public static final int a(float f, int i) {
        return java.lang.Float.compare(f, i);
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.ted) && java.lang.Float.compare(this.a, ((defpackage.ted) obj).a) == 0;
    }

    public final int hashCode() {
        return java.lang.Float.floatToIntBits(this.a);
    }

    public final java.lang.String toString() {
        return this.a + "px";
    }
}
