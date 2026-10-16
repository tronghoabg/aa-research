package com.google.android.material.datepicker;

import android.os.Bundle;
import com.waze.strings.DisplayStrings;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    static final long f6359a = ax.a(aj.h(DisplayStrings.DS_CUSTOM_PROMPT_800_METERS, 0).f6402e);

    /* renamed from: b, reason: collision with root package name */
    static final long f6360b = ax.a(aj.h(DisplayStrings.DS_ALERT_TITLE_ACCIDENT, 11).f6402e);

    /* renamed from: c, reason: collision with root package name */
    private long f6361c;

    /* renamed from: d, reason: collision with root package name */
    private long f6362d;

    /* renamed from: e, reason: collision with root package name */
    private Long f6363e;

    /* renamed from: f, reason: collision with root package name */
    private int f6364f;

    /* renamed from: g, reason: collision with root package name */
    private b f6365g;

    a(c cVar) {
        this.f6361c = f6359a;
        this.f6362d = f6360b;
        this.f6365g = k.b();
        this.f6361c = cVar.f6441a.f6402e;
        this.f6362d = cVar.f6442b.f6402e;
        this.f6363e = Long.valueOf(cVar.f6444d.f6402e);
        this.f6364f = cVar.f6445e;
        this.f6365g = cVar.f6443c;
    }

    public final c a() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("DEEP_COPY_VALIDATOR_KEY", this.f6365g);
        aj ajVarG = aj.g(this.f6361c);
        aj ajVarG2 = aj.g(this.f6362d);
        b bVar = (b) bundle.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l2 = this.f6363e;
        return new c(ajVarG, ajVarG2, bVar, l2 == null ? null : aj.g(l2.longValue()), this.f6364f);
    }

    public final void b(long j2) {
        this.f6363e = Long.valueOf(j2);
    }

    public final void c(b bVar) {
        Objects.requireNonNull(bVar, "validator cannot be null");
        this.f6365g = bVar;
    }

    public a() {
        this.f6361c = f6359a;
        this.f6362d = f6360b;
        this.f6365g = k.b();
    }
}
