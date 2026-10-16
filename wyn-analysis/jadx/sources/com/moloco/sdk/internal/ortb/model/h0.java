package com.moloco.sdk.internal.ortb.model;

import Wf.AbstractC1240b0;
import com.applovin.shadow.okio.Segment;
import com.moloco.sdk.internal.ortb.model.C1911z;
import org.jetbrains.annotations.NotNull;

@Sf.e
/* loaded from: classes4.dex */
public final class h0 {

    @NotNull
    public static final C1911z.b Companion = new C1911z.b();

    /* renamed from: a, reason: collision with root package name */
    public final C1894h f28820a;

    /* renamed from: b, reason: collision with root package name */
    public final C1894h f28821b;

    /* renamed from: c, reason: collision with root package name */
    public final C1888b f28822c;

    /* renamed from: d, reason: collision with root package name */
    public final f0 f28823d;

    /* renamed from: e, reason: collision with root package name */
    public final A f28824e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f28825f;

    /* renamed from: g, reason: collision with root package name */
    public final C1903q f28826g;

    /* renamed from: h, reason: collision with root package name */
    public final C1896j f28827h;

    /* renamed from: i, reason: collision with root package name */
    public final F f28828i;

    /* renamed from: j, reason: collision with root package name */
    public final D f28829j;
    public final C1899m k;

    /* renamed from: l, reason: collision with root package name */
    public final C1901o f28830l;

    /* renamed from: m, reason: collision with root package name */
    public final Z f28831m;

    public h0(int i5, C1894h c1894h, C1894h c1894h2, C1888b c1888b, f0 f0Var, A a5, boolean z2, C1903q c1903q, C1896j c1896j, F f10, D d3, C1899m c1899m, C1901o c1901o, Z z10) {
        if (42 != (i5 & 42)) {
            AbstractC1240b0.k(i5, 42, g0.f28811b);
            throw null;
        }
        if ((i5 & 1) == 0) {
            this.f28820a = null;
        } else {
            this.f28820a = c1894h;
        }
        this.f28821b = c1894h2;
        if ((i5 & 4) == 0) {
            this.f28822c = null;
        } else {
            this.f28822c = c1888b;
        }
        this.f28823d = f0Var;
        if ((i5 & 16) == 0) {
            this.f28824e = null;
        } else {
            this.f28824e = a5;
        }
        this.f28825f = z2;
        if ((i5 & 64) == 0) {
            this.f28826g = null;
        } else {
            this.f28826g = c1903q;
        }
        if ((i5 & 128) == 0) {
            this.f28827h = null;
        } else {
            this.f28827h = c1896j;
        }
        if ((i5 & 256) == 0) {
            this.f28828i = null;
        } else {
            this.f28828i = f10;
        }
        if ((i5 & 512) == 0) {
            this.f28829j = null;
        } else {
            this.f28829j = d3;
        }
        if ((i5 & Segment.SHARE_MINIMUM) == 0) {
            this.k = null;
        } else {
            this.k = c1899m;
        }
        if ((i5 & 2048) == 0) {
            this.f28830l = null;
        } else {
            this.f28830l = c1901o;
        }
        if ((i5 & 4096) == 0) {
            this.f28831m = null;
        } else {
            this.f28831m = z10;
        }
    }

    public h0(C1894h c1894h, C1894h c1894h2, C1888b c1888b, f0 f0Var, C1903q c1903q) {
        this.f28820a = c1894h;
        this.f28821b = c1894h2;
        this.f28822c = c1888b;
        this.f28823d = f0Var;
        this.f28824e = null;
        this.f28825f = true;
        this.f28826g = c1903q;
        this.f28827h = null;
        this.f28828i = null;
        this.f28829j = null;
        this.k = null;
        this.f28830l = null;
        this.f28831m = null;
    }
}
