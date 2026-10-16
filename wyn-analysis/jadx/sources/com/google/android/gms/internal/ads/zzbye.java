package com.google.android.gms.internal.ads;

import G6.U;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.provider.CalendarContract;
import android.text.TextUtils;
import com.wynauto.wyn.R;
import java.util.Map;
import org.json.JSONException;

/* loaded from: classes3.dex */
public final class zzbye extends zzbyn {
    private final Map zza;
    private final Context zzb;
    private final String zzc;
    private final long zzd;
    private final long zze;
    private final String zzf;
    private final String zzg;

    public zzbye(zzclb zzclbVar, Map map) {
        super(zzclbVar, "createCalendarEvent");
        this.zza = map;
        this.zzb = zzclbVar.zzj();
        this.zzc = zzd("description");
        this.zzf = zzd("summary");
        this.zzd = zze("start_ticks");
        this.zze = zze("end_ticks");
        this.zzg = zzd("location");
    }

    private final String zzd(String str) {
        Map map = this.zza;
        return TextUtils.isEmpty((CharSequence) map.get(str)) ? "" : (String) map.get(str);
    }

    private final long zze(String str) {
        String str2 = (String) this.zza.get(str);
        if (str2 == null) {
            return -1L;
        }
        try {
            return Long.parseLong(str2);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public final void zza() throws JSONException {
        Context context = this.zzb;
        if (context == null) {
            zzg("Activity context is not available.");
            return;
        }
        C6.n nVar = C6.n.f1857D;
        U u10 = nVar.f1863c;
        if (!new zzbie(context).zzb()) {
            zzg("This feature is not available on the device.");
            return;
        }
        U u11 = nVar.f1863c;
        AlertDialog.Builder builderK = U.k(context);
        Resources resourcesZzg = nVar.f1868h.zzg();
        builderK.setTitle(resourcesZzg != null ? resourcesZzg.getString(R.string.f33915s5) : "Create calendar event");
        builderK.setMessage(resourcesZzg != null ? resourcesZzg.getString(R.string.f33916s6) : "Allow Ad to create a calendar event?");
        builderK.setPositiveButton(resourcesZzg != null ? resourcesZzg.getString(R.string.f33913s3) : "Accept", new zzbyc(this));
        builderK.setNegativeButton(resourcesZzg != null ? resourcesZzg.getString(R.string.f33914s4) : "Decline", new zzbyd(this));
        builderK.create().show();
    }

    public final Intent zzb() {
        Intent data = new Intent("android.intent.action.EDIT").setData(CalendarContract.Events.CONTENT_URI);
        data.putExtra("title", this.zzc);
        data.putExtra("eventLocation", this.zzg);
        data.putExtra("description", this.zzf);
        long j8 = this.zzd;
        if (j8 > -1) {
            data.putExtra("beginTime", j8);
        }
        long j10 = this.zze;
        if (j10 > -1) {
            data.putExtra("endTime", j10);
        }
        data.setFlags(268435456);
        return data;
    }

    public final /* synthetic */ Context zzc() {
        return this.zzb;
    }
}
