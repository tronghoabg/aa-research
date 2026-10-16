package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.webkit.WebView;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import j$.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;
import x3.AbstractC4458a;
import x3.C4462e;
import x3.InterfaceC4466i;

/* loaded from: classes3.dex */
final class zzfve implements InterfaceC4466i {
    final /* synthetic */ zzfvg zza;

    public zzfve(zzfvg zzfvgVar) {
        Objects.requireNonNull(zzfvgVar);
        this.zza = zzfvgVar;
    }

    @Override // x3.InterfaceC4466i
    public final void onPostMessage(WebView webView, C4462e c4462e, Uri uri, boolean z2, AbstractC4458a abstractC4458a) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject(c4462e.a());
            String string = jSONObject.getString("method");
            String string2 = jSONObject.getJSONObject(JsonStorageKeyNames.DATA_KEY).getString("adSessionId");
            if (string.equals("startSession")) {
                this.zza.zzf(string2);
            } else if (string.equals("finishSession")) {
                this.zza.zzg(string2);
            } else {
                zzfur.zza.getClass();
            }
        } catch (JSONException e7) {
            zzfwp.zza("Error parsing JS message in JavaScriptSessionService.", e7);
        }
    }
}
