package com.google.android.gms.internal.ads;

import D6.C0395s;
import D6.r1;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.text.TextUtils;
import com.unity3d.services.core.device.MimeTypes;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzfat implements zzfcq {
    private final zzflg zza;
    private final PackageInfo zzb;
    private final G6.N zzc;

    public zzfat(zzflg zzflgVar, PackageInfo packageInfo, G6.N n10) {
        this.zza = zzflgVar;
        this.zzb = packageInfo;
        this.zzc = n10;
    }

    @Override // com.google.android.gms.internal.ads.zzfcq
    public final void zza(Object obj) {
        int i5;
        String str;
        JSONArray jSONArrayOptJSONArray;
        zzflg zzflgVar = this.zza;
        ArrayList<String> arrayList = zzflgVar.zzh;
        Bundle bundle = (Bundle) obj;
        if (arrayList == null) {
            return;
        }
        if (arrayList.isEmpty()) {
            bundle.putInt("native_version", 0);
            return;
        }
        bundle.putInt("native_version", 3);
        bundle.putStringArrayList("native_templates", arrayList);
        bundle.putStringArrayList("native_custom_templates", zzflgVar.zzi);
        zzbma zzbmaVar = zzflgVar.zzj;
        if (zzbmaVar != null) {
            if (zzbmaVar.zza > 3) {
                bundle.putBoolean("enable_native_media_orientation", true);
                int i10 = zzbmaVar.zzh;
                String str2 = i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? "unknown" : "square" : "portrait" : "landscape" : "any";
                if (!"unknown".equals(str2)) {
                    bundle.putString("native_media_orientation", str2);
                }
            }
            int i11 = zzbmaVar.zzc;
            String str3 = i11 != 0 ? i11 != 1 ? i11 != 2 ? "unknown" : "landscape" : "portrait" : "any";
            if (!"unknown".equals(str3)) {
                bundle.putString("native_image_orientation", str3);
            }
            bundle.putBoolean("native_multiple_images", zzbmaVar.zzd);
            bundle.putBoolean("use_custom_mute", zzbmaVar.zzg);
            int i12 = zzbmaVar.zzi;
            if (i12 != 0) {
                bundle.putBoolean("sccg_tap", zzbmaVar.zzj);
                bundle.putInt("sccg_dir", i12);
            }
        }
        PackageInfo packageInfo = this.zzb;
        int i13 = packageInfo != null ? packageInfo.versionCode : 0;
        G6.O o7 = (G6.O) this.zzc;
        o7.l();
        synchronized (o7.f4531a) {
            i5 = o7.f4547r;
        }
        if (i13 > i5) {
            o7.z();
            o7.q(i13);
        }
        JSONObject jSONObjectY = o7.y();
        String string = null;
        if (jSONObjectY != null && (jSONArrayOptJSONArray = jSONObjectY.optJSONArray(zzflgVar.zzg)) != null) {
            string = jSONArrayOptJSONArray.toString();
        }
        if (!TextUtils.isEmpty(string)) {
            bundle.putString("native_advanced_settings", string);
        }
        int i14 = zzflgVar.zzl;
        if (i14 > 1) {
            bundle.putInt("max_num_ads", i14);
        }
        zzbsi zzbsiVar = zzflgVar.zzb;
        if (zzbsiVar != null) {
            String str4 = zzbsiVar.zzc;
            if (TextUtils.isEmpty(str4)) {
                if (zzbsiVar.zza >= 2) {
                    int i15 = zzbsiVar.zzd;
                    str = (i15 == 2 || i15 != 3) ? "l" : "p";
                } else {
                    int i16 = zzbsiVar.zzb;
                    if (i16 == 1) {
                        str = "l";
                    } else if (i16 != 2) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(i16).length() + 41);
                        sb2.append("Instream ad video aspect ratio ");
                        sb2.append(i16);
                        sb2.append(" is wrong.");
                        H6.l.c(sb2.toString());
                        str = "l";
                    } else {
                        str = "p";
                    }
                }
                bundle.putString("ia_var", str);
            } else {
                bundle.putString("ad_tag", str4);
            }
            bundle.putBoolean("instr", true);
        }
        if (!((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zznA)).booleanValue() || zzbmaVar == null) {
            return;
        }
        r1 r1Var = zzbmaVar.zzf;
        if (r1Var != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("startMuted", r1Var.f2486a);
            bundle2.putBoolean("clickToExpandRequested", r1Var.f2488c);
            bundle2.putBoolean("customControlsRequested", r1Var.f2487b);
            bundle.putBundle(MimeTypes.BASE_TYPE_VIDEO, bundle2);
        }
        bundle.putBoolean("disable_image_loading", zzbmaVar.zzb);
        bundle.putInt("preferred_ad_choices_position", zzbmaVar.zze);
    }
}
