package com.google.android.gms.internal.ads;

import D6.C0395s;
import G6.C0537a;
import android.content.Context;
import android.graphics.Rect;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzcuj implements zzbui {
    private final Context zza;
    private final zzbeu zzb;
    private final PowerManager zzc;

    public zzcuj(Context context, zzbeu zzbeuVar) {
        this.zza = context;
        this.zzb = zzbeuVar;
        this.zzc = (PowerManager) context.getSystemService("power");
    }

    @Override // com.google.android.gms.internal.ads.zzbui
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final JSONObject zzb(zzcum zzcumVar) throws JSONException {
        JSONObject jSONObject;
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        zzbew zzbewVar = zzcumVar.zzf;
        if (zzbewVar == null) {
            jSONObject = new JSONObject();
        } else {
            zzbeu zzbeuVar = this.zzb;
            if (zzbeuVar.zzc() == null) {
                throw new JSONException("Active view Info cannot be null.");
            }
            boolean z2 = zzbewVar.zza;
            JSONObject jSONObject3 = new JSONObject();
            JSONObject jSONObjectPut = jSONObject3.put("afmaVersion", zzbeuVar.zzb()).put("activeViewJSON", zzbeuVar.zzc()).put("timestamp", zzcumVar.zzd).put("adFormat", zzbeuVar.zza()).put("hashCode", zzbeuVar.zzd()).put("isMraid", false).put("isStopped", false).put("isPaused", zzcumVar.zzb).put("isNative", zzbeuVar.zze()).put("isScreenOn", this.zzc.isInteractive()).put("appMuted", C6.n.f1857D.f1869i.d()).put("appVolume", r6.f1869i.b());
            Context context = this.zza;
            jSONObjectPut.put("deviceVolume", C0537a.e(context.getApplicationContext()));
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            JSONObject jSONObjectPut2 = jSONObject3.put("windowVisibility", zzbewVar.zzb).put("isAttachedToWindow", z2);
            JSONObject jSONObject4 = new JSONObject();
            Rect rect = zzbewVar.zzc;
            JSONObject jSONObjectPut3 = jSONObjectPut2.put("viewBox", jSONObject4.put("top", rect.top).put("bottom", rect.bottom).put("left", rect.left).put("right", rect.right));
            JSONObject jSONObject5 = new JSONObject();
            Rect rect2 = zzbewVar.zzd;
            JSONObject jSONObjectPut4 = jSONObjectPut3.put("adBox", jSONObject5.put("top", rect2.top).put("bottom", rect2.bottom).put("left", rect2.left).put("right", rect2.right));
            JSONObject jSONObject6 = new JSONObject();
            Rect rect3 = zzbewVar.zze;
            JSONObject jSONObjectPut5 = jSONObjectPut4.put("globalVisibleBox", jSONObject6.put("top", rect3.top).put("bottom", rect3.bottom).put("left", rect3.left).put("right", rect3.right)).put("globalVisibleBoxVisible", zzbewVar.zzf);
            JSONObject jSONObject7 = new JSONObject();
            Rect rect4 = zzbewVar.zzg;
            JSONObject jSONObjectPut6 = jSONObjectPut5.put("localVisibleBox", jSONObject7.put("top", rect4.top).put("bottom", rect4.bottom).put("left", rect4.left).put("right", rect4.right)).put("localVisibleBoxVisible", zzbewVar.zzh);
            JSONObject jSONObject8 = new JSONObject();
            Rect rect5 = zzbewVar.zzi;
            jSONObjectPut6.put("hitBox", jSONObject8.put("top", rect5.top).put("bottom", rect5.bottom).put("left", rect5.left).put("right", rect5.right)).put("screenDensity", displayMetrics.density);
            jSONObject3.put("isVisible", zzcumVar.zza);
            if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzcg)).booleanValue()) {
                JSONArray jSONArray2 = new JSONArray();
                List<Rect> list = zzbewVar.zzk;
                if (list != null) {
                    for (Rect rect6 : list) {
                        jSONArray2.put(new JSONObject().put("top", rect6.top).put("bottom", rect6.bottom).put("left", rect6.left).put("right", rect6.right));
                    }
                }
                jSONObject3.put("scrollableContainerBoxes", jSONArray2);
            }
            if (!TextUtils.isEmpty(zzcumVar.zze)) {
                jSONObject3.put("doneReasonCode", "u");
            }
            jSONObject = jSONObject3;
        }
        jSONArray.put(jSONObject);
        jSONObject2.put("units", jSONArray);
        return jSONObject2;
    }
}
