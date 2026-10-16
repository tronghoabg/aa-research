package com.google.android.gms.internal.ads;

import android.os.ConditionVariable;
import j$.util.concurrent.ThreadLocalRandom;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;

/* loaded from: classes3.dex */
public final class zzbaq {
    protected volatile Boolean zzb;
    private final zzbbz zzc;
    private static final ConditionVariable zzd = new ConditionVariable();
    protected static volatile zzfzm zza = null;
    private static volatile Random zze = null;

    public zzbaq(zzbbz zzbbzVar) {
        this.zzc = zzbbzVar;
        zzbbzVar.zzd().execute(new zzbap(this));
    }

    public static final int zzd() {
        try {
            return ThreadLocalRandom.current().nextInt();
        } catch (RuntimeException unused) {
            if (zze == null) {
                synchronized (zzbaq.class) {
                    try {
                        if (zze == null) {
                            zze = new Random();
                        }
                    } finally {
                    }
                }
            }
            return zze.nextInt();
        }
    }

    public final void zza(int i5, int i10, long j8, String str, Exception exc) {
        try {
            zzd.block();
            if (!this.zzb.booleanValue() || zza == null) {
                return;
            }
            zzawz zzawzVarZza = zzaxd.zza();
            zzawzVarZza.zza(this.zzc.zza.getPackageName());
            zzawzVarZza.zzb(j8);
            if (str != null) {
                zzawzVarZza.zze(str);
            }
            if (exc != null) {
                StringWriter stringWriter = new StringWriter();
                exc.printStackTrace(new PrintWriter(stringWriter));
                zzawzVarZza.zzc(stringWriter.toString());
                zzawzVarZza.zzd(exc.getClass().getName());
            }
            zzfzl zzfzlVarZza = zza.zza(((zzaxd) zzawzVarZza.zzbu()).zzaN());
            zzfzlVarZza.zzc(i5);
            if (i10 != -1) {
                zzfzlVarZza.zzb(i10);
            }
            zzfzlVarZza.zza();
        } catch (Exception unused) {
        }
    }

    public final /* synthetic */ zzbbz zzb() {
        return this.zzc;
    }
}
