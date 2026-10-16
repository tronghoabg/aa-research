package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class fvq implements defpackage.fvp {
    private static final defpackage.aito b = new defpackage.aito("^[\\s\\p{Punct}]*(?>THE |AN |A )?");
    private final defpackage.fvr c = new defpackage.fvr();

    @Override // defpackage.fvp
    public final defpackage.fvn a(java.lang.String str) {
        str.getClass();
        return this.c.a(b(str));
    }

    @Override // defpackage.fvp
    public final java.lang.String b(java.lang.String str) {
        defpackage.aito aitoVar = b;
        java.lang.String upperCase = str.toUpperCase(java.util.Locale.ROOT);
        upperCase.getClass();
        java.lang.String strReplaceFirst = aitoVar.a.matcher(upperCase).replaceFirst("");
        strReplaceFirst.getClass();
        return strReplaceFirst;
    }

    @Override // defpackage.fvp
    public final java.util.List c() {
        return defpackage.fvr.b;
    }
}
