package com.waze.an.a;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.waze.AlerterController$Alerter$Type;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private final AlerterController$Alerter$Type f14594a;

    /* renamed from: b, reason: collision with root package name */
    private final int f14595b;

    /* renamed from: c, reason: collision with root package name */
    private final long f14596c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f14597d;

    /* renamed from: e, reason: collision with root package name */
    private final String f14598e;

    public m(AlerterController$Alerter$Type alerterController$Alerter$Type, int i2, long j2, boolean z, String str) {
        h.g.b.x.f(alerterController$Alerter$Type, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        h.g.b.x.f(str, "uuid");
        this.f14594a = alerterController$Alerter$Type;
        this.f14595b = i2;
        this.f14596c = j2;
        this.f14597d = z;
        this.f14598e = str;
    }

    public final int a() {
        return this.f14595b;
    }

    public final long b() {
        return this.f14596c;
    }

    public final AlerterController$Alerter$Type c() {
        return this.f14594a;
    }

    public final String d() {
        return this.f14598e;
    }

    public final boolean e() {
        return this.f14597d;
    }
}
