package com.google.v;

import com.google.v.dg;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class dh<T extends dg<T>> {

    /* renamed from: d, reason: collision with root package name */
    private static final dh f12846d = new dh(null);

    /* renamed from: a, reason: collision with root package name */
    final fz f12847a = new fv();

    /* renamed from: b, reason: collision with root package name */
    boolean f12848b;

    /* renamed from: c, reason: collision with root package name */
    boolean f12849c;

    private dh(byte[] bArr) {
        l();
        l();
    }

    static int a(gm gmVar, int i2, Object obj) {
        int iU = ae.U(i2);
        if (gmVar == gm.GROUP) {
            iU += iU;
        }
        return iU + b(gmVar, obj);
    }

    static int b(gm gmVar, Object obj) {
        gm gmVar2 = gm.DOUBLE;
        gn gnVar = gn.f13022a;
        switch (gmVar) {
            case DOUBLE:
                ((Double) obj).doubleValue();
                return 8;
            case FLOAT:
                ((Float) obj).floatValue();
                return 4;
            case INT64:
                return ae.Y(((Long) obj).longValue());
            case UINT64:
                return ae.Y(((Long) obj).longValue());
            case INT32:
                return ae.J(((Integer) obj).intValue());
            case FIXED64:
                ((Long) obj).longValue();
                return 8;
            case FIXED32:
                ((Integer) obj).intValue();
                return 4;
            case BOOL:
                ((Boolean) obj).booleanValue();
                return 1;
            case STRING:
                return obj instanceof v ? ae.G((v) obj) : ae.T((String) obj);
            case GROUP:
                return ((fi) obj).getSerializedSize();
            case MESSAGE:
                return obj instanceof es ? ((es) obj).a() : ae.M((fi) obj);
            case BYTES:
                return obj instanceof v ? ae.G((v) obj) : ae.L(((byte[]) obj).length);
            case UINT32:
                return ae.W(((Integer) obj).intValue());
            case ENUM:
                return obj instanceof eg ? ae.J(((eg) obj).getNumber()) : ae.J(((Integer) obj).intValue());
            case SFIXED32:
                ((Integer) obj).intValue();
                return 4;
            case SFIXED64:
                ((Long) obj).longValue();
                return 8;
            case SINT32:
                return ae.P(((Integer) obj).intValue());
            case SINT64:
                return ae.R(((Long) obj).longValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int c(dg dgVar, Object obj) {
        gm gmVarB = dgVar.b();
        int iA = dgVar.a();
        if (!dgVar.g()) {
            return a(gmVarB, iA, obj);
        }
        List list = (List) obj;
        int size = list.size();
        int i2 = 0;
        if (!dgVar.f()) {
            int iA2 = 0;
            while (i2 < size) {
                iA2 += a(gmVarB, iA, list.get(i2));
                i2++;
            }
            return iA2;
        }
        if (list.isEmpty()) {
            return 0;
        }
        int iB = 0;
        while (i2 < size) {
            iB += b(gmVarB, list.get(i2));
            i2++;
        }
        return ae.U(iA) + iB + ae.W(iB);
    }

    static int f(gm gmVar, boolean z) {
        if (z) {
            return 2;
        }
        return gmVar.a();
    }

    public static dh h() {
        return f12846d;
    }

    static void p(ae aeVar, gm gmVar, int i2, Object obj) {
        if (gmVar == gm.GROUP) {
            aeVar.t(i2, 3);
            aeVar.ai((fi) obj);
            aeVar.t(i2, 4);
        }
        aeVar.t(i2, f(gmVar, false));
        gn gnVar = gn.f13022a;
        switch (gmVar) {
            case DOUBLE:
                aeVar.af(((Double) obj).doubleValue());
                break;
            case FLOAT:
                aeVar.ah(((Float) obj).floatValue());
                break;
            case INT64:
                aeVar.x(((Long) obj).longValue());
                break;
            case UINT64:
                aeVar.x(((Long) obj).longValue());
                break;
            case INT32:
                aeVar.n(((Integer) obj).intValue());
                break;
            case FIXED64:
                aeVar.l(((Long) obj).longValue());
                break;
            case FIXED32:
                aeVar.j(((Integer) obj).intValue());
                break;
            case BOOL:
                aeVar.d(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case STRING:
                if (!(obj instanceof v)) {
                    aeVar.s((String) obj);
                    break;
                } else {
                    aeVar.h((v) obj);
                    break;
                }
            case GROUP:
                aeVar.ai((fi) obj);
                break;
            case MESSAGE:
                aeVar.o((fi) obj);
                break;
            case BYTES:
                if (!(obj instanceof v)) {
                    byte[] bArr = (byte[]) obj;
                    aeVar.y(bArr, bArr.length);
                    break;
                } else {
                    aeVar.h((v) obj);
                    break;
                }
            case UINT32:
                aeVar.v(((Integer) obj).intValue());
                break;
            case ENUM:
                if (!(obj instanceof eg)) {
                    aeVar.n(((Integer) obj).intValue());
                    break;
                } else {
                    aeVar.n(((eg) obj).getNumber());
                    break;
                }
            case SFIXED32:
                aeVar.j(((Integer) obj).intValue());
                break;
            case SFIXED64:
                aeVar.l(((Long) obj).longValue());
                break;
            case SINT32:
                aeVar.ak(((Integer) obj).intValue());
                break;
            case SINT64:
                aeVar.am(((Long) obj).longValue());
                break;
        }
    }

    public static Object s(z zVar, gm gmVar) {
        gm gmVar2 = gm.DOUBLE;
        switch (gmVar) {
            case DOUBLE:
                return Double.valueOf(zVar.b());
            case FLOAT:
                return Float.valueOf(zVar.c());
            case INT64:
                return Long.valueOf(zVar.u());
            case UINT64:
                return Long.valueOf(zVar.A());
            case INT32:
                return Integer.valueOf(zVar.i());
            case FIXED64:
                return Long.valueOf(zVar.t());
            case FIXED32:
                return Integer.valueOf(zVar.h());
            case BOOL:
                return Boolean.valueOf(zVar.K());
            case STRING:
                return zVar.C();
            case GROUP:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case MESSAGE:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case BYTES:
                return zVar.B();
            case UINT32:
                return Integer.valueOf(zVar.r());
            case ENUM:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            case SFIXED32:
                return Integer.valueOf(zVar.o());
            case SFIXED64:
                return Long.valueOf(zVar.y());
            case SINT32:
                return Integer.valueOf(zVar.p());
            case SINT64:
                return Long.valueOf(zVar.z());
            default:
                throw new IllegalStateException("Unknown field type: ".concat(String.valueOf(String.valueOf(gmVar))));
        }
    }

    private static Object t(Object obj) {
        if (obj instanceof fn) {
            return ((fn) obj).a();
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

    private final void u(Map.Entry entry) {
        dg dgVar = (dg) entry.getKey();
        Object value = entry.getValue();
        boolean z = value instanceof es;
        if (dgVar.g()) {
            if (z) {
                throw new IllegalStateException("Lazy fields can not be repeated");
            }
            Object objI = i(dgVar);
            List list = (List) value;
            int size = list.size();
            if (objI == null) {
                objI = new ArrayList(size);
            }
            List list2 = (List) objI;
            for (int i2 = 0; i2 < size; i2++) {
                list2.add(t(list.get(i2)));
            }
            this.f12847a.put(dgVar, objI);
            return;
        }
        if (dgVar.c() != gn.f13030i) {
            if (z) {
                throw new IllegalStateException("Lazy fields must be message-valued");
            }
            this.f12847a.put(dgVar, t(value));
            return;
        }
        Object objI2 = i(dgVar);
        if (objI2 == null) {
            this.f12847a.put(dgVar, t(value));
            if (z) {
                this.f12849c = true;
                return;
            }
            return;
        }
        if (z) {
            value = ((es) value).c();
        }
        if (!dgVar.e(objI2)) {
            dgVar.d(objI2, value);
            return;
        }
        fh builder = ((fi) objI2).toBuilder();
        dgVar.d(builder, value);
        this.f12847a.put(dgVar, builder.build());
    }

    private static boolean v(Map.Entry entry) {
        dg dgVar = (dg) entry.getKey();
        if (dgVar.c() != gn.f13030i) {
            return true;
        }
        if (!dgVar.g()) {
            return w(entry.getValue());
        }
        List list = (List) entry.getValue();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!w(list.get(i2))) {
                return false;
            }
        }
        return true;
    }

    private static boolean w(Object obj) {
        if (obj instanceof fj) {
            return ((fj) obj).isInitialized();
        }
        if (obj instanceof es) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static final int x(Map.Entry entry) {
        int iV;
        int iU;
        int iM;
        dg dgVar = (dg) entry.getKey();
        Object value = entry.getValue();
        if (dgVar.c() != gn.f13030i || dgVar.g() || dgVar.f()) {
            return c(dgVar, value);
        }
        if (value instanceof es) {
            int iA = ((dg) entry.getKey()).a();
            int iU2 = ae.U(1);
            iV = iU2 + iU2 + ae.V(2, iA);
            iU = ae.U(3);
            iM = ((es) value).a();
        } else {
            int iA2 = ((dg) entry.getKey()).a();
            int iU3 = ae.U(1);
            iV = iU3 + iU3 + ae.V(2, iA2);
            iU = ae.U(3);
            iM = ae.M((fi) value);
        }
        return iV + iU + iM;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void y(com.google.v.dg r4, java.lang.Object r5) {
        /*
            com.google.v.gm r0 = r4.b()
            r5.getClass()
            com.google.v.gm r1 = com.google.v.gm.DOUBLE
            com.google.v.gn r1 = com.google.v.gn.f13022a
            com.google.v.gn r0 = r0.b()
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L41;
                case 1: goto L3e;
                case 2: goto L3b;
                case 3: goto L38;
                case 4: goto L35;
                case 5: goto L32;
                case 6: goto L29;
                case 7: goto L20;
                case 8: goto L17;
                default: goto L16;
            }
        L16:
            goto L46
        L17:
            boolean r0 = r5 instanceof com.google.v.fi
            if (r0 != 0) goto L45
            boolean r0 = r5 instanceof com.google.v.es
            if (r0 == 0) goto L46
            goto L45
        L20:
            boolean r0 = r5 instanceof java.lang.Integer
            if (r0 != 0) goto L45
            boolean r0 = r5 instanceof com.google.v.eg
            if (r0 == 0) goto L46
            goto L45
        L29:
            boolean r0 = r5 instanceof com.google.v.v
            if (r0 != 0) goto L45
            boolean r0 = r5 instanceof byte[]
            if (r0 == 0) goto L46
            goto L45
        L32:
            boolean r0 = r5 instanceof java.lang.String
            goto L43
        L35:
            boolean r0 = r5 instanceof java.lang.Boolean
            goto L43
        L38:
            boolean r0 = r5 instanceof java.lang.Double
            goto L43
        L3b:
            boolean r0 = r5 instanceof java.lang.Float
            goto L43
        L3e:
            boolean r0 = r5 instanceof java.lang.Long
            goto L43
        L41:
            boolean r0 = r5 instanceof java.lang.Integer
        L43:
            if (r0 == 0) goto L46
        L45:
            return
        L46:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            int r1 = r4.a()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            com.google.v.gm r4 = r4.b()
            com.google.v.gn r4 = r4.b()
            java.lang.Class r5 = r5.getClass()
            java.lang.String r5 = r5.getName()
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r1
            r1 = 1
            r2[r1] = r4
            r4 = 2
            r2[r4] = r5
            java.lang.String r4 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r4 = java.lang.String.format(r4, r2)
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.v.dh.y(com.google.v.dg, java.lang.Object):void");
    }

    public final int d() {
        fz fzVar = this.f12847a;
        int iC = fzVar.c();
        int iX = 0;
        for (int i2 = 0; i2 < iC; i2++) {
            iX += x(fzVar.f(i2));
        }
        Iterator it = fzVar.d().iterator();
        while (it.hasNext()) {
            iX += x((Map.Entry) it.next());
        }
        return iX;
    }

    public final int e() {
        fz fzVar = this.f12847a;
        int iC = fzVar.c();
        int iC2 = 0;
        for (int i2 = 0; i2 < iC; i2++) {
            Map.Entry entryF = fzVar.f(i2);
            iC2 += c(((fw) entryF).a(), entryF.getValue());
        }
        for (Map.Entry entry : fzVar.d()) {
            iC2 += c((dg) entry.getKey(), entry.getValue());
        }
        return iC2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dh)) {
            return false;
        }
        fz fzVar = this.f12847a;
        fz fzVar2 = ((dh) obj).f12847a;
        if (fzVar.size() != fzVar2.size() || !fzVar.keySet().equals(fzVar2.keySet())) {
            return false;
        }
        for (Map.Entry entry : fzVar.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            Object obj2 = fzVar2.get(key);
            if (!(value == obj2 ? true : (value == null || obj2 == null) ? false : value instanceof es ? value.equals(obj2) : obj2 instanceof es ? obj2.equals(value) : value.equals(obj2))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final dh clone() {
        dh dhVar = new dh();
        fz fzVar = this.f12847a;
        int iC = fzVar.c();
        for (int i2 = 0; i2 < iC; i2++) {
            Map.Entry entryF = fzVar.f(i2);
            dhVar.n(((fw) entryF).a(), entryF.getValue());
        }
        for (Map.Entry entry : fzVar.d()) {
            dhVar.n((dg) entry.getKey(), entry.getValue());
        }
        dhVar.f12849c = this.f12849c;
        return dhVar;
    }

    public final int hashCode() {
        return this.f12847a.hashCode();
    }

    public final Object i(dg dgVar) {
        Object obj = this.f12847a.get(dgVar);
        return obj instanceof es ? ((es) obj).c() : obj;
    }

    public final Iterator j() {
        if (q()) {
            return Collections.emptyIterator();
        }
        boolean z = this.f12849c;
        fz fzVar = this.f12847a;
        return z ? new er(fzVar.entrySet().iterator()) : fzVar.entrySet().iterator();
    }

    public final void k(dg dgVar, Object obj) {
        List arrayList;
        if (!((dr) dgVar).f12873d) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        y(dgVar, obj);
        Object objI = i(dgVar);
        if (objI == null) {
            arrayList = new ArrayList();
            this.f12847a.put(dgVar, arrayList);
        } else {
            arrayList = (List) objI;
        }
        arrayList.add(obj);
    }

    public final void l() {
        if (this.f12848b) {
            return;
        }
        fz fzVar = this.f12847a;
        int iC = fzVar.c();
        for (int i2 = 0; i2 < iC; i2++) {
            Object value = fzVar.f(i2).getValue();
            if (value instanceof du) {
                ((du) value).makeImmutable();
            }
        }
        Iterator it = fzVar.d().iterator();
        while (it.hasNext()) {
            Object value2 = ((Map.Entry) it.next()).getValue();
            if (value2 instanceof du) {
                ((du) value2).makeImmutable();
            }
        }
        fzVar.a();
        this.f12848b = true;
    }

    public final void m(dh dhVar) {
        fz fzVar = dhVar.f12847a;
        int iC = fzVar.c();
        for (int i2 = 0; i2 < iC; i2++) {
            u(fzVar.f(i2));
        }
        Iterator it = fzVar.d().iterator();
        while (it.hasNext()) {
            u((Map.Entry) it.next());
        }
    }

    public final void n(dg dgVar, Object obj) {
        if (!dgVar.g()) {
            y(dgVar, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            List list = (List) obj;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i2 = 0; i2 < size; i2++) {
                Object obj2 = list.get(i2);
                y(dgVar, obj2);
                arrayList.add(obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof es) {
            this.f12849c = true;
        }
        this.f12847a.put(dgVar, obj);
    }

    public final void o(dg dgVar, int i2, Object obj) {
        if (!((dr) dgVar).f12873d) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object objI = i(dgVar);
        if (objI == null) {
            throw new IndexOutOfBoundsException();
        }
        y(dgVar, obj);
        ((List) objI).set(i2, obj);
    }

    final boolean q() {
        return this.f12847a.isEmpty();
    }

    public final boolean r() {
        fz fzVar = this.f12847a;
        int iC = fzVar.c();
        for (int i2 = 0; i2 < iC; i2++) {
            if (!v(fzVar.f(i2))) {
                return false;
            }
        }
        Iterator it = fzVar.d().iterator();
        while (it.hasNext()) {
            if (!v((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    private dh() {
    }
}
