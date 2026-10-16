package s2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f44918c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a, reason: collision with root package name */
    public int f44919a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f44920b = -1;

    public final boolean a(String str) throws NumberFormatException {
        Matcher matcher = f44918c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String strGroup = matcher.group(1);
            int i5 = Q1.x.f9724a;
            int i10 = Integer.parseInt(strGroup, 16);
            int i11 = Integer.parseInt(matcher.group(2), 16);
            if (i10 <= 0 && i11 <= 0) {
                return false;
            }
            this.f44919a = i10;
            this.f44920b = i11;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public final void b(N1.B b5) {
        int i5 = 0;
        while (true) {
            N1.A[] aArr = b5.f8023a;
            if (i5 >= aArr.length) {
                return;
            }
            N1.A a5 = aArr[i5];
            if (a5 instanceof G2.e) {
                G2.e eVar = (G2.e) a5;
                if ("iTunSMPB".equals(eVar.f4174c) && a(eVar.f4175d)) {
                    return;
                }
            } else if (a5 instanceof G2.l) {
                G2.l lVar = (G2.l) a5;
                if ("com.apple.iTunes".equals(lVar.f4187b) && "iTunSMPB".equals(lVar.f4188c) && a(lVar.f4189d)) {
                    return;
                }
            } else {
                continue;
            }
            i5++;
        }
    }
}
