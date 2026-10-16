package com.waze.sound;

import android.content.Context;
import android.os.Looper;
import androidx.media3.database.StandaloneDatabaseProvider;
import androidx.media3.datasource.cache.Cache;
import androidx.media3.datasource.cache.NoOpCacheEvictor;
import androidx.media3.datasource.cache.SimpleCache;
import java.io.File;
import java.io.IOException;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ke implements kc {

    /* renamed from: a, reason: collision with root package name */
    private final Context f40364a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.i.b f40365b;

    /* renamed from: c, reason: collision with root package name */
    private final kotlinx.coroutines.ab f40366c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.sound.f.j f40367d;

    /* renamed from: e, reason: collision with root package name */
    private final em f40368e;

    /* renamed from: f, reason: collision with root package name */
    private volatile SimpleCache f40369f;

    /* renamed from: g, reason: collision with root package name */
    private File f40370g;

    /* renamed from: h, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f40371h;

    /* renamed from: i, reason: collision with root package name */
    private final kotlinx.coroutines.af f40372i;

    public ke(Context context, com.waze.shared_infra.i.g gVar, com.waze.shared_infra.i.b bVar, kotlinx.coroutines.ab abVar, com.waze.sound.f.j jVar, em emVar) {
        h.g.b.x.f(context, "applicationContext");
        h.g.b.x.f(gVar, "loggerProvider");
        h.g.b.x.f(bVar, "exceptionReporter");
        h.g.b.x.f(abVar, "ioDispatcher");
        h.g.b.x.f(jVar, "voiceStatsSender");
        h.g.b.x.f(emVar, "soundConfig");
        this.f40364a = context;
        this.f40365b = bVar;
        this.f40366c = abVar;
        this.f40367d = jVar;
        this.f40368e = emVar;
        com.waze.shared_infra.i.e eVarA = gVar.a(new com.waze.shared_infra.i.c("VoicesFileCacheProvider"));
        h.g.b.x.e(eVarA, "provide(...)");
        this.f40371h = eVarA;
        this.f40372i = kotlinx.coroutines.aj.e(abVar);
    }

    public static final /* synthetic */ SimpleCache e(ke keVar, Context context) {
        File filesDir;
        if (h.g.b.x.n(Thread.currentThread(), Looper.getMainLooper().getThread())) {
            keVar.f40365b.a(new Exception("The voices cache initialization was invoked on the main thread. It may have been accessed prior to its initialization in the loading screen"), null);
        }
        StandaloneDatabaseProvider standaloneDatabaseProvider = new StandaloneDatabaseProvider(context);
        try {
            filesDir = keVar.f40370g;
            if (filesDir == null) {
                filesDir = context.getExternalFilesDir(null);
                if (filesDir == null) {
                    filesDir = context.getFilesDir();
                    h.g.b.x.e(filesDir, "getFilesDir(...)");
                }
                keVar.f40370g = filesDir;
            }
        } catch (IOException e2) {
            com.waze.settings.tree.c.f.e(keVar.f40371h, "Error getting download directory", e2);
            filesDir = context.getFilesDir();
        }
        return new SimpleCache(new File(filesDir, "downloads/voice_files"), new NoOpCacheEvictor(), standaloneDatabaseProvider);
    }

    @Override // com.waze.sound.kc
    public final Cache a() {
        return this.f40369f;
    }

    @Override // com.waze.sound.kc
    public final Object b(h.c.e eVar) {
        SimpleCache simpleCache = this.f40369f;
        return simpleCache != null ? simpleCache : kotlinx.coroutines.aj.v(this.f40366c, new kd(this, (h.c.e) null, 0), eVar);
    }

    @Override // com.waze.sound.kc
    public final Object c(h.c.e eVar) {
        Object objV = kotlinx.coroutines.aj.v(this.f40366c, new bi(this, (h.c.e) null, 15), eVar);
        return objV == h.c.a.a.f48038a ? objV : h.ab.f48028a;
    }
}
