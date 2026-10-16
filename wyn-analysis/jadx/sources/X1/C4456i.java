package x1;

import A.AbstractC0213f;
import E5.Q;
import a.AbstractC1304a;
import androidx.datastore.preferences.protobuf.A;
import androidx.datastore.preferences.protobuf.AbstractC1404v;
import androidx.datastore.preferences.protobuf.C1393j;
import androidx.datastore.preferences.protobuf.InterfaceC1406x;
import ef.C2515C;
import ff.AbstractC2640A;
import ff.o;
import j$.util.DesugarCollections;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import jf.InterfaceC3103c;
import kotlin.jvm.internal.AbstractC3340k;
import od.Y0;
import u1.C4212a;
import u1.InterfaceC4224m;
import w1.C4352c;
import w1.C4354e;
import w1.C4355f;
import w1.C4356g;
import w1.C4357h;
import w1.C4358i;

/* renamed from: x1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4456i implements InterfaceC4224m {

    /* renamed from: a, reason: collision with root package name */
    public static final C4456i f47657a = new C4456i();

    @Override // u1.InterfaceC4224m
    public final Object getDefaultValue() {
        return new C4449b(true);
    }

    @Override // u1.InterfaceC4224m
    public final Object readFrom(InputStream inputStream, InterfaceC3103c interfaceC3103c) throws C4212a {
        try {
            C4354e c4354eL = C4354e.l((FileInputStream) inputStream);
            C4449b c4449b = new C4449b(false);
            AbstractC4453f[] pairs = (AbstractC4453f[]) Arrays.copyOf(new AbstractC4453f[0], 0);
            AbstractC3340k.e(pairs, "pairs");
            c4449b.a();
            if (pairs.length > 0) {
                AbstractC4453f abstractC4453f = pairs[0];
                throw null;
            }
            Map mapJ = c4354eL.j();
            AbstractC3340k.d(mapJ, "preferencesProto.preferencesMap");
            for (Map.Entry entry : mapJ.entrySet()) {
                String name = (String) entry.getKey();
                C4358i value = (C4358i) entry.getValue();
                AbstractC3340k.d(name, "name");
                AbstractC3340k.d(value, "value");
                int iX = value.x();
                switch (iX == 0 ? -1 : AbstractC4455h.f47656a[AbstractC0213f.f(iX)]) {
                    case -1:
                        throw new C4212a("Value case is null.", null);
                    case 0:
                    default:
                        throw new Q((byte) 0, 9);
                    case 1:
                        c4449b.d(AbstractC1304a.k(name), Boolean.valueOf(value.p()));
                        break;
                    case 2:
                        c4449b.d(new C4452e(name), Float.valueOf(value.s()));
                        break;
                    case 3:
                        c4449b.d(new C4452e(name), Double.valueOf(value.r()));
                        break;
                    case 4:
                        c4449b.d(new C4452e(name), Integer.valueOf(value.t()));
                        break;
                    case 5:
                        c4449b.d(new C4452e(name), Long.valueOf(value.u()));
                        break;
                    case 6:
                        C4452e c4452e = new C4452e(name);
                        String strV = value.v();
                        AbstractC3340k.d(strV, "value.string");
                        c4449b.d(c4452e, strV);
                        break;
                    case 7:
                        C4452e c4452e2 = new C4452e(name);
                        InterfaceC1406x interfaceC1406xK = value.w().k();
                        AbstractC3340k.d(interfaceC1406xK, "value.stringSet.stringsList");
                        c4449b.d(c4452e2, o.X0(interfaceC1406xK));
                        break;
                    case 8:
                        throw new C4212a("Value not set.", null);
                }
            }
            Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(c4449b.f47646a);
            AbstractC3340k.d(mapUnmodifiableMap, "unmodifiableMap(preferencesMap)");
            return new C4449b(AbstractC2640A.a0(mapUnmodifiableMap), true);
        } catch (A e7) {
            throw new C4212a("Unable to parse preferences proto.", e7);
        }
    }

    @Override // u1.InterfaceC4224m
    public final Object writeTo(Object obj, OutputStream outputStream, InterfaceC3103c interfaceC3103c) {
        AbstractC1404v abstractC1404vA;
        Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(((C4449b) obj).f47646a);
        AbstractC3340k.d(mapUnmodifiableMap, "unmodifiableMap(preferencesMap)");
        C4352c c4352cK = C4354e.k();
        for (Map.Entry entry : mapUnmodifiableMap.entrySet()) {
            C4452e c4452e = (C4452e) entry.getKey();
            Object value = entry.getValue();
            String str = c4452e.f47652a;
            if (value instanceof Boolean) {
                C4357h c4357hY = C4358i.y();
                boolean zBooleanValue = ((Boolean) value).booleanValue();
                c4357hY.c();
                C4358i.m((C4358i) c4357hY.f18270b, zBooleanValue);
                abstractC1404vA = c4357hY.a();
            } else if (value instanceof Float) {
                C4357h c4357hY2 = C4358i.y();
                float fFloatValue = ((Number) value).floatValue();
                c4357hY2.c();
                C4358i.n((C4358i) c4357hY2.f18270b, fFloatValue);
                abstractC1404vA = c4357hY2.a();
            } else if (value instanceof Double) {
                C4357h c4357hY3 = C4358i.y();
                double dDoubleValue = ((Number) value).doubleValue();
                c4357hY3.c();
                C4358i.l((C4358i) c4357hY3.f18270b, dDoubleValue);
                abstractC1404vA = c4357hY3.a();
            } else if (value instanceof Integer) {
                C4357h c4357hY4 = C4358i.y();
                int iIntValue = ((Number) value).intValue();
                c4357hY4.c();
                C4358i.o((C4358i) c4357hY4.f18270b, iIntValue);
                abstractC1404vA = c4357hY4.a();
            } else if (value instanceof Long) {
                C4357h c4357hY5 = C4358i.y();
                long jLongValue = ((Number) value).longValue();
                c4357hY5.c();
                C4358i.i((C4358i) c4357hY5.f18270b, jLongValue);
                abstractC1404vA = c4357hY5.a();
            } else if (value instanceof String) {
                C4357h c4357hY6 = C4358i.y();
                c4357hY6.c();
                C4358i.j((C4358i) c4357hY6.f18270b, (String) value);
                abstractC1404vA = c4357hY6.a();
            } else {
                if (!(value instanceof Set)) {
                    throw new IllegalStateException(AbstractC3340k.k(value.getClass().getName(), "PreferencesSerializer does not support type: "));
                }
                C4357h c4357hY7 = C4358i.y();
                C4355f c4355fL = C4356g.l();
                c4355fL.c();
                C4356g.i((C4356g) c4355fL.f18270b, (Set) value);
                c4357hY7.c();
                C4358i.k((C4358i) c4357hY7.f18270b, c4355fL);
                abstractC1404vA = c4357hY7.a();
            }
            c4352cK.getClass();
            str.getClass();
            c4352cK.c();
            C4354e.i((C4354e) c4352cK.f18270b).put(str, (C4358i) abstractC1404vA);
        }
        C4354e c4354e = (C4354e) c4352cK.a();
        int iA = c4354e.a();
        Logger logger = C1393j.f18227h;
        if (iA > 4096) {
            iA = 4096;
        }
        C1393j c1393j = new C1393j((Y0) outputStream, iA);
        c4354e.c(c1393j);
        if (c1393j.f18232f > 0) {
            c1393j.B();
        }
        return C2515C.f34653a;
    }
}
