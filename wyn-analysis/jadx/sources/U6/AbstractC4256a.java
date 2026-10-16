package u6;

import A7.AbstractC0279p0;
import E5.InterfaceC0451g;
import J5.y;
import android.media.MediaFormat;
import android.net.Uri;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.os.Bundle;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import ka.AbstractC3256n;
import l8.AbstractC3409K;
import l8.C3406H;
import l8.e0;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: u6.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4256a {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f46659a = {0, 0, 0, 1};

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f46660b = {"", "A", "B", "C"};

    /* renamed from: c, reason: collision with root package name */
    public static final Object f46661c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f46662d = {0, 0, 0, 1};

    /* renamed from: e, reason: collision with root package name */
    public static final float[] f46663e = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* renamed from: f, reason: collision with root package name */
    public static final Object f46664f = new Object();

    /* renamed from: g, reason: collision with root package name */
    public static int[] f46665g = new int[10];

    /* JADX WARN: Removed duplicated region for block: B:63:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0165  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static u6.n A(int r23, int r24, byte[] r25) {
        /*
            Method dump skipped, instructions count: 381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u6.AbstractC4256a.A(int, int, byte[]):u6.n");
    }

    public static void B(MediaFormat mediaFormat, List list) {
        for (int i5 = 0; i5 < list.size(); i5++) {
            mediaFormat.setByteBuffer(AbstractC3256n.g(i5, "csd-"), ByteBuffer.wrap((byte[]) list.get(i5)));
        }
    }

    public static int C(int i5, byte[] bArr) {
        int i10;
        synchronized (f46664f) {
            int i11 = 0;
            int i12 = 0;
            while (i11 < i5) {
                while (true) {
                    if (i11 >= i5 - 2) {
                        i11 = i5;
                        break;
                    }
                    try {
                        if (bArr[i11] == 0 && bArr[i11 + 1] == 0 && bArr[i11 + 2] == 3) {
                            break;
                        }
                        i11++;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i11 < i5) {
                    int[] iArr = f46665g;
                    if (iArr.length <= i12) {
                        f46665g = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    f46665g[i12] = i11;
                    i11 += 3;
                    i12++;
                }
            }
            i10 = i5 - i12;
            int i13 = 0;
            int i14 = 0;
            for (int i15 = 0; i15 < i12; i15++) {
                int i16 = f46665g[i15] - i14;
                System.arraycopy(bArr, i14, bArr, i13, i16);
                int i17 = i13 + i16;
                int i18 = i17 + 1;
                bArr[i17] = 0;
                i13 = i17 + 2;
                bArr[i18] = 0;
                i14 += i16 + 3;
            }
            System.arraycopy(bArr, i14, bArr, i13, i10 - i13);
        }
        return i10;
    }

    public static void D(Exception exc, String str, String str2) {
        E(str, a(str2, exc));
    }

    public static void E(String str, String str2) {
        synchronized (f46661c) {
            Log.w(str, str2);
        }
    }

    public static String a(String str, Throwable th) {
        String strReplace;
        synchronized (f46661c) {
            try {
                if (th != null) {
                    Throwable cause = th;
                    while (true) {
                        if (cause == null) {
                            strReplace = Log.getStackTraceString(th).trim().replace("\t", "    ");
                            break;
                        }
                        if (cause instanceof UnknownHostException) {
                            strReplace = "UnknownHostException (no network)";
                        } else {
                            cause = cause.getCause();
                        }
                    }
                } else {
                    strReplace = null;
                }
            } finally {
            }
        }
        if (TextUtils.isEmpty(strReplace)) {
            return str;
        }
        StringBuilder sbQ = AbstractC0279p0.q(str, "\n  ");
        sbQ.append(strReplace.replace("\n", "\n  "));
        sbQ.append('\n');
        return sbQ.toString();
    }

    public static void b(String str) {
        if (v.f46721a >= 18) {
            Trace.beginSection(str);
        }
    }

    public static String c(int i5, boolean z2, int i10, int i11, int[] iArr, int i12) {
        Object[] objArr = {f46660b[i5], Integer.valueOf(i10), Integer.valueOf(i11), Character.valueOf(z2 ? 'H' : 'L'), Integer.valueOf(i12)};
        int i13 = v.f46721a;
        StringBuilder sb2 = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i14 = 0; i14 < length; i14++) {
            sb2.append(String.format(".%02X", Integer.valueOf(iArr[i14])));
        }
        return sb2.toString();
    }

    public static void d(String str, boolean z2) {
        if (!z2) {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    public static void e(boolean z2) {
        if (!z2) {
            throw new IllegalArgumentException();
        }
    }

    public static void f() throws C4261f {
        StringBuilder sb2 = new StringBuilder();
        boolean z2 = false;
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                break;
            }
            if (z2) {
                sb2.append('\n');
            }
            sb2.append("glError: ");
            sb2.append(GLU.gluErrorString(iGlGetError));
            z2 = true;
        }
        if (z2) {
            throw new C4261f(sb2.toString());
        }
    }

    public static void g(String str, boolean z2) throws C4261f {
        if (!z2) {
            throw new C4261f(str);
        }
    }

    public static void h(int i5, int i10) {
        if (i5 < 0 || i5 >= i10) {
            throw new IndexOutOfBoundsException();
        }
    }

    public static void i(boolean z2) {
        if (!z2) {
            throw new IllegalStateException();
        }
    }

    public static void j(Object obj) {
        if (obj == null) {
            throw new IllegalStateException();
        }
    }

    public static void k(Object obj, String str) {
        if (obj == null) {
            throw new IllegalStateException(String.valueOf(str));
        }
    }

    public static void l(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static FloatBuffer m(float[] fArr) {
        return (FloatBuffer) ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr).flip();
    }

    public static void n(String str, String str2) {
        synchronized (f46661c) {
            Log.d(str, str2);
        }
    }

    public static void o(String str, String str2) {
        synchronized (f46661c) {
            Log.e(str, str2);
        }
    }

    public static void p(String str, String str2, Throwable th) {
        o(str, a(str2, th));
    }

    public static void q() {
        if (v.f46721a >= 18) {
            Trace.endSection();
        }
    }

    public static int r(byte[] bArr, int i5, int i10, boolean[] zArr) {
        int i11 = i10 - i5;
        i(i11 >= 0);
        if (i11 == 0) {
            return i10;
        }
        if (zArr[0]) {
            l(zArr);
            return i5 - 3;
        }
        if (i11 > 1 && zArr[1] && bArr[i5] == 1) {
            l(zArr);
            return i5 - 2;
        }
        if (i11 > 2 && zArr[2] && bArr[i5] == 0 && bArr[i5 + 1] == 1) {
            l(zArr);
            return i5 - 1;
        }
        int i12 = i10 - 1;
        int i13 = i5 + 2;
        while (i13 < i12) {
            byte b5 = bArr[i13];
            if ((b5 & 254) == 0) {
                int i14 = i13 - 2;
                if (bArr[i14] == 0 && bArr[i13 - 1] == 0 && b5 == 1) {
                    l(zArr);
                    return i14;
                }
                i13 -= 2;
            }
            i13 += 3;
        }
        zArr[0] = i11 <= 2 ? !(i11 != 2 ? !(zArr[1] && bArr[i12] == 1) : !(zArr[2] && bArr[i10 + (-2)] == 0 && bArr[i12] == 1)) : bArr[i10 + (-3)] == 0 && bArr[i10 + (-2)] == 0 && bArr[i12] == 1;
        zArr[1] = i11 <= 1 ? zArr[2] && bArr[i12] == 0 : bArr[i10 + (-2)] == 0 && bArr[i12] == 0;
        zArr[2] = bArr[i12] == 0;
        return i10;
    }

    public static e0 s(InterfaceC0451g interfaceC0451g, ArrayList arrayList) {
        C3406H c3406hI = AbstractC3409K.i();
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            Bundle bundle = (Bundle) arrayList.get(i5);
            bundle.getClass();
            c3406hI.a(interfaceC0451g.e(bundle));
        }
        return c3406hI.g();
    }

    public static String t(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i5 = 0; i5 < attributeCount; i5++) {
            if (xmlPullParser.getAttributeName(i5).equals(str)) {
                return xmlPullParser.getAttributeValue(i5);
            }
        }
        return null;
    }

    public static void u(String str, String str2) {
        synchronized (f46661c) {
            Log.i(str, str2);
        }
    }

    public static int v(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
            return 0;
        }
        if (lastPathSegment.endsWith(".ac4")) {
            return 1;
        }
        if (lastPathSegment.endsWith(".adts") || lastPathSegment.endsWith(".aac")) {
            return 2;
        }
        if (lastPathSegment.endsWith(".amr")) {
            return 3;
        }
        if (lastPathSegment.endsWith(".flac")) {
            return 4;
        }
        if (lastPathSegment.endsWith(".flv")) {
            return 5;
        }
        if (lastPathSegment.endsWith(".mid") || lastPathSegment.endsWith(".midi") || lastPathSegment.endsWith(".smf")) {
            return 15;
        }
        if (lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".webm")) {
            return 6;
        }
        if (lastPathSegment.endsWith(".mp3")) {
            return 7;
        }
        if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
            return 8;
        }
        if (lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".opus")) {
            return 9;
        }
        if (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) {
            return 10;
        }
        if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
            return 11;
        }
        if (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) {
            return 12;
        }
        if (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) {
            return 13;
        }
        if (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) {
            return 14;
        }
        return lastPathSegment.endsWith(".avi") ? 16 : -1;
    }

    public static boolean w(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals(str);
    }

    public static boolean x(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals(str);
    }

    public static void y(MediaFormat mediaFormat, String str, int i5) {
        if (i5 != -1) {
            mediaFormat.setInteger(str, i5);
        }
    }

    public static l z(int i5, int i10, byte[] bArr) {
        int i11;
        int i12;
        int i13;
        int i14 = 2;
        y yVar = new y(i5 + 2, bArr, i10, 7);
        int i15 = 4;
        yVar.t(4);
        int i16 = yVar.i(3);
        yVar.s();
        int i17 = yVar.i(2);
        boolean zH = yVar.h();
        int i18 = yVar.i(5);
        int i19 = 0;
        for (int i20 = 0; i20 < 32; i20++) {
            if (yVar.h()) {
                i19 |= 1 << i20;
            }
        }
        int i21 = 6;
        int[] iArr = new int[6];
        for (int i22 = 0; i22 < 6; i22++) {
            iArr[i22] = yVar.i(8);
        }
        int i23 = i19;
        int i24 = yVar.i(8);
        int i25 = 0;
        for (int i26 = 0; i26 < i16; i26++) {
            if (yVar.h()) {
                i25 += 89;
            }
            if (yVar.h()) {
                i25 += 8;
            }
        }
        yVar.t(i25);
        if (i16 > 0) {
            yVar.t((8 - i16) * 2);
        }
        yVar.m();
        int iM = yVar.m();
        if (iM == 3) {
            yVar.s();
        }
        int iM2 = yVar.m();
        int iM3 = yVar.m();
        if (yVar.h()) {
            int iM4 = yVar.m();
            int iM5 = yVar.m();
            int iM6 = yVar.m();
            int iM7 = yVar.m();
            iM2 -= (iM4 + iM5) * ((iM == 1 || iM == 2) ? 2 : 1);
            iM3 -= (iM6 + iM7) * (iM == 1 ? 2 : 1);
        }
        yVar.m();
        yVar.m();
        int iM8 = yVar.m();
        for (int i27 = yVar.h() ? 0 : i16; i27 <= i16; i27++) {
            yVar.m();
            yVar.m();
            yVar.m();
        }
        yVar.m();
        yVar.m();
        yVar.m();
        yVar.m();
        yVar.m();
        yVar.m();
        if (yVar.h() && yVar.h()) {
            int i28 = 0;
            while (i28 < i15) {
                int i29 = 0;
                while (i29 < i21) {
                    if (yVar.h()) {
                        int iMin = Math.min(64, 1 << ((i28 << 1) + 4));
                        if (i28 > 1) {
                            yVar.n();
                        }
                        for (int i30 = 0; i30 < iMin; i30++) {
                            yVar.n();
                        }
                    } else {
                        yVar.m();
                    }
                    i29 += i28 == 3 ? 3 : 1;
                    i21 = 6;
                }
                i28++;
                i15 = 4;
                i21 = 6;
            }
        }
        yVar.t(2);
        if (yVar.h()) {
            yVar.t(8);
            yVar.m();
            yVar.m();
            yVar.s();
        }
        int iM9 = yVar.m();
        int[] iArrCopyOf = new int[0];
        int[] iArrCopyOf2 = new int[0];
        int i31 = -1;
        int i32 = 0;
        int i33 = -1;
        while (i32 < iM9) {
            if (i32 == 0 || !yVar.h()) {
                i11 = i14;
                i12 = iM9;
                i13 = iM8;
                int iM10 = yVar.m();
                int iM11 = yVar.m();
                int[] iArr2 = new int[iM10];
                for (int i34 = 0; i34 < iM10; i34++) {
                    iArr2[i34] = yVar.m() + 1;
                    yVar.s();
                }
                int[] iArr3 = new int[iM11];
                for (int i35 = 0; i35 < iM11; i35++) {
                    iArr3[i35] = yVar.m() + 1;
                    yVar.s();
                }
                i31 = iM10;
                iArrCopyOf2 = iArr3;
                iArrCopyOf = iArr2;
                i33 = iM11;
            } else {
                i11 = i14;
                int i36 = i31 + i33;
                int iM12 = (1 - ((yVar.h() ? 1 : 0) * 2)) * (yVar.m() + 1);
                i12 = iM9;
                int i37 = i36 + 1;
                int[] iArr4 = iArrCopyOf;
                boolean[] zArr = new boolean[i37];
                for (int i38 = 0; i38 <= i36; i38++) {
                    if (yVar.h()) {
                        zArr[i38] = true;
                    } else {
                        zArr[i38] = yVar.h();
                    }
                }
                int[] iArr5 = new int[i37];
                int[] iArr6 = new int[i37];
                int i39 = 0;
                for (int i40 = i33 - 1; i40 >= 0; i40--) {
                    int i41 = iArrCopyOf2[i40] + iM12;
                    if (i41 < 0 && zArr[i31 + i40]) {
                        iArr5[i39] = i41;
                        i39++;
                    }
                }
                if (iM12 < 0 && zArr[i36]) {
                    iArr5[i39] = iM12;
                    i39++;
                }
                int i42 = i39;
                i13 = iM8;
                for (int i43 = 0; i43 < i31; i43++) {
                    int i44 = iArr4[i43] + iM12;
                    if (i44 < 0 && zArr[i43]) {
                        iArr5[i42] = i44;
                        i42++;
                    }
                }
                iArrCopyOf = Arrays.copyOf(iArr5, i42);
                int i45 = 0;
                for (int i46 = i31 - 1; i46 >= 0; i46--) {
                    int i47 = iArr4[i46] + iM12;
                    if (i47 > 0 && zArr[i46]) {
                        iArr6[i45] = i47;
                        i45++;
                    }
                }
                if (iM12 > 0 && zArr[i36]) {
                    iArr6[i45] = iM12;
                    i45++;
                }
                int i48 = i42;
                int i49 = i45;
                for (int i50 = 0; i50 < i33; i50++) {
                    int i51 = iArrCopyOf2[i50] + iM12;
                    if (i51 > 0 && zArr[i31 + i50]) {
                        iArr6[i49] = i51;
                        i49++;
                    }
                }
                iArrCopyOf2 = Arrays.copyOf(iArr6, i49);
                i33 = i49;
                i31 = i48;
            }
            i32++;
            i14 = i11;
            iM9 = i12;
            iM8 = i13;
        }
        int i52 = i14;
        int i53 = iM8;
        if (yVar.h()) {
            for (int i54 = 0; i54 < yVar.m(); i54++) {
                yVar.t(i53 + 5);
            }
        }
        yVar.t(i52);
        float f10 = 1.0f;
        if (yVar.h()) {
            if (yVar.h()) {
                int i55 = yVar.i(8);
                if (i55 == 255) {
                    int i56 = yVar.i(16);
                    int i57 = yVar.i(16);
                    if (i56 != 0 && i57 != 0) {
                        f10 = i56 / i57;
                    }
                } else if (i55 < 17) {
                    f10 = f46663e[i55];
                } else {
                    AbstractC0279p0.u(i55, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil");
                }
            }
            if (yVar.h()) {
                yVar.s();
            }
            if (yVar.h()) {
                yVar.t(4);
                if (yVar.h()) {
                    yVar.t(24);
                }
            }
            if (yVar.h()) {
                yVar.m();
                yVar.m();
            }
            yVar.s();
            if (yVar.h()) {
                iM3 *= 2;
            }
        }
        return new l(i17, zH, i18, i23, iArr, i24, iM2, iM3, f10);
    }
}
