package com.google.android.gms.internal.ads;

import ef.C2515C;
import jf.InterfaceC3103c;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class zzgsw {
    @NotNull
    public static final Ef.K zza(@NotNull Ef.E e7, @NotNull zzgst coroutineSequence, @NotNull tf.p block) {
        AbstractC3340k.e(e7, "<this>");
        AbstractC3340k.e(coroutineSequence, "coroutineSequence");
        AbstractC3340k.e(block, "block");
        Ef.F f10 = Ef.F.f3663a;
        return Ef.H.h(e7, null, new zzgsv(coroutineSequence, block, null), 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object zzd(Nf.a aVar, InterfaceC3103c interfaceC3103c) {
        Object objB = aVar.b(interfaceC3103c);
        return objB == kf.a.f39711a ? objB : C2515C.f34653a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object zze(Nf.a aVar, InterfaceC3103c frame) {
        Object objS = A6.h.S(zzgsu.zza, aVar, frame);
        kf.a aVar2 = kf.a.f39711a;
        if (objS != aVar2) {
            A6.h.A(frame).resumeWith(C2515C.f34653a);
        }
        AbstractC3340k.e(frame, "frame");
        return aVar2;
    }
}
