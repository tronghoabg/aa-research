package o8;

import Fe.e;
import com.applovin.shadow.okhttp3.HttpUrl;
import java.io.Serializable;

/* renamed from: o8.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3655a implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f41424c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int[] f41425a;

    /* renamed from: b, reason: collision with root package name */
    public final int f41426b;

    static {
        new C3655a(new int[0]);
    }

    public C3655a(int[] iArr) {
        int length = iArr.length;
        this.f41425a = iArr;
        this.f41426b = length;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3655a) {
            C3655a c3655a = (C3655a) obj;
            int i5 = c3655a.f41426b;
            int i10 = this.f41426b;
            if (i10 == i5) {
                for (int i11 = 0; i11 < i10; i11++) {
                    e.s(i11, i10);
                    int i12 = this.f41425a[i11];
                    e.s(i11, c3655a.f41426b);
                    if (i12 == c3655a.f41425a[i11]) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i5 = 1;
        for (int i10 = 0; i10 < this.f41426b; i10++) {
            i5 = (i5 * 31) + this.f41425a[i10];
        }
        return i5;
    }

    public final String toString() {
        int i5 = this.f41426b;
        if (i5 == 0) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuilder sb2 = new StringBuilder(i5 * 5);
        sb2.append('[');
        int[] iArr = this.f41425a;
        sb2.append(iArr[0]);
        for (int i10 = 1; i10 < i5; i10++) {
            sb2.append(", ");
            sb2.append(iArr[i10]);
        }
        sb2.append(']');
        return sb2.toString();
    }
}
