package defpackage;

import com.google.android.apps.auto.sdk.nav.suggestion.NavigationSuggestion;
import j$.util.DesugarArrays;
import j$.util.stream.Stream;

/* loaded from: classes.dex */
public final class lzl extends owq {
    private static final yph b = yph.c("GH.NavSugCallback");
    public final eqm a;

    public lzl(lzh lzhVar) {
        this.a = new lzk(((lzv) lzhVar).g);
    }

    @Override // defpackage.owr
    public final void a(NavigationSuggestion[] navigationSuggestionArr) {
        if (navigationSuggestionArr == null) {
            ((ype) b.l().ai((char) 4508)).u("Got a null value for new suggestions. Canceling old suggestions");
            eqm eqmVar = this.a;
            int i = yfq.d;
            eqmVar.j(yls.a);
            return;
        }
        ((ype) b.l().ai(4507)).w("Got %d suggestions from nav provider", navigationSuggestionArr.length);
        eqm eqmVar2 = this.a;
        Stream streamFilter = DesugarArrays.stream(navigationSuggestionArr).filter(new lye(2));
        int i2 = yfq.d;
        eqmVar2.j((yfq) streamFilter.collect(ycm.a));
    }
}
