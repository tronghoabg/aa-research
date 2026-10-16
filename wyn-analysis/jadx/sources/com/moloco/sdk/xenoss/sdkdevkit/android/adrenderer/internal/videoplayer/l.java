package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer;

import androidx.lifecycle.EnumC1449m;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class l {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f32255a;

    static {
        int[] iArr = new int[EnumC1449m.values().length];
        try {
            iArr[EnumC1449m.ON_START.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EnumC1449m.ON_RESUME.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[EnumC1449m.ON_PAUSE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[EnumC1449m.ON_STOP.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f32255a = iArr;
    }
}
