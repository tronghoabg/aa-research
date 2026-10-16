package Va;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: Va.ib, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1013ib {

    /* renamed from: d, reason: collision with root package name */
    public static C1013ib f14296d;

    /* renamed from: a, reason: collision with root package name */
    public Object f14297a;

    /* renamed from: b, reason: collision with root package name */
    public Object f14298b;

    /* renamed from: c, reason: collision with root package name */
    public Object f14299c;

    public static synchronized C1013ib d() {
        try {
            if (f14296d == null) {
                C1013ib c1013ib = new C1013ib();
                c1013ib.f14297a = new HashMap();
                c1013ib.f14299c = new Handler(Looper.getMainLooper());
                f14296d = c1013ib;
            }
        } catch (Throwable th) {
            throw th;
        }
        return f14296d;
    }

    public static String f(int i5, int i10, int i11, String str) {
        String str2;
        char[] charArray = str.toCharArray();
        synchronized (Ab.f13221x) {
            try {
                char[] cArr = new char[i5];
                Ab.f13219v = 0;
                while (true) {
                    int i12 = Ab.f13219v;
                    if (i12 >= i5) {
                        break;
                    }
                    char c10 = (char) (charArray[i12] + i10);
                    cArr[i12] = c10;
                    cArr[i12] = (char) (c10 - 'o');
                    Ab.f13219v = i12 + 1;
                }
                if (i11 > 0) {
                    Ab.f13220w = i11;
                    char[] cArr2 = new char[i5];
                    System.arraycopy(cArr, 0, cArr2, 0, i5);
                    int i13 = Ab.f13220w;
                    System.arraycopy(cArr2, 0, cArr, i5 - i13, i13);
                    int i14 = Ab.f13220w;
                    System.arraycopy(cArr2, i14, cArr, 0, i5 - i14);
                }
                str2 = new String(cArr);
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    public synchronized HashMap a() {
        return new HashMap((HashMap) this.f14297a);
    }

    public HashMap b(int i5, String str) {
        try {
            HashMap mapA = ((C1128ra) this.f14299c).a(i5, str);
            HashMap map = new HashMap();
            for (String str2 : mapA.keySet()) {
                String str3 = (String) mapA.get(str2);
                if (str3 != null && !TextUtils.isEmpty(str3)) {
                    try {
                        map.put(str2, ((C0921ba) this.f14298b).e(str3));
                    } catch (C1103pa unused) {
                    }
                }
            }
            return map;
        } catch (Throwable unused2) {
            return null;
        }
    }

    public synchronized boolean c(Activity activity) {
        return EnumC1000hb.f14267c == e(activity);
    }

    public synchronized EnumC1000hb e(Activity activity) {
        if (activity != null) {
            String name = activity.getClass().getName();
            if (a().containsKey(name)) {
                return (EnumC1000hb) a().get(name);
            }
            if (((HashMap) g()).containsKey(name)) {
                return (EnumC1000hb) ((HashMap) g()).get(name);
            }
        }
        return EnumC1000hb.a(G.S().I());
    }

    public synchronized Map g() {
        try {
            if (((HashMap) this.f14298b) == null) {
                this.f14298b = new HashMap();
                JSONObject jSONObjectG = G.S().G();
                if (jSONObjectG != null) {
                    this.f14298b = Ab.M(jSONObjectG, new Xd.c(28));
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return (HashMap) this.f14298b;
    }
}
