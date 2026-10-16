package defpackage;

/* loaded from: classes2.dex */
final class lnx extends llu {
    final /* synthetic */ lny a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lnx(lny lnyVar) {
        super((int[]) null);
        this.a = lnyVar;
    }

    @Override // defpackage.llu
    public final void u(lmd lmdVar) {
        ype ypeVar = (ype) lod.a.l().ai(4091);
        lny lnyVar = this.a;
        ypeVar.S("onMetadataChanged componentName=%s %s hasIconBitmap=%b hasIconUri=%b", new zjd(zjc.a, lnyVar.a.flattenToShortString()), lmdVar, Boolean.valueOf(spu.aT(lmdVar, new llx(11)) != null), Boolean.valueOf(spu.aT(lmdVar, new llx(12)) != null));
        lnyVar.m(lmdVar);
    }

    @Override // defpackage.llu
    public final void w() {
        yop yopVarH = lod.a.h();
        lny lnyVar = this.a;
        ((ype) ((ype) yopVarH).ai((char) 4092)).y("MetadataCallback#onSessionDestroyed componentName=%s", new zjd(zjc.a, lnyVar.a.flattenToShortString()));
        lnyVar.m(null);
    }
}
