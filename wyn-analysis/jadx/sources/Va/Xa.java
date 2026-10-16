package Va;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class Xa {

    /* renamed from: g, reason: collision with root package name */
    public static Xa f13849g = null;

    /* renamed from: i, reason: collision with root package name */
    public static Xa f13851i = null;
    public static int k = 0;

    /* renamed from: m, reason: collision with root package name */
    public static int f13854m = 0;

    /* renamed from: n, reason: collision with root package name */
    public static int f13855n = 1;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13856a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f13857b;

    /* renamed from: c, reason: collision with root package name */
    public Serializable f13858c;

    /* renamed from: d, reason: collision with root package name */
    public Object f13859d;

    /* renamed from: e, reason: collision with root package name */
    public Object f13860e;

    /* renamed from: f, reason: collision with root package name */
    public Object f13861f;

    /* renamed from: j, reason: collision with root package name */
    public static final char[] f13852j = {']', 180, 173, 177, 162, 165, 187, 179, 173, 174, 173, 181, 190, 171, 162, 178, 178, 175, 177, 182, 170, '~', 250, 254, 252, 248, 247, 208, 215, 259, 257, 247, 207, 198, 232, 249, 16, 'J', 'q', 'i', 'l', 'q', 'k', 'D', 'C', 'j', 'G', '4', 'h', 'k', 'j', 'C', '@', 'd', 'd', 'e', 'k', 'p', 's', 'J', 'C', 'g', 'j', 'p', 'l', 'k', 'I', '6', 'W', 'j', 'k', '6', 'o', 'k', 'c', 'b', 'n', 'L', '@', 'b', 'd', 'd', 'd', 'B', ' ', '3', 'W', 'j', 'p', 'l', 'k', 'L', 'M', 'I', 'J', 'j', 'i', 'l', 'f', 'l', 'J', '@', '}', 250, 258, 260, 254, 259, 264, 269, 'b', 206, 206, 198};

    /* renamed from: h, reason: collision with root package name */
    public static final Object f13850h = new Object();

    /* renamed from: l, reason: collision with root package name */
    public static int f13853l = 123;

    public /* synthetic */ Xa(int i5) {
        this.f13856a = i5;
    }

    public static Xa a(Context context) {
        Xa xa2;
        synchronized (f13850h) {
            try {
                if (f13851i == null) {
                    f13851i = new Xa(context.getApplicationContext());
                }
                xa2 = f13851i;
            } catch (Throwable th) {
                throw th;
            }
        }
        return xa2;
    }

    public static String b(char c10, String str, String str2, int i5) {
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
                        cArr3[i10] = (char) (((charArray[i10] ^ c12) ^ 0) ^ 52278);
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

    private final synchronized void d() {
        k = (f13853l + 17) % 128;
        this.f13857b = false;
        j();
        k = (f13853l + 5) % 128;
    }

    private final synchronized void e() {
        Cb.j(new Va(this));
    }

    public static synchronized Xa g() {
        try {
            if (f13849g == null) {
                Xa xa2 = new Xa(0);
                xa2.f13858c = new HashMap();
                xa2.f13859d = new Handler(Looper.getMainLooper());
                f13849g = xa2;
            }
        } catch (Throwable th) {
            throw th;
        }
        return f13849g;
    }

    public static String h(int i5, String str) {
        String str2;
        char[] charArray = str.toCharArray();
        synchronized (AbstractC1104pb.f14484D) {
            try {
                char[] cArrZ = AbstractC1104pb.z(5238953873678232030L, charArray, i5);
                AbstractC1104pb.f14483C = 4;
                while (true) {
                    int i10 = AbstractC1104pb.f14483C;
                    if (i10 < cArrZ.length) {
                        cArrZ[i10] = (char) ((cArrZ[i10] ^ cArrZ[i10 % 4]) ^ ((i10 - 4) * 5238953873678232030L));
                        AbstractC1104pb.f14483C = i10 + 1;
                    } else {
                        str2 = new String(cArrZ, 4, cArrZ.length - 4);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    public static String i(String str, int[] iArr, boolean z2) throws UnsupportedEncodingException {
        String str2;
        byte[] bytes = str.getBytes("ISO-8859-1");
        synchronized (Ab.f13223z) {
            try {
                int i5 = iArr[0];
                int i10 = iArr[1];
                int i11 = iArr[2];
                int i12 = iArr[3];
                char[] cArr = new char[i10];
                System.arraycopy(f13852j, i5, cArr, 0, i10);
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

    public static void k(Xa xa2) {
        if (xa2.f13857b || new HashMap((HashMap) xa2.f13858c).isEmpty()) {
            return;
        }
        xa2.f13857b = true;
        Va va = new Va(0);
        va.f13798d = xa2;
        Cb.j(va);
    }

    public synchronized void c() {
        switch (this.f13856a) {
            case 0:
                e();
                break;
            default:
                d();
                break;
        }
    }

    public void f() {
        int size;
        AbstractC1104pb[] abstractC1104pbArr;
        do {
            synchronized (((HashMap) this.f13858c)) {
                try {
                    size = ((ArrayList) this.f13861f).size();
                    if (size <= 0) {
                        return;
                    }
                    abstractC1104pbArr = new AbstractC1104pb[size];
                    ((ArrayList) this.f13861f).toArray(abstractC1104pbArr);
                    ((ArrayList) this.f13861f).clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (size <= 0);
        AbstractC1104pb abstractC1104pb = abstractC1104pbArr[0];
        throw null;
    }

    public void j() {
        synchronized (((HashMap) this.f13858c)) {
            try {
                Iterator it = new HashMap((HashMap) this.f13858c).keySet().iterator();
                while (it.hasNext()) {
                    l((BroadcastReceiver) it.next());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void l(BroadcastReceiver broadcastReceiver) {
        synchronized (((HashMap) this.f13858c)) {
            try {
                ArrayList arrayList = (ArrayList) ((HashMap) this.f13858c).remove(broadcastReceiver);
                if (arrayList == null) {
                    return;
                }
                for (int i5 = 0; i5 < arrayList.size(); i5++) {
                    IntentFilter intentFilter = (IntentFilter) arrayList.get(i5);
                    for (int i10 = 0; i10 < intentFilter.countActions(); i10++) {
                        String action = intentFilter.getAction(i10);
                        ArrayList arrayList2 = (ArrayList) ((HashMap) this.f13860e).get(action);
                        if (arrayList2 != null) {
                            if (arrayList2.size() > 0) {
                                if (arrayList2.get(0) != null) {
                                    throw new ClassCastException();
                                }
                                throw null;
                            }
                            if (arrayList2.size() <= 0) {
                                ((HashMap) this.f13860e).remove(action);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Xa(Context context) {
        this.f13856a = 1;
        this.f13857b = true;
        this.f13858c = new HashMap();
        this.f13860e = new HashMap();
        this.f13861f = new ArrayList();
        this.f13859d = context;
        new V5.c(this, context.getMainLooper(), 1);
    }
}
