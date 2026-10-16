package com.google.android.recaptcha.internal;

import ff.AbstractC2641B;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3343n;
import org.jetbrains.annotations.NotNull;
import tf.a;

/* loaded from: classes4.dex */
final class zzaz extends AbstractC3343n implements a {
    final /* synthetic */ zzbc[] zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaz(zzbc[] zzbcVarArr) {
        super(0);
        this.zza = zzbcVarArr;
    }

    @Override // tf.a
    @NotNull
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final Map invoke() {
        int iD = AbstractC2641B.D(3);
        if (iD < 16) {
            iD = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iD);
        for (int i5 = 0; i5 < 3; i5++) {
            zzbc zzbcVar = this.zza[i5];
            linkedHashMap.put(Integer.valueOf(zzbcVar.zza()), zzbcVar.zzb());
        }
        return linkedHashMap;
    }
}
