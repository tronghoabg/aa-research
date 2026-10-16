package defpackage;

import android.location.Location;
import com.google.android.gms.location.LocationResult;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class stz implements smq {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public stz(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    @Override // defpackage.smq
    public final /* synthetic */ void b(Object obj) {
        boolean z;
        int i = this.b;
        if (i == 0) {
            ((ssy) this.a).a.c();
            return;
        }
        if (i == 1) {
            ((std) obj).a((LocationResult) this.a);
            return;
        }
        if (i == 2) {
            ((ste) obj).a((Location) this.a);
            return;
        }
        if (i == 3) {
            ((stb) this.a).a.c();
            return;
        }
        wda wdaVar = (wda) obj;
        try {
            wct wctVar = (wct) abnv.B(wct.a, (byte[]) this.a, abnj.a);
            Iterator it = wdaVar.b.f.iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                aboh abohVar = wctVar.b;
                wcp wcpVar = wcq.a;
                if (abohVar != null && !abohVar.isEmpty()) {
                    Iterator<E> it2 = abohVar.iterator();
                    boolean z3 = false;
                    while (it2.hasNext()) {
                        kgx kgxVar = (kgx) wcpVar.b.get((String) it2.next());
                        if (kgxVar != null) {
                            Object obj2 = kgxVar.a;
                            wcq wcqVar = (wcq) obj2;
                            if (wcqVar.h) {
                                wdm wdmVar = wcqVar.c;
                                if (wdmVar != null && (wdmVar.a || wdmVar.a() || wcqVar.i.d())) {
                                    synchronized (obj2) {
                                        wdm wdmVar2 = ((wcq) obj2).c;
                                        if (wdmVar2 != null && (wdmVar2.a || wdmVar2.a() || ((wcq) obj2).i.d())) {
                                            ((wcq) obj2).c = null;
                                            ((wcq) obj2).j.j();
                                        }
                                    }
                                }
                                z = false;
                            } else {
                                z = true;
                            }
                            z3 |= z;
                        }
                    }
                    if (z3 && !z2) {
                        wdaVar.a.a();
                        z2 = true;
                    }
                }
            }
        } catch (abon unused) {
        }
    }

    @Override // defpackage.smq
    public final void c() {
    }
}
