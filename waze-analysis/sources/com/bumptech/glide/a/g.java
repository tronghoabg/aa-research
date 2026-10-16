package com.bumptech.glide.a;

import j$.util.Objects;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class g extends ByteArrayOutputStream {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ h f2731a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(h hVar, int i2) {
        super(i2);
        Objects.requireNonNull(hVar);
        this.f2731a = hVar;
    }

    @Override // java.io.ByteArrayOutputStream
    public final String toString() {
        try {
            return new String(this.buf, 0, (this.count <= 0 || this.buf[this.count + (-1)] != 13) ? this.count : this.count - 1, this.f2731a.f2733b.name());
        } catch (UnsupportedEncodingException e2) {
            throw new AssertionError(e2);
        }
    }
}
