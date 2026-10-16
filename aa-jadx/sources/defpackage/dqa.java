package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class dqa implements defpackage.dpz {
    final float a;
    float b;

    public dqa(float f, float f2) {
        this.a = f2;
        this.b = f;
    }

    @Override // defpackage.dpz
    public final float a() {
        float f = this.b + this.a;
        this.b = f;
        return f;
    }
}
