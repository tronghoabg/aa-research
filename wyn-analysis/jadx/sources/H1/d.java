package h1;

import android.util.Base64;
import java.util.List;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f35940a;

    /* renamed from: b, reason: collision with root package name */
    public final String f35941b;

    /* renamed from: c, reason: collision with root package name */
    public final String f35942c;

    /* renamed from: d, reason: collision with root package name */
    public final List f35943d;

    /* renamed from: e, reason: collision with root package name */
    public final String f35944e;

    public d(String str, String str2, String str3, List list) {
        str.getClass();
        this.f35940a = str;
        str2.getClass();
        this.f35941b = str2;
        this.f35942c = str3;
        list.getClass();
        this.f35943d = list;
        this.f35944e = str + "-" + str2 + "-" + str3;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FontRequest {mProviderAuthority: " + this.f35940a + ", mProviderPackage: " + this.f35941b + ", mQuery: " + this.f35942c + ", mCertificates:");
        int i5 = 0;
        while (true) {
            List list = this.f35943d;
            if (i5 >= list.size()) {
                sb2.append("}mCertificatesArray: 0");
                return sb2.toString();
            }
            sb2.append(" [");
            List list2 = (List) list.get(i5);
            for (int i10 = 0; i10 < list2.size(); i10++) {
                sb2.append(" \"");
                sb2.append(Base64.encodeToString((byte[]) list2.get(i10), 0));
                sb2.append("\"");
            }
            sb2.append(" ]");
            i5++;
        }
    }
}
