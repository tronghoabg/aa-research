package defpackage;

/* loaded from: classes.dex */
final /* synthetic */ class bhx extends afey implements afec {
    final /* synthetic */ bik a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bhx(bik bikVar) {
        super(1, afez.class, "localToScreen", "startInput$localToScreen(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;[F)V", 0);
        this.a = bikVar;
    }

    @Override // defpackage.afec
    public final /* synthetic */ Object invoke(Object obj) {
        float[] fArr = ((cki) obj).a;
        cst cstVar = (cst) this.a.d.a();
        if (cstVar != null) {
            if (true != cstVar.t()) {
                cstVar = null;
            }
            if (cstVar != null) {
                cstVar.s(fArr);
            }
        }
        return afak.a;
    }
}
