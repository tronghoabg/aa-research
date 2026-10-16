package com.google.android.gms.internal.ads;

import A7.AbstractC0279p0;
import G6.U;
import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Message;
import android.view.View;
import android.view.WindowManager;
import android.webkit.ConsoleMessage;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import ka.AbstractC3256n;
import org.apache.tika.metadata.TikaCoreProperties;

/* loaded from: classes3.dex */
public final class zzcla extends WebChromeClient {
    private final zzclb zza;

    public zzcla(zzclb zzclbVar) {
        this.zza = zzclbVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Context zzb(WebView webView) {
        if (!(webView instanceof zzclb)) {
            return webView.getContext();
        }
        zzclb zzclbVar = (zzclb) webView;
        Activity activityZzj = zzclbVar.zzj();
        return activityZzj != null ? activityZzj : zzclbVar.getContext();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebChromeClient
    public final void onCloseWindow(WebView webView) {
        if (!(webView instanceof zzclb)) {
            int i5 = G6.L.f4523b;
            H6.l.f("Tried to close a WebView that wasn't an AdWebView.");
            return;
        }
        F6.l lVarZzL = ((zzclb) webView).zzL();
        if (lVarZzL != null) {
            lVarZzL.zzb();
        } else {
            int i10 = G6.L.f4523b;
            H6.l.f("Tried to close an AdWebView not associated with an overlay.");
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String strMessage = consoleMessage.message();
        String strSourceId = consoleMessage.sourceId();
        int iLineNumber = consoleMessage.lineNumber();
        int length = String.valueOf(strMessage).length();
        StringBuilder sb2 = new StringBuilder(length + 6 + String.valueOf(strSourceId).length() + 1 + String.valueOf(iLineNumber).length() + 1);
        AbstractC3256n.p(sb2, "JS: ", strMessage, " (", strSourceId);
        String strO = AbstractC0279p0.o(sb2, TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER, iLineNumber, ")");
        if (strO.contains("Application Cache")) {
            return super.onConsoleMessage(consoleMessage);
        }
        int i5 = zzckz.zza[consoleMessage.messageLevel().ordinal()];
        if (i5 == 1) {
            int i10 = G6.L.f4523b;
            H6.l.c(strO);
        } else if (i5 == 2) {
            int i11 = G6.L.f4523b;
            H6.l.f(strO);
        } else if (i5 == 3 || i5 == 4 || i5 != 5) {
            int i12 = G6.L.f4523b;
            H6.l.e(strO);
        } else {
            int i13 = G6.L.f4523b;
            H6.l.a(strO);
        }
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z2, boolean z10, Message message) {
        WebView.WebViewTransport webViewTransport = (WebView.WebViewTransport) message.obj;
        WebView webView2 = new WebView(webView.getContext());
        zzclb zzclbVar = this.zza;
        if (zzclbVar.zzQ() != null) {
            webView2.setWebViewClient(zzclbVar.zzQ());
        }
        webViewTransport.setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onExceededDatabaseQuota(String str, String str2, long j8, long j10, long j11, WebStorage.QuotaUpdater quotaUpdater) {
        long j12 = 5242880 - j11;
        if (j12 <= 0) {
            quotaUpdater.updateQuota(j8);
            return;
        }
        if (j8 == 0) {
            if (j10 > j12 || j10 > 1048576) {
                j10 = 0;
            }
        } else if (j10 == 0) {
            j10 = Math.min(Math.min(131072L, j12) + j8, 1048576L);
        } else {
            if (j10 <= Math.min(1048576 - j8, j12)) {
                j8 += j10;
            }
            j10 = j8;
        }
        quotaUpdater.updateQuota(j10);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0024  */
    @Override // android.webkit.WebChromeClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onGeolocationPermissionsShowPrompt(java.lang.String r7, android.webkit.GeolocationPermissions.Callback r8) {
        /*
            r6 = this;
            if (r8 == 0) goto L57
            com.google.android.gms.internal.ads.zzclb r0 = r6.zza
            C6.n r1 = C6.n.f1857D
            G6.U r2 = r1.f1863c
            android.content.Context r2 = r0.getContext()
            java.lang.String r3 = "android.permission.ACCESS_FINE_LOCATION"
            boolean r2 = G6.U.c(r2, r3)
            r3 = 0
            r4 = 1
            if (r2 != 0) goto L24
            G6.U r1 = r1.f1863c
            android.content.Context r0 = r0.getContext()
            java.lang.String r1 = "android.permission.ACCESS_COARSE_LOCATION"
            boolean r0 = G6.U.c(r0, r1)
            if (r0 == 0) goto L26
        L24:
            r0 = r4
            goto L27
        L26:
            r0 = r3
        L27:
            com.google.android.gms.internal.ads.zzbio r1 = com.google.android.gms.internal.ads.zzbix.zzoT
            D6.s r2 = D6.C0395s.f2489e
            com.google.android.gms.internal.ads.zzbiv r5 = r2.f2492c
            java.lang.Object r1 = r5.zzd(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L3d
            r8.invoke(r7, r3, r4)
            goto L40
        L3d:
            r8.invoke(r7, r0, r4)
        L40:
            com.google.android.gms.internal.ads.zzbio r7 = com.google.android.gms.internal.ads.zzbix.zzoU
            com.google.android.gms.internal.ads.zzbiv r8 = r2.f2492c
            java.lang.Object r7 = r8.zzd(r7)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L57
            int r7 = G6.L.f4523b
            java.lang.String r7 = "AdWebChromeClient.onGeolocationPermissionsShowPrompt()"
            H6.l.a(r7)
        L57:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcla.onGeolocationPermissionsShowPrompt(java.lang.String, android.webkit.GeolocationPermissions$Callback):void");
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        F6.l lVarZzL = this.zza.zzL();
        if (lVarZzL != null) {
            lVarZzL.zzc();
        } else {
            int i5 = G6.L.f4523b;
            H6.l.f("Could not get ad overlay when hiding custom view.");
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return zza(zzb(webView), "alert", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        return zza(zzb(webView), "onBeforeUnload", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        return zza(zzb(webView), "confirm", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return zza(zzb(webView), "prompt", str, str2, str3, null, jsPromptResult, true);
    }

    @Override // android.webkit.WebChromeClient
    @Deprecated
    public final void onShowCustomView(View view, int i5, WebChromeClient.CustomViewCallback customViewCallback) {
        F6.l lVarZzL = this.zza.zzL();
        if (lVarZzL == null) {
            int i10 = G6.L.f4523b;
            H6.l.f("Could not get ad overlay when showing custom view.");
            customViewCallback.onCustomViewHidden();
            return;
        }
        Activity activity = lVarZzL.f3971a;
        FrameLayout frameLayout = new FrameLayout(activity);
        lVarZzL.f3977g = frameLayout;
        frameLayout.setBackgroundColor(-16777216);
        lVarZzL.f3977g.addView(view, -1, -1);
        activity.setContentView(lVarZzL.f3977g);
        lVarZzL.f3987r = true;
        lVarZzL.f3978h = customViewCallback;
        lVarZzL.f3976f = true;
        lVarZzL.Y(i5);
    }

    public final boolean zza(Context context, String str, String str2, String str3, String str4, JsResult jsResult, JsPromptResult jsPromptResult, boolean z2) {
        zzclb zzclbVar;
        C6.b bVarZzh;
        try {
            zzclbVar = this.zza;
        } catch (WindowManager.BadTokenException e7) {
            int i5 = G6.L.f4523b;
            H6.l.g("Fail to display Dialog.", e7);
        }
        if (zzclbVar != null && zzclbVar.zzP() != null && zzclbVar.zzP().zzh() != null && (bVarZzh = zzclbVar.zzP().zzh()) != null && !bVarZzh.a()) {
            StringBuilder sb2 = new StringBuilder(str.length() + 9 + String.valueOf(str3).length() + 2);
            sb2.append("window.");
            sb2.append(str);
            sb2.append("('");
            sb2.append(str3);
            sb2.append("')");
            bVarZzh.b(sb2.toString());
            return false;
        }
        U u10 = C6.n.f1857D.f1863c;
        AlertDialog.Builder builderK = U.k(context);
        builderK.setTitle(str2);
        if (z2) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            TextView textView = new TextView(context);
            textView.setText(str3);
            EditText editText = new EditText(context);
            editText.setText(str4);
            linearLayout.addView(textView);
            linearLayout.addView(editText);
            builderK.setView(linearLayout).setPositiveButton(R.string.ok, new zzcky(jsPromptResult, editText)).setNegativeButton(R.string.cancel, new zzckx(jsPromptResult)).setOnCancelListener(new zzckw(jsPromptResult)).create().show();
        } else {
            builderK.setMessage(str3).setPositiveButton(R.string.ok, new zzckv(jsResult)).setNegativeButton(R.string.cancel, new zzcku(jsResult)).setOnCancelListener(new zzckt(jsResult)).create().show();
        }
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        onShowCustomView(view, -1, customViewCallback);
    }
}
