package com.bumptech.glide.load.c;

import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnPartialImageListener;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class a implements ImageDecoder$OnPartialImageListener {
    a(b bVar) {
        Objects.requireNonNull(bVar);
    }

    public final boolean onPartialImage(ImageDecoder.DecodeException decodeException) {
        return false;
    }
}
