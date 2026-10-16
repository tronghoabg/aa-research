package o2;

import Q1.x;
import S1.z;
import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import k2.C3168z;

/* loaded from: classes.dex */
public final class p implements j {

    /* renamed from: a, reason: collision with root package name */
    public final long f41323a;

    /* renamed from: b, reason: collision with root package name */
    public final S1.k f41324b;

    /* renamed from: c, reason: collision with root package name */
    public final int f41325c;

    /* renamed from: d, reason: collision with root package name */
    public final z f41326d;

    /* renamed from: e, reason: collision with root package name */
    public final o f41327e;

    /* renamed from: f, reason: collision with root package name */
    public volatile Object f41328f;

    public p(S1.h hVar, Uri uri, int i5, o oVar) {
        Map map = Collections.EMPTY_MAP;
        Q1.k.i(uri, "The uri must be set.");
        S1.k kVar = new S1.k(uri, 1, null, map, 0L, -1L, null, 1);
        this.f41326d = new z(hVar);
        this.f41324b = kVar;
        this.f41325c = i5;
        this.f41327e = oVar;
        this.f41323a = C3168z.f39176b.getAndIncrement();
    }

    @Override // o2.j
    public final void load() throws IOException {
        this.f41326d.f10921b = 0L;
        S1.j jVar = new S1.j(this.f41326d, this.f41324b);
        try {
            jVar.f10864a.y(jVar.f10865b);
            jVar.f10867d = true;
            Uri uriK = this.f41326d.f10920a.k();
            uriK.getClass();
            this.f41328f = this.f41327e.t(uriK, jVar);
        } finally {
            x.g(jVar);
        }
    }

    @Override // o2.j
    public final void g() {
    }
}
