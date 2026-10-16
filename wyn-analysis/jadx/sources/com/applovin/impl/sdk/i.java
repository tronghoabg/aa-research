package com.applovin.impl.sdk;

import E5.RunnableC0443c;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.sdk.AppLovinSdkUtils;
import com.unity3d.services.core.device.MimeTypes;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class i extends BroadcastReceiver implements AppLovinBroadcastManager.Receiver {

    /* renamed from: h, reason: collision with root package name */
    public static int f22975h = -1;

    /* renamed from: i, reason: collision with root package name */
    private static final Float f22976i = Float.valueOf(15.0f);

    /* renamed from: a, reason: collision with root package name */
    private final AudioManager f22977a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f22978b;

    /* renamed from: c, reason: collision with root package name */
    private final k f22979c;

    /* renamed from: d, reason: collision with root package name */
    private final Set f22980d = new HashSet();

    /* renamed from: e, reason: collision with root package name */
    private final Object f22981e = new Object();

    /* renamed from: f, reason: collision with root package name */
    private boolean f22982f;

    /* renamed from: g, reason: collision with root package name */
    private int f22983g;

    public interface a {
        void a(int i5);
    }

    public i(k kVar) {
        this.f22979c = kVar;
        Context contextO = k.o();
        this.f22978b = contextO;
        this.f22977a = (AudioManager) contextO.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
    }

    public static boolean a(int i5) {
        return i5 == 0 || i5 == 1;
    }

    private void d() {
        this.f22979c.O();
        if (o.a()) {
            this.f22979c.O().a("AudioSessionManager", "Observing ringer mode...");
        }
        this.f22983g = f22975h;
        this.f22978b.registerReceiver(this, new IntentFilter("android.media.RINGER_MODE_CHANGED"));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
    }

    private void e() {
        this.f22979c.O();
        if (o.a()) {
            this.f22979c.O().a("AudioSessionManager", "Stopping observation of mute switch state...");
        }
        this.f22978b.unregisterReceiver(this);
        AppLovinBroadcastManager.unregisterReceiver(this);
    }

    public int c() {
        return this.f22977a.getRingerMode();
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if ("android.media.RINGER_MODE_CHANGED".equals(intent.getAction())) {
            b(this.f22977a.getRingerMode());
        }
    }

    private Float a() {
        if (this.f22977a == null) {
            return f22976i;
        }
        try {
            return Float.valueOf(r0.getStreamMaxVolume(3));
        } catch (Throwable th) {
            this.f22979c.O();
            if (o.a()) {
                this.f22979c.O().a("AudioSessionManager", "Unable to collect the maximum device volume", th);
            }
            return f22976i;
        }
    }

    public Float b() {
        if (this.f22977a == null) {
            return null;
        }
        try {
            return Float.valueOf(r0.getStreamVolume(3) / a().floatValue());
        } catch (Throwable th) {
            this.f22979c.O();
            if (o.a()) {
                this.f22979c.O().a("AudioSessionManager", "Unable to collect device volume", th);
            }
            return null;
        }
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            this.f22982f = true;
            this.f22983g = this.f22977a.getRingerMode();
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            this.f22982f = false;
            if (this.f22983g != this.f22977a.getRingerMode()) {
                this.f22983g = f22975h;
                b(this.f22977a.getRingerMode());
            }
        }
    }

    public void b(a aVar) {
        synchronized (this.f22981e) {
            try {
                if (this.f22980d.contains(aVar)) {
                    this.f22980d.remove(aVar);
                    if (this.f22980d.isEmpty()) {
                        e();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(a aVar) {
        synchronized (this.f22981e) {
            try {
                if (this.f22980d.contains(aVar)) {
                    return;
                }
                this.f22980d.add(aVar);
                if (this.f22980d.size() == 1) {
                    d();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void b(int i5) {
        if (this.f22982f) {
            return;
        }
        this.f22979c.O();
        if (o.a()) {
            this.f22979c.O().a("AudioSessionManager", "Ringer mode is " + i5);
        }
        synchronized (this.f22981e) {
            try {
                Iterator it = this.f22980d.iterator();
                while (it.hasNext()) {
                    AppLovinSdkUtils.runOnUiThread(new RunnableC0443c((a) it.next(), i5, 5));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
