package com.waze.search.v2;

import android.content.Intent;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class dh extends com.waze.speech.k {

    /* renamed from: a, reason: collision with root package name */
    private final int f36361a;

    /* renamed from: b, reason: collision with root package name */
    private final Intent f36362b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f36363c;

    public /* synthetic */ dh(int i2, Intent intent, int i3) {
        this(1 == (i3 & 1) ? 0 : i2, (i3 & 2) != 0 ? null : intent, true);
    }

    public final int a() {
        return this.f36361a;
    }

    public final Intent b() {
        return this.f36362b;
    }

    public final boolean c() {
        return this.f36363c;
    }

    public dh(int i2, Intent intent, boolean z) {
        super(null);
        this.f36361a = i2;
        this.f36362b = intent;
        this.f36363c = z;
    }

    public dh() {
        this(0, (Intent) null, 7);
    }
}
