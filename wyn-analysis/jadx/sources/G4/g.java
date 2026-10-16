package G4;

import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class g implements Z4.b {

    /* renamed from: a, reason: collision with root package name */
    public final MessageDigest f4237a;

    /* renamed from: b, reason: collision with root package name */
    public final Z4.e f4238b = new Z4.e();

    public g(MessageDigest messageDigest) {
        this.f4237a = messageDigest;
    }

    @Override // Z4.b
    public final Z4.e c() {
        return this.f4238b;
    }
}
