package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzfxc implements zzfwd {
    private static final zzfxc zza = new zzfxc();
    private static final Handler zzb = new Handler(Looper.getMainLooper());
    private static Handler zzc = null;
    private static final Runnable zzk = new zzfwy();
    private static final Runnable zzl = new zzfwz();
    private int zze;
    private long zzj;
    private final List zzd = new ArrayList();
    private final List zzf = new ArrayList();
    private final zzfwv zzh = new zzfwv();
    private final zzfwf zzg = new zzfwf();
    private final zzfww zzi = new zzfww(new zzfxf());

    public static zzfxc zzb() {
        return zza;
    }

    private final void zzk(View view, zzfwe zzfweVar, JSONObject jSONObject, int i5, boolean z2) {
        zzfweVar.zzb(view, jSONObject, this, i5 == 1, z2);
    }

    private static final void zzl() {
        Handler handler = zzc;
        if (handler != null) {
            handler.removeCallbacks(zzl);
            zzc = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfwd
    public final void zza(View view, zzfwe zzfweVar, JSONObject jSONObject, boolean z2) throws JSONException {
        zzfwv zzfwvVar;
        int iZzl;
        boolean z10;
        zzfxc zzfxcVar;
        View view2;
        zzfwe zzfweVar2;
        boolean z11;
        if (zzfwt.zza(view) != null || (iZzl = (zzfwvVar = this.zzh).zzl(view)) == 3) {
            return;
        }
        JSONObject jSONObjectZza = zzfweVar.zza(view);
        zzfwo.zze(jSONObject, jSONObjectZza);
        String strZzg = zzfwvVar.zzg(view);
        if (strZzg != null) {
            zzfwo.zzd(jSONObjectZza, strZzg);
            try {
                jSONObjectZza.put("hasWindowFocus", Boolean.valueOf(this.zzh.zzj(view)));
            } catch (JSONException e7) {
                zzfwp.zza("Error with setting has window focus", e7);
            }
            boolean zZzk = this.zzh.zzk(strZzg);
            Boolean boolValueOf = Boolean.valueOf(zZzk);
            if (zZzk) {
                try {
                    jSONObjectZza.put("isPipActive", boolValueOf);
                } catch (JSONException e10) {
                    zzfwp.zza("Error with setting is picture-in-picture active", e10);
                }
            }
            this.zzh.zzf();
            zzfxcVar = this;
        } else {
            zzfwu zzfwuVarZzi = zzfwvVar.zzi(view);
            if (zzfwuVarZzi != null) {
                zzfvv zzfvvVarZzb = zzfwuVarZzi.zzb();
                JSONArray jSONArray = new JSONArray();
                ArrayList arrayListZzc = zzfwuVarZzi.zzc();
                int size = arrayListZzc.size();
                for (int i5 = 0; i5 < size; i5++) {
                    jSONArray.put((String) arrayListZzc.get(i5));
                }
                try {
                    jSONObjectZza.put("isFriendlyObstructionFor", jSONArray);
                    jSONObjectZza.put("friendlyObstructionClass", zzfvvVarZzb.zzb());
                    jSONObjectZza.put("friendlyObstructionPurpose", zzfvvVarZzb.zzc());
                    jSONObjectZza.put("friendlyObstructionReason", zzfvvVarZzb.zzd());
                } catch (JSONException e11) {
                    zzfwp.zza("Error with setting friendly obstruction", e11);
                }
                z10 = true;
            } else {
                z10 = false;
            }
            if (z2 || z10) {
                zzfxcVar = this;
                view2 = view;
                zzfweVar2 = zzfweVar;
                z11 = true;
            } else {
                view2 = view;
                zzfweVar2 = zzfweVar;
                z11 = false;
                zzfxcVar = this;
            }
            zzfxcVar.zzk(view2, zzfweVar2, jSONObjectZza, iZzl, z11);
        }
        zzfxcVar.zze++;
    }

    public final void zzc() {
        if (zzc == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            zzc = handler;
            handler.post(zzk);
            zzc.postDelayed(zzl, 200L);
        }
    }

    public final void zzd() {
        zzl();
        this.zzd.clear();
        zzb.post(new zzfwx(this));
    }

    public final void zze() {
        zzl();
    }

    public final /* synthetic */ void zzf() throws JSONException {
        zzfxc zzfxcVar;
        this.zze = 0;
        this.zzf.clear();
        for (zzfuy zzfuyVar : zzfvs.zza().zzf()) {
        }
        this.zzj = System.nanoTime();
        zzfwv zzfwvVar = this.zzh;
        zzfwvVar.zzd();
        zzfwf zzfwfVar = this.zzg;
        long jNanoTime = System.nanoTime();
        zzfwe zzfweVarZza = zzfwfVar.zza();
        if (zzfwvVar.zzb().size() > 0) {
            Iterator it = zzfwvVar.zzb().iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                JSONObject jSONObjectZza = zzfweVarZza.zza(null);
                View viewZzh = zzfwvVar.zzh(str);
                zzfwe zzfweVarZzb = zzfwfVar.zzb();
                String strZzc = zzfwvVar.zzc(str);
                if (strZzc != null) {
                    JSONObject jSONObjectZza2 = zzfweVarZzb.zza(viewZzh);
                    zzfwo.zzd(jSONObjectZza2, str);
                    try {
                        jSONObjectZza2.put("notVisibleReason", strZzc);
                    } catch (JSONException e7) {
                        zzfwp.zza("Error with setting not visible reason", e7);
                    }
                    zzfwo.zze(jSONObjectZza, jSONObjectZza2);
                }
                zzfwo.zzf(jSONObjectZza);
                HashSet hashSet = new HashSet();
                hashSet.add(str);
                this.zzi.zzb(jSONObjectZza, hashSet, jNanoTime);
            }
        }
        zzfwv zzfwvVar2 = this.zzh;
        if (zzfwvVar2.zza().size() > 0) {
            JSONObject jSONObjectZza3 = zzfweVarZza.zza(null);
            zzfxcVar = this;
            zzfxcVar.zzk(null, zzfweVarZza, jSONObjectZza3, 1, false);
            zzfwo.zzf(jSONObjectZza3);
            zzfxcVar.zzi.zza(jSONObjectZza3, zzfwvVar2.zza(), jNanoTime);
        } else {
            zzfxcVar = this;
            zzfxcVar.zzi.zzc();
        }
        zzfwvVar2.zze();
        long jNanoTime2 = System.nanoTime() - zzfxcVar.zzj;
        List<zzfxb> list = zzfxcVar.zzd;
        if (list.size() > 0) {
            for (zzfxb zzfxbVar : list) {
                TimeUnit.NANOSECONDS.toMillis(jNanoTime2);
                zzfxbVar.zzb();
                if (zzfxbVar instanceof zzfxa) {
                    ((zzfxa) zzfxbVar).zza();
                }
            }
        }
        zzfwc.zza().zzc();
    }

    public final /* synthetic */ zzfww zzh() {
        return this.zzi;
    }
}
