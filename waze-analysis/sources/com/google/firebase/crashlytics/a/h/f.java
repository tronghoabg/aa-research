package com.google.firebase.crashlytics.a.h;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.o.ag;
import com.google.android.gms.o.t;
import com.google.android.gms.o.w;
import com.google.firebase.crashlytics.a.c.aj;
import com.google.firebase.crashlytics.a.c.an;
import com.google.firebase.crashlytics.a.c.aq;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final Context f9747a;

    /* renamed from: b, reason: collision with root package name */
    private final i f9748b;

    /* renamed from: c, reason: collision with root package name */
    private final g f9749c;

    /* renamed from: d, reason: collision with root package name */
    private final aj f9750d;

    /* renamed from: e, reason: collision with root package name */
    private final AtomicReference f9751e;

    /* renamed from: f, reason: collision with root package name */
    private final AtomicReference f9752f;

    /* renamed from: g, reason: collision with root package name */
    private final a f9753g;

    /* renamed from: h, reason: collision with root package name */
    private final com.google.firebase.crashlytics.a.f f9754h;

    f(Context context, i iVar, g gVar, com.google.firebase.crashlytics.a.f fVar, a aVar, aj ajVar) {
        AtomicReference atomicReference = new AtomicReference();
        this.f9751e = atomicReference;
        this.f9752f = new AtomicReference(new w());
        this.f9747a = context;
        this.f9748b = iVar;
        this.f9749c = gVar;
        this.f9754h = fVar;
        this.f9753g = aVar;
        this.f9750d = ajVar;
        atomicReference.set(j.b());
    }

    static /* bridge */ /* synthetic */ void h(f fVar, String str) {
        SharedPreferences.Editor editorEdit = com.google.firebase.crashlytics.a.c.g.d(fVar.f9747a).edit();
        editorEdit.putString("existing_instance_identifier", str);
        editorEdit.apply();
    }

    public static f j(Context context, String str, aq aqVar, String str2, String str3, com.google.firebase.crashlytics.a.f.c cVar, aj ajVar) {
        String strE = aqVar.e();
        g gVar = new g();
        com.google.firebase.crashlytics.a.f fVar = new com.google.firebase.crashlytics.a.f(cVar);
        a aVar = new a(String.format(Locale.US, "https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/%s/settings", str));
        String strF = aq.f();
        String strG = aq.g();
        String strH = aq.h();
        String[] strArr = {com.google.firebase.crashlytics.a.c.g.e(context), str, str3, str2};
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < 4; i2++) {
            String str4 = strArr[i2];
            if (str4 != null) {
                arrayList.add(str4.replace("-", "").toLowerCase(Locale.US));
            }
        }
        Collections.sort(arrayList);
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            sb.append((String) arrayList.get(i3));
        }
        String string = sb.toString();
        return new f(context, new i(str, strF, strG, strH, aqVar, string.length() > 0 ? com.google.firebase.crashlytics.a.c.g.h(string) : null, str3, str2, an.b(strE)), gVar, fVar, aVar, ajVar);
    }

    private final d l(int i2) throws Throwable {
        d dVar = null;
        if (i2 != 2) {
            try {
                JSONObject jSONObjectB = this.f9754h.b();
                if (jSONObjectB == null) {
                    com.google.firebase.crashlytics.a.i.a().b("No cached settings data found.");
                    return null;
                }
                d dVarA = g.a(jSONObjectB);
                m(jSONObjectB, "Loaded cached settings: ");
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (i2 != 3 && dVarA.f9742c < jCurrentTimeMillis) {
                    com.google.firebase.crashlytics.a.i.a().g("Cached settings have expired.");
                    return null;
                }
                try {
                    com.google.firebase.crashlytics.a.i.a().g("Returning cached settings.");
                    return dVarA;
                } catch (Exception e2) {
                    e = e2;
                    dVar = dVarA;
                    com.google.firebase.crashlytics.a.i.a().e("Failed to get cached settings", e);
                    return dVar;
                }
            } catch (Exception e3) {
                e = e3;
            }
        }
        return dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(JSONObject jSONObject, String str) {
        com.google.firebase.crashlytics.a.i.a().b(str.concat(String.valueOf(jSONObject.toString())));
    }

    public final t a() {
        return ((w) this.f9752f.get()).a();
    }

    public final t b(Executor executor) throws Throwable {
        d dVarL;
        if (com.google.firebase.crashlytics.a.c.g.d(this.f9747a).getString("existing_instance_identifier", "").equals(this.f9748b.f9760f) && (dVarL = l(1)) != null) {
            this.f9751e.set(dVarL);
            ((w) this.f9752f.get()).e(dVarL);
            return ag.c(null);
        }
        d dVarL2 = l(3);
        if (dVarL2 != null) {
            this.f9751e.set(dVarL2);
            ((w) this.f9752f.get()).e(dVarL2);
        }
        return this.f9750d.b(executor).e(executor, new e(this));
    }

    public final d c() {
        return (d) this.f9751e.get();
    }
}
