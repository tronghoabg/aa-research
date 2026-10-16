package com.google.firebase.crashlytics.a.d;

import j$.util.Objects;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class n implements l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ byte[] f9260a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int[] f9261b;

    n(p pVar, byte[] bArr, int[] iArr) {
        this.f9260a = bArr;
        this.f9261b = iArr;
        Objects.requireNonNull(pVar);
    }

    @Override // com.google.firebase.crashlytics.a.d.l
    public final void a(InputStream inputStream, int i2) throws IOException {
        try {
            byte[] bArr = this.f9260a;
            int[] iArr = this.f9261b;
            inputStream.read(bArr, iArr[0], i2);
            iArr[0] = iArr[0] + i2;
        } finally {
            inputStream.close();
        }
    }
}
