package com.waze.sound;

import android.content.IntentFilter;
import android.provider.Settings;
import androidx.media3.datasource.cache.SimpleCache;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class kd extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f40361a;

    /* renamed from: b, reason: collision with root package name */
    private /* synthetic */ Object f40362b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f40363c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    kd(cf cfVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f40363c = i2;
        this.f40361a = cfVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f40363c;
        Object obj2 = this.f40361a;
        if (i2 != 0) {
            kd kdVar = new kd((cf) obj2, eVar, 1);
            kdVar.f40362b = obj;
            return kdVar;
        }
        kd kdVar2 = new kd((ke) obj2, eVar, 0);
        kdVar2.f40362b = obj;
        return kdVar2;
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return this.f40363c != 0 ? ((kd) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((kd) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        SimpleCache simpleCacheE;
        Object objA;
        if (this.f40363c == 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            e.b.c.b(obj);
            kotlinx.coroutines.af afVar = (kotlinx.coroutines.af) this.f40362b;
            Object obj2 = this.f40361a;
            synchronized (afVar) {
                simpleCacheE = ((ke) obj2).f40369f;
                if (simpleCacheE == null) {
                    simpleCacheE = ke.e((ke) obj2, ((ke) obj2).f40364a);
                    ((ke) obj2).f40369f = simpleCacheE;
                    if (((ke) obj2).f40368e.getVoiceInfraStatSendingEnabled()) {
                        kotlinx.coroutines.aj.z(((ke) obj2).f40372i, null, null, new fy((ke) obj2, simpleCacheE, (h.c.e) null, 2), 3);
                    }
                }
            }
            return simpleCacheE;
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        e.b.c.b(obj);
        Object obj3 = this.f40361a;
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
            intentFilter.addAction("android.media.RINGER_MODE_CHANGED");
            intentFilter.addAction("android.media.STREAM_MUTE_CHANGED_ACTION");
            intentFilter.addAction("android.media.MASTER_MUTE_CHANGED_ACTION");
            intentFilter.addAction("android.media.ACTION_SCO_AUDIO_STATE_UPDATED");
            ((cf) obj3).f39649a.registerReceiver(((cf) obj3).f39655g, intentFilter);
            ((cf) obj3).f39649a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, ((cf) obj3).f39656h);
            objA = h.ab.f48028a;
        } catch (Throwable th) {
            objA = e.b.c.a(th);
        }
        Object obj4 = this.f40361a;
        Throwable thC = h.m.c(objA);
        if (thC != null) {
            com.waze.shared_infra.i.h.d("MediaVolumeRepository", "couldn't register observers: ".concat(String.valueOf(thC.getMessage())));
            ((cf) obj4).f39650b.a(thC, null);
        }
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    kd(ke keVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f40363c = i2;
        this.f40361a = keVar;
    }
}
