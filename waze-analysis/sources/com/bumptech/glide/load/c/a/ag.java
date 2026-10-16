package com.bumptech.glide.load.c.a;

import android.util.Log;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ag {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f3295a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final File f3296b = new File("/proc/self/fd");

    /* renamed from: c, reason: collision with root package name */
    private static volatile ag f3297c;

    /* renamed from: d, reason: collision with root package name */
    private int f3298d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f3299e = true;

    ag() {
        new AtomicBoolean(false);
    }

    public static ag a() {
        if (f3297c == null) {
            synchronized (ag.class) {
                if (f3297c == null) {
                    f3297c = new ag();
                }
            }
        }
        return f3297c;
    }

    private final synchronized boolean c() {
        boolean z = true;
        int i2 = this.f3298d + 1;
        this.f3298d = i2;
        if (i2 >= 50) {
            this.f3298d = 0;
            int length = f3296b.list().length;
            if (length >= 20000) {
                z = false;
            }
            this.f3299e = z;
            if (!z && Log.isLoggable("Downsampler", 5)) {
                Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit 20000");
            }
        }
        return this.f3299e;
    }

    public final boolean b(int i2, int i3, boolean z, boolean z2) {
        if (!z) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by caller");
            }
            return false;
        }
        if (z2) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed because exif orientation is required");
            }
            return false;
        }
        if (i2 < 0 || i3 < 0) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed because of invalid dimensions");
            }
            return false;
        }
        if (c()) {
            return true;
        }
        if (Log.isLoggable("HardwareConfig", 2)) {
            Log.v("HardwareConfig", "Hardware config disallowed because there are insufficient FDs");
        }
        return false;
    }
}
