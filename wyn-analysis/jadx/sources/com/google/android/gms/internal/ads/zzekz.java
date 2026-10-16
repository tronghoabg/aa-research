package com.google.android.gms.internal.ads;

import D6.C0395s;
import G6.U;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import cb.AbstractC1593a;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.wynauto.wyn.R;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import q7.BinderC3877b;
import q7.InterfaceC3876a;
import u.AbstractC4159a;

/* loaded from: classes3.dex */
public final class zzekz extends zzbza {
    final Map zza = new HashMap();
    private final Context zzb;
    private final zzdzt zzc;
    private final H6.p zzd;
    private final zzeko zze;
    private String zzf;
    private String zzg;

    public zzekz(Context context, zzeko zzekoVar, H6.p pVar, zzdzt zzdztVar) {
        this.zzb = context;
        this.zzc = zzdztVar;
        this.zzd = pVar;
        this.zze = zzekoVar;
    }

    public static void zzd(Context context, zzdzt zzdztVar, zzeko zzekoVar, String str, String str2) {
        zzk(context, zzdztVar, zzekoVar, str, str2, new HashMap());
    }

    public static void zzk(Context context, zzdzt zzdztVar, zzeko zzekoVar, String str, String str2, Map map) {
        String strZzg;
        C6.n nVar = C6.n.f1857D;
        String str3 = true != nVar.f1868h.zzt(context) ? "offline" : AbstractC4159a.ONLINE_EXTRAS_KEY;
        if (zzdztVar != null) {
            zzdzs zzdzsVarZza = zzdztVar.zza();
            zzdzsVarZza.zzc("gqi", str);
            zzdzsVarZza.zzc(HandleInvocationsFromAdViewer.KEY_ACTION, str2);
            zzdzsVarZza.zzc("device_connectivity", str3);
            nVar.k.getClass();
            zzdzsVarZza.zzc("event_timestamp", String.valueOf(System.currentTimeMillis()));
            for (Map.Entry entry : map.entrySet()) {
                zzdzsVarZza.zzc((String) entry.getKey(), (String) entry.getValue());
            }
            strZzg = zzdzsVarZza.zzg();
        } else {
            strZzg = "";
        }
        String str4 = strZzg;
        C6.n.f1857D.k.getClass();
        zzekoVar.zze(new zzekq(System.currentTimeMillis(), str, str4, 2));
    }

    public static final PendingIntent zzr(Context context, String str, String str2, String str3) {
        Intent intent = new Intent();
        intent.setAction(str);
        intent.putExtra("offline_notification_action", str);
        intent.putExtra("gws_query_id", str2);
        intent.putExtra("uri", str3);
        if (Build.VERSION.SDK_INT < 29 || !str.equals("offline_notification_clicked")) {
            intent.setClassName(context, "com.google.android.gms.ads.AdService");
            return zzgqq.zzb(context, 0, intent, 1140850688, 0);
        }
        intent.setClassName(context, "com.google.android.gms.ads.NotificationHandlerActivity");
        return zzgqq.zza(context, 0, intent, 201326592);
    }

