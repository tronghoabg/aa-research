package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import ef.C2515C;
import java.util.ArrayList;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes4.dex */
public final class O extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f31272a;

    /* renamed from: b, reason: collision with root package name */
    public int f31273b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f31274c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ XmlPullParser f31275d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ArrayList f31276e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(XmlPullParser xmlPullParser, InterfaceC3103c interfaceC3103c, ArrayList arrayList) {
        super(2, interfaceC3103c);
        this.f31275d = xmlPullParser;
        this.f31276e = arrayList;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        O o7 = new O(this.f31275d, interfaceC3103c, this.f31276e);
        o7.f31274c = obj;
        return o7;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((O) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0075  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x004f -> B:47:0x00b1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0058 -> B:47:0x00b1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0064 -> B:47:0x00b1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x006e -> B:30:0x0071). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0081 -> B:47:0x00b1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0098 -> B:47:0x00b1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00ae -> B:47:0x00b1). Please report as a decompilation issue!!! */
    @Override // lf.AbstractC3462a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r7 = this;
            kf.a r0 = kf.a.f39711a
            int r1 = r7.f31273b
            ef.C r2 = ef.C2515C.f34653a
            r3 = 1
            r4 = 2
            org.xmlpull.v1.XmlPullParser r5 = r7.f31275d
            if (r1 == 0) goto L1c
            if (r1 != r3) goto L14
            int r1 = r7.f31272a
            Fe.e.U(r8)
            goto L71
        L14:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1c:
            Fe.e.U(r8)
            java.lang.Object r8 = r7.f31274c
            Ef.E r8 = (Ef.E) r8
            Ef.H.o(r8)
            boolean r8 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.J0.i(r5)
            if (r8 == 0) goto L2f
            r5.nextTag()
        L2f:
            int r8 = r5.getEventType()
            if (r8 != r3) goto L37
            goto Lb5
        L37:
            int r8 = r5.getEventType()
            if (r8 != r4) goto Lb6
            int r8 = r5.getDepth()
            r1 = r8
        L42:
            int r8 = r5.getDepth()
            if (r8 < r1) goto Lb5
            int r8 = r5.getDepth()
            int r8 = r8 - r1
            if (r8 == 0) goto L7b
            if (r8 == r3) goto L52
            goto Lb1
        L52:
            ef.p r8 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.J0.f31197a
            int r8 = r5.getEventType()
            if (r8 != r4) goto Lb1
            java.lang.String r8 = r5.getName()
            java.lang.String r6 = "MediaFile"
            boolean r8 = kotlin.jvm.internal.AbstractC3340k.a(r8, r6)
            if (r8 == 0) goto Lb1
            r7.f31272a = r1
            r7.f31273b = r3
            java.lang.Object r8 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.J0.w(r5, r7)
            if (r8 != r0) goto L71
            return r0
        L71:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.v r8 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.v) r8
            if (r8 == 0) goto Lb1
            java.util.ArrayList r6 = r7.f31276e
            r6.add(r8)
            goto Lb1
        L7b:
            ef.p r8 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.J0.f31197a
            int r8 = r5.getEventType()
            if (r8 != r4) goto L84
            goto Lb1
        L84:
            int r8 = r5.getEventType()
            r6 = 4
            if (r8 != r6) goto La9
            java.lang.String r8 = r5.getText()
            if (r8 == 0) goto La9
            boolean r8 = Bf.k.y0(r8)
            if (r8 == 0) goto L98
            goto La9
        L98:
            java.lang.String r8 = r5.getText()
            java.lang.String r6 = "getText(...)"
            kotlin.jvm.internal.AbstractC3340k.d(r8, r6)
            java.lang.CharSequence r8 = Bf.k.V0(r8)
            r8.toString()
            goto Lb1
        La9:
            int r8 = r5.getEventType()
            r6 = 3
            if (r8 != r6) goto Lb1
            return r2
        Lb1:
            r5.next()
            goto L42
        Lb5:
            return r2
        Lb6:
            org.xmlpull.v1.XmlPullParserException r8 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r0 = "iterateCurrentTagEvents call is allowed only for START_TAG event"
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.O.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
