package defpackage;

/* loaded from: classes3.dex */
final class aeet extends aegc {
    final /* synthetic */ aeeu a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aeet(aeeu aeeuVar) {
        super(aeeuVar.b);
        this.a = aeeuVar;
    }

    @Override // defpackage.aega
    protected final byte a(int i) {
        return this.a.d.a[i];
    }

    @Override // defpackage.aegc
    protected final int b() {
        return this.a.c;
    }

    @Override // defpackage.aega
    protected final /* bridge */ /* synthetic */ aefz c(int i, int i2) {
        return new aeet(this.a, i, i2);
    }

    @Override // defpackage.aega
    /* renamed from: e */
    public final void forEachRemaining(aefj aefjVar) {
        byte[] bArr = this.a.d.a;
        int iG = g();
        while (true) {
            int i = this.b;
            if (i >= iG) {
                return;
            }
            this.b = i + 1;
            aefjVar.b(bArr[i]);
        }
    }

    @Override // defpackage.aega
    /* renamed from: f */
    public final boolean tryAdvance(aefj aefjVar) {
        if (this.b >= g()) {
            return false;
        }
        byte[] bArr = this.a.d.a;
        int i = this.b;
        this.b = i + 1;
        aefjVar.b(bArr[i]);
        return true;
    }

    @Override // defpackage.aega, defpackage.aeep, j$.util.Spliterator.OfPrimitive
    public final /* bridge */ /* synthetic */ void forEachRemaining(Object obj) {
        forEachRemaining((aefj) obj);
    }

    @Override // defpackage.aega, j$.util.Spliterator.OfPrimitive
    public final /* bridge */ /* synthetic */ boolean tryAdvance(Object obj) {
        return tryAdvance((aefj) obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private aeet(aeeu aeeuVar, int i, int i2) {
        super(i, i2);
        this.a = aeeuVar;
    }
}
