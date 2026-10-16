package com.moloco.sdk.internal.ortb.model;

import Wf.AbstractC1240b0;
import com.moloco.sdk.internal.ortb.model.D;
import e0.C2465q;
import ef.C2537u;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

@Sf.e
/* renamed from: com.moloco.sdk.internal.ortb.model.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1894h {

    @NotNull
    public static final D.b Companion = new D.b();

    /* renamed from: h, reason: collision with root package name */
    public static final KSerializer[] f28812h = {null, null, null, X.Companion.serializer(), EnumC1897k.Companion.serializer(), null, null};

    /* renamed from: a, reason: collision with root package name */
    public final int f28813a;

    /* renamed from: b, reason: collision with root package name */
    public final int f28814b;

    /* renamed from: c, reason: collision with root package name */
    public final int f28815c;

    /* renamed from: d, reason: collision with root package name */
    public final X f28816d;

    /* renamed from: e, reason: collision with root package name */
    public final EnumC1897k f28817e;

    /* renamed from: f, reason: collision with root package name */
    public final long f28818f;

    /* renamed from: g, reason: collision with root package name */
    public final C2465q f28819g;

    public C1894h(int i5, C2537u c2537u, C2537u c2537u2, C2537u c2537u3, X x5, EnumC1897k enumC1897k, C2465q c2465q, C2465q c2465q2) {
        if (63 != (i5 & 63)) {
            AbstractC1240b0.k(i5, 63, C1893g.f28809b);
            throw null;
        }
        this.f28813a = c2537u.f34686a;
        this.f28814b = c2537u2.f34686a;
        this.f28815c = c2537u3.f34686a;
        this.f28816d = x5;
        this.f28817e = enumC1897k;
        this.f28818f = c2465q.f34382a;
        if ((i5 & 64) == 0) {
            this.f28819g = null;
        } else {
            this.f28819g = c2465q2;
        }
    }

    public C1894h(long j8) {
        X x5 = X.f28755d;
        EnumC1897k enumC1897k = EnumC1897k.f28839b;
        this.f28813a = 5;
        this.f28814b = 10;
        this.f28815c = 30;
        this.f28816d = x5;
        this.f28817e = enumC1897k;
        this.f28818f = j8;
        this.f28819g = null;
    }
}
