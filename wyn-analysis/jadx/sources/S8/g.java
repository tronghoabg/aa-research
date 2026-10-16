package s8;

import S3.s;
import Y2.B;
import a9.C1342b;
import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.api.internal.ComponentCallbacks2C1690d;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import com.unity3d.ads.metadata.MediationMetaData;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import n7.AbstractC3598c;
import x.C4411d;
import x.C4412e;
import x9.C4503c;

/* loaded from: classes4.dex */
public final class g {
    public static final Object k = new Object();

    /* renamed from: l, reason: collision with root package name */
    public static final C4412e f45327l = new C4412e(0);

    /* renamed from: a, reason: collision with root package name */
    public final Context f45328a;

    /* renamed from: b, reason: collision with root package name */
    public final String f45329b;

    /* renamed from: c, reason: collision with root package name */
    public final l f45330c;

    /* renamed from: d, reason: collision with root package name */
    public final L8.i f45331d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f45332e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f45333f;

    /* renamed from: g, reason: collision with root package name */
    public final L8.p f45334g;

    /* renamed from: h, reason: collision with root package name */
    public final O9.b f45335h;

    /* renamed from: i, reason: collision with root package name */
    public final CopyOnWriteArrayList f45336i;

    /* renamed from: j, reason: collision with root package name */
    public final CopyOnWriteArrayList f45337j;

    public g(Context context, String str, l lVar) throws PackageManager.NameNotFoundException {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f45332e = atomicBoolean;
        this.f45333f = new AtomicBoolean();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.f45336i = copyOnWriteArrayList;
        this.f45337j = new CopyOnWriteArrayList();
        this.f45328a = context;
        AbstractC1732v.f(str);
        this.f45329b = str;
        this.f45330c = lVar;
        C4025a c4025a = FirebaseInitProvider.f27372a;
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        ArrayList arrayListM = new s(12, context, new S3.l(ComponentDiscoveryService.class)).m();
        Trace.endSection();
        Trace.beginSection("Runtime");
        M8.k kVar = M8.k.f7564a;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.addAll(arrayListM);
        arrayList.add(new L8.d(new FirebaseCommonRegistrar(), 1));
        arrayList.add(new L8.d(new ExecutorsRegistrar(), 1));
        arrayList2.add(L8.b.c(context, Context.class, new Class[0]));
        arrayList2.add(L8.b.c(this, g.class, new Class[0]));
        arrayList2.add(L8.b.c(lVar, l.class, new Class[0]));
        C1342b c1342b = new C1342b();
        if ((Build.VERSION.SDK_INT >= 24 ? Y0.a.g(context) : true) && FirebaseInitProvider.f27373b.get()) {
            arrayList2.add(L8.b.c(c4025a, C4025a.class, new Class[0]));
        }
        L8.i iVar = new L8.i(kVar, arrayList, arrayList2, c1342b);
        this.f45331d = iVar;
        Trace.endSection();
        this.f45334g = new L8.p(new L8.h(1, this, context));
        this.f45335h = iVar.c(C4503c.class);
        C4028d c4028d = new C4028d(this);
        a();
        if (atomicBoolean.get()) {
            ComponentCallbacks2C1690d.f26513e.f26514a.get();
        }
        copyOnWriteArrayList.add(c4028d);
        Trace.endSection();
    }

