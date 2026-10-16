package g2;

import com.vungle.ads.internal.protos.Sdk;
import java.util.regex.Pattern;
import org.apache.tika.utils.StringUtils;

/* renamed from: g2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2681b {

    /* renamed from: a, reason: collision with root package name */
    public final int f35563a;

    /* renamed from: b, reason: collision with root package name */
    public final String f35564b;

    /* renamed from: c, reason: collision with root package name */
    public final int f35565c;

    /* renamed from: d, reason: collision with root package name */
    public final int f35566d;

    public C2681b(int i5, int i10, int i11, String str) {
        this.f35563a = i5;
        this.f35564b = str;
        this.f35565c = i10;
        this.f35566d = i11;
    }

    public static C2681b a(String str) throws NumberFormatException, N1.D {
        int i5 = Q1.x.f9724a;
        String[] strArrSplit = str.split(StringUtils.SPACE, 2);
        Q1.k.c(strArrSplit.length == 2);
        String str2 = strArrSplit[0];
        Pattern pattern = AbstractC2671A.f35503a;
        try {
            int i10 = Integer.parseInt(str2);
            int i11 = -1;
            String[] strArrSplit2 = strArrSplit[1].trim().split("/", -1);
            Q1.k.c(strArrSplit2.length >= 2);
            String str3 = strArrSplit2[1];
            try {
                int i12 = Integer.parseInt(str3);
                if (strArrSplit2.length == 3) {
                    String str4 = strArrSplit2[2];
                    try {
                        i11 = Integer.parseInt(str4);
                    } catch (NumberFormatException e7) {
                        throw N1.D.b(str4, e7);
                    }
                }
                return new C2681b(i10, i12, i11, strArrSplit2[0]);
            } catch (NumberFormatException e10) {
                throw N1.D.b(str3, e10);
            }
        } catch (NumberFormatException e11) {
            throw N1.D.b(str2, e11);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2681b.class == obj.getClass()) {
            C2681b c2681b = (C2681b) obj;
            if (this.f35563a == c2681b.f35563a && this.f35564b.equals(c2681b.f35564b) && this.f35565c == c2681b.f35565c && this.f35566d == c2681b.f35566d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((N0.a.c((Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE + this.f35563a) * 31, 31, this.f35564b) + this.f35565c) * 31) + this.f35566d;
    }
}
