package androidx.camera.camera2.pipe.core;

import e.a.h.ad;
import h.a.r;
import h.ab;
import h.c.e;
import h.g.a.l;
import h.g.a.p;
import h.g.a.q;
import h.g.b.x;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.af;
import kotlinx.coroutines.ag;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.am;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class AutoCloseables {
    public static final AutoCloseables INSTANCE = new AutoCloseables();

    private AutoCloseables() {
    }

    private final <T extends AutoCloseable, R> Object useEachAsync$$forInline(af afVar, List<? extends T> list, q<? super af, ? super T, ? super e<? super R>, ? extends Object> qVar, e<? super List<? extends am<? extends R>>> eVar) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(aj.y(afVar, null, ag.f51345d, new AutoCloseables$useEachAsync$$inlined$useEachIndexedAsync$1(list.get(i2), i2, null, qVar), 1));
        }
        return arrayList;
    }

    public final <T extends AutoCloseable> void useEach(List<? extends T> list, l<? super T, ab> lVar) {
        x.f(list, "closeables");
        x.f(lVar, "action");
        int i2 = 0;
        while (i2 < list.size()) {
            try {
                T t = list.get(i2);
                i2++;
                try {
                    lVar.invoke(t);
                    r.y(t, null);
                } finally {
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    while (i2 < list.size()) {
                        int i3 = i2 + 1;
                        try {
                            AutoCloseables$$ExternalSyntheticAutoCloseableDispatcher0.m(list.get(i2));
                        } catch (Throwable th3) {
                            ad.c(th, th3);
                        }
                        i2 = i3;
                    }
                    throw th2;
                }
            }
        }
        while (i2 < list.size()) {
            int i4 = i2 + 1;
            try {
                AutoCloseables$$ExternalSyntheticAutoCloseableDispatcher0.m(list.get(i2));
            } catch (Throwable unused) {
            }
            i2 = i4;
        }
    }

    public final <T extends AutoCloseable, R> Object useEachAsync(af afVar, List<? extends T> list, q<? super af, ? super T, ? super e<? super R>, ? extends Object> qVar, e<? super List<? extends am<? extends R>>> eVar) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(aj.y(afVar, null, ag.f51345d, new AutoCloseables$useEachAsync$$inlined$useEachIndexedAsync$1(list.get(i2), i2, null, qVar), 1));
        }
        return arrayList;
    }

    public final <T extends AutoCloseable> void useEachIndexed(List<? extends T> list, p<? super Integer, ? super T, ab> pVar) {
        int i2;
        Throwable th;
        x.f(list, "closeables");
        x.f(pVar, "action");
        int i3 = 0;
        while (i3 < list.size()) {
            try {
                T t = list.get(i3);
                i2 = i3 + 1;
                try {
                    pVar.invoke(Integer.valueOf(i3), t);
                    try {
                        r.y(t, null);
                        i3 = i2;
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            throw th;
                        } finally {
                            while (i2 < list.size()) {
                                int i4 = i2 + 1;
                                try {
                                    AutoCloseables$$ExternalSyntheticAutoCloseableDispatcher0.m(list.get(i2));
                                } catch (Throwable th3) {
                                    ad.c(th, th3);
                                }
                                i2 = i4;
                            }
                        }
                    }
                } finally {
                }
            } catch (Throwable th4) {
                i2 = i3;
                th = th4;
            }
        }
        while (i3 < list.size()) {
            int i5 = i3 + 1;
            try {
                AutoCloseables$$ExternalSyntheticAutoCloseableDispatcher0.m(list.get(i3));
            } catch (Throwable unused) {
            }
            i3 = i5;
        }
    }

    public final <T extends AutoCloseable, R> List<am<R>> useEachIndexedAsync(af afVar, List<? extends T> list, h.g.a.r<? super af, ? super Integer, ? super T, ? super e<? super R>, ? extends Object> rVar) {
        x.f(afVar, "scope");
        x.f(list, "closeables");
        x.f(rVar, "action");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(aj.y(afVar, null, ag.f51345d, new AutoCloseables$useEachIndexedAsync$deferred$1(list.get(i2), rVar, i2, null), 1));
        }
        return arrayList;
    }
}
