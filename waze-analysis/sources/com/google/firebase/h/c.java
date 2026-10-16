package com.google.firebase.h;

import com.b.b.a.n;
import com.b.b.a.x;
import com.b.b.d.o;
import com.b.b.d.p;
import com.b.b.d.s;
import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static volatile c f9903a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f9904b;

    c() {
        this.f9904b = new HashSet();
    }

    public static c a() {
        c cVar;
        c cVar2 = f9903a;
        if (cVar2 != null) {
            return cVar2;
        }
        synchronized (c.class) {
            cVar = f9903a;
            if (cVar == null) {
                cVar = new c();
                f9903a = cVar;
            }
        }
        return cVar;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [com.b.b.a.n, java.lang.Object] */
    private final com.b.b.a.b i(o oVar) {
        return this.f9904b.b("com.spotify.set_playback_speed", oVar, com.b.b.d.c.class);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Set] */
    final Set b() {
        Set setUnmodifiableSet;
        ?? r1 = this.f9904b;
        synchronized (r1) {
            setUnmodifiableSet = DesugarCollections.unmodifiableSet(r1);
        }
        return setUnmodifiableSet;
    }

    public final com.b.b.a.b c() {
        return i(new o(0));
    }

    public final com.b.b.a.b d() {
        return i(new o(1));
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [com.b.b.a.n, java.lang.Object] */
    public final com.b.b.a.b e() {
        return this.f9904b.a("com.spotify.skip_next", com.b.b.d.c.class);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [com.b.b.a.n, java.lang.Object] */
    public final com.b.b.a.b f() {
        return this.f9904b.a("com.spotify.skip_previous", com.b.b.d.c.class);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [com.b.b.a.n, java.lang.Object] */
    public final x g() {
        return this.f9904b.c("com.spotify.current_context", p.class);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [com.b.b.a.n, java.lang.Object] */
    public final x h() {
        return this.f9904b.c("com.spotify.player_state", s.class);
    }

    public c(n nVar) {
        this.f9904b = nVar;
    }
}
