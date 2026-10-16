package A7;

import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;

/* renamed from: A7.w1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0300w1 extends G1 {

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f1096d;

    /* renamed from: e, reason: collision with root package name */
    public final C0234a0 f1097e;

    /* renamed from: f, reason: collision with root package name */
    public final C0234a0 f1098f;

    /* renamed from: g, reason: collision with root package name */
    public final C0234a0 f1099g;

    /* renamed from: h, reason: collision with root package name */
    public final C0234a0 f1100h;

    /* renamed from: i, reason: collision with root package name */
    public final C0234a0 f1101i;

    /* renamed from: j, reason: collision with root package name */
    public final C0234a0 f1102j;

    public C0300w1(L1 l12) {
        super(l12);
        this.f1096d = new HashMap();
        this.f1097e = new C0234a0(a0(), "last_delete_stale", 0L);
        this.f1098f = new C0234a0(a0(), "last_delete_stale_batch", 0L);
        this.f1099g = new C0234a0(a0(), "backoff", 0L);
        this.f1100h = new C0234a0(a0(), "last_upload", 0L);
        this.f1101i = new C0234a0(a0(), "last_upload_attempt", 0L);
        this.f1102j = new C0234a0(a0(), "midnight_offset", 0L);
    }

    @Override // A7.G1
    public final boolean j0() {
        return false;
    }

    public final String k0(String str, boolean z2) {
        c0();
        String str2 = z2 ? (String) l0(str).first : "00000000-0000-0000-0000-000000000000";
        MessageDigest messageDigestQ1 = U1.q1();
        if (messageDigestQ1 == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, messageDigestQ1.digest(str2.getBytes())));
    }

    public final Pair l0(String str) {
        C0297v1 c0297v1;
        AdvertisingIdClient.Info advertisingIdInfo;
        c0();
        C0273n0 c0273n0 = (C0273n0) this.f421a;
        c0273n0.f985n.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        HashMap map = this.f1096d;
        C0297v1 c0297v12 = (C0297v1) map.get(str);
        if (c0297v12 != null && jElapsedRealtime < c0297v12.f1090c) {
            return new Pair(c0297v12.f1088a, Boolean.valueOf(c0297v12.f1089b));
        }
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
        C0245e c0245e = c0273n0.f979g;
        c0245e.getClass();
        long jJ0 = c0245e.j0(str, AbstractC0304y.f1169b) + jElapsedRealtime;
        try {
            try {
                advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(c0273n0.f973a);
            } catch (PackageManager.NameNotFoundException unused) {
                if (c0297v12 != null && jElapsedRealtime < c0297v12.f1090c + c0245e.j0(str, AbstractC0304y.f1172c)) {
                    return new Pair(c0297v12.f1088a, Boolean.valueOf(c0297v12.f1089b));
                }
                advertisingIdInfo = null;
            }
        } catch (Exception e7) {
            zzj().f611m.d("Unable to get advertising id", e7);
            c0297v1 = new C0297v1("", jJ0, false);
        }
        if (advertisingIdInfo == null) {
            return new Pair("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
        }
        String id2 = advertisingIdInfo.getId();
        c0297v1 = id2 != null ? new C0297v1(id2, jJ0, advertisingIdInfo.isLimitAdTrackingEnabled()) : new C0297v1("", jJ0, advertisingIdInfo.isLimitAdTrackingEnabled());
        map.put(str, c0297v1);
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
        return new Pair(c0297v1.f1088a, Boolean.valueOf(c0297v1.f1089b));
    }
}
