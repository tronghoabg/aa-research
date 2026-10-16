package com.google.firebase.iid;

import com.google.android.gms.f.v;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final Executor f9930a = new v(2);

    static Executor a() {
        return f9930a;
    }

    static ExecutorService b() {
        return new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new com.google.android.gms.common.util.a.b("firebase-iid-executor"));
    }
}
