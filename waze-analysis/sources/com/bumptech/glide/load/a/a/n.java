package com.bumptech.glide.load.a.a;

import android.graphics.Bitmap;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final /* synthetic */ class n {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f2966a;

    static {
        int[] iArr = new int[Bitmap.Config.values().length];
        f2966a = iArr;
        try {
            iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f2966a[Bitmap.Config.RGB_565.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f2966a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f2966a[Bitmap.Config.ALPHA_8.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
