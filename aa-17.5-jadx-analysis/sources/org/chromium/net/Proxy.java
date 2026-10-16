package org.chromium.net;

import android.util.Pair;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class Proxy {
    public static final int SCHEME_HTTP = 0;
    public static final int SCHEME_HTTPS = 1;
    private final HttpConnectCallback mCallback;
    private final Executor mExecutor;
    private final String mHost;
    private final int mPort;
    private final int mScheme;

    public static abstract class HttpConnectCallback {
        public static final int RESPONSE_ACTION_CLOSE = 0;
        public static final int RESPONSE_ACTION_PROCEED = 1;

        @Retention(RetentionPolicy.SOURCE)
        public @interface OnResponseReceivedAction {
        }

        public static abstract class Request implements AutoCloseable {
            @Override // java.lang.AutoCloseable
            public abstract void close();

            public abstract void proceed(List<Pair<String, String>> list);
        }

        public abstract void onBeforeRequest(Request request);

        public abstract int onResponseReceived(List<Pair<String, String>> list, int i);
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Scheme {
    }

    private Proxy(int i, String str, int i2, Executor executor, HttpConnectCallback httpConnectCallback) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(String.format("Unknown scheme %s", Integer.valueOf(i)));
        }
        if (str.equals("")) {
            throw new IllegalArgumentException("host cannot be an empty string");
        }
        if (i2 < 0 || i2 > 65535) {
            throw new IllegalArgumentException(String.format("port must be within [0, 65535] but it was: %d", Integer.valueOf(i2)));
        }
        this.mScheme = i;
        this.mHost = str;
        this.mPort = i2;
        executor.getClass();
        this.mExecutor = executor;
        httpConnectCallback.getClass();
        this.mCallback = httpConnectCallback;
    }

    public static Proxy createHttpProxy(int i, String str, int i2, Executor executor, HttpConnectCallback httpConnectCallback) {
        return new Proxy(i, str, i2, executor, httpConnectCallback);
    }

    public HttpConnectCallback getCallback() {
        return this.mCallback;
    }

    public Executor getExecutor() {
        return this.mExecutor;
    }

    public String getHost() {
        return this.mHost;
    }

    public int getPort() {
        return this.mPort;
    }

    public int getScheme() {
        return this.mScheme;
    }
}
