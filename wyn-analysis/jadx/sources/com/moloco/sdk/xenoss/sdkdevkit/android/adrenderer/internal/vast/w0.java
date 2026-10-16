package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import ef.C2515C;
import java.util.ArrayList;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes4.dex */
public final class w0 extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f32179a;

    /* renamed from: b, reason: collision with root package name */
    public int f32180b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f32181c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ XmlPullParser f32182d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f32183e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ArrayList f32184f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(XmlPullParser xmlPullParser, InterfaceC3103c interfaceC3103c, boolean z2, ArrayList arrayList) {
        super(2, interfaceC3103c);
        this.f32182d = xmlPullParser;
        this.f32183e = z2;
        this.f32184f = arrayList;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        w0 w0Var = new w0(this.f32182d, interfaceC3103c, this.f32183e, this.f32184f);
        w0Var.f32181c = obj;
        return w0Var;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((w0) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0077  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x004f -> B:47:0x00b3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0058 -> B:47:0x00b3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0064 -> B:47:0x00b3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0070 -> B:30:0x0073). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0083 -> B:47:0x00b3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x009a -> B:47:0x00b3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00b0 -> B:47:0x00b3). Please report as a decompilation issue!!! */
    @Override // lf.AbstractC3462a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r7 = this;
            kf.a r0 = kf.a.f39711a
            int r1 = r7.f32180b
            ef.C r2 = ef.C2515C.f34653a
            r3 = 1
            r4 = 2
            org.xmlpull.v1.XmlPullParser r5 = r7.f32182d
            if (r1 == 0) goto L1c
            if (r1 != r3) goto L14
            int r1 = r7.f32179a
            Fe.e.U(r8)
            goto L73
        L14:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1c:
            Fe.e.U(r8)
            java.lang.Object r8 = r7.f32181c
            Ef.E r8 = (Ef.E) r8
            Ef.H.o(r8)
            boolean r8 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.J0.i(r5)
            if (r8 == 0) goto L2f
            r5.nextTag()
        L2f:
            int r8 = r5.getEventType()
            if (r8 != r3) goto L37
            goto Lb7
        L37:
            int r8 = r5.getEventType()
            if (r8 != r4) goto Lb8
            int r8 = r5.getDepth()
            r1 = r8
        L42:
            int r8 = r5.getDepth()
            if (r8 < r1) goto Lb7
            int r8 = r5.getDepth()
            int r8 = r8 - r1
            if (r8 == 0) goto L7d
            if (r8 == r3) goto L52
            goto Lb3
        L52:
            ef.p r8 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.J0.f31197a
            int r8 = r5.getEventType()
            if (r8 != r4) goto Lb3
            java.lang.String r8 = r5.getName()
            java.lang.String r6 = "Creative"
            boolean r8 = kotlin.jvm.internal.AbstractC3340k.a(r8, r6)
            if (r8 == 0) goto Lb3
            r7.f32179a = r1
            r7.f32180b = r3
            boolean r8 = r7.f32183e
            java.lang.Object r8 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.J0.c(r5, r8, r7)
            if (r8 != r0) goto L73
            return r0
        L73:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.j r8 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.C2092j) r8
            if (r8 == 0) goto Lb3
            java.util.ArrayList r6 = r7.f32184f
            r6.add(r8)
            goto Lb3
        L7d:
            ef.p r8 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.J0.f31197a
            int r8 = r5.getEventType()
            if (r8 != r4) goto L86
            goto Lb3
        L86:
            int r8 = r5.getEventType()
            r6 = 4
            if (r8 != r6) goto Lab
            java.lang.String r8 = r5.getText()
            if (r8 == 0) goto Lab
            boolean r8 = Bf.k.y0(r8)
            if (r8 == 0) goto L9a
            goto Lab
        L9a:
            java.lang.String r8 = r5.getText()
            java.lang.String r6 = "getText(...)"
            kotlin.jvm.internal.AbstractC3340k.d(r8, r6)
            java.lang.CharSequence r8 = Bf.k.V0(r8)
            r8.toString()
            goto Lb3
        Lab:
            int r8 = r5.getEventType()
            r6 = 3
            if (r8 != r6) goto Lb3
            return r2
        Lb3:
            r5.next()
            goto L42
        Lb7:
            return r2
        Lb8:
            org.xmlpull.v1.XmlPullParserException r8 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r0 = "iterateCurrentTagEvents call is allowed only for START_TAG event"
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
