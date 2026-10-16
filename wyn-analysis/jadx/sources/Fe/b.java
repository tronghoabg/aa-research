package Fe;

import A.AbstractC0213f;
import A.e0;
import A7.AbstractC0279p0;
import Hf.v0;
import N.C0718d;
import N.C0732k;
import N.C0740o;
import N.D0;
import N.M;
import N.P;
import N.V;
import Va.M6;
import Wf.F;
import Xf.p;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import androidx.lifecycle.AbstractC1451o;
import androidx.lifecycle.EnumC1450n;
import androidx.lifecycle.InterfaceC1457v;
import com.moloco.sdk.internal.MolocoLogger;
import e0.C2465q;
import e0.z;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.io.StringWriter;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import jf.C3109i;
import jf.InterfaceC3108h;
import ka.C1;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.InterfaceC3333d;
import kotlin.reflect.KClass;
import kotlinx.serialization.json.JsonNull;
import nf.AbstractC3619a;
import of.AbstractC3745a;
import p9.C3783d;
import p9.C3789j;
import p9.EnumC3788i;
import p9.o;
import yc.C4592o;

/* loaded from: classes5.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static int f4078a = 5;

    public static final Class A(KClass kClass) {
        AbstractC3340k.e(kClass, "<this>");
        Class jClass = ((InterfaceC3333d) kClass).getJClass();
        if (jClass.isPrimitive()) {
            return jClass;
        }
        String name = jClass.getName();
        switch (name.hashCode()) {
            case -2056817302:
                if (name.equals("java.lang.Integer")) {
                    return Integer.TYPE;
                }
                return null;
            case -527879800:
                if (name.equals("java.lang.Float")) {
                    return Float.TYPE;
                }
                return null;
            case -515992664:
                if (name.equals("java.lang.Short")) {
                    return Short.TYPE;
                }
                return null;
            case 155276373:
                if (name.equals("java.lang.Character")) {
                    return Character.TYPE;
                }
                return null;
            case 344809556:
                if (name.equals("java.lang.Boolean")) {
                    return Boolean.TYPE;
                }
                return null;
            case 398507100:
                if (name.equals("java.lang.Byte")) {
                    return Byte.TYPE;
                }
                return null;
            case 398795216:
                if (name.equals("java.lang.Long")) {
                    return Long.TYPE;
                }
                return null;
            case 399092968:
                if (name.equals("java.lang.Void")) {
                    return Void.TYPE;
                }
                return null;
            case 761287205:
                if (name.equals("java.lang.Double")) {
                    return Double.TYPE;
                }
                return null;
            default:
                return null;
        }
    }

    public static final KClass B(Class cls) {
        AbstractC3340k.e(cls, "<this>");
        return H.f39741a.getOrCreateKotlinClass(cls);
    }

    public static final long C(Pf.i iVar) {
        AbstractC3340k.e(iVar, "<this>");
        return iVar.getBuffer().f9456c;
    }

    public static final long D(double d3) {
        return M(4294967296L, (float) d3);
    }

    public static final long E(int i5) {
        return M(4294967296L, i5);
    }

    public static String F() {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        String methodName = stackTrace[2].getMethodName();
        String className = stackTrace[2].getClassName();
        int lineNumber = stackTrace[2].getLineNumber();
        return className.substring(className.lastIndexOf(46) + 1) + ": " + methodName + "() [" + lineNumber + "] - ";
    }

    public static boolean G(p9.k kVar) {
        if (kVar instanceof C3789j) {
            return true;
        }
        boolean z2 = kVar instanceof C3783d;
        if (z2) {
            C3783d c3783d = (C3783d) kVar;
            Iterator it = c3783d.f43344a.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((p9.k) it.next()) instanceof C3783d) {
                        break;
                    }
                } else if (c3783d.e()) {
                    return true;
                }
            }
        }
        if (!z2) {
            return false;
        }
        C3783d c3783d2 = (C3783d) kVar;
        if (c3783d2.f43345b != 2) {
            return false;
        }
        for (p9.k kVar2 : DesugarCollections.unmodifiableList(c3783d2.f43344a)) {
            if (!(kVar2 instanceof C3789j)) {
                if (!(kVar2 instanceof C3783d)) {
                    return false;
                }
                C3783d c3783d3 = (C3783d) kVar2;
                Iterator it2 = c3783d3.f43344a.iterator();
                while (it2.hasNext()) {
                    if (((p9.k) it2.next()) instanceof C3783d) {
                        return false;
                    }
                }
                if (!c3783d3.e()) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final boolean H(long j8) {
        L0.k[] kVarArr = L0.j.f6809b;
        return (j8 & 1095216660480L) == 0;
    }

    public static void I(View view, int i5, int i10, int i11, int i12) {
        D9.e.c("\tdesired (w,h)", view.getMeasuredWidth(), view.getMeasuredHeight());
        if (view.getVisibility() == 8) {
            i5 = 0;
            i10 = 0;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(i5, i11), View.MeasureSpec.makeMeasureSpec(i10, i12));
        D9.e.c("\tactual (w,h)", view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public static void J(View view, int i5, int i10) {
        I(view, i5, i10, Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public static final long M(long j8, float f10) {
        long jFloatToIntBits = j8 | (Float.floatToIntBits(f10) & 4294967295L);
        L0.k[] kVarArr = L0.j.f6809b;
        return jFloatToIntBits;
    }

    /* JADX WARN: Code restructure failed: missing block: B:176:0x02ba, code lost:
    
        throw new java.lang.IllegalArgumentException("");
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0107, code lost:
    
        r2 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x010c, code lost:
    
        if (r8 == r23.length()) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0112, code lost:
    
        if (r3 == '+') goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0114, code lost:
    
        if (r3 == '-') goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0116, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0118, code lost:
    
        r3 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x011c, code lost:
    
        if (r8 == (r20 + r3)) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x011e, code lost:
    
        r6 = r18;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0194 A[LOOP:7: B:108:0x0192->B:109:0x0194, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x00ff A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0105 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:231:0x018d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0157 A[LOOP:5: B:97:0x0155->B:98:0x0157, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long N(java.lang.String r23) {
        /*
            Method dump skipped, instructions count: 778
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Fe.b.N(java.lang.String):long");
    }

    public static final void O(e0 e0Var, String str, Boolean bool) {
        F f10 = Xf.j.f16280a;
        e0Var.v(str, bool == null ? JsonNull.INSTANCE : new p(bool, false, null));
    }

    public static final void P(e0 e0Var, String key, String str) {
        AbstractC3340k.e(key, "key");
        e0Var.v(key, Xf.j.b(str));
    }

    public static void Q(Drawable drawable, int i5) {
        drawable.setTint(i5);
    }

    public static void R(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        AbstractC3340k.d(stringWriter.toString(), "toString(...)");
    }

    public static final long S(int i5, Cf.c unit) {
        AbstractC3340k.e(unit, "unit");
        return unit.compareTo(Cf.c.f2208d) <= 0 ? t(c.p(i5, unit, Cf.c.f2206b)) : T(i5, unit);
    }

    public static final long T(long j8, Cf.c unit) {
        AbstractC3340k.e(unit, "unit");
        Cf.c cVar = Cf.c.f2206b;
        long jP = c.p(4611686018426999999L, cVar, unit);
        if ((-jP) <= j8 && j8 <= jP) {
            return t(c.p(j8, unit, cVar));
        }
        Cf.c cVar2 = Cf.c.f2207c;
        if (unit.compareTo(cVar2) < 0) {
            return r(android.support.v4.media.session.b.T(c.o(j8, unit, cVar2), -4611686018427387903L, 4611686018427387903L));
        }
        long jSignum = Long.signum(j8);
        if (j8 < -9223372036854775807L) {
            j8 = -9223372036854775807L;
        }
        return r(c.q(Math.abs(j8), unit) * jSignum);
    }

    public static void U(String str) {
        if (f4078a > 4) {
            Log.v("RootBeer", F() + String.valueOf(str));
        }
    }

    public static ArrayList V(Throwable th) {
        ArrayList arrayList = new ArrayList(3);
        if (th instanceof C4592o) {
            C4592o c4592o = (C4592o) th;
            arrayList.add(c4592o.f48156a);
            arrayList.add(c4592o.getMessage());
            arrayList.add(c4592o.f48157b);
            return arrayList;
        }
        arrayList.add(th.toString());
        arrayList.add(th.getClass().getSimpleName());
        arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0200  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final h0.AbstractC2765c r24, final tf.a r25, Z.k r26, boolean r27, final java.lang.String r28, final long r29, long r31, long r33, e0.InterfaceC2442E r35, long r36, N.C0740o r38, final int r39, final int r40) {
        /*
            Method dump skipped, instructions count: 631
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Fe.b.a(h0.c, tf.a, Z.k, boolean, java.lang.String, long, long, long, e0.E, long, N.o, int, int):void");
    }

    public static final boolean b(com.moloco.sdk.internal.bidtoken.a aVar, long j8) {
        AbstractC3340k.e(aVar, "<this>");
        long millis = TimeUnit.SECONDS.toMillis(aVar.f28491a);
        long millis2 = TimeUnit.MINUTES.toMillis(2L);
        boolean z2 = j8 >= millis - millis2;
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        StringBuilder sbU = M6.u(j8, "[sbt] currentTimeInMillis: ", ", expirationTimeMillis: ");
        sbU.append(millis);
        M6.A(sbU, ", expiredThresholdMillis: ", millis2, ", expired: ");
        sbU.append(z2);
        MolocoLogger.debugBuildLog$default(molocoLogger, "ServerBidTokenCache", sbU.toString(), false, 4, null);
        return z2;
    }

    public static final long c(long j8, long j10) {
        if (j8 != 4611686018427387903L && j8 != -4611686018427387903L) {
            return (j10 == 4611686018427387903L || j10 == -4611686018427387903L) ? j10 : android.support.v4.media.session.b.T(j8 + j10, -4611686018427387903L, 4611686018427387903L);
        }
        if ((-4611686018427387903L >= j10 || j10 >= 4611686018427387903L) && (j10 ^ j8) < 0) {
            return 9223372036854759646L;
        }
        return j8;
    }

    public static void d(Throwable th, Throwable exception) {
        AbstractC3340k.e(th, "<this>");
        AbstractC3340k.e(exception, "exception");
        if (th != exception) {
            Integer num = AbstractC3745a.f42136a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(exception);
                return;
            }
            Method method = AbstractC3619a.f41176a;
            if (method != null) {
                method.invoke(th, exception);
            }
        }
    }

    public static p9.k e(p9.k kVar) {
        int i5;
        h(kVar);
        if (kVar instanceof C3789j) {
            return kVar;
        }
        C3783d c3783d = (C3783d) kVar;
        List listUnmodifiableList = DesugarCollections.unmodifiableList(c3783d.f43344a);
        if (listUnmodifiableList.size() == 1) {
            return e((p9.k) listUnmodifiableList.get(0));
        }
        Iterator it = c3783d.f43344a.iterator();
        while (it.hasNext()) {
            if (((p9.k) it.next()) instanceof C3783d) {
                ArrayList arrayList = new ArrayList();
                Iterator it2 = listUnmodifiableList.iterator();
                while (it2.hasNext()) {
                    arrayList.add(e((p9.k) it2.next()));
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it3 = arrayList.iterator();
                while (true) {
                    boolean zHasNext = it3.hasNext();
                    i5 = c3783d.f43345b;
                    if (!zHasNext) {
                        break;
                    }
                    p9.k kVar2 = (p9.k) it3.next();
                    if (kVar2 instanceof C3789j) {
                        arrayList2.add(kVar2);
                    } else if (kVar2 instanceof C3783d) {
                        C3783d c3783d2 = (C3783d) kVar2;
                        if (AbstractC0213f.b(c3783d2.f43345b, i5)) {
                            arrayList2.addAll(DesugarCollections.unmodifiableList(c3783d2.f43344a));
                        } else {
                            arrayList2.add(c3783d2);
                        }
                    }
                }
                return arrayList2.size() == 1 ? (p9.k) arrayList2.get(0) : new C3783d(i5, arrayList2);
            }
        }
        return c3783d;
    }

    public static C3783d f(C3789j c3789j, C3783d c3783d) {
        boolean zE = c3783d.e();
        ArrayList arrayList = c3783d.f43344a;
        if (zE) {
            List listSingletonList = Collections.singletonList(c3789j);
            ArrayList arrayList2 = new ArrayList(arrayList);
            arrayList2.addAll(listSingletonList);
            return new C3783d(c3783d.f43345b, arrayList2);
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it = DesugarCollections.unmodifiableList(arrayList).iterator();
        while (it.hasNext()) {
            arrayList3.add(g(c3789j, (p9.k) it.next()));
        }
        return new C3783d(2, arrayList3);
    }

    public static p9.k g(p9.k kVar, p9.k kVar2) {
        C3783d c3783d;
        C3783d c3783dF;
        h(kVar);
        h(kVar2);
        boolean z2 = kVar instanceof C3789j;
        if (z2 && (kVar2 instanceof C3789j)) {
            c3783dF = new C3783d(1, Arrays.asList((C3789j) kVar, (C3789j) kVar2));
        } else if (z2 && (kVar2 instanceof C3783d)) {
            c3783dF = f((C3789j) kVar, (C3783d) kVar2);
        } else if ((kVar instanceof C3783d) && (kVar2 instanceof C3789j)) {
            c3783dF = f((C3789j) kVar2, (C3783d) kVar);
        } else {
            C3783d c3783d2 = (C3783d) kVar;
            C3783d c3783d3 = (C3783d) kVar2;
            A6.c.z((DesugarCollections.unmodifiableList(c3783d2.f43344a).isEmpty() || DesugarCollections.unmodifiableList(c3783d3.f43344a).isEmpty()) ? false : true, "Found an empty composite filter", new Object[0]);
            boolean zE = c3783d2.e();
            int i5 = c3783d2.f43345b;
            if (zE && c3783d3.e()) {
                List listUnmodifiableList = DesugarCollections.unmodifiableList(c3783d3.f43344a);
                ArrayList arrayList = new ArrayList(c3783d2.f43344a);
                arrayList.addAll(listUnmodifiableList);
                c3783d = new C3783d(i5, arrayList);
            } else {
                C3783d c3783d4 = i5 == 2 ? c3783d2 : c3783d3;
                if (i5 == 2) {
                    c3783d2 = c3783d3;
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = DesugarCollections.unmodifiableList(c3783d4.f43344a).iterator();
                while (it.hasNext()) {
                    arrayList2.add(g((p9.k) it.next(), c3783d2));
                }
                c3783d = new C3783d(2, arrayList2);
            }
            c3783dF = c3783d;
        }
        return e(c3783dF);
    }

    public static void h(p9.k kVar) {
        A6.c.z((kVar instanceof C3789j) || (kVar instanceof C3783d), "Only field filters and composite filters are accepted.", new Object[0]);
    }

    public static final float i(long j8, long j10, long j11, float f10) {
        long jG = z.g(C2465q.a(j8, f10), j11);
        float fL = z.l(z.g(j10, jG)) + 0.05f;
        float fL2 = z.l(jG) + 0.05f;
        return Math.max(fL, fL2) / Math.min(fL, fL2);
    }

    public static final void j(long j8) {
        if (H(j8)) {
            throw new IllegalArgumentException("Cannot perform operation for Unspecified type.");
        }
    }

    public static void k(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    public static void l(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    public static void m(S1.h hVar) {
        if (hVar != null) {
            try {
                hVar.close();
            } catch (IOException unused) {
            }
        }
    }

    public static final V n(v0 v0Var, C0740o c0740o, int i5) {
        InterfaceC1457v interfaceC1457v = (InterfaceC1457v) c0740o.j(G1.f.f4156a);
        EnumC1450n enumC1450n = EnumC1450n.f18679d;
        C3109i c3109i = C3109i.f38759a;
        Object value = v0Var.getValue();
        AbstractC1451o lifecycle = interfaceC1457v.getLifecycle();
        int i10 = i5 & 14;
        int i11 = i5 << 3;
        int i12 = (i11 & 57344) | i10 | (i11 & 7168);
        Object[] objArr = {v0Var, lifecycle, enumC1450n, c3109i};
        boolean zG = ((((i12 & 7168) ^ 3072) > 2048 && c0740o.e(enumC1450n)) || (i12 & 3072) == 2048) | c0740o.g(lifecycle) | c0740o.g(c3109i) | c0740o.g(v0Var);
        Object objF = c0740o.F();
        Object obj = C0732k.f7800a;
        if (zG || objF == obj) {
            Object dVar = new G1.d(lifecycle, enumC1450n, c3109i, v0Var, null);
            c0740o.U(dVar);
            objF = dVar;
        }
        tf.p pVar = (tf.p) objF;
        Object objF2 = c0740o.F();
        if (objF2 == obj) {
            objF2 = C0718d.G(value, P.f7730f);
            c0740o.U(objF2);
        }
        V v2 = (V) objF2;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 4);
        boolean zG2 = c0740o.g(pVar);
        Object objF3 = c0740o.F();
        if (zG2 || objF3 == obj) {
            objF3 = new D0(pVar, v2, null);
            c0740o.U(objF3);
        }
        tf.p pVar2 = (tf.p) objF3;
        InterfaceC3108h interfaceC3108hH = c0740o.f7846b.h();
        boolean zE = false;
        for (Object obj2 : Arrays.copyOf(objArrCopyOf, objArrCopyOf.length)) {
            zE |= c0740o.e(obj2);
        }
        Object objF4 = c0740o.F();
        if (!zE && objF4 != obj) {
            return v2;
        }
        c0740o.U(new M(interfaceC3108hH, pVar2));
        return v2;
    }

    public static p9.k o(p9.k kVar) {
        h(kVar);
        if (kVar instanceof C3789j) {
            return kVar;
        }
        C3783d c3783d = (C3783d) kVar;
        if (DesugarCollections.unmodifiableList(c3783d.f43344a).size() == 1) {
            return o((p9.k) kVar.b().get(0));
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = DesugarCollections.unmodifiableList(c3783d.f43344a).iterator();
        while (it.hasNext()) {
            arrayList.add(o((p9.k) it.next()));
        }
        p9.k kVarE = e(new C3783d(c3783d.f43345b, arrayList));
        if (G(kVarE)) {
            return kVarE;
        }
        A6.c.z(kVarE instanceof C3783d, "field filters are already in DNF form.", new Object[0]);
        C3783d c3783d2 = (C3783d) kVarE;
        A6.c.z(c3783d2.e(), "Disjunction of filters all of which are already in DNF form is itself in DNF form.", new Object[0]);
        ArrayList arrayList2 = c3783d2.f43344a;
        A6.c.z(DesugarCollections.unmodifiableList(arrayList2).size() > 1, "Single-filter composite filters are already in DNF form.", new Object[0]);
        p9.k kVarG = (p9.k) DesugarCollections.unmodifiableList(arrayList2).get(0);
        for (int i5 = 1; i5 < DesugarCollections.unmodifiableList(arrayList2).size(); i5++) {
            kVarG = g(kVarG, (p9.k) DesugarCollections.unmodifiableList(arrayList2).get(i5));
        }
        return kVarG;
    }

    public static p9.k p(p9.k kVar) {
        h(kVar);
        ArrayList arrayList = new ArrayList();
        if (!(kVar instanceof C3789j)) {
            C3783d c3783d = (C3783d) kVar;
            Iterator it = DesugarCollections.unmodifiableList(c3783d.f43344a).iterator();
            while (it.hasNext()) {
                arrayList.add(p((p9.k) it.next()));
            }
            return new C3783d(c3783d.f43345b, arrayList);
        }
        if (!(kVar instanceof o)) {
            return kVar;
        }
        o oVar = (o) kVar;
        for (C1 c12 : oVar.f43372b.m().getValuesList()) {
            arrayList.add(C3789j.e(oVar.f43373c, EnumC3788i.EQUAL, c12));
        }
        return new C3783d(2, arrayList);
    }

    public static C4592o q(String str) {
        return new C4592o("channel-error", AbstractC0279p0.l("Unable to establish connection on channel: ", str, "."), "");
    }

    public static final long r(long j8) {
        long j10 = (j8 << 1) + 1;
        Cf.a.f2200b.getClass();
        int i5 = Cf.b.f2205a;
        return j10;
    }

    public static final long s(long j8) {
        return (-4611686018426L > j8 || j8 >= 4611686018427L) ? r(android.support.v4.media.session.b.T(j8, -4611686018427387903L, 4611686018427387903L)) : t(j8 * 1000000);
    }

    public static final long t(long j8) {
        Cf.h hVar = Cf.a.f2200b;
        long j10 = j8 << 1;
        int i5 = Cf.b.f2205a;
        return j10;
    }

    public static void u(Serializable serializable) {
        if (f4078a > 0) {
            Log.e("RootBeer", F() + String.valueOf(serializable));
            Log.e("QLog", F() + String.valueOf(serializable));
        }
    }

    public static boolean v(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int w(double d3, double d5) {
        if (d3 < d5) {
            return -1;
        }
        if (d3 > d5) {
            return 1;
        }
        if (d3 == d5) {
            return 0;
        }
        if (Double.isNaN(d5)) {
            return !Double.isNaN(d3) ? 1 : 0;
        }
        return -1;
    }

    public static final KClass x(Annotation annotation) {
        AbstractC3340k.e(annotation, "<this>");
        Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
        AbstractC3340k.d(clsAnnotationType, "annotationType(...)");
        KClass kClassB = B(clsAnnotationType);
        AbstractC3340k.c(kClassB, "null cannot be cast to non-null type kotlin.reflect.KClass<out T of kotlin.jvm.JvmClassMappingKt.<get-annotationClass>>");
        return kClassB;
    }

    public static final Class y(KClass kClass) {
        AbstractC3340k.e(kClass, "<this>");
        Class jClass = ((InterfaceC3333d) kClass).getJClass();
        AbstractC3340k.c(jClass, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return jClass;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final Class z(KClass kClass) {
        AbstractC3340k.e(kClass, "<this>");
        Class jClass = ((InterfaceC3333d) kClass).getJClass();
        if (!jClass.isPrimitive()) {
            return jClass;
        }
        String name = jClass.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (!name.equals("double")) {
                }
                break;
            case 104431:
                if (!name.equals("int")) {
                }
                break;
            case 3039496:
                if (!name.equals("byte")) {
                }
                break;
            case 3052374:
                if (!name.equals("char")) {
                }
                break;
            case 3327612:
                if (!name.equals("long")) {
                }
                break;
            case 3625364:
                if (!name.equals("void")) {
                }
                break;
            case 64711720:
                if (!name.equals("boolean")) {
                }
                break;
            case 97526364:
                if (!name.equals("float")) {
                }
                break;
            case 109413500:
                if (!name.equals("short")) {
                }
                break;
        }
        return jClass;
    }

    public abstract void K(int i5);

    public abstract void L(Typeface typeface, boolean z2);
}
