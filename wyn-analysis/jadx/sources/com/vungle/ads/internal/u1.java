package com.vungle.ads.internal;

import android.content.Context;
import com.vungle.ads.internal.model.i3;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class u1 extends b1 implements com.vungle.ads.internal.presenter.z {

    /* renamed from: r, reason: collision with root package name */
    public String f33710r;

    /* renamed from: s, reason: collision with root package name */
    public String f33711s;

    /* renamed from: t, reason: collision with root package name */
    public String f33712t;

    /* renamed from: u, reason: collision with root package name */
    public String f33713u;

    /* renamed from: v, reason: collision with root package name */
    public String f33714v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(Context context) {
        super(context);
        AbstractC3340k.e(context, "context");
    }

    public final void a(String str) {
        this.f33711s = str;
    }

    public final void b(String str) {
        this.f33712t = str;
    }

    public final void c(String str) {
        this.f33713u = str;
    }

    public final void d(String str) {
        this.f33710r = str;
    }

    public final void e(String str) {
        this.f33714v = str;
    }

    @Override // com.vungle.ads.internal.b1
    public final com.vungle.ads.internal.presenter.z m() {
        return this;
    }

    public final String n() {
        return this.f33711s;
    }

    public final String o() {
        return this.f33712t;
    }

    public final String p() {
        return this.f33713u;
    }

    public final String q() {
        return this.f33710r;
    }

    public final String r() {
        return this.f33714v;
    }

    @Override // com.vungle.ads.internal.s
    public final boolean a(i3 placement) {
        AbstractC3340k.e(placement, "placement");
        return placement.j();
    }
}
