package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class lzs extends defpackage.oxn {
    private static final defpackage.yqm b = defpackage.yqm.c("GH.NavSugCallback");
    public final defpackage.eqs a;

    public lzs(lzo lzoVar) {
        this.a = new defpackage.lzr(((defpackage.mac) lzoVar).g);
    }

    public final void a(com.google.android.apps.auto.sdk.nav.suggestion.NavigationSuggestion[] navigationSuggestionArr) {
        if (navigationSuggestionArr == null) {
            ((defpackage.yqj) b.l().ai((char) 4511)).u("Got a null value for new suggestions. Canceling old suggestions");
            defpackage.eqs eqsVar = this.a;
            int i = defpackage.ygw.d;
            eqsVar.j(defpackage.ymx.a);
            return;
        }
        ((defpackage.yqj) b.l().ai(4510)).w("Got %d suggestions from nav provider", navigationSuggestionArr.length);
        defpackage.eqs eqsVar2 = this.a;
        j$.util.stream.Stream streamFilter = j$.util.DesugarArrays.stream(navigationSuggestionArr).filter(new defpackage.lyk(3));
        int i2 = defpackage.ygw.d;
        eqsVar2.j((defpackage.ygw) streamFilter.collect(defpackage.yds.a));
    }
}
