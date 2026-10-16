package com.bumptech.glide.load.a.b;

import android.content.Context;
import android.util.DisplayMetrics;
import java.io.File;
import java.util.ArrayDeque;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    private final Object f3084a;

    public k(Context context) {
        this.f3084a = new f(context);
    }

    public final int a() {
        return ((DisplayMetrics) this.f3084a).heightPixels;
    }

    public final int b() {
        return ((DisplayMetrics) this.f3084a).widthPixels;
    }

    public final b c() {
        f fVar = (f) this.f3084a;
        File cacheDir = fVar.f3077a.getCacheDir();
        File file = cacheDir == null ? null : new File(cacheDir, fVar.f3078b);
        if (file != null && (file.isDirectory() || file.mkdirs())) {
            return new e(file);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Queue] */
    final d d() {
        d dVar;
        ?? r1 = this.f3084a;
        synchronized (r1) {
            dVar = (d) r1.poll();
        }
        return dVar == null ? new d() : dVar;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Queue] */
    final void e(d dVar) {
        ?? r2 = this.f3084a;
        synchronized (r2) {
            if (r2.size() < 10) {
                r2.offer(dVar);
            }
        }
    }

    k(DisplayMetrics displayMetrics) {
        this.f3084a = displayMetrics;
    }

    k() {
        this.f3084a = new ArrayDeque();
    }
}
