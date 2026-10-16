package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import ef.C2515C;
import java.util.ArrayList;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes4.dex */
public final class s0 extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f32106a;

    /* renamed from: b, reason: collision with root package name */
    public int f32107b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f32108c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ XmlPullParser f32109d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.G f32110e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.G f32111f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.G f32112g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.G f32113h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.G f32114i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.G f32115j;
    public final /* synthetic */ ArrayList k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.G f32116l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ArrayList f32117m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ArrayList f32118n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(XmlPullParser xmlPullParser, InterfaceC3103c interfaceC3103c, kotlin.jvm.internal.G g9, kotlin.jvm.internal.G g10, kotlin.jvm.internal.G g11, kotlin.jvm.internal.G g12, kotlin.jvm.internal.G g13, kotlin.jvm.internal.G g14, ArrayList arrayList, kotlin.jvm.internal.G g15, ArrayList arrayList2, ArrayList arrayList3) {
        super(2, interfaceC3103c);
        this.f32109d = xmlPullParser;
        this.f32110e = g9;
        this.f32111f = g10;
        this.f32112g = g11;
        this.f32113h = g12;
        this.f32114i = g13;
        this.f32115j = g14;
        this.k = arrayList;
        this.f32116l = g15;
        this.f32117m = arrayList2;
        this.f32118n = arrayList3;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        ArrayList arrayList = this.f32117m;
        ArrayList arrayList2 = this.f32118n;
        s0 s0Var = new s0(this.f32109d, interfaceC3103c, this.f32110e, this.f32111f, this.f32112g, this.f32113h, this.f32114i, this.f32115j, this.k, this.f32116l, arrayList, arrayList2);
        s0Var.f32108c = obj;
        return s0Var;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((s0) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x024b, code lost:
    
        r12.f32112g.f39740a = null;
        r12.f32113h.f39740a = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.J0.f(r6, "apiFramework");
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c4, code lost:
    
        if (r13 == r0) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ec, code lost:
    
        if (r13 == r0) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x012d, code lost:
    
        if (r13 == r0) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0156, code lost:
    
        if (r13 == r0) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01b3, code lost:
    
        if (r13 == r0) goto L104;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:100:0x01ca -> B:127:0x024b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:123:0x0233 -> B:127:0x024b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:125:0x0248 -> B:127:0x024b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0095 -> B:127:0x024b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x009f -> B:127:0x024b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00a5 -> B:127:0x024b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00ab -> B:127:0x024b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00b6 -> B:127:0x024b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00ca -> B:127:0x024b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00cc -> B:127:0x024b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00dc -> B:127:0x024b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x00ec -> B:51:0x00f0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x0101 -> B:127:0x024b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x011f -> B:127:0x024b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x0133 -> B:127:0x024b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x0135 -> B:127:0x024b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x0145 -> B:127:0x024b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:82:0x017c -> B:127:0x024b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:84:0x0187 -> B:127:0x024b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:91:0x01a5 -> B:127:0x024b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:97:0x01b8 -> B:127:0x024b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:98:0x01ba -> B:127:0x024b). Please report as a decompilation issue!!! */
    @Override // lf.AbstractC3462a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 658
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.s0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
