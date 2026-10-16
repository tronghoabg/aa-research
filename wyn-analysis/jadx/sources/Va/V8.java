package Va;

import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class V8 extends AbstractC0946d9 {

    /* renamed from: i, reason: collision with root package name */
    public static int f13788i = 0;

    /* renamed from: j, reason: collision with root package name */
    public static int f13789j = 1;

    /* renamed from: h, reason: collision with root package name */
    public final AbstractC0933c9[] f13790h;

    public V8(ArrayList arrayList, byte b5) {
        super(b5);
        AbstractC0933c9[] abstractC0933c9Arr = new AbstractC0933c9[arrayList.size()];
        this.f13790h = abstractC0933c9Arr;
        arrayList.toArray(abstractC0933c9Arr);
    }

    public static String f(char c10, String str, String str2, int i5) {
        String str3;
        char[] charArray = str2.toCharArray();
        char[] charArray2 = str.toCharArray();
        char[] charArray3 = "\u0000\u0000\u0000\u0000".toCharArray();
        synchronized (AbstractC0897a.f13934r) {
            try {
                char[] cArr = (char[]) charArray2.clone();
                char[] cArr2 = (char[]) charArray3.clone();
                cArr[0] = (char) (c10 ^ cArr[0]);
                cArr2[2] = (char) (cArr2[2] + ((char) i5));
                int length = charArray.length;
                char[] cArr3 = new char[length];
                AbstractC0897a.f13933q = 0;
                while (true) {
                    int i10 = AbstractC0897a.f13933q;
                    if (i10 < length) {
                        int i11 = (i10 + 3) % 4;
                        int i12 = cArr[i10 % 4] * 32718;
                        char c11 = cArr2[(i10 + 2) % 4];
                        char c12 = (char) ((i12 + c11) % Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                        cArr2[i11] = (char) (((cArr[i11] * 32718) + c11) / Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                        cArr[i11] = c12;
                        cArr3[i10] = (char) (((charArray[i10] ^ c12) ^ 1855457386) ^ 0);
                        AbstractC0897a.f13933q = i10 + 1;
                    } else {
                        str3 = new String(cArr3);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str3;
    }

    @Override // Va.AbstractC0933c9
    public final int a() {
        f13788i = (f13789j + 95) % 128;
        AbstractC0933c9[] abstractC0933c9Arr = this.f13790h;
        int length = abstractC0933c9Arr.length;
        int iA = 2;
        int i5 = 0;
        while (i5 < length) {
            f13788i = (f13789j + 55) % 128;
            iA += abstractC0933c9Arr[i5].a();
            i5++;
            f13789j = (f13788i + 29) % 128;
        }
        return iA;
    }

    @Override // Va.AbstractC0933c9
    public final int b(C1203x8 c1203x8) {
        f13789j = (f13788i + 111) % 128;
        int i5 = 0;
        int iA = 0;
        while (true) {
            int i10 = C1203x8.f14771l;
            short s10 = c1203x8.f14779h;
            C1203x8.k = (i10 + 33) % 128;
            if (i5 >= s10) {
                f13789j = (f13788i + 25) % 128;
                return iA;
            }
            iA += this.f13790h[i5].a();
            i5++;
        }
    }

    @Override // Va.AbstractC0933c9
    public final C1139s8 c(C1203x8 c1203x8, C1214y7 c1214y7) {
        C1139s8 c1139s8 = new C1139s8(null);
        C1203x8 c1203x82 = new C1203x8(c1203x8);
        AbstractC0933c9[] abstractC0933c9Arr = this.f13790h;
        int length = abstractC0933c9Arr.length;
        int i5 = 0;
        while (i5 < length) {
            c1139s8 = abstractC0933c9Arr[i5].d(c1203x82, c1214y7);
            if (c1139s8.b() || c1139s8.g()) {
                break;
            }
            int i10 = f13788i + 111;
            f13789j = i10 % 128;
            if (i10 % 2 == 0) {
                C1139s8.f14573g = (C1139s8.f14572f + 121) % 128;
                throw null;
            }
            int i11 = C1139s8.f14572f;
            boolean z2 = c1139s8.f14577d;
            C1139s8.f14573g = (i11 + 121) % 128;
            if (z2) {
                break;
            }
            int i12 = (C1203x8.k + 45) % 128;
            C1203x8.f14771l = i12;
            c1203x8.f14779h = (short) (c1203x8.f14779h + 1);
            int i13 = i12 + 123;
            C1203x8.k = i13 % 128;
            if (i13 % 2 != 0) {
                throw null;
            }
            i5++;
            f13788i = (f13789j + 107) % 128;
        }
        return c1139s8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            f13788i = (f13789j + 81) % 128;
            return true;
        }
        if (obj == null || V8.class != obj.getClass()) {
            int i5 = f13788i + 11;
            f13789j = i5 % 128;
            if (i5 % 2 != 0) {
                return false;
            }
            throw null;
        }
        AbstractC0933c9[] abstractC0933c9Arr = ((V8) obj).f13790h;
        AbstractC0933c9[] abstractC0933c9Arr2 = this.f13790h;
        if (abstractC0933c9Arr2 != null) {
            int i10 = f13788i + 35;
            f13789j = i10 % 128;
            if (i10 % 2 != 0) {
                return abstractC0933c9Arr2.equals(abstractC0933c9Arr);
            }
            abstractC0933c9Arr2.equals(abstractC0933c9Arr);
            throw null;
        }
        if (abstractC0933c9Arr != null) {
            return false;
        }
        int i11 = f13788i + 83;
        f13789j = i11 % 128;
        if (i11 % 2 != 0) {
            return true;
        }
        throw null;
    }

    public final int hashCode() {
        int i5 = f13789j;
        f13788i = (i5 + 15) % 128;
        AbstractC0933c9[] abstractC0933c9Arr = this.f13790h;
        if (abstractC0933c9Arr != null) {
            return abstractC0933c9Arr.hashCode();
        }
        f13788i = (i5 + 125) % 128;
        return 0;
    }

    public final String toString() throws UnsupportedEncodingException {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(f((char) (10257 - (ViewConfiguration.getTouchSlop() >> 8)), "㨳\uf116ᄞጨ", "癸揀", ViewConfiguration.getMinimumFlingVelocity() >> 16).intern());
        AbstractC0933c9[] abstractC0933c9Arr = this.f13790h;
        int length = abstractC0933c9Arr.length;
        int i5 = 0;
        while (true) {
            byte b5 = this.f14109d;
            if (i5 >= length) {
                int i10 = AbstractC0946d9.f14108g + 33;
                AbstractC0946d9.f14107f = i10 % 128;
                if (i10 % 2 != 0) {
                    AbstractC0946d9.e(b5 << (-1), sb2);
                } else {
                    AbstractC0946d9.e(b5 - 1, sb2);
                }
                sb2.append(f((char) (19365 - (KeyEvent.getMaxKeyCode() >> 16)), "릃檇ꕜか", "봦", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1550485432).intern());
                return sb2.toString();
            }
            f13788i = (f13789j + 31) % 128;
            AbstractC0933c9 abstractC0933c9 = abstractC0933c9Arr[i5];
            int i11 = AbstractC0946d9.f14107f + 69;
            AbstractC0946d9.f14108g = i11 % 128;
            int i12 = i11 % 2;
            AbstractC0946d9.e(b5, sb2);
            if (i12 == 0) {
                throw null;
            }
            sb2.append(abstractC0933c9.toString());
            sb2.append(f((char) ((ViewConfiguration.getTapTimeout() >> 16) + 63990), "\uf4dcⱛ\uf64c竹", "\ud832", 1277975540 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern());
            i5++;
            f13789j = (f13788i + 65) % 128;
        }
    }
}
