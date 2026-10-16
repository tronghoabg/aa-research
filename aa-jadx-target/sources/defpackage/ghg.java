package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ghg implements androidx.compose.ui.input.pointer.PointerInputEventHandler {
    private final /* synthetic */ int e;
    public static final defpackage.ghg d = new defpackage.ghg(3);
    public static final defpackage.ghg c = new defpackage.ghg(2);
    public static final defpackage.ghg b = new defpackage.ghg(1);
    public static final defpackage.ghg a = new defpackage.ghg(0);

    public ghg(int i) {
        this.e = i;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final java.lang.Object invoke(defpackage.cri criVar, defpackage.afdk afdkVar) {
        int i = this.e;
        if (i == 0) {
            return defpackage.afbk.a;
        }
        if (i == 1) {
            return defpackage.afbk.a;
        }
        if (i != 2) {
            return defpackage.ca.aT(criVar, null, new defpackage.ncv(15), afdkVar, 7);
        }
        java.lang.Object objR = criVar.r(new hgw((defpackage.afdk) null, 1, (byte[]) null), afdkVar);
        return objR == defpackage.afdr.a ? objR : defpackage.afbk.a;
    }
}
