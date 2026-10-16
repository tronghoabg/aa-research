package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class mus implements defpackage.afer {
    private final /* synthetic */ int a;

    public /* synthetic */ mus(int i) {
        this.a = i;
    }

    @Override // defpackage.afer
    public final java.lang.Object invoke() {
        int i = this.a;
        java.lang.Float fValueOf = java.lang.Float.valueOf(0.0f);
        switch (i) {
            case defpackage.abnt.b /* 0 */:
                defpackage.muj.h.a().j();
                return defpackage.afbk.a;
            case 1:
                mtw mtwVar = mty.a;
                return defpackage.a.P();
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                return new defpackage.muf(11);
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                defpackage.bvm bvmVar = mwn.a;
                return java.lang.Boolean.TRUE;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                defpackage.yqm yqmVar = defpackage.myx.a;
                return java.lang.Boolean.TRUE;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                defpackage.yqm yqmVar2 = defpackage.myx.a;
                return fValueOf;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.yqm yqmVar3 = defpackage.myx.a;
                return defpackage.afbk.a;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.yqm yqmVar4 = defpackage.myx.a;
                return defpackage.afbk.a;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.yqm yqmVar5 = defpackage.myx.a;
                return defpackage.afbk.a;
            case 9:
                defpackage.yqm yqmVar6 = defpackage.myx.a;
                return defpackage.afbk.a;
            case 10:
                defpackage.yqm yqmVar7 = defpackage.myx.a;
                return fValueOf;
            case 11:
                defpackage.yqm yqmVar8 = defpackage.myx.a;
                return defpackage.afbk.a;
            case 12:
                defpackage.yqm yqmVar9 = defpackage.myx.a;
                return defpackage.afbk.a;
            case 13:
                defpackage.ebo.n().q();
                defpackage.mwr.a(defpackage.zbd.Ht, null);
                return defpackage.afbk.a;
            case 14:
                defpackage.afar afarVar = defpackage.nbg.d;
                return j$.time.Duration.ofMillis(defpackage.acqe.g());
            case 15:
                int i2 = nco.a;
                defpackage.mwr.a(defpackage.zbd.FF, null);
                return defpackage.afbk.a;
            case 16:
                int i3 = nco.a;
                defpackage.mwr.a(defpackage.zbd.FG, null);
                defpackage.ndd nddVarA = defpackage.ncx.a.a().a();
                if (nddVarA.a() instanceof ndj) {
                    nddVarA.c(ndc.a, "dismissed by user");
                }
                return defpackage.afbk.a;
            case 17:
                return new defpackage.ncx();
            case 18:
                defpackage.afar afarVar2 = ndz.a;
                return java.util.regex.Pattern.compile("(\\d{1,2}:)?\\d{2}:\\d{2}$");
            case 19:
                return new defpackage.ned();
            default:
                defpackage.mwr.a(defpackage.zbd.Hu, null);
                return defpackage.afbk.a;
        }
    }
}
