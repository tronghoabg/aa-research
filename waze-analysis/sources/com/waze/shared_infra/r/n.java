package com.waze.shared_infra.r;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.waze.settings.ao;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class n extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f37979a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final h.f f37980b = h.g.a(new ao(7));

    /* renamed from: c, reason: collision with root package name */
    private final h.f f37981c;

    /* renamed from: d, reason: collision with root package name */
    private final HashSet f37982d;

    public n(Context context) {
        h.g.b.x.f(context, "context");
        this.f37981c = h.g.a(new com.waze.bk.f(context, 13));
        this.f37982d = new HashSet();
    }

    public final void b() {
        String[] strArr = {"ACTION_USER_LOGIN", "ACTION_USER_LOGOUT", "ACTION_ENV_SWITCH", "ACTION_USER_CREDENTIALS_CHANGED"};
        for (int i2 = 0; i2 < 4; i2++) {
            String str = strArr[i2];
            Object value = this.f37981c.getValue();
            h.g.b.x.e(value, "getValue(...)");
            ((LocalBroadcastManager) value).registerReceiver(this, new IntentFilter(str));
        }
    }

    public final void c(WeakReference weakReference) {
        h.g.b.x.f(weakReference, "listener");
        this.f37982d.add(weakReference);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action;
        if (intent == null || (action = intent.getAction()) == null) {
            return;
        }
        switch (action.hashCode()) {
            case -1170042737:
                if (action.equals("ACTION_ENV_SWITCH")) {
                    com.waze.shared_infra.q.m.b().a("User logged out");
                    Iterator it = this.f37982d.iterator();
                    while (it.hasNext()) {
                        m mVar = (m) ((WeakReference) it.next()).get();
                        if (mVar != null) {
                            mVar.a();
                        }
                    }
                    break;
                }
                break;
            case -349992971:
                if (action.equals("ACTION_USER_LOGOUT")) {
                    com.waze.shared_infra.q.m.b().a("User logged out");
                    boolean booleanExtra = intent.getBooleanExtra("ACTION_USER_LOGOUT_PARAMETER_SIGN_UP_ENABLED", true);
                    Iterator it2 = this.f37982d.iterator();
                    while (it2.hasNext()) {
                        m mVar2 = (m) ((WeakReference) it2.next()).get();
                        if (mVar2 != null) {
                            mVar2.c(booleanExtra);
                        }
                    }
                    break;
                }
                break;
            case 967063462:
                if (action.equals("ACTION_USER_CREDENTIALS_CHANGED")) {
                    com.waze.shared_infra.q.m.b().a("User credentials changed");
                    Iterator it3 = this.f37982d.iterator();
                    while (it3.hasNext()) {
                        m mVar3 = (m) ((WeakReference) it3.next()).get();
                        if (mVar3 != null) {
                            mVar3.d();
                        }
                    }
                    break;
                }
                break;
            case 1651277694:
                if (action.equals("ACTION_USER_LOGIN")) {
                    com.waze.shared_infra.q.m.b().a("User logged in");
                    Iterator it4 = this.f37982d.iterator();
                    while (it4.hasNext()) {
                        m mVar4 = (m) ((WeakReference) it4.next()).get();
                        if (mVar4 != null) {
                            mVar4.b();
                        }
                    }
                    break;
                }
                break;
        }
    }
}
