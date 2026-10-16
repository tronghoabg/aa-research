package defpackage;

import defpackage.ejh;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class ejc<T extends ejh> {
    public static final ejc a = new ejc(null);
    public final ekv b = new ekr();
    private boolean c;

    private ejc(byte[] bArr) {
        d();
        d();
    }

    public static int a(ell ellVar, int i, Object obj) {
        int iNumberOfLeadingZeros;
        int iH;
        int iNumberOfLeadingZeros2;
        int iNumberOfLeadingZeros3;
        int i2;
        boolean z = eiw.e;
        int iNumberOfLeadingZeros4 = (352 - (Integer.numberOfLeadingZeros(i << 3) * 9)) >>> 6;
        if (ellVar == ell.GROUP) {
            iNumberOfLeadingZeros4 += iNumberOfLeadingZeros4;
        }
        elm elmVar = elm.a;
        int I = 4;
        switch (ellVar.ordinal()) {
            case 0:
                ((Double) obj).doubleValue();
                I = 8;
                return iNumberOfLeadingZeros4 + I;
            case 1:
                ((Float) obj).floatValue();
                return iNumberOfLeadingZeros4 + I;
            case 2:
                iNumberOfLeadingZeros = Long.numberOfLeadingZeros(((Long) obj).longValue());
                i2 = 640 - (iNumberOfLeadingZeros * 9);
                I = i2 >>> 6;
                return iNumberOfLeadingZeros4 + I;
            case 3:
                iNumberOfLeadingZeros = Long.numberOfLeadingZeros(((Long) obj).longValue());
                i2 = 640 - (iNumberOfLeadingZeros * 9);
                I = i2 >>> 6;
                return iNumberOfLeadingZeros4 + I;
            case 4:
                I = eiw.I(((Integer) obj).intValue());
                return iNumberOfLeadingZeros4 + I;
            case 5:
                ((Long) obj).longValue();
                I = 8;
                return iNumberOfLeadingZeros4 + I;
            case 6:
                ((Integer) obj).intValue();
                return iNumberOfLeadingZeros4 + I;
            case 7:
                ((Boolean) obj).booleanValue();
                I = 1;
                return iNumberOfLeadingZeros4 + I;
            case 8:
                I = obj instanceof eip ? eiw.F((eip) obj) : eiw.N((String) obj);
                return iNumberOfLeadingZeros4 + I;
            case 9:
                I = ((eke) obj).h();
                return iNumberOfLeadingZeros4 + I;
            case 10:
                if (obj instanceof ejr) {
                    I = ((ejr) obj).a();
                    return iNumberOfLeadingZeros4 + I;
                }
                iH = ((eke) obj).h();
                iNumberOfLeadingZeros2 = Integer.numberOfLeadingZeros(iH);
                I = ((352 - (iNumberOfLeadingZeros2 * 9)) >>> 6) + iH;
                return iNumberOfLeadingZeros4 + I;
            case 11:
                if (obj instanceof eip) {
                    I = eiw.F((eip) obj);
                    return iNumberOfLeadingZeros4 + I;
                }
                iH = ((byte[]) obj).length;
                iNumberOfLeadingZeros2 = Integer.numberOfLeadingZeros(iH);
                I = ((352 - (iNumberOfLeadingZeros2 * 9)) >>> 6) + iH;
                return iNumberOfLeadingZeros4 + I;
            case 12:
                iNumberOfLeadingZeros3 = Integer.numberOfLeadingZeros(((Integer) obj).intValue());
                i2 = 352 - (iNumberOfLeadingZeros3 * 9);
                I = i2 >>> 6;
                return iNumberOfLeadingZeros4 + I;
            case 13:
                I = obj instanceof ejk ? eiw.I(((ejk) obj).a()) : eiw.I(((Integer) obj).intValue());
                return iNumberOfLeadingZeros4 + I;
            case 14:
                ((Integer) obj).intValue();
                return iNumberOfLeadingZeros4 + I;
            case 15:
                ((Long) obj).longValue();
                I = 8;
                return iNumberOfLeadingZeros4 + I;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                iNumberOfLeadingZeros3 = Integer.numberOfLeadingZeros((iIntValue + iIntValue) ^ (iIntValue >> 31));
                i2 = 352 - (iNumberOfLeadingZeros3 * 9);
                I = i2 >>> 6;
                return iNumberOfLeadingZeros4 + I;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                iNumberOfLeadingZeros = Long.numberOfLeadingZeros((jLongValue + jLongValue) ^ (jLongValue >> 63));
                i2 = 640 - (iNumberOfLeadingZeros * 9);
                I = i2 >>> 6;
                return iNumberOfLeadingZeros4 + I;
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static void f(eiw eiwVar, ell ellVar, int i, Object obj) throws IOException {
        if (ellVar == ell.GROUP) {
            eiwVar.x(i, 3);
            ((eke) obj).r(eiwVar);
            eiwVar.x(i, 4);
            return;
        }
        eiwVar.x(i, ellVar.t);
        elm elmVar = elm.a;
        switch (ellVar.ordinal()) {
            case 0:
                eiwVar.S(((Double) obj).doubleValue());
                break;
            case 1:
                eiwVar.U(((Float) obj).floatValue());
                break;
            case 2:
                eiwVar.B(((Long) obj).longValue());
                break;
            case 3:
                eiwVar.B(((Long) obj).longValue());
                break;
            case 4:
                eiwVar.r(((Integer) obj).intValue());
                break;
            case 5:
                eiwVar.p(((Long) obj).longValue());
                break;
            case 6:
                eiwVar.n(((Integer) obj).intValue());
                break;
            case 7:
                eiwVar.i(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof eip)) {
                    eiwVar.w((String) obj);
                    break;
                } else {
                    eiwVar.l((eip) obj);
                    break;
                }
            case 9:
                ((eke) obj).r(eiwVar);
                break;
            case 10:
                eiwVar.s((eke) obj);
                break;
            case 11:
                if (!(obj instanceof eip)) {
                    byte[] bArr = (byte[]) obj;
                    eiwVar.C(bArr, bArr.length);
                    break;
                } else {
                    eiwVar.l((eip) obj);
                    break;
                }
            case 12:
                eiwVar.z(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof ejk)) {
                    eiwVar.r(((Integer) obj).intValue());
                    break;
                } else {
                    eiwVar.r(((ejk) obj).a());
                    break;
                }
            case 14:
                eiwVar.n(((Integer) obj).intValue());
                break;
            case 15:
                eiwVar.p(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                eiwVar.z((iIntValue + iIntValue) ^ (iIntValue >> 31));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                eiwVar.B((jLongValue + jLongValue) ^ (jLongValue >> 63));
                break;
        }
    }

    private static boolean i(Map.Entry entry) {
        throw null;
    }

    public final int b(Map.Entry entry) {
        entry.getValue();
        throw null;
    }

    public final Iterator c() {
        return g() ? Collections.emptyIterator() : this.b.entrySet().iterator();
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        ejc ejcVar = new ejc();
        ekv ekvVar = this.b;
        if (ekvVar.b > 0) {
            eks eksVar = (eks) ekvVar.d(0);
            Object obj = eksVar.b;
            throw null;
        }
        Iterator it = ekvVar.a().iterator();
        if (!it.hasNext()) {
            return ejcVar;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getValue();
        throw null;
    }

    public final void d() {
        if (this.c) {
            return;
        }
        ekv ekvVar = this.b;
        int i = ekvVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = ((eks) ekvVar.d(i2)).b;
            if (obj instanceof eji) {
                ((eji) obj).n();
            }
        }
        Iterator it = ekvVar.a().iterator();
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            if (value instanceof eji) {
                ((eji) value).n();
            }
        }
        if (!ekvVar.d) {
            if (ekvVar.b > 0) {
                throw null;
            }
            Iterator it2 = ekvVar.a().iterator();
            if (it2.hasNext()) {
                throw null;
            }
        }
        if (!ekvVar.d) {
            ekvVar.c = ekvVar.c.isEmpty() ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(ekvVar.c);
            ekvVar.e = ekvVar.e.isEmpty() ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(ekvVar.e);
            ekvVar.d = true;
        }
        this.c = true;
    }

    public final void e(Map.Entry entry) {
        entry.getValue();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ejc) {
            return this.b.equals(((ejc) obj).b);
        }
        return false;
    }

    final boolean g() {
        return this.b.isEmpty();
    }

    public final boolean h() {
        ekv ekvVar = this.b;
        int i = ekvVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            if (!i(ekvVar.d(i2))) {
                return false;
            }
        }
        Iterator it = ekvVar.a().iterator();
        while (it.hasNext()) {
            if (!i((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    private ejc() {
    }
}
