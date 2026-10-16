package com.iab.omid.library.vungle.internal;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.vungle.internal.d;
import com.iab.omid.library.vungle.walking.TreeWalker;
import com.unity3d.services.UnityAdsConstants;
import java.util.Iterator;

/* loaded from: classes4.dex */
public class i implements d.a, com.iab.omid.library.vungle.devicevolume.c {

    /* renamed from: f, reason: collision with root package name */
    private static i f28163f;

    /* renamed from: a, reason: collision with root package name */
    private float f28164a = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;

    /* renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.vungle.devicevolume.e f28165b;

    /* renamed from: c, reason: collision with root package name */
    private final com.iab.omid.library.vungle.devicevolume.b f28166c;

    /* renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.vungle.devicevolume.d f28167d;

    /* renamed from: e, reason: collision with root package name */
    private c f28168e;

    public i(com.iab.omid.library.vungle.devicevolume.e eVar, com.iab.omid.library.vungle.devicevolume.b bVar) {
        this.f28165b = eVar;
        this.f28166c = bVar;
    }

    private c a() {
        if (this.f28168e == null) {
            this.f28168e = c.c();
        }
        return this.f28168e;
    }

    public static i c() {
        if (f28163f == null) {
            f28163f = new i(new com.iab.omid.library.vungle.devicevolume.e(), new com.iab.omid.library.vungle.devicevolume.b());
        }
        return f28163f;
    }

    public float b() {
        return this.f28164a;
    }

    public void d() {
        b.g().a(this);
        b.g().e();
        TreeWalker.getInstance().h();
        this.f28167d.b();
    }

    public void e() {
        TreeWalker.getInstance().j();
        b.g().f();
        this.f28167d.c();
    }

    @Override // com.iab.omid.library.vungle.devicevolume.c
    public void a(float f10) {
        this.f28164a = f10;
        Iterator<com.iab.omid.library.vungle.adsession.a> it = a().a().iterator();
        while (it.hasNext()) {
            it.next().d().a(f10);
        }
    }

    public void a(Context context) {
        this.f28167d = this.f28165b.a(new Handler(), context, this.f28166c.a(), this);
    }

    @Override // com.iab.omid.library.vungle.internal.d.a
    public void a(boolean z2) {
        if (z2) {
            TreeWalker.getInstance().h();
        } else {
            TreeWalker.getInstance().g();
        }
    }
}
