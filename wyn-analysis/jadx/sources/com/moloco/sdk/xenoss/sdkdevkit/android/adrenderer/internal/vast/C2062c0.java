package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import ef.C2515C;
import java.util.ArrayList;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.c0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2062c0 extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f31337a;

    /* renamed from: b, reason: collision with root package name */
    public int f31338b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f31339c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ XmlPullParser f31340d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.G f31341e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.G f31342f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ArrayList f31343g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2062c0(XmlPullParser xmlPullParser, InterfaceC3103c interfaceC3103c, kotlin.jvm.internal.G g9, kotlin.jvm.internal.G g10, ArrayList arrayList) {
        super(2, interfaceC3103c);
        this.f31340d = xmlPullParser;
        this.f31341e = g9;
        this.f31342f = g10;
        this.f31343g = arrayList;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        kotlin.jvm.internal.G g9 = this.f31342f;
        ArrayList arrayList = this.f31343g;
        C2062c0 c2062c0 = new C2062c0(this.f31340d, interfaceC3103c, this.f31341e, g9, arrayList);
        c2062c0.f31339c = obj;
        return c2062c0;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C2062c0) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0099, code lost:
    
        if (r8 == r0) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x005c -> B:55:0x00e6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0066 -> B:55:0x00e6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x008c -> B:55:0x00e6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0099 -> B:38:0x009c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00ae -> B:55:0x00e6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x00cd -> B:55:0x00e6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x00e3 -> B:55:0x00e6). Please report as a decompilation issue!!! */
    @Override // lf.AbstractC3462a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.C2062c0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
