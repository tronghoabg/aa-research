package defpackage;

import android.view.ViewTreeObserver;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class aqk {
    public aqf a;
    public aom b;
    public api c;
    public boolean d;
    public final afdr e;
    public boolean f;
    public aiu j;
    public tp k;
    private final aqe m;
    public int g = 1;
    public apr h = apy.a;
    public final izj l = new izj(this);
    public final afec i = new acm(this, 17);

    public aqk(aqf aqfVar, aiu aiuVar, aom aomVar, api apiVar, boolean z, tp tpVar, aqe aqeVar, afdr afdrVar) {
        this.a = aqfVar;
        this.j = aiuVar;
        this.b = aomVar;
        this.c = apiVar;
        this.d = z;
        this.k = tpVar;
        this.m = aqeVar;
        this.e = afdrVar;
    }

    public final float a(float f) {
        return this.d ? -f : f;
    }

    public final float b(long j) {
        return Float.intBitsToFloat(this.c == api.b ? (int) (j >> 32) : (int) (j & 4294967295L));
    }

    public final long c(apr aprVar, long j, int i) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        long jB = this.k.b(j, i);
        long jY = aclh.y(j, jB);
        long jD = d(f(aprVar.a(b(d(e(jY))))));
        aqe aqeVar = this.m;
        if (aqeVar.A) {
            ViewTreeObserver viewTreeObserver = ((czq) bzi.s(aqeVar)).getViewTreeObserver();
            try {
                if (czq.e == null) {
                    Method declaredMethod = viewTreeObserver.getClass().getDeclaredMethod("dispatchOnScrollChanged", null);
                    declaredMethod.setAccessible(true);
                    czq.e = declaredMethod;
                }
                Method method = czq.e;
                if (method != null) {
                    method.invoke(viewTreeObserver, null);
                }
            } catch (Exception unused) {
            }
        }
        return a.ai(a.ai(jB, jD), this.k.a(jD, aclh.y(jY, jD), i));
    }

    public final long d(long j) {
        return this.d ? cja.c(j, -1.0f) : j;
    }

    public final long e(long j) {
        return cja.e(j, BitmapDescriptorFactory.HUE_RED, this.c == api.b ? 1 : 2);
    }

    public final long f(float f) {
        if (f == BitmapDescriptorFactory.HUE_RED) {
            return 0L;
        }
        if (this.c == api.b) {
            return (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED) & 4294967295L);
        }
        return (Float.floatToRawIntBits(f) & 4294967295L) | (Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED) << 32);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(long r12, defpackage.afck r14) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r14 instanceof defpackage.aqg
            if (r0 == 0) goto L13
            r0 = r14
            aqg r0 = (defpackage.aqg) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            aqg r0 = new aqg
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.a
            afcr r1 = defpackage.afcr.a
            int r2 = r0.c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            affu r12 = r0.d
            defpackage.woy.dF(r14)     // Catch: java.lang.Throwable -> L2b
            r6 = r11
            goto L58
        L2b:
            r0 = move-exception
            r12 = r0
            r6 = r11
            goto L68
        L2f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L37:
            defpackage.woy.dF(r14)
            affu r7 = new affu
            r7.<init>()
            r7.a = r12
            r11.f = r4
            akq r14 = defpackage.akq.a     // Catch: java.lang.Throwable -> L65
            aqi r5 = new aqi     // Catch: java.lang.Throwable -> L65
            r10 = 0
            r6 = r11
            r8 = r12
            r5.<init>(r6, r7, r8, r10)     // Catch: java.lang.Throwable -> L63
            r0.d = r7     // Catch: java.lang.Throwable -> L63
            r0.c = r4     // Catch: java.lang.Throwable -> L63
            java.lang.Object r11 = r6.i(r14, r5, r0)     // Catch: java.lang.Throwable -> L63
            if (r11 == r1) goto L62
            r12 = r7
        L58:
            r6.f = r3
            long r11 = r12.a
            dlv r13 = new dlv
            r13.<init>(r11)
            return r13
        L62:
            return r1
        L63:
            r0 = move-exception
            goto L67
        L65:
            r0 = move-exception
            r6 = r11
        L67:
            r12 = r0
        L68:
            r6.f = r3
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqk.g(long, afck):java.lang.Object");
    }

    public final Object h(long j, boolean z, afck afckVar) {
        if (!z || !(this.b instanceof anh)) {
            long jE = dlv.e(j, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, this.c == api.b ? 1 : 2);
            aqj aqjVar = new aqj(this, null);
            aiu aiuVar = this.j;
            if (aiuVar == null || !j()) {
                Object objInvoke = aqjVar.invoke(new dlv(jE), afckVar);
                if (objInvoke == afcr.a) {
                    return objInvoke;
                }
            } else {
                Object objF = aiuVar.f(jE, aqjVar, afckVar);
                if (objF == afcr.a) {
                    return objF;
                }
            }
        }
        return afak.a;
    }

    public final Object i(akq akqVar, afeg afegVar, afck afckVar) {
        Object objE = this.a.e(akqVar, new ams(this, afegVar, (afck) null, 4), afckVar);
        return objE == afcr.a ? objE : afak.a;
    }

    public final boolean j() {
        if (this.a.h() || this.a.g()) {
            return true;
        }
        aiu aiuVar = this.j;
        return aiuVar != null && aiuVar.j();
    }

    public final boolean k() {
        return this.c == api.a;
    }
}
