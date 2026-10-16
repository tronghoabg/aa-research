package com.google.firebase;

import android.content.Context;
import android.os.Trace;
import android.util.Log;
import androidx.autofill.HintConstants;
import androidx.collection.ArrayMap;
import androidx.core.os.UserManagerCompat;
import com.google.android.gms.common.api.internal.av;
import com.google.android.gms.common.api.internal.k;
import com.google.android.gms.common.internal.bb;
import com.google.d.b.ag;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.components.m;
import com.google.firebase.components.n;
import com.google.firebase.components.q;
import com.google.firebase.components.w;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.concurrent.z;
import com.google.firebase.messaging.l;
import com.google.firebase.provider.FirebaseInitProvider;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class e {

    /* renamed from: c, reason: collision with root package name */
    private final Context f9874c;

    /* renamed from: d, reason: collision with root package name */
    private final String f9875d;

    /* renamed from: e, reason: collision with root package name */
    private final i f9876e;

    /* renamed from: f, reason: collision with root package name */
    private final n f9877f;

    /* renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f9878g;

    /* renamed from: h, reason: collision with root package name */
    private final AtomicBoolean f9879h;

    /* renamed from: i, reason: collision with root package name */
    private final w f9880i;

    /* renamed from: j, reason: collision with root package name */
    private final com.google.firebase.g.c f9881j;

    /* renamed from: k, reason: collision with root package name */
    private final List f9882k;

    /* renamed from: l, reason: collision with root package name */
    private final List f9883l;

    /* renamed from: b, reason: collision with root package name */
    private static final Object f9873b = new Object();

    /* renamed from: a, reason: collision with root package name */
    static final Map f9872a = new ArrayMap();

    protected e(Context context, String str, i iVar) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f9878g = atomicBoolean;
        this.f9879h = new AtomicBoolean();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.f9882k = copyOnWriteArrayList;
        this.f9883l = new CopyOnWriteArrayList();
        av.m(context);
        this.f9874c = context;
        av.k(str);
        this.f9875d = str;
        this.f9876e = iVar;
        j jVarA = FirebaseInitProvider.a();
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        List listC = com.google.firebase.components.f.a(context, ComponentDiscoveryService.class).c();
        Trace.endSection();
        Trace.beginSection("Runtime");
        m mVarH = n.h(z.f9048a);
        mVarH.d(listC);
        mVarH.c(new FirebaseCommonRegistrar());
        mVarH.c(new ExecutorsRegistrar());
        mVarH.b(com.google.firebase.components.c.g(context, Context.class, new Class[0]));
        mVarH.b(com.google.firebase.components.c.g(this, e.class, new Class[0]));
        mVarH.b(com.google.firebase.components.c.g(iVar, i.class, new Class[0]));
        mVarH.e(new com.google.firebase.i.a(0));
        if (UserManagerCompat.isUserUnlocked(context) && FirebaseInitProvider.b()) {
            mVarH.b(com.google.firebase.components.c.g(jVarA, j.class, new Class[0]));
        }
        n nVarA = mVarH.a();
        this.f9877f = nVarA;
        Trace.endSection();
        this.f9880i = new w(new com.google.firebase.appcheck.a.h(this, context, 1));
        this.f9881j = q.b(nVarA, com.google.firebase.f.c.class);
        l lVar = new l(this);
        q();
        if (atomicBoolean.get() && k.a().d()) {
            lVar.a(true);
        }
        copyOnWriteArrayList.add(lVar);
        Trace.endSection();
    }

    public static e b() {
        e eVar;
        synchronized (f9873b) {
            eVar = (e) f9872a.get("[DEFAULT]");
            if (eVar == null) {
                throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + com.google.android.gms.common.util.e.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
            ((com.google.firebase.f.c) eVar.f9881j.a()).f();
        }
        return eVar;
    }

    public static e c(Context context) {
        e eVar;
        Object obj = f9873b;
        synchronized (obj) {
            Map map = f9872a;
            if (map.containsKey("[DEFAULT]")) {
                return b();
            }
            i iVarA = i.a(context);
            if (iVarA == null) {
                Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                return null;
            }
            c.b(context);
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            synchronized (obj) {
                av.j(!map.containsKey("[DEFAULT]"), "FirebaseApp name [DEFAULT] already exists!");
                av.n(context, "Application context cannot be null.");
                eVar = new e(context, "[DEFAULT]", iVarA);
                map.put("[DEFAULT]", eVar);
                eVar.r();
            }
            return eVar;
        }
    }

    public static /* synthetic */ void j(e eVar, boolean z) {
        if (z) {
            return;
        }
        ((com.google.firebase.f.c) eVar.f9881j.a()).f();
    }

    static /* bridge */ /* synthetic */ void l(e eVar, boolean z) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        Iterator it = eVar.f9882k.iterator();
        while (it.hasNext()) {
            ((l) it.next()).a(z);
        }
    }

    public static /* synthetic */ ag o(e eVar, Context context) {
        n nVar = eVar.f9877f;
        String strH = eVar.h();
        return new ag(context, strH);
    }

    private final void q() {
        av.j(!this.f9879h.get(), "FirebaseApp was deleted");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r() {
        Context context = this.f9874c;
        if (!UserManagerCompat.isUserUnlocked(context)) {
            Log.i("FirebaseApp", "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ".concat(String.valueOf(g())));
            d.a(context);
        } else {
            Log.i("FirebaseApp", "Device unlocked: initializing all Firebase APIs for app ".concat(String.valueOf(g())));
            this.f9877f.i(n());
            ((com.google.firebase.f.c) this.f9881j.a()).f();
        }
    }

    public final Context a() {
        q();
        return this.f9874c;
    }

    public final i d() {
        q();
        return this.f9876e;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f9875d.equals(((e) obj).g());
        }
        return false;
    }

    public final Object f(Class cls) {
        q();
        return q.d(this.f9877f, cls);
    }

    public final String g() {
        q();
        return this.f9875d;
    }

    public final String h() {
        return a.a.O(g().getBytes(Charset.defaultCharset())) + "+" + a.a.O(d().c().getBytes(Charset.defaultCharset()));
    }

    public final int hashCode() {
        return this.f9875d.hashCode();
    }

    public final boolean m() {
        q();
        return ((ag) this.f9880i.a()).h();
    }

    public final boolean n() {
        return "[DEFAULT]".equals(g());
    }

    public final void p(com.google.firebase.sessions.q qVar) {
        q();
        this.f9883l.add(qVar);
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        bb.c(HintConstants.AUTOFILL_HINT_NAME, this.f9875d, arrayList);
        bb.c("options", this.f9876e, arrayList);
        return bb.b(arrayList, this);
    }
}
