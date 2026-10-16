package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.UserManager;
import android.util.Pair;
import android.widget.Scroller;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* loaded from: classes.dex */
public final class gms {
    public final Object a;

    public gms(Executor executor) {
        this.a = new prr(new zhb(executor), true, false);
    }

    public static gms y(abam abamVar) {
        return new gms(yfq.o(abamVar.b), (byte[]) null);
    }

    public static gms z(float f, float f2, float[] fArr, float f3) {
        int length = fArr.length - 1;
        ubz[] ubzVarArr = new ubz[length];
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            float f4 = fArr[i2] - fArr[i];
            ubzVarArr[i] = new ubz(f, f2, f4, f3);
            f += f4;
            i = i2;
        }
        return new gms(ubzVarArr, (byte[]) null);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final void a(hui huiVar, hwn hwnVar) {
        ?? r1 = this.a;
        if (hwnVar.equals(r1.get(huiVar))) {
            r1.remove(huiVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final void b() {
        this.a.clear();
    }

    public final boolean c() {
        return !((yfq) this.a).isEmpty();
    }

    public final kic d() {
        Context context = ((qco) this.a).e().c;
        return e((Build.VERSION.SDK_INT < 33 ? qcs.a(context) : ((UserManager) context.getSystemService(UserManager.class)).isProfile()) ? qcq.b : qcq.a);
    }

    public final kic e(qdg qdgVar) {
        if (!qdgVar.a()) {
            return new kib(this.a, 0);
        }
        kia kiaVar = kia.a;
        return new kib(kia.a(), 1);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final jvv f(int i, int i2) {
        return (jvv) this.a.remove(new Pair(Integer.valueOf(i), Integer.valueOf(i2)));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final Collection g() {
        return this.a.values();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v2, types: [hup, java.lang.Object] */
    public final synchronized hup h(Class cls) {
        ?? r0 = this.a;
        int size = r0.size();
        for (int i = 0; i < size; i++) {
            ieb iebVar = (ieb) r0.get(i);
            if (((Class) iebVar.a).isAssignableFrom(cls)) {
                return iebVar.b;
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.List] */
    public final synchronized void i(Class cls, hup hupVar) {
        this.a.add(new ieb(cls, hupVar));
    }

    public final gms j() {
        ((qco) this.a).e();
        qdg[] qdgVarArr = {qcq.a, qcq.b};
        HashMap map = new HashMap();
        for (int i = 0; i < 2; i++) {
            qdg qdgVar = qdgVarArr[i];
            map.put(qdgVar, e(qdgVar));
        }
        return new gms(map, (byte[]) null);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, javax.microedition.khronos.egl.EGL10] */
    public final int k() {
        return this.a.eglGetError();
    }

    public final trp l() {
        ttn ttnVarO = ((usy) this.a).o();
        toi toiVar = ttnVarO.g;
        tro troVarA = trp.a();
        troVarA.a = toiVar;
        troVarA.f(ttnVarO.m);
        troVarA.h(ttnVarO.l);
        troVarA.c(ttnVarO.n);
        tto ttoVar = ttnVarO.o;
        troVarA.b = trq.a(ttoVar.b, ttoVar.c);
        troVarA.d(ttnVarO.i);
        troVarA.e(ttnVarO.k);
        troVarA.g(ttnVarO.j);
        return troVarA.a();
    }

    public final void m(Runnable runnable) {
        ((prr) this.a).execute(runnable);
    }

    public final void n() {
        ArrayList<urg> arrayList;
        Object obj = this.a;
        synchronized (obj) {
            arrayList = new ArrayList(((ArrayList) obj).size());
            int i = 0;
            while (i < ((ArrayList) obj).size()) {
                urg urgVar = (urg) ((WeakReference) ((ArrayList) obj).get(i)).get();
                if (urgVar != null) {
                    arrayList.add(urgVar);
                } else {
                    ((ArrayList) obj).remove(i);
                    i--;
                }
                i++;
            }
        }
        for (urg urgVar2 : arrayList) {
            ugy ugyVar = (ugy) urgVar2.b;
            ugyVar.m();
            ufs ufsVar = (ufs) urgVar2.a;
            if (!ufsVar.x) {
                ugyVar.s();
            }
            ufsVar.H();
        }
    }

    public final float o(float f) {
        float[] fArr = (float[]) this.a;
        int length = fArr.length;
        if (length == 0) {
            return 1.0f;
        }
        if (f >= 1.0f) {
            return fArr[length - 1];
        }
        if (f <= BitmapDescriptorFactory.HUE_RED) {
            return fArr[0];
        }
        float f2 = f * (length - 1);
        double d = f2;
        int iFloor = (int) Math.floor(d);
        int iCeil = (int) Math.ceil(d);
        if (iFloor == iCeil) {
            return fArr[iFloor];
        }
        float f3 = fArr[iFloor];
        float f4 = f2 - iFloor;
        float f5 = iCeil - iFloor;
        return ((1.0f - (f4 / f5)) * f3) + ((1.0f - ((iCeil - f2) / f5)) * fArr[iCeil]);
    }

    public final void p() {
        ((Scroller) this.a).abortAnimation();
    }

    public final int q() {
        return ((ubz[]) this.a).length;
    }

    public final ubz r(int i) {
        return ((ubz[]) this.a)[i];
    }

    public final void s(tpf tpfVar) {
        int i = 0;
        while (true) {
            ubz[] ubzVarArr = (ubz[]) this.a;
            if (i >= ubzVarArr.length) {
                return;
            }
            tpf tpfVar2 = ubzVarArr[i].g;
            tpf.g(tpfVar2, tpfVar, tpfVar2);
            i++;
        }
    }

    public final void t(tup tupVar, float[] fArr, float f, float f2, ugm ugmVar) {
        gms gmsVar = this;
        float f3 = 0.5f;
        int i = 0;
        if (tupVar.b == 2) {
            tpf tpfVar = (tpf) ugmVar.g;
            tupVar.j(0, tpfVar);
            tpf tpfVar2 = (tpf) ugmVar.f;
            tupVar.j(1, tpfVar2);
            tpf tpfVar3 = (tpf) ugmVar.h;
            tpf.p(tpfVar2, tpfVar, tpfVar3);
            int length = fArr.length - 1;
            float fB = tupVar.b();
            float f4 = fB - ((fArr[length] * f) * f2);
            while (i < length) {
                int i2 = i + 1;
                float f5 = ((f4 * f3) + (((f2 * f) * (fArr[i] + fArr[i2])) / 2.0f)) / fB;
                ubz[] ubzVarArr = (ubz[]) gmsVar.a;
                tpf.d(tpfVar, tpfVar2, f5, ubzVarArr[i].g);
                float f6 = tpfVar3.b;
                float f7 = tpfVar3.c;
                float f8 = f3;
                float fHypot = (float) Math.hypot(f6, f7);
                ubz ubzVar = ubzVarArr[i];
                ubzVar.e = f6 / fHypot;
                ubzVar.f = f7 / fHypot;
                i = i2;
                f3 = f8;
            }
            return;
        }
        Object obj = ugmVar.g;
        Object obj2 = ugmVar.f;
        Object obj3 = ugmVar.h;
        Object obj4 = ugmVar.a;
        Object obj5 = ugmVar.b;
        Object obj6 = ugmVar.d;
        Object obj7 = ugmVar.e;
        Object obj8 = ugmVar.c;
        int length2 = fArr.length - 1;
        float fB2 = tupVar.b();
        float f9 = fArr[length2] * f * f2;
        float f10 = 1.0f / fB2;
        float f11 = (fB2 - f9) * 0.5f;
        tpf tpfVar4 = (tpf) obj;
        tupVar.k(((fArr[0] * f * f2) + f11) * f10, tpfVar4);
        tpf tpfVar5 = (tpf) obj2;
        tupVar.k(((0.33333334f * f9) + f11) * f10, tpfVar5);
        tpf tpfVar6 = (tpf) obj3;
        tupVar.k(((0.6666667f * f9) + f11) * f10, tpfVar6);
        tpf tpfVar7 = (tpf) obj4;
        tupVar.k((f11 + f9) * f10, tpfVar7);
        tpf tpfVar8 = (tpf) obj5;
        tpfVar8.o(tpfVar4);
        double d = tpfVar4.b;
        double d2 = tpfVar5.b;
        double d3 = tpfVar6.b;
        double d4 = tpfVar7.b;
        double d5 = (-tpfVar4.c) * 5.0d;
        tpf tpfVar9 = (tpf) obj6;
        tpfVar9.n((float) ((((((-d) * 5.0d) / 6.0d) + (d2 * 3.0d)) - ((d3 * 3.0d) / 2.0d)) + (d4 / 3.0d)), (float) ((((d5 / 6.0d) + (tpfVar5.c * 3.0d)) - ((tpfVar6.c * 3.0d) / 2.0d)) + (tpfVar7.c / 3.0d)));
        double d6 = tpfVar4.b;
        double d7 = tpfVar5.b;
        double d8 = tpfVar6.b;
        double d9 = tpfVar7.b;
        double d10 = tpfVar4.c;
        double d11 = tpfVar5.c;
        double d12 = (d11 * 3.0d) / 2.0d;
        double d13 = d10 / 3.0d;
        tpf tpfVar10 = (tpf) obj7;
        double d14 = ((d6 / 3.0d) - ((d7 * 3.0d) / 2.0d)) + (d8 * 3.0d);
        tpfVar10.n((float) (d14 - ((d9 * 5.0d) / 6.0d)), (float) (((d13 - d12) + (tpfVar6.c * 3.0d)) - ((tpfVar7.c * 5.0d) / 6.0d)));
        tpf tpfVar11 = (tpf) obj8;
        tpfVar11.o(tpfVar7);
        int i3 = 0;
        while (i3 < length2) {
            int i4 = i3 + 1;
            ubz[] ubzVarArr2 = (ubz[]) gmsVar.a;
            tpf tpfVar12 = ubzVarArr2[i3].g;
            double d15 = tpfVar8.b;
            double d16 = tpfVar9.b;
            double d17 = tpfVar10.b;
            double d18 = tpfVar11.b;
            double d19 = (((fArr[i3] + fArr[i4]) * f) * f2) / (f9 + f9);
            tpfVar12.n((float) tnx.a(d19, d15, d16, d17, d18), (float) tnx.a(d19, tpfVar8.c, tpfVar9.c, tpfVar10.c, tpfVar11.c));
            float f12 = tpfVar12.b;
            float f13 = tpfVar12.c;
            float fHypot2 = (float) Math.hypot(f12, f13);
            ubz ubzVar2 = ubzVarArr2[i3];
            ubzVar2.e = f12 / fHypot2;
            ubzVar2.f = f13 / fHypot2;
            ubzVar2.g.n((float) tnx.b(d19, tpfVar8.b, tpfVar9.b, tpfVar10.b, tpfVar11.b), (float) tnx.b(d19, tpfVar8.c, tpfVar9.c, tpfVar10.c, tpfVar11.c));
            gmsVar = this;
            i3 = i4;
        }
    }

    public final void u(urg urgVar) {
        Object obj = this.a;
        synchronized (obj) {
            ((ArrayList) obj).add(new WeakReference(urgVar));
        }
    }

    public final void v(rjs rjsVar) {
        ((ArrayList) this.a).add(rjsVar);
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.List] */
    public final boolean w(rjs rjsVar, uez uezVar) {
        ?? r6 = this.a;
        int size = r6.size();
        for (int i = 0; i < size; i++) {
            rjs rjsVar2 = (rjs) r6.get(i);
            if (((uew) rjsVar2.a).g((uew) rjsVar.a) && !uezVar.a(rjsVar2, rjsVar).c) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, javax.microedition.khronos.egl.EGL10] */
    public final boolean x(htm htmVar, htm htmVar2, htm htmVar3, htm htmVar4) {
        htm htmVar5 = uvn.a;
        EGLContext eGLContext = (EGLContext) htmVar4.a;
        EGLSurface eGLSurface = (EGLSurface) htmVar3.a;
        return this.a.eglMakeCurrent((EGLDisplay) htmVar.a, (EGLSurface) htmVar2.a, eGLSurface, eGLContext);
    }

    public gms(Object obj, byte[] bArr) {
        this.a = obj;
    }

    public gms(byte[] bArr, short[] sArr) {
        this.a = new too();
    }

    public gms() {
        this.a = new ArrayList();
    }

    public gms(byte[] bArr, byte[] bArr2) {
        this.a = new hzf();
    }

    public gms(int[] iArr) {
        this.a = (EGL10) EGLContext.getEGL();
    }

    public gms(short[] sArr) {
        this.a = new ConcurrentHashMap();
    }

    public gms(byte[] bArr) {
        this.a = new HashMap();
        new HashMap();
    }

    public gms(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.a = new ArrayList();
    }

    public gms(char[] cArr) {
        this.a = new HashMap();
    }

    public gms(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = new ArrayList();
    }

    public gms(byte[] bArr, char[] cArr) {
        this.a = new ArrayList();
    }

    public gms(Context context) {
        this.a = new Scroller(context);
    }

    public gms(yfq yfqVar, byte[] bArr) {
        this.a = wub.aB(yfqVar);
    }

    public gms(short[] sArr, byte[] bArr) {
        this.a = new ArrayList();
    }

    public gms(Object obj) {
        this.a = obj;
    }

    public gms(usy usyVar, Context context) {
        this.a = usyVar;
        context.getResources().getDisplayMetrics();
    }

    public gms(char[] cArr, byte[] bArr) {
        this.a = new AtomicLong();
    }
}
