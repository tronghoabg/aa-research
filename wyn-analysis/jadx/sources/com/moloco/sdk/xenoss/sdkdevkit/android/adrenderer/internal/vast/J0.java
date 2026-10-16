package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import ef.C2529m;
import ef.C2532p;
import j$.util.DesugarTimeZone;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes4.dex */
public abstract class J0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C2532p f31197a = Fe.c.z(new com.moloco.sdk.service_locator.h(17));

    /* renamed from: b, reason: collision with root package name */
    public static final NumberFormat f31198b = NumberFormat.getPercentInstance();

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A(org.xmlpull.v1.XmlPullParser r5, lf.AbstractC3464c r6) {
        /*
            boolean r0 = r6 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.Y
            if (r0 == 0) goto L13
            r0 = r6
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.Y r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.Y) r0
            int r1 = r0.f31319c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31319c = r1
            goto L18
        L13:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.Y r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.Y
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f31318b
            kf.a r1 = kf.a.f39711a
            int r2 = r0.f31319c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.util.ArrayList r5 = r0.f31317a
            Fe.e.U(r6)
            return r5
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            Fe.e.U(r6)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.X r2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.X
            r4 = 0
            r2.<init>(r5, r4, r6)
            r0.f31317a = r6
            r0.f31319c = r3
            java.lang.Object r5 = Ef.H.l(r2, r0)
            if (r5 != r1) goto L4a
            return r1
        L4a:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.J0.A(org.xmlpull.v1.XmlPullParser, lf.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object B(org.xmlpull.v1.XmlPullParser r10, lf.AbstractC3464c r11) {
        /*
            boolean r0 = r11 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.C2058a0
            if (r0 == 0) goto L13
            r0 = r11
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.a0 r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.C2058a0) r0
            int r1 = r0.f31331e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31331e = r1
            goto L18
        L13:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.a0 r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.a0
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f31330d
            kf.a r1 = kf.a.f39711a
            int r2 = r0.f31331e
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            kotlin.jvm.internal.G r10 = r0.f31329c
            kotlin.jvm.internal.G r1 = r0.f31328b
            kotlin.jvm.internal.G r0 = r0.f31327a
            Fe.e.U(r11)
            goto L5c
        L2d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L35:
            kotlin.jvm.internal.G r7 = A7.AbstractC0279p0.s(r11)
            kotlin.jvm.internal.G r9 = new kotlin.jvm.internal.G
            r9.<init>()
            kotlin.jvm.internal.G r8 = new kotlin.jvm.internal.G
            r8.<init>()
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.Z r4 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.Z
            r6 = 0
            r5 = r10
            r4.<init>(r5, r6, r7, r8, r9)
            r0.f31327a = r7
            r0.f31328b = r9
            r0.f31329c = r8
            r0.f31331e = r3
            java.lang.Object r10 = Ef.H.l(r4, r0)
            if (r10 != r1) goto L59
            return r1
        L59:
            r0 = r7
            r10 = r8
            r1 = r9
        L5c:
            java.lang.Object r11 = r0.f39740a
            if (r11 == 0) goto L7e
            java.lang.Object r0 = r1.f39740a
            if (r0 == 0) goto L7e
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.C r1 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.C.f31449n
            if (r11 != r1) goto L6d
            java.lang.Object r1 = r10.f39740a
            if (r1 != 0) goto L6d
            goto L7e
        L6d:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.B r1 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.B
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.C r11 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.C) r11
            kotlin.jvm.internal.AbstractC3340k.b(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r10 = r10.f39740a
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y r10 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y) r10
            r1.<init>(r11, r0, r10)
            return r1
        L7e:
            r10 = 0
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.J0.B(org.xmlpull.v1.XmlPullParser, lf.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object C(org.xmlpull.v1.XmlPullParser r10, lf.AbstractC3464c r11) {
        /*
            boolean r0 = r11 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.C2064d0
            if (r0 == 0) goto L13
            r0 = r11
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.d0 r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.C2064d0) r0
            int r1 = r0.f31351e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31351e = r1
            goto L18
        L13:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.d0 r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.d0
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f31350d
            kf.a r1 = kf.a.f39711a
            int r2 = r0.f31351e
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            kotlin.jvm.internal.G r10 = r0.f31349c
            kotlin.jvm.internal.G r1 = r0.f31348b
            java.util.ArrayList r0 = r0.f31347a
            Fe.e.U(r11)
            goto L60
        L2d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L35:
            Fe.e.U(r11)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            kotlin.jvm.internal.G r7 = new kotlin.jvm.internal.G
            r7.<init>()
            kotlin.jvm.internal.G r8 = new kotlin.jvm.internal.G
            r8.<init>()
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.c0 r4 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.c0
            r6 = 0
            r5 = r10
            r4.<init>(r5, r6, r7, r8, r9)
            r0.f31347a = r9
            r0.f31348b = r7
            r0.f31349c = r8
            r0.f31351e = r3
            java.lang.Object r10 = Ef.H.l(r4, r0)
            if (r10 != r1) goto L5d
            return r1
        L5d:
            r1 = r7
            r10 = r8
            r0 = r9
        L60:
            boolean r11 = r0.isEmpty()
            if (r11 == 0) goto L6c
            java.lang.Object r11 = r10.f39740a
            if (r11 != 0) goto L6c
            r10 = 0
            return r10
        L6c:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.D r11 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.D
            java.lang.Object r10 = r10.f39740a
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r1 = r1.f39740a
            java.lang.String r1 = (java.lang.String) r1
            r11.<init>(r0, r10)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.J0.C(org.xmlpull.v1.XmlPullParser, lf.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object D(org.xmlpull.v1.XmlPullParser r6, lf.AbstractC3464c r7) {
        /*
            boolean r0 = r7 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.C2068f0
            if (r0 == 0) goto L13
            r0 = r7
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.f0 r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.C2068f0) r0
            int r1 = r0.f31370d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31370d = r1
            goto L18
        L13:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.f0 r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.f0
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f31369c
            kf.a r1 = kf.a.f39711a
            int r2 = r0.f31370d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            kotlin.jvm.internal.G r6 = r0.f31368b
            kotlin.jvm.internal.G r0 = r0.f31367a
            Fe.e.U(r7)
            goto L51
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            kotlin.jvm.internal.G r7 = A7.AbstractC0279p0.s(r7)
            kotlin.jvm.internal.G r2 = new kotlin.jvm.internal.G
            r2.<init>()
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e0 r5 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e0
            r5.<init>(r6, r3, r7, r2)
            r0.f31367a = r7
            r0.f31368b = r2
            r0.f31370d = r4
            java.lang.Object r6 = Ef.H.l(r5, r0)
            if (r6 != r1) goto L4f
            return r1
        L4f:
            r0 = r7
            r6 = r2
        L51:
            java.lang.Object r6 = r6.f39740a
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L61
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.J r7 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.J
            java.lang.Object r0 = r0.f39740a
            java.lang.String r0 = (java.lang.String) r0
            r7.<init>(r6)
            return r7
        L61:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.J0.D(org.xmlpull.v1.XmlPullParser, lf.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object E(org.xmlpull.v1.XmlPullParser r14, lf.AbstractC3464c r15) {
        /*
            boolean r1 = r15 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.C2076j0
            if (r1 == 0) goto L13
            r1 = r15
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.j0 r1 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.C2076j0) r1
            int r2 = r1.f31411h
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L13
            int r2 = r2 - r3
            r1.f31411h = r2
            goto L18
        L13:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.j0 r1 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.j0
            r1.<init>(r15)
        L18:
            java.lang.Object r0 = r1.f31410g
            kf.a r2 = kf.a.f39711a
            int r3 = r1.f31411h
            r4 = 1
            if (r3 == 0) goto L40
            if (r3 != r4) goto L38
            java.util.ArrayList r2 = r1.f31409f
            java.util.ArrayList r3 = r1.f31408e
            java.util.ArrayList r4 = r1.f31407d
            kotlin.jvm.internal.G r5 = r1.f31406c
            kotlin.jvm.internal.G r6 = r1.f31405b
            kotlin.jvm.internal.G r1 = r1.f31404a
            Fe.e.U(r0)
            r7 = r2
            r10 = r5
            r8 = r6
            r6 = r3
            r5 = r4
            goto L7d
        L38:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L40:
            kotlin.jvm.internal.G r9 = A7.AbstractC0279p0.s(r0)
            kotlin.jvm.internal.G r8 = new kotlin.jvm.internal.G
            r8.<init>()
            kotlin.jvm.internal.G r10 = new kotlin.jvm.internal.G
            r10.<init>()
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.i0 r5 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.i0
            r7 = 0
            r6 = r14
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            r1.f31404a = r9
            r1.f31405b = r8
            r1.f31406c = r10
            r1.f31407d = r11
            r1.f31408e = r12
            r1.f31409f = r13
            r1.f31411h = r4
            java.lang.Object r0 = Ef.H.l(r5, r1)
            if (r0 != r2) goto L79
            return r2
        L79:
            r1 = r9
            r5 = r11
            r6 = r12
            r7 = r13
        L7d:
            java.lang.Object r0 = r1.f39740a
            r3 = r0
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L93
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.b r2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.b
            java.lang.Object r0 = r8.f39740a
            r4 = r0
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            java.lang.Object r0 = r10.f39740a
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.h r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.C2090h) r0
            r2.<init>(r3, r4, r5, r6, r7)
            return r2
        L93:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.J0.E(org.xmlpull.v1.XmlPullParser, lf.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(org.xmlpull.v1.XmlPullParser r5, jf.InterfaceC3103c r6) {
        /*
            boolean r0 = r6 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.W
            if (r0 == 0) goto L13
            r0 = r6
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.W r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.W) r0
            int r1 = r0.f31311c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31311c = r1
            goto L18
        L13:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.W r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.W
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f31310b
            kf.a r1 = kf.a.f39711a
            int r2 = r0.f31311c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.jvm.internal.G r5 = r0.f31309a
            Fe.e.U(r6)
            goto L47
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.jvm.internal.G r6 = A7.AbstractC0279p0.s(r6)
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.V r2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.V
            r4 = 0
            r2.<init>(r5, r4, r6)
            r0.f31309a = r6
            r0.f31311c = r3
            java.lang.Object r5 = Ef.H.l(r2, r0)
            if (r5 != r1) goto L46
            return r1
        L46:
            r5 = r6
        L47:
            java.lang.Object r5 = r5.f39740a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.J0.a(org.xmlpull.v1.XmlPullParser, jf.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(org.xmlpull.v1.XmlPullParser r6, lf.AbstractC3464c r7) {
        /*
            boolean r0 = r7 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.C2080l0
            if (r0 == 0) goto L13
            r0 = r7
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l0 r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.C2080l0) r0
            int r1 = r0.f31423d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31423d = r1
            goto L18
        L13:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l0 r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l0
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f31422c
            kf.a r1 = kf.a.f39711a
            int r2 = r0.f31423d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            kotlin.jvm.internal.G r6 = r0.f31421b
            kotlin.jvm.internal.G r0 = r0.f31420a
            Fe.e.U(r7)
            goto L51
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            kotlin.jvm.internal.G r7 = A7.AbstractC0279p0.s(r7)
            kotlin.jvm.internal.G r2 = new kotlin.jvm.internal.G
            r2.<init>()
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k0 r5 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k0
            r5.<init>(r6, r3, r2, r7)
            r0.f31420a = r7
            r0.f31421b = r2
            r0.f31423d = r4
            java.lang.Object r6 = Ef.H.l(r5, r0)
            if (r6 != r1) goto L4f
            return r1
        L4f:
            r0 = r7
            r6 = r2
        L51:
            java.lang.Object r7 = r0.f39740a
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L61
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g r7 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g
            java.lang.Object r6 = r6.f39740a
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            r7.<init>()
            return r7
        L61:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.J0.b(org.xmlpull.v1.XmlPullParser, lf.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(org.xmlpull.v1.XmlPullParser r13, boolean r14, lf.AbstractC3464c r15) {
        /*
            boolean r0 = r15 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.v0
            if (r0 == 0) goto L13
            r0 = r15
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.v0 r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.v0) r0
            int r1 = r0.f32167g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f32167g = r1
            goto L18
        L13:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.v0 r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.v0
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f32166f
            kf.a r1 = kf.a.f39711a
            int r2 = r0.f32167g
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            kotlin.jvm.internal.G r13 = r0.f32165e
            kotlin.jvm.internal.G r14 = r0.f32164d
            kotlin.jvm.internal.G r1 = r0.f32163c
            kotlin.jvm.internal.G r2 = r0.f32162b
            kotlin.jvm.internal.G r0 = r0.f32161a
            Fe.e.U(r15)
            goto L71
        L31:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L39:
            kotlin.jvm.internal.G r7 = A7.AbstractC0279p0.s(r15)
            kotlin.jvm.internal.G r8 = new kotlin.jvm.internal.G
            r8.<init>()
            kotlin.jvm.internal.G r9 = new kotlin.jvm.internal.G
            r9.<init>()
            kotlin.jvm.internal.G r10 = new kotlin.jvm.internal.G
            r10.<init>()
            kotlin.jvm.internal.G r11 = new kotlin.jvm.internal.G
            r11.<init>()
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.u0 r4 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.u0
            r6 = 0
            r5 = r13
            r12 = r14
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            r0.f32161a = r7
            r0.f32162b = r8
            r0.f32163c = r9
            r0.f32164d = r10
            r0.f32165e = r11
            r0.f32167g = r3
            java.lang.Object r13 = Ef.H.l(r4, r0)
            if (r13 != r1) goto L6c
            return r1
        L6c:
            r0 = r7
            r2 = r8
            r1 = r9
            r14 = r10
            r13 = r11
        L71:
            java.lang.Object r13 = r13.f39740a
            r8 = r13
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.m r8 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.m) r8
            if (r8 == 0) goto L92
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.j r3 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.j
            java.lang.Object r13 = r0.f39740a
            r4 = r13
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r13 = r2.f39740a
            r5 = r13
            java.lang.Integer r5 = (java.lang.Integer) r5
            java.lang.Object r13 = r1.f39740a
            r6 = r13
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r13 = r14.f39740a
            r7 = r13
            java.lang.String r7 = (java.lang.String) r7
            r3.<init>(r4, r5, r6, r7, r8)
            return r3
        L92:
            r13 = 0
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.J0.c(org.xmlpull.v1.XmlPullParser, boolean, lf.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(org.xmlpull.v1.XmlPullParser r6, lf.AbstractC3464c r7) {
        /*
            boolean r0 = r7 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.n0
            if (r0 == 0) goto L13
            r0 = r7
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.n0 r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.n0) r0
            int r1 = r0.f31535d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31535d = r1
            goto L18
        L13:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.n0 r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.n0
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f31534c
            kf.a r1 = kf.a.f39711a
            int r2 = r0.f31535d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            kotlin.jvm.internal.G r6 = r0.f31533b
            kotlin.jvm.internal.G r0 = r0.f31532a
            Fe.e.U(r7)
            goto L51
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            kotlin.jvm.internal.G r7 = A7.AbstractC0279p0.s(r7)
            kotlin.jvm.internal.G r2 = new kotlin.jvm.internal.G
            r2.<init>()
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.m0 r5 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.m0
            r5.<init>(r6, r3, r2, r7)
            r0.f31532a = r7
            r0.f31533b = r2
            r0.f31535d = r4
            java.lang.Object r6 = Ef.H.l(r5, r0)
            if (r6 != r1) goto L4f
            return r1
        L4f:
            r0 = r7
            r6 = r2
        L51:
            java.lang.Object r7 = r0.f39740a
            if (r7 != 0) goto L5a
            java.lang.Object r0 = r6.f39740a
            if (r0 != 0) goto L5a
            return r3
        L5a:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.h r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.h
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r6 = r6.f39740a
            java.lang.String r6 = (java.lang.String) r6
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.J0.d(org.xmlpull.v1.XmlPullParser, lf.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(org.xmlpull.v1.XmlPullParser r5, boolean r6, lf.AbstractC3464c r7) {
        /*
            boolean r0 = r7 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.x0
            if (r0 == 0) goto L13
            r0 = r7
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.x0 r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.x0) r0
            int r1 = r0.f32193c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f32193c = r1
            goto L18
        L13:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.x0 r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.x0
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f32192b
            kf.a r1 = kf.a.f39711a
            int r2 = r0.f32193c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.util.ArrayList r5 = r0.f32191a
            Fe.e.U(r7)
            return r5
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            Fe.e.U(r7)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w0 r2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w0
            r4 = 0
            r2.<init>(r5, r4, r6, r7)
            r0.f32191a = r7
            r0.f32193c = r3
            java.lang.Object r5 = Ef.H.l(r2, r0)
            if (r5 != r1) goto L4a
            return r1
        L4a:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.J0.e(org.xmlpull.v1.XmlPullParser, boolean, lf.c):java.lang.Object");
    }

    public static final String f(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null || Bf.k.y0(attributeValue)) {
            return null;
        }
        return attributeValue;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object g(org.xmlpull.v1.XmlPullParser r10, lf.AbstractC3464c r11) {
        /*
            boolean r0 = r11 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.p0
            if (r0 == 0) goto L13
            r0 = r11
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.p0 r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.p0) r0
            int r1 = r0.f31558e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31558e = r1
            goto L18
        L13:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.p0 r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.p0
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f31557d
            kf.a r1 = kf.a.f39711a
            int r2 = r0.f31558e
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            kotlin.jvm.internal.G r10 = r0.f31556c
            kotlin.jvm.internal.G r1 = r0.f31555b
            kotlin.jvm.internal.G r0 = r0.f31554a
            Fe.e.U(r11)
            goto L5c
        L2d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L35:
            kotlin.jvm.internal.G r7 = A7.AbstractC0279p0.s(r11)
            kotlin.jvm.internal.G r8 = new kotlin.jvm.internal.G
            r8.<init>()
            kotlin.jvm.internal.G r9 = new kotlin.jvm.internal.G
            r9.<init>()
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.o0 r4 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.o0
            r6 = 0
            r5 = r10
            r4.<init>(r5, r6, r7, r8, r9)
            r0.f31554a = r7
            r0.f31555b = r8
            r0.f31556c = r9
            r0.f31558e = r3
            java.lang.Object r10 = Ef.H.l(r4, r0)
            if (r10 != r1) goto L59
            return r1
        L59:
            r0 = r7
            r1 = r8
            r10 = r9
        L5c:
            java.lang.Object r10 = r10.f39740a
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.f r10 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.AbstractC2088f) r10
            if (r10 == 0) goto L70
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.c r11 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.c
            java.lang.Object r0 = r0.f39740a
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r1.f39740a
            java.lang.Integer r0 = (java.lang.Integer) r0
            r11.<init>(r0, r10)
            return r11
        L70:
            r10 = 0
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.J0.g(org.xmlpull.v1.XmlPullParser, lf.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object h(org.xmlpull.v1.XmlPullParser r16, boolean r17, lf.AbstractC3464c r18) {
        /*
            r0 = r18
            boolean r1 = r0 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.L
            if (r1 == 0) goto L15
            r1 = r0
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.L r1 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.L) r1
            int r2 = r1.f31235j
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f31235j = r2
            goto L1a
        L15:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.L r1 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.L
            r1.<init>(r0)
        L1a:
            java.lang.Object r0 = r1.f31234i
            kf.a r2 = kf.a.f39711a
            int r3 = r1.f31235j
            r4 = 1
            if (r3 == 0) goto L47
            if (r3 != r4) goto L3f
            boolean r2 = r1.f31226a
            java.util.ArrayList r3 = r1.f31233h
            kotlin.jvm.internal.G r4 = r1.f31232g
            java.util.ArrayList r5 = r1.f31231f
            java.util.ArrayList r6 = r1.f31230e
            kotlin.jvm.internal.G r7 = r1.f31229d
            kotlin.jvm.internal.G r8 = r1.f31228c
            kotlin.jvm.internal.G r1 = r1.f31227b
            Fe.e.U(r0)
            r9 = r6
            r6 = r5
            r5 = r9
            r14 = r2
            r9 = r8
            r8 = r3
            goto L92
        L3f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L47:
            kotlin.jvm.internal.G r8 = A7.AbstractC0279p0.s(r0)
            kotlin.jvm.internal.G r9 = new kotlin.jvm.internal.G
            r9.<init>()
            kotlin.jvm.internal.G r10 = new kotlin.jvm.internal.G
            r10.<init>()
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            kotlin.jvm.internal.G r13 = new kotlin.jvm.internal.G
            r13.<init>()
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.K r5 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.K
            r7 = 0
            r6 = r16
            r14 = r17
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r1.f31227b = r8
            r1.f31228c = r9
            r1.f31229d = r10
            r1.f31230e = r11
            r1.f31231f = r12
            r1.f31232g = r13
            r1.f31233h = r15
            r1.f31226a = r14
            r1.f31235j = r4
            java.lang.Object r0 = Ef.H.l(r5, r1)
            if (r0 != r2) goto L8c
            return r2
        L8c:
            r1 = r8
            r7 = r10
            r5 = r11
            r6 = r12
            r4 = r13
            r8 = r15
        L92:
            if (r14 == 0) goto L9c
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L9c
            r0 = 0
            return r0
        L9c:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.u r2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.u
            java.lang.Object r0 = r1.f39740a
            r3 = r0
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y r3 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y) r3
            java.lang.Object r0 = r9.f39740a
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.C2089g) r0
            java.lang.Object r0 = r7.f39740a
            java.lang.Long r0 = (java.lang.Long) r0
            java.lang.Object r1 = r4.f39740a
            r7 = r1
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a r7 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.C2083a) r7
            r4 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.J0.h(org.xmlpull.v1.XmlPullParser, boolean, lf.c):java.lang.Object");
    }

    public static final boolean i(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object j(org.xmlpull.v1.XmlPullParser r5, lf.AbstractC3464c r6) {
        /*
            boolean r0 = r6 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.r0
            if (r0 == 0) goto L13
            r0 = r6
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.r0 r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.r0) r0
            int r1 = r0.f31587c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31587c = r1
            goto L18
        L13:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.r0 r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.r0
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f31586b
            kf.a r1 = kf.a.f39711a
            int r2 = r0.f31587c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.util.ArrayList r5 = r0.f31585a
            Fe.e.U(r6)
            return r5
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            Fe.e.U(r6)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.q0 r2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.q0
            r4 = 0
            r2.<init>(r5, r4, r6)
            r0.f31585a = r6
            r0.f31587c = r3
            java.lang.Object r5 = Ef.H.l(r2, r0)
            if (r5 != r1) goto L4a
            return r1
        L4a:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.J0.j(org.xmlpull.v1.XmlPullParser, lf.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object k(org.xmlpull.v1.XmlPullParser r10, boolean r11, lf.AbstractC3464c r12) {
        /*
            boolean r0 = r12 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.C2072h0
            if (r0 == 0) goto L13
            r0 = r12
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.h0 r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.C2072h0) r0
            int r1 = r0.f31387f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31387f = r1
            goto L18
        L13:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.h0 r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.h0
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f31386e
            kf.a r1 = kf.a.f39711a
            int r2 = r0.f31387f
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            boolean r11 = r0.f31382a
            java.util.ArrayList r10 = r0.f31385d
            java.util.ArrayList r1 = r0.f31384c
            kotlin.jvm.internal.G r0 = r0.f31383b
            Fe.e.U(r12)
            goto L60
        L2f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L37:
            kotlin.jvm.internal.G r7 = A7.AbstractC0279p0.s(r12)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.g0 r4 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.g0
            r6 = 0
            r5 = r10
            r4.<init>(r5, r6, r7, r8, r9)
            r0.f31383b = r7
            r0.f31384c = r8
            r0.f31385d = r9
            r0.f31382a = r11
            r0.f31387f = r3
            java.lang.Object r10 = Ef.H.l(r4, r0)
            if (r10 != r1) goto L5d
            return r1
        L5d:
            r0 = r7
            r1 = r8
            r10 = r9
        L60:
            if (r11 == 0) goto L68
            java.lang.Object r11 = r0.f39740a
            if (r11 != 0) goto L68
            r10 = 0
            return r10
        L68:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a r11 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a
            java.lang.Object r12 = r0.f39740a
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.J r12 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.J) r12
            r11.<init>(r12, r1, r10)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.J0.k(org.xmlpull.v1.XmlPullParser, boolean, lf.c):java.lang.Object");
    }

    public static final boolean l(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m(org.xmlpull.v1.XmlPullParser r18, lf.AbstractC3464c r19) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.J0.m(org.xmlpull.v1.XmlPullParser, lf.c):java.lang.Object");
    }

    public static final Long n(String str) {
        Object objZ;
        Object objZ2;
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss.SSS", Locale.ROOT);
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
            Date date = simpleDateFormat.parse(str);
            objZ = date != null ? Long.valueOf(date.getTime()) : null;
        } catch (Throwable th) {
            objZ = Fe.e.z(th);
        }
        if (objZ instanceof C2529m) {
            objZ = null;
        }
        Long l10 = (Long) objZ;
        if (l10 != null) {
            return l10;
        }
        try {
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("HH:mm:ss", Locale.ROOT);
            simpleDateFormat2.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
            Date date2 = simpleDateFormat2.parse(str);
            objZ2 = date2 != null ? Long.valueOf(date2.getTime()) : null;
        } catch (Throwable th2) {
            objZ2 = Fe.e.z(th2);
        }
        return (Long) (objZ2 instanceof C2529m ? null : objZ2);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y o(java.lang.String r3) {
        /*
            java.lang.Long r0 = n(r3)
            if (r0 == 0) goto L10
            long r0 = r0.longValue()
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x r3 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x
            r3.<init>(r0)
            return r3
        L10:
            r0 = 0
            java.text.NumberFormat r1 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.J0.f31198b     // Catch: java.lang.Throwable -> L2d
            java.lang.Number r3 = r1.parse(r3)     // Catch: java.lang.Throwable -> L2d
            if (r3 == 0) goto L2f
            float r3 = r3.floatValue()     // Catch: java.lang.Throwable -> L2d
            r1 = 100
            float r1 = (float) r1     // Catch: java.lang.Throwable -> L2d
            float r3 = r3 * r1
            int r3 = (int) r3     // Catch: java.lang.Throwable -> L2d
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L2d
            if (r3 < 0) goto L2f
            r2 = 101(0x65, float:1.42E-43)
            if (r3 >= r2) goto L2f
            goto L35
        L2d:
            r3 = move-exception
            goto L31
        L2f:
            r1 = r0
            goto L35
        L31:
            ef.m r1 = Fe.e.z(r3)
        L35:
            boolean r3 = r1 instanceof ef.C2529m
            if (r3 == 0) goto L3a
            r1 = r0
        L3a:
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto L47
            int r3 = r1.intValue()
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.w r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.w
            r0.<init>(r3)
        L47:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.J0.o(java.lang.String):com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object p(org.xmlpull.v1.XmlPullParser r4, lf.AbstractC3464c r5) {
        /*
            boolean r0 = r5 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.y0
            if (r0 == 0) goto L13
            r0 = r5
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.y0 r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.y0) r0
            int r1 = r0.f32200b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f32200b = r1
            goto L18
        L13:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.y0 r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.y0
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f32199a
            kf.a r1 = kf.a.f39711a
            int r2 = r0.f32200b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            Fe.e.U(r5)
            goto L3b
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            Fe.e.U(r5)
            r0.f32200b = r3
            java.lang.Object r5 = a(r4, r0)
            if (r5 != r1) goto L3b
            return r1
        L3b:
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L45
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.o r4 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.o
            r4.<init>(r5)
            return r4
        L45:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.J0.p(org.xmlpull.v1.XmlPullParser, lf.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object q(org.xmlpull.v1.XmlPullParser r4, lf.AbstractC3464c r5) {
        /*
            boolean r0 = r5 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.z0
            if (r0 == 0) goto L13
            r0 = r5
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.z0 r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.z0) r0
            int r1 = r0.f32207b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f32207b = r1
            goto L18
        L13:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.z0 r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.z0
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f32206a
            kf.a r1 = kf.a.f39711a
            int r2 = r0.f32207b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            Fe.e.U(r5)
            goto L3b
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            Fe.e.U(r5)
            r0.f32207b = r3
            java.lang.Object r5 = a(r4, r0)
            if (r5 != r1) goto L3b
            return r1
        L3b:
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L45
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.p r4 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.p
            r4.<init>(r5)
            return r4
        L45:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.J0.q(org.xmlpull.v1.XmlPullParser, lf.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object r(org.xmlpull.v1.XmlPullParser r6, lf.AbstractC3464c r7) {
        /*
            boolean r0 = r7 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.B0
            if (r0 == 0) goto L13
            r0 = r7
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.B0 r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.B0) r0
            int r1 = r0.f31115d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31115d = r1
            goto L18
        L13:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.B0 r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.B0
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f31114c
            kf.a r1 = kf.a.f39711a
            int r2 = r0.f31115d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            java.util.ArrayList r6 = r0.f31113b
            kotlin.jvm.internal.G r0 = r0.f31112a
            Fe.e.U(r7)
            goto L51
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            kotlin.jvm.internal.G r7 = A7.AbstractC0279p0.s(r7)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.A0 r5 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.A0
            r5.<init>(r6, r3, r7, r2)
            r0.f31112a = r7
            r0.f31113b = r2
            r0.f31115d = r4
            java.lang.Object r6 = Ef.H.l(r5, r0)
            if (r6 != r1) goto L4f
            return r1
        L4f:
            r0 = r7
            r6 = r2
        L51:
            java.lang.Object r7 = r0.f39740a
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L5d
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.r r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.r
            r0.<init>(r7, r6)
            return r0
        L5d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.J0.r(org.xmlpull.v1.XmlPullParser, lf.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object s(org.xmlpull.v1.XmlPullParser r17, lf.AbstractC3464c r18) {
        /*
            Method dump skipped, instructions count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.J0.s(org.xmlpull.v1.XmlPullParser, lf.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object t(org.xmlpull.v1.XmlPullParser r5, lf.AbstractC3464c r6) {
        /*
            boolean r0 = r6 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.F0
            if (r0 == 0) goto L13
            r0 = r6
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.F0 r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.F0) r0
            int r1 = r0.f31161c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31161c = r1
            goto L18
        L13:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.F0 r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.F0
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f31160b
            kf.a r1 = kf.a.f39711a
            int r2 = r0.f31161c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.util.ArrayList r5 = r0.f31159a
            Fe.e.U(r6)
            return r5
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            Fe.e.U(r6)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.E0 r2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.E0
            r4 = 0
            r2.<init>(r5, r4, r6)
            r0.f31159a = r6
            r0.f31161c = r3
            java.lang.Object r5 = Ef.H.l(r2, r0)
            if (r5 != r1) goto L4a
            return r1
        L4a:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.J0.t(org.xmlpull.v1.XmlPullParser, lf.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object u(org.xmlpull.v1.XmlPullParser r6, lf.AbstractC3464c r7) {
        /*
            boolean r0 = r7 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.H0
            if (r0 == 0) goto L13
            r0 = r7
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.H0 r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.H0) r0
            int r1 = r0.f31175d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31175d = r1
            goto L18
        L13:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.H0 r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.H0
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f31174c
            kf.a r1 = kf.a.f39711a
            int r2 = r0.f31175d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            kotlin.jvm.internal.G r6 = r0.f31173b
            kotlin.jvm.internal.G r0 = r0.f31172a
            Fe.e.U(r7)
            goto L51
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            kotlin.jvm.internal.G r7 = A7.AbstractC0279p0.s(r7)
            kotlin.jvm.internal.G r2 = new kotlin.jvm.internal.G
            r2.<init>()
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.G0 r5 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.G0
            r5.<init>(r6, r3, r7, r2)
            r0.f31172a = r7
            r0.f31173b = r2
            r0.f31175d = r4
            java.lang.Object r6 = Ef.H.l(r5, r0)
            if (r6 != r1) goto L4f
            return r1
        L4f:
            r0 = r7
            r6 = r2
        L51:
            java.lang.Object r6 = r6.f39740a
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L61
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.s r7 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.s
            java.lang.Object r0 = r0.f39740a
            java.lang.String r0 = (java.lang.String) r0
            r7.<init>(r6)
            return r7
        L61:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.J0.u(org.xmlpull.v1.XmlPullParser, lf.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object v(org.xmlpull.v1.XmlPullParser r16, lf.AbstractC3464c r17) {
        /*
            r0 = r17
            boolean r1 = r0 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.J
            if (r1 == 0) goto L15
            r1 = r0
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.J r1 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.J) r1
            int r2 = r1.f31196j
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f31196j = r2
            goto L1a
        L15:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.J r1 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.J
            r1.<init>(r0)
        L1a:
            java.lang.Object r0 = r1.f31195i
            kf.a r2 = kf.a.f39711a
            int r3 = r1.f31196j
            r4 = 1
            if (r3 == 0) goto L41
            if (r3 != r4) goto L39
            java.util.ArrayList r2 = r1.f31194h
            java.util.ArrayList r3 = r1.f31193g
            java.util.ArrayList r4 = r1.f31192f
            kotlin.jvm.internal.G r5 = r1.f31191e
            kotlin.jvm.internal.G r6 = r1.f31190d
            kotlin.jvm.internal.G r7 = r1.f31189c
            kotlin.jvm.internal.G r8 = r1.f31188b
            kotlin.jvm.internal.G r1 = r1.f31187a
            Fe.e.U(r0)
            goto L91
        L39:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L41:
            kotlin.jvm.internal.G r8 = A7.AbstractC0279p0.s(r0)
            kotlin.jvm.internal.G r9 = new kotlin.jvm.internal.G
            r9.<init>()
            kotlin.jvm.internal.G r10 = new kotlin.jvm.internal.G
            r10.<init>()
            kotlin.jvm.internal.G r11 = new kotlin.jvm.internal.G
            r11.<init>()
            kotlin.jvm.internal.G r12 = new kotlin.jvm.internal.G
            r12.<init>()
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.I0 r5 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.I0
            r7 = 0
            r6 = r16
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r1.f31187a = r8
            r1.f31188b = r9
            r1.f31189c = r10
            r1.f31190d = r11
            r1.f31191e = r12
            r1.f31192f = r13
            r1.f31193g = r14
            r1.f31194h = r15
            r1.f31196j = r4
            java.lang.Object r0 = Ef.H.l(r5, r1)
            if (r0 != r2) goto L89
            return r2
        L89:
            r1 = r8
            r8 = r9
            r7 = r10
            r6 = r11
            r5 = r12
            r4 = r13
            r3 = r14
            r2 = r15
        L91:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.t r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.t
            java.lang.Object r1 = r1.f39740a
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.h r1 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.C2090h) r1
            java.lang.Object r1 = r8.f39740a
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r7.f39740a
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r6.f39740a
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r5.f39740a
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.z r1 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.z) r1
            r0.<init>(r4, r3, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.J0.v(org.xmlpull.v1.XmlPullParser, lf.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object w(org.xmlpull.v1.XmlPullParser r23, lf.AbstractC3464c r24) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.J0.w(org.xmlpull.v1.XmlPullParser, lf.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object x(org.xmlpull.v1.XmlPullParser r5, lf.AbstractC3464c r6) {
        /*
            boolean r0 = r6 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.P
            if (r0 == 0) goto L13
            r0 = r6
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.P r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.P) r0
            int r1 = r0.f31279c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31279c = r1
            goto L18
        L13:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.P r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.P
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f31278b
            kf.a r1 = kf.a.f39711a
            int r2 = r0.f31279c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.util.ArrayList r5 = r0.f31277a
            Fe.e.U(r6)
            return r5
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            Fe.e.U(r6)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.O r2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.O
            r4 = 0
            r2.<init>(r5, r4, r6)
            r0.f31277a = r6
            r0.f31279c = r3
            java.lang.Object r5 = Ef.H.l(r2, r0)
            if (r5 != r1) goto L4a
            return r1
        L4a:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.J0.x(org.xmlpull.v1.XmlPullParser, lf.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object y(org.xmlpull.v1.XmlPullParser r6, lf.AbstractC3464c r7) {
        /*
            boolean r0 = r7 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.S
            if (r0 == 0) goto L13
            r0 = r7
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.S r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.S) r0
            int r1 = r0.f31287d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31287d = r1
            goto L18
        L13:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.S r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.S
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f31286c
            kf.a r1 = kf.a.f39711a
            int r2 = r0.f31287d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            kotlin.jvm.internal.G r6 = r0.f31285b
            kotlin.jvm.internal.G r0 = r0.f31284a
            Fe.e.U(r7)
            goto L51
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            kotlin.jvm.internal.G r7 = A7.AbstractC0279p0.s(r7)
            kotlin.jvm.internal.G r2 = new kotlin.jvm.internal.G
            r2.<init>()
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.Q r5 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.Q
            r5.<init>(r6, r3, r7, r2)
            r0.f31284a = r7
            r0.f31285b = r2
            r0.f31287d = r4
            java.lang.Object r6 = Ef.H.l(r5, r0)
            if (r6 != r1) goto L4f
            return r1
        L4f:
            r0 = r7
            r6 = r2
        L51:
            java.lang.Object r7 = r0.f39740a
            if (r7 != 0) goto L5a
            java.lang.Object r0 = r6.f39740a
            if (r0 != 0) goto L5a
            return r3
        L5a:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.z r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.z
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r6 = r6.f39740a
            java.lang.String r6 = (java.lang.String) r6
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.J0.y(org.xmlpull.v1.XmlPullParser, lf.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object z(org.xmlpull.v1.XmlPullParser r6, lf.AbstractC3464c r7) {
        /*
            boolean r0 = r7 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.U
            if (r0 == 0) goto L13
            r0 = r7
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.U r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.U) r0
            int r1 = r0.f31295d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31295d = r1
            goto L18
        L13:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.U r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.U
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f31294c
            kf.a r1 = kf.a.f39711a
            int r2 = r0.f31295d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            kotlin.jvm.internal.G r6 = r0.f31293b
            kotlin.jvm.internal.G r0 = r0.f31292a
            Fe.e.U(r7)
            goto L51
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            kotlin.jvm.internal.G r7 = A7.AbstractC0279p0.s(r7)
            kotlin.jvm.internal.G r2 = new kotlin.jvm.internal.G
            r2.<init>()
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.T r5 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.T
            r5.<init>(r6, r3, r2, r7)
            r0.f31292a = r7
            r0.f31293b = r2
            r0.f31295d = r4
            java.lang.Object r6 = Ef.H.l(r5, r0)
            if (r6 != r1) goto L4f
            return r1
        L4f:
            r0 = r7
            r6 = r2
        L51:
            java.lang.Object r7 = r0.f39740a
            if (r7 == 0) goto L67
            java.lang.Object r6 = r6.f39740a
            if (r6 != 0) goto L5a
            goto L67
        L5a:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.A r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.A
            java.lang.String r7 = (java.lang.String) r7
            kotlin.jvm.internal.AbstractC3340k.b(r6)
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.n r6 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.n) r6
            r0.<init>(r7, r6)
            return r0
        L67:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.J0.z(org.xmlpull.v1.XmlPullParser, lf.c):java.lang.Object");
    }
}
