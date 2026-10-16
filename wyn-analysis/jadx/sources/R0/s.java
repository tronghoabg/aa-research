package r0;

import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public static final s f44304a = new s();

    /* renamed from: b, reason: collision with root package name */
    public static L0.i f44305b = L0.i.f6806a;

    /* renamed from: c, reason: collision with root package name */
    public static int f44306c;

    public static void a(t tVar, int i5, int i10, float f10) {
        AbstractC3340k.e(tVar, "<this>");
        long jB = A6.h.b(i5, i10);
        long jG = tVar.g();
        int i11 = L0.g.f6803c;
        tVar.m(A6.h.b(((int) (jB >> 32)) + ((int) (jG >> 32)), ((int) (jB & 4294967295L)) + ((int) (jG & 4294967295L))), f10, null);
    }

    public static void b(t place, long j8, float f10) {
        AbstractC3340k.e(place, "$this$place");
        long jG = place.g();
        int i5 = L0.g.f6803c;
        place.m(A6.h.b(((int) (j8 >> 32)) + ((int) (jG >> 32)), ((int) (j8 & 4294967295L)) + ((int) (jG & 4294967295L))), f10, null);
    }

    public static void c(s sVar, t tVar, int i5, int i10) {
        int i11;
        sVar.getClass();
        AbstractC3340k.e(tVar, "<this>");
        long jB = A6.h.b(i5, i10);
        if (f44305b == L0.i.f6806a || (i11 = f44306c) == 0) {
            long jG = tVar.g();
            int i12 = L0.g.f6803c;
            tVar.m(A6.h.b(((int) (jB >> 32)) + ((int) (jG >> 32)), ((int) (jB & 4294967295L)) + ((int) (4294967295L & jG))), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null);
        } else {
            int i13 = i11 - ((int) (tVar.f44309c >> 32));
            int i14 = L0.g.f6803c;
            long jB2 = A6.h.b(i13 - ((int) (jB >> 32)), (int) (jB & 4294967295L));
            long jG2 = tVar.g();
            tVar.m(A6.h.b(((int) (jB2 >> 32)) + ((int) (jG2 >> 32)), ((int) (jB2 & 4294967295L)) + ((int) (4294967295L & jG2))), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null);
        }
    }

    public static void d(s sVar, t tVar) {
        int i5;
        int i10 = v.f44314b;
        u uVar = u.f44311j;
        sVar.getClass();
        AbstractC3340k.e(tVar, "<this>");
        long jB = A6.h.b(0, 0);
        if (f44305b == L0.i.f6806a || (i5 = f44306c) == 0) {
            long jG = tVar.g();
            int i11 = L0.g.f6803c;
            tVar.m(A6.h.b(((int) (jB >> 32)) + ((int) (jG >> 32)), ((int) (jB & 4294967295L)) + ((int) (jG & 4294967295L))), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, uVar);
        } else {
            int i12 = i5 - ((int) (tVar.f44309c >> 32));
            int i13 = L0.g.f6803c;
            long jB2 = A6.h.b(i12 - ((int) (jB >> 32)), (int) (jB & 4294967295L));
            long jG2 = tVar.g();
            tVar.m(A6.h.b(((int) (jB2 >> 32)) + ((int) (jG2 >> 32)), ((int) (jB2 & 4294967295L)) + ((int) (jG2 & 4294967295L))), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, uVar);
        }
    }

    public static void e(s sVar, t tVar, tf.l layerBlock) {
        sVar.getClass();
        AbstractC3340k.e(layerBlock, "layerBlock");
        long jB = A6.h.b(0, 0);
        long jG = tVar.g();
        int i5 = L0.g.f6803c;
        tVar.m(A6.h.b(((int) (jB >> 32)) + ((int) (jG >> 32)), ((int) (jB & 4294967295L)) + ((int) (jG & 4294967295L))), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, layerBlock);
    }

    public static void f(t placeWithLayer, long j8, float f10, tf.l layerBlock) {
        AbstractC3340k.e(placeWithLayer, "$this$placeWithLayer");
        AbstractC3340k.e(layerBlock, "layerBlock");
        long jG = placeWithLayer.g();
        int i5 = L0.g.f6803c;
        placeWithLayer.m(A6.h.b(((int) (j8 >> 32)) + ((int) (jG >> 32)), ((int) (j8 & 4294967295L)) + ((int) (jG & 4294967295L))), f10, layerBlock);
    }
}
