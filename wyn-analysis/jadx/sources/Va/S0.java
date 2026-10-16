package Va;

import android.graphics.ImageFormat;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import x6.C4481l;
import z6.AbstractC4618a;
import z6.AbstractC4619b;

/* loaded from: classes4.dex */
public final class S0 extends AbstractC4618a implements H9 {

    /* renamed from: d, reason: collision with root package name */
    public static final char[] f13672d = {3560, 59265, 55657, 45806, 42169, 40564, 29655, 25984, 24333, 12541, 10934, 7168, 61933, 60306, 56600, 46829, 43077, 33299, 30712, 26946, 17186, 13503, 11862, '/', 62888, 61249, 49449, 47790, 44153, 34356, 31639, 27968, 18125, 14525, 4726, 1984, 63917, 54132, 50397, 'A', 59944, 54464, 48967, 43280, 37853, 32382, 26665, 21156, 15700, 10015, 4521, 64580, 58939, 53425, 47940, 42476, 36794, 31313, 25835, 20107, 14614, 9215, 3462, 63489, 58088, 52352, 46855, 41424, 35741, 30270, 24809, 19300, 13598, 8145, 2657, 62476, 57053, 51572, 45884, 40367, 34900, 29215, 23721, 18244, 50340, 11981, 4133, 31650, 28149, 22328, 47771, 44236, 38465, 63921, 58362, 54604, 14497, 8926, 5204, 32673, 24841, 19295, 48820, 40974, 35438, 65011, 59162, 51555, 15588, 9741, 2149, 29666, 25909, 20344, 45787, 41996, 36737, 61947, 56116, 52868, 12521, 6712, 3473, 30681, 22858, 19633, 46842, 38988, 33697, 62922, 57180, 49849, 13325, 7800, 423, 27423, 23914, 16559, 4484, 64493, 50437, 44674, 47317, 33304, 28603, 31212, 17249, 11409, 14042, 'l', 60801, 63486, 49524, 43649, 46121, 40575, 27540, 29998, 24398, 10451, 12858, 7235, 59844, 62265, 56697, 42722, 45060, 39513, 26608, 28937, 'A', 59944, 54464, 48967, 43280, 37853, 32382, 26665, 21156, 15700, 10015, 4521, 64580, 58939, 53425, 47940, 42476, 36794, 31313, 25835, 20107, 14614, 9215, 3462, 63489, 58108, 52406, 46889, 41417, 35732, 30261, 24780, 19284, 13623, 8188, 2663, 62465, 57052};

    /* renamed from: e, reason: collision with root package name */
    public static int f13673e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static int f13674f = 1;

    /* renamed from: a, reason: collision with root package name */
    public AbstractC4618a f13675a;

    /* renamed from: b, reason: collision with root package name */
    public Ra f13676b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ W0 f13677c;

    public static String a(int i5, int i10, char c10) {
        String str;
        synchronized (Ab.f13218u) {
            try {
                char[] cArr = new char[i10];
                Ab.f13217t = 0;
                while (true) {
                    int i11 = Ab.f13217t;
                    if (i11 < i10) {
                        cArr[i11] = (char) ((f13672d[i5 + i11] ^ (i11 * (-6567213704747029928L))) ^ c10);
                        Ab.f13217t = i11 + 1;
                    } else {
                        str = new String(cArr);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    public final void b(AbstractC4619b abstractC4619b) {
        f13674f = (f13673e + 11) % 128;
        this.f13677c.B0(this, this.f13676b, a(138 - (KeyEvent.getMaxKeyCode() >> 16), (ViewConfiguration.getTapTimeout() >> 16) + 32, (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 4549)).intern(), abstractC4619b);
        AbstractC4618a abstractC4618a = this.f13675a;
        if (abstractC4618a != null) {
            int i5 = f13674f + 29;
            f13673e = i5 % 128;
            int i10 = i5 % 2;
            abstractC4618a.onAdLoaded(abstractC4619b);
            if (i10 != 0) {
                int i11 = 60 / 0;
            }
        }
        f13673e = (f13674f + 57) % 128;
    }

    @Override // Va.H9
    public final Object d() {
        int i5 = (f13674f + 73) % 128;
        f13673e = i5;
        int i10 = i5 + 7;
        f13674f = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
        int i11 = i5 + 9;
        f13674f = i11 % 128;
        if (i11 % 2 != 0) {
            return this.f13675a;
        }
        throw null;
    }

    @Override // x6.AbstractC4473d
    public final void onAdFailedToLoad(C4481l c4481l) {
        f13674f = (f13673e + 121) % 128;
        this.f13677c.B0(this, this.f13676b, a(169 - TextUtils.indexOf((CharSequence) "", '0', 0), 37 - ImageFormat.getBitsPerPixel(0), (char) (MotionEvent.axisFromString("") + 1)).intern(), c4481l);
        AbstractC4618a abstractC4618a = this.f13675a;
        if (abstractC4618a != null) {
            f13674f = (f13673e + 83) % 128;
            abstractC4618a.onAdFailedToLoad(c4481l);
        }
    }

    @Override // x6.AbstractC4473d
    public final /* synthetic */ void onAdLoaded(Object obj) {
        int i5 = f13673e + 35;
        f13674f = i5 % 128;
        int i10 = i5 % 2;
        b((AbstractC4619b) obj);
        if (i10 == 0) {
            int i11 = 23 / 0;
        }
        int i12 = f13674f + 67;
        f13673e = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }
}
