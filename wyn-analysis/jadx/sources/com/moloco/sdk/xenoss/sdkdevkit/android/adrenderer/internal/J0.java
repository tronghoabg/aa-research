package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;
import p7.AbstractC3772b;

/* loaded from: classes4.dex */
public final class J0 extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f29967a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f29968b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f29969c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J0(View view, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f29969c = view;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        J0 j02 = new J0(this.f29969c, interfaceC3103c);
        j02.f29968b = obj;
        return j02;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((J0) create((Gf.t) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f29967a;
        if (i5 == 0) {
            Fe.e.U(obj);
            final Gf.t tVar = (Gf.t) this.f29968b;
            boolean z2 = false;
            final Rect rect = new Rect(0, 0, 0, 0);
            final View view = this.f29969c;
            ViewTreeObserver.OnPreDrawListener onPreDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.I0
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public final boolean onPreDraw() {
                    View view2 = view;
                    ((Gf.s) tVar).c(Boolean.valueOf(view2.isShown() && view2.getGlobalVisibleRect(rect)));
                    return true;
                }
            };
            view.getViewTreeObserver().addOnPreDrawListener(onPreDrawListener);
            if (view.isShown() && view.getGlobalVisibleRect(rect)) {
                z2 = true;
            }
            Gf.s sVar = (Gf.s) tVar;
            sVar.c(Boolean.valueOf(z2));
            Bf.g gVar = new Bf.g(10, view, onPreDrawListener);
            this.f29967a = 1;
            if (AbstractC3772b.f(sVar, gVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Fe.e.U(obj);
        }
        return C2515C.f34653a;
    }
}
