package G6;

import com.google.android.gms.common.internal.AbstractC1732v;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.Arrays;

/* renamed from: G6.s, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0554s {

    /* renamed from: a, reason: collision with root package name */
    public final String f4629a;

    /* renamed from: b, reason: collision with root package name */
    public final double f4630b;

    /* renamed from: c, reason: collision with root package name */
    public final double f4631c;

    /* renamed from: d, reason: collision with root package name */
    public final double f4632d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4633e;

    public C0554s(String str, double d3, double d5, double d10, int i5) {
        this.f4629a = str;
        this.f4631c = d3;
        this.f4630b = d5;
        this.f4632d = d10;
        this.f4633e = i5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0554s)) {
            return false;
        }
        C0554s c0554s = (C0554s) obj;
        return AbstractC1732v.m(this.f4629a, c0554s.f4629a) && this.f4630b == c0554s.f4630b && this.f4631c == c0554s.f4631c && this.f4633e == c0554s.f4633e && Double.compare(this.f4632d, c0554s.f4632d) == 0;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4629a, Double.valueOf(this.f4630b), Double.valueOf(this.f4631c), Double.valueOf(this.f4632d), Integer.valueOf(this.f4633e)});
    }

    public final String toString() {
        Y2.B b5 = new Y2.B(this);
        b5.g(this.f4629a, MediationMetaData.KEY_NAME);
        b5.g(Double.valueOf(this.f4631c), "minBound");
        b5.g(Double.valueOf(this.f4630b), "maxBound");
        b5.g(Double.valueOf(this.f4632d), "percent");
        b5.g(Integer.valueOf(this.f4633e), "count");
        return b5.toString();
    }
}
