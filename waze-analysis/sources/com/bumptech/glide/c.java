package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.support.v4.app.av;
import android.util.Log;
import android.view.View;
import com.bumptech.glide.load.a.af;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class c implements ComponentCallbacks2 {

    /* renamed from: a, reason: collision with root package name */
    private static volatile c f2792a;

    /* renamed from: b, reason: collision with root package name */
    private static volatile boolean f2793b;

    /* renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.load.a.a.c f2794c;

    /* renamed from: d, reason: collision with root package name */
    private final com.bumptech.glide.load.a.b.i f2795d;

    /* renamed from: e, reason: collision with root package name */
    private final m f2796e;

    /* renamed from: f, reason: collision with root package name */
    private final com.bumptech.glide.manager.n f2797f;

    /* renamed from: g, reason: collision with root package name */
    private final List f2798g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    private final com.bumptech.glide.load.a.a.j f2799h;

    c(Context context, af afVar, com.bumptech.glide.load.a.b.i iVar, com.bumptech.glide.load.a.a.c cVar, com.bumptech.glide.load.a.a.j jVar, com.bumptech.glide.manager.n nVar, Map map, List list, List list2, com.bumptech.glide.c.a aVar, o oVar) {
        this.f2794c = cVar;
        this.f2799h = jVar;
        this.f2795d = iVar;
        this.f2797f = nVar;
        if (((g) oVar.a(g.class)) != null) {
            throw null;
        }
        this.f2796e = new m(context, jVar, new w(this, list2), map, list, afVar, oVar);
    }

    public static c b(Context context) {
        if (f2792a == null) {
            GeneratedAppGlideModule generatedAppGlideModuleM = m(context.getApplicationContext());
            synchronized (c.class) {
                if (f2792a == null) {
                    if (f2793b) {
                        throw new IllegalStateException("Glide has been called recursively, this is probably an internal library error!");
                    }
                    f2793b = true;
                    try {
                        o(context, new l(), generatedAppGlideModuleM);
                    } finally {
                        f2793b = false;
                    }
                }
            }
        }
        return f2792a;
    }

    public static ac e(Context context) {
        return n(context).a(context);
    }

    public static ac f(av avVar) {
        return n(avVar).b(avVar);
    }

    public static ac g(View view) {
        return n(view.getContext()).c(view);
    }

    private static GeneratedAppGlideModule m(Context context) {
        try {
            return (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext());
        } catch (ClassNotFoundException unused) {
            if (Log.isLoggable("Glide", 5)) {
                Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
                return null;
            }
            return null;
        } catch (IllegalAccessException e2) {
            p(e2);
            return null;
        } catch (InstantiationException e3) {
            p(e3);
            return null;
        } catch (NoSuchMethodException e4) {
            p(e4);
            return null;
        } catch (InvocationTargetException e5) {
            p(e5);
            return null;
        }
    }

    private static com.bumptech.glide.manager.n n(Context context) {
        com.bumptech.glide.g.p.e(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return b(context).f2797f;
    }

    private static void o(Context context, l lVar, GeneratedAppGlideModule generatedAppGlideModule) throws PackageManager.NameNotFoundException {
        Context applicationContext = context.getApplicationContext();
        List list = Collections.EMPTY_LIST;
        List listB = com.google.android.gms.auth.api.signin.a.b(applicationContext);
        if (generatedAppGlideModule != null && !new HashSet().isEmpty()) {
            HashSet hashSet = new HashSet();
            Iterator it = listB.iterator();
            while (it.hasNext()) {
                com.bumptech.glide.c.c cVar = (com.bumptech.glide.c.c) it.next();
                if (hashSet.contains(cVar.getClass())) {
                    if (Log.isLoggable("Glide", 3)) {
                        Log.d("Glide", "AppGlideModule excludes manifest GlideModule: ".concat(String.valueOf(String.valueOf(cVar))));
                    }
                    it.remove();
                }
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            Iterator it2 = listB.iterator();
            while (it2.hasNext()) {
                Log.d("Glide", "Discovered GlideModule from manifest: ".concat(String.valueOf(String.valueOf(((com.bumptech.glide.c.c) it2.next()).getClass()))));
            }
        }
        Iterator it3 = listB.iterator();
        while (it3.hasNext()) {
            ((com.bumptech.glide.c.c) it3.next()).a();
        }
        c cVarA = lVar.a(applicationContext, listB, generatedAppGlideModule);
        applicationContext.registerComponentCallbacks(cVarA);
        f2792a = cVarA;
    }

    private static void p(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    public final Context a() {
        return this.f2796e.getBaseContext();
    }

    final m c() {
        return this.f2796e;
    }

    public final v d() {
        return this.f2796e.c();
    }

    public final com.bumptech.glide.load.a.a.c h() {
        return this.f2794c;
    }

    final void i(ac acVar) {
        List list = this.f2798g;
        synchronized (list) {
            if (list.contains(acVar)) {
                throw new IllegalStateException("Cannot register already registered manager");
            }
            list.add(acVar);
        }
    }

    final void j(ac acVar) {
        List list = this.f2798g;
        synchronized (list) {
            if (!list.contains(acVar)) {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
            list.remove(acVar);
        }
    }

    final boolean k(com.bumptech.glide.e.a.g gVar) {
        List list = this.f2798g;
        synchronized (list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((ac) it.next()).n(gVar)) {
                    return true;
                }
            }
            return false;
        }
    }

    public final com.bumptech.glide.load.a.a.j l() {
        return this.f2799h;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        com.bumptech.glide.g.r.h();
        this.f2795d.g();
        this.f2794c.c();
        this.f2799h.b();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i2) {
        com.bumptech.glide.g.r.h();
        List<ac> list = this.f2798g;
        synchronized (list) {
            for (ac acVar : list) {
            }
        }
        this.f2795d.e(i2);
        this.f2794c.e(i2);
        this.f2799h.d(i2);
    }
}
