package defpackage;

/* loaded from: classes2.dex */
final class lob extends llu {
    final /* synthetic */ loc a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lob(loc locVar) {
        super((int[]) null);
        this.a = locVar;
    }

    @Override // defpackage.llu
    public final void v(yfq yfqVar) {
        ype ypeVar = (ype) lod.a.l().ai(4097);
        loc locVar = this.a;
        ypeVar.K("onQueueChanged componentName=%s size=%d", new zjd(zjc.a, locVar.a.flattenToShortString()), yfqVar.size());
        locVar.m(lod.c(yfqVar));
    }

    @Override // defpackage.llu
    public final void w() {
        yop yopVarH = lod.a.h();
        loc locVar = this.a;
        ((ype) ((ype) yopVarH).ai((char) 4098)).y("QueueCallback#onSessionDestroyed componentName=%s", new zjd(zjc.a, locVar.a.flattenToShortString()));
        int i = yfq.d;
        locVar.m(yls.a);
    }
}
