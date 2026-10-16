package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.vungle.ads.internal.protos.Sdk;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class E {

    /* renamed from: b, reason: collision with root package name */
    public static final E f31453b;

    /* renamed from: c, reason: collision with root package name */
    public static final E f31454c;

    /* renamed from: d, reason: collision with root package name */
    public static final E f31455d;

    /* renamed from: e, reason: collision with root package name */
    public static final E f31456e;

    /* renamed from: f, reason: collision with root package name */
    public static final E f31457f;

    /* renamed from: g, reason: collision with root package name */
    public static final E f31458g;

    /* renamed from: h, reason: collision with root package name */
    public static final E f31459h;

    /* renamed from: i, reason: collision with root package name */
    public static final E f31460i;

    /* renamed from: j, reason: collision with root package name */
    public static final E f31461j;
    public static final /* synthetic */ E[] k;

    /* renamed from: a, reason: collision with root package name */
    public final int f31462a;

    static {
        E e7 = new E("XmlParsing", 0, 100);
        f31453b = e7;
        E e10 = new E("Wrapper", 1, 300);
        f31454c = e10;
        E e11 = new E("WrapperTimeout", 2, Sdk.SDKError.Reason.MRAID_ERROR_VALUE);
        f31455d = e11;
        E e12 = new E("WrapperLimit", 3, Sdk.SDKError.Reason.INVALID_IFA_STATUS_VALUE);
        f31456e = e12;
        E e13 = new E("WrapperNoAds", 4, 303);
        f31457f = e13;
        E e14 = new E("Linear", 5, 400);
        f31458g = e14;
        E e15 = new E("LinearFileNotFound", 6, TTAdConstant.MATE_IS_NULL_CODE);
        f31459h = e15;
        E e16 = new E("LinearNotSupportedMedia", 7, TTAdConstant.DEEPLINK_UNAVAILABLE_CODE);
        f31460i = e16;
        E e17 = new E("Companion", 8, 600);
        f31461j = e17;
        E[] eArr = {e7, e10, e11, e12, e13, e14, e15, e16, e17, new E("Undefined", 9, 900)};
        k = eArr;
        ic.d.t(eArr);
    }

    public E(String str, int i5, int i10) {
        this.f31462a = i10;
    }

    public static E valueOf(String str) {
        return (E) Enum.valueOf(E.class, str);
    }

    public static E[] values() {
        return (E[]) k.clone();
    }
}
