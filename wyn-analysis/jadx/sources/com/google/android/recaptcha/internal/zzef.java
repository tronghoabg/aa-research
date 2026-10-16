package com.google.android.recaptcha.internal;

import ff.v;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tf.p;

/* loaded from: classes4.dex */
public final class zzef extends zzee {

    @NotNull
    private final p zza;

    @NotNull
    private final String zzb;

    public zzef(@NotNull p pVar, @NotNull String str, @Nullable Object obj) {
        super(obj);
        this.zza = pVar;
        this.zzb = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [ff.v] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v3, types: [com.google.android.recaptcha.internal.zzkm, com.google.android.recaptcha.internal.zzrj] */
    @Override // com.google.android.recaptcha.internal.zzee
    public final boolean zza(@NotNull Object obj, @NotNull Method method, @Nullable Object[] objArr) {
        ?? arrayList;
        if (!AbstractC3340k.a(method.getName(), this.zzb)) {
            return false;
        }
        ?? Zzf = zzrm.zzf();
        if (objArr != null) {
            arrayList = new ArrayList(objArr.length);
            for (Object obj2 : objArr) {
                zzrk zzrkVarZzf = zzrl.zzf();
                zzrkVarZzf.zzv(obj2.toString());
                arrayList.add((zzrl) zzrkVarZzf.zzj());
            }
        } else {
            arrayList = v.f35432a;
        }
        Zzf.zzd(arrayList);
        zzrm zzrmVar = (zzrm) Zzf.zzj();
        p pVar = this.zza;
        byte[] bArrZzd = zzrmVar.zzd();
        pVar.invoke(objArr, zzhz.zzh().zzi(bArrZzd, 0, bArrZzd.length));
        return true;
    }
}
