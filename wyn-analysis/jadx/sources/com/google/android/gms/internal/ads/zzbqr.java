package com.google.android.gms.internal.ads;

import G6.U;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import java.util.Map;
import org.apache.tika.mime.MimeTypes;

/* loaded from: classes3.dex */
public final class zzbqr implements zzbpx {
    private final Context zza;

    public zzbqr(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    public final void zza(Object obj, Map map) {
        if (!map.containsKey("text") || TextUtils.isEmpty((CharSequence) map.get("text"))) {
            return;
        }
        G6.L.k("Opening Share Sheet with text: ".concat(String.valueOf((String) map.get("text"))));
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.setType(MimeTypes.PLAIN_TEXT);
        intent.putExtra("android.intent.extra.TEXT", (String) map.get("text"));
        if (map.containsKey("title")) {
            intent.putExtra("android.intent.extra.TITLE", (String) map.get("title"));
        }
        try {
            U u10 = C6.n.f1857D.f1863c;
            U.s(this.zza, intent);
        } catch (RuntimeException e7) {
            H6.l.g("Failed to open Share Sheet", e7);
            C6.n.f1857D.f1868h.zzh(e7, "ShareSheetGmsgHandler.onGmsg");
        }
    }
}
