package defpackage;

import androidx.car.app.model.Alert;

/* loaded from: classes3.dex */
final class ugp extends plb {
    public long b;
    public int c;
    final /* synthetic */ ugq d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ugp(ugq ugqVar, int i) {
        super(Alert.DURATION_SHOW_INDEFINITELY, null, null, null);
        this.d = ugqVar;
        this.b = 0L;
        this.c = i;
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, uii] */
    @Override // defpackage.plb
    protected final /* bridge */ /* synthetic */ void o(Object obj, Object obj2) {
        ugo ugoVar = (ugo) obj2;
        vaq.d();
        ugq ugqVar = this.d;
        ugqVar.a -= ugoVar.a;
        ugqVar.b -= ugoVar.b;
        ?? r2 = ugoVar.d;
        if (r2 != 0) {
            ugqVar.c--;
            r2.t();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, uii] */
    @Override // defpackage.plb
    protected final /* bridge */ /* synthetic */ void p(Object obj, Object obj2) {
        ?? r0;
        ugo ugoVar = (ugo) obj2;
        if (ugoVar == null || (r0 = ugoVar.d) == 0) {
            return;
        }
        r0.q();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, uii] */
    @Override // defpackage.plb
    protected final /* bridge */ /* synthetic */ void q(Object obj, Object obj2) {
        ?? r0 = ((ugo) obj2).d;
        if (r0 != 0) {
            r0.q();
        }
    }

    public final ogz t() {
        pla plaVarE = e();
        if (plaVarE.hasNext()) {
            return plaVarE.next();
        }
        return null;
    }
}
