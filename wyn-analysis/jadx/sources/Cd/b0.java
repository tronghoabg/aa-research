package Cd;

import kotlin.jvm.internal.AbstractC3340k;
import wa.C4398a;

/* loaded from: classes5.dex */
public abstract class b0 {

    /* renamed from: a, reason: collision with root package name */
    public static final vg.b f2078a;

    /* renamed from: b, reason: collision with root package name */
    public static final C4398a f2079b;

    /* renamed from: c, reason: collision with root package name */
    public static final Dd.c f2080c;

    /* renamed from: d, reason: collision with root package name */
    public static final Nd.a f2081d;

    /* renamed from: e, reason: collision with root package name */
    public static final Nd.a f2082e;

    /* renamed from: f, reason: collision with root package name */
    public static final Nd.a f2083f;

    /* renamed from: g, reason: collision with root package name */
    public static final Nd.a f2084g;

    /* renamed from: h, reason: collision with root package name */
    public static final Nd.a f2085h;

    /* JADX WARN: Can't wrap try/catch for region: R(18:0|2|(2:37|3)|6|(3:33|7|8)|(2:35|9)|13|27|14|17|31|18|21|29|22|23|24|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00d4, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0116, code lost:
    
        r5 = null;
     */
    static {
        /*
            Method dump skipped, instructions count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Cd.b0.<clinit>():void");
    }

    public static final void a(Fd.c cVar, tf.l lVar) {
        Y y10 = new Y();
        lVar.invoke(y10);
        W w2 = y10.f2042a;
        if (w2 == null) {
            AbstractC3340k.m("shouldRetry");
            throw null;
        }
        Nd.a aVar = f2082e;
        Nd.d dVar = cVar.f4050f;
        dVar.e(aVar, w2);
        V v2 = y10.f2043b;
        if (v2 == null) {
            AbstractC3340k.m("shouldRetryOnException");
            throw null;
        }
        dVar.e(f2083f, v2);
        Bf.s sVar = y10.f2044c;
        if (sVar == null) {
            AbstractC3340k.m("delayMillis");
            throw null;
        }
        dVar.e(f2085h, sVar);
        dVar.e(f2081d, Integer.valueOf(y10.f2047f));
        dVar.e(f2084g, y10.f2046e);
    }
}