    public static ArrayList d() {
        ArrayList arrayList = new ArrayList();
        synchronized (k) {
            try {
                Iterator it = ((C4411d) f45327l.values()).iterator();
                while (it.hasNext()) {
                    g gVar = (g) it.next();
                    gVar.a();
                    arrayList.add(gVar.f45329b);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static g e() {
        g gVar;
        synchronized (k) {
            try {
                gVar = (g) f45327l.get("[DEFAULT]");
                if (gVar == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + AbstractC3598c.f() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                ((C4503c) gVar.f45335h.get()).c();
            } catch (Throwable th) {
                throw th;
            }
        }
        return gVar;
    }

    public static g f(String str) {
        g gVar;
        String str2;
        synchronized (k) {
            try {
                gVar = (g) f45327l.get(str.trim());
                if (gVar == null) {
                    ArrayList arrayListD = d();
                    if (arrayListD.isEmpty()) {
                        str2 = "";
                    } else {
                        str2 = "Available app names: " + TextUtils.join(", ", arrayListD);
                    }
                    throw new IllegalStateException("FirebaseApp with name " + str + " doesn't exist. " + str2);
                }
                ((C4503c) gVar.f45335h.get()).c();
            } finally {
            }
        }
        return gVar;
    }

    public static g i(Context context) {
        synchronized (k) {
            try {
                if (f45327l.containsKey("[DEFAULT]")) {
                    return e();
                }
                l lVarA = l.a(context);
                if (lVarA == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return j(context, "[DEFAULT]", lVarA);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static g j(Context context, String str, l lVar) {
        g gVar;
        AtomicReference atomicReference = C4029e.f45324a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = C4029e.f45324a;
            if (atomicReference2.get() == null) {
                C4029e c4029e = new C4029e();
                while (true) {
                    if (atomicReference2.compareAndSet(null, c4029e)) {
                        ComponentCallbacks2C1690d.c(application);
                        ComponentCallbacks2C1690d.f26513e.a(c4029e);
                        break;
                    }
                    if (atomicReference2.get() != null) {
                        break;
                    }
                }
            }
        }
        String strTrim = str.trim();
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (k) {
            C4412e c4412e = f45327l;
            AbstractC1732v.k("FirebaseApp name " + strTrim + " already exists!", !c4412e.containsKey(strTrim));
            AbstractC1732v.j(context, "Application context cannot be null.");
            gVar = new g(context, strTrim, lVar);
            c4412e.put(strTrim, gVar);
        }
        gVar.h();
        return gVar;
    }

    public final void a() {
        AbstractC1732v.k("FirebaseApp was deleted", !this.f45333f.get());
    }

    public final void b() {
        if (this.f45333f.compareAndSet(false, true)) {
            synchronized (k) {
                f45327l.remove(this.f45329b);
            }
            Iterator it = this.f45337j.iterator();
            while (it.hasNext()) {
                ((h) it.next()).a();
            }
        }
    }

    public final Object c(Class cls) {
        a();
        return this.f45331d.a(cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        gVar.a();
        return this.f45329b.equals(gVar.f45329b);
    }

    public final String g() {
        StringBuilder sb2 = new StringBuilder();
        a();
        byte[] bytes = this.f45329b.getBytes(Charset.defaultCharset());
        sb2.append(bytes == null ? null : Base64.encodeToString(bytes, 11));
        sb2.append("+");
        a();
        byte[] bytes2 = this.f45330c.f45344b.getBytes(Charset.defaultCharset());
        sb2.append(bytes2 != null ? Base64.encodeToString(bytes2, 11) : null);
        return sb2.toString();
    }

    public final void h() {
        int i5 = Build.VERSION.SDK_INT;
        Context context = this.f45328a;
        boolean zG = i5 >= 24 ? Y0.a.g(context) : true;
        String str = this.f45329b;
        if (zG) {
            StringBuilder sb2 = new StringBuilder("Device unlocked: initializing all Firebase APIs for app ");
            a();
            sb2.append(str);
            Log.i("FirebaseApp", sb2.toString());
            a();
            this.f45331d.i("[DEFAULT]".equals(str));
            ((C4503c) this.f45335h.get()).c();
            return;
        }
        StringBuilder sb3 = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
        a();
        sb3.append(str);
        Log.i("FirebaseApp", sb3.toString());
        AtomicReference atomicReference = C4030f.f45325b;
        if (atomicReference.get() == null) {
            C4030f c4030f = new C4030f(context);
            while (!atomicReference.compareAndSet(null, c4030f)) {
                if (atomicReference.get() != null) {
                    return;
                }
            }
            context.registerReceiver(c4030f, new IntentFilter("android.intent.action.USER_UNLOCKED"));
        }
    }

    public final int hashCode() {
        return this.f45329b.hashCode();
    }

    public final boolean k() {
        boolean z2;
        a();
        T9.a aVar = (T9.a) this.f45334g.get();
        synchronized (aVar) {
            z2 = aVar.f11815d;
        }
        return z2;
    }

    public final void l(boolean z2) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        Iterator it = this.f45336i.iterator();
        while (it.hasNext()) {
            g gVar = ((C4028d) it.next()).f45323a;
            if (z2) {
                gVar.getClass();
            } else {
                ((C4503c) gVar.f45335h.get()).c();
            }
        }
    }

    public final void m(Boolean bool) {
        a();
        T9.a aVar = (T9.a) this.f45334g.get();
        synchronized (aVar) {
            try {
                if (bool == null) {
                    aVar.f11813b.edit().remove("firebase_data_collection_default_enabled").apply();
                    aVar.b(aVar.a());
                } else {
                    boolean zEquals = Boolean.TRUE.equals(bool);
                    aVar.f11813b.edit().putBoolean("firebase_data_collection_default_enabled", zEquals).apply();
                    aVar.b(zEquals);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String toString() {
        B b5 = new B(this);
        b5.g(this.f45329b, MediationMetaData.KEY_NAME);
        b5.g(this.f45330c, "options");
        return b5.toString();
    }
}