    private final void zzs(final Activity activity, final F6.l lVar) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        C6.n nVar = C6.n.f1857D;
        U u10 = nVar.f1863c;
        if (new X0.N(activity).a()) {
            zzt();
            zzu(activity, lVar);
        } else {
            if (Build.VERSION.SDK_INT >= 33) {
                activity.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 12345);
                zzw(this.zzf, "asnpdi", zzgww.zza());
                return;
            }
            U u11 = nVar.f1863c;
            AlertDialog.Builder builderK = U.k(activity);
            builderK.setTitle(zzx(R.string.notifications_permission_title, "Allow app to send you notifications?")).setPositiveButton(zzx(R.string.notifications_permission_confirm, "Allow"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzeku
                @Override // android.content.DialogInterface.OnClickListener
                public final /* synthetic */ void onClick(DialogInterface dialogInterface, int i5) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
                    this.zza.zzo(activity, lVar, dialogInterface, i5);
                }
            }).setNegativeButton(zzx(R.string.notifications_permission_decline, "Don't allow"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzekv
                @Override // android.content.DialogInterface.OnClickListener
                public final /* synthetic */ void onClick(DialogInterface dialogInterface, int i5) {
                    this.zza.zzp(lVar, dialogInterface, i5);
                }
            }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.zzekw
                @Override // android.content.DialogInterface.OnCancelListener
                public final /* synthetic */ void onCancel(DialogInterface dialogInterface) {
                    this.zza.zzq(lVar, dialogInterface);
                }
            });
            builderK.create().show();
            zzw(this.zzf, "rtsdi", zzgww.zza());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzt() throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            r7 = this;
            C6.n r0 = C6.n.f1857D     // Catch: android.os.RemoteException -> L22
            G6.U r0 = r0.f1863c     // Catch: android.os.RemoteException -> L22
            android.content.Context r0 = r7.zzb     // Catch: android.os.RemoteException -> L22
            G6.A r1 = G6.U.b(r0)     // Catch: android.os.RemoteException -> L22
            q7.b r2 = new q7.b     // Catch: android.os.RemoteException -> L22
            r2.<init>(r0)     // Catch: android.os.RemoteException -> L22
            E6.a r3 = new E6.a     // Catch: android.os.RemoteException -> L22
            java.lang.String r4 = r7.zzg     // Catch: android.os.RemoteException -> L22
            java.lang.String r5 = r7.zzf     // Catch: android.os.RemoteException -> L22
            java.util.Map r6 = r7.zza     // Catch: android.os.RemoteException -> L22
            java.lang.Object r6 = r6.get(r5)     // Catch: android.os.RemoteException -> L22
            com.google.android.gms.internal.ads.zzekg r6 = (com.google.android.gms.internal.ads.zzekg) r6     // Catch: android.os.RemoteException -> L22
            if (r6 != 0) goto L24
            java.lang.String r6 = ""
            goto L28
        L22:
            r0 = move-exception
            goto L43
        L24:
            java.lang.String r6 = r6.zzb()     // Catch: android.os.RemoteException -> L22
        L28:
            r3.<init>(r4, r5, r6)     // Catch: android.os.RemoteException -> L22
            boolean r2 = r1.zzg(r2, r3)     // Catch: android.os.RemoteException -> L22
            if (r2 != 0) goto L41
            q7.b r3 = new q7.b     // Catch: android.os.RemoteException -> L3f
            r3.<init>(r0)     // Catch: android.os.RemoteException -> L3f
            java.lang.String r0 = r7.zzg     // Catch: android.os.RemoteException -> L3f
            java.lang.String r4 = r7.zzf     // Catch: android.os.RemoteException -> L3f
            boolean r0 = r1.zze(r3, r0, r4)     // Catch: android.os.RemoteException -> L3f
            goto L4c
        L3f:
            r0 = move-exception
            goto L44
        L41:
            r0 = 1
            goto L4c
        L43:
            r2 = 0
        L44:
            int r1 = G6.L.f4523b
            java.lang.String r1 = "Failed to schedule offline notification poster."
            H6.l.d(r1, r0)
            r0 = r2
        L4c:
            if (r0 != 0) goto L60
            com.google.android.gms.internal.ads.zzeko r0 = r7.zze
            java.lang.String r1 = r7.zzf
            r0.zzd(r1)
            java.lang.String r0 = r7.zzf
            java.lang.String r1 = "offline_notification_worker_not_scheduled"
            com.google.android.gms.internal.ads.zzgww r2 = com.google.android.gms.internal.ads.zzgww.zza()
            r7.zzw(r0, r1, r2)
        L60:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzekz.zzt():void");
    }

    private final void zzu(Activity activity, F6.l lVar) {
        AlertDialog alertDialogZzv = zzv(activity, lVar);
        alertDialogZzv.show();
        Timer timer = new Timer();
        timer.schedule(new zzekr(this, alertDialogZzv, timer, lVar), 3000L);
    }

    private final AlertDialog zzv(Activity activity, final F6.l lVar) {
        U u10 = C6.n.f1857D.f1863c;
        AlertDialog.Builder onCancelListener = U.k(activity).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.zzekx
            @Override // android.content.DialogInterface.OnCancelListener
            public final /* synthetic */ void onCancel(DialogInterface dialogInterface) {
                F6.l lVar2 = lVar;
                if (lVar2 != null) {
                    lVar2.zzb();
                }
            }
        });
        XmlResourceParser xmlResourceParserZzy = zzy(R.layout.offline_ads_dialog);
        if (xmlResourceParserZzy == null) {
            onCancelListener.setMessage(zzx(R.string.offline_dialog_text, "Thanks for your interest.\nWe will share more once you're back online."));
            return onCancelListener.create();
        }
        try {
            View viewInflate = activity.getLayoutInflater().inflate(xmlResourceParserZzy, (ViewGroup) null);
            onCancelListener.setView(viewInflate);
            String strZzz = zzz();
            if (!TextUtils.isEmpty(strZzz)) {
                TextView textView = (TextView) viewInflate.findViewById(R.id.offline_dialog_advertiser_name);
                textView.setVisibility(0);
                textView.setText(strZzz);
            }
            zzekg zzekgVar = (zzekg) this.zza.get(this.zzf);
            Drawable drawableZzc = zzekgVar != null ? zzekgVar.zzc() : null;
            if (drawableZzc != null) {
                ((ImageView) viewInflate.findViewById(R.id.offline_dialog_image)).setImageDrawable(drawableZzc);
            }
            AlertDialog alertDialogCreate = onCancelListener.create();
            alertDialogCreate.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            return alertDialogCreate;
        } catch (Resources.NotFoundException unused) {
            onCancelListener.setMessage(zzx(R.string.offline_dialog_text, "Thanks for your interest.\nWe will share more once you're back online."));
            return onCancelListener.create();
        }
    }

    private final void zzw(String str, String str2, Map map) {
        zzk(this.zzb, this.zzc, this.zze, str, str2, map);
    }

    private static String zzx(int i5, String str) {
        Resources resourcesZzg = C6.n.f1857D.f1868h.zzg();
        if (resourcesZzg != null) {
            try {
                return resourcesZzg.getString(i5);
            } catch (Resources.NotFoundException unused) {
            }
        }
        return str;
    }

    private static XmlResourceParser zzy(int i5) {
        Resources resourcesZzg = C6.n.f1857D.f1868h.zzg();
        if (resourcesZzg == null) {
            return null;
        }
        try {
            return resourcesZzg.getLayout(i5);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    private final String zzz() {
        zzekg zzekgVar = (zzekg) this.zza.get(this.zzf);
        return zzekgVar == null ? "" : zzekgVar.zza();
    }

    public final void zzc(String str, zzdqb zzdqbVar) {
        String strZzQ = zzdqbVar.zzQ();
        String strZzB = zzdqbVar.zzB();
        String string = "";
        if (TextUtils.isEmpty(strZzQ)) {
            strZzQ = strZzB != null ? strZzB : "";
        }
        zzbml zzbmlVarZzD = zzdqbVar.zzD();
        if (zzbmlVarZzD != null) {
            try {
                string = zzbmlVarZzD.zzc().toString();
            } catch (RemoteException unused) {
            }
        }
        zzbml zzbmlVarZzP = zzdqbVar.zzP();
        Drawable drawable = null;
        if (zzbmlVarZzP != null) {
            try {
                InterfaceC3876a interfaceC3876aZzb = zzbmlVarZzP.zzb();
                if (interfaceC3876aZzb != null) {
                    drawable = (Drawable) BinderC3877b.S(interfaceC3876aZzb);
                }
            } catch (RemoteException unused2) {
            }
        }
        this.zza.put(str, new zzekd(strZzQ, string, drawable));
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    public final void zze(Intent intent) {
        String stringExtra = intent.getStringExtra("offline_notification_action");
        if (stringExtra != null) {
            if (stringExtra.equals("offline_notification_clicked") || stringExtra.equals("offline_notification_dismissed")) {
                String stringExtra2 = intent.getStringExtra("gws_query_id");
                String stringExtra3 = intent.getStringExtra("uri");
                Context context = this.zzb;
                boolean zZzt = C6.n.f1857D.f1868h.zzt(context);
                HashMap map = new HashMap();
                if (stringExtra.equals("offline_notification_clicked")) {
                    map.put("offline_notification_action", "offline_notification_clicked");
                    c = true == zZzt ? (char) 1 : (char) 2;
                    map.put("obvs", String.valueOf(Build.VERSION.SDK_INT));
                    map.put("olaih", String.valueOf(stringExtra3.startsWith("http")));
                    try {
                        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(stringExtra3);
                        if (launchIntentForPackage == null) {
                            launchIntentForPackage = new Intent("android.intent.action.VIEW");
                            launchIntentForPackage.setData(Uri.parse(stringExtra3));
                        }
                        launchIntentForPackage.addFlags(268435456);
                        context.startActivity(launchIntentForPackage);
                        map.put("olaa", "olas");
                    } catch (ActivityNotFoundException unused) {
                        map.put("olaa", "olaf");
                    }
                } else {
                    map.put("offline_notification_action", "offline_notification_dismissed");
                }
                zzw(stringExtra2, "offline_notification_action", map);
                try {
                    SQLiteDatabase writableDatabase = this.zze.getWritableDatabase();
                    if (c == 1) {
                        this.zze.zzb(writableDatabase, this.zzd, stringExtra2);
                    } else {
                        zzeko.zzi(writableDatabase, stringExtra2);
                    }
                } catch (SQLiteException e7) {
                    String strConcat = "Failed to get writable offline buffering database: ".concat(e7.toString());
                    int i5 = G6.L.f4523b;
                    H6.l.c(strConcat);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    public final void zzf(InterfaceC3876a interfaceC3876a, String str, String str2) {
        zzj(interfaceC3876a, new E6.a(str, str2, ""));
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    public final void zzg() {
        final H6.p pVar = this.zzd;
        this.zze.zza(new zzfos() { // from class: com.google.android.gms.internal.ads.zzekm
            @Override // com.google.android.gms.internal.ads.zzfos
            public final /* synthetic */ Object zza(Object obj) throws Throwable {
                zzeko.zzf(pVar, (SQLiteDatabase) obj);
                return null;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    public final void zzh(InterfaceC3876a interfaceC3876a) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        zzelb zzelbVar = (zzelb) BinderC3877b.S(interfaceC3876a);
        final Activity activityZza = zzelbVar.zza();
        final F6.l lVarZzb = zzelbVar.zzb();
        this.zzf = zzelbVar.zzc();
        this.zzg = zzelbVar.zzd();
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzjQ)).booleanValue()) {
            zzs(activityZza, lVarZzb);
            return;
        }
        zzw(this.zzf, "dialog_impression", zzgww.zza());
        U u10 = C6.n.f1857D.f1863c;
        AlertDialog.Builder builderK = U.k(activityZza);
        builderK.setTitle(zzx(R.string.offline_opt_in_title, "Open ad when you're back online.")).setMessage(zzx(R.string.offline_opt_in_message, "We'll send you a notification with a link to the advertiser site.")).setPositiveButton(zzx(R.string.offline_opt_in_confirm, "OK"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzeky
            @Override // android.content.DialogInterface.OnClickListener
            public final /* synthetic */ void onClick(DialogInterface dialogInterface, int i5) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
                this.zza.zzl(activityZza, lVarZzb, dialogInterface, i5);
            }
        }).setNegativeButton(zzx(R.string.offline_opt_in_decline, "No thanks"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzeks
            @Override // android.content.DialogInterface.OnClickListener
            public final /* synthetic */ void onClick(DialogInterface dialogInterface, int i5) {
                this.zza.zzm(lVarZzb, dialogInterface, i5);
            }
        }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.zzekt
            @Override // android.content.DialogInterface.OnCancelListener
            public final /* synthetic */ void onCancel(DialogInterface dialogInterface) {
                this.zza.zzn(lVarZzb, dialogInterface);
            }
        });
        builderK.create().show();
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    public final void zzi(String[] strArr, int[] iArr, InterfaceC3876a interfaceC3876a) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        for (int i5 = 0; i5 < strArr.length; i5++) {
            if (strArr[i5].equals("android.permission.POST_NOTIFICATIONS")) {
                zzelb zzelbVar = (zzelb) BinderC3877b.S(interfaceC3876a);
                Activity activityZza = zzelbVar.zza();
                F6.l lVarZzb = zzelbVar.zzb();
                HashMap map = new HashMap();
                if (iArr[i5] == 0) {
                    map.put("dialog_action", "confirm");
                    zzt();
                    zzu(activityZza, lVarZzb);
                } else {
                    map.put("dialog_action", "dismiss");
                    if (lVarZzb != null) {
                        lVarZzb.zzb();
                    }
                }
                zzw(this.zzf, "asnpdc", map);
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a7  */
    @Override // com.google.android.gms.internal.ads.zzbzb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzj(q7.InterfaceC3876a r11, E6.a r12) {
        /*
            r10 = this;
            r0 = 1
            java.lang.Object r11 = q7.BinderC3877b.S(r11)
            android.content.Context r11 = (android.content.Context) r11
            java.lang.String r1 = r12.f3586a
            java.lang.String r2 = r10.zzz()
            C6.n r3 = C6.n.f1857D
            G6.V r3 = r3.f1866f
            r3.b(r11)
            java.lang.String r3 = "offline_notification_clicked"
            java.lang.String r4 = r12.f3587b
            android.app.PendingIntent r3 = zzr(r11, r3, r4, r1)
            java.lang.String r5 = "offline_notification_dismissed"
            android.app.PendingIntent r1 = zzr(r11, r5, r4, r1)
            X0.q r5 = new X0.q
            java.lang.String r6 = "offline_notification_channel"
            r5.<init>(r11, r6)
            android.app.Notification r6 = r5.f15871G
            boolean r7 = android.text.TextUtils.isEmpty(r2)
            if (r7 != 0) goto L4a
            r7 = 2131951910(0x7f130126, float:1.9540248E38)
            java.lang.String r8 = "You are back online! Continue learning about %s"
            java.lang.String r7 = zzx(r7, r8)
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r2
            java.lang.String r2 = java.lang.String.format(r7, r8)
            java.lang.CharSequence r2 = X0.C1289q.b(r2)
            r5.f15878e = r2
            goto L59
        L4a:
            r2 = 2131951909(0x7f130125, float:1.9540246E38)
            java.lang.String r7 = "You are back online! Let's pick up where we left off"
            java.lang.String r2 = zzx(r2, r7)
            java.lang.CharSequence r2 = X0.C1289q.b(r2)
            r5.f15878e = r2
        L59:
            r2 = 16
            r5.c(r2, r0)
            r6.deleteIntent = r1
            r5.f15880g = r3
            android.content.pm.ApplicationInfo r0 = r11.getApplicationInfo()
            int r0 = r0.icon
            r6.icon = r0
            com.google.android.gms.internal.ads.zzbio r0 = com.google.android.gms.internal.ads.zzbix.zzjR
            D6.s r1 = D6.C0395s.f2489e
            com.google.android.gms.internal.ads.zzbiv r2 = r1.f2492c
            java.lang.Object r0 = r2.zzd(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r5.k = r0
            com.google.android.gms.internal.ads.zzbio r0 = com.google.android.gms.internal.ads.zzbix.zzjT
            com.google.android.gms.internal.ads.zzbiv r1 = r1.f2492c
            java.lang.Object r0 = r1.zzd(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 == 0) goto La7
            java.lang.String r12 = r12.f3588c
            boolean r0 = r12.isEmpty()
            if (r0 != 0) goto La7
            java.net.URL r0 = new java.net.URL     // Catch: java.io.IOException -> La7
            r0.<init>(r12)     // Catch: java.io.IOException -> La7
            java.net.URLConnection r12 = r0.openConnection()     // Catch: java.io.IOException -> La7
            java.io.InputStream r12 = r12.getInputStream()     // Catch: java.io.IOException -> La7
            android.graphics.Bitmap r12 = android.graphics.BitmapFactory.decodeStream(r12)     // Catch: java.io.IOException -> La7
            goto La8
        La7:
            r12 = r1
        La8:
            if (r12 == 0) goto Lbe
            r5.d(r12)     // Catch: android.content.res.Resources.NotFoundException -> Lbe
            X0.n r0 = new X0.n     // Catch: android.content.res.Resources.NotFoundException -> Lbe
            r0.<init>()     // Catch: android.content.res.Resources.NotFoundException -> Lbe
            androidx.core.graphics.drawable.IconCompat r12 = androidx.core.graphics.drawable.IconCompat.f(r12)     // Catch: android.content.res.Resources.NotFoundException -> Lbe
            r0.f15859e = r12     // Catch: android.content.res.Resources.NotFoundException -> Lbe
            r0.k(r1)     // Catch: android.content.res.Resources.NotFoundException -> Lbe
            r5.f(r0)     // Catch: android.content.res.Resources.NotFoundException -> Lbe
        Lbe:
            java.lang.String r12 = "notification"
            java.lang.Object r11 = r11.getSystemService(r12)
            android.app.NotificationManager r11 = (android.app.NotificationManager) r11
            java.util.HashMap r12 = new java.util.HashMap
            r12.<init>()
            android.app.Notification r0 = r5.a()     // Catch: java.lang.IllegalArgumentException -> Ld8
            r1 = 54321(0xd431, float:7.612E-41)
            r11.notify(r4, r1, r0)     // Catch: java.lang.IllegalArgumentException -> Ld8
            java.lang.String r11 = "offline_notification_impression"
            goto Le4
        Ld8:
            r11 = move-exception
            java.lang.String r0 = "notification_not_shown_reason"
            java.lang.String r11 = r11.getMessage()
            r12.put(r0, r11)
            java.lang.String r11 = "offline_notification_failed"
        Le4:
            r10.zzw(r4, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzekz.zzj(q7.a, E6.a):void");
    }

    public final /* synthetic */ void zzl(Activity activity, F6.l lVar, DialogInterface dialogInterface, int i5) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        zzw(this.zzf, "dialog_click", AbstractC1593a.l("dialog_action", "confirm"));
        zzs(activity, lVar);
    }

    public final /* synthetic */ void zzm(F6.l lVar, DialogInterface dialogInterface, int i5) {
        this.zze.zzd(this.zzf);
        HashMap map = new HashMap();
        map.put("dialog_action", "dismiss");
        zzw(this.zzf, "dialog_click", map);
        if (lVar != null) {
            lVar.zzb();
        }
    }

    public final /* synthetic */ void zzn(F6.l lVar, DialogInterface dialogInterface) {
        this.zze.zzd(this.zzf);
        HashMap map = new HashMap();
        map.put("dialog_action", "dismiss");
        zzw(this.zzf, "dialog_click", map);
        if (lVar != null) {
            lVar.zzb();
        }
    }

    public final void zzo(Activity activity, F6.l lVar, DialogInterface dialogInterface, int i5) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        zzw(this.zzf, "rtsdc", AbstractC1593a.l("dialog_action", "confirm"));
        activity.startActivity(C6.n.f1857D.f1866f.d(activity));
        zzt();
        if (lVar != null) {
            lVar.zzb();
        }
    }

    public final /* synthetic */ void zzp(F6.l lVar, DialogInterface dialogInterface, int i5) {
        this.zze.zzd(this.zzf);
        HashMap map = new HashMap();
        map.put("dialog_action", "dismiss");
        zzw(this.zzf, "rtsdc", map);
        if (lVar != null) {
            lVar.zzb();
        }
    }

    public final /* synthetic */ void zzq(F6.l lVar, DialogInterface dialogInterface) {
        this.zze.zzd(this.zzf);
        HashMap map = new HashMap();
        map.put("dialog_action", "dismiss");
        zzw(this.zzf, "rtsdc", map);
        if (lVar != null) {
            lVar.zzb();
        }
    }
}
