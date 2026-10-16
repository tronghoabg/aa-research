package com.moloco.sdk.internal.services.events;

import com.moloco.sdk.internal.services.C1940c;
import com.moloco.sdk.internal.services.i;
import com.moloco.sdk.internal.services.q;
import com.moloco.sdk.internal.services.v;
import com.moloco.sdk.internal.services.x;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final x f29598a;

    /* renamed from: b, reason: collision with root package name */
    public final C1940c f29599b;

    /* renamed from: c, reason: collision with root package name */
    public final v f29600c;

    /* renamed from: d, reason: collision with root package name */
    public final i f29601d;

    /* renamed from: e, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.usertracker.c f29602e;

    /* renamed from: f, reason: collision with root package name */
    public final q f29603f;

    /* renamed from: g, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.proto.a f29604g;

    /* renamed from: h, reason: collision with root package name */
    public final e f29605h;

    public c(x appInfoService, C1940c networkInfoService, v deviceInfoService, i screenInfoService, com.moloco.sdk.internal.services.usertracker.c userIdentifierService, q adDataService, com.moloco.sdk.internal.services.proto.a encoderService, e userEventConfigService) {
        AbstractC3340k.e(appInfoService, "appInfoService");
        AbstractC3340k.e(networkInfoService, "networkInfoService");
        AbstractC3340k.e(deviceInfoService, "deviceInfoService");
        AbstractC3340k.e(screenInfoService, "screenInfoService");
        AbstractC3340k.e(userIdentifierService, "userIdentifierService");
        AbstractC3340k.e(adDataService, "adDataService");
        AbstractC3340k.e(encoderService, "encoderService");
        AbstractC3340k.e(userEventConfigService, "userEventConfigService");
        this.f29598a = appInfoService;
        this.f29599b = networkInfoService;
        this.f29600c = deviceInfoService;
        this.f29601d = screenInfoService;
        this.f29602e = userIdentifierService;
        this.f29603f = adDataService;
        this.f29604g = encoderService;
        this.f29605h = userEventConfigService;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r11, Ba.c r13, java.lang.String r14, lf.AbstractC3464c r15) {
        /*
            r10 = this;
            boolean r0 = r15 instanceof com.moloco.sdk.internal.services.events.b
            if (r0 == 0) goto L13
            r0 = r15
            com.moloco.sdk.internal.services.events.b r0 = (com.moloco.sdk.internal.services.events.b) r0
            int r1 = r0.f29597d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29597d = r1
            goto L18
        L13:
            com.moloco.sdk.internal.services.events.b r0 = new com.moloco.sdk.internal.services.events.b
            r0.<init>(r10, r15)
        L18:
            java.lang.Object r15 = r0.f29595b
            kf.a r1 = kf.a.f39711a
            int r2 = r0.f29597d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.String r14 = r0.f29594a
            Fe.e.U(r15)
            goto L54
        L29:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L31:
            Fe.e.U(r15)
            com.moloco.sdk.internal.services.events.e r15 = r10.f29605h
            com.moloco.sdk.internal.services.events.g r15 = r15.f29607a
            boolean r15 = r15.f29609a
            if (r15 != 0) goto L49
            com.moloco.sdk.internal.MolocoLogger r4 = com.moloco.sdk.internal.MolocoLogger.INSTANCE
            java.lang.String r6 = "Event reporting config disabled, UserAdInteractionExt not reporting"
            r7 = 0
            java.lang.String r5 = "CustomUserEventBuilderServiceImpl"
            r8 = 4
            r9 = 0
            com.moloco.sdk.internal.MolocoLogger.debug$default(r4, r5, r6, r7, r8, r9)
            return r14
        L49:
            r0.f29594a = r14
            r0.f29597d = r3
            java.lang.Object r15 = r10.b(r11, r13, r0)
            if (r15 != r1) goto L54
            return r1
        L54:
            java.lang.String r15 = (java.lang.String) r15
            android.net.Uri r11 = android.net.Uri.parse(r14)
            android.net.Uri$Builder r11 = r11.buildUpon()
            java.lang.String r12 = "user_ad_interaction_ext"
            android.net.Uri$Builder r11 = r11.appendQueryParameter(r12, r15)
            android.net.Uri r11 = r11.build()
            java.lang.String r11 = r11.toString()
            java.lang.String r12 = "toString(...)"
            kotlin.jvm.internal.AbstractC3340k.d(r11, r12)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.services.events.c.a(long, Ba.c, java.lang.String, lf.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(long r9, Ba.c r11, lf.AbstractC3464c r12) {
        /*
            Method dump skipped, instructions count: 662
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.services.events.c.b(long, Ba.c, lf.c):java.lang.Object");
    }
}
