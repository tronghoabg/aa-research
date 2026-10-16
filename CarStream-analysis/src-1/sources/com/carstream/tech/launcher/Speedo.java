package com.carstream.tech.launcher;

import android.content.Context;
import android.content.SharedPreferences;
import android.location.Location;
import android.location.LocationManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import defpackage.ab;
import defpackage.bb;
import defpackage.cb;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public class Speedo {
    private static final float NGUONG_GHI_M = 10.0f;
    private static final String PREF = "speedo";
    private final Listener cb;
    private boolean chay;
    private final Context ctx;
    private String daGhiNgay;
    private Location last;
    private String ngay;
    private final SharedPreferences sp;
    private float tripM;
    private final Handler hUi = new Handler(Looper.getMainLooper());
    private final bb ngheDiem = new bb() { // from class: com.carstream.tech.launcher.Speedo.1
        @Override // defpackage.bb
        public void onLocation(Location location) {
            if (location != null) {
                Speedo.this.nhanDiem(location);
            }
        }
    };
    private float daGhiM = -1.0f;

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    public interface Listener {
        void onSpeed(float f, float f2);
    }

    public Speedo(Context context, Listener listener) {
        Context applicationContext = context.getApplicationContext();
        this.ctx = applicationContext;
        this.cb = listener;
        SharedPreferences sharedPreferences = applicationContext.getSharedPreferences(PREF, 0);
        this.sp = sharedPreferences;
        String strHomNay = homNay();
        this.ngay = strHomNay;
        this.tripM = strHomNay.equals(sharedPreferences.getString("ngay", "")) ? sharedPreferences.getFloat("m", 0.0f) : 0.0f;
    }

    private static String homNay() {
        return new SimpleDateFormat("yyyy-MM-dd", Locale.US).format(new Date());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$nhanDiem$0(float f, float f2) {
        this.cb.onSpeed(f, f2);
    }

    private void luu() {
        if (!this.ngay.equals(this.daGhiNgay) || Math.abs(this.tripM - this.daGhiM) >= NGUONG_GHI_M) {
            this.daGhiM = this.tripM;
            this.daGhiNgay = this.ngay;
            this.sp.edit().putString("ngay", this.ngay).putFloat("m", this.tripM).apply();
        }
    }

    private void luuNgay() {
        this.daGhiM = this.tripM;
        this.daGhiNgay = this.ngay;
        this.sp.edit().putString("ngay", this.ngay).putFloat("m", this.tripM).apply();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void nhanDiem(Location location) {
        if (!homNay().equals(this.ngay)) {
            this.ngay = homNay();
            this.tripM = 0.0f;
            this.last = null;
        }
        final float speed = location.hasSpeed() ? location.getSpeed() * 3.6f : 0.0f;
        if (speed < 3.0f) {
            speed = 0.0f;
        }
        boolean z = !location.hasAccuracy() || location.getAccuracy() < 25.0f;
        Location location2 = this.last;
        if (location2 != null && z && speed > 0.0f) {
            this.tripM = location2.distanceTo(location) + this.tripM;
        }
        if (z) {
            this.last = location;
        }
        luu();
        if (this.cb != null) {
            final float f = this.tripM / 1000.0f;
            this.hUi.post(new Runnable() { // from class: db
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.lambda$nhanDiem$0(speed, f);
                }
            });
        }
    }

    public boolean dangChay() {
        return this.chay;
    }

    public void start() {
        if (this.chay) {
            return;
        }
        this.chay = true;
        try {
            Context context = this.ctx;
            bb bbVar = this.ngheDiem;
            if (bbVar != null) {
                CopyOnWriteArrayList copyOnWriteArrayList = cb.f;
                if (!copyOnWriteArrayList.contains(bbVar)) {
                    copyOnWriteArrayList.add(bbVar);
                    Location location = cb.g;
                    if (location != null) {
                        try {
                            bbVar.onLocation(location);
                        } catch (Exception unused) {
                        }
                    }
                    cb.c(context.getApplicationContext());
                }
            } else {
                HandlerThread handlerThread = cb.a;
            }
        } catch (Throwable unused2) {
        }
        Listener listener = this.cb;
        if (listener != null) {
            listener.onSpeed(-1.0f, this.tripM / 1000.0f);
        }
    }

    public void stop() {
        ab abVar;
        if (this.chay) {
            try {
                bb bbVar = this.ngheDiem;
                CopyOnWriteArrayList copyOnWriteArrayList = cb.f;
                copyOnWriteArrayList.remove(bbVar);
                if (cb.e.isEmpty() && copyOnWriteArrayList.isEmpty()) {
                    LocationManager locationManager = cb.h;
                    if (locationManager != null && (abVar = cb.i) != null) {
                        try {
                            locationManager.removeUpdates(abVar);
                        } catch (Throwable unused) {
                        }
                    }
                    cb.i = null;
                }
            } catch (Throwable unused2) {
            }
            this.chay = false;
            luuNgay();
        }
    }

    public float tripKm() {
        return this.tripM / 1000.0f;
    }
}
