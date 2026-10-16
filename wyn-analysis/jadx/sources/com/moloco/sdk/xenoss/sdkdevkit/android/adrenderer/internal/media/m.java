package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media;

import Hf.InterfaceC0603m;
import ef.C2515C;
import java.io.File;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes4.dex */
public final class m extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f30304a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f30305b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ File f30306c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(File file, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f30306c = file;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        m mVar = new m(this.f30306c, interfaceC3103c);
        mVar.f30305b = obj;
        return mVar;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((InterfaceC0603m) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f30304a;
        if (i5 == 0) {
            Fe.e.U(obj);
            InterfaceC0603m interfaceC0603m = (InterfaceC0603m) this.f30305b;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.d dVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.d(this.f30306c);
            this.f30304a = 1;
            if (interfaceC0603m.emit(dVar, this) == aVar) {
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
