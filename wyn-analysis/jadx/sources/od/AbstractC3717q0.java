package od;

import A.AbstractC0213f;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.logging.Logger;
import ra.C3962a;

/* renamed from: od.q0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3717q0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f42075a = Logger.getLogger(AbstractC3717q0.class.getName());

    public static Object a(C3962a c3962a) throws IOException {
        Fe.e.w("unexpected end of JSON", c3962a.D());
        int iF = AbstractC0213f.f(c3962a.e0());
        if (iF == 0) {
            c3962a.a();
            ArrayList arrayList = new ArrayList();
            while (c3962a.D()) {
                arrayList.add(a(c3962a));
            }
            Fe.e.w("Bad token: " + c3962a.z(false), c3962a.e0() == 2);
            c3962a.i();
            return DesugarCollections.unmodifiableList(arrayList);
        }
        if (iF == 2) {
            c3962a.b();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (c3962a.D()) {
                linkedHashMap.put(c3962a.Y(), a(c3962a));
            }
            Fe.e.w("Bad token: " + c3962a.z(false), c3962a.e0() == 4);
            c3962a.o();
            return DesugarCollections.unmodifiableMap(linkedHashMap);
        }
        if (iF == 5) {
            return c3962a.c0();
        }
        if (iF == 6) {
            return Double.valueOf(c3962a.V());
        }
        if (iF == 7) {
            return Boolean.valueOf(c3962a.Q());
        }
        if (iF == 8) {
            c3962a.a0();
            return null;
        }
        throw new IllegalStateException("Bad token: " + c3962a.z(false));
    }
}
