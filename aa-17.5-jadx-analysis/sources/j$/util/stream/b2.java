package j$.util.stream;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final class b2 extends a2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b2(v3 v3Var, Object obj, byte b) {
        super((byte) 8);
        this.i = b;
        this.j = obj;
    }

    @Override // j$.util.stream.a2
    public final n2 H() {
        byte b = this.i;
        Object obj = this.j;
        switch (b) {
            case 0:
                return new m2((i) obj);
            case 1:
                return new e2((j$.desugar.sun.nio.fs.h) obj);
            default:
                return new l2((i) obj);
        }
    }
}
