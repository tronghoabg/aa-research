package com.waze.sound;

import android.content.Context;
import androidx.media3.exoplayer.ExoPlayer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class hi extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f40139a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ hl f40140b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ gz f40141c;

    /* renamed from: d, reason: collision with root package name */
    private /* synthetic */ Object f40142d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    hi(hl hlVar, gz gzVar, h.c.e eVar) {
        super(2, eVar);
        this.f40140b = hlVar;
        this.f40141c = gzVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        hi hiVar = new hi(this.f40140b, this.f40141c, eVar);
        hiVar.f40142d = obj;
        return hiVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((hi) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Throwable th;
        kotlinx.coroutines.af afVar;
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f40139a != 0) {
            afVar = (kotlinx.coroutines.af) this.f40142d;
            try {
                e.b.c.b(obj);
            } catch (Throwable th2) {
                th = th2;
                h.g.b.o.l(afVar.getCoroutineContext());
                throw th;
            }
        } else {
            e.b.c.b(obj);
            kotlinx.coroutines.af afVar2 = (kotlinx.coroutines.af) this.f40142d;
            hl hlVar = this.f40140b;
            ha haVarF = hl.f(hlVar);
            ExoPlayer exoPlayerC = hlVar.f40157g;
            if (exoPlayerC == null) {
                Context applicationContext = hlVar.f40151a.getApplicationContext();
                h.g.b.x.e(applicationContext, "getApplicationContext(...)");
                exoPlayerC = hl.c(hlVar, applicationContext);
                hlVar.f40157g = exoPlayerC;
            }
            kotlinx.coroutines.aj.z(afVar2, null, null, new dz(hlVar, exoPlayerC, (h.c.e) null, 4), 3);
            gz gzVar = this.f40141c;
            exoPlayerC.stop();
            gzVar.a(afVar2, exoPlayerC);
            exoPlayerC.prepare();
            exoPlayerC.play();
            try {
                this.f40142d = afVar2;
                this.f40139a = 1;
                Object objG = hl.g(hlVar, haVarF, this);
                if (objG == aVar) {
                    return aVar;
                }
                obj = objG;
                afVar = afVar2;
            } catch (Throwable th3) {
                th = th3;
                afVar = afVar2;
                h.g.b.o.l(afVar.getCoroutineContext());
                throw th;
            }
        }
        com.waze.app_nav.hub.b.m mVar = (com.waze.app_nav.hub.b.m) obj;
        h.g.b.o.l(afVar.getCoroutineContext());
        return mVar;
    }
}
