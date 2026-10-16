package j$.util.stream;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class v extends w {
    public final /* synthetic */ int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(a aVar, int i2, int i3) {
        super(aVar, i2, 1);
        this.m = i3;
    }

    @Override // j$.util.stream.a
    public final t5 M(int i2, t5 t5Var) {
        switch (this.m) {
            case 0:
                return t5Var;
            case 1:
                return new r(2, t5Var);
            case 2:
                return new i1(1, t5Var);
            case 3:
                return new i1(4, t5Var);
            case 4:
                return new n1(0, t5Var);
            default:
                return new n1(3, t5Var);
        }
    }
}
