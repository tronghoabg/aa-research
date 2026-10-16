package io.flutter.plugins.firebase.messaging;

import A7.V;
import G9.e;
import Va.C1038ka;
import Yc.i;
import Yc.j;
import Yc.m;
import Yc.n;
import Yc.o;
import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;

/* loaded from: classes5.dex */
public abstract class a extends Service {

    /* renamed from: f, reason: collision with root package name */
    public static final Object f37177f = new Object();

    /* renamed from: g, reason: collision with root package name */
    public static final HashMap f37178g = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public m f37179a;

    /* renamed from: b, reason: collision with root package name */
    public o f37180b;

    /* renamed from: c, reason: collision with root package name */
    public e f37181c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f37182d = false;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f37183e = new ArrayList();

    public static o b(Context context, ComponentName componentName, boolean z2, int i5, boolean z10) {
        o iVar;
        C1038ka c1038ka = new C1038ka(29);
        HashMap map = f37178g;
        o oVar = (o) map.get(c1038ka);
        if (oVar != null) {
            return oVar;
        }
        if (Build.VERSION.SDK_INT < 26 || z10) {
            iVar = new i(context, componentName);
        } else {
            if (!z2) {
                throw new IllegalArgumentException("Can't be here without a job id");
            }
            iVar = new n(context, componentName, i5);
        }
        map.put(c1038ka, iVar);
        return iVar;
    }

    public final void a(boolean z2) {
        if (this.f37181c == null) {
            this.f37181c = new e(this);
            o oVar = this.f37180b;
            if (oVar != null && z2) {
                oVar.d();
            }
            e eVar = this.f37181c;
            ((ExecutorService) eVar.f4685b).execute(new V(eVar, 21));
        }
    }

    public abstract void c(Intent intent);

    public final void d() {
        ArrayList arrayList = this.f37183e;
        if (arrayList != null) {
            synchronized (arrayList) {
                try {
                    this.f37181c = null;
                    ArrayList arrayList2 = this.f37183e;
                    if (arrayList2 != null && arrayList2.size() > 0) {
                        a(false);
                    } else if (!this.f37182d) {
                        this.f37180b.c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        m mVar = this.f37179a;
        if (mVar != null) {
            return mVar.getBinder();
        }
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            this.f37179a = new m(this);
            this.f37180b = null;
        }
        this.f37180b = b(this, new ComponentName(this, getClass()), false, 0, true);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        e eVar = this.f37181c;
        if (eVar != null) {
            ((a) eVar.f4687d).d();
        }
        synchronized (this.f37183e) {
            this.f37182d = true;
            this.f37180b.c();
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i5, int i10) {
        this.f37180b.e();
        synchronized (this.f37183e) {
            ArrayList arrayList = this.f37183e;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new j(this, intent, i10));
            a(true);
        }
        return 3;
    }
}
