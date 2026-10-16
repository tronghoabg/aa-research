package com.bumptech.glide.g;

import android.graphics.Bitmap;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final /* synthetic */ class q {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f2917a;

    static {
        int[] iArr = new int[Bitmap.Config.values().length];
        f2917a = iArr;
        try {
            iArr[Bitmap.Config.ALPHA_8.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f2917a[Bitmap.Config.RGB_565.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f2917a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f2917a[Bitmap.Config.RGBA_F16.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f2917a[Bitmap.Config.ARGB_8888.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
