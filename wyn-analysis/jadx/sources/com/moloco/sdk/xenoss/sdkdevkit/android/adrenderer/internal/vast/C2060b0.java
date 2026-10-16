package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.b0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2060b0 extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f31333a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ XmlPullParser f31334b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2060b0(XmlPullParser xmlPullParser, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f31334b = xmlPullParser;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new C2060b0(this.f31334b, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C2060b0) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f31333a;
        if (i5 != 0) {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Fe.e.U(obj);
            return obj;
        }
        Fe.e.U(obj);
        this.f31333a = 1;
        Object objC = J0.C(this.f31334b, this);
        return objC == aVar ? aVar : objC;
    }
}
