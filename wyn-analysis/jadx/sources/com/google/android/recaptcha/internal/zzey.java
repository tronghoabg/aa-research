package com.google.android.recaptcha.internal;

import ef.C2515C;
import kotlin.jvm.internal.AbstractC3343n;
import tf.p;

/* loaded from: classes4.dex */
final class zzey extends AbstractC3343n implements p {
    final /* synthetic */ zzek zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzey(zzek zzekVar, String str, int i5) {
        super(2);
        this.zza = zzekVar;
        this.zzb = str;
        this.zzc = i5;
    }

    @Override // tf.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Object[] objArr = (Object[]) obj;
        this.zza.zzi().zzb(this.zzb, (String) obj2);
        int i5 = this.zzc;
        if (i5 != -1) {
            this.zza.zzc().zze(i5, objArr);
        }
        return C2515C.f34653a;
    }
}
