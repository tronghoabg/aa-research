package h3;

import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.TopicsManager;
import com.google.android.gms.ads.MobileAds;
import jf.InterfaceC3103c;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public final TopicsManager f36053a;

    public g(TopicsManager mTopicsManager) {
        AbstractC3340k.e(mTopicsManager, "mTopicsManager");
        this.f36053a = mTopicsManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object c(h3.g r6, h3.C2773a r7, jf.InterfaceC3103c<? super h3.b> r8) {
        /*
            boolean r0 = r8 instanceof h3.f
            if (r0 == 0) goto L13
            r0 = r8
            h3.f r0 = (h3.f) r0
            int r1 = r0.f36052d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f36052d = r1
            goto L18
        L13:
            h3.f r0 = new h3.f
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f36050b
            kf.a r1 = kf.a.f39711a
            int r2 = r0.f36052d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            h3.g r6 = r0.f36049a
            Fe.e.U(r8)
            goto L5f
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            Fe.e.U(r8)
            android.adservices.topics.GetTopicsRequest r7 = r6.a(r7)
            r0.f36049a = r6
            r0.f36052d = r3
            Ef.n r8 = new Ef.n
            jf.c r0 = A6.h.A(r0)
            r8.<init>(r3, r0)
            r8.t()
            android.adservices.topics.TopicsManager r0 = r6.f36053a
            com.applovin.impl.T0 r2 = new com.applovin.impl.T0
            r3 = 1
            r2.<init>(r3)
            g1.b r3 = new g1.b
            r3.<init>(r8)
            h3.e.p(r0, r7, r2, r3)
            java.lang.Object r8 = r8.s()
            if (r8 != r1) goto L5f
            return r1
        L5f:
            android.adservices.topics.GetTopicsResponse r7 = h3.e.l(r8)
            r6.getClass()
            java.lang.String r6 = "response"
            kotlin.jvm.internal.AbstractC3340k.e(r7, r6)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.List r7 = h3.e.o(r7)
            java.util.Iterator r7 = r7.iterator()
        L78:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L9b
            java.lang.Object r8 = r7.next()
            android.adservices.topics.Topic r8 = h3.e.m(r8)
            h3.c r0 = new h3.c
            long r1 = h3.e.g(r8)
            long r3 = h3.e.u(r8)
            int r5 = h3.e.e(r8)
            r0.<init>(r1, r3, r5)
            r6.add(r0)
            goto L78
        L9b:
            h3.b r7 = new h3.b
            r7.<init>(r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: h3.g.c(h3.g, h3.a, jf.c):java.lang.Object");
    }

    public GetTopicsRequest a(C2773a request) {
        AbstractC3340k.e(request, "request");
        GetTopicsRequest getTopicsRequestBuild = e.h().setAdsSdkName(MobileAds.ERROR_DOMAIN).build();
        AbstractC3340k.d(getTopicsRequestBuild, "Builder()\n            .s…ame)\n            .build()");
        return getTopicsRequestBuild;
    }

    @Nullable
    public Object b(@NotNull C2773a c2773a, @NotNull InterfaceC3103c<? super b> interfaceC3103c) {
        return c(this, c2773a, interfaceC3103c);
    }
}
