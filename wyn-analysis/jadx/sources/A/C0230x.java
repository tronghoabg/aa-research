package A;

import android.graphics.Bitmap;
import android.util.JsonWriter;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.unity3d.services.UnityAdsConstants;
import f4.C2556c;
import f4.C2557d;
import f4.C2560g;
import f4.InterfaceC2562i;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import ka.C3273u;
import kotlin.jvm.internal.AbstractC3340k;
import org.apache.tika.fork.ForkServer;

/* renamed from: A.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0230x implements InterfaceC0228v, c0, H6.h, l1.o, Q4.a, InterfaceC2562i, k2.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f186a;

    /* renamed from: b, reason: collision with root package name */
    public int f187b;

    /* renamed from: c, reason: collision with root package name */
    public Object f188c;

    public /* synthetic */ C0230x(int i5, char c10) {
        this.f186a = i5;
    }

    @Override // k2.d0
    public void a() throws io.ktor.utils.io.T {
        io.ktor.utils.io.T t10 = ((g2.s) this.f188c).f35669l;
        if (t10 != null) {
            throw t10;
        }
    }

    @Override // f4.InterfaceC2562i
    public synchronized void b(int i5) {
        if (i5 >= 10 && i5 != 20) {
            t();
        }
    }

    @Override // A.InterfaceC0228v
    public float c(float f10, float f11, float f12) {
        return j(k(f10, f11, f12), f10, f11, f12);
    }

    @Override // A.InterfaceC0228v
    public float d(long j8, float f10, float f11, float f12) {
        long j10 = (j8 / 1000000) - 0;
        int i5 = this.f187b;
        float fA = ((r) this.f188c).a(android.support.v4.media.session.b.R(i5 == 0 ? 1.0f : android.support.v4.media.session.b.T(j10, 0L, i5) / i5, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f));
        S3.e eVar = b0.f128a;
        return (f11 * fA) + ((1 - fA) * f10);
    }

    @Override // Q4.a
    public E4.B e(E4.B b5, B4.g gVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) b5.get()).compress((Bitmap.CompressFormat) this.f188c, this.f187b, byteArrayOutputStream);
        b5.a();
        return new L4.w(byteArrayOutputStream.toByteArray());
    }

    @Override // A.c0
    public AbstractC0221n f(long j8, AbstractC0221n initialValue, AbstractC0221n targetValue, AbstractC0221n initialVelocity) {
        AbstractC3340k.e(initialValue, "initialValue");
        AbstractC3340k.e(targetValue, "targetValue");
        AbstractC3340k.e(initialVelocity, "initialVelocity");
        return ((S3.n) this.f188c).f(j8, initialValue, targetValue, initialVelocity);
    }

    @Override // k2.d0
    public int g(long j8) {
        g2.s sVar = (g2.s) this.f188c;
        if (sVar.f35674q) {
            return -3;
        }
        g2.r rVar = (g2.r) sVar.f35663e.get(this.f187b);
        k2.c0 c0Var = rVar.f35655c;
        int iT = c0Var.t(j8, rVar.f35656d);
        c0Var.G(iT);
        return iT;
    }

    @Override // A.c0
    public AbstractC0221n h(long j8, AbstractC0221n initialValue, AbstractC0221n targetValue, AbstractC0221n initialVelocity) {
        AbstractC3340k.e(initialValue, "initialValue");
        AbstractC3340k.e(targetValue, "targetValue");
        AbstractC3340k.e(initialVelocity, "initialVelocity");
        return ((S3.n) this.f188c).h(j8, initialValue, targetValue, initialVelocity);
    }

    @Override // A.c0
    public long i(AbstractC0221n initialValue, AbstractC0221n targetValue, AbstractC0221n initialVelocity) {
        AbstractC3340k.e(initialValue, "initialValue");
        AbstractC3340k.e(targetValue, "targetValue");
        AbstractC3340k.e(initialVelocity, "initialVelocity");
        return this.f187b * 1000000;
    }

    @Override // k2.d0
    public boolean isReady() {
        g2.s sVar = (g2.s) this.f188c;
        if (sVar.f35674q) {
            return false;
        }
        g2.r rVar = (g2.r) sVar.f35663e.get(this.f187b);
        return rVar.f35655c.v(rVar.f35656d);
    }

    @Override // A.InterfaceC0228v
    public float j(long j8, float f10, float f11, float f12) {
        long jT = android.support.v4.media.session.b.T((j8 / 1000000) - 0, 0L, this.f187b);
        if (jT < 0) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        if (jT == 0) {
            return f12;
        }
        return (d(jT * 1000000, f10, f11, f12) - d((jT - 1) * 1000000, f10, f11, f12)) * 1000.0f;
    }

    @Override // A.InterfaceC0228v
    public long k(float f10, float f11, float f12) {
        return this.f187b * 1000000;
    }

    @Override // l1.o
    public boolean l(View view) {
        ((BottomSheetBehavior) this.f188c).z(this.f187b);
        return true;
    }

    @Override // f4.InterfaceC2562i
    public synchronized C2557d m(C2556c c2556c) {
        try {
            ArrayList arrayList = (ArrayList) ((LinkedHashMap) this.f188c).get(c2556c);
            C2557d c2557d = null;
            if (arrayList == null) {
                return null;
            }
            int size = arrayList.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size) {
                    break;
                }
                C2560g c2560g = (C2560g) arrayList.get(i5);
                Bitmap bitmap = (Bitmap) c2560g.f34819b.get();
                C2557d c2557d2 = bitmap != null ? new C2557d(bitmap, c2560g.f34820c) : null;
                if (c2557d2 != null) {
                    c2557d = c2557d2;
                    break;
                }
                i5++;
            }
            int i10 = this.f187b;
            this.f187b = i10 + 1;
            if (i10 >= 10) {
                t();
            }
            return c2557d;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // A.c0
    public AbstractC0221n n(AbstractC0221n initialValue, AbstractC0221n targetValue, AbstractC0221n initialVelocity) {
        AbstractC3340k.e(initialValue, "initialValue");
        AbstractC3340k.e(targetValue, "targetValue");
        AbstractC3340k.e(initialVelocity, "initialVelocity");
        return f(i(initialValue, targetValue, initialVelocity), initialValue, targetValue, initialVelocity);
    }

    @Override // H6.h
    public /* synthetic */ void o(JsonWriter jsonWriter) throws IOException {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("code").value(this.f187b);
        jsonWriter.endObject();
        H6.i.d(jsonWriter, (Map) this.f188c);
        jsonWriter.endObject();
    }

    @Override // A.c0
    public /* synthetic */ boolean p() {
        return false;
    }

    @Override // A.InterfaceC0216i
    public c0 q(S3.e converter) {
        AbstractC3340k.e(converter, "converter");
        return new S3.n(this);
    }

    @Override // f4.InterfaceC2562i
    public synchronized void r(C2556c c2556c, Bitmap bitmap, Map map, int i5) {
        try {
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.f188c;
            Object arrayList = linkedHashMap.get(c2556c);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(c2556c, arrayList);
            }
            ArrayList arrayList2 = (ArrayList) arrayList;
            int iIdentityHashCode = System.identityHashCode(bitmap);
            C2560g c2560g = new C2560g(iIdentityHashCode, new WeakReference(bitmap), map, i5);
            int size = arrayList2.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    arrayList2.add(c2560g);
                    break;
                }
                C2560g c2560g2 = (C2560g) arrayList2.get(i10);
                if (i5 < c2560g2.f34821d) {
                    i10++;
                } else if (c2560g2.f34818a == iIdentityHashCode && c2560g2.f34819b.get() == bitmap) {
                    arrayList2.set(i10, c2560g);
                } else {
                    arrayList2.add(i10, c2560g);
                }
            }
            int i11 = this.f187b;
            this.f187b = i11 + 1;
            if (i11 >= 10) {
                t();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // k2.d0
    public int s(S3.c cVar, T1.d dVar, int i5) {
        g2.s sVar = (g2.s) this.f188c;
        if (sVar.f35674q) {
            return -3;
        }
        g2.r rVar = (g2.r) sVar.f35663e.get(this.f187b);
        return rVar.f35655c.A(cVar, dVar, i5, rVar.f35656d);
    }

    public void t() {
        WeakReference weakReference;
        this.f187b = 0;
        Iterator it = ((LinkedHashMap) this.f188c).values().iterator();
        while (it.hasNext()) {
            ArrayList arrayList = (ArrayList) it.next();
            if (arrayList.size() <= 1) {
                C2560g c2560g = (C2560g) ff.o.s0(arrayList);
                if (((c2560g == null || (weakReference = c2560g.f34819b) == null) ? null : (Bitmap) weakReference.get()) == null) {
                    it.remove();
                }
            } else {
                int size = arrayList.size();
                int i5 = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    int i11 = i10 - i5;
                    if (((C2560g) arrayList.get(i11)).f34819b.get() == null) {
                        arrayList.remove(i11);
                        i5++;
                    }
                }
                if (arrayList.isEmpty()) {
                    it.remove();
                }
            }
        }
    }

    public String toString() {
        switch (this.f186a) {
            case 12:
                return new String((char[]) this.f188c, 0, this.f187b);
            case 19:
                return "ExistenceFilter{count=" + this.f187b + ", unchangedNames=" + ((C3273u) this.f188c) + '}';
            default:
                return super.toString();
        }
    }

    public void u(int i5, int i10) {
        int i11 = i10 + i5;
        char[] cArr = (char[]) this.f188c;
        if (cArr.length <= i11) {
            int i12 = i5 * 2;
            if (i11 < i12) {
                i11 = i12;
            }
            char[] cArrCopyOf = Arrays.copyOf(cArr, i11);
            AbstractC3340k.d(cArrCopyOf, "copyOf(...)");
            this.f188c = cArrCopyOf;
        }
    }

    public synchronized void v() {
        this.f187b++;
    }

    public long w(J5.h hVar) {
        Y4.b bVar = (Y4.b) this.f188c;
        int i5 = 0;
        hVar.c(bVar.f16679a, 0, 1, false);
        int i10 = bVar.f16679a[0] & ForkServer.ERROR;
        if (i10 == 0) {
            return Long.MIN_VALUE;
        }
        int i11 = 128;
        int i12 = 0;
        while ((i10 & i11) == 0) {
            i11 >>= 1;
            i12++;
        }
        int i13 = i10 & (~i11);
        hVar.c(bVar.f16679a, 1, i12, false);
        while (i5 < i12) {
            i5++;
            i13 = (bVar.f16679a[i5] & ForkServer.ERROR) + (i13 << 8);
        }
        this.f187b = i12 + 1 + this.f187b;
        return i13;
    }

    public long x(s2.j jVar) {
        Q1.o oVar = (Q1.o) this.f188c;
        int i5 = 0;
        jVar.c(oVar.f9702a, 0, 1, false);
        int i10 = oVar.f9702a[0] & ForkServer.ERROR;
        if (i10 == 0) {
            return Long.MIN_VALUE;
        }
        int i11 = 128;
        int i12 = 0;
        while ((i10 & i11) == 0) {
            i11 >>= 1;
            i12++;
        }
        int i13 = i10 & (~i11);
        jVar.c(oVar.f9702a, 1, i12, false);
        while (i5 < i12) {
            i5++;
            i13 = (oVar.f9702a[i5] & ForkServer.ERROR) + (i13 << 8);
        }
        this.f187b = i12 + 1 + this.f187b;
        return i13;
    }

    public void y(String text) {
        AbstractC3340k.e(text, "text");
        int length = text.length();
        if (length == 0) {
            return;
        }
        u(this.f187b, length);
        text.getChars(0, text.length(), (char[]) this.f188c, this.f187b);
        this.f187b += length;
    }

    public /* synthetic */ C0230x(int i5, Object obj, int i10) {
        this.f186a = i10;
        this.f187b = i5;
        this.f188c = obj;
    }

    public /* synthetic */ C0230x(Object obj, int i5, int i10) {
        this.f186a = i10;
        this.f188c = obj;
        this.f187b = i5;
    }

    public C0230x(int i5) {
        this.f186a = 4;
        this.f187b = i5;
        this.f188c = new HashMap();
    }

    public C0230x(byte b5, int i5) {
        this.f186a = i5;
        switch (i5) {
            case 7:
                this.f188c = new Y4.b(8);
                break;
            case 8:
                this.f188c = Bitmap.CompressFormat.JPEG;
                this.f187b = 100;
                break;
            case 13:
                this.f187b = 0;
                break;
            case 14:
                this.f188c = new LinkedHashMap();
                break;
            default:
                this.f188c = new Q1.o(8);
                break;
        }
    }

    public C0230x(int i5, r easing, int i10) {
        this.f186a = i10;
        switch (i10) {
            case 1:
                AbstractC3340k.e(easing, "easing");
                this.f187b = i5;
                this.f188c = new S3.n(new C0230x(i5, easing, 0));
                break;
            default:
                AbstractC3340k.e(easing, "easing");
                this.f187b = i5;
                this.f188c = easing;
                break;
        }
    }
}
