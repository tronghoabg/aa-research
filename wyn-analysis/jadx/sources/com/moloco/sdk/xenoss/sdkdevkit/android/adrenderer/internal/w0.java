package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import Hf.C0600j;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes4.dex */
public final class w0 extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f32269a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.E f32270b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.G f32271c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.E f32272d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Gf.t f32273e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(kotlin.jvm.internal.E e7, kotlin.jvm.internal.G g9, kotlin.jvm.internal.E e10, Gf.t tVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f32270b = e7;
        this.f32271c = g9;
        this.f32272d = e10;
        this.f32273e = tVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new w0(this.f32270b, this.f32271c, this.f32272d, this.f32273e, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((w0) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kotlin.jvm.internal.E e7 = this.f32270b;
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f32269a;
        kotlin.jvm.internal.G g9 = this.f32271c;
        try {
            if (i5 == 0) {
                Fe.e.U(obj);
                Hf.f0 f0Var = new Hf.f0(new v0(e7.f39738a, null));
                C0600j c0600j = new C0600j(e7, this.f32272d, this.f32273e, 4);
                this.f32269a = 1;
                if (f0Var.collect(c0600j, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Fe.e.U(obj);
            }
            g9.f39740a = null;
            return C2515C.f34653a;
        } catch (Throwable th) {
            g9.f39740a = null;
            throw th;
        }
    }
}
