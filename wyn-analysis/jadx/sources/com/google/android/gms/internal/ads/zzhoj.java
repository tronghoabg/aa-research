package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzhoj extends RuntimeException {
    public zzhoj(String str) {
        super(str);
    }

    public static Object zza(zzhoi zzhoiVar) {
        try {
            return zzhoiVar.zza();
        } catch (Exception e7) {
            throw new zzhoj(e7);
        }
    }

    public zzhoj(String str, Throwable th) {
        super(str, th);
    }

    public zzhoj(Throwable th) {
        super(th);
    }
}
