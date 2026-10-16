package N1;

import android.net.Uri;
import java.util.Arrays;

/* renamed from: N1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0752a {

    /* renamed from: a, reason: collision with root package name */
    public final int f8129a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8130b;

    /* renamed from: c, reason: collision with root package name */
    public final Uri[] f8131c;

    /* renamed from: d, reason: collision with root package name */
    public final C0773w[] f8132d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f8133e;

    /* renamed from: f, reason: collision with root package name */
    public final long[] f8134f;

    static {
        N0.a.k(0, 1, 2, 3, 4);
        Q1.x.E(5);
        Q1.x.E(6);
        Q1.x.E(7);
        Q1.x.E(8);
    }

    public C0752a(int i5, int i10, int[] iArr, C0773w[] c0773wArr, long[] jArr) {
        Uri uri;
        int i11 = 0;
        Q1.k.c(iArr.length == c0773wArr.length);
        this.f8129a = i5;
        this.f8130b = i10;
        this.f8133e = iArr;
        this.f8132d = c0773wArr;
        this.f8134f = jArr;
        this.f8131c = new Uri[c0773wArr.length];
        while (true) {
            Uri[] uriArr = this.f8131c;
            if (i11 >= uriArr.length) {
                return;
            }
            C0773w c0773w = c0773wArr[i11];
            if (c0773w == null) {
                uri = null;
            } else {
                C0770t c0770t = c0773w.f8272b;
                c0770t.getClass();
                uri = c0770t.f8264a;
            }
            uriArr[i11] = uri;
            i11++;
        }
    }

    public final int a(int i5) {
        int i10;
        int i11 = i5 + 1;
        while (true) {
            int[] iArr = this.f8133e;
            if (i11 >= iArr.length || (i10 = iArr[i11]) == 0 || i10 == 1) {
                break;
            }
            i11++;
        }
        return i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0752a.class != obj.getClass()) {
            return false;
        }
        C0752a c0752a = (C0752a) obj;
        return this.f8129a == c0752a.f8129a && this.f8130b == c0752a.f8130b && Arrays.equals(this.f8132d, c0752a.f8132d) && Arrays.equals(this.f8133e, c0752a.f8133e) && Arrays.equals(this.f8134f, c0752a.f8134f);
    }

    public final int hashCode() {
        int i5 = ((this.f8129a * 31) + this.f8130b) * 31;
        int i10 = (int) 0;
        return (((Arrays.hashCode(this.f8134f) + ((Arrays.hashCode(this.f8133e) + ((Arrays.hashCode(this.f8132d) + ((i5 + i10) * 31)) * 31)) * 31)) * 31) + i10) * 31;
    }
}
