package defpackage;

import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes2.dex */
public final class jqb implements Runnable {
    final /* synthetic */ long a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    public jqb(jnh jnhVar, long j, rwm rwmVar, List list, Map map, int i) {
        this.f = i;
        this.e = jnhVar;
        this.a = j;
        this.d = rwmVar;
        this.b = list;
        this.c = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, rwm] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r14v10, types: [java.lang.Object, rwm] */
    /* JADX WARN: Type inference failed for: r14v7, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Iterable, java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, tgu] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, rwy] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, rwm] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f;
        if (i == 0) {
            jou jouVar = (jou) ((jqj) this.e).e;
            jouVar.f();
            yph yphVar = jou.a;
            ((ype) ((ype) yphVar.f()).ai((char) 2537)).u("Start additional services");
            long j = this.a;
            boolean zK = jouVar.k(j);
            ?? r10 = this.d;
            if (!zK) {
                ((ype) ((ype) yphVar.h()).ai(2538)).H("Rejecting startAdditionalServices call: requested session %d doesn't match active session %d", j, jouVar.e());
                jouVar.e.post(new joo(r10, 0));
                return;
            } else {
                ?? r12 = this.c;
                ?? r11 = this.b;
                jouVar.e.post(new jqb(jouVar.d(), j, (rwm) r10, (List) r11, (Map) r12, 1));
                return;
            }
        }
        if (i == 1) {
            if (((joi) this.e).v) {
                ((ype) ((ype) jou.a.h()).ai(2514)).x("Rejecting startAdditionalServices call: requested session %d has been torn down", this.a);
                try {
                    this.d.e(false);
                    return;
                } catch (RemoteException e) {
                    ((ype) ((ype) ((ype) jou.a.h()).p(e)).ai((char) 2515)).u("Unexpected RemoteException when making callback.");
                    return;
                }
            }
            Object obj = this.e;
            ?? r1 = this.b;
            ?? r14 = this.c;
            joi joiVar = (joi) obj;
            joiVar.c();
            joiVar.d();
            ((ype) ((ype) joi.a.f()).ai(2490)).x("Start additional services in background %d", joiVar.c);
            joi.f(joiVar.l, r1, r14);
            joiVar.l.j(new jqq(r1, new ily(4)));
            return;
        }
        if (i == 2) {
            ((jqj) this.e).e.c(this.a, 1, this.b, this.d, (String) this.c, null);
            return;
        }
        if (i == 3) {
            ?? r8 = this.b;
            Object obj2 = this.e;
            ((jqj) this.d).e.a(this.a, this.c, ylx.a, (ParcelFileDescriptor) obj2, r8);
            return;
        }
        pqt pqtVar = (pqt) this.e;
        pqo pqoVar = pqtVar.c;
        Object obj3 = this.d;
        pqoVar.b((String) this.b, (Locale) this.c, this.a, (acbu) obj3);
        qcd qcdVar = pqtVar.h;
        if (qcdVar != null) {
            qcdVar.a();
        }
        pqtVar.l.countDown();
        ((ynz) ((ynz) pqt.a.f()).ai((char) 6846)).u("Client parameters saved.");
    }

    public jqb(jqj jqjVar, long j, List list, ParcelFileDescriptor parcelFileDescriptor, rwm rwmVar, int i) {
        this.f = i;
        this.a = j;
        this.c = list;
        this.e = parcelFileDescriptor;
        this.b = rwmVar;
        this.d = jqjVar;
    }

    public jqb(jqj jqjVar, long j, List list, Map map, rwm rwmVar, int i) {
        this.f = i;
        this.a = j;
        this.b = list;
        this.c = map;
        this.d = rwmVar;
        this.e = jqjVar;
    }

    public jqb(jqj jqjVar, long j, tgu tguVar, rwy rwyVar, String str, int i) {
        this.f = i;
        this.a = j;
        this.b = tguVar;
        this.d = rwyVar;
        this.c = str;
        this.e = jqjVar;
    }

    public /* synthetic */ jqb(pqt pqtVar, String str, Locale locale, long j, acbu acbuVar, int i) {
        this.f = i;
        this.e = pqtVar;
        this.b = str;
        this.c = locale;
        this.a = j;
        this.d = acbuVar;
    }
}
