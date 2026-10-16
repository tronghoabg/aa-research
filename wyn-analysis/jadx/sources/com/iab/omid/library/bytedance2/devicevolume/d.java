package com.iab.omid.library.bytedance2.devicevolume;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;
import com.unity3d.services.core.device.MimeTypes;

/* loaded from: classes4.dex */
public final class d extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    private final Context f27981a;

    /* renamed from: b, reason: collision with root package name */
    private final AudioManager f27982b;

    /* renamed from: c, reason: collision with root package name */
    private final a f27983c;

    /* renamed from: d, reason: collision with root package name */
    private final c f27984d;

    /* renamed from: e, reason: collision with root package name */
    private float f27985e;

    public d(Handler handler, Context context, a aVar, c cVar) {
        super(handler);
        this.f27981a = context;
        this.f27982b = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        this.f27983c = aVar;
        this.f27984d = cVar;
    }

    private float a() {
        return this.f27983c.a(this.f27982b.getStreamVolume(3), this.f27982b.getStreamMaxVolume(3));
    }

    private void b() {
        this.f27984d.a(this.f27985e);
    }

    public void c() {
        this.f27985e = a();
        b();
        this.f27981a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void d() {
        this.f27981a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z2) {
        super.onChange(z2);
        float fA = a();
        if (a(fA)) {
            this.f27985e = fA;
            b();
        }
    }

    private boolean a(float f10) {
        return f10 != this.f27985e;
    }
}
