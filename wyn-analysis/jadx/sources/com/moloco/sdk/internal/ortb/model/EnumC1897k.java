package com.moloco.sdk.internal.ortb.model;

import Cd.C0352u;
import com.moloco.sdk.internal.ortb.model.F;
import ef.EnumC2526j;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Sf.e
/* renamed from: com.moloco.sdk.internal.ortb.model.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC1897k {

    @NotNull
    public static final F.a Companion;

    /* renamed from: a, reason: collision with root package name */
    public static final Object f28838a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC1897k f28839b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC1897k f28840c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1897k f28841d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ EnumC1897k[] f28842e;

    /* renamed from: com.moloco.sdk.internal.ortb.model.k$b */
    public final class b {
        @NotNull
        public final KSerializer serializer() {
            return C.f28691a;
        }
    }

    static {
        EnumC1897k enumC1897k = new EnumC1897k("Top", 0);
        f28839b = enumC1897k;
        EnumC1897k enumC1897k2 = new EnumC1897k("Center", 1);
        f28840c = enumC1897k2;
        EnumC1897k enumC1897k3 = new EnumC1897k("Bottom", 2);
        f28841d = enumC1897k3;
        EnumC1897k[] enumC1897kArr = {enumC1897k, enumC1897k2, enumC1897k3};
        f28842e = enumC1897kArr;
        ic.d.t(enumC1897kArr);
        Companion = new F.a();
        f28838a = Fe.c.y(EnumC2526j.f34668b, new C0352u(17));
    }

    public static EnumC1897k valueOf(String str) {
        return (EnumC1897k) Enum.valueOf(EnumC1897k.class, str);
    }

    public static EnumC1897k[] values() {
        return (EnumC1897k[]) f28842e.clone();
    }
}
