package w1;

import A.AbstractC0213f;
import androidx.datastore.preferences.protobuf.AbstractC1384b;
import androidx.datastore.preferences.protobuf.AbstractC1402t;
import androidx.datastore.preferences.protobuf.AbstractC1404v;
import androidx.datastore.preferences.protobuf.AbstractC1407y;
import androidx.datastore.preferences.protobuf.C1383a0;
import androidx.datastore.preferences.protobuf.C1390g;
import androidx.datastore.preferences.protobuf.C1403u;
import androidx.datastore.preferences.protobuf.D;
import androidx.datastore.preferences.protobuf.InterfaceC1406x;
import androidx.datastore.preferences.protobuf.W;
import androidx.datastore.preferences.protobuf.X;
import androidx.datastore.preferences.protobuf.Z;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: w1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4356g extends AbstractC1404v {
    private static final C4356g DEFAULT_INSTANCE;
    private static volatile W PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private InterfaceC1406x strings_ = Z.f18178d;

    static {
        C4356g c4356g = new C4356g();
        DEFAULT_INSTANCE = c4356g;
        AbstractC1404v.h(C4356g.class, c4356g);
    }

    public static void i(C4356g c4356g, Iterable iterable) {
        InterfaceC1406x interfaceC1406x = c4356g.strings_;
        if (!((AbstractC1384b) interfaceC1406x).f18185a) {
            int size = interfaceC1406x.size();
            c4356g.strings_ = interfaceC1406x.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
        }
        List list = c4356g.strings_;
        Charset charset = AbstractC1407y.f18274a;
        iterable.getClass();
        if (iterable instanceof D) {
            List underlyingElements = ((D) iterable).getUnderlyingElements();
            D d3 = (D) list;
            int size2 = list.size();
            for (Object obj : underlyingElements) {
                if (obj == null) {
                    String str = "Element at index " + (d3.size() - size2) + " is null.";
                    for (int size3 = d3.size() - 1; size3 >= size2; size3--) {
                        d3.remove(size3);
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof C1390g) {
                    d3.D((C1390g) obj);
                } else {
                    d3.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof X) {
            list.addAll((Collection) iterable);
            return;
        }
        if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) list).ensureCapacity(((Collection) iterable).size() + list.size());
        }
        int size4 = list.size();
        for (Object obj2 : iterable) {
            if (obj2 == null) {
                String str2 = "Element at index " + (list.size() - size4) + " is null.";
                for (int size5 = list.size() - 1; size5 >= size4; size5--) {
                    list.remove(size5);
                }
                throw new NullPointerException(str2);
            }
            list.add(obj2);
        }
    }

    public static C4356g j() {
        return DEFAULT_INSTANCE;
    }

    public static C4355f l() {
        return (C4355f) ((AbstractC1402t) DEFAULT_INSTANCE.d(5));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1404v
    public final Object d(int i5) {
        W c1403u;
        switch (AbstractC0213f.f(i5)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C1383a0(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 3:
                return new C4356g();
            case 4:
                return new C4355f(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                W w2 = PARSER;
                if (w2 != null) {
                    return w2;
                }
                synchronized (C4356g.class) {
                    try {
                        c1403u = PARSER;
                        if (c1403u == null) {
                            c1403u = new C1403u();
                            PARSER = c1403u;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return c1403u;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final InterfaceC1406x k() {
        return this.strings_;
    }
}
