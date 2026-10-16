package com.google.android.libraries.phenotype.client.b;

import androidx.collection.SieveCacheKt;
import com.google.v.z;
import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import j$.util.Objects;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class e extends InputStream implements InputStreamRetargetInterface {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ z f5971a;

    e(f fVar, z zVar) {
        this.f5971a = zVar;
        Objects.requireNonNull(fVar);
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = new byte[1];
        if (read(bArr, 0, 1) == -1) {
            return -1;
        }
        return bArr[0];
    }

    @Override // java.io.InputStream
    public final long skip(long j2) {
        if (j2 <= 0) {
            return 0L;
        }
        int i2 = j2 > SieveCacheKt.NodeLinkMask ? Integer.MAX_VALUE : (int) j2;
        this.f5971a.I(i2);
        return i2;
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i2, int i3) {
        return this.f5971a.s(bArr, i2, i3);
    }
}
