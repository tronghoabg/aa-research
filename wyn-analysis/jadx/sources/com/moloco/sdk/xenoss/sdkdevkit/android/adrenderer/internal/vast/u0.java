package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes4.dex */
public final class u0 extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f32146a;

    /* renamed from: b, reason: collision with root package name */
    public int f32147b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f32148c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ XmlPullParser f32149d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.G f32150e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.G f32151f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.G f32152g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.G f32153h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.G f32154i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f32155j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(XmlPullParser xmlPullParser, InterfaceC3103c interfaceC3103c, kotlin.jvm.internal.G g9, kotlin.jvm.internal.G g10, kotlin.jvm.internal.G g11, kotlin.jvm.internal.G g12, kotlin.jvm.internal.G g13, boolean z2) {
        super(2, interfaceC3103c);
        this.f32149d = xmlPullParser;
        this.f32150e = g9;
        this.f32151f = g10;
        this.f32152g = g11;
        this.f32153h = g12;
        this.f32154i = g13;
        this.f32155j = z2;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        kotlin.jvm.internal.G g9 = this.f32154i;
        u0 u0Var = new u0(this.f32149d, interfaceC3103c, this.f32150e, this.f32151f, this.f32152g, this.f32153h, g9, this.f32155j);
        u0Var.f32148c = obj;
        return u0Var;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((u0) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x008b, code lost:
    
        if (r10 == r0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00aa, code lost:
    
        if (r10 == r0) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c2 A[PHI: r1 r7
  0x00c2: PHI (r1v2 int) = (r1v3 int), (r1v4 int), (r1v7 int) binds: [B:35:0x0090, B:38:0x009e, B:47:0x00ba] A[DONT_GENERATE, DONT_INLINE]
  0x00c2: PHI (r7v0 kotlin.jvm.internal.G) = (r7v1 kotlin.jvm.internal.G), (r7v18 kotlin.jvm.internal.G), (r7v20 kotlin.jvm.internal.G) binds: [B:35:0x0090, B:38:0x009e, B:47:0x00ba] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0061 -> B:73:0x013a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x006b -> B:73:0x013a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0071 -> B:73:0x013a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0092 -> B:50:0x00c3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00aa -> B:42:0x00ad). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x00c2 -> B:50:0x00c3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x0121 -> B:73:0x013a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x0137 -> B:73:0x013a). Please report as a decompilation issue!!! */
    @Override // lf.AbstractC3462a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.u0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
