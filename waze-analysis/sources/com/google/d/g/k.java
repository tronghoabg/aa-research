package com.google.d.g;

import com.google.d.b.an;
import java.security.MessageDigest;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class k extends a {

    /* renamed from: a, reason: collision with root package name */
    private final MessageDigest f7882a;

    /* renamed from: b, reason: collision with root package name */
    private final int f7883b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f7884c;

    /* synthetic */ k(MessageDigest messageDigest, int i2) {
        this.f7882a = messageDigest;
        this.f7883b = i2;
    }

    private final void e() {
        an.v(!this.f7884c, "Cannot re-use a Hasher after calling hash() on it");
    }

    @Override // com.google.d.g.a
    protected final void b(byte[] bArr, int i2) {
        e();
        this.f7882a.update(bArr, 0, i2);
    }

    @Override // com.google.d.g.h
    public final f k() {
        e();
        this.f7884c = true;
        int i2 = this.f7883b;
        MessageDigest messageDigest = this.f7882a;
        if (i2 == messageDigest.getDigestLength()) {
            byte[] bArrDigest = messageDigest.digest();
            int i3 = f.f7879b;
            return new e(bArrDigest);
        }
        byte[] bArrCopyOf = Arrays.copyOf(messageDigest.digest(), i2);
        int i4 = f.f7879b;
        return new e(bArrCopyOf);
    }
}
