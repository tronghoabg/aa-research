package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import ef.C2515C;
import java.util.ArrayList;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes4.dex */
public final class C0 extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f31118a;

    /* renamed from: b, reason: collision with root package name */
    public int f31119b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f31120c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ XmlPullParser f31121d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.G f31122e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.G f31123f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.G f31124g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.G f31125h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.G f31126i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.G f31127j;
    public final /* synthetic */ kotlin.jvm.internal.G k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.G f31128l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ArrayList f31129m;

    /* renamed from: n, reason: collision with root package name */
    public kotlin.jvm.internal.G f31130n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0(XmlPullParser xmlPullParser, InterfaceC3103c interfaceC3103c, kotlin.jvm.internal.G g9, kotlin.jvm.internal.G g10, kotlin.jvm.internal.G g11, kotlin.jvm.internal.G g12, kotlin.jvm.internal.G g13, kotlin.jvm.internal.G g14, kotlin.jvm.internal.G g15, kotlin.jvm.internal.G g16, ArrayList arrayList) {
        super(2, interfaceC3103c);
        this.f31121d = xmlPullParser;
        this.f31122e = g9;
        this.f31123f = g10;
        this.f31124g = g11;
        this.f31125h = g12;
        this.f31126i = g13;
        this.f31127j = g14;
        this.k = g15;
        this.f31128l = g16;
        this.f31129m = arrayList;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        kotlin.jvm.internal.G g9 = this.f31128l;
        ArrayList arrayList = this.f31129m;
        C0 c02 = new C0(this.f31121d, interfaceC3103c, this.f31122e, this.f31123f, this.f31124g, this.f31125h, this.f31126i, this.f31127j, this.k, g9, arrayList);
        c02.f31120c = obj;
        return c02;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x0163, code lost:
    
        if (r14 == r0) goto L87;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0126 A[PHI: r1 r10 r11
  0x0126: PHI (r1v4 int) = (r1v2 int), (r1v3 int), (r1v7 int), (r1v8 int) binds: [B:71:0x011e, B:61:0x00fb, B:52:0x00d8, B:74:0x0128] A[DONT_GENERATE, DONT_INLINE]
  0x0126: PHI (r10v2 kotlin.jvm.internal.G) = 
  (r10v0 kotlin.jvm.internal.G)
  (r10v1 kotlin.jvm.internal.G)
  (r10v8 kotlin.jvm.internal.G)
  (r10v17 kotlin.jvm.internal.G)
 binds: [B:71:0x011e, B:61:0x00fb, B:52:0x00d8, B:74:0x0128] A[DONT_GENERATE, DONT_INLINE]
  0x0126: PHI (r11v2 org.xmlpull.v1.XmlPullParser) = 
  (r11v0 org.xmlpull.v1.XmlPullParser)
  (r11v1 org.xmlpull.v1.XmlPullParser)
  (r11v5 org.xmlpull.v1.XmlPullParser)
  (r11v7 org.xmlpull.v1.XmlPullParser)
 binds: [B:71:0x011e, B:61:0x00fb, B:52:0x00d8, B:74:0x0128] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x014f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:117:0x01e9 -> B:121:0x0201). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:119:0x01fe -> B:121:0x0201). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x008e -> B:121:0x0201). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0098 -> B:121:0x0201). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:84:0x0155 -> B:121:0x0201). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:86:0x0163 -> B:88:0x0166). Please report as a decompilation issue!!! */
    @Override // lf.AbstractC3462a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 527
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.C0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
