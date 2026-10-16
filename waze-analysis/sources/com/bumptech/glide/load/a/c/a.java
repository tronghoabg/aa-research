package com.bumptech.glide.load.a.c;

import android.text.TextUtils;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f3105a;

    /* renamed from: b, reason: collision with root package name */
    private int f3106b;

    /* renamed from: c, reason: collision with root package name */
    private int f3107c;

    /* renamed from: d, reason: collision with root package name */
    private final ThreadFactory f3108d = new c();

    /* renamed from: e, reason: collision with root package name */
    private String f3109e;

    a(boolean z) {
        this.f3105a = z;
    }

    public final f a() {
        if (TextUtils.isEmpty(this.f3109e)) {
            throw new IllegalArgumentException("Name must be non-null and non-empty, but given: ".concat(String.valueOf(this.f3109e)));
        }
        return new f(new ThreadPoolExecutor(this.f3106b, this.f3107c, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new e(this.f3108d, this.f3109e, this.f3105a)));
    }

    public final void b(String str) {
        this.f3109e = str;
    }

    public final void c(int i2) {
        this.f3106b = i2;
        this.f3107c = i2;
    }
}
