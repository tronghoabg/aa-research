package e.a.e;

import e.a.ee;
import e.a.ef;
import h.ab;
import h.g.b.am;
import kotlinx.coroutines.b.l;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class g<T> implements l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ am f47378a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ l f47379b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f47380c = "request";

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Object f47381d;

    g(am amVar, l lVar, Object obj) {
        this.f47378a = amVar;
        this.f47379b = lVar;
        this.f47381d = obj;
    }

    @Override // kotlinx.coroutines.b.l
    public final Object emit(T t, h.c.e<? super ab> eVar) throws ef {
        am amVar = this.f47378a;
        if (!amVar.f48101a) {
            amVar.f48101a = true;
            Object objEmit = this.f47379b.emit(t, eVar);
            return objEmit == h.c.a.a.f48038a ? objEmit : ab.f48028a;
        }
        String str = this.f47380c;
        Object obj = this.f47381d;
        throw new ef(ee.f47410j.g("Expected one " + str + " for " + obj + " but received two"));
    }
}
