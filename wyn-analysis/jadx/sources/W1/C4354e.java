package w1;

import A.AbstractC0213f;
import E5.Q;
import androidx.datastore.preferences.protobuf.A;
import androidx.datastore.preferences.protobuf.AbstractC1402t;
import androidx.datastore.preferences.protobuf.AbstractC1404v;
import androidx.datastore.preferences.protobuf.AbstractC1407y;
import androidx.datastore.preferences.protobuf.C1383a0;
import androidx.datastore.preferences.protobuf.C1391h;
import androidx.datastore.preferences.protobuf.C1396m;
import androidx.datastore.preferences.protobuf.C1403u;
import androidx.datastore.preferences.protobuf.InterfaceC1385b0;
import androidx.datastore.preferences.protobuf.M;
import androidx.datastore.preferences.protobuf.W;
import androidx.datastore.preferences.protobuf.Y;
import j$.util.DesugarCollections;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Map;

/* renamed from: w1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4354e extends AbstractC1404v {
    private static final C4354e DEFAULT_INSTANCE;
    private static volatile W PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private M preferences_ = M.f18149b;

    static {
        C4354e c4354e = new C4354e();
        DEFAULT_INSTANCE = c4354e;
        AbstractC1404v.h(C4354e.class, c4354e);
    }

    public static M i(C4354e c4354e) {
        M m10 = c4354e.preferences_;
        if (!m10.f18150a) {
            c4354e.preferences_ = m10.c();
        }
        return c4354e.preferences_;
    }

    public static C4352c k() {
        return (C4352c) ((AbstractC1402t) DEFAULT_INSTANCE.d(5));
    }

    public static C4354e l(FileInputStream fileInputStream) throws A {
        C4354e c4354e = DEFAULT_INSTANCE;
        C1391h c1391h = new C1391h(fileInputStream);
        C1396m c1396mA = C1396m.a();
        AbstractC1404v abstractC1404v = (AbstractC1404v) c4354e.d(4);
        try {
            Y y10 = Y.f18175c;
            y10.getClass();
            InterfaceC1385b0 interfaceC1385b0A = y10.a(abstractC1404v.getClass());
            G4.f fVar = c1391h.f18211b;
            if (fVar == null) {
                fVar = new G4.f();
                fVar.f4235c = 0;
                Charset charset = AbstractC1407y.f18274a;
                fVar.f4236d = c1391h;
                c1391h.f18211b = fVar;
            }
            interfaceC1385b0A.e(abstractC1404v, fVar, c1396mA);
            interfaceC1385b0A.a(abstractC1404v);
            if (abstractC1404v.g()) {
                return (C4354e) abstractC1404v;
            }
            throw new A(new Q().getMessage());
        } catch (IOException e7) {
            if (e7.getCause() instanceof A) {
                throw ((A) e7.getCause());
            }
            throw new A(e7.getMessage());
        } catch (RuntimeException e10) {
            if (e10.getCause() instanceof A) {
                throw ((A) e10.getCause());
            }
            throw e10;
        }
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
                return new C1383a0(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", AbstractC4353d.f47280a});
            case 3:
                return new C4354e();
            case 4:
                return new C4352c(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                W w2 = PARSER;
                if (w2 != null) {
                    return w2;
                }
                synchronized (C4354e.class) {
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

    public final Map j() {
        return DesugarCollections.unmodifiableMap(this.preferences_);
    }
}
