package com.google.d.g;

import com.google.d.b.an;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class m extends b implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private final MessageDigest f7888a;

    /* renamed from: b, reason: collision with root package name */
    private final int f7889b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f7890c;

    /* renamed from: d, reason: collision with root package name */
    private final String f7891d;

    m(String str, int i2, String str2) {
        this.f7891d = str2;
        MessageDigest messageDigestB = b(str);
        this.f7888a = messageDigestB;
        int digestLength = messageDigestB.getDigestLength();
        boolean z = false;
        if (i2 >= 4 && i2 <= digestLength) {
            z = true;
        }
        an.r(z, "bytes (%s) must be >= 4 and < %s", i2, digestLength);
        this.f7889b = i2;
        this.f7890c = c(messageDigestB);
    }

    private static MessageDigest b(String str) {
        try {
            return MessageDigest.getInstance(str);
        } catch (NoSuchAlgorithmException e2) {
            throw new AssertionError(e2);
        }
    }

    private static boolean c(MessageDigest messageDigest) throws CloneNotSupportedException {
        try {
            messageDigest.clone();
            return true;
        } catch (CloneNotSupportedException unused) {
            return false;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // com.google.d.g.g
    public final h a() {
        if (this.f7890c) {
            try {
                return new k((MessageDigest) this.f7888a.clone(), this.f7889b);
            } catch (CloneNotSupportedException unused) {
            }
        }
        return new k(b(this.f7888a.getAlgorithm()), this.f7889b);
    }

    public final String toString() {
        return this.f7891d;
    }

    Object writeReplace() {
        return new l(this.f7888a.getAlgorithm(), this.f7889b, this.f7891d);
    }

    m() {
        MessageDigest messageDigestB = b("SHA-256");
        this.f7888a = messageDigestB;
        this.f7889b = messageDigestB.getDigestLength();
        this.f7891d = "Hashing.sha256()";
        this.f7890c = c(messageDigestB);
    }
}
