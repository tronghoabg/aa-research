package defpackage;

/* loaded from: classes.dex */
public final class bcq implements bcn {
    private final float a;

    public bcq(float f) {
        this.a = f;
    }

    @Override // defpackage.bcn
    public final float a(long j, dlg dlgVar) {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bcq) && Float.compare(this.a, ((bcq) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.a + ".px)";
    }
}
