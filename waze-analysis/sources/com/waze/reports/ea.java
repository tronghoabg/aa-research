package com.waze.reports;

import android.graphics.Bitmap;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageCaptureException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ea implements ImageCapture.OnImageSavedCallback {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ eb f33888a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ByteArrayOutputStream f33889b;

    ea(eb ebVar, ByteArrayOutputStream byteArrayOutputStream) {
        this.f33888a = ebVar;
        this.f33889b = byteArrayOutputStream;
    }

    @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
    public final /* synthetic */ void onCaptureProcessProgressed(int i2) {
    }

    @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
    public final /* synthetic */ void onCaptureStarted() {
    }

    @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
    public final void onError(ImageCaptureException imageCaptureException) throws IOException {
        h.g.b.x.f(imageCaptureException, "error");
        Objects.toString(imageCaptureException);
        com.waze.shared_infra.i.h.b("TakePhotoFragment", "Could not capture picture: ".concat(String.valueOf(imageCaptureException)));
        this.f33888a.n(null);
    }

    @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
    public final void onImageSaved(ImageCapture.OutputFileResults outputFileResults) throws IOException {
        h.g.b.x.f(outputFileResults, "outputFileResults");
        this.f33888a.n(this.f33889b);
    }

    @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
    public final /* synthetic */ void onPostviewBitmapAvailable(Bitmap bitmap) {
    }
}
