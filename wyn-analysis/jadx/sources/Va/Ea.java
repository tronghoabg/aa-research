package Va;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.io.UnsupportedEncodingException;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class Ea extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public Context f13321a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f13322b;

    /* renamed from: c, reason: collision with root package name */
    public HashSet f13323c;

    /* renamed from: e, reason: collision with root package name */
    public static final char[] f13318e = {23, 'P', 'k', 'm', 'o', 'g', 'd', 'd', 'k', 'I', 'J', 's', 'j', 'b', 'c', 'b', 'h', 'p', 'j', 'A', 'H', 'r', 'J', 'C', 'j', 'k', 'n', 't', 'l', '\\', 'D', 'h', 'R', 'c', 'h', 'h', 'c', '^', 'e', 'h', 'i', 'i', 'h', 'p', 'v', 'k', '_', '^', 'a', 'd', '`', 'm', 129, 131, 133, 138, 134, 128, 'c', 'h', 131, 134, 'k', 'b', 131, 136, 16, 'E', 'n', 'p', 's', 'u', 'l', 'Y', '`', 219, 246, 254, 253, 246, 251, 256, 256, 251, 211, 284, 297, 284, 295, 278, 280, 289, 289, 290, 278, 300, 295, 'P', 172, 191, 200, 198, 195, 193, 178, 182, 189, 189, 191, 174, 174, 183, 183, 186, 194, 192, 190};

    /* renamed from: d, reason: collision with root package name */
    public static final String f13317d = c("\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001", new int[]{97, 20, 83, 0}, false).intern();

    /* renamed from: g, reason: collision with root package name */
    public static int f13320g = 1;

    /* renamed from: f, reason: collision with root package name */
    public static int f13319f = (f13320g + 103) % 128;

    public static String c(String str, int[] iArr, boolean z2) throws UnsupportedEncodingException {
        String str2;
        byte[] bytes = str;
        if (str != null) {
            bytes = str.getBytes("ISO-8859-1");
        }
        byte[] bArr = bytes;
        synchronized (Ab.f13223z) {
            try {
                int i5 = iArr[0];
                int i10 = iArr[1];
                int i11 = iArr[2];
                int i12 = iArr[3];
                char[] cArr = new char[i10];
                System.arraycopy(f13318e, i5, cArr, 0, i10);
                if (bArr != null) {
                    char[] cArr2 = new char[i10];
                    Ab.f13222y = 0;
                    char c10 = 0;
                    while (true) {
                        int i13 = Ab.f13222y;
                        if (i13 >= i10) {
                            break;
                        }
                        if (bArr[i13] == 1) {
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

    public static void e(Ea ea2, boolean z2) {
        int i5;
        f13319f = (f13320g + 33) % 128;
        synchronized (ea2) {
            i5 = f13320g;
            ea2.f13322b = z2;
        }
        f13319f = (i5 + 1) % 128;
    }

    public static boolean g(Context context) {
        int i5 = f13320g;
        int i10 = i5 + 107;
        f13319f = i10 % 128;
        NetworkInfo activeNetworkInfo = null;
        if (i10 % 2 != 0) {
            throw null;
        }
        if (context != null) {
            activeNetworkInfo = ((ConnectivityManager) context.getSystemService(c(null, new int[]{85, 12, 179, 10}, true).intern())).getActiveNetworkInfo();
        } else {
            int i11 = i5 + 25;
            f13319f = i11 % 128;
            if (i11 % 2 != 0) {
                throw null;
            }
        }
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return false;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(c("\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001", new int[]{66, 8, 0, 8}, true).intern());
        sb2.append(activeNetworkInfo.getTypeName());
        sb2.append(c("\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001", new int[]{74, 11, 146, 0}, true).intern());
        Ab.a(f13317d, sb2.toString());
        f13319f = (f13320g + 15) % 128;
        return true;
    }

    public static /* synthetic */ String h() {
        int i5 = f13320g + 89;
        f13319f = i5 % 128;
        if (i5 % 2 == 0) {
            return f13317d;
        }
        throw null;
    }

    public final synchronized HashSet a() {
        HashSet hashSet;
        hashSet = new HashSet(this.f13323c);
        f13319f = (f13320g + 83) % 128;
        return hashSet;
    }

    public final void b() {
        int i5 = f13320g + 45;
        f13319f = i5 % 128;
        if (i5 % 2 != 0) {
            a().iterator();
            throw null;
        }
        Iterator it = a().iterator();
        f13320g = (f13319f + 111) % 128;
        while (it.hasNext()) {
            f13320g = (f13319f + 73) % 128;
            it.next();
        }
        f13319f = (f13320g + 31) % 128;
    }

    public final synchronized void d(InterfaceC1229za interfaceC1229za) {
        int i5 = f13320g + 87;
        f13319f = i5 % 128;
        if (i5 % 2 != 0) {
            this.f13323c.add(interfaceC1229za);
            throw null;
        }
        this.f13323c.add(interfaceC1229za);
    }

    public final synchronized boolean f() {
        boolean z2;
        int i5 = f13319f + 17;
        int i10 = i5 % 128;
        f13320g = i10;
        if (i5 % 2 == 0) {
            throw null;
        }
        z2 = this.f13322b;
        f13319f = (i10 + 97) % 128;
        return z2;
    }

    public final synchronized void i(InterfaceC1229za interfaceC1229za) {
        f13319f = (f13320g + 57) % 128;
        this.f13323c.remove(interfaceC1229za);
        f13319f = (f13320g + 5) % 128;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Cb.e(new Da(this, intent, context, 0));
        f13319f = (f13320g + 25) % 128;
    }
}
