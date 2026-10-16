package androidx.datastore.preferences.protobuf;

import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* renamed from: androidx.datastore.preferences.protobuf.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1399p {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f18248c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final d0 f18249a = new d0(16);

    /* renamed from: b, reason: collision with root package name */
    public boolean f18250b;

    static {
        new C1399p(0);
    }

    public C1399p() {
    }

    public static void b(C1393j c1393j, A0 a02, int i5, Object obj) throws C1392i {
        if (a02 == A0.f18112d) {
            c1393j.R(i5, 3);
            ((AbstractC1382a) obj).c(c1393j);
            c1393j.R(i5, 4);
        }
        c1393j.R(i5, a02.f18116b);
        switch (a02.ordinal()) {
            case 0:
                c1393j.L(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                c1393j.J(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                c1393j.V(((Long) obj).longValue());
                break;
            case 3:
                c1393j.V(((Long) obj).longValue());
                break;
            case 4:
                c1393j.N(((Integer) obj).intValue());
                break;
            case 5:
                c1393j.L(((Long) obj).longValue());
                break;
            case 6:
                c1393j.J(((Integer) obj).intValue());
                break;
            case 7:
                c1393j.D(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof C1390g)) {
                    c1393j.Q((String) obj);
                    break;
                } else {
                    c1393j.H((C1390g) obj);
                    break;
                }
            case 9:
                ((AbstractC1382a) obj).c(c1393j);
                break;
            case 10:
                AbstractC1382a abstractC1382a = (AbstractC1382a) obj;
                c1393j.getClass();
                c1393j.T(abstractC1382a.a());
                abstractC1382a.c(c1393j);
                break;
            case 11:
                if (!(obj instanceof C1390g)) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    c1393j.T(length);
                    c1393j.E(bArr, 0, length);
                    break;
                } else {
                    c1393j.H((C1390g) obj);
                    break;
                }
            case 12:
                c1393j.T(((Integer) obj).intValue());
                break;
            case 13:
                c1393j.N(((Integer) obj).intValue());
                break;
            case 14:
                c1393j.J(((Integer) obj).intValue());
                break;
            case 15:
                c1393j.L(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                c1393j.T((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                c1393j.V((jLongValue >> 63) ^ (jLongValue << 1));
                break;
        }
    }

    public final void a() {
        if (this.f18250b) {
            return;
        }
        d0 d0Var = this.f18249a;
        if (!d0Var.f18196d) {
            if (d0Var.f18194b.size() > 0) {
                d0Var.d(0).getKey().getClass();
                throw new ClassCastException();
            }
            Iterator it = d0Var.e().iterator();
            if (it.hasNext()) {
                ((Map.Entry) it.next()).getKey().getClass();
                throw new ClassCastException();
            }
        }
        if (!d0Var.f18196d) {
            d0Var.f18195c = d0Var.f18195c.isEmpty() ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(d0Var.f18195c);
            d0Var.f18198f = d0Var.f18198f.isEmpty() ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(d0Var.f18198f);
            d0Var.f18196d = true;
        }
        this.f18250b = true;
    }

    public final Object clone() {
        C1399p c1399p = new C1399p();
        d0 d0Var = this.f18249a;
        if (d0Var.f18194b.size() > 0) {
            Map.Entry entryD = d0Var.d(0);
            if (entryD.getKey() != null) {
                throw new ClassCastException();
            }
            entryD.getValue();
            throw null;
        }
        Iterator it = d0Var.e().iterator();
        if (!it.hasNext()) {
            return c1399p;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (entry.getKey() != null) {
            throw new ClassCastException();
        }
        entry.getValue();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1399p) {
            return this.f18249a.equals(((C1399p) obj).f18249a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f18249a.hashCode();
    }

    public C1399p(int i5) {
        a();
        a();
    }
}
