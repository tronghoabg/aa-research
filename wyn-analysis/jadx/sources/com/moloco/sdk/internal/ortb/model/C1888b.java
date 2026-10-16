package com.moloco.sdk.internal.ortb.model;

import Wf.AbstractC1240b0;
import com.moloco.sdk.internal.ortb.model.A;
import e0.C2465q;
import ef.C2537u;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

@Sf.e
/* renamed from: com.moloco.sdk.internal.ortb.model.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1888b {

    @NotNull
    public static final A.b Companion = new A.b();

    /* renamed from: e, reason: collision with root package name */
    public static final KSerializer[] f28772e = {null, X.Companion.serializer(), EnumC1897k.Companion.serializer(), null};

    /* renamed from: a, reason: collision with root package name */
    public final int f28773a;

    /* renamed from: b, reason: collision with root package name */
    public final X f28774b;

    /* renamed from: c, reason: collision with root package name */
    public final EnumC1897k f28775c;

    /* renamed from: d, reason: collision with root package name */
    public final long f28776d;

    /* renamed from: com.moloco.sdk.internal.ortb.model.b$b, reason: collision with other inner class name */
    public final class C0167b {
        @NotNull
        public final KSerializer serializer() {
            return C1900n.f28847a;
        }
    }

    public C1888b(int i5, C2537u c2537u, X x5, EnumC1897k enumC1897k, C2465q c2465q) {
        if (15 != (i5 & 15)) {
            AbstractC1240b0.k(i5, 15, C1887a.f28769b);
            throw null;
        }
        this.f28773a = c2537u.f34686a;
        this.f28774b = x5;
        this.f28775c = enumC1897k;
        this.f28776d = c2465q.f34382a;
    }

    public C1888b(long j8) {
        X x5 = X.f28754c;
        EnumC1897k enumC1897k = EnumC1897k.f28841d;
        this.f28773a = 0;
        this.f28774b = x5;
        this.f28775c = enumC1897k;
        this.f28776d = j8;
    }
}
