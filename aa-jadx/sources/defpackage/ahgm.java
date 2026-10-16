package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ahgm {
    private ahgm() {
    }

    public final defpackage.ahgn fromFieldNameAndDesc(java.lang.String str, java.lang.String str2) {
        str.getClass();
        str2.getClass();
        return new defpackage.ahgn(str + '#' + str2, null);
    }

    public final defpackage.ahgn fromJvmMemberSignature(defpackage.ahnn ahnnVar) {
        ahnnVar.getClass();
        if (ahnnVar instanceof defpackage.ahnm) {
            defpackage.ahnm ahnmVar = (defpackage.ahnm) ahnnVar;
            return fromMethodNameAndDesc(ahnmVar.getName(), ahnmVar.getDesc());
        }
        if (!(ahnnVar instanceof defpackage.ahnl)) {
            throw new defpackage.afas();
        }
        defpackage.ahnl ahnlVar = (defpackage.ahnl) ahnnVar;
        return fromFieldNameAndDesc(ahnlVar.getName(), ahnlVar.getDesc());
    }

    public final defpackage.ahgn fromMethod(defpackage.ahmd ahmdVar, defpackage.ahmv ahmvVar) {
        ahmdVar.getClass();
        ahmvVar.getClass();
        return fromMethodNameAndDesc(ahmdVar.getString(ahmvVar.getName()), ahmdVar.getString(ahmvVar.getDesc()));
    }

    public final defpackage.ahgn fromMethodNameAndDesc(java.lang.String str, java.lang.String str2) {
        str.getClass();
        str2.getClass();
        return new defpackage.ahgn(str.concat(str2), null);
    }

    public final defpackage.ahgn fromMethodSignatureAndParameterIndex(defpackage.ahgn ahgnVar, int i) {
        ahgnVar.getClass();
        return new defpackage.ahgn(ahgnVar.getSignature() + '@' + i, null);
    }

    public /* synthetic */ ahgm(defpackage.affu affuVar) {
        this();
    }
}
