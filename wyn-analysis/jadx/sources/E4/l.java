package E4;

import A.AbstractC0213f;
import A.C0230x;
import N.C0719d0;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final Class f2928a;

    /* renamed from: b, reason: collision with root package name */
    public final List f2929b;

    /* renamed from: c, reason: collision with root package name */
    public final Q4.a f2930c;

    /* renamed from: d, reason: collision with root package name */
    public final Dd.c f2931d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2932e;

    public l(Class cls, Class cls2, Class cls3, List list, Q4.a aVar, Dd.c cVar) {
        this.f2928a = cls;
        this.f2929b = list;
        this.f2930c = aVar;
        this.f2931d = cVar;
        this.f2932e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public final B a(int i5, int i10, C0230x c0230x, B4.g gVar, C4.g gVar2) {
        B bA;
        B4.k kVar;
        int iE;
        boolean z2;
        boolean z10;
        boolean z11;
        B4.d c0437f;
        Dd.c cVar = this.f2931d;
        List list = (List) cVar.z();
        try {
            B b5 = b(gVar2, i5, i10, gVar, list);
            cVar.O(list);
            k kVar2 = (k) c0230x.f188c;
            kVar2.getClass();
            Class<?> cls = b5.get().getClass();
            int i11 = c0230x.f187b;
            i iVar = kVar2.f2903a;
            B4.j jVarB = null;
            if (i11 != 4) {
                B4.k kVarE = iVar.e(cls);
                kVar = kVarE;
                bA = kVarE.a(kVar2.f2910h, b5, kVar2.f2913l, kVar2.f2914m);
            } else {
                bA = b5;
                kVar = null;
            }
            if (!b5.equals(bA)) {
                b5.a();
            }
            if (((C0719d0) iVar.f2881c.f24220b.f24233d).b(bA.b()) != null) {
                com.bumptech.glide.f fVar = iVar.f2881c.f24220b;
                fVar.getClass();
                jVarB = ((C0719d0) fVar.f24233d).b(bA.b());
                if (jVarB == null) {
                    throw new com.bumptech.glide.e(bA.b());
                }
                iE = jVarB.e(kVar2.f2916o);
            } else {
                iE = 3;
            }
            B4.j jVar = jVarB;
            B4.d dVar = kVar2.f2922u;
            ArrayList arrayListB = iVar.b();
            int size = arrayListB.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size) {
                    z2 = false;
                    break;
                }
                if (((I4.o) arrayListB.get(i12)).f5353a.equals(dVar)) {
                    z2 = true;
                    break;
                }
                i12++;
            }
            switch (kVar2.f2915n.f2936a) {
                default:
                    z10 = true;
                    if (((z2 || i11 != 3) && i11 != 1) || iE != 2) {
                    }
                    break;
                case 0:
                case 1:
                    z10 = false;
                    break;
            }
            if (z10) {
                if (jVar == null) {
                    throw new com.bumptech.glide.e(bA.get().getClass());
                }
                int iF = AbstractC0213f.f(iE);
                if (iF == 0) {
                    z11 = true;
                    c0437f = new C0437f(kVar2.f2922u, kVar2.f2911i);
                } else {
                    if (iF != 1) {
                        throw new IllegalArgumentException("Unknown strategy: ".concat(iE != 1 ? iE != 2 ? iE != 3 ? "null" : "NONE" : "TRANSFORMED" : "SOURCE"));
                    }
                    z11 = true;
                    c0437f = new D(iVar.f2881c.f24219a, kVar2.f2922u, kVar2.f2911i, kVar2.f2913l, kVar2.f2914m, kVar, cls, kVar2.f2916o);
                }
                A a5 = (A) A.f2826e.z();
                a5.f2830d = false;
                a5.f2829c = z11;
                a5.f2828b = bA;
                b7.k kVar3 = kVar2.f2908f;
                kVar3.f19396b = c0437f;
                kVar3.f19397c = jVar;
                kVar3.f19398d = a5;
                bA = a5;
            }
            return this.f2930c.e(bA, gVar);
        } catch (Throwable th) {
            cVar.O(list);
            throw th;
        }
    }

    public final B b(C4.g gVar, int i5, int i10, B4.g gVar2, List list) throws w {
        List list2 = this.f2929b;
        int size = list2.size();
        B bA = null;
        for (int i11 = 0; i11 < size; i11++) {
            B4.i iVar = (B4.i) list2.get(i11);
            try {
                if (iVar.b(gVar.b(), gVar2)) {
                    bA = iVar.a(gVar.b(), i5, i10, gVar2);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e7) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + iVar, e7);
                }
                list.add(e7);
            }
            if (bA != null) {
                break;
            }
        }
        if (bA != null) {
            return bA;
        }
        throw new w(this.f2932e, new ArrayList(list));
    }

    public final String toString() {
        return "DecodePath{ dataClass=" + this.f2928a + ", decoders=" + this.f2929b + ", transcoder=" + this.f2930c + '}';
    }
}
