package org.chromium.net.impl;

/* JADX INFO: loaded from: classes2.dex */
class AndroidUrlRequestStatusListenerWrapper implements android.net.http.UrlRequest$StatusListener {
    private final org.chromium.net.UrlRequest.StatusListener a;

    public AndroidUrlRequestStatusListenerWrapper(org.chromium.net.UrlRequest.StatusListener statusListener) {
        this.a = statusListener;
    }

    public final void onStatus(int i) {
        this.a.onStatus(i);
    }
}
