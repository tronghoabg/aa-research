package defpackage;

/* loaded from: classes3.dex */
final class aedn extends adqs {
    final /* synthetic */ aedo a;
    private final adng b;
    private boolean c;
    private boolean d;
    private Object e;
    private final aedm f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aedn(aedo aedoVar, aedm aedmVar, adng adngVar) {
        super(null, null);
        this.a = aedoVar;
        this.c = true;
        this.b = adngVar;
        this.f = aedmVar;
    }

    @Override // defpackage.adqs
    public final void b() {
        this.f.b = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:183:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x062d  */
    /* JADX WARN: Type inference failed for: r0v213, types: [aezr, java.lang.Object] */
    @Override // defpackage.adqs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() {
        /*
            Method dump skipped, instructions count: 1844
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aedn.d():void");
    }

    @Override // defpackage.adqs
    public final void e(Object obj) {
        if (this.e == null) {
            this.e = obj;
        } else {
            this.b.d(adnq.l.e("Too many requests"), new admc());
            this.c = false;
        }
    }

    @Override // defpackage.adqs
    public final void f() {
        this.d = true;
    }

    @Override // defpackage.adqs
    public final void c() {
    }
}
