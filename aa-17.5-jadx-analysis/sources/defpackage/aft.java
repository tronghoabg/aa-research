package defpackage;

/* loaded from: classes.dex */
public final class aft implements aew {
    public final float a;
    public final float b;
    public final Object c;

    public aft(float f, float f2, Object obj) {
        this.a = f;
        this.b = f2;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [afec, java.lang.Object] */
    @Override // defpackage.aew
    /* renamed from: b, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final aha c(bii biiVar) {
        Object obj = this.c;
        return new aha(this.a, this.b, obj == null ? null : (aei) biiVar.b.invoke(obj));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof aft)) {
            return false;
        }
        aft aftVar = (aft) obj;
        return aftVar.a == this.a && aftVar.b == this.b && affa.f(aftVar.c, this.c);
    }

    public final int hashCode() {
        Object obj = this.c;
        return ((((obj != null ? obj.hashCode() : 0) * 31) + Float.floatToIntBits(this.a)) * 31) + Float.floatToIntBits(this.b);
    }

    public aft() {
        this(1.0f, 1500.0f, null);
    }
}
