package defpackage;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import com.carstream.tech.car.CarScreen;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class r6 {
    public static volatile int r;
    public static volatile int s;
    public static volatile String t;
    public final c1 a;
    public FrameLayout b;
    public SurfaceView c;
    public volatile Surface d;
    public MediaCodec e;
    public volatile boolean f = false;
    public volatile int g = 0;
    public volatile int h = 0;
    public volatile boolean i = false;
    public volatile boolean j = false;
    public volatile boolean k = false;
    public volatile boolean l = false;
    public volatile int m = 0;
    public final Object n = new Object();
    public volatile boolean o = false;
    public volatile boolean p = false;
    public volatile int q = 0;

    public r6(CarScreen carScreen, c1 c1Var) {
        this.a = c1Var;
    }

    public static void a(r6 r6Var, l7 l7Var, View view, MotionEvent motionEvent, int i, int i2) {
        int[] iArr;
        int[] iArr2;
        char c;
        char c2;
        int pointerId = motionEvent.getPointerId(i);
        int x = (int) motionEvent.getX(i);
        int y = (int) motionEvent.getY(i);
        int width = view.getWidth();
        int height = view.getHeight();
        int i3 = r6Var.g;
        int i4 = r6Var.h;
        if (width <= 0 || height <= 0 || i3 <= 0 || i4 <= 0) {
            if (!r6Var.k) {
                r6Var.k = true;
                u5.d("CHAM: TOA DO THO (co the LECH NUT) — view " + width + "x" + height + ", luong " + i3 + "x" + i4);
            }
            iArr = new int[]{x, y};
        } else {
            r6Var.k = false;
            iArr = new int[]{(i3 * x) / width, (i4 * y) / height};
        }
        int i5 = (i2 & 255) | ((pointerId & 255) << 8);
        r++;
        if (pointerId > 0 && !r6Var.l) {
            r6Var.l = true;
            u5.d("CHAM: " + (pointerId + 1) + "n");
        }
        if (r <= 12) {
            c = 0;
            c2 = 1;
            iArr2 = iArr;
            u5.d("CHAM #" + r + " ngon" + pointerId + " man(" + x + "," + y + ") o " + view.getWidth() + "x" + view.getHeight() + " -> luong(" + iArr[0] + "," + iArr[1] + ") cua " + r6Var.g + "x" + r6Var.h + " type=" + i2 + " noi=" + l7Var.d());
        } else {
            iArr2 = iArr;
            c = 0;
            c2 = 1;
        }
        view.getWidth();
        view.getHeight();
        try {
            if (!l7Var.j(iArr2[c], iArr2[c2], i5)) {
                if (r <= 12) {
                    u5.d("CHAM #" + r + " KHONG GUI DUOC (xem dong MIRROR ben tren)");
                    return;
                }
                return;
            }
            s++;
            if (s <= 12) {
                u5.d("CHAM #" + r + " da gui OK");
            }
        } catch (Throwable th) {
            t = ad.c(th.getClass().getSimpleName(), th.getMessage() != null ? ad.g(" ", th.getMessage()) : "");
            u5.d("CHAM #" + r + " GUI HONG: " + t);
        }
    }

    public static int[] d(byte[] bArr) {
        int i;
        int i2;
        int iD;
        int iD2;
        int iD3;
        int iD4;
        int iD5 = 0;
        int i3 = 0;
        while (true) {
            i = 1;
            if (i3 + 4 >= bArr.length) {
                i2 = -1;
                break;
            }
            byte b = bArr[i3];
            int i4 = b == 0 && bArr[i3 + 1] == 0 && bArr[i3 + 2] == 0 && bArr[i3 + 3] == 1 ? 4 : b == 0 && bArr[i3 + 1] == 0 && bArr[i3 + 2] == 1 ? 3 : 0;
            if (i4 > 0) {
                int i5 = i4 + i3;
                if ((bArr[i5] & 31) == 7) {
                    i2 = i5 + 1;
                    break;
                }
            }
            i3++;
        }
        if (i2 < 0 || i2 + 4 >= bArr.length) {
            return null;
        }
        int iMin = Math.min(bArr.length - i2, 128);
        byte[] bArr2 = new byte[iMin];
        int i6 = 0;
        while (i2 < bArr.length && i6 < iMin) {
            int i7 = i2 + 2;
            if (i7 < bArr.length && bArr[i2] == 0 && bArr[i2 + 1] == 0 && bArr[i7] == 3) {
                int i8 = i6 + 1;
                bArr2[i6] = 0;
                if (i8 < iMin) {
                    bArr2[i8] = 0;
                    i8 = i6 + 2;
                }
                i6 = i8;
                i2 = i7;
            } else {
                bArr2[i6] = bArr[i2];
                i6++;
            }
            i2++;
        }
        try {
            q6 q6Var = new q6(i6, bArr2);
            int iC = q6Var.c(8);
            q6Var.c(8);
            q6Var.c(8);
            q6Var.d();
            if (iC == 100 || iC == 110 || iC == 122 || iC == 244 || iC == 44 || iC == 83 || iC == 86 || iC == 118 || iC == 128 || iC == 138 || iC == 139 || iC == 134 || iC == 135) {
                iD = q6Var.d();
                if (iD == 3) {
                    q6Var.c(1);
                }
                q6Var.d();
                q6Var.d();
                q6Var.c(1);
                if (q6Var.c(1) == 1) {
                    int i9 = iD != 3 ? 8 : 12;
                    int i10 = 0;
                    while (i10 < i9) {
                        if (q6Var.c(1) == 1) {
                            int i11 = i10 < 6 ? 16 : 64;
                            int iB = 8;
                            int i12 = 8;
                            for (int i13 = 0; i13 < i11; i13++) {
                                if (iB != 0) {
                                    iB = ((q6Var.b() + i12) + 256) % 256;
                                }
                                if (iB != 0) {
                                    i12 = iB;
                                }
                            }
                        }
                        i10++;
                    }
                }
            } else {
                iD = 1;
            }
            q6Var.d();
            int iD6 = q6Var.d();
            if (iD6 == 0) {
                q6Var.d();
            } else if (iD6 == 1) {
                q6Var.c(1);
                q6Var.b();
                q6Var.b();
                int iD7 = q6Var.d();
                for (int i14 = 0; i14 < iD7 && i14 < 256; i14++) {
                    q6Var.b();
                }
            }
            q6Var.d();
            q6Var.c(1);
            int iD8 = q6Var.d() + 1;
            int iD9 = q6Var.d() + 1;
            int iC2 = q6Var.c(1);
            if (iC2 == 0) {
                q6Var.c(1);
            }
            q6Var.c(1);
            if (q6Var.c(1) == 1) {
                iD5 = q6Var.d();
                iD3 = q6Var.d();
                iD4 = q6Var.d();
                iD2 = q6Var.d();
            } else {
                iD2 = 0;
                iD3 = 0;
                iD4 = 0;
            }
            int i15 = iD == 0 ? 1 : 2;
            int i16 = (iD == 0 || iD == 3) ? 1 : 2;
            int i17 = (iD8 * 16) - ((iD5 + iD3) * i15);
            int i18 = iD9 * 16 * (iC2 == 1 ? 1 : 2);
            int i19 = (iD4 + iD2) * i16;
            if (iC2 != 1) {
                i = 2;
            }
            int i20 = i18 - (i19 * i);
            if (i17 <= 0 || i20 <= 0 || i17 > 8192 || i20 > 8192) {
                return null;
            }
            return new int[]{i17, i20};
        } catch (Throwable unused) {
            return null;
        }
    }

    public final void b() {
        synchronized (this.n) {
            this.f = false;
            this.i = false;
            MediaCodec mediaCodec = this.e;
            this.e = null;
            if (mediaCodec == null) {
                return;
            }
            try {
                mediaCodec.stop();
            } catch (Throwable unused) {
            }
            try {
                mediaCodec.release();
            } catch (Throwable unused2) {
            }
        }
    }

    public final boolean c(byte[] bArr) {
        Surface surface = this.d;
        if (surface != null && surface.isValid()) {
            this.o = false;
            int[] iArrD = d(bArr);
            if (iArrD != null) {
                this.p = false;
                this.g = iArrD[0];
                this.h = iArrD[1];
                try {
                    MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat("video/avc", this.g, this.h);
                    MediaCodec mediaCodecCreateDecoderByType = MediaCodec.createDecoderByType("video/avc");
                    this.e = mediaCodecCreateDecoderByType;
                    mediaCodecCreateDecoderByType.configure(mediaFormatCreateVideoFormat, surface, (MediaCrypto) null, 0);
                    this.e.start();
                    this.f = true;
                    this.i = false;
                    u5.d("GIAI MA: mo OK " + this.g + "x" + this.h);
                    return true;
                } catch (Throwable th) {
                    String.valueOf(th);
                    this.q++;
                    if (this.q <= 5) {
                        u5.d("GIAI MA: MO HONG lan " + this.q + " (" + this.g + "x" + this.h + ") — " + th.getClass().getSimpleName() + ": " + th.getMessage());
                    }
                    this.e = null;
                    return false;
                }
            }
            if (!this.p) {
                this.p = true;
                u5.d("GIAI MA: BO KHUNG — khong doc duoc SPS tu khung khoa (" + bArr.length + " byte)");
                return false;
            }
        } else if (!this.o) {
            this.o = true;
            u5.d("GIAI MA: BO KHUNG — tam ve chua san sang (surface " + (surface == null ? "null" : "khong hop le") + ")");
        }
        return false;
    }
}
