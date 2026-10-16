package Sa;

import A.e0;
import A7.RunnableC0307z;
import G9.e;
import S3.c;
import S3.s;
import Va.M6;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import ff.AbstractC2641B;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: g, reason: collision with root package name */
    public static final a f11037g = new a();

    /* renamed from: h, reason: collision with root package name */
    public static final Handler f11038h = new Handler(Looper.getMainLooper());

    /* renamed from: i, reason: collision with root package name */
    public static Handler f11039i = null;

    /* renamed from: j, reason: collision with root package name */
    public static final RunnableC0307z f11040j = new RunnableC0307z(2);
    public static final RunnableC0307z k = new RunnableC0307z(3);

    /* renamed from: f, reason: collision with root package name */
    public long f11046f;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f11041a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f11042b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final b f11044d = new b();

    /* renamed from: c, reason: collision with root package name */
    public final s f11043c = new s((byte) 0, 16);

    /* renamed from: e, reason: collision with root package name */
    public final c f11045e = new c(new e(), 21);

    public static void b() {
        if (f11039i == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f11039i = handler;
            handler.post(f11040j);
            f11039i.postDelayed(k, 200L);
        }
    }

    public final void a(View view, e0 e0Var, JSONObject jSONObject, boolean z2) {
        String str;
        if (AbstractC2641B.c(view) == null) {
            b bVar = this.f11044d;
            char c10 = bVar.f11050d.contains(view) ? (char) 1 : bVar.f11055i ? (char) 2 : (char) 3;
            if (c10 == 3) {
                return;
            }
            JSONObject jSONObjectB = e0Var.b(view);
            Ra.b.c(jSONObject, jSONObjectB);
            HashMap map = bVar.f11047a;
            if (map.size() == 0) {
                str = null;
            } else {
                String str2 = (String) map.get(view);
                if (str2 != null) {
                    map.remove(view);
                }
                str = str2;
            }
            boolean z10 = false;
            if (str != null) {
                try {
                    jSONObjectB.put("adSessionId", str);
                } catch (JSONException e7) {
                    Log.e("OMIDLIB", "Error with setting ad session id", e7);
                }
                WeakHashMap weakHashMap = bVar.f11054h;
                if (weakHashMap.containsKey(view)) {
                    weakHashMap.put(view, Boolean.TRUE);
                } else {
                    z10 = true;
                }
                try {
                    jSONObjectB.put("hasWindowFocus", Boolean.valueOf(z10));
                } catch (JSONException e10) {
                    Log.e("OMIDLIB", "Error with setting has window focus", e10);
                }
                bVar.f11055i = true;
                return;
            }
            M6.z(bVar.f11048b.get(view));
            boolean z11 = c10 == 1;
            e0Var.getClass();
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int i5 = 0;
                if (!z11) {
                    while (i5 < viewGroup.getChildCount()) {
                        a(viewGroup.getChildAt(i5), e0Var, jSONObjectB, z2);
                        i5++;
                    }
                    return;
                }
                HashMap map2 = new HashMap();
                while (i5 < viewGroup.getChildCount()) {
                    View childAt = viewGroup.getChildAt(i5);
                    ArrayList arrayList = (ArrayList) map2.get(Float.valueOf(childAt.getZ()));
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        map2.put(Float.valueOf(childAt.getZ()), arrayList);
                    }
                    arrayList.add(childAt);
                    i5++;
                }
                ArrayList arrayList2 = new ArrayList(map2.keySet());
                Collections.sort(arrayList2);
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    Iterator it2 = ((ArrayList) map2.get((Float) it.next())).iterator();
                    while (it2.hasNext()) {
                        a((View) it2.next(), e0Var, jSONObjectB, z2);
                    }
                }
            }
        }
    }
}
