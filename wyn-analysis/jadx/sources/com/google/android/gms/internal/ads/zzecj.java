package com.google.android.gms.internal.ads;

import D6.C0395s;
import G6.U;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import android.util.Base64;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.metadata.MediationMetaData;
import java.io.ByteArrayOutputStream;
import org.json.JSONException;
import org.json.JSONObject;
import p7.C3773c;

/* loaded from: classes3.dex */
public final class zzecj {
    private final Context zza;
    private final ApplicationInfo zzb;
    private final int zzc;
    private final int zzd;
    private String zze = "";

    public zzecj(Context context) {
        this.zza = context;
        this.zzb = context.getApplicationInfo();
        zzbio zzbioVar = zzbix.zzkI;
        C0395s c0395s = C0395s.f2489e;
        this.zzc = ((Integer) c0395s.f2492c.zzd(zzbioVar)).intValue();
        this.zzd = ((Integer) c0395s.f2492c.zzd(zzbix.zzkJ)).intValue();
    }

    public final JSONObject zza() throws JSONException, PackageManager.NameNotFoundException {
        String strM;
        String strEncodeToString;
        JSONObject jSONObject = new JSONObject();
        try {
            Context context = this.zza;
            String str = this.zzb.packageName;
            G6.M m10 = U.f4562l;
            Context context2 = C3773c.a(context).f2782a;
            jSONObject.put(MediationMetaData.KEY_NAME, context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(str, 0)));
        } catch (PackageManager.NameNotFoundException unused) {
        }
        jSONObject.put(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME, this.zzb.packageName);
        U u10 = C6.n.f1857D.f1863c;
        Drawable applicationIcon = null;
        try {
            strM = U.M(this.zza);
        } catch (RemoteException unused2) {
            strM = null;
        }
        jSONObject.put("adMobAppId", strM);
        if (this.zze.isEmpty()) {
            try {
                E0.a aVarA = C3773c.a(this.zza);
                String str2 = this.zzb.packageName;
                Context context3 = aVarA.f2782a;
                ApplicationInfo applicationInfo = context3.getPackageManager().getApplicationInfo(str2, 0);
                context3.getPackageManager().getApplicationLabel(applicationInfo);
                applicationIcon = context3.getPackageManager().getApplicationIcon(applicationInfo);
            } catch (PackageManager.NameNotFoundException unused3) {
            }
            if (applicationIcon == null) {
                strEncodeToString = "";
            } else {
                int i5 = this.zzc;
                int i10 = this.zzd;
                applicationIcon.setBounds(0, 0, i5, i10);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i5, i10, Bitmap.Config.ARGB_8888);
                applicationIcon.draw(new Canvas(bitmapCreateBitmap));
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            }
            this.zze = strEncodeToString;
        }
        if (!this.zze.isEmpty()) {
            jSONObject.put("icon", this.zze);
            jSONObject.put("iconWidthPx", this.zzc);
            jSONObject.put("iconHeightPx", this.zzd);
        }
        return jSONObject;
    }
}
