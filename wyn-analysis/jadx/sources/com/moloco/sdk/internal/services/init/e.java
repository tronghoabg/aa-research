package com.moloco.sdk.internal.services.init;

import Ef.E;
import com.moloco.sdk.K0;
import com.moloco.sdk.internal.MolocoLogger;
import ef.C2515C;
import jf.InterfaceC3103c;
import kotlin.jvm.internal.H;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import lf.AbstractC3471j;
import xd.C4511c;

/* loaded from: classes4.dex */
public final class e extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f29646a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Gd.a f29647b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Gd.a aVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f29647b = aVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new e(this.f29647b, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        KType kTypeB;
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f29646a;
        if (i5 == 0) {
            Fe.e.U(obj);
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "InitApi", "Successful Init", null, false, 12, null);
            C4511c c4511cC = this.f29647b.c();
            KClass orCreateKotlinClass = H.f39741a.getOrCreateKotlinClass(byte[].class);
            try {
                kTypeB = H.b(byte[].class);
            } catch (Throwable unused) {
                kTypeB = null;
            }
            Sd.a aVar2 = new Sd.a(orCreateKotlinClass, kTypeB);
            this.f29646a = 1;
            obj = c4511cC.a(aVar2, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Fe.e.U(obj);
        }
        if (obj != null) {
            return K0.o((byte[]) obj);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.ByteArray");
    }
}
