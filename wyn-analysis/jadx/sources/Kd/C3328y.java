package kd;

import Va.M6;
import android.util.Log;
import ba.C1521a;
import ef.C2515C;
import ef.C2529m;
import ef.C2530n;
import java.util.List;
import r7.AbstractC3935e;

/* renamed from: kd.y, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class C3328y implements tf.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39707a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1521a f39708b;

    public /* synthetic */ C3328y(C1521a c1521a, int i5) {
        this.f39707a = i5;
        this.f39708b = c1521a;
    }

    @Override // tf.l
    public final Object invoke(Object obj) {
        List listD;
        List listD2;
        C2515C c2515c = C2515C.f34653a;
        C1521a c1521a = this.f39708b;
        C2530n c2530n = (C2530n) obj;
        switch (this.f39707a) {
            case 0:
                Throwable thA = C2530n.a(c2530n.f34674a);
                if (thA == null) {
                    Object obj2 = c2530n.f34674a;
                    c1521a.c(AbstractC3935e.C((Boolean) (obj2 instanceof C2529m ? null : obj2)));
                    break;
                } else {
                    if (thA instanceof C3305a) {
                        C3305a c3305a = (C3305a) thA;
                        listD = AbstractC3935e.D(c3305a.f39637a, c3305a.f39638b, c3305a.f39639c);
                    } else {
                        listD = AbstractC3935e.D(thA.getClass().getSimpleName(), thA.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(thA), thA.getCause()));
                    }
                    c1521a.c(listD);
                    break;
                }
            default:
                Throwable thA2 = C2530n.a(c2530n.f34674a);
                if (thA2 == null) {
                    Object obj3 = c2530n.f34674a;
                    c1521a.c(AbstractC3935e.C((String) (obj3 instanceof C2529m ? null : obj3)));
                    break;
                } else {
                    if (thA2 instanceof C3305a) {
                        C3305a c3305a2 = (C3305a) thA2;
                        listD2 = AbstractC3935e.D(c3305a2.f39637a, c3305a2.f39638b, c3305a2.f39639c);
                    } else {
                        listD2 = AbstractC3935e.D(thA2.getClass().getSimpleName(), thA2.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(thA2), thA2.getCause()));
                    }
                    c1521a.c(listD2);
                    break;
                }
        }
        return c2515c;
    }
}
