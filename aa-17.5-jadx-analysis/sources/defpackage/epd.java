package defpackage;

/* loaded from: classes2.dex */
final class epd extends afda {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ epe c;
    int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public epd(epe epeVar, afck afckVar) {
        super(afckVar);
        this.c = epeVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.b(null, this);
    }
}
