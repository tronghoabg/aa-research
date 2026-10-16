package com.waze.f.a;

import android.os.Handler;
import android.os.SystemClock;
import androidx.camera.video.AudioStats;
import java.lang.reflect.Method;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    static final Handler f23761a = new Handler();

    /* renamed from: b, reason: collision with root package name */
    a f23762b;

    /* renamed from: c, reason: collision with root package name */
    Method f23763c;

    /* renamed from: d, reason: collision with root package name */
    boolean f23764d;

    /* renamed from: e, reason: collision with root package name */
    long f23765e;

    /* renamed from: f, reason: collision with root package name */
    int f23766f;

    /* renamed from: g, reason: collision with root package name */
    double f23767g;

    /* renamed from: h, reason: collision with root package name */
    double f23768h;

    /* renamed from: i, reason: collision with root package name */
    boolean f23769i;

    /* renamed from: j, reason: collision with root package name */
    final b f23770j;

    /* renamed from: k, reason: collision with root package name */
    final String f23771k = String.valueOf(System.currentTimeMillis());

    /* renamed from: l, reason: collision with root package name */
    c f23772l;

    public d(b bVar) {
        this.f23770j = bVar;
    }

    static a a(Class cls) {
        try {
            return (a) cls.newInstance();
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
            return null;
        } catch (InstantiationException e3) {
            e3.printStackTrace();
            return null;
        }
    }

    public final void b(Class cls, double d2, int i2) throws NoSuchMethodException, SecurityException {
        if (this.f23764d) {
            return;
        }
        a aVarA = a(cls);
        this.f23762b = aVarA;
        if (aVarA == null) {
            return;
        }
        Method method = null;
        try {
            Class<?> cls2 = aVarA.getClass();
            Class<?> cls3 = Double.TYPE;
            method = cls2.getMethod("easeOut", cls3, cls3, cls3, cls3);
        } catch (NoSuchMethodException e2) {
            e2.printStackTrace();
        } catch (SecurityException e3) {
            e3.printStackTrace();
        }
        this.f23763c = method;
        if (method != null) {
            boolean z = d2 < AudioStats.AUDIO_AMPLITUDE_NONE;
            this.f23769i = z;
            if (z) {
                this.f23767g = d2;
                this.f23768h = AudioStats.AUDIO_AMPLITUDE_NONE;
            } else {
                this.f23767g = AudioStats.AUDIO_AMPLITUDE_NONE;
                this.f23768h = d2;
            }
            this.f23766f = i2;
            this.f23765e = SystemClock.uptimeMillis();
            this.f23764d = true;
            this.f23772l = new c(this);
            f23761a.postAtTime(this.f23772l, this.f23771k, SystemClock.uptimeMillis() + 16);
        }
    }
}
