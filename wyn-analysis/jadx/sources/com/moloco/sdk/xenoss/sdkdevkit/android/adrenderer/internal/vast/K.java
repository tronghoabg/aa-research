package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import ef.C2515C;
import java.util.ArrayList;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes4.dex */
public final class K extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f31199a;

    /* renamed from: b, reason: collision with root package name */
    public int f31200b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f31201c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ XmlPullParser f31202d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.G f31203e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.G f31204f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.G f31205g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ArrayList f31206h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ArrayList f31207i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.G f31208j;
    public final /* synthetic */ boolean k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ArrayList f31209l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(XmlPullParser xmlPullParser, InterfaceC3103c interfaceC3103c, kotlin.jvm.internal.G g9, kotlin.jvm.internal.G g10, kotlin.jvm.internal.G g11, ArrayList arrayList, ArrayList arrayList2, kotlin.jvm.internal.G g12, boolean z2, ArrayList arrayList3) {
        super(2, interfaceC3103c);
        this.f31202d = xmlPullParser;
        this.f31203e = g9;
        this.f31204f = g10;
        this.f31205g = g11;
        this.f31206h = arrayList;
        this.f31207i = arrayList2;
        this.f31208j = g12;
        this.k = z2;
        this.f31209l = arrayList3;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        ArrayList arrayList = this.f31209l;
        K k = new K(this.f31202d, interfaceC3103c, this.f31203e, this.f31204f, this.f31205g, this.f31206h, this.f31207i, this.f31208j, this.k, arrayList);
        k.f31201c = obj;
        return k;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((K) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e0, code lost:
    
        if (r12 == r0) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0142, code lost:
    
        if (r12 == r0) goto L79;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0084  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x008d -> B:99:0x01b6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0097 -> B:99:0x01b6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x009d -> B:99:0x01b6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00a3 -> B:99:0x01b6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00ae -> B:99:0x01b6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00cf -> B:99:0x01b6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00e0 -> B:47:0x00e4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x00f1 -> B:99:0x01b6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x0115 -> B:99:0x01b6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x0132 -> B:99:0x01b6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:75:0x0158 -> B:99:0x01b6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:95:0x019e -> B:99:0x01b6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:97:0x01b3 -> B:99:0x01b6). Please report as a decompilation issue!!! */
    @Override // lf.AbstractC3462a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.K.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
