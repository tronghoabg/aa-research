package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final /* synthetic */ class oya implements aezk {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ oya(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r5v34, types: [java.lang.Object, plz] */
    /* JADX WARN: Type inference failed for: r5v36, types: [java.lang.Object, xyc] */
    /* JADX WARN: Type inference failed for: r5v4, types: [eqa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5, types: [eqa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6, types: [eqa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v68, types: [java.lang.Object, pyh] */
    /* JADX WARN: Type inference failed for: r5v7, types: [eqa, java.lang.Object] */
    @Override // defpackage.aezk, defpackage.aezj
    public final Object a() {
        switch (this.b) {
            case 0:
                AtomicReference atomicReference = oxz.a;
                return this.a;
            case 1:
                yph yphVar = ooa.a;
                return new onw((Context) this.a);
            case 2:
                AtomicReference atomicReference2 = oxz.a;
                return new oxy(this.a);
            case 3:
                AtomicReference atomicReference3 = oxz.a;
                return new oxw(this.a);
            case 4:
                AtomicReference atomicReference4 = oxz.a;
                return new oxx(this.a);
            case 5:
                AtomicReference atomicReference5 = oxz.a;
                oxs oxsVar = new oxs();
                ?? r5 = this.a;
                oxsVar.b = r5;
                r5.getLifecycle().c(oxsVar);
                int i = 15;
                ((eqj) nfh.a().a).fE(oxsVar.b, new ntw(oxsVar, i));
                eqy.a(nxo.b().b).fE(oxsVar.b, new ntw(oxsVar, 16));
                mpd.b().h.fE(oxsVar.b, new lkn(12));
                if (acxa.aK()) {
                    eqy.a(mpm.e()).fE(oxsVar.b, new lkn(13));
                    eqy.a(lau.c().i()).fE(oxsVar.b, new lkn(14));
                }
                if (lal.a().b()) {
                    tby.n(tby.d(eqy.a(lau.c().i()), mpd.b().h, new ooh(6))).fE(oxsVar.b, new lkn(i));
                }
                return oxsVar;
            case 6:
                return (oxm) ((tgs) this.a).i(oxq.class);
            case 7:
                return lvl.aj(this.a);
            case 8:
                int i2 = qer.g;
                return (lwk) this.a.gu();
            case 9:
                int i3 = qes.g;
                return new kho((Context) this.a);
            case 10:
                int i4 = qes.g;
                return new kwo((Context) this.a);
            case 11:
                int i5 = qes.g;
                return this.a;
            case 12:
                int i6 = qes.g;
                return this.a;
            case 13:
                return lau.a().a((Context) this.a, "connectivity_logger_state");
            case 14:
                return ((zwm) this.a).b();
            case 15:
                return ((zwm) this.a).a();
            case 16:
                return ((tsn) this.a).a();
            case 17:
                return ((zwm) this.a).h();
            case 18:
                Object obj = this.a;
                return ((tyb) obj).f.k(pyk.X, "");
            case 19:
                Object obj2 = this.a;
                return ((tyb) obj2).f.k(pyk.X, "");
            default:
                return this.a.k(pyk.X, "");
        }
    }
}
