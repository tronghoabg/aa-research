package defpackage;

/* loaded from: classes.dex */
public final class avf extends cfx implements cyq {
    public float a;
    public boolean b;

    public avf(float f, boolean z) {
        this.a = f;
        this.b = z;
    }

    @Override // defpackage.cyq
    public final /* bridge */ /* synthetic */ Object ek(Object obj) {
        avu avuVar = obj instanceof avu ? (avu) obj : null;
        if (avuVar == null) {
            avuVar = new avu(null);
        }
        avuVar.a = this.a;
        avuVar.b = this.b;
        return avuVar;
    }
}
