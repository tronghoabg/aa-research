package A7;

import android.os.Bundle;
import com.vungle.ads.internal.protos.Sdk;
import j$.util.Objects;
import java.util.EnumMap;
import org.apache.tika.metadata.TikaCoreProperties;

/* renamed from: A7.o, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0275o {

    /* renamed from: f, reason: collision with root package name */
    public static final C0275o f1000f = new C0275o(100, (String) null, (Boolean) null, (Boolean) null);

    /* renamed from: a, reason: collision with root package name */
    public final int f1001a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1002b;

    /* renamed from: c, reason: collision with root package name */
    public final Boolean f1003c;

    /* renamed from: d, reason: collision with root package name */
    public final String f1004d;

    /* renamed from: e, reason: collision with root package name */
    public final EnumMap f1005e;

    public C0275o(int i5, String str, Boolean bool, Boolean bool2) {
        EnumMap enumMap = new EnumMap(E0.class);
        this.f1005e = enumMap;
        enumMap.put((EnumMap) E0.AD_USER_DATA, (E0) (bool == null ? H0.UNINITIALIZED : bool.booleanValue() ? H0.GRANTED : H0.DENIED));
        this.f1001a = i5;
        this.f1002b = e();
        this.f1003c = bool2;
        this.f1004d = str;
    }

    public static C0275o a(int i5, Bundle bundle) {
        if (bundle == null) {
            return new C0275o(i5, (String) null, (Boolean) null, (Boolean) null);
        }
        EnumMap enumMap = new EnumMap(E0.class);
        for (E0 e02 : G0.DMA.f499a) {
            enumMap.put((EnumMap) e02, (E0) F0.f(bundle.getString(e02.f486a)));
        }
        return new C0275o(enumMap, i5, bundle.containsKey("is_dma_region") ? Boolean.valueOf(bundle.getString("is_dma_region")) : null, bundle.getString("cps_display_str"));
    }

    public static C0275o b(String str) {
        if (str == null || str.length() <= 0) {
            return f1000f;
        }
        String[] strArrSplit = str.split(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
        int i5 = Integer.parseInt(strArrSplit[0]);
        EnumMap enumMap = new EnumMap(E0.class);
        E0[] e0Arr = G0.DMA.f499a;
        int length = e0Arr.length;
        int i10 = 1;
        int i11 = 0;
        while (i11 < length) {
            enumMap.put((EnumMap) e0Arr[i11], (E0) F0.e(strArrSplit[i10].charAt(0)));
            i11++;
            i10++;
        }
        return new C0275o(enumMap, i5, (Boolean) null, (String) null);
    }

    public static Boolean c(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        int i5 = AbstractC0286s.f1044a[F0.f(bundle.getString("ad_personalization")).ordinal()];
        if (i5 == 3) {
            return Boolean.FALSE;
        }
        if (i5 != 4) {
            return null;
        }
        return Boolean.TRUE;
    }

    public final H0 d() {
        H0 h02 = (H0) this.f1005e.get(E0.AD_USER_DATA);
        return h02 == null ? H0.UNINITIALIZED : h02;
    }

    public final String e() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f1001a);
        for (E0 e02 : G0.DMA.f499a) {
            sb2.append(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
            sb2.append(F0.a((H0) this.f1005e.get(e02)));
        }
        return sb2.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0275o)) {
            return false;
        }
        C0275o c0275o = (C0275o) obj;
        if (this.f1002b.equalsIgnoreCase(c0275o.f1002b) && Objects.equals(this.f1003c, c0275o.f1003c)) {
            return Objects.equals(this.f1004d, c0275o.f1004d);
        }
        return false;
    }

    public final int hashCode() {
        Boolean bool = this.f1003c;
        int i5 = bool == null ? 3 : bool == Boolean.TRUE ? 7 : 13;
        String str = this.f1004d;
        return ((str == null ? 17 : str.hashCode()) * Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE) + (i5 * 29) + this.f1002b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("source=");
        sb2.append(F0.g(this.f1001a));
        for (E0 e02 : G0.DMA.f499a) {
            sb2.append(",");
            sb2.append(e02.f486a);
            sb2.append("=");
            H0 h02 = (H0) this.f1005e.get(e02);
            if (h02 == null) {
                sb2.append("uninitialized");
            } else {
                int i5 = AbstractC0286s.f1044a[h02.ordinal()];
                if (i5 == 1) {
                    sb2.append("uninitialized");
                } else if (i5 == 2) {
                    sb2.append("eu_consent_policy");
                } else if (i5 == 3) {
                    sb2.append("denied");
                } else if (i5 == 4) {
                    sb2.append("granted");
                }
            }
        }
        Boolean bool = this.f1003c;
        if (bool != null) {
            sb2.append(",isDmaRegion=");
            sb2.append(bool);
        }
        String str = this.f1004d;
        if (str != null) {
            sb2.append(",cpsDisplayStr=");
            sb2.append(str);
        }
        return sb2.toString();
    }

    public C0275o(EnumMap enumMap, int i5, Boolean bool, String str) {
        EnumMap enumMap2 = new EnumMap(E0.class);
        this.f1005e = enumMap2;
        enumMap2.putAll(enumMap);
        this.f1001a = i5;
        this.f1002b = e();
        this.f1003c = bool;
        this.f1004d = str;
    }
}
