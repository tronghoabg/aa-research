package E;

import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.internal.AbstractC3340k;
import vf.AbstractC4345a;

/* renamed from: E.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0419i {

    /* renamed from: a, reason: collision with root package name */
    public static final C0416f f2743a = new C0416f(0);

    /* renamed from: b, reason: collision with root package name */
    public static final C0416f f2744b = new C0416f(1);

    /* renamed from: c, reason: collision with root package name */
    public static final C0412b f2745c = new C0412b(0);

    static {
        new C0412b(3);
        new C0412b(2);
        new C0412b(1);
    }

    public static void a(int i5, int[] size, int[] outPosition, boolean z2) {
        AbstractC3340k.e(size, "size");
        AbstractC3340k.e(outPosition, "outPosition");
        int i10 = 0;
        int i11 = 0;
        for (int i12 : size) {
            i11 += i12;
        }
        float f10 = (i5 - i11) / 2;
        if (!z2) {
            int length = size.length;
            int i13 = 0;
            while (i10 < length) {
                int i14 = size[i10];
                outPosition[i13] = AbstractC4345a.H(f10);
                f10 += i14;
                i10++;
                i13++;
            }
            return;
        }
        int length2 = size.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i15 = size[length2];
            outPosition[length2] = AbstractC4345a.H(f10);
            f10 += i15;
        }
    }

    public static void b(int[] size, int[] outPosition, boolean z2) {
        AbstractC3340k.e(size, "size");
        AbstractC3340k.e(outPosition, "outPosition");
        int i5 = 0;
        if (!z2) {
            int length = size.length;
            int i10 = 0;
            int i11 = 0;
            while (i5 < length) {
                int i12 = size[i5];
                outPosition[i10] = i11;
                i11 += i12;
                i5++;
                i10++;
            }
            return;
        }
        int length2 = size.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i13 = size[length2];
            outPosition[length2] = i5;
            i5 += i13;
        }
    }

    public static void c(int i5, int[] size, int[] outPosition, boolean z2) {
        AbstractC3340k.e(size, "size");
        AbstractC3340k.e(outPosition, "outPosition");
        int i10 = 0;
        int i11 = 0;
        for (int i12 : size) {
            i11 += i12;
        }
        int i13 = i5 - i11;
        if (!z2) {
            int length = size.length;
            int i14 = 0;
            while (i10 < length) {
                int i15 = size[i10];
                outPosition[i14] = i13;
                i13 += i15;
                i10++;
                i14++;
            }
            return;
        }
        int length2 = size.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i16 = size[length2];
            outPosition[length2] = i13;
            i13 += i16;
        }
    }

    public static void d(int i5, int[] size, int[] outPosition, boolean z2) {
        AbstractC3340k.e(size, "size");
        AbstractC3340k.e(outPosition, "outPosition");
        int i10 = 0;
        int i11 = 0;
        for (int i12 : size) {
            i11 += i12;
        }
        float length = size.length == 0 ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : (i5 - i11) / size.length;
        float f10 = length / 2;
        if (!z2) {
            int length2 = size.length;
            int i13 = 0;
            while (i10 < length2) {
                int i14 = size[i10];
                outPosition[i13] = AbstractC4345a.H(f10);
                f10 += i14 + length;
                i10++;
                i13++;
            }
            return;
        }
        int length3 = size.length;
        while (true) {
            length3--;
            if (-1 >= length3) {
                return;
            }
            int i15 = size[length3];
            outPosition[length3] = AbstractC4345a.H(f10);
            f10 += i15 + length;
        }
    }

    public static void e(int i5, int[] size, int[] outPosition, boolean z2) {
        AbstractC3340k.e(size, "size");
        AbstractC3340k.e(outPosition, "outPosition");
        int i10 = 0;
        int i11 = 0;
        for (int i12 : size) {
            i11 += i12;
        }
        int length = size.length;
        float f10 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float length2 = length > 1 ? (i5 - i11) / (size.length - 1) : 0.0f;
        if (z2) {
            for (int length3 = size.length - 1; -1 < length3; length3--) {
                int i13 = size[length3];
                outPosition[length3] = AbstractC4345a.H(f10);
                f10 += i13 + length2;
            }
            return;
        }
        int length4 = size.length;
        int i14 = 0;
        while (i10 < length4) {
            int i15 = size[i10];
            outPosition[i14] = AbstractC4345a.H(f10);
            f10 += i15 + length2;
            i10++;
            i14++;
        }
    }

    public static void f(int i5, int[] size, int[] outPosition, boolean z2) {
        AbstractC3340k.e(size, "size");
        AbstractC3340k.e(outPosition, "outPosition");
        int i10 = 0;
        int i11 = 0;
        for (int i12 : size) {
            i11 += i12;
        }
        float length = (i5 - i11) / (size.length + 1);
        if (z2) {
            float f10 = length;
            for (int length2 = size.length - 1; -1 < length2; length2--) {
                int i13 = size[length2];
                outPosition[length2] = AbstractC4345a.H(f10);
                f10 += i13 + length;
            }
            return;
        }
        int length3 = size.length;
        float f11 = length;
        int i14 = 0;
        while (i10 < length3) {
            int i15 = size[i10];
            outPosition[i14] = AbstractC4345a.H(f11);
            f11 += i15 + length;
            i10++;
            i14++;
        }
    }
}
