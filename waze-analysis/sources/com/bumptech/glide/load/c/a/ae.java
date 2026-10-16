package com.bumptech.glide.load.c.a;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ae {

    /* renamed from: a, reason: collision with root package name */
    private static final com.bumptech.glide.g.j f3294a = com.bumptech.glide.g.p.g(new ad());

    static /* bridge */ /* synthetic */ boolean a(BitmapFactory.Options options) {
        if (Build.VERSION.SDK_INT == 34 && options.inPreferredConfig == Bitmap.Config.HARDWARE) {
            return ((Boolean) f3294a.a()).booleanValue();
        }
        return false;
    }
}
