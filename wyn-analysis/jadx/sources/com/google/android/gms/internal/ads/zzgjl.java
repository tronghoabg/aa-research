package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;
import android.view.MotionEvent;
import com.unity3d.services.UnityAdsConstants;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzgjl extends zzgji {
    private final Map zza;
    private final zzgie zzb;
    private final DisplayMetrics zzc;

    public zzgjl(zzaxt zzaxtVar, zzgie zzgieVar, Map map, DisplayMetrics displayMetrics, zzgqo zzgqoVar) {
        super("O/IhSczWkqH+q2aziu5mnePClwI2VInt8+rK2r5DAzxhVznO7DMyVuowa8d0HFxQ", "c/euB7bpmuTDKGTS9kQ/O7Lr64QuDKreUuxk5moaYNc=", zzaxtVar, zzgieVar, zzgqoVar.zza(123));
        this.zzb = zzgieVar;
        this.zza = map;
        this.zzc = displayMetrics;
    }

    private static long zzb(double d3, DisplayMetrics displayMetrics) {
        return Math.round(d3 / displayMetrics.density);
    }

    private static boolean zzc(DisplayMetrics displayMetrics) {
        return (displayMetrics == null || displayMetrics.density == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzgji
    public final void zza(Method method, zzaxt zzaxtVar) throws IllegalAccessException, InvocationTargetException {
        Object[] objArr;
        Map map = this.zza;
        Object obj = (MotionEvent) map.get("nv");
        DisplayMetrics displayMetrics = this.zzc;
        Object[] objArr2 = (Object[]) method.invoke("", obj, displayMetrics);
        objArr2.getClass();
        zzayp zzaypVarZza = zzayq.zza();
        Object obj2 = objArr2[0];
        if (obj2 != null && objArr2[1] != null) {
            zzaypVarZza.zza(((Long) obj2).longValue());
            zzaypVarZza.zzb(((Long) objArr2[1]).longValue());
        }
        Object obj3 = objArr2[2];
        if (obj3 != null) {
            zzaypVarZza.zzh(((Long) obj3).longValue());
        }
        Object obj4 = objArr2[3];
        if (obj4 != null) {
            zzaypVarZza.zzf(((Long) obj4).longValue());
        }
        Object obj5 = objArr2[4];
        if (obj5 != null) {
            zzaypVarZza.zzc(((Long) obj5).longValue());
        }
        Object obj6 = objArr2[5];
        if (obj6 != null) {
            zzaypVarZza.zzs(((Long) obj6).longValue() != 0 ? 2 : 1);
        }
        Object obj7 = objArr2[6];
        if (obj7 != null) {
            zzaypVarZza.zzj(((Long) obj7).longValue());
        }
        Object obj8 = objArr2[7];
        if (obj8 != null) {
            zzaypVarZza.zzi(((Long) obj8).longValue());
        }
        Object obj9 = objArr2[8];
        if (obj9 != null) {
            zzaypVarZza.zzt(((Long) obj9).longValue() != 0 ? 2 : 1);
        }
        synchronized (zzaxtVar) {
            try {
                Method methodZzc = this.zzb.zzc("8cUAbwpt6SKUQHhtSwuMmdGkTrID2QvHq2LA27x2GE3ivBr88edu7HCA+XurISAj", "khOZexiJY4Vla3osCKZbCsXRCvuYnTPcWDFUfUGsZNQ=");
                if (methodZzc == null || (objArr = (Object[]) methodZzc.invoke("", (MotionEvent) map.get("nv"), displayMetrics)) == null) {
                    throw null;
                }
                Object obj10 = objArr[0];
                if (obj10 != null) {
                    zzaxtVar.zzh(((Long) obj10).longValue());
                }
                Object obj11 = objArr[1];
                if (obj11 != null) {
                    zzaxtVar.zzi(((Long) obj11).longValue());
                }
                Object obj12 = objArr[2];
                if (obj12 != null) {
                    zzaxtVar.zzj(((Long) obj12).longValue());
                }
                Object obj13 = objArr[3];
                if (obj13 != null) {
                    zzaxtVar.zzv(((Long) obj13).longValue());
                }
                Object obj14 = objArr[4];
                if (obj14 != null) {
                    zzaxtVar.zzw(((Long) obj14).longValue());
                }
                zzggy zzggyVar = (zzggy) map.get("oe");
                if (zzggyVar != null) {
                    long j8 = zzggyVar.zza;
                    if (j8 > 0) {
                        zzaxtVar.zzz(j8);
                    }
                    long j10 = zzggyVar.zzb;
                    if (j10 > 0) {
                        zzaxtVar.zzy(j10);
                    }
                    long j11 = zzggyVar.zzc;
                    if (j11 > 0) {
                        zzaxtVar.zzx(j11);
                    }
                    long j12 = zzggyVar.zzd;
                    if (j12 > 0) {
                        zzaxtVar.zzA(j12);
                    }
                }
                zzggy zzggyVar2 = (zzggy) map.get("oe");
                if (zzggyVar2 != null && zzggyVar2.zza != 0 && zzc(displayMetrics)) {
                    double d3 = zzggyVar2.zze;
                    if (displayMetrics == null) {
                        throw null;
                    }
                    zzaypVarZza.zzl(zzb(d3, displayMetrics));
                    zzaypVarZza.zzm(zzb(zzggyVar2.zzh - zzggyVar2.zzf, displayMetrics));
                    zzaypVarZza.zzn(zzb(zzggyVar2.zzi - zzggyVar2.zzg, displayMetrics));
                    zzaypVarZza.zzq(zzb(zzggyVar2.zzf, displayMetrics));
                    zzaypVarZza.zzr(zzb(zzggyVar2.zzg, displayMetrics));
                    if (((MotionEvent) map.get("nv")) != null) {
                        long jZzb = zzb(((zzggyVar2.zzf - zzggyVar2.zzh) + r5.getRawX()) - r5.getX(), displayMetrics);
                        if (jZzb != 0) {
                            zzaypVarZza.zzo(jZzb);
                        }
                        long jZzb2 = zzb(((zzggyVar2.zzg - zzggyVar2.zzi) + r5.getRawY()) - r5.getY(), displayMetrics);
                        if (jZzb2 != 0) {
                            zzaypVarZza.zzp(jZzb2);
                        }
                    }
                }
                zzaxtVar.zzJ(zzaypVarZza);
                zzggz[] zzggzVarArr = (zzggz[]) map.get("ro");
                if (zzggzVarArr != null && zzc(displayMetrics)) {
                    for (int i5 = 0; i5 <= zzggzVarArr.length - 2; i5++) {
                        zzggz zzggzVar = zzggzVarArr[i5];
                        zzayp zzaypVarZza2 = zzayq.zza();
                        double d5 = zzggzVar.zza;
                        if (displayMetrics == null) {
                            throw null;
                        }
                        zzaypVarZza2.zza(zzb(d5, displayMetrics));
                        zzaypVarZza2.zzb(zzb(zzggzVar.zzb, displayMetrics));
                        zzaxtVar.zzK((zzayq) zzaypVarZza2.zzbu());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
