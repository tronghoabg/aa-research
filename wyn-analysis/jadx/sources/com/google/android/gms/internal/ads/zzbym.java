package com.google.android.gms.internal.ads;

import D6.C0392q;
import G6.U;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzbym extends zzbyn implements zzbpx {
    DisplayMetrics zza;
    int zzb;
    int zzc;
    int zzd;
    int zze;
    int zzf;
    int zzg;
    private final zzclb zzh;
    private final Context zzi;
    private final WindowManager zzj;
    private final zzbie zzk;
    private float zzl;
    private int zzm;

    public zzbym(zzclb zzclbVar, Context context, zzbie zzbieVar) {
        super(zzclbVar, "");
        this.zzb = -1;
        this.zzc = -1;
        this.zzd = -1;
        this.zze = -1;
        this.zzf = -1;
        this.zzg = -1;
        this.zzh = zzclbVar;
        this.zzi = context;
        this.zzk = zzbieVar;
        this.zzj = (WindowManager) context.getSystemService("window");
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    public final void zza(Object obj, Map map) throws JSONException {
        JSONObject jSONObjectPut;
        this.zza = new DisplayMetrics();
        Display defaultDisplay = this.zzj.getDefaultDisplay();
        defaultDisplay.getMetrics(this.zza);
        this.zzl = this.zza.density;
        this.zzm = defaultDisplay.getRotation();
        H6.f fVar = C0392q.f2477g.f2478a;
        this.zzb = Math.round(r11.widthPixels / this.zza.density);
        this.zzc = Math.round(r11.heightPixels / this.zza.density);
        zzclb zzclbVar = this.zzh;
        Activity activityZzj = zzclbVar.zzj();
        if (activityZzj == null || activityZzj.getWindow() == null) {
            this.zzd = this.zzb;
            this.zze = this.zzc;
        } else {
            U u10 = C6.n.f1857D.f1863c;
            int[] iArrP = U.p(activityZzj);
            this.zzd = Math.round(iArrP[0] / this.zza.density);
            this.zze = Math.round(iArrP[1] / this.zza.density);
        }
        if (zzclbVar.zzN().zzg()) {
            this.zzf = this.zzb;
            this.zzg = this.zzc;
        } else {
            zzclbVar.measure(0, 0);
        }
        zzl(this.zzb, this.zzc, this.zzd, this.zze, this.zzl, this.zzm);
        zzbyl zzbylVar = new zzbyl();
        zzbie zzbieVar = this.zzk;
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        zzbylVar.zzb(zzbieVar.zzc(intent));
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setData(Uri.parse("sms:"));
        zzbylVar.zza(zzbieVar.zzc(intent2));
        zzbylVar.zzc(zzbieVar.zzb());
        zzbylVar.zzd(zzbieVar.zza());
        zzbylVar.zze(true);
        boolean zZzf = zzbylVar.zzf();
        boolean zZzg = zzbylVar.zzg();
        boolean zZzh = zzbylVar.zzh();
        try {
            jSONObjectPut = new JSONObject().put("sms", zZzf).put("tel", zZzg).put("calendar", zZzh).put("storePicture", zzbylVar.zzi()).put("inlineVideo", zzbylVar.zzj());
        } catch (JSONException e7) {
            int i5 = G6.L.f4523b;
            H6.l.d("Error occurred while obtaining the MRAID capabilities.", e7);
            jSONObjectPut = null;
        }
        zzclbVar.zzd("onDeviceFeaturesReceived", jSONObjectPut);
        int[] iArr = new int[2];
        zzclbVar.getLocationOnScreen(iArr);
        Context context = this.zzi;
        C0392q c0392q = C0392q.f2477g;
        zzb(c0392q.f2478a.h(context, iArr[0]), c0392q.f2478a.h(context, iArr[1]));
        if (H6.l.j(2)) {
            H6.l.e("Dispatching Ready Event.");
        }
        zzh(zzclbVar.zzs().f4927a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0061 A[PHI: r4
  0x0061: PHI (r4v2 int) = (r4v1 int), (r4v6 int) binds: [B:11:0x0040, B:17:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzb(int r9, int r10) {
        /*
            r8 = this;
            android.content.Context r0 = r8.zzi
            boolean r1 = r0 instanceof android.app.Activity
            r2 = 0
            if (r1 == 0) goto L15
            C6.n r1 = C6.n.f1857D
            G6.U r1 = r1.f1863c
            r1 = r0
            android.app.Activity r1 = (android.app.Activity) r1
            int[] r1 = G6.U.q(r1)
            r1 = r1[r2]
            goto L16
        L15:
            r1 = r2
        L16:
            com.google.android.gms.internal.ads.zzclb r3 = r8.zzh
            com.google.android.gms.internal.ads.zzcnl r4 = r3.zzN()
            if (r4 == 0) goto L28
            com.google.android.gms.internal.ads.zzcnl r4 = r3.zzN()
            boolean r4 = r4.zzg()
            if (r4 != 0) goto L74
        L28:
            int r4 = r3.getWidth()
            int r5 = r3.getHeight()
            com.google.android.gms.internal.ads.zzbio r6 = com.google.android.gms.internal.ads.zzbix.zzaJ
            D6.s r7 = D6.C0395s.f2489e
            com.google.android.gms.internal.ads.zzbiv r7 = r7.f2492c
            java.lang.Object r6 = r7.zzd(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L61
            if (r4 != 0) goto L52
            com.google.android.gms.internal.ads.zzcnl r4 = r3.zzN()
            if (r4 == 0) goto L51
            com.google.android.gms.internal.ads.zzcnl r4 = r3.zzN()
            int r4 = r4.zzb
            goto L52
        L51:
            r4 = r2
        L52:
            if (r5 != 0) goto L61
            com.google.android.gms.internal.ads.zzcnl r5 = r3.zzN()
            if (r5 == 0) goto L62
            com.google.android.gms.internal.ads.zzcnl r2 = r3.zzN()
            int r2 = r2.zza
            goto L62
        L61:
            r2 = r5
        L62:
            D6.q r5 = D6.C0392q.f2477g
            H6.f r6 = r5.f2478a
            int r4 = r6.h(r0, r4)
            r8.zzf = r4
            H6.f r4 = r5.f2478a
            int r0 = r4.h(r0, r2)
            r8.zzg = r0
        L74:
            int r0 = r10 - r1
            int r1 = r8.zzf
            int r2 = r8.zzg
            r8.zzj(r9, r0, r1, r2)
            com.google.android.gms.internal.ads.zzcmz r0 = r3.zzP()
            r0.zzP(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbym.zzb(int, int):void");
    }
}
