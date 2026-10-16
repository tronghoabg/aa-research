package com.google.protobuf;

import java.io.IOException;

/* loaded from: classes4.dex */
public final class L implements q2 {

    /* renamed from: a, reason: collision with root package name */
    public final CodedOutputStream f27587a;

    public L(CodedOutputStream codedOutputStream) {
        CodedOutputStream codedOutputStream2 = (CodedOutputStream) Internal.checkNotNull(codedOutputStream, "output");
        this.f27587a = codedOutputStream2;
        codedOutputStream2.wrapper = this;
    }

    public final void a(int i5, ByteString byteString) {
        this.f27587a.writeBytes(i5, byteString);
    }

    public final void b(int i5, int i10) throws IOException {
        this.f27587a.writeFixed32(i5, i10);
    }

    public final void c(int i5, long j8) throws IOException {
        this.f27587a.writeFixed64(i5, j8);
    }

    public final void d(int i5, Object obj, D1 d12) throws IOException {
        this.f27587a.writeGroup(i5, (MessageLite) obj, d12);
    }

    public final void e(int i5, int i10) throws IOException {
        this.f27587a.writeInt32(i5, i10);
    }

    public final void f(int i5, long j8) throws IOException {
        this.f27587a.writeInt64(i5, j8);
    }

    public final void g(int i5, Object obj, D1 d12) throws IOException {
        this.f27587a.writeMessage(i5, (MessageLite) obj, d12);
    }

    public final void h(int i5, Object obj) throws IOException {
        boolean z2 = obj instanceof ByteString;
        CodedOutputStream codedOutputStream = this.f27587a;
        if (z2) {
            codedOutputStream.writeRawMessageSetExtension(i5, (ByteString) obj);
        } else {
            codedOutputStream.writeMessageSetExtension(i5, (MessageLite) obj);
        }
    }
}
