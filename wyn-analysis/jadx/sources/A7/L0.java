package A7;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.internal.measurement.zzdw;

/* loaded from: classes4.dex */
public final class L0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f549a;

    /* renamed from: b, reason: collision with root package name */
    public final String f550b;

    /* renamed from: c, reason: collision with root package name */
    public final String f551c;

    /* renamed from: d, reason: collision with root package name */
    public final String f552d;

    /* renamed from: e, reason: collision with root package name */
    public final Boolean f553e;

    /* renamed from: f, reason: collision with root package name */
    public final long f554f;

    /* renamed from: g, reason: collision with root package name */
    public final zzdw f555g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f556h;

    /* renamed from: i, reason: collision with root package name */
    public final Long f557i;

    /* renamed from: j, reason: collision with root package name */
    public final String f558j;

    public L0(Context context, zzdw zzdwVar, Long l10) {
        this.f556h = true;
        AbstractC1732v.i(context);
        Context applicationContext = context.getApplicationContext();
        AbstractC1732v.i(applicationContext);
        this.f549a = applicationContext;
        this.f557i = l10;
        if (zzdwVar != null) {
            this.f555g = zzdwVar;
            this.f550b = zzdwVar.zzf;
            this.f551c = zzdwVar.zze;
            this.f552d = zzdwVar.zzd;
            this.f556h = zzdwVar.zzc;
            this.f554f = zzdwVar.zzb;
            this.f558j = zzdwVar.zzh;
            Bundle bundle = zzdwVar.zzg;
            if (bundle != null) {
                this.f553e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
