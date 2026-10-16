package com.google.android.gms.internal.ads;

import G6.U;
import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.wynauto.wyn.R;
import java.util.Map;
import org.json.JSONException;

/* loaded from: classes3.dex */
public final class zzbyk extends zzbyn {
    private final Map zza;
    private final Context zzb;

    public zzbyk(zzclb zzclbVar, Map map) {
        super(zzclbVar, "storePicture");
        this.zza = map;
        this.zzb = zzclbVar.zzj();
    }

    public final void zza() throws JSONException {
        Context context = this.zzb;
        if (context == null) {
            zzg("Activity context is not available");
            return;
        }
        C6.n nVar = C6.n.f1857D;
        U u10 = nVar.f1863c;
        if (!new zzbie(context).zza()) {
            zzg("Feature is not supported by the device.");
            return;
        }
        String str = (String) this.zza.get("iurl");
        if (TextUtils.isEmpty(str)) {
            zzg("Image url cannot be empty.");
            return;
        }
        if (!URLUtil.isValidUrl(str)) {
            zzg("Invalid image url: ".concat(String.valueOf(str)));
            return;
        }
        String lastPathSegment = Uri.parse(str).getLastPathSegment();
        U u11 = nVar.f1863c;
        if (TextUtils.isEmpty(lastPathSegment) || !lastPathSegment.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)")) {
            zzg("Image type not recognized: ".concat(String.valueOf(lastPathSegment)));
            return;
        }
        Resources resourcesZzg = nVar.f1868h.zzg();
        U u12 = nVar.f1863c;
        AlertDialog.Builder builderK = U.k(context);
        builderK.setTitle(resourcesZzg != null ? resourcesZzg.getString(R.string.f33911s1) : "Save image");
        builderK.setMessage(resourcesZzg != null ? resourcesZzg.getString(R.string.f33912s2) : "Allow Ad to store image in Picture gallery?");
        builderK.setPositiveButton(resourcesZzg != null ? resourcesZzg.getString(R.string.f33913s3) : "Accept", new zzbyi(this, str, lastPathSegment));
        builderK.setNegativeButton(resourcesZzg != null ? resourcesZzg.getString(R.string.f33914s4) : "Decline", new zzbyj(this));
        builderK.create().show();
    }

    public final /* synthetic */ Context zzb() {
        return this.zzb;
    }
}
