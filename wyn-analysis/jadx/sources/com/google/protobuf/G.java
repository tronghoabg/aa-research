package com.google.protobuf;

import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public final class G extends E {

    /* renamed from: e, reason: collision with root package name */
    public final ByteBuffer f27564e;

    /* renamed from: f, reason: collision with root package name */
    public final int f27565f;

    public G(ByteBuffer byteBuffer) {
        super(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining());
        this.f27564e = byteBuffer;
        this.f27565f = byteBuffer.position();
    }

    @Override // com.google.protobuf.E, com.google.protobuf.CodedOutputStream
    public final void flush() {
        this.f27564e.position(getTotalBytesWritten() + this.f27565f);
    }
}
