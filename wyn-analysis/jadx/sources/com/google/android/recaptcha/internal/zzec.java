package com.google.android.recaptcha.internal;

import Ef.E;
import Fe.e;
import ef.C2515C;
import ff.o;
import java.util.ArrayList;
import jf.InterfaceC3103c;
import kf.a;
import lf.AbstractC3471j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tf.p;

/* loaded from: classes4.dex */
final class zzec extends AbstractC3471j implements p {
    final /* synthetic */ String[] zza;
    final /* synthetic */ zzed zzb;
    final /* synthetic */ String zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzec(String[] strArr, zzed zzedVar, String str, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.zza = strArr;
        this.zzb = zzedVar;
        this.zzc = str;
    }

    @Override // lf.AbstractC3462a
    @NotNull
    public final InterfaceC3103c create(@Nullable Object obj, @NotNull InterfaceC3103c interfaceC3103c) {
        return new zzec(this.zza, this.zzb, this.zzc, interfaceC3103c);
    }

    @Override // tf.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzec) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        a aVar = a.f39711a;
        e.U(obj);
        String[] strArr = this.zza;
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add("\"" + str + "\"");
        }
        this.zzb.zza.evaluateJavascript(this.zzc + "(" + o.w0(arrayList, ",", null, null, null, 62) + ")", null);
        return C2515C.f34653a;
    }
}
