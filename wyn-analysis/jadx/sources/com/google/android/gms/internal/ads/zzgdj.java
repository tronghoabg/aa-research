package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.InputEvent;
import android.view.View;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes3.dex */
public final class zzgdj {
    private final zzgfq zza;
    private final zzggn zzb;
    private final zzgpj zzc;
    private final zzgqo zzd;
    private final zzgew zze;
    private final long zzf;
    private final zzimt zzg;
    private final long zzh;
    private final long zzi = System.currentTimeMillis();
    private final boolean zzj;
    private final long zzk;

    public zzgdj(zzgfq zzgfqVar, zzggn zzggnVar, zzgpj zzgpjVar, zzgqo zzgqoVar, zzgew zzgewVar, zzimt zzimtVar, zzgdq zzgdqVar) {
        this.zza = zzgfqVar;
        this.zzb = zzggnVar;
        this.zzc = zzgpjVar;
        this.zzd = zzgqoVar;
        this.zze = zzgewVar;
        this.zzf = zzgdqVar.zzj();
        this.zzg = zzimtVar;
        this.zzh = zzgdqVar.zzi();
        this.zzj = zzgdqVar.zzs();
        this.zzk = zzgdqVar.zzr();
    }

    public final p8.p zza() {
        return this.zza.zza();
    }

