package com.google.android.recaptcha.internal;

import Ef.E;
import Fe.e;
import ef.C2515C;
import jf.InterfaceC3103c;
import kf.a;
import lf.AbstractC3471j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tf.p;

/* loaded from: classes4.dex */
final class zzgt extends AbstractC3471j implements p {
    final /* synthetic */ zzgv zza;
    final /* synthetic */ String zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgt(zzgv zzgvVar, String str, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.zza = zzgvVar;
        this.zzb = str;
    }

    @Override // lf.AbstractC3462a
    @NotNull
    public final InterfaceC3103c create(@Nullable Object obj, @NotNull InterfaceC3103c interfaceC3103c) {
        return new zzgt(this.zza, this.zzb, interfaceC3103c);
    }

    @Override // tf.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzgt) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        a aVar = a.f39711a;
        e.U(obj);
        this.zza.zzm().evaluateJavascript("recaptcha.m.Main.execute(\"" + this.zzb + "\")", null);
        return C2515C.f34653a;
    }
}
