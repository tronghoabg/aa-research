package com.google.android.gms.internal.ads;

import D6.C0395s;
import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzbfx extends Thread {
    private boolean zza;
    private boolean zzb;
    private final Object zzc;
    private final zzbfo zzd;
    private final int zze;
    private final int zzf;
    private final int zzg;
    private final int zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final String zzm;
    private final boolean zzn;
    private final boolean zzo;

    public zzbfx() {
        zzbfo zzbfoVar = new zzbfo();
        this.zza = false;
        this.zzb = false;
        this.zzd = zzbfoVar;
        this.zzc = new Object();
        this.zzf = ((Long) zzbko.zzd.zze()).intValue();
        this.zzg = ((Long) zzbko.zza.zze()).intValue();
        this.zzh = ((Long) zzbko.zze.zze()).intValue();
        this.zzi = ((Long) zzbko.zzc.zze()).intValue();
        zzbio zzbioVar = zzbix.zzaL;
        C0395s c0395s = C0395s.f2489e;
        this.zzj = ((Integer) c0395s.f2492c.zzd(zzbioVar)).intValue();
        this.zzk = ((Integer) c0395s.f2492c.zzd(zzbix.zzaM)).intValue();
        this.zzl = ((Integer) c0395s.f2492c.zzd(zzbix.zzaN)).intValue();
        this.zze = ((Long) zzbko.zzf.zze()).intValue();
        this.zzm = (String) c0395s.f2492c.zzd(zzbix.zzaP);
        this.zzn = ((Boolean) c0395s.f2492c.zzd(zzbix.zzaQ)).booleanValue();
        this.zzo = ((Boolean) c0395s.f2492c.zzd(zzbix.zzaR)).booleanValue();
        ((Boolean) c0395s.f2492c.zzd(zzbix.zzaS)).getClass();
        setName("ContentFetchTask");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
    
        if (r3.importance != 100) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        if (r2.inKeyguardRestrictedInputMode() != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
    
        r0 = (android.os.PowerManager) r0.getSystemService("power");
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
    
        if (r0 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
    
        if (r0.isScreenOn() == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005a, code lost:
    
        r0 = C6.n.f1857D.f1867g.zzd();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0062, code lost:
    
        if (r0 != null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0064, code lost:
    
        r1 = G6.L.f4523b;
        H6.l.a("ContentFetchThread: no activity. Sleeping.");
        zze();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0071, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0073, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0078, code lost:
    
        if (r0.getWindow() == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0082, code lost:
    
        if (r0.getWindow().getDecorView() == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0084, code lost:
    
        r1 = r0.getWindow().getDecorView().findViewById(android.R.id.content);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0094, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0095, code lost:
    
        C6.n.f1857D.f1868h.zzh(r0, "ContentFetchTask.extractContent");
        r2 = G6.L.f4523b;
        H6.l.a("Failed getting root view of activity. Content not extracted.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00cd, code lost:
    
        r1 = G6.L.f4523b;
        H6.l.d("Error in ContentFetchTask", r0);
        C6.n.f1857D.f1868h.zzh(r0, "ContentFetchTask.run");
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00de, code lost:
    
        r1 = G6.L.f4523b;
        H6.l.d("Error in ContentFetchTask", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e8 A[EXC_TOP_SPLITTER, LOOP:1: B:64:0x00e8->B:73:0x00e8, LOOP_START, SYNTHETIC] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() throws java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbfx.run():void");
    }

    public final void zza() {
        synchronized (this.zzc) {
            try {
                if (this.zza) {
                    int i5 = G6.L.f4523b;
                    H6.l.a("Content hash thread already started, quitting...");
                } else {
                    this.zza = true;
                    start();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzb(View view) {
        try {
            zzbfn zzbfnVar = new zzbfn(this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzo);
            Context contextZze = C6.n.f1857D.f1867g.zze();
            if (contextZze != null) {
                String str = this.zzm;
                if (!TextUtils.isEmpty(str)) {
                    String str2 = (String) view.getTag(contextZze.getResources().getIdentifier((String) C0395s.f2489e.f2492c.zzd(zzbix.zzaO), "id", contextZze.getPackageName()));
                    if (str2 != null && str2.equals(str)) {
                        return;
                    }
                }
            }
            zzbfw zzbfwVarZzc = zzc(view, zzbfnVar);
            zzbfnVar.zzi();
            if (zzbfwVarZzc.zza == 0 && zzbfwVarZzc.zzb == 0) {
                return;
            }
            int i5 = zzbfwVarZzc.zzb;
            if (i5 == 0 && zzbfnVar.zzl() == 0) {
                return;
            }
            if (i5 == 0 && this.zzd.zza(zzbfnVar)) {
                return;
            }
            this.zzd.zzc(zzbfnVar);
        } catch (Exception e7) {
            int i10 = G6.L.f4523b;
            H6.l.d("Exception in fetchContentOnUIThread", e7);
            C6.n.f1857D.f1868h.zzh(e7, "ContentFetchTask.fetchContent");
        }
    }

    public final zzbfw zzc(View view, zzbfn zzbfnVar) {
        if (view == null) {
            return new zzbfw(this, 0, 0);
        }
        boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
        if ((view instanceof TextView) && !(view instanceof EditText)) {
            CharSequence text = ((TextView) view).getText();
            if (TextUtils.isEmpty(text)) {
                return new zzbfw(this, 0, 0);
            }
            zzbfnVar.zzg(text.toString(), globalVisibleRect, view.getX(), view.getY(), view.getWidth(), view.getHeight());
            return new zzbfw(this, 1, 0);
        }
        if ((view instanceof WebView) && !(view instanceof zzclb)) {
            WebView webView = (WebView) view;
            zzbfnVar.zze();
            webView.post(new zzbfv(this, zzbfnVar, webView, globalVisibleRect));
            return new zzbfw(this, 0, 1);
        }
        if (!(view instanceof ViewGroup)) {
            return new zzbfw(this, 0, 0);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int i5 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
            zzbfw zzbfwVarZzc = zzc(viewGroup.getChildAt(i11), zzbfnVar);
            i5 += zzbfwVarZzc.zza;
            i10 += zzbfwVarZzc.zzb;
        }
        return new zzbfw(this, i5, i10);
    }

    public final void zzd(zzbfn zzbfnVar, WebView webView, String str, boolean z2) {
        zzbfn zzbfnVar2;
        zzbfnVar.zzd();
        try {
            if (TextUtils.isEmpty(str)) {
                zzbfnVar2 = zzbfnVar;
            } else {
                String strOptString = new JSONObject(str).optString("text");
                if (this.zzn || TextUtils.isEmpty(webView.getTitle())) {
                    zzbfnVar2 = zzbfnVar;
                    zzbfnVar2.zzf(strOptString, z2, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                } else {
                    String title = webView.getTitle();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(title).length() + 1 + String.valueOf(strOptString).length());
                    sb2.append(title);
                    sb2.append("\n");
                    sb2.append(strOptString);
                    zzbfnVar.zzf(sb2.toString(), z2, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                    zzbfnVar2 = zzbfnVar;
                }
            }
            if (zzbfnVar2.zza()) {
                this.zzd.zzb(zzbfnVar2);
            }
        } catch (JSONException unused) {
            int i5 = G6.L.f4523b;
            H6.l.a("Json string may be malformed.");
        } catch (Throwable th) {
            int i10 = G6.L.f4523b;
            H6.l.b("Failed to get webview content.", th);
            C6.n.f1857D.f1868h.zzh(th, "ContentFetchTask.processWebViewContent");
        }
    }

    public final void zze() {
        synchronized (this.zzc) {
            this.zzb = true;
            StringBuilder sb2 = new StringBuilder(40);
            sb2.append("ContentFetchThread: paused, pause = true");
            String string = sb2.toString();
            int i5 = G6.L.f4523b;
            H6.l.a(string);
        }
    }
}
