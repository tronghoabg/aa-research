package com.google.d.f.b.a;

import com.google.d.f.b.r;
import java.util.Set;
import java.util.logging.Level;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class l implements c {

    /* renamed from: a, reason: collision with root package name */
    private final Level f7714a;

    /* renamed from: b, reason: collision with root package name */
    private final Set f7715b;

    /* renamed from: c, reason: collision with root package name */
    private final r f7716c;

    /* renamed from: d, reason: collision with root package name */
    private final int f7717d;

    /* synthetic */ l() {
        this(2, Level.ALL, n.f7722a, n.f7723b);
    }

    @Override // com.google.d.f.b.a.c
    public final com.google.d.f.b.g a(String str) {
        return new n(str, 2, this.f7714a, this.f7715b, this.f7716c);
    }

    public final l b() {
        return new l(2, Level.OFF, this.f7715b, this.f7716c);
    }

    private l(int i2, Level level, Set set, r rVar) {
        this.f7717d = 2;
        this.f7714a = level;
        this.f7715b = set;
        this.f7716c = rVar;
    }
}
