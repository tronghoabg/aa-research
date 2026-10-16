package com.waze.sound;

import android.content.Context;
import android.media.AudioManager;
import androidx.core.content.ContextCompat;
import com.waze.config.ConfigValues;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class es implements fm {

    /* renamed from: b, reason: collision with root package name */
    private final cj f39947b;

    /* renamed from: c, reason: collision with root package name */
    private final bs f39948c;

    /* renamed from: d, reason: collision with root package name */
    private final p f39949d;

    /* renamed from: e, reason: collision with root package name */
    private final fc f39950e;

    /* renamed from: f, reason: collision with root package name */
    private final em f39951f;

    /* renamed from: g, reason: collision with root package name */
    private final gf f39952g;

    /* renamed from: h, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f39953h;

    /* renamed from: i, reason: collision with root package name */
    private final com.waze.shared_infra.i.b f39954i;

    /* renamed from: j, reason: collision with root package name */
    private final kotlinx.coroutines.ab f39955j;

    /* renamed from: k, reason: collision with root package name */
    private final kotlinx.coroutines.ab f39956k;

    /* renamed from: l, reason: collision with root package name */
    private final AudioManager f39957l;
    private gb m;

    public es(Context context, cj cjVar, bs bsVar, p pVar, fc fcVar, em emVar, gf gfVar, com.waze.shared_infra.i.e eVar, com.waze.shared_infra.i.b bVar, kotlinx.coroutines.ab abVar, kotlinx.coroutines.ab abVar2) {
        h.g.b.x.f(context, "applicationContext");
        h.g.b.x.f(cjVar, "playerFactory");
        h.g.b.x.f(bsVar, "guidanceModeRepository");
        h.g.b.x.f(pVar, "audioFocusManager");
        h.g.b.x.f(fcVar, "soundOutputRoutingManager");
        h.g.b.x.f(emVar, "soundConfig");
        h.g.b.x.f(gfVar, "soundPlayerStatSender");
        h.g.b.x.f(eVar, "logger");
        h.g.b.x.f(bVar, "exceptionReporter");
        h.g.b.x.f(abVar, "ioDispatcher");
        h.g.b.x.f(abVar2, "mainDispatcher");
        this.f39947b = cjVar;
        this.f39948c = bsVar;
        this.f39949d = pVar;
        this.f39950e = fcVar;
        this.f39951f = emVar;
        this.f39952g = gfVar;
        this.f39953h = eVar;
        this.f39954i = bVar;
        this.f39955j = abVar;
        this.f39956k = abVar2;
        Object systemService = ContextCompat.getSystemService(context, AudioManager.class);
        if (systemService == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        this.f39957l = (AudioManager) systemService;
        kotlinx.coroutines.aj.e(abVar2);
    }

    private final void h() {
        if (this.m == null) {
            this.f39953h.b("SoundPlayer was accessed before initialization, the invocation will be ignored.");
        }
    }

    private final void i(gj gjVar) {
        h();
        gb gbVar = this.m;
        if (gbVar != null) {
            gbVar.m(gjVar);
        }
    }

    public final void a() {
        com.waze.shared_infra.i.e eVar = this.f39953h;
        eVar.a("Initializing player.");
        com.waze.main_screen.ag.a.c cVar = new com.waze.main_screen.ag.a.c(this.f39951f);
        com.waze.shared_infra.i.b bVar = this.f39954i;
        kotlinx.coroutines.ab abVar = this.f39955j;
        kotlinx.coroutines.ab abVar2 = this.f39956k;
        gb gbVar = new gb(this.f39947b, this.f39949d, this.f39950e, this.f39957l, this.f39948c, cVar, this.f39952g, eVar, bVar, abVar, abVar2);
        gbVar.n();
        this.m = gbVar;
    }

    @Override // com.waze.sound.fm
    public final void b() {
        h();
        gb gbVar = this.m;
        if (gbVar != null) {
            gbVar.o();
        }
    }

    @Override // com.waze.sound.fm
    public final void c(String str, String str2, boolean z, boolean z2, h.g.a.a aVar) {
        h.g.b.x.f(str, "filePath");
        h.g.b.x.f(aVar, "onPlayCompleted");
        i(new gh(str, str2, z, z2, aVar));
    }

    @Override // com.waze.sound.fm
    public final void d(int i2) {
        h();
        this.f39953h.a("Setting media player volume to: " + i2);
        if (this.m != null) {
            ConfigValues.CONFIG_VALUE_SOUND_PROMPTS_VOLUME_ANDROID.d(Long.valueOf(i2));
        }
    }

    @Override // com.waze.sound.fm
    public final void e() {
        h();
        gb gbVar = this.m;
        if (gbVar != null) {
            gbVar.p();
        }
    }

    @Override // com.waze.sound.fm
    public final void f() {
        h();
        gb gbVar = this.m;
        if (gbVar != null) {
            gbVar.q();
        }
    }

    @Override // com.waze.sound.fm
    public final void g(String str, String str2, h.g.a.a aVar) {
        h.g.b.x.f(str, "url");
        h.g.b.x.f(str2, "cacheKey");
        h.g.b.x.f(aVar, "onPlayCompleted");
        i(new gi(str, str2, aVar));
    }
}
