package Va;

import android.view.View;
import java.io.UnsupportedEncodingException;

/* renamed from: Va.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class ViewOnLayoutChangeListenerC0975g implements View.OnLayoutChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public static final char[] f14185b = {'9', 'k', 'h', 'h', 'i', 'g', 'T', ']', 'k', 'R', '\\', 'n', 'g', '_', '0', 'g', 'j', 'f', 'U', '[', 'r', 'p', 'p', 'I', 'D', 'k', 'G', 'G', 'n', ']', 'V', 'm', 't', 'r', 't', '[', 'U'};

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ C1001i f14186a;

    public static String a(String str, int[] iArr, boolean z2) throws UnsupportedEncodingException {
        String str2;
        byte[] bytes = str.getBytes("ISO-8859-1");
        synchronized (Ab.f13223z) {
            try {
                int i5 = iArr[0];
                int i10 = iArr[1];
                int i11 = iArr[2];
                int i12 = iArr[3];
                char[] cArr = new char[i10];
                System.arraycopy(f14185b, i5, cArr, 0, i10);
                if (bytes != null) {
                    char[] cArr2 = new char[i10];
                    Ab.f13222y = 0;
                    char c10 = 0;
                    while (true) {
                        int i13 = Ab.f13222y;
                        if (i13 >= i10) {
                            break;
                        }
                        if (bytes[i13] == 1) {
                            cArr2[i13] = (char) (((cArr[i13] << 1) + 1) - c10);
                        } else {
                            cArr2[i13] = (char) ((cArr[i13] << 1) - c10);
                        }
                        c10 = cArr2[i13];
                        Ab.f13222y = i13 + 1;
                    }
                    cArr = cArr2;
                }
                if (i12 > 0) {
                    char[] cArr3 = new char[i10];
                    System.arraycopy(cArr, 0, cArr3, 0, i10);
                    int i14 = i10 - i12;
                    System.arraycopy(cArr3, 0, cArr, i14, i12);
                    System.arraycopy(cArr3, i12, cArr, 0, i14);
                }
                if (z2) {
                    char[] cArr4 = new char[i10];
                    Ab.f13222y = 0;
                    while (true) {
                        int i15 = Ab.f13222y;
                        if (i15 >= i10) {
                            break;
                        }
                        cArr4[i15] = cArr[(i10 - i15) - 1];
                        Ab.f13222y = i15 + 1;
                    }
                    cArr = cArr4;
                }
                if (i11 > 0) {
                    Ab.f13222y = 0;
                    while (true) {
                        int i16 = Ab.f13222y;
                        if (i16 >= i10) {
                            break;
                        }
                        cArr[i16] = (char) (cArr[i16] - iArr[2]);
                        Ab.f13222y = i16 + 1;
                    }
                }
                str2 = new String(cArr);
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i5, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        try {
            this.f14186a.c(view);
        } catch (Throwable th) {
            Ab.a0(a("\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001", new int[]{0, 14, 0, 0}, true).intern(), a("\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0001", new int[]{14, 23, 0, 4}, false).intern(), th, false);
        }
    }
}
