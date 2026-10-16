package Va;

import android.graphics.drawable.Drawable;
import android.os.Process;
import android.view.KeyEvent;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: Va.z8, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1227z8 extends AbstractC1215y8 {

    /* renamed from: e, reason: collision with root package name */
    public static int f14843e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static int f14844f = 1;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC1215y8[] f14845d;

    public C1227z8(ArrayList arrayList) {
        AbstractC1215y8[] abstractC1215y8Arr = new AbstractC1215y8[arrayList.size()];
        this.f14845d = abstractC1215y8Arr;
        arrayList.toArray(abstractC1215y8Arr);
    }

    public static String e(char c10, String str, String str2, int i5) {
        String str3;
        char[] charArray = str2.toCharArray();
        char[] charArray2 = str.toCharArray();
        char[] charArray3 = "叭撀\uef56ꌰ".toCharArray();
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
                        long j8 = (charArray[i10] ^ c12) ^ (-6687582292312828947L);
                        long j10 = 0;
                        cArr3[i10] = (char) ((j8 ^ j10) ^ j10);
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

    @Override // Va.AbstractC1215y8
    public final C1139s8 b(C1203x8 c1203x8, C1214y7 c1214y7) {
        ArrayList arrayList = new ArrayList();
        AbstractC1215y8[] abstractC1215y8Arr = this.f14845d;
        int length = abstractC1215y8Arr.length;
        int i5 = 0;
        while (i5 < length) {
            int i10 = f14843e + 71;
            f14844f = i10 % 128;
            if (i10 % 2 == 0) {
                arrayList.add(abstractC1215y8Arr[i5].c(c1203x8, c1214y7).c());
                i5 += 23;
            } else {
                arrayList.add(abstractC1215y8Arr[i5].c(c1203x8, c1214y7).c());
                i5++;
            }
            f14843e = (f14844f + 99) % 128;
        }
        return new C1139s8(arrayList);
    }

    public final boolean equals(Object obj) {
        int i5 = f14843e + 27;
        int i10 = i5 % 128;
        f14844f = i10;
        if (i5 % 2 == 0) {
            int i11 = 70 / 0;
            if (this == obj) {
                return true;
            }
        } else if (this == obj) {
            return true;
        }
        if (obj != null) {
            int i12 = i10 + 121;
            f14843e = i12 % 128;
            if (i12 % 2 != 0) {
                obj.getClass();
                throw null;
            }
            if (C1227z8.class == obj.getClass()) {
                return Arrays.equals(this.f14845d, ((C1227z8) obj).f14845d);
            }
        }
        return false;
    }

    public final int hashCode() {
        int i5 = f14844f + 63;
        f14843e = i5 % 128;
        int i10 = i5 % 2;
        AbstractC1215y8[] abstractC1215y8Arr = this.f14845d;
        if (i10 != 0) {
            Arrays.hashCode(abstractC1215y8Arr);
            throw null;
        }
        int iHashCode = Arrays.hashCode(abstractC1215y8Arr);
        int i11 = f14843e + 89;
        f14844f = i11 % 128;
        if (i11 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(e((char) (11240 - ((Process.getThreadPriority(0) + 20) >> 6)), "ꥁ쟳\ue8ac怫", "䲏", (-1396182103) - KeyEvent.getDeadChar(0, 0)).intern());
        sb2.append(AbstractC1215y8.d(this.f14845d));
        sb2.append(e((char) (KeyEvent.normalizeMetaState(0) + 46207), "ꪁ桊罔쒴", "桭", 1416121002 - Drawable.resolveOpacity(0, 0)).intern());
        String string = sb2.toString();
        int i5 = f14844f + 81;
        f14843e = i5 % 128;
        if (i5 % 2 != 0) {
            int i10 = 0 / 0;
        }
        return string;
    }
}
