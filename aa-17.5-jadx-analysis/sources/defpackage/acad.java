package defpackage;

import java.util.Comparator;
import org.chromium.net.CronetProvider;

/* loaded from: classes3.dex */
public final class acad implements Comparator {
    private final /* synthetic */ int a;

    public acad(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        int i = this.a;
        if (i == 0) {
            return Double.compare(((acae) obj2).a, ((acae) obj).a);
        }
        if (i == 1) {
            return Float.compare(((aaap) obj).b(), ((aaap) obj2).b());
        }
        if (i == 2) {
            return ((adlq) obj).a() - ((adlq) obj2).a();
        }
        int i2 = 4;
        if (i != 3) {
            if (i != 4) {
                return -Integer.compare(((akbm) obj).b, ((akbm) obj2).b);
            }
            akbm akbmVar = (akbm) obj;
            akbm akbmVar2 = (akbm) obj2;
            if (CronetProvider.PROVIDER_NAME_FALLBACK.equals(akbmVar.a.getName())) {
                return 1;
            }
            if (CronetProvider.PROVIDER_NAME_FALLBACK.equals(akbmVar2.a.getName())) {
                return -1;
            }
            return -CronetProvider.compareVersions(akbmVar.a.getVersion(), akbmVar2.a.getVersion());
        }
        String str = (String) obj;
        String str2 = (String) obj2;
        str.getClass();
        str2.getClass();
        int iMin = Math.min(str.length(), str2.length());
        while (true) {
            if (i2 >= iMin) {
                int length = str.length();
                int length2 = str2.length();
                if (length == length2) {
                    return 0;
                }
                if (length >= length2) {
                    return 1;
                }
            } else {
                char cCharAt = str.charAt(i2);
                char cCharAt2 = str2.charAt(i2);
                if (cCharAt == cCharAt2) {
                    i2++;
                } else if (cCharAt >= cCharAt2) {
                    return 1;
                }
            }
        }
        return -1;
    }
}
