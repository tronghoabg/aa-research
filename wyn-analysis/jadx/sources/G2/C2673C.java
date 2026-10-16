package g2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: g2.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2673C {

    /* renamed from: c, reason: collision with root package name */
    public static final C2673C f35515c = new C2673C(0, -9223372036854775807L);

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f35516d = Pattern.compile("npt[:=]([.\\d]+|now)\\s?-\\s?([.\\d]+)?");

    /* renamed from: a, reason: collision with root package name */
    public final long f35517a;

    /* renamed from: b, reason: collision with root package name */
    public final long f35518b;

    public C2673C(long j8, long j10) {
        this.f35517a = j8;
        this.f35518b = j10;
    }

    public static C2673C a(String str) {
        long j8;
        Matcher matcher = f35516d.matcher(str);
        boolean zMatches = matcher.matches();
        Pattern pattern = AbstractC2671A.f35503a;
        if (!zMatches) {
            throw N1.D.b(str, null);
        }
        String strGroup = matcher.group(1);
        if (strGroup == null) {
            throw N1.D.b(str, null);
        }
        int i5 = Q1.x.f9724a;
        long j10 = strGroup.equals("now") ? 0L : (long) (Float.parseFloat(strGroup) * 1000.0f);
        String strGroup2 = matcher.group(2);
        if (strGroup2 != null) {
            try {
                j8 = (long) (Float.parseFloat(strGroup2) * 1000.0f);
                if (j8 < j10) {
                    throw N1.D.b(str, null);
                }
            } catch (NumberFormatException e7) {
                throw N1.D.b(strGroup2, e7);
            }
        } else {
            j8 = -9223372036854775807L;
        }
        return new C2673C(j10, j8);
    }
}
