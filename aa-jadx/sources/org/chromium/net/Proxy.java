package org.chromium.net;

/* JADX INFO: loaded from: classes2.dex */
public final class Proxy {
    public static final int SCHEME_HTTP = 0;
    public static final int SCHEME_HTTPS = 1;
    private final org.chromium.net.Proxy.HttpConnectCallback mCallback;
    private final java.util.concurrent.Executor mExecutor;
    private final java.lang.String mHost;
    private final int mPort;
    private final int mScheme;

    public static abstract class HttpConnectCallback {
        public static final int RESPONSE_ACTION_CLOSE = 0;
        public static final int RESPONSE_ACTION_PROCEED = 1;

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public @interface OnResponseReceivedAction {
        }

        public static abstract class Request implements java.lang.AutoCloseable {
            @Override // java.lang.AutoCloseable
            public abstract void close();

            public abstract void proceed(java.util.List<android.util.Pair<java.lang.String, java.lang.String>> list);
        }

        public abstract void onBeforeRequest(org.chromium.net.Proxy.HttpConnectCallback.Request request);

        public abstract int onResponseReceived(java.util.List<android.util.Pair<java.lang.String, java.lang.String>> list, int i);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Scheme {
    }

    private Proxy(int i, java.lang.String str, int i2, java.util.concurrent.Executor executor, org.chromium.net.Proxy.HttpConnectCallback httpConnectCallback) {
        if (i != 0 && i != 1) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Unknown scheme %s", java.lang.Integer.valueOf(i)));
        }
        if (str.equals("")) {
            throw new java.lang.IllegalArgumentException("host cannot be an empty string");
        }
        if (i2 < 0 || i2 > 65535) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("port must be within [0, 65535] but it was: %d", java.lang.Integer.valueOf(i2)));
        }
        this.mScheme = i;
        this.mHost = str;
        this.mPort = i2;
        executor.getClass();
        this.mExecutor = executor;
        httpConnectCallback.getClass();
        this.mCallback = httpConnectCallback;
    }

    public static org.chromium.net.Proxy createHttpProxy(int i, java.lang.String str, int i2, java.util.concurrent.Executor executor, org.chromium.net.Proxy.HttpConnectCallback httpConnectCallback) {
        return new org.chromium.net.Proxy(i, str, i2, executor, httpConnectCallback);
    }

    public org.chromium.net.Proxy.HttpConnectCallback getCallback() {
        return this.mCallback;
    }

    public java.util.concurrent.Executor getExecutor() {
        return this.mExecutor;
    }

    public java.lang.String getHost() {
        return this.mHost;
    }

    public int getPort() {
        return this.mPort;
    }

    public int getScheme() {
        return this.mScheme;
    }
}
