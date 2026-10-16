package x4;

import java.util.Map;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f47703a;

    /* renamed from: b, reason: collision with root package name */
    public final long f47704b;

    /* renamed from: c, reason: collision with root package name */
    public final long f47705c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f47706d;

    public h(long j8, int i5, long j10, boolean z2) {
        this.f47703a = i5;
        this.f47704b = j8;
        this.f47705c = j10;
        this.f47706d = z2;
    }

    public static h a(Map map) {
        int i5;
        int i10 = 5;
        if (map == null) {
            return new h(0L, 5, 5000L, false);
        }
        Integer num = (Integer) map.get("accuracy");
        Integer num2 = (Integer) map.get("distanceFilter");
        Integer num3 = (Integer) map.get("timeInterval");
        Boolean bool = (Boolean) map.get("useMSLAltitude");
        if (num == null) {
            i5 = i10;
        } else {
            int iIntValue = num.intValue();
            if (iIntValue == 0) {
                i5 = 1;
            } else if (iIntValue == 1) {
                i5 = 2;
            } else if (iIntValue != 2) {
                if (iIntValue == 3) {
                    i10 = 4;
                } else if (iIntValue == 5) {
                    i10 = 6;
                }
                i5 = i10;
            } else {
                i5 = 3;
            }
        }
        return new h(num2 != null ? num2.intValue() : 0L, i5, num3 != null ? num3.intValue() : 5000L, bool != null && bool.booleanValue());
    }
}
