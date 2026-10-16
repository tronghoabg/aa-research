package com.iab.omid.library.applovin.devicevolume;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;
import com.unity3d.services.core.device.MimeTypes;

/* loaded from: classes4.dex */
public final class d extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    private final Context f27848a;

    /* renamed from: b, reason: collision with root package name */
    private final AudioManager f27849b;

    /* renamed from: c, reason: collision with root package name */
    private final a f27850c;

    /* renamed from: d, reason: collision with root package name */
    private final c f27851d;

    /* renamed from: e, reason: collision with root package name */
    private float f27852e;

    public d(Handler handler, Context context, a aVar, c cVar) {
        super(handler);
        this.f27848a = context;
        this.f27849b = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        this.f27850c = aVar;
        this.f27851d = cVar;
    }

    private float a() {
        return this.f27850c.a(this.f27849b.getStreamVolume(3), this.f27849b.getStreamMaxVolume(3));
    }

    private void b() {
        this.f27851d.a(this.f27852e);
    }

    public void c() {
        this.f27852e = a();
        b();
        this.f27848a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void d() {
        this.f27848a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z2) {
        super.onChange(z2);
        float fA = a();
        if (a(fA)) {
            this.f27852e = fA;
            b();
        }
    }

    private boolean a(float f10) {
        return f10 != this.f27852e;
    }
}
