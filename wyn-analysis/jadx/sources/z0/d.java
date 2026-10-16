package z0;

import U8.v0;
import Va.Y7;
import android.graphics.Canvas;
import com.unity3d.services.UnityAdsConstants;
import e0.AbstractC2451c;
import e0.C2441D;
import e0.C2450b;
import e0.InterfaceC2463o;
import ff.t;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3340k;
import r7.AbstractC3935e;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Y7 f48274a;

    /* renamed from: b, reason: collision with root package name */
    public final int f48275b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f48276c;

    /* renamed from: d, reason: collision with root package name */
    public final float f48277d;

    /* renamed from: e, reason: collision with root package name */
    public final float f48278e;

    /* renamed from: f, reason: collision with root package name */
    public final int f48279f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f48280g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f48281h;

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.List] */
    public d(Y7 y72, long j8, int i5, boolean z2) {
        int i10;
        boolean z10;
        int iD;
        this.f48274a = y72;
        this.f48275b = i5;
        if (L0.a.g(j8) != 0 || L0.a.f(j8) != 0) {
            throw new IllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) y72.f13870d;
        int size = arrayList2.size();
        int i11 = 0;
        int i12 = 0;
        float f10 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        while (i11 < size) {
            g gVar = (g) arrayList2.get(i11);
            H0.c cVar = gVar.f48291a;
            int iE = L0.a.e(j8);
            if (L0.a.b(j8)) {
                i10 = 0;
                iD = L0.a.d(j8) - ((int) Math.ceil(f10));
                if (iD < 0) {
                    iD = 0;
                }
            } else {
                i10 = 0;
                iD = L0.a.d(j8);
            }
            H0.a aVar = new H0.a(cVar, this.f48275b - i12, z2, xg.g.b(iE, iD, 5));
            float fB = aVar.b() + f10;
            A0.q qVar = aVar.f4852d;
            int i13 = i12 + qVar.f230c;
            arrayList.add(new f(aVar, gVar.f48292b, gVar.f48293c, i12, i13, f10, fB));
            if (qVar.f228a || (i13 == this.f48275b && i11 != AbstractC3935e.z((ArrayList) this.f48274a.f13870d))) {
                z10 = true;
                i12 = i13;
                f10 = fB;
                break;
            } else {
                i11++;
                i12 = i13;
                f10 = fB;
            }
        }
        i10 = 0;
        z10 = false;
        this.f48278e = f10;
        this.f48279f = i12;
        this.f48276c = z10;
        this.f48281h = arrayList;
        this.f48277d = L0.a.e(j8);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i14 = i10; i14 < size2; i14++) {
            f fVar = (f) arrayList.get(i14);
            ?? r72 = fVar.f48284a.f4853e;
            ArrayList arrayList4 = new ArrayList(r72.size());
            int size3 = r72.size();
            for (int i15 = i10; i15 < size3; i15++) {
                d0.d dVar = (d0.d) r72.get(i15);
                arrayList4.add(dVar != null ? dVar.e(v0.f(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, fVar.f48289f)) : null);
            }
            t.e0(arrayList4, arrayList3);
        }
        if (arrayList3.size() < 0) {
            int size4 = 0 - arrayList3.size();
            ArrayList arrayList5 = new ArrayList(size4);
            for (int i16 = i10; i16 < size4; i16++) {
                arrayList5.add(null);
            }
            arrayList3 = ff.o.E0(arrayList5, arrayList3);
        }
        this.f48280g = arrayList3;
    }

    public final void a(InterfaceC2463o interfaceC2463o, long j8, C2441D c2441d, K0.d dVar) {
        interfaceC2463o.m();
        ArrayList arrayList = this.f48281h;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            f fVar = (f) arrayList.get(i5);
            H0.a aVar = fVar.f48284a;
            H0.d dVar2 = aVar.f4849a.f4862g;
            dVar2.a(j8);
            dVar2.b(c2441d);
            dVar2.c(dVar);
            Canvas canvas = AbstractC2451c.f34360a;
            Canvas canvas2 = ((C2450b) interfaceC2463o).f34357a;
            A0.q qVar = aVar.f4852d;
            if (qVar.f228a) {
                canvas2.save();
                canvas2.clipRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar.c(), aVar.b());
            }
            qVar.getClass();
            AbstractC3340k.e(canvas2, "canvas");
            int i10 = qVar.f231d;
            if (i10 != 0) {
                canvas2.translate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i10);
            }
            qVar.f229b.draw(canvas2);
            if (i10 != 0) {
                canvas2.translate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (-1) * i10);
            }
            if (qVar.f228a) {
                canvas2.restore();
            }
            interfaceC2463o.f(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, fVar.f48284a.b());
        }
        interfaceC2463o.restore();
    }

    public final void b(int i5) {
        Y7 y72 = this.f48274a;
        if (i5 < 0 || i5 > ((b) y72.f13867a).f48269a.length()) {
            StringBuilder sbL = pd.f.l(i5, "offset(", ") is out of bounds [0, ");
            sbL.append(((b) y72.f13867a).f48269a.length());
            sbL.append(']');
            throw new IllegalArgumentException(sbL.toString().toString());
        }
    }

    public final void c(int i5) {
        if (i5 < 0 || i5 >= this.f48279f) {
            throw new IllegalArgumentException(("lineIndex(" + i5 + ") is out of bounds [0, " + i5 + ')').toString());
        }
    }
}
