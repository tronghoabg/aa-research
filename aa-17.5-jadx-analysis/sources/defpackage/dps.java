package defpackage;

/* loaded from: classes2.dex */
public final class dps implements dpr {
    final float a;
    float b;

    public dps(float f, float f2) {
        this.a = f2;
        this.b = f;
    }

    @Override // defpackage.dpr
    public final float a() {
        float f = this.b + this.a;
        this.b = f;
        return f;
    }
}
