package com.waze.aa;

import com.waze.z.a.d.ai;
import h.g.b.ar;
import h.g.b.m;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class e implements org.a.d.i.a {

    /* renamed from: a, reason: collision with root package name */
    public static final ai f13666a;

    /* renamed from: b, reason: collision with root package name */
    private static final String f13667b;

    /* renamed from: c, reason: collision with root package name */
    private static final AtomicLong f13668c;

    /* renamed from: d, reason: collision with root package name */
    private final String f13669d;

    static {
        ai aiVar = new ai();
        f13666a = aiVar;
        int i2 = ar.f48106a;
        f13667b = new org.a.d.i.c(new m(aiVar.getClass())).a();
        f13668c = new AtomicLong(0L);
    }

    public e() {
        long andIncrement = f13668c.getAndIncrement();
        this.f13669d = f13667b + ":" + andIncrement;
    }

    @Override // org.a.d.i.a
    public final String a() {
        return this.f13669d;
    }
}
