package com.moloco.sdk.internal.ortb.model;

import Wf.AbstractC1240b0;
import com.moloco.sdk.internal.ortb.model.E;
import ef.C2537u;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

@Sf.e
/* renamed from: com.moloco.sdk.internal.ortb.model.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1896j {

    @NotNull
    public static final E.b Companion = new E.b();

    /* renamed from: d, reason: collision with root package name */
    public static final KSerializer[] f28834d = {null, X.Companion.serializer(), EnumC1897k.Companion.serializer()};

    /* renamed from: a, reason: collision with root package name */
    public final int f28835a;

    /* renamed from: b, reason: collision with root package name */
    public final X f28836b;

    /* renamed from: c, reason: collision with root package name */
    public final EnumC1897k f28837c;

    public C1896j(int i5, C2537u c2537u, X x5, EnumC1897k enumC1897k) {
        if (7 != (i5 & 7)) {
            AbstractC1240b0.k(i5, 7, C1895i.f28833b);
            throw null;
        }
        this.f28835a = c2537u.f34686a;
        this.f28836b = x5;
        this.f28837c = enumC1897k;
    }
}
