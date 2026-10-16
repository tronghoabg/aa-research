package Q1;

import A7.V1;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.ads.AdRequest$Builder;
import com.google.android.gms.internal.ads.zzclb;
import j$.util.DesugarCollections;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import m9.InterfaceC3517p;
import p9.C3779D;
import p9.C3787h;
import p9.z;
import x6.C4476g;
import x6.EnumC4471b;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: e, reason: collision with root package name */
    public static n f9694e;

    /* renamed from: a, reason: collision with root package name */
    public int f9695a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f9696b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f9697c;

    /* renamed from: d, reason: collision with root package name */
    public Object f9698d;

    public n(zzclb zzclbVar) throws F6.h {
        this.f9696b = zzclbVar.getLayoutParams();
        ViewParent parent = zzclbVar.getParent();
        this.f9698d = zzclbVar.zzK();
        if (!(parent instanceof ViewGroup)) {
            throw new F6.h("Could not get the parent of the WebView for an overlay.");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        this.f9697c = viewGroup;
        this.f9695a = viewGroup.indexOfChild(zzclbVar.zzE());
        viewGroup.removeView(zzclbVar.zzE());
        zzclbVar.zzag(true);
    }

    public static void a(int i5, n nVar) {
        synchronized (nVar.f9698d) {
            try {
                if (nVar.f9695a == i5) {
                    return;
                }
                nVar.f9695a = i5;
                Iterator it = ((CopyOnWriteArrayList) nVar.f9697c).iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    o2.f fVar = (o2.f) weakReference.get();
                    if (fVar != null) {
                        fVar.a(i5);
                    } else {
                        ((CopyOnWriteArrayList) nVar.f9697c).remove(weakReference);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized n b(Context context) {
        try {
            if (f9694e == null) {
                f9694e = new n(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f9694e;
    }

    public int c() {
        int i5;
        synchronized (this.f9698d) {
            i5 = this.f9695a;
        }
        return i5;
    }

    public int d() {
        int i5 = this.f9695a;
        if (i5 != 2) {
            return i5 != 3 ? 0 : 512;
        }
        return 2048;
    }

    public void e(List list) {
        Iterator it = list.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            C3779D c3779d = (C3779D) it.next();
            C3787h c3787h = (C3787h) ((HashMap) this.f9697c).get(c3779d.f43329a);
            if (c3787h != null) {
                Iterator it2 = c3787h.f43358a.iterator();
                while (it2.hasNext()) {
                    if (((p9.v) it2.next()).b(c3779d)) {
                        z2 = true;
                    }
                }
                c3787h.f43359b = c3779d;
            }
        }
        if (z2) {
            f();
        }
    }

    public void f() {
        Iterator it = ((HashSet) this.f9698d).iterator();
        while (it.hasNext()) {
            ((InterfaceC3517p) it.next()).a(null, null);
        }
    }

    public n(String str, EnumC4471b enumC4471b) {
        this.f9698d = new C4476g(new AdRequest$Builder(14));
        this.f9696b = str;
        this.f9697c = enumC4471b;
    }

    public n(z zVar) {
        this.f9698d = new HashSet();
        this.f9695a = 1;
        this.f9696b = zVar;
        this.f9697c = new HashMap();
        zVar.f43442m = this;
    }

    public n(Context context) {
        this.f9696b = new Handler(Looper.getMainLooper());
        this.f9697c = new CopyOnWriteArrayList();
        this.f9698d = new Object();
        this.f9695a = 0;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new V1(this, 5), intentFilter);
    }

    public n(int i5, String str, int i10, ArrayList arrayList, byte[] bArr) {
        List listUnmodifiableList;
        this.f9696b = str;
        this.f9695a = i10;
        if (arrayList == null) {
            listUnmodifiableList = Collections.EMPTY_LIST;
        } else {
            listUnmodifiableList = DesugarCollections.unmodifiableList(arrayList);
        }
        this.f9697c = listUnmodifiableList;
        this.f9698d = bArr;
    }
}
