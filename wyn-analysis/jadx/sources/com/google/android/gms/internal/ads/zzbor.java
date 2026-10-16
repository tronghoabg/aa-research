package com.google.android.gms.internal.ads;

import G6.U;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzbor implements zzbpx {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzbpx
    public final void zza(Object obj, Map map) {
        zzclb zzclbVar = (zzclb) obj;
        WindowManager windowManager = (WindowManager) zzclbVar.getContext().getSystemService("window");
        U u10 = C6.n.f1857D.f1863c;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        int i5 = displayMetrics.widthPixels;
        int i10 = displayMetrics.heightPixels;
        int[] iArr = new int[2];
        HashMap map2 = new HashMap();
        ((View) zzclbVar).getLocationInWindow(iArr);
        map2.put("xInPixels", Integer.valueOf(iArr[0]));
        N0.a.p(iArr[1], map2, "yInPixels", i5, "windowWidthInPixels");
        map2.put("windowHeightInPixels", Integer.valueOf(i10));
        zzclbVar.zze("locationReady", map2);
        int i11 = G6.L.f4523b;
        H6.l.f("GET LOCATION COMPILED");
    }
}