    public final String zzb(final Context context) {
        String string;
        boolean z2 = false;
        if (this.zzj) {
            if (System.currentTimeMillis() - this.zzi <= this.zzk) {
                z2 = true;
            }
        }
        zzgqm zzgqmVarZza = this.zzd.zza(3);
        try {
            try {
                try {
                    zzgqmVarZza.zza();
                    string = (String) zzhcf.zzj(this.zza.zzb(), new zzhbn() { // from class: com.google.android.gms.internal.ads.zzgdi
                        @Override // com.google.android.gms.internal.ads.zzhbn
                        public final /* synthetic */ p8.p zza(Object obj) {
                            return this.zza.zzg(context, (Void) obj);
                        }
                    }, zzhcw.zza()).get(z2 ? this.zzh : this.zzf, TimeUnit.MILLISECONDS);
                } catch (TimeoutException unused) {
                    if (z2) {
                        string = ((zzgjp) this.zzg.zzb()).zza(true, this.zzi);
                    } else {
                        this.zzd.zzb(56);
                        string = Integer.toString(17);
                    }
                } catch (Throwable th) {
                    zzgqmVarZza.zzb(th);
                    throw th;
                }
            } catch (InterruptedException e7) {
                Thread.currentThread().interrupt();
                zzgqmVarZza.zzb(e7);
                string = "";
            } catch (ExecutionException e10) {
                e = e10;
                Throwable cause = e.getCause();
                if (cause != null) {
                    e = cause;
                }
                zzgqmVarZza.zzb(e);
                string = Integer.toString(3);
            }
            zzgqmVarZza.zzc();
            this.zze.zzb();
            return string;
        } catch (Throwable th2) {
            zzgqmVarZza.zzc();
            this.zze.zzb();
            throw th2;
        }
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x007e: IGET (r9 I:com.google.android.gms.internal.ads.zzgew) = (r2 I:com.google.android.gms.internal.ads.zzgdj) (LINE:127) com.google.android.gms.internal.ads.zzgdj.zze com.google.android.gms.internal.ads.zzgew, block:B:32:0x007b */
    /* JADX WARN: Type inference failed for: r2v4, types: [com.google.android.gms.internal.ads.zzgdj] */
    public final String zzc(final Context context, String str, final View view, final Activity activity) {
        final zzgdj zzgdjVar;
        ?? r22;
        String string;
        zzgqm zzgqmVarZza = this.zzd.zza(4);
        try {
            try {
                zzgqmVarZza.zza();
                final String str2 = null;
                zzgdjVar = this;
                try {
                    string = (String) zzhcf.zzj(this.zza.zzb(), new zzhbn(context, str2, view, activity) { // from class: com.google.android.gms.internal.ads.zzgdg
                        private final /* synthetic */ Context zzb;
                        private final /* synthetic */ View zzc;
                        private final /* synthetic */ Activity zzd;

                        {
                            this.zzc = view;
                            this.zzd = activity;
                        }

                        @Override // com.google.android.gms.internal.ads.zzhbn
                        public final /* synthetic */ p8.p zza(Object obj) {
                            return this.zza.zzh(this.zzb, null, this.zzc, this.zzd, (Void) obj);
                        }
                    }, zzhcw.zza()).get(zzgdjVar.zzf, TimeUnit.MILLISECONDS);
                } catch (InterruptedException e7) {
                    e = e7;
                    InterruptedException interruptedException = e;
                    Thread.currentThread().interrupt();
                    zzgqmVarZza.zzb(interruptedException);
                    string = "";
                    zzgqmVarZza.zzc();
                    zzgdjVar.zze.zzb();
                    return string;
                } catch (ExecutionException e10) {
                    e = e10;
                    Throwable th = e;
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        th = cause;
                    }
                    zzgqmVarZza.zzb(th);
                    string = Integer.toString(3);
                    zzgqmVarZza.zzc();
                    zzgdjVar.zze.zzb();
                    return string;
                } catch (TimeoutException unused) {
                    zzgdjVar.zzd.zzb(57);
                    string = Integer.toString(17);
                    zzgqmVarZza.zzc();
                    zzgdjVar.zze.zzb();
                    return string;
                } catch (Throwable th2) {
                    th = th2;
                    Throwable th3 = th;
                    zzgqmVarZza.zzb(th3);
                    throw th3;
                }
            } catch (Throwable th4) {
                zzgqmVarZza.zzc();
                r22.zze.zzb();
                throw th4;
            }
        } catch (InterruptedException e11) {
            e = e11;
            zzgdjVar = this;
        } catch (ExecutionException e12) {
            e = e12;
            zzgdjVar = this;
        } catch (TimeoutException unused2) {
            zzgdjVar = this;
        } catch (Throwable th5) {
            th = th5;
        }
        zzgqmVarZza.zzc();
        zzgdjVar.zze.zzb();
        return string;
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x007e: IGET (r9 I:com.google.android.gms.internal.ads.zzgew) = (r2 I:com.google.android.gms.internal.ads.zzgdj) (LINE:127) com.google.android.gms.internal.ads.zzgdj.zze com.google.android.gms.internal.ads.zzgew, block:B:32:0x007b */
    /* JADX WARN: Type inference failed for: r2v4, types: [com.google.android.gms.internal.ads.zzgdj] */
    public final String zzd(final Context context, final String str, final View view, Activity activity) {
        final zzgdj zzgdjVar;
        ?? r22;
        String string;
        zzgqm zzgqmVarZza = this.zzd.zza(5);
        try {
            try {
                zzgqmVarZza.zza();
                final Activity activity2 = null;
                zzgdjVar = this;
                try {
                    string = (String) zzhcf.zzj(this.zza.zzb(), new zzhbn(context, str, view, activity2) { // from class: com.google.android.gms.internal.ads.zzgdh
                        private final /* synthetic */ Context zzb;
                        private final /* synthetic */ String zzc;
                        private final /* synthetic */ View zzd;

                        @Override // com.google.android.gms.internal.ads.zzhbn
                        public final /* synthetic */ p8.p zza(Object obj) {
                            return this.zza.zzi(this.zzb, this.zzc, this.zzd, null, (Void) obj);
                        }
                    }, zzhcw.zza()).get(zzgdjVar.zzf, TimeUnit.MILLISECONDS);
                } catch (InterruptedException e7) {
                    e = e7;
                    InterruptedException interruptedException = e;
                    Thread.currentThread().interrupt();
                    zzgqmVarZza.zzb(interruptedException);
                    string = "";
                    zzgqmVarZza.zzc();
                    zzgdjVar.zze.zzb();
                    return string;
                } catch (ExecutionException e10) {
                    e = e10;
                    Throwable th = e;
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        th = cause;
                    }
                    zzgqmVarZza.zzb(th);
                    string = Integer.toString(3);
                    zzgqmVarZza.zzc();
                    zzgdjVar.zze.zzb();
                    return string;
                } catch (TimeoutException unused) {
                    zzgdjVar.zzd.zzb(58);
                    string = Integer.toString(17);
                    zzgqmVarZza.zzc();
                    zzgdjVar.zze.zzb();
                    return string;
                } catch (Throwable th2) {
                    th = th2;
                    Throwable th3 = th;
                    zzgqmVarZza.zzb(th3);
                    throw th3;
                }
            } catch (Throwable th4) {
                zzgqmVarZza.zzc();
                r22.zze.zzb();
                throw th4;
            }
        } catch (InterruptedException e11) {
            e = e11;
            zzgdjVar = this;
        } catch (ExecutionException e12) {
            e = e12;
            zzgdjVar = this;
        } catch (TimeoutException unused2) {
            zzgdjVar = this;
        } catch (Throwable th5) {
            th = th5;
        }
        zzgqmVarZza.zzc();
        zzgdjVar.zze.zzb();
        return string;
    }

    public final void zze(List list) {
        this.zzc.zza(list);
    }

    public final void zzf(InputEvent inputEvent) {
        this.zzb.zze(inputEvent);
    }

    public final /* synthetic */ p8.p zzg(Context context, Void r22) {
        return this.zzb.zzb(context);
    }

    public final /* synthetic */ p8.p zzh(Context context, String str, View view, Activity activity, Void r52) {
        return this.zzb.zzc(context, null, view, activity);
    }

    public final /* synthetic */ p8.p zzi(Context context, String str, View view, Activity activity, Void r52) {
        return this.zzb.zzd(context, str, view, null);
    }

    public final int zzj() {
        return this.zzb.zzh();
    }
}
