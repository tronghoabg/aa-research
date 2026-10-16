package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import ef.C2515C;
import java.io.IOException;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes4.dex */
public final class Z extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f31320a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ XmlPullParser f31321b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.G f31322c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.G f31323d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.G f31324e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z(XmlPullParser xmlPullParser, InterfaceC3103c interfaceC3103c, kotlin.jvm.internal.G g9, kotlin.jvm.internal.G g10, kotlin.jvm.internal.G g11) {
        super(2, interfaceC3103c);
        this.f31321b = xmlPullParser;
        this.f31322c = g9;
        this.f31323d = g10;
        this.f31324e = g11;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        Z z2 = new Z(this.f31321b, interfaceC3103c, this.f31322c, this.f31323d, this.f31324e);
        z2.f31320a = obj;
        return z2;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) throws XmlPullParserException, IOException {
        Z z2 = (Z) create((Ef.E) obj, (InterfaceC3103c) obj2);
        C2515C c2515c = C2515C.f34653a;
        z2.invokeSuspend(c2515c);
        return c2515c;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0114  */
    @Override // lf.AbstractC3462a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.Z.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
