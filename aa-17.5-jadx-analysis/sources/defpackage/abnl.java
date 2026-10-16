package defpackage;

import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class abnl {
    public static final abnl a = new abnl(null);
    final abpq b = new abpq();
    boolean c;
    boolean d;

    private abnl(byte[] bArr) {
        e();
        e();
    }

    public static int a(abqd abqdVar, int i, Object obj) throws abqc {
        int iNumberOfLeadingZeros;
        int iDV;
        int iNumberOfLeadingZeros2;
        int iNumberOfLeadingZeros3;
        int i2;
        int iNumberOfLeadingZeros4 = (352 - (Integer.numberOfLeadingZeros(i << 3) * 9)) >>> 6;
        if (abqdVar == abqd.GROUP) {
            iNumberOfLeadingZeros4 += iNumberOfLeadingZeros4;
        }
        abqe abqeVar = abqe.a;
        int iF = 4;
        switch (abqdVar) {
            case DOUBLE:
                ((Double) obj).doubleValue();
                iF = 8;
                return iNumberOfLeadingZeros4 + iF;
            case FLOAT:
                ((Float) obj).floatValue();
                return iNumberOfLeadingZeros4 + iF;
            case INT64:
                iNumberOfLeadingZeros = Long.numberOfLeadingZeros(((Long) obj).longValue());
                i2 = 640 - (iNumberOfLeadingZeros * 9);
                iF = i2 >>> 6;
                return iNumberOfLeadingZeros4 + iF;
            case UINT64:
                iNumberOfLeadingZeros = Long.numberOfLeadingZeros(((Long) obj).longValue());
                i2 = 640 - (iNumberOfLeadingZeros * 9);
                iF = i2 >>> 6;
                return iNumberOfLeadingZeros4 + iF;
            case INT32:
                iF = abnd.F(((Integer) obj).intValue());
                return iNumberOfLeadingZeros4 + iF;
            case FIXED64:
                ((Long) obj).longValue();
                iF = 8;
                return iNumberOfLeadingZeros4 + iF;
            case FIXED32:
                ((Integer) obj).intValue();
                return iNumberOfLeadingZeros4 + iF;
            case BOOL:
                ((Boolean) obj).booleanValue();
                iF = 1;
                return iNumberOfLeadingZeros4 + iF;
            case STRING:
                if (obj instanceof abms) {
                    iF = abnd.E((abms) obj);
                    return iNumberOfLeadingZeros4 + iF;
                }
                iDV = woy.dV((String) obj);
                iNumberOfLeadingZeros2 = Integer.numberOfLeadingZeros(iDV);
                iF = ((352 - (iNumberOfLeadingZeros2 * 9)) >>> 6) + iDV;
                return iNumberOfLeadingZeros4 + iF;
            case GROUP:
                iF = ((abow) obj).m();
                return iNumberOfLeadingZeros4 + iF;
            case MESSAGE:
                iF = obj instanceof abol ? ((abol) obj).a() : abnd.G((abow) obj);
                return iNumberOfLeadingZeros4 + iF;
            case BYTES:
                if (obj instanceof abms) {
                    iF = abnd.E((abms) obj);
                    return iNumberOfLeadingZeros4 + iF;
                }
                iDV = ((byte[]) obj).length;
                iNumberOfLeadingZeros2 = Integer.numberOfLeadingZeros(iDV);
                iF = ((352 - (iNumberOfLeadingZeros2 * 9)) >>> 6) + iDV;
                return iNumberOfLeadingZeros4 + iF;
            case UINT32:
                iNumberOfLeadingZeros3 = Integer.numberOfLeadingZeros(((Integer) obj).intValue());
                i2 = 352 - (iNumberOfLeadingZeros3 * 9);
                iF = i2 >>> 6;
                return iNumberOfLeadingZeros4 + iF;
            case ENUM:
                iF = obj instanceof abnz ? abnd.F(((abnz) obj).a()) : abnd.F(((Integer) obj).intValue());
                return iNumberOfLeadingZeros4 + iF;
            case SFIXED32:
                ((Integer) obj).intValue();
                return iNumberOfLeadingZeros4 + iF;
            case SFIXED64:
                ((Long) obj).longValue();
                iF = 8;
                return iNumberOfLeadingZeros4 + iF;
            case SINT32:
                int iIntValue = ((Integer) obj).intValue();
                iNumberOfLeadingZeros3 = Integer.numberOfLeadingZeros((iIntValue + iIntValue) ^ (iIntValue >> 31));
                i2 = 352 - (iNumberOfLeadingZeros3 * 9);
                iF = i2 >>> 6;
                return iNumberOfLeadingZeros4 + iF;
            case SINT64:
                long jLongValue = ((Long) obj).longValue();
                iNumberOfLeadingZeros = Long.numberOfLeadingZeros((jLongValue + jLongValue) ^ (jLongValue >> 63));
                i2 = 640 - (iNumberOfLeadingZeros * 9);
                iF = i2 >>> 6;
                return iNumberOfLeadingZeros4 + iF;
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static Object c(Object obj) {
        if (obj instanceof abpb) {
            return ((abpb) obj).a();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    public static void f(abnd abndVar, abqd abqdVar, int i, Object obj) throws IOException {
        if (abqdVar == abqd.GROUP) {
            abndVar.t(i, 3);
            ((abow) obj).R(abndVar);
            abndVar.t(i, 4);
            return;
        }
        abndVar.t(i, abqdVar.t);
        abqe abqeVar = abqe.a;
        switch (abqdVar) {
            case DOUBLE:
                abndVar.K(((Double) obj).doubleValue());
                break;
            case FLOAT:
                abndVar.M(((Float) obj).floatValue());
                break;
            case INT64:
                abndVar.x(((Long) obj).longValue());
                break;
            case UINT64:
                abndVar.x(((Long) obj).longValue());
                break;
            case INT32:
                abndVar.n(((Integer) obj).intValue());
                break;
            case FIXED64:
                abndVar.l(((Long) obj).longValue());
                break;
            case FIXED32:
                abndVar.j(((Integer) obj).intValue());
                break;
            case BOOL:
                abndVar.d(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case STRING:
                if (!(obj instanceof abms)) {
                    abndVar.s((String) obj);
                    break;
                } else {
                    abndVar.h((abms) obj);
                    break;
                }
            case GROUP:
                ((abow) obj).R(abndVar);
                break;
            case MESSAGE:
                abndVar.o((abow) obj);
                break;
            case BYTES:
                if (!(obj instanceof abms)) {
                    byte[] bArr = (byte[]) obj;
                    abndVar.y(bArr, bArr.length);
                    break;
                } else {
                    abndVar.h((abms) obj);
                    break;
                }
            case UINT32:
                abndVar.v(((Integer) obj).intValue());
                break;
            case ENUM:
                if (!(obj instanceof abnz)) {
                    abndVar.n(((Integer) obj).intValue());
                    break;
                } else {
                    abndVar.n(((abnz) obj).a());
                    break;
                }
            case SFIXED32:
                abndVar.j(((Integer) obj).intValue());
                break;
            case SFIXED64:
                abndVar.l(((Long) obj).longValue());
                break;
            case SINT32:
                int iIntValue = ((Integer) obj).intValue();
                abndVar.v((iIntValue + iIntValue) ^ (iIntValue >> 31));
                break;
            case SINT64:
                long jLongValue = ((Long) obj).longValue();
                abndVar.x((jLongValue + jLongValue) ^ (jLongValue >> 63));
                break;
        }
    }

    public static int i(abnu abnuVar, Object obj) {
        abqd abqdVar = abnuVar.c;
        int i = abnuVar.b;
        if (!abnuVar.d) {
            return a(abqdVar, i, obj);
        }
        List list = (List) obj;
        int size = list.size();
        int iA = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iA += a(abqdVar, i, list.get(i2));
        }
        return iA;
    }

    private static boolean n(Object obj) {
        if (obj instanceof abox) {
            return ((abox) obj).v();
        }
        if (obj instanceof abol) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void o(defpackage.abnu r4, java.lang.Object r5) {
        /*
            r5.getClass()
            abqd r0 = defpackage.abqd.DOUBLE
            abqe r0 = defpackage.abqe.a
            abqd r0 = r4.c
            abqe r0 = r0.s
            int r1 = r0.ordinal()
            switch(r1) {
                case 0: goto L3d;
                case 1: goto L3a;
                case 2: goto L37;
                case 3: goto L34;
                case 4: goto L31;
                case 5: goto L2e;
                case 6: goto L25;
                case 7: goto L1c;
                case 8: goto L13;
                default: goto L12;
            }
        L12:
            goto L42
        L13:
            boolean r1 = r5 instanceof defpackage.abow
            if (r1 != 0) goto L41
            boolean r1 = r5 instanceof defpackage.abol
            if (r1 == 0) goto L42
            goto L41
        L1c:
            boolean r1 = r5 instanceof java.lang.Integer
            if (r1 != 0) goto L41
            boolean r1 = r5 instanceof defpackage.abnz
            if (r1 == 0) goto L42
            goto L41
        L25:
            boolean r1 = r5 instanceof defpackage.abms
            if (r1 != 0) goto L41
            boolean r1 = r5 instanceof byte[]
            if (r1 == 0) goto L42
            goto L41
        L2e:
            boolean r1 = r5 instanceof java.lang.String
            goto L3f
        L31:
            boolean r1 = r5 instanceof java.lang.Boolean
            goto L3f
        L34:
            boolean r1 = r5 instanceof java.lang.Double
            goto L3f
        L37:
            boolean r1 = r5 instanceof java.lang.Float
            goto L3f
        L3a:
            boolean r1 = r5 instanceof java.lang.Long
            goto L3f
        L3d:
            boolean r1 = r5 instanceof java.lang.Integer
        L3f:
            if (r1 == 0) goto L42
        L41:
            return
        L42:
            int r4 = r4.b
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Class r5 = r5.getClass()
            java.lang.String r5 = r5.getName()
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            r4 = 1
            r2[r4] = r0
            r4 = 2
            r2[r4] = r5
            java.lang.String r4 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r4 = java.lang.String.format(r4, r2)
            r1.<init>(r4)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abnl.o(abnu, java.lang.Object):void");
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final abnl clone() {
        abnl abnlVar = new abnl();
        abpq abpqVar = this.b;
        int size = abpqVar.size();
        for (int i = 0; i < size; i++) {
            abpn abpnVar = (abpn) abpqVar.a(i);
            abnlVar.l(abpnVar.c, abpnVar.a);
        }
        abnlVar.d = this.d;
        return abnlVar;
    }

    public final Iterator d() {
        if (g()) {
            return Collections.emptyIterator();
        }
        boolean z = this.d;
        abpq abpqVar = this.b;
        return z ? new abok(abpqVar.entrySet().iterator()) : abpqVar.entrySet().iterator();
    }

    public final void e() {
        if (this.c) {
            return;
        }
        abpq abpqVar = this.b;
        int size = abpqVar.size();
        for (int i = 0; i < size; i++) {
            Object obj = ((abpn) abpqVar.a(i)).a;
            if (obj instanceof abnv) {
                ((abnv) obj).N();
            }
        }
        if (!abpqVar.c) {
            abpqVar.c();
            if (abpqVar.a != null) {
                for (int i2 = 0; i2 < abpqVar.b; i2++) {
                    abpn abpnVar = (abpn) abpqVar.a[i2];
                    if (abpnVar.c.d) {
                        abpnVar.setValue(DesugarCollections.unmodifiableList((List) abpnVar.a));
                    }
                }
            }
            abpqVar.c = true;
        }
        this.c = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof abnl)) {
            return false;
        }
        abpq abpqVar = this.b;
        abpq abpqVar2 = ((abnl) obj).b;
        if (abpqVar.size() != abpqVar2.size() || !abpqVar.keySet().equals(abpqVar2.keySet())) {
            return false;
        }
        for (Map.Entry entry : abpqVar.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            Object obj2 = abpqVar2.get(key);
            if (!(value == obj2 ? true : (value == null || obj2 == null) ? false : value instanceof abol ? value.equals(obj2) : obj2 instanceof abol ? obj2.equals(value) : value.equals(obj2))) {
                return false;
            }
        }
        return true;
    }

    final boolean g() {
        return this.b.isEmpty();
    }

    public final boolean h() {
        abpq abpqVar = this.b;
        int size = abpqVar.size();
        for (int i = 0; i < size; i++) {
            abpn abpnVar = (abpn) abpqVar.a(i);
            abnu abnuVar = abpnVar.c;
            if (abnuVar.a() == abqe.i) {
                if (abnuVar.d) {
                    List list = (List) abpnVar.a;
                    int size2 = list.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        if (!n(list.get(i2))) {
                            return false;
                        }
                    }
                } else if (!n(abpnVar.a)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final Object j(abnu abnuVar) {
        Object obj = this.b.get(abnuVar);
        return obj instanceof abol ? ((abol) obj).b() : obj;
    }

    public final void k(abnu abnuVar, Object obj) {
        List arrayList;
        if (!abnuVar.d) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        o(abnuVar, obj);
        Object objJ = j(abnuVar);
        if (objJ == null) {
            arrayList = new ArrayList();
            this.b.d(abnuVar, arrayList);
        } else {
            arrayList = (List) objJ;
        }
        arrayList.add(obj);
    }

    public final void l(abnu abnuVar, Object obj) {
        if (!abnuVar.d) {
            o(abnuVar, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            List list = (List) obj;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                Object obj2 = list.get(i);
                o(abnuVar, obj2);
                arrayList.add(obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof abol) {
            this.d = true;
        }
        this.b.d(abnuVar, obj);
    }

    public final boolean m(abnu abnuVar) {
        if (abnuVar.d) {
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }
        return this.b.get(abnuVar) != null;
    }

    private abnl() {
    }
}
