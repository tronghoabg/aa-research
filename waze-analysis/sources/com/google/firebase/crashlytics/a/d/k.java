package com.google.firebase.crashlytics.a.d;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import j$.util.Objects;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class k extends InputStream implements InputStreamRetargetInterface {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ m f9250a;

    /* renamed from: b, reason: collision with root package name */
    private int f9251b;

    /* renamed from: c, reason: collision with root package name */
    private int f9252c;

    /* synthetic */ k(m mVar, j jVar) {
        Objects.requireNonNull(mVar);
        this.f9250a = mVar;
        this.f9251b = mVar.l(jVar.f9248b + 4);
        this.f9252c = jVar.f9249c;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i2, int i3) throws IOException {
        m.s(bArr);
        if ((i2 | i3) < 0 || i3 > bArr.length - i2) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i4 = this.f9252c;
        if (i4 <= 0) {
            return -1;
        }
        if (i3 > i4) {
            i3 = i4;
        }
        m mVar = this.f9250a;
        mVar.n(this.f9251b, bArr, i2, i3);
        this.f9251b = mVar.l(this.f9251b + i3);
        this.f9252c -= i3;
        return i3;
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (this.f9252c == 0) {
            return -1;
        }
        m mVar = this.f9250a;
        mVar.f9255c.seek(this.f9251b);
        int i2 = mVar.f9255c.read();
        this.f9251b = mVar.l(this.f9251b + 1);
        this.f9252c--;
        return i2;
    }
}
