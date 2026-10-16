package com.google.android.gms.internal.ads;

import D6.C0395s;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.view.ViewGroup;
import android.view.Window;
import com.applovin.shadow.okhttp3.internal.http2.Http2Connection;
import java.util.Set;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class zzfaa implements zzfcs {
    private final zzhcp zza;
    private final ViewGroup zzb;
    private final Context zzc;
    private final Set zzd;

    public zzfaa(zzhcp zzhcpVar, ViewGroup viewGroup, Context context, Set set) {
        this.zza = zzhcpVar;
        this.zzd = set;
        this.zzb = viewGroup;
        this.zzc = context;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final p8.p zza() {
        return this.zza.zzc(new Callable() { // from class: com.google.android.gms.internal.ads.zzezz
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 22;
    }

    public final zzfab zzc() {
        ViewGroup viewGroup;
        zzbio zzbioVar = zzbix.zzgX;
        C0395s c0395s = C0395s.f2489e;
        if (((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue() && (viewGroup = this.zzb) != null && this.zzd.contains("banner")) {
            return new zzfab(Boolean.valueOf(viewGroup.isHardwareAccelerated()));
        }
        boolean zBooleanValue = ((Boolean) c0395s.f2492c.zzd(zzbix.zzgY)).booleanValue();
        Boolean boolValueOf = null;
        if (zBooleanValue && this.zzd.contains("native")) {
            Context context = this.zzc;
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                Window window = activity.getWindow();
                if (window == null || (window.getAttributes().flags & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) == 0) {
                    try {
                        boolValueOf = Boolean.valueOf((activity.getPackageManager().getActivityInfo(activity.getComponentName(), 0).flags & 512) != 0);
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                } else {
                    boolValueOf = Boolean.TRUE;
                }
                return new zzfab(boolValueOf);
            }
        }
        return new zzfab(null);
    }
}
