package Va;

import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes4.dex */
public final class Y9 extends G9 implements View.OnTouchListener {

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f13878c = {643679466, 1990603446, 937392882, -1435497678, -1206316122, -632523459, -128684757, 713104310, -1948639527, -551486796, -575105425, 279257216, -1987243815, -798791434, -796104397, 1659390285, -660380882, -1052543145};

    /* renamed from: d, reason: collision with root package name */
    public static int f13879d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static int f13880e = 1;

    /* renamed from: b, reason: collision with root package name */
    public X9 f13881b;

    public static String a(int i5, int[] iArr) {
        String str;
        synchronized (AbstractC0897a.f13930n) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f13878c.clone();
                AbstractC0897a.k = 0;
                while (true) {
                    int i10 = AbstractC0897a.k;
                    if (i10 < iArr.length) {
                        int i11 = iArr[i10];
                        char c10 = (char) (i11 >> 16);
                        cArr[0] = c10;
                        char c11 = (char) i11;
                        cArr[1] = c11;
                        int i12 = iArr[i10 + 1];
                        char c12 = (char) (i12 >> 16);
                        cArr[2] = c12;
                        char c13 = (char) i12;
                        cArr[3] = c13;
                        AbstractC0897a.f13928l = (c10 << 16) + c11;
                        AbstractC0897a.f13929m = (c12 << 16) + c13;
                        AbstractC0897a.o(iArr2);
                        for (int i13 = 0; i13 < 16; i13++) {
                            int i14 = AbstractC0897a.f13928l ^ iArr2[i13];
                            AbstractC0897a.f13928l = i14;
                            int iG = AbstractC0897a.G(i14) ^ AbstractC0897a.f13929m;
                            int i15 = AbstractC0897a.f13928l;
                            AbstractC0897a.f13928l = iG;
                            AbstractC0897a.f13929m = i15;
                        }
                        int i16 = AbstractC0897a.f13928l;
                        int i17 = AbstractC0897a.f13929m;
                        AbstractC0897a.f13928l = i17;
                        AbstractC0897a.f13929m = i16;
                        int i18 = i16 ^ iArr2[16];
                        AbstractC0897a.f13929m = i18;
                        int i19 = iArr2[17] ^ i17;
                        AbstractC0897a.f13928l = i19;
                        cArr[0] = (char) (i19 >>> 16);
                        cArr[1] = (char) i19;
                        cArr[2] = (char) (i18 >>> 16);
                        cArr[3] = (char) i18;
                        AbstractC0897a.o(iArr2);
                        int i20 = AbstractC0897a.k;
                        int i21 = i20 << 1;
                        cArr2[i21] = cArr[0];
                        cArr2[i21 + 1] = cArr[1];
                        cArr2[i21 + 2] = cArr[2];
                        cArr2[i21 + 3] = cArr[3];
                        AbstractC0897a.k = i20 + 2;
                    } else {
                        str = new String(cArr2, 0, i5);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i5 = f13880e + 115;
        f13879d = i5 % 128;
        int i10 = i5 % 2;
        X9 x92 = this.f13881b;
        try {
        } catch (Throwable th) {
            Ab.a0(a(TextUtils.lastIndexOf("", '0') + 25, new int[]{-619674477, 492407912, 715865185, 159038804, 581064256, 466261788, -244048829, 2054315667, -242700521, -843233620, -463594287, 402181104}).intern(), a(28 - View.MeasureSpec.getMode(0), new int[]{-1017879121, -659549536, -924672409, 1064925788, -645111218, 1974626373, 1595602134, 695721593, -896341047, 1845836084, -891248376, 2049497812, -980645303, -737813008}).intern(), th, false);
        }
        if (i10 != 0) {
            x92.a(this, view, motionEvent);
            throw null;
        }
        x92.a(this, view, motionEvent);
        Object obj = this.f13381a;
        if (obj == null) {
            f13880e = (f13879d + 29) % 128;
            return false;
        }
        boolean zOnTouch = ((View.OnTouchListener) obj).onTouch(view, motionEvent);
        int i11 = f13879d + 17;
        f13880e = i11 % 128;
        if (i11 % 2 != 0) {
            return zOnTouch;
        }
        throw null;
    }
}
