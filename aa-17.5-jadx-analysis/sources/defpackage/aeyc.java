package defpackage;

/* loaded from: classes3.dex */
final class aeyc extends aezh {
    final /* synthetic */ aeyd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aeyc(aeyd aeydVar) {
        super(aeydVar.b);
        this.a = aeydVar;
    }

    @Override // defpackage.aezh
    protected final int a() {
        return this.a.c;
    }

    @Override // defpackage.aezf
    protected final /* bridge */ /* synthetic */ aeze b(int i, int i2) {
        return new aeyc(this.a, i, i2);
    }

    @Override // defpackage.aezf
    protected final short c(int i) {
        return this.a.d.a[i];
    }

    @Override // defpackage.aezf
    /* renamed from: e */
    public final void forEachRemaining(aeys aeysVar) {
        short[] sArr = this.a.d.a;
        int iG = g();
        while (true) {
            int i = this.b;
            if (i >= iG) {
                return;
            }
            this.b = i + 1;
            aeysVar.c(sArr[i]);
        }
    }

    @Override // defpackage.aezf
    /* renamed from: f */
    public final boolean tryAdvance(aeys aeysVar) {
        if (this.b >= g()) {
            return false;
        }
        short[] sArr = this.a.d.a;
        int i = this.b;
        this.b = i + 1;
        aeysVar.c(sArr[i]);
        return true;
    }

    @Override // defpackage.aezf, defpackage.aexy, j$.util.Spliterator.OfPrimitive
    public final /* bridge */ /* synthetic */ void forEachRemaining(Object obj) {
        forEachRemaining((aeys) obj);
    }

    @Override // defpackage.aezf, j$.util.Spliterator.OfPrimitive
    public final /* bridge */ /* synthetic */ boolean tryAdvance(Object obj) {
        return tryAdvance((aeys) obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private aeyc(aeyd aeydVar, int i, int i2) {
        super(i, i2);
        this.a = aeydVar;
    }
}
