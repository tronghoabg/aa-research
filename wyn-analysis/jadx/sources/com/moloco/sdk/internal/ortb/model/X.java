package com.moloco.sdk.internal.ortb.model;

import Cd.C0352u;
import com.moloco.sdk.internal.ortb.model.C1906u;
import ef.EnumC2526j;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Sf.e
/* loaded from: classes4.dex */
public final class X {

    @NotNull
    public static final C1906u.a Companion;

    /* renamed from: a, reason: collision with root package name */
    public static final Object f28752a;

    /* renamed from: b, reason: collision with root package name */
    public static final X f28753b;

    /* renamed from: c, reason: collision with root package name */
    public static final X f28754c;

    /* renamed from: d, reason: collision with root package name */
    public static final X f28755d;

    /* renamed from: e, reason: collision with root package name */
    public static final X f28756e;

    /* renamed from: f, reason: collision with root package name */
    public static final X f28757f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ X[] f28758g;

    static {
        X x5 = new X("Start", 0);
        f28753b = x5;
        X x10 = new X("Center", 1);
        f28754c = x10;
        X x11 = new X("End", 2);
        f28755d = x11;
        X x12 = new X("Left", 3);
        f28756e = x12;
        X x13 = new X("Right", 4);
        f28757f = x13;
        X[] xArr = {x5, x10, x11, x12, x13};
        f28758g = xArr;
        ic.d.t(xArr);
        Companion = new C1906u.a();
        f28752a = Fe.c.y(EnumC2526j.f34668b, new C0352u(18));
    }

    public static X valueOf(String str) {
        return (X) Enum.valueOf(X.class, str);
    }

    public static X[] values() {
        return (X[]) f28758g.clone();
    }
}
