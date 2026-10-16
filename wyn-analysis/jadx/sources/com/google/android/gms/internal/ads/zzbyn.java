package com.google.android.gms.internal.ads;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class zzbyn {
    private final zzclb zza;
    private final String zzb;

    public zzbyn(zzclb zzclbVar, String str) {
        this.zza = zzclbVar;
        this.zzb = str;
    }

    public final void zzg(String str) throws JSONException {
        try {
            JSONObject jSONObjectPut = new JSONObject().put(PglCryptUtils.KEY_MESSAGE, str).put(HandleInvocationsFromAdViewer.KEY_ACTION, this.zzb);
            zzclb zzclbVar = this.zza;
            if (zzclbVar != null) {
                zzclbVar.zzd("onError", jSONObjectPut);
            }
        } catch (JSONException e7) {
            int i5 = G6.L.f4523b;
            H6.l.d("Error occurred while dispatching error event.", e7);
        }
    }

    public final void zzh(String str) throws JSONException {
        try {
            this.zza.zzd("onReadyEventReceived", new JSONObject().put("js", str));
        } catch (JSONException e7) {
            int i5 = G6.L.f4523b;
            H6.l.d("Error occurred while dispatching ready Event.", e7);
        }
    }

    public final void zzi(int i5, int i10, int i11, int i12) throws JSONException {
        try {
            this.zza.zzd("onSizeChanged", new JSONObject().put("x", i5).put("y", i10).put("width", i11).put("height", i12));
        } catch (JSONException e7) {
            int i13 = G6.L.f4523b;
            H6.l.d("Error occurred while dispatching size change.", e7);
        }
    }

    public final void zzj(int i5, int i10, int i11, int i12) throws JSONException {
        try {
            this.zza.zzd("onDefaultPositionReceived", new JSONObject().put("x", i5).put("y", i10).put("width", i11).put("height", i12));
        } catch (JSONException e7) {
            int i13 = G6.L.f4523b;
            H6.l.d("Error occurred while dispatching default position.", e7);
        }
    }

    public final void zzk(String str) throws JSONException {
        try {
            this.zza.zzd("onStateChanged", new JSONObject().put("state", str));
        } catch (JSONException e7) {
            int i5 = G6.L.f4523b;
            H6.l.d("Error occurred while dispatching state change.", e7);
        }
    }

    public final void zzl(int i5, int i10, int i11, int i12, float f10, int i13) throws JSONException {
        try {
            this.zza.zzd("onScreenInfoChanged", new JSONObject().put("width", i5).put("height", i10).put("maxSizeWidth", i11).put("maxSizeHeight", i12).put("density", f10).put("rotation", i13));
        } catch (JSONException e7) {
            int i14 = G6.L.f4523b;
            H6.l.d("Error occurred while obtaining screen information.", e7);
        }
    }
}
