package org.chromium.net.impl;

import android.net.http.UrlRequest$StatusListener;
import org.chromium.net.UrlRequest;

/* loaded from: classes2.dex */
class AndroidUrlRequestStatusListenerWrapper implements UrlRequest$StatusListener {
    private final UrlRequest.StatusListener a;

    public AndroidUrlRequestStatusListenerWrapper(UrlRequest.StatusListener statusListener) {
        this.a = statusListener;
    }

    public final void onStatus(int i) {
        this.a.onStatus(i);
    }
}
