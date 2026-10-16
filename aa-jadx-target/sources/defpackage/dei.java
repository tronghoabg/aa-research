package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dei implements defpackage.affg {
    public static final defpackage.dei a = new defpackage.dei();

    @Override // defpackage.affg
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String str;
        defpackage.ddn ddnVar = (defpackage.ddn) obj;
        defpackage.ddn ddnVar2 = (defpackage.ddn) obj2;
        if (ddnVar == null || (str = ddnVar.a) == null) {
            str = ddnVar2.a;
        }
        return new defpackage.ddn(str, ddnVar != null ? ddnVar.b : ddnVar2.b);
    }
}
