package com.waze;

import android.content.Context;
import androidx.preference.PreferenceManager;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bd {

    /* renamed from: a, reason: collision with root package name */
    private final Object f16200a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f16201b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f16202c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f16203d;

    public bd(Context context, FirebaseCrashlytics firebaseCrashlytics) {
        h.g.b.x.f(context, "context");
        h.g.b.x.f(firebaseCrashlytics, "firebaseCrashlytics");
        this.f16200a = context;
        this.f16201b = firebaseCrashlytics;
        this.f16202c = "numConsecutiveCrashes";
        this.f16203d = PreferenceManager.getDefaultSharedPreferences(context);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.waze.app_nav.hub.b.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.waze.shared_infra.i.e, java.lang.Object] */
    public static final /* synthetic */ void f(bd bdVar) {
        ?? r0 = bdVar.f16201b;
        Iterable iterable = (Iterable) r0.a().d();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (((com.waze.app_nav.hub.b.k) obj).a() != null) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = arrayList;
        ?? r5 = bdVar.f16202c;
        arrayList2.toString();
        r5.e("mobile popups to remove: ".concat(arrayList2.toString()));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            r0.c((com.waze.app_nav.hub.b.k) it.next());
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [android.content.SharedPreferences, java.lang.Object] */
    private final void g(int i2) {
        this.f16203d.edit().putInt((String) this.f16202c, i2).apply();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.content.SharedPreferences, java.lang.Object] */
    public final boolean a() throws Throwable {
        int i2 = this.f16203d.getInt((String) this.f16202c, 0);
        boolean zDidCrashOnPreviousExecution = ((FirebaseCrashlytics) this.f16201b).didCrashOnPreviousExecution();
        com.waze.shared_infra.i.h.k("CrashCounter", "preventCrashLoop(): counter{" + i2 + "}) didCrashPreviousely{" + zDidCrashOnPreviousExecution + "}");
        if (zDidCrashOnPreviousExecution) {
            int i3 = i2 + 1;
            g(i3);
            if (i3 >= 5) {
                com.waze.shared_infra.i.h.k("CrashCounter", "crash-loop detected, will run cleanup and send logs");
                com.waze.resources.i.b();
                File file = new File(((Context) this.f16200a).getDataDir().getAbsolutePath(), "waze/maps/tiles_nt.db");
                try {
                    if (file.exists() && file.isFile()) {
                        file.delete();
                    }
                } catch (Throwable th) {
                    e.b.c.a(th);
                }
                return true;
            }
        } else if (i2 > 0) {
            g(0);
        }
        return false;
    }

    public final kc b(ka kaVar) {
        h.g.b.x.f(kaVar, "routingPopup");
        return new kc(this, kaVar);
    }

    public /* synthetic */ bd(com.waze.shared_infra.i.e eVar, ao aoVar, com.waze.app_nav.hub.b.c cVar, kd kdVar, kotlinx.coroutines.af afVar) {
        this.f16202c = eVar;
        this.f16200a = aoVar;
        this.f16201b = cVar;
        this.f16203d = kdVar;
        kotlinx.coroutines.aj.z(afVar, null, null, new ck(this, (h.c.e) null, 10), 3);
    }
}
