package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class caz implements cay {
    final /* synthetic */ cay a;
    final /* synthetic */ bzj b;

    public caz(cay cayVar, bzj bzjVar) {
        this.a = cayVar;
        this.b = bzjVar;
    }

    @Override // defpackage.cay
    public final boolean a() {
        return this.a.a();
    }

    @Override // defpackage.cay
    public final List b() {
        List listB = this.a.b();
        bzj bzjVar = this.b;
        int i = bzjVar.q;
        return i < 0 ? listB : woy.bY(vh.d(bzjVar, i, Integer.valueOf(bzjVar.k(i))), listB);
    }
}
