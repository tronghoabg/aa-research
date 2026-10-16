package A7;

import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import com.applovin.shadow.okio.Segment;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken;
import java.io.IOException;
import java.util.Map;
import n7.AbstractC3598c;
import org.apache.tika.metadata.TikaCoreProperties;

/* loaded from: classes4.dex */
public final class M implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f592a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final int f593b;

    /* renamed from: c, reason: collision with root package name */
    public final String f594c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f595d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f596e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f597f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f598g;

    public M(N n10, int i5, String str, Object obj, Object obj2, Object obj3) {
        this.f593b = i5;
        this.f594c = str;
        this.f595d = obj;
        this.f596e = obj2;
        this.f597f = obj3;
        this.f598g = n10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f592a) {
            case 0:
                Z z2 = ((C0273n0) ((N) this.f598g).f421a).f980h;
                C0273n0.c(z2);
                if (!z2.f435b) {
                    Log.println(6, ((N) this.f598g).r0(), "Persisted config not initialized. Not logging error/warn");
                    return;
                }
                N n10 = (N) this.f598g;
                if (n10.f602c == 0) {
                    C0245e c0245e = ((C0273n0) n10.f421a).f979g;
                    if (c0245e.f854e == null) {
                        synchronized (c0245e) {
                            try {
                                if (c0245e.f854e == null) {
                                    ApplicationInfo applicationInfo = ((C0273n0) c0245e.f421a).f973a.getApplicationInfo();
                                    String strF = AbstractC3598c.f();
                                    if (applicationInfo != null) {
                                        String str = applicationInfo.processName;
                                        c0245e.f854e = Boolean.valueOf(str != null && str.equals(strF));
                                    }
                                    if (c0245e.f854e == null) {
                                        c0245e.f854e = Boolean.TRUE;
                                        c0245e.zzj().f605f.c("My process not in the list of running processes");
                                    }
                                }
                            } finally {
                            }
                        }
                    }
                    if (c0245e.f854e.booleanValue()) {
                        ((N) this.f598g).f602c = 'C';
                    } else {
                        ((N) this.f598g).f602c = 'c';
                    }
                }
                N n11 = (N) this.f598g;
                if (n11.f603d < 0) {
                    n11.f603d = 106000L;
                }
                char cCharAt = "01VDIWEA?".charAt(this.f593b);
                N n12 = (N) this.f598g;
                char c10 = n12.f602c;
                long j8 = n12.f603d;
                String strJ0 = N.j0(true, this.f594c, this.f595d, this.f596e, this.f597f);
                StringBuilder sb2 = new StringBuilder(CommonGetHeaderBiddingToken.HB_TOKEN_VERSION);
                sb2.append(cCharAt);
                sb2.append(c10);
                sb2.append(j8);
                String strC = wg.b.c(sb2, TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER, strJ0);
                if (strC.length() > 1024) {
                    strC = this.f594c.substring(0, Segment.SHARE_MINIMUM);
                }
                C0240c0 c0240c0 = z2.f766f;
                if (c0240c0 != null) {
                    Z z10 = (Z) c0240c0.f830e;
                    z10.c0();
                    if (((Z) c0240c0.f830e).l0().getLong((String) c0240c0.f827b, 0L) == 0) {
                        c0240c0.n();
                    }
                    if (strC == null) {
                        strC = "";
                    }
                    SharedPreferences sharedPreferencesL0 = z10.l0();
                    String str2 = (String) c0240c0.f828c;
                    long j10 = sharedPreferencesL0.getLong(str2, 0L);
                    String str3 = (String) c0240c0.f829d;
                    if (j10 <= 0) {
                        SharedPreferences.Editor editorEdit = z10.l0().edit();
                        editorEdit.putString(str3, strC);
                        editorEdit.putLong(str2, 1L);
                        editorEdit.apply();
                        return;
                    }
                    long j11 = j10 + 1;
                    boolean z11 = (z10.b0().r1().nextLong() & Long.MAX_VALUE) < Long.MAX_VALUE / j11;
                    SharedPreferences.Editor editorEdit2 = z10.l0().edit();
                    if (z11) {
                        editorEdit2.putString(str3, strC);
                    }
                    editorEdit2.putLong(str2, j11);
                    editorEdit2.apply();
                    return;
                }
                return;
            default:
                ((T) this.f595d).t(this.f594c, this.f593b, (IOException) this.f596e, (byte[]) this.f597f, (Map) this.f598g);
                return;
        }
    }

    public M(String str, T t10, int i5, IOException iOException, byte[] bArr, Map map) {
        AbstractC1732v.i(t10);
        this.f595d = t10;
        this.f593b = i5;
        this.f596e = iOException;
        this.f597f = bArr;
        this.f594c = str;
        this.f598g = map;
    }
}
