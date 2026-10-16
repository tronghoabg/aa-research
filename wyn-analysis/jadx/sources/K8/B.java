package K8;

import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.firebase.auth.FirebaseAuth;
import ka.AbstractC3256n;
import org.apache.tika.metadata.TikaCoreProperties;

/* loaded from: classes4.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    public final String f6568a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6569b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6570c;

    /* renamed from: d, reason: collision with root package name */
    public final int f6571d;

    /* renamed from: e, reason: collision with root package name */
    public final long f6572e;

    /* renamed from: f, reason: collision with root package name */
    public final String f6573f;

    /* renamed from: g, reason: collision with root package name */
    public final FirebaseAuth f6574g;

    public B(String str, String str2, int i5, int i10, long j8, String str3, FirebaseAuth firebaseAuth) {
        AbstractC1732v.g(str3, "sessionInfo cannot be empty.");
        AbstractC1732v.g(str, "sharedSecretKey cannot be empty. This is required to generate QR code URL.");
        this.f6568a = str;
        AbstractC1732v.g(str2, "hashAlgorithm cannot be empty.");
        this.f6569b = str2;
        this.f6570c = i5;
        this.f6571d = i10;
        this.f6572e = j8;
        this.f6573f = str3;
        this.f6574g = firebaseAuth;
    }

    public final String a(String str, String str2) {
        AbstractC1732v.g(str, "accountName cannot be empty.");
        AbstractC1732v.g(str2, "issuer cannot be empty.");
        StringBuilder sb2 = new StringBuilder("otpauth://totp/");
        AbstractC3256n.p(sb2, str2, TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER, str, "?secret=");
        AbstractC3256n.p(sb2, this.f6568a, "&issuer=", str2, "&algorithm=");
        sb2.append(this.f6569b);
        sb2.append("&digits=");
        sb2.append(this.f6570c);
        return sb2.toString();
    }
}
