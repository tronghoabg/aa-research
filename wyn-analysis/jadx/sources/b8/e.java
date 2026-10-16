package B8;

import Va.Aa;
import android.text.TextUtils;
import android.util.Log;
import b7.k;
import j$.util.Objects;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;
import x9.C4504d;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: c, reason: collision with root package name */
    public static e f1611c;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1612a;

    /* renamed from: b, reason: collision with root package name */
    public String f1613b;

    public /* synthetic */ e() {
        this.f1612a = 1;
    }

    public static void b(k kVar, Z8.c cVar) {
        String str = cVar.f17038a;
        if (str != null) {
            kVar.x("X-CRASHLYTICS-GOOGLE-APP-ID", str);
        }
        kVar.x("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        kVar.x("X-CRASHLYTICS-API-CLIENT-VERSION", "19.3.0");
        kVar.x("Accept", "application/json");
        String str2 = cVar.f17039b;
        if (str2 != null) {
            kVar.x("X-CRASHLYTICS-DEVICE-MODEL", str2);
        }
        String str3 = cVar.f17040c;
        if (str3 != null) {
            kVar.x("X-CRASHLYTICS-OS-BUILD-VERSION", str3);
        }
        String str4 = cVar.f17041d;
        if (str4 != null) {
            kVar.x("X-CRASHLYTICS-OS-DISPLAY-VERSION", str4);
        }
        String str5 = cVar.f17042e.c().f10447a;
        if (str5 != null) {
            kVar.x("X-CRASHLYTICS-INSTALLATION-ID", str5);
        }
    }

    public static HashMap c(Z8.c cVar) {
        HashMap map = new HashMap();
        map.put("build_version", cVar.f17045h);
        map.put("display_version", cVar.f17044g);
        map.put("source", Integer.toString(cVar.f17046i));
        String str = cVar.f17043f;
        if (!TextUtils.isEmpty(str)) {
            map.put("instance", str);
        }
        return map;
    }

    public static e f(Y4.b bVar) {
        String str;
        bVar.B(2);
        int iQ = bVar.q();
        int i5 = iQ >> 1;
        int iQ2 = ((bVar.q() >> 3) & 31) | ((iQ & 1) << 5);
        if (i5 == 4 || i5 == 5 || i5 == 7) {
            str = "dvhe";
        } else if (i5 == 8) {
            str = "hev1";
        } else {
            if (i5 != 9) {
                return null;
            }
            str = "avc3";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(".0");
        sb2.append(i5);
        return new e(N0.a.d(iQ2, iQ2 >= 10 ? "." : ".0", sb2), 5);
    }

    public void a(StringBuilder sb2, Iterator it) {
        try {
            if (it.hasNext()) {
                Object next = it.next();
                Objects.requireNonNull(next);
                sb2.append(next instanceof CharSequence ? (CharSequence) next : next.toString());
                while (it.hasNext()) {
                    sb2.append((CharSequence) this.f1613b);
                    Object next2 = it.next();
                    Objects.requireNonNull(next2);
                    sb2.append(next2 instanceof CharSequence ? (CharSequence) next2 : next2.toString());
                }
            }
        } catch (IOException e7) {
            throw new AssertionError(e7);
        }
    }

    public JSONObject d(Aa aa2) {
        StringBuilder sb2 = new StringBuilder("Settings response code was: ");
        int i5 = aa2.f13191a;
        sb2.append(i5);
        String string = sb2.toString();
        O8.c cVar = O8.c.f8921a;
        cVar.f(string);
        String str = this.f1613b;
        if (i5 == 200 || i5 == 201 || i5 == 202 || i5 == 203) {
            String str2 = aa2.f13192b;
            try {
                return new JSONObject(str2);
            } catch (Exception e7) {
                cVar.g("Failed to parse settings JSON from " + str, e7);
                cVar.g("Settings response " + str2, null);
            }
        } else {
            String str3 = "Settings request failed; (status: " + i5 + ") from " + str;
            if (cVar.b(6)) {
                Log.e("FirebaseCrashlytics", str3, null);
                return null;
            }
        }
        return null;
    }

    public String e(Iterable iterable) {
        Iterator it = iterable.iterator();
        StringBuilder sb2 = new StringBuilder();
        a(sb2, it);
        return sb2.toString();
    }

    public String toString() {
        switch (this.f1612a) {
            case 4:
                return this.f1613b;
            default:
                return super.toString();
        }
    }

    public /* synthetic */ e(String str, int i5) {
        this.f1612a = i5;
        this.f1613b = str;
    }

    public e(String str, C4504d c4504d) {
        this.f1612a = 2;
        if (str != null) {
            this.f1613b = str;
            return;
        }
        throw new IllegalArgumentException("url must not be null.");
    }

    public e(String str) {
        this.f1612a = 3;
        str.getClass();
        this.f1613b = str;
    }
}
