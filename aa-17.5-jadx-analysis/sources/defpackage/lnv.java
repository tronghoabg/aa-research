package defpackage;

/* loaded from: classes2.dex */
final class lnv extends llu {
    final /* synthetic */ lnw a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lnv(lnw lnwVar) {
        super((int[]) null);
        this.a = lnwVar;
    }

    @Override // defpackage.llu
    public final void N(llu lluVar) {
        boolean zA = lnw.a(lluVar);
        ype ypeVar = (ype) lod.a.l().ai(4087);
        lnw lnwVar = this.a;
        String strFlattenToShortString = lnwVar.a.flattenToShortString();
        zjc zjcVar = zjc.a;
        zjd zjdVar = new zjd(zjcVar, strFlattenToShortString);
        Boolean boolValueOf = Boolean.valueOf(zA);
        ypeVar.M("AudioInfoCallback#onAudioInfoChanged componentName=%s isRemote=%s", zjdVar, new zjd(zjcVar, boolValueOf));
        lnwVar.m(boolValueOf);
    }

    @Override // defpackage.llu
    public final void w() {
        yop yopVarH = lod.a.h();
        lnw lnwVar = this.a;
        ((ype) ((ype) yopVarH).ai((char) 4088)).y("AudioInfoCallback#onSessionDestroyed componentName=%s", new zjd(zjc.a, lnwVar.a.flattenToShortString()));
        lnwVar.m(false);
    }
}
