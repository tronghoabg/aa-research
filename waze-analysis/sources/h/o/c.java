package h.o;

import androidx.media3.common.C;
import h.a.r;
import h.ab;
import h.g.b.ar;
import h.g.b.as;
import h.g.b.at;
import h.g.b.k;
import h.g.b.m;
import h.g.b.o;
import h.g.b.p;
import h.g.b.x;
import h.g.b.z;
import h.k.n;
import h.s;
import h.u;
import h.v;
import h.w;
import h.y;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import kotlinx.b.a.q;
import kotlinx.b.c.ad;
import kotlinx.b.c.bh;
import kotlinx.b.c.bk;
import kotlinx.b.c.cd;
import kotlinx.b.c.cm;
import kotlinx.b.c.cp;
import kotlinx.b.c.cs;
import kotlinx.b.c.cv;
import kotlinx.b.c.cx;
import kotlinx.b.c.cy;
import kotlinx.b.c.j;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class c {
    public static final /* synthetic */ long d(long j2) {
        c cVar = a.f48264a;
        int i2 = b.f48269a;
        return j2 + j2;
    }

    public static final /* synthetic */ long e(long j2) {
        if (j2 < -4611686018426999999L || j2 >= 4611686018427000000L) {
            return r(v(j2));
        }
        c cVar = a.f48264a;
        int i2 = b.f48269a;
        return j2 + j2;
    }

    public static final long h(double d2, d dVar) {
        x.f(dVar, "unit");
        double dK = h.c.a.h.k(d2, dVar, d.f48270a);
        if (Double.isNaN(dK)) {
            throw new IllegalArgumentException("Duration value cannot be NaN.");
        }
        long jC = h.h.a.c(dK);
        if (jC < -4611686018426999999L || jC >= 4611686018427000000L) {
            return s(h.h.a.c(h.c.a.h.k(d2, dVar, d.f48272c)));
        }
        c cVar = a.f48264a;
        int i2 = b.f48269a;
        return jC + jC;
    }

    public static final long i(int i2, d dVar) {
        x.f(dVar, "unit");
        long j2 = i2;
        if (dVar.compareTo(d.f48273d) > 0) {
            return j(j2, dVar);
        }
        long jM = h.c.a.h.m(j2, dVar, d.f48270a);
        c cVar = a.f48264a;
        int i3 = b.f48269a;
        return jM + jM;
    }

    public static final long j(long j2, d dVar) {
        x.f(dVar, "unit");
        d dVar2 = d.f48270a;
        long jM = h.c.a.h.m(4611686018426999999L, dVar2, dVar);
        if ((-jM) > j2 || j2 > jM) {
            d dVar3 = d.f48272c;
            return dVar.compareTo(dVar3) >= 0 ? r(Long.signum(j2) * h.c.a.h.n(Math.abs(n.k(j2, C.TIME_UNSET)), dVar)) : r(n.n(h.c.a.h.l(j2, dVar, dVar3), -4611686018427387903L, 4611686018427387903L));
        }
        long jM2 = h.c.a.h.m(j2, dVar, dVar2);
        c cVar = a.f48264a;
        int i2 = b.f48269a;
        return jM2 + jM2;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:42:0x008c
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:195)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:62)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:124)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x023b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ long k(java.lang.String r24) {
        /*
            Method dump skipped, instructions count: 664
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h.o.c.k(java.lang.String):long");
    }

    public static final long l(String str) {
        x.f(str, "value");
        try {
            long jK = k(str);
            if (a.A(jK, a.f48267d)) {
                throw new IllegalStateException("invariant failed");
            }
            return jK;
        } catch (IllegalArgumentException e2) {
            throw new IllegalArgumentException("Invalid ISO duration string format: '" + str + "'.", e2);
        }
    }

    public static final void m(int i2, int i3, q qVar) {
        x.f(qVar, "descriptor");
        ArrayList arrayList = new ArrayList();
        int i4 = (~i2) & i3;
        for (int i5 = 0; i5 < 32; i5++) {
            if ((i4 & 1) != 0) {
                arrayList.add(qVar.c(i5));
            }
            i4 >>>= 1;
        }
        String strD = qVar.d();
        x.f(arrayList, "missingFields");
        x.f(strD, "serialName");
        throw new kotlinx.b.c(arrayList, arrayList.size() == 1 ? "Field '" + ((String) arrayList.get(0)) + "' is required for type with serial name '" + strD + "', but it was missing" : "Fields " + arrayList + " are required for type with serial name '" + strD + "', but they were missing", null);
    }

    public static final Map n() {
        Map mapC = r.c();
        int i2 = ar.f48106a;
        mapC.put(new m(String.class), kotlinx.b.a.b.u(at.f48108a));
        mapC.put(new m(Character.TYPE), kotlinx.b.a.b.o(k.f48122a));
        mapC.put(new m(char[].class), kotlinx.b.a.b.e());
        mapC.put(new m(Double.TYPE), kotlinx.b.a.b.p(p.f48126a));
        mapC.put(new m(double[].class), kotlinx.b.a.b.f());
        mapC.put(new m(Float.TYPE), kotlinx.b.a.b.q(h.g.b.q.f48127a));
        mapC.put(new m(float[].class), kotlinx.b.a.b.g());
        mapC.put(new m(Long.TYPE), kotlinx.b.a.b.s(z.f48129a));
        mapC.put(new m(long[].class), kotlinx.b.a.b.j());
        mapC.put(new m(v.class), kotlinx.b.a.b.x(v.f48301a));
        mapC.put(new m(Integer.TYPE), kotlinx.b.a.b.r(h.g.b.v.f48128a));
        mapC.put(new m(int[].class), kotlinx.b.a.b.h());
        mapC.put(new m(s.class), kotlinx.b.a.b.w(s.f48295a));
        mapC.put(new m(Short.TYPE), kotlinx.b.a.b.t(as.f48107a));
        mapC.put(new m(short[].class), cd.f51033a);
        mapC.put(new m(y.class), kotlinx.b.a.b.y(y.f48305a));
        mapC.put(new m(Byte.TYPE), kotlinx.b.a.b.n(h.g.b.h.f48120a));
        mapC.put(new m(byte[].class), j.f51082a);
        mapC.put(new m(h.q.class), kotlinx.b.a.b.v(h.q.f48292a));
        mapC.put(new m(Boolean.TYPE), kotlinx.b.a.b.m(h.g.b.g.f48119a));
        mapC.put(new m(boolean[].class), kotlinx.b.a.b.d());
        m mVar = new m(ab.class);
        x.f(ab.f48028a, "<this>");
        mapC.put(mVar, cx.f51070a);
        mapC.put(new m(Void.class), bk.f50997a);
        try {
            m mVar2 = new m(a.class);
            x.f(a.f48264a, "<this>");
            mapC.put(mVar2, ad.f50948a);
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        try {
            mapC.put(new m(w.class), cs.f51062a);
        } catch (ClassNotFoundException | NoClassDefFoundError unused2) {
        }
        try {
            mapC.put(new m(u.class), cp.f51057a);
        } catch (ClassNotFoundException | NoClassDefFoundError unused3) {
        }
        try {
            mapC.put(new m(h.z.class), cv.f51067a);
        } catch (ClassNotFoundException | NoClassDefFoundError unused4) {
        }
        try {
            mapC.put(new m(h.r.class), cm.f51052a);
        } catch (ClassNotFoundException | NoClassDefFoundError unused5) {
        }
        try {
            m mVar3 = new m(h.p.a.class);
            x.f(h.p.a.f48286a, "<this>");
            mapC.put(mVar3, cy.f51072a);
        } catch (ClassNotFoundException | NoClassDefFoundError unused6) {
        }
        return r.b(mapC);
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlinx.b.b o(h.l.c r13, kotlinx.b.b... r14) throws java.lang.IllegalAccessException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h.o.c.o(h.l.c, kotlinx.b.b[]):kotlinx.b.b");
    }

    public static final boolean p(h.l.c cVar) {
        x.f(cVar, "<this>");
        return o.w(cVar).isInterface();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long q(long j2, long j3) {
        if (j2 != 4611686018427387903L && j2 != -4611686018427387903L) {
            return (j3 == 4611686018427387903L || j3 == -4611686018427387903L) ? j3 : n.n(j2 + j3, -4611686018427387903L, 4611686018427387903L);
        }
        if ((j3 <= -4611686018427387903L || j3 >= 4611686018427387903L) && (j3 ^ j2) < 0) {
            return 9223372036854759646L;
        }
        return j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long r(long j2) {
        c cVar = a.f48264a;
        int i2 = b.f48269a;
        return j2 + j2 + 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long s(long j2) {
        if (j2 < -4611686018426L || j2 >= 4611686018427L) {
            return r(n.n(j2, -4611686018427387903L, 4611686018427387903L));
        }
        c cVar = a.f48264a;
        int i2 = b.f48269a;
        long jU = u(j2);
        return jU + jU;
    }

    private static final long t(long j2, d dVar) {
        double d2;
        d dVar2 = d.f48270a;
        switch (dVar.ordinal()) {
            case 0:
                d2 = 1.0E-15d;
                break;
            case 1:
                d2 = 1.0E-12d;
                break;
            case 2:
                d2 = 1.0E-9d;
                break;
            case 3:
                d2 = 1.0E-6d;
                break;
            case 4:
                d2 = 6.0E-5d;
                break;
            case 5:
                d2 = 0.0036d;
                break;
            case 6:
                d2 = 0.0864d;
                break;
            default:
                Objects.toString(dVar);
                throw new IllegalStateException("Unknown unit: ".concat(String.valueOf(dVar)));
        }
        return h.h.a.c(j2 * d2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long u(long j2) {
        return j2 * 1000000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long v(long j2) {
        return j2 / 1000000;
    }

    private static final Object w(Class cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField.get(null);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static final kotlinx.b.b x(Class cls, kotlinx.b.b... bVarArr) {
        Class<?> cls2;
        Object objW;
        Field field;
        kotlinx.b.b bVarY;
        Class<?>[] declaredClasses = cls.getDeclaredClasses();
        x.e(declaredClasses, "getDeclaredClasses(...)");
        Class<?>[] clsArr = declaredClasses;
        int length = clsArr.length;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                cls2 = null;
                break;
            }
            cls2 = clsArr[i3];
            if (cls2.getAnnotation(bh.class) != null) {
                break;
            }
            i3++;
        }
        Class<?> cls3 = cls2;
        if (cls3 == null) {
            objW = null;
        } else {
            String simpleName = cls3.getSimpleName();
            x.e(simpleName, "getSimpleName(...)");
            objW = w(cls, simpleName);
        }
        if (objW != null && (bVarY = y(objW, (kotlinx.b.b[]) Arrays.copyOf(bVarArr, bVarArr.length))) != null) {
            return bVarY;
        }
        try {
            Class<?>[] declaredClasses2 = cls.getDeclaredClasses();
            x.e(declaredClasses2, "getDeclaredClasses(...)");
            Class<?>[] clsArr2 = declaredClasses2;
            int length2 = clsArr2.length;
            boolean z = false;
            Class<?> cls4 = null;
            while (true) {
                if (i2 >= length2) {
                    if (!z) {
                        break;
                    }
                } else {
                    Class<?> cls5 = clsArr2[i2];
                    if (x.n(cls5.getSimpleName(), "$serializer")) {
                        if (z) {
                            break;
                        }
                        z = true;
                        cls4 = cls5;
                    }
                    i2++;
                }
            }
            cls4 = null;
            Class<?> cls6 = cls4;
            Object obj = (cls6 == null || (field = cls6.getField("INSTANCE")) == null) ? null : field.get(null);
            if (obj instanceof kotlinx.b.b) {
                return (kotlinx.b.b) obj;
            }
        } catch (NoSuchFieldException unused) {
        }
        return null;
    }

    private static final kotlinx.b.b y(Object obj, kotlinx.b.b... bVarArr) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Class[] clsArr;
        try {
            int length = bVarArr.length;
            if (length == 0) {
                clsArr = new Class[0];
            } else {
                Class[] clsArr2 = new Class[length];
                for (int i2 = 0; i2 < length; i2++) {
                    clsArr2[i2] = kotlinx.b.b.class;
                }
                clsArr = clsArr2;
            }
            Object objInvoke = obj.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(obj, Arrays.copyOf(bVarArr, bVarArr.length));
            if (objInvoke instanceof kotlinx.b.b) {
                return (kotlinx.b.b) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause == null) {
                throw e2;
            }
            String message = cause.getMessage();
            if (message == null) {
                message = e2.getMessage();
            }
            throw new InvocationTargetException(cause, message);
        }
    }
}
