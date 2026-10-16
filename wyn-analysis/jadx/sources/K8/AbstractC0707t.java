package K8;

import J8.C0641p;
import com.google.android.gms.internal.p002firebaseauthapi.zzzh;
import h7.C2793a;
import java.util.HashMap;
import java.util.Map;

/* renamed from: K8.t, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC0707t {

    /* renamed from: a, reason: collision with root package name */
    public static final C2793a f6677a = new C2793a("GetTokenResultFactory", new String[0]);

    public static C0641p a(String str) {
        Map map;
        try {
            map = v.b(str);
        } catch (zzzh e7) {
            f6677a.b("Error parsing token claims", e7, new Object[0]);
            map = new HashMap();
        }
        C0641p c0641p = new C0641p();
        c0641p.f5812a = str;
        c0641p.f5813b = map;
        return c0641p;
    }
}
