package Va;

import E5.C0441b;
import android.webkit.WebView;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;

/* renamed from: Va.ob, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1091ob implements InterfaceC1039kb {

    /* renamed from: d, reason: collision with root package name */
    public static final WeakHashMap f14463d = new WeakHashMap();

    /* renamed from: a, reason: collision with root package name */
    public String f14464a;

    /* renamed from: b, reason: collision with root package name */
    public C0441b f14465b;

    /* renamed from: c, reason: collision with root package name */
    public HashSet f14466c;

    public static C1091ob f(WebView webView, String str) {
        WeakHashMap weakHashMap = f14463d;
        C1091ob c1091ob = (C1091ob) weakHashMap.get(webView);
        if (c1091ob != null) {
            return c1091ob;
        }
        C1091ob c1091ob2 = new C1091ob();
        c1091ob2.f14466c = new HashSet();
        c1091ob2.f14464a = str;
        C0441b c0441b = new C0441b(5);
        c0441b.f3291c = new WeakReference(webView);
        c1091ob2.f14465b = c0441b;
        c0441b.t(new C1065mb(c1091ob2));
        c0441b.x(new C1078nb(c1091ob2));
        weakHashMap.put(webView, c1091ob2);
        return c1091ob2;
    }

    @Override // Va.InterfaceC1039kb
    public final void a(WebView webView) {
        Iterator it = new HashSet(this.f14466c).iterator();
        while (it.hasNext()) {
            InterfaceC1039kb interfaceC1039kb = (InterfaceC1039kb) it.next();
            if (interfaceC1039kb != null) {
                interfaceC1039kb.a(webView);
            }
        }
    }

    @Override // Va.InterfaceC1039kb
    public final void b(WebView webView, String str, boolean z2) {
        Iterator it = new HashSet(this.f14466c).iterator();
        while (it.hasNext()) {
            InterfaceC1039kb interfaceC1039kb = (InterfaceC1039kb) it.next();
            if (interfaceC1039kb != null) {
                interfaceC1039kb.b(webView, str, z2);
            }
        }
    }

    @Override // Va.InterfaceC1039kb
    public final void c(WebView webView, String str) {
        Iterator it = new HashSet(this.f14466c).iterator();
        while (it.hasNext()) {
            InterfaceC1039kb interfaceC1039kb = (InterfaceC1039kb) it.next();
            if (interfaceC1039kb != null) {
                interfaceC1039kb.c(webView, str);
            }
        }
    }

    @Override // Va.InterfaceC1039kb
    public final void d(WebView webView, String str, String str2) {
        Iterator it = new HashSet(this.f14466c).iterator();
        while (it.hasNext()) {
            InterfaceC1039kb interfaceC1039kb = (InterfaceC1039kb) it.next();
            if (interfaceC1039kb != null) {
                interfaceC1039kb.d(webView, str, str2);
            }
        }
    }

    public final InterfaceC0950e0 e() {
        C0441b c0441b = this.f14465b;
        c0441b.getClass();
        int i5 = C0441b.f3287g;
        C0441b.f3288h = (i5 + 63) % 128;
        WeakReference weakReference = (WeakReference) c0441b.f3292d;
        if (weakReference == null) {
            return null;
        }
        int i10 = i5 + 49;
        C0441b.f3288h = i10 % 128;
        if (i10 % 2 != 0) {
            return (InterfaceC0950e0) weakReference.get();
        }
        throw null;
    }
}
