package Jd;

import A7.B0;
import Va.M6;
import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class n extends B0 {
    @Override // A7.B0
    public final void X(String name) {
        AbstractC3340k.e(name, "name");
        List list = p.f6064a;
        int i5 = 0;
        int i10 = 0;
        while (i5 < name.length()) {
            char cCharAt = name.charAt(i5);
            int i11 = i10 + 1;
            if (AbstractC3340k.g(cCharAt, 32) <= 0 || Bf.k.o0("\"(),/:;<=>?@[\\]{}", cCharAt)) {
                StringBuilder sbW = com.google.android.gms.internal.consent_sdk.a.w("Header name '", name, "' contains illegal character '");
                sbW.append(name.charAt(i10));
                sbW.append("' (code ");
                throw new w(M6.r(sbW, name.charAt(i10) & 255, ')'));
            }
            i5++;
            i10 = i11;
        }
    }

    @Override // A7.B0
    public final void Y(String value) {
        AbstractC3340k.e(value, "value");
        List list = p.f6064a;
        int i5 = 0;
        int i10 = 0;
        while (i5 < value.length()) {
            char cCharAt = value.charAt(i5);
            int i11 = i10 + 1;
            if (AbstractC3340k.g(cCharAt, 32) < 0 && cCharAt != '\t') {
                StringBuilder sbW = com.google.android.gms.internal.consent_sdk.a.w("Header value '", value, "' contains illegal character '");
                sbW.append(value.charAt(i10));
                sbW.append("' (code ");
                throw new w(M6.r(sbW, value.charAt(i10) & 255, ')'));
            }
            i5++;
            i10 = i11;
        }
    }
}
