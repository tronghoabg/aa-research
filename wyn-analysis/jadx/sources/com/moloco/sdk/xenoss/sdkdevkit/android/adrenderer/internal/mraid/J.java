package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import Hf.x0;
import android.graphics.Rect;
import android.webkit.WebView;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes4.dex */
public final class J extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f30357a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ K3.r f30358b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f30359c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f30360d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f30361e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f30362f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(K3.r rVar, int i5, int i10, int i11, int i12, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f30358b = rVar;
        this.f30359c = i5;
        this.f30360d = i10;
        this.f30361e = i11;
        this.f30362f = i12;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new J(this.f30358b, this.f30359c, this.f30360d, this.f30361e, this.f30362f, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((J) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f30357a;
        if (i5 == 0) {
            Fe.e.U(obj);
            this.f30357a = 1;
            if (Ef.H.m(200L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Fe.e.U(obj);
        }
        K3.r rVar = this.f30358b;
        x0 x0Var = (x0) rVar.f6515e;
        Boolean boolValueOf = Boolean.valueOf(((WebView) rVar.f6511a).isShown());
        x0Var.getClass();
        x0Var.k(null, boolValueOf);
        int i10 = this.f30361e;
        int i11 = this.f30362f;
        int i12 = this.f30359c;
        int i13 = this.f30360d;
        Rect rect = new Rect(i12, i13, i10, i11);
        int iWidth = rect.width();
        int iHeight = rect.height();
        int i14 = i12 + iWidth;
        int i15 = i13 + iHeight;
        K3.r rVar2 = (K3.r) rVar.f6517g;
        Rect rect2 = (Rect) rVar2.f6516f;
        rect2.set(i12, i13, i14, i15);
        rVar2.a(rect2, (Rect) rVar2.f6517g);
        Rect rect3 = (Rect) rVar2.f6518h;
        rect3.set(i12, i13, i14, i15);
        rVar2.a(rect3, (Rect) rVar2.f6519i);
        Rect rect4 = (Rect) rVar2.f6514d;
        rect4.set(i12, i13, i14, i15);
        rVar2.a(rect4, (Rect) rVar2.f6515e);
        Rect rect5 = (Rect) rVar2.f6512b;
        rect5.set(0, 0, iWidth, iHeight);
        rVar2.a(rect5, (Rect) rVar2.f6513c);
        I i16 = new I(rVar2);
        x0 x0Var2 = (x0) rVar.f6518h;
        x0Var2.getClass();
        x0Var2.k(null, i16);
        return C2515C.f34653a;
    }
}
