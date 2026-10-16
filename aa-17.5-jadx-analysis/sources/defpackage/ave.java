package defpackage;

/* loaded from: classes.dex */
public final class ave extends cxt<avf> {
    private final float a;
    private final boolean b;

    public ave(float f, boolean z) {
        this.a = f;
        this.b = z;
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ cfx d() {
        return new avf(this.a, this.b);
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ void e(cfx cfxVar) {
        avf avfVar = (avf) cfxVar;
        avfVar.a = this.a;
        avfVar.b = this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        ave aveVar = obj instanceof ave ? (ave) obj : null;
        return aveVar != null && this.a == aveVar.a && this.b == aveVar.b;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.a) * 31) + (true != this.b ? 1237 : 1231);
    }
}
