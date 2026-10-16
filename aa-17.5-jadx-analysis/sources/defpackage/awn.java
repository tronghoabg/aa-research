package defpackage;

/* loaded from: classes.dex */
public final class awn extends cfx implements cyq {
    public Object a;
    private final /* synthetic */ int b;

    public awn(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [cfm, java.lang.Object] */
    @Override // defpackage.cyq
    public final /* synthetic */ Object ek(Object obj) {
        if (this.b != 0) {
            avu avuVar = obj instanceof avu ? (avu) obj : null;
            if (avuVar == null) {
                avuVar = new avu(null);
            }
            avuVar.c = new atx(this.a);
            return avuVar;
        }
        avu avuVar2 = obj instanceof avu ? (avu) obj : null;
        if (avuVar2 == null) {
            avuVar2 = new avu(null);
        }
        avuVar2.c = new aty((cfr) this.a);
        return avuVar2;
    }
}
