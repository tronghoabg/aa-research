package defpackage;

/* loaded from: classes3.dex */
final class ybo extends ybp {
    final /* synthetic */ ybq a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ybo(ybq ybqVar) {
        super(ybqVar);
        this.a = ybqVar;
    }

    @Override // defpackage.ybp
    public final /* synthetic */ Object a(int i) {
        ylm ylmVar = this.a.a;
        woy.ai(i, ylmVar.c);
        return new yll(ylmVar, i);
    }
}
