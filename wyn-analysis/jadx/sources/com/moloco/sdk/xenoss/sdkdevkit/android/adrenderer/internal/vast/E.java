package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.C2091i;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.C2102b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;
import wd.C4402c;

/* loaded from: classes4.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    public final I f31144a;

    /* renamed from: b, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.p f31145b;

    /* renamed from: c, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.o f31146c;

    /* renamed from: d, reason: collision with root package name */
    public final L0 f31147d;

    /* renamed from: e, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.E f31148e;

    /* renamed from: f, reason: collision with root package name */
    public final C4402c f31149f;

    /* renamed from: g, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.p f31150g;

    public E(I parseVast, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.p mediaConfig, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.o mediaCacheRepository, L0 vastTracker, com.moloco.sdk.internal.services.E connectivityService, C4402c httpClient, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.p pVar) {
        AbstractC3340k.e(parseVast, "parseVast");
        AbstractC3340k.e(mediaConfig, "mediaConfig");
        AbstractC3340k.e(mediaCacheRepository, "mediaCacheRepository");
        AbstractC3340k.e(vastTracker, "vastTracker");
        AbstractC3340k.e(connectivityService, "connectivityService");
        AbstractC3340k.e(httpClient, "httpClient");
        this.f31144a = parseVast;
        this.f31145b = mediaConfig;
        this.f31146c = mediaCacheRepository;
        this.f31147d = vastTracker;
        this.f31148e = connectivityService;
        this.f31149f = httpClient;
        this.f31150g = pVar;
    }

    public static C2102b a(List list, com.moloco.sdk.common_adapter_internal.a aVar) {
        List list2;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            C2091i c2091i = (C2091i) obj;
            String str = c2091i.f31481c;
            if (str == null || Bf.k.y0(str)) {
                if (!c2091i.f31484f.isEmpty()) {
                    arrayList.add(obj);
                }
            }
        }
        C2091i c2091i2 = (C2091i) ff.o.s0(ff.o.M0(new C2073i(Integer.valueOf(aVar.f28476a), Integer.valueOf(aVar.f28477b)), arrayList));
        if (c2091i2 == null) {
            return null;
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.I i5 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.I) ff.o.q0(ff.o.M0(G.f31162a, c2091i2.f31484f));
        Integer num = c2091i2.f31479a;
        int iIntValue = num != null ? num.intValue() : 0;
        Integer num2 = c2091i2.f31480b;
        int iIntValue2 = num2 != null ? num2.intValue() : 0;
        Y2.B b5 = c2091i2.f31482d;
        String str2 = b5 != null ? (String) b5.f16384c : null;
        if (b5 == null || (list2 = (List) b5.f16383b) == null) {
            list2 = ff.v.f35432a;
        }
        List list3 = list2;
        List list4 = c2091i2.f31483e;
        ArrayList arrayList2 = new ArrayList(ff.p.a0(list4, 10));
        Iterator it = list4.iterator();
        while (it.hasNext()) {
            arrayList2.add(((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.B) it.next()).f31435b);
        }
        return new C2102b(i5, iIntValue, iIntValue2, str2, list3, arrayList2);
    }

    public static com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.h b(List list) {
        List list2;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            String str = ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.q) obj).f31499c;
            if (str == null || Bf.k.y0(str)) {
                arrayList.add(obj);
            }
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.q qVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.q) ff.o.s0(ff.o.M0(G.f31163b, arrayList));
        if (qVar == null) {
            return null;
        }
        Integer num = qVar.f31497a;
        int iIntValue = num != null ? num.intValue() : 0;
        Integer num2 = qVar.f31498b;
        int iIntValue2 = num2 != null ? num2.intValue() : 0;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.r rVar = qVar.f31502f;
        String str2 = rVar != null ? rVar.f31505a : null;
        if (rVar == null || (list2 = rVar.f31506b) == null) {
            list2 = ff.v.f35432a;
        }
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.h(qVar.f31504h, iIntValue, iIntValue2, str2, list2, qVar.f31503g, qVar.f31501e, qVar.f31500d);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.E r24, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.C2084b r25, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.C2093n r26, double r27, com.moloco.sdk.common_adapter_internal.a r29, boolean r30, java.lang.String r31, lf.AbstractC3464c r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.E.c(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.E, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.b, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.n, double, com.moloco.sdk.common_adapter_internal.a, boolean, java.lang.String, lf.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Type inference failed for: r13v10, types: [ef.i] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0179 -> B:45:0x0181). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.E r30, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.t r31, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.C2079l r32, double r33, com.moloco.sdk.common_adapter_internal.a r35, boolean r36, java.lang.String r37, lf.AbstractC3464c r38) {
        /*
            Method dump skipped, instructions count: 856
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.E.d(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.E, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.t, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l, double, com.moloco.sdk.common_adapter_internal.a, boolean, java.lang.String, lf.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0050 A[PHI: r0 r2 r6
  0x0050: PHI (r0v21 java.lang.Object) = (r0v6 java.lang.Object), (r0v31 java.lang.Object) binds: [B:18:0x004e, B:35:0x00c2] A[DONT_GENERATE, DONT_INLINE]
  0x0050: PHI (r2v20 java.util.List) = (r2v5 ??), (r2v31 ??) binds: [B:18:0x004e, B:35:0x00c2] A[DONT_GENERATE, DONT_INLINE]
  0x0050: PHI (r6v6 com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.E) = 
  (r6v13 com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.E)
  (r6v14 com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.E)
 binds: [B:18:0x004e, B:35:0x00c2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v29, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v11, types: [com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.E] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.E] */
    /* JADX WARN: Type inference failed for: r3v9, types: [com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.E] */
    /* JADX WARN: Type inference failed for: r6v0, types: [int] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v8, types: [com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.E] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.C2084b r19, java.util.ArrayList r20, lf.AbstractC3464c r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.E.e(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.b, java.util.ArrayList, lf.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v6, types: [ff.v] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.u r31, java.util.ArrayList r32, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.C2083a r33, java.util.List r34, double r35, java.lang.Long r37, com.moloco.sdk.common_adapter_internal.a r38, boolean r39, java.lang.String r40, lf.AbstractC3464c r41) {
        /*
            Method dump skipped, instructions count: 782
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.E.f(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.u, java.util.ArrayList, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a, java.util.List, double, java.lang.Long, com.moloco.sdk.common_adapter_internal.a, boolean, java.lang.String, lf.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.D r14, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.C2093n r15, double r16, com.moloco.sdk.common_adapter_internal.a r18, boolean r19, java.lang.String r20, lf.AbstractC3464c r21) {
        /*
            Method dump skipped, instructions count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.E.g(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.D, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.n, double, com.moloco.sdk.common_adapter_internal.a, boolean, java.lang.String, lf.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.C2097a r12, long r13, lf.AbstractC3464c r15) {
        /*
            Method dump skipped, instructions count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.E.h(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a, long, lf.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b1, code lost:
    
        if (r1 == r3) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(java.lang.String r20, java.lang.String r21, boolean r22, lf.AbstractC3464c r23) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.E.i(java.lang.String, java.lang.String, boolean, lf.c):java.lang.Object");
    }

    public final void j(List list, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.E e7) {
        G.g(this.f31147d, list, e7, 12);
    }
}
