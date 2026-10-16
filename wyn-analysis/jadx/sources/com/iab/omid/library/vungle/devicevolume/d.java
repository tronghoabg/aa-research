package com.iab.omid.library.vungle.devicevolume;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;
import com.unity3d.services.core.device.MimeTypes;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public final class d extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f28127a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f28128b;

    /* renamed from: c, reason: collision with root package name */
    private final AudioManager f28129c;

    /* renamed from: d, reason: collision with root package name */
    private final com.iab.omid.library.vungle.devicevolume.a f28130d;

    /* renamed from: e, reason: collision with root package name */
    private final c f28131e;

    /* renamed from: f, reason: collision with root package name */
    private final AtomicReference<Float> f28132f;

    /* renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f28133g;

    /* renamed from: h, reason: collision with root package name */
    private final ExecutorService f28134h;

    public class a implements Runnable {

        /* renamed from: com.iab.omid.library.vungle.devicevolume.d$a$a, reason: collision with other inner class name */
        public class RunnableC0161a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ float f28136a;

            public RunnableC0161a(float f10) {
                this.f28136a = f10;
            }

            @Override // java.lang.Runnable
            public void run() {
                d.this.f28131e.a(this.f28136a);
            }
        }

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            float fA = d.this.a();
            d.this.f28133g.set(false);
            if (((Float) d.this.f28132f.getAndSet(Float.valueOf(fA))).floatValue() != fA) {
                d.this.f28127a.post(new RunnableC0161a(fA));
            }
        }
    }

    public d(Handler handler, Context context, com.iab.omid.library.vungle.devicevolume.a aVar, c cVar) {
        super(handler);
        this.f28132f = new AtomicReference<>(Float.valueOf(-1.0f));
        this.f28133g = new AtomicBoolean(false);
        this.f28134h = Executors.newSingleThreadExecutor();
        this.f28127a = handler;
        this.f28128b = context;
        this.f28129c = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        this.f28130d = aVar;
        this.f28131e = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float a() {
        return this.f28130d.a(this.f28129c.getStreamVolume(3), this.f28129c.getStreamMaxVolume(3));
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z2) {
        if (this.f28133g.getAndSet(true)) {
            return;
        }
        d();
    }

    private void d() {
        this.f28134h.submit(new a());
    }

    public void b() {
        d();
        this.f28128b.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void c() {
        this.f28128b.getContentResolver().unregisterContentObserver(this);
    }
}
