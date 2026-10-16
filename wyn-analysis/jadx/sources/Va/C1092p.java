package Va;

import android.app.Activity;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.PriorityQueue;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: Va.p, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1092p implements InterfaceC1026jb, Ia {

    /* renamed from: b, reason: collision with root package name */
    public static int f14467b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static int f14468c = 1;

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ C1194x f14469a;

    public static /* synthetic */ JSONObject e(Activity activity) throws JSONException {
        int i5 = f14468c + 59;
        f14467b = i5 % 128;
        if (i5 % 2 != 0) {
            g(activity);
            throw null;
        }
        JSONObject jSONObjectG = g(activity);
        int i10 = f14467b + 75;
        f14468c = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 18 / 0;
        }
        return jSONObjectG;
    }

    public static String f(int i5, String str) {
        String str2;
        char[] charArray = str.toCharArray();
        synchronized (AbstractC1104pb.f14484D) {
            try {
                char[] cArrZ = AbstractC1104pb.z(1367593066776841753L, charArray, i5);
                AbstractC1104pb.f14483C = 4;
                while (true) {
                    int i10 = AbstractC1104pb.f14483C;
                    if (i10 < cArrZ.length) {
                        cArrZ[i10] = (char) ((cArrZ[i10] ^ cArrZ[i10 % 4]) ^ ((i10 - 4) * 1367593066776841753L));
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

    public static JSONObject g(Activity activity) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(f((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), "Ꮲᎃិ姍ຟ鋙甃⯧\udfdd鼆\uda6c").intern(), activity.getClass().getName());
            f14468c = (f14467b + 61) % 128;
        } catch (JSONException unused) {
            Ab.x(f((ViewConfiguration.getEdgeSlop() >> 16) + 1, "漺潻ꙥ\ue812쎍忞\udf47圧減㕠ᝲឬᾁ").intern(), f(-ExpandableListView.getPackedPositionChild(0L), "ᔨᕭ㙥砎쒋壋櫪ⴾ\ufe53胎ၼꈅ斄욆젟\udbba밤輪膶Ꮝ\uf4d1埑뤠䭡ಥဣ狃蒐䜝\ud81a").intern());
        }
        int i5 = f14467b + 1;
        f14468c = i5 % 128;
        if (i5 % 2 != 0) {
            return jSONObject;
        }
        throw null;
    }

    @Override // Va.InterfaceC1026jb
    public void a(Activity activity) {
        C1079o c1079o = new C1079o(0);
        c1079o.f14447e = this;
        c1079o.f14446d = activity;
        Cb.j(c1079o);
        int i5 = f14467b + 105;
        f14468c = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    @Override // Va.Ia
    public void b(C1052lb c1052lb, String str) {
        C1194x.f(this.f14469a);
    }

    @Override // Va.Ia
    public void c(C1052lb c1052lb) {
        C1194x c1194x = this.f14469a;
        C1194x.f(c1194x);
        C1194x.D(c1194x);
    }

    @Override // Va.InterfaceC1026jb
    public void d(Activity activity) {
        C1079o c1079o = new C1079o(1);
        c1079o.f14447e = this;
        c1079o.f14446d = activity;
        Cb.j(c1079o);
        int i5 = f14468c + 83;
        f14467b = i5 % 128;
        if (i5 % 2 != 0) {
            int i10 = 32 / 0;
        }
    }

    public void h(ArrayList arrayList) {
        boolean zR;
        C1066n c1066n;
        C1194x c1194x = this.f14469a;
        try {
            if (arrayList.isEmpty()) {
                C1194x.f(c1194x);
                return;
            }
            PriorityQueue priorityQueue = new PriorityQueue();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                priorityQueue.add(new C1040l((Sa) it.next()));
            }
            ArrayList arrayList2 = new ArrayList();
            for (C1040l c1040l = (C1040l) priorityQueue.poll(); c1040l != null; c1040l = (C1040l) priorityQueue.poll()) {
                int i5 = C1194x.f14742s + 53;
                C1194x.f14741r = i5 % 128;
                if (i5 % 2 != 0) {
                    zR = c1194x.r(c1040l);
                    int i10 = 1 / 0;
                } else {
                    zR = c1194x.r(c1040l);
                }
                if (zR) {
                    if (TextUtils.isEmpty(c1040l.g())) {
                        int i11 = C1194x.f14741r;
                        int i12 = i11 + 117;
                        C1194x.f14742s = i12 % 128;
                        if (i12 % 2 == 0) {
                            c1066n = c1194x.f14747e;
                            int i13 = 84 / 0;
                        } else {
                            c1066n = c1194x.f14747e;
                        }
                        int i14 = i11 + 103;
                        C1194x.f14742s = i14 % 128;
                        if (i14 % 2 == 0) {
                            throw null;
                        }
                        c1066n.getClass();
                        int i15 = (C1052lb.f14370e + 87) % 128;
                        C1052lb.f14371f = i15;
                        C1052lb.f14370e = (i15 + 87) % 128;
                        c1040l.h(((H) c1066n.f14374c).c());
                    }
                    arrayList2.add(c1040l);
                } else {
                    int i16 = C1194x.f14742s + 7;
                    C1194x.f14741r = i16 % 128;
                    if (i16 % 2 != 0) {
                        C0935cb c0935cb = c1194x.f14746d;
                        throw null;
                    }
                    C0935cb c0935cb2 = c1194x.f14746d;
                    Sa saD = c1040l.d();
                    c0935cb2.getClass();
                    Handler handlerK = Ra.k();
                    C1206y c1206y = new C1206y(16);
                    c1206y.f14799e = c0935cb2;
                    c1206y.f14798d = saD;
                    handlerK.post(c1206y);
                    C0935cb.f14080l = (C0935cb.k + 77) % 128;
                }
            }
            if (arrayList2.isEmpty()) {
                return;
            }
            int i17 = C1194x.f14741r + 7;
            C1194x.f14742s = i17 % 128;
            if (i17 % 2 == 0) {
                c1194x.q(arrayList2, this);
                int i18 = 31 / 0;
            } else {
                c1194x.q(arrayList2, this);
            }
            int i19 = C1194x.f14742s + 61;
            C1194x.f14741r = i19 % 128;
            if (i19 % 2 != 0) {
                throw null;
            }
        } catch (Exception unused) {
            C1194x.f(c1194x);
        }
    }
}
