package com.applovin.impl;

import android.content.IntentFilter;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public class g5 {

    /* renamed from: a, reason: collision with root package name */
    private final Set f21597a = new HashSet(32);

    /* renamed from: b, reason: collision with root package name */
    private final Object f21598b = new Object();

    public boolean a(String str) {
        synchronized (this.f21598b) {
            try {
                Iterator it = this.f21597a.iterator();
                while (it.hasNext()) {
                    if (str.equals(((h5) it.next()).b())) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, String str) {
        h5 h5VarA;
        if (StringUtils.isValidString(str)) {
            synchronized (this.f21598b) {
                h5VarA = a(str, appLovinCommunicatorSubscriber);
            }
            if (h5VarA != null) {
                h5VarA.a(false);
                AppLovinBroadcastManager.unregisterReceiver(h5VarA);
            }
        }
    }

    public boolean a(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, String str) {
        if (appLovinCommunicatorSubscriber != null && StringUtils.isValidString(str)) {
            synchronized (this.f21598b) {
                try {
                    h5 h5VarA = a(str, appLovinCommunicatorSubscriber);
                    if (h5VarA != null) {
                        com.applovin.impl.sdk.o.h("AppLovinCommunicator", "Attempting to re-subscribe subscriber (" + appLovinCommunicatorSubscriber + ") to topic (" + str + ")");
                        if (!h5VarA.c()) {
                            h5VarA.a(true);
                            AppLovinBroadcastManager.registerReceiver(h5VarA, new IntentFilter(str));
                        }
                        return true;
                    }
                    h5 h5Var = new h5(str, appLovinCommunicatorSubscriber);
                    this.f21597a.add(h5Var);
                    AppLovinBroadcastManager.registerReceiver(h5Var, new IntentFilter(str));
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        com.applovin.impl.sdk.o.h("AppLovinCommunicator", "Unable to subscribe - invalid subscriber (" + appLovinCommunicatorSubscriber + ") or topic (" + str + ")");
        return false;
    }

    private h5 a(String str, AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber) {
        for (h5 h5Var : this.f21597a) {
            if (str.equals(h5Var.b()) && appLovinCommunicatorSubscriber.equals(h5Var.a())) {
                return h5Var;
            }
        }
        return null;
    }
}
