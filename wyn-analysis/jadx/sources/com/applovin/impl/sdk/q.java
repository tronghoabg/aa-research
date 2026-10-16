package com.applovin.impl.sdk;

import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import java.util.LinkedList;
import java.util.Queue;

/* loaded from: classes.dex */
class q {

    /* renamed from: a, reason: collision with root package name */
    private final Queue f23239a = new LinkedList();

    /* renamed from: b, reason: collision with root package name */
    private final Object f23240b = new Object();

    public void a(AppLovinAdImpl appLovinAdImpl) {
        synchronized (this.f23240b) {
            try {
                if (b() <= 25) {
                    this.f23239a.offer(appLovinAdImpl);
                } else {
                    o.h("AppLovinSdk", "Maximum queue capacity reached - discarding ad...");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int b() {
        int size;
        synchronized (this.f23240b) {
            size = this.f23239a.size();
        }
        return size;
    }

    public boolean c() {
        boolean z2;
        synchronized (this.f23240b) {
            z2 = b() == 0;
        }
        return z2;
    }

    public AppLovinAdImpl d() {
        AppLovinAdImpl appLovinAdImpl;
        synchronized (this.f23240b) {
            appLovinAdImpl = (AppLovinAdImpl) this.f23239a.peek();
        }
        return appLovinAdImpl;
    }

    public void b(AppLovinAdImpl appLovinAdImpl) {
        synchronized (this.f23240b) {
            this.f23239a.remove(appLovinAdImpl);
        }
    }

    public AppLovinAdImpl a() {
        AppLovinAdImpl appLovinAdImpl;
        synchronized (this.f23240b) {
            try {
                appLovinAdImpl = !c() ? (AppLovinAdImpl) this.f23239a.poll() : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        return appLovinAdImpl;
    }
}
