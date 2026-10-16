package D6;

import com.google.android.gms.internal.ads.zzboe;
import com.google.android.gms.internal.ads.zzbof;
import com.google.android.gms.internal.ads.zzbzf;
import com.google.android.gms.internal.ads.zzcdb;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;
import java.util.UUID;

/* renamed from: D6.q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0392q {

    /* renamed from: g, reason: collision with root package name */
    public static final C0392q f2477g = new C0392q();

    /* renamed from: a, reason: collision with root package name */
    public final H6.f f2478a;

    /* renamed from: b, reason: collision with root package name */
    public final C0388o f2479b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2480c;

    /* renamed from: d, reason: collision with root package name */
    public final H6.a f2481d;

    /* renamed from: e, reason: collision with root package name */
    public final Random f2482e;

    /* renamed from: f, reason: collision with root package name */
    public final String f2483f;

    public C0392q() throws NoSuchAlgorithmException {
        H6.f fVar = new H6.f();
        fVar.f4945a = -1.0f;
        u1 u1Var = new u1("com.google.android.gms.ads.AdManagerCreatorImpl");
        f1 f1Var = new f1("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl", 1);
        f1 f1Var2 = new f1("com.google.android.gms.ads.MobileAdsSettingManagerCreatorImpl", 0);
        zzboe zzboeVar = new zzboe();
        new zzcdb();
        zzbzf zzbzfVar = new zzbzf();
        new zzbof();
        C0388o c0388o = new C0388o(u1Var, f1Var, f1Var2, zzboeVar, zzbzfVar, new f1("com.google.android.gms.ads.AdPreloaderRemoteCreatorImpl", 2));
        H6.a aVar = new H6.a(0, 261710000, true, false);
        Random random = new Random();
        UUID uuidRandomUUID = UUID.randomUUID();
        byte[] byteArray = BigInteger.valueOf(uuidRandomUUID.getLeastSignificantBits()).toByteArray();
        byte[] byteArray2 = BigInteger.valueOf(uuidRandomUUID.getMostSignificantBits()).toByteArray();
        String string = new BigInteger(1, byteArray).toString();
        for (int i5 = 0; i5 < 2; i5++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(byteArray);
                messageDigest.update(byteArray2);
                byte[] bArr = new byte[8];
                System.arraycopy(messageDigest.digest(), 0, bArr, 0, 8);
                string = new BigInteger(1, bArr).toString();
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        this.f2478a = fVar;
        this.f2479b = c0388o;
        this.f2480c = false;
        this.f2481d = aVar;
        this.f2482e = random;
        this.f2483f = string;
    }

    public static void a() {
        f2477g.f2480c = false;
    }
}
