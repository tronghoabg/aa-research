package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.util.Base64;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes3.dex */
final class zzgip extends zzgji {
    private final Map zza;
    private final Context zzb;
    private final zzgen zzc;
    private final long zzd;
    private final long zze;

    public zzgip(zzaxt zzaxtVar, zzgie zzgieVar, Map map, Context context, zzgen zzgenVar, zzgdq zzgdqVar, zzgqo zzgqoVar) {
        super("6uD00qi6mV8zu6AkyeC5bCv3568B2wPeNuQXCAqDKxVcHdQxA+KxNWLV41zFPdNB", "4KiYmGZMrZQiVkw5xeVvBXbdnWwWVS3sMp2EDvInOL8=", zzaxtVar, zzgieVar, zzgqoVar.zza(113));
        this.zzb = context;
        this.zza = map;
        this.zzc = zzgenVar;
        this.zzd = zzgdqVar.zzl();
        this.zze = zzgdqVar.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzgji
    public final void zza(Method method, zzaxt zzaxtVar) throws IllegalAccessException, InvocationTargetException {
        String strEncodeToString;
        zzayt zzaytVar;
        Object[] objArr = (Object[]) method.invoke("", this.zzb, Integer.valueOf(this.zzc.ordinal()));
        objArr.getClass();
        String strZzb = "E";
        try {
            p8.p pVar = (p8.p) this.zza.get("gs");
            if (pVar != null && ((Build.VERSION.SDK_INT < 31 || pVar.isDone()) && (zzaytVar = (zzayt) pVar.get(this.zzd, TimeUnit.MILLISECONDS)) != null && zzaytVar.zzb().length() > 1)) {
                strZzb = zzaytVar.zzb();
            }
        } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused) {
        }
        if (strZzb.equals("E")) {
            try {
                p8.p pVar2 = (p8.p) this.zza.get("ai");
                if (pVar2 != null) {
                    String str = (String) pVar2.get(this.zze, TimeUnit.MILLISECONDS);
                    if (!zzgui.zzc(str)) {
                        strZzb = str;
                    }
                }
            } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused2) {
            }
        }
        Boolean bool = (Boolean) objArr[5];
        synchronized (zzaxtVar) {
            try {
                Object obj = objArr[4];
                if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    strEncodeToString = Base64.encodeToString(zzgzo.zzn().zzi().zzj(bArr, 0, bArr.length).getBytes(StandardCharsets.UTF_8), 11);
                } else {
                    strEncodeToString = (String) obj;
                }
                zzaxtVar.zzu(((Long) objArr[0]).longValue());
                zzaxtVar.zzt((String) objArr[1]);
                zzaxtVar.zzD((String) objArr[2]);
                zzaxtVar.zzE((String) objArr[3]);
                zzaxtVar.zzp(strEncodeToString);
                zzaxtVar.zzo(strZzb);
                if (bool != null) {
                    zzaxtVar.zzai(true != bool.booleanValue() ? 1 : 2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
