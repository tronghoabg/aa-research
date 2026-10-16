package N1;

import java.util.Arrays;

/* renamed from: N1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0753b {

    /* renamed from: c, reason: collision with root package name */
    public static final C0753b f8135c = new C0753b(new C0752a[0]);

    /* renamed from: d, reason: collision with root package name */
    public static final C0752a f8136d;

    /* renamed from: a, reason: collision with root package name */
    public final int f8137a;

    /* renamed from: b, reason: collision with root package name */
    public final C0752a[] f8138b;

    static {
        C0752a c0752a = new C0752a(-1, -1, new int[0], new C0773w[0], new long[0]);
        int[] iArr = c0752a.f8133e;
        int length = iArr.length;
        int iMax = Math.max(0, length);
        int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
        Arrays.fill(iArrCopyOf, length, iMax, 0);
        long[] jArr = c0752a.f8134f;
        int length2 = jArr.length;
        int iMax2 = Math.max(0, length2);
        long[] jArrCopyOf = Arrays.copyOf(jArr, iMax2);
        Arrays.fill(jArrCopyOf, length2, iMax2, -9223372036854775807L);
        f8136d = new C0752a(0, c0752a.f8130b, iArrCopyOf, (C0773w[]) Arrays.copyOf(c0752a.f8132d, 0), jArrCopyOf);
        Q1.x.E(1);
        Q1.x.E(2);
        Q1.x.E(3);
        Q1.x.E(4);
    }

    public C0753b(C0752a[] c0752aArr) {
        this.f8137a = c0752aArr.length;
        this.f8138b = c0752aArr;
    }

    public final C0752a a(int i5) {
        return i5 < 0 ? f8136d : this.f8138b[i5];
    }

    public final boolean b(int i5) {
        if (i5 != this.f8137a - 1) {
            return false;
        }
        a(i5).getClass();
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0753b.class != obj.getClass()) {
            return false;
        }
        C0753b c0753b = (C0753b) obj;
        int i5 = Q1.x.f9724a;
        return this.f8137a == c0753b.f8137a && Arrays.equals(this.f8138b, c0753b.f8138b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f8138b) + (((((this.f8137a * 961) + ((int) 0)) * 31) + ((int) (-9223372036854775807L))) * 961);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdPlaybackState(adsId=null, adResumePositionUs=0, adGroups=[");
        int i5 = 0;
        while (true) {
            C0752a[] c0752aArr = this.f8138b;
            if (i5 >= c0752aArr.length) {
                sb2.append("])");
                return sb2.toString();
            }
            sb2.append("adGroup(timeUs=0, ads=[");
            c0752aArr[i5].getClass();
            for (int i10 = 0; i10 < c0752aArr[i5].f8133e.length; i10++) {
                sb2.append("ad(state=");
                int i11 = c0752aArr[i5].f8133e[i10];
                if (i11 == 0) {
                    sb2.append('_');
                } else if (i11 == 1) {
                    sb2.append('R');
                } else if (i11 == 2) {
                    sb2.append('S');
                } else if (i11 == 3) {
                    sb2.append('P');
                } else if (i11 != 4) {
                    sb2.append('?');
                } else {
                    sb2.append('!');
                }
                sb2.append(", durationUs=");
                sb2.append(c0752aArr[i5].f8134f[i10]);
                sb2.append(')');
                if (i10 < c0752aArr[i5].f8133e.length - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append("])");
            if (i5 < c0752aArr.length - 1) {
                sb2.append(", ");
            }
            i5++;
        }
    }
}
