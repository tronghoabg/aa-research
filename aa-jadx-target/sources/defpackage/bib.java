package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final /* synthetic */ class bib extends defpackage.affy implements defpackage.affc {
    final /* synthetic */ defpackage.bin a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bib(defpackage.bin binVar) {
        super(1, defpackage.affz.class, "localToScreen", "startInput$localToScreen(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;[F)V", 0);
        this.a = binVar;
    }

    @Override // defpackage.affc
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
        float[] fArr = ((defpackage.ckq) obj).a;
        defpackage.ctc ctcVar = (defpackage.ctc) this.a.d.a();
        if (ctcVar != null) {
            if (true != ctcVar.t()) {
                ctcVar = null;
            }
            if (ctcVar != null) {
                ctcVar.s(fArr);
            }
        }
        return defpackage.afbk.a;
    }
}
