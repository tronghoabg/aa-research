package com.carstream.tech.car;

import android.webkit.JavascriptInterface;
import defpackage.q8;
import defpackage.t7;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class t {
    public final CarScreen a;

    public t(CarScreen carScreen) {
        this.a = carScreen;
    }

    @JavascriptInterface
    public void audioStuck() {
        this.a.debounce.post(new p(this, 2));
    }

    @JavascriptInterface
    public void iptvSave(String str) {
        this.a.debounce.post(new q8(this, str, 1));
    }

    @JavascriptInterface
    public void logPick(String str) {
        this.a.webLogLine("TU CHON: ", str);
    }

    @JavascriptInterface
    public void mediaXinDanhSach() {
        this.a.debounce.post(new t7(this, 1));
    }

    @JavascriptInterface
    public void nowQuality(String str) {
        this.a.debounce.post(new g(this, str, 1));
    }

    @JavascriptInterface
    public void onSheet(String str) {
        this.a.debounce.post(new q8(this, str, 0));
    }

    @JavascriptInterface
    public void onSheetClosed() {
        this.a.debounce.post(new p(this, 0));
    }

    @JavascriptInterface
    public void pageOverlay(boolean z) {
        this.a.debounce.post(new r(this, z, 1));
    }

    @JavascriptInterface
    public void playerControls(boolean z) {
        this.a.debounce.post(new r(this, z, 2));
    }

    @JavascriptInterface
    public void setNowPlaying(String str, String str2, String str3, long j, long j2, boolean z) {
        this.a.debounce.post(new q(this, str, str2, str3, j, j2, z));
    }

    @JavascriptInterface
    public void setPlaying(boolean z) {
        this.a.debounce.post(new r(this, z, 0));
    }

    @JavascriptInterface
    public void sheetDebug(String str) {
        this.a.webLogLine("SHEET: ", str);
    }

    @JavascriptInterface
    public void wantFullscreen() {
        this.a.debounce.post(new p(this, 3));
    }

    @JavascriptInterface
    public void webBlur() {
        this.a.debounce.post(new p(this, 1));
    }

    @JavascriptInterface
    public void webFocus(String str, boolean z) {
        this.a.debounce.post(new s(this, str, z));
    }

    @JavascriptInterface
    public void webLog(String str) {
        this.a.webLogLine("WEB: ", str);
    }
}
