package p9;

import A7.C0237b0;
import A7.C0295v;
import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;

/* renamed from: p9.C, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3778C {

    /* renamed from: a, reason: collision with root package name */
    public int f43322a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f43323b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f43324c;

    /* renamed from: d, reason: collision with root package name */
    public Object f43325d;

    /* renamed from: e, reason: collision with root package name */
    public Object f43326e;

    /* renamed from: f, reason: collision with root package name */
    public Object f43327f;

    /* renamed from: g, reason: collision with root package name */
    public Object f43328g;

    public C3778C(u uVar, c9.d dVar) {
        this.f43324c = uVar;
        this.f43322a = 1;
        this.f43325d = new s9.i(s9.g.f45372a, new c9.d(Collections.EMPTY_LIST, new V5.s(uVar.a(), 3)));
        this.f43326e = dVar;
        c9.d dVar2 = s9.h.f45374c;
        this.f43327f = dVar2;
        this.f43328g = dVar2;
    }

    public static int c(C3785f c3785f) {
        int iOrdinal = c3785f.f43352a.ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        int i5 = 1;
        if (iOrdinal != 1) {
            i5 = 2;
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return 2;
                }
                throw new IllegalArgumentException("Unknown change type: " + c3785f.f43352a);
            }
        }
        return i5;
    }

    public X2.j a(C0237b0 c0237b0, v9.t tVar, boolean z2) {
        List list;
        s9.k kVar;
        C3779D c3779d;
        A6.c.z(!c0237b0.f812b, "Cannot apply changes that need a refill", new Object[0]);
        s9.i iVar = (s9.i) this.f43325d;
        this.f43325d = (s9.i) c0237b0.f813c;
        this.f43328g = (c9.d) c0237b0.f815e;
        a2.v vVar = (a2.v) c0237b0.f814d;
        vVar.getClass();
        ArrayList arrayList = new ArrayList(((TreeMap) vVar.f17322b).values());
        Collections.sort(arrayList, new V5.s(this, 2));
        if (tVar != null) {
            Iterator it = tVar.f47114c.iterator();
            while (true) {
                C0295v c0295v = (C0295v) it;
                if (!((Iterator) c0295v.f1081b).hasNext()) {
                    break;
                }
                this.f43326e = ((c9.d) this.f43326e).a((s9.h) c0295v.next());
            }
            Iterator it2 = tVar.f47115d.iterator();
            while (true) {
                C0295v c0295v2 = (C0295v) it2;
                if (!((Iterator) c0295v2.f1081b).hasNext()) {
                    break;
                }
                s9.h hVar = (s9.h) c0295v2.next();
                A6.c.z(((c9.d) this.f43326e).f19805a.a(hVar), "Modified document %s not found in view.", hVar);
            }
            Iterator it3 = tVar.f47116e.iterator();
            while (true) {
                C0295v c0295v3 = (C0295v) it3;
                if (!((Iterator) c0295v3.f1081b).hasNext()) {
                    break;
                }
                this.f43326e = ((c9.d) this.f43326e).c((s9.h) c0295v3.next());
            }
            this.f43323b = tVar.f47113b;
        }
        if (!z2 && this.f43323b) {
            c9.d dVar = (c9.d) this.f43327f;
            this.f43327f = s9.h.f45374c;
            Iterator it4 = ((s9.i) this.f43325d).f45377b.iterator();
            while (true) {
                C0295v c0295v4 = (C0295v) it4;
                if (!((Iterator) c0295v4.f1081b).hasNext()) {
                    break;
                }
                s9.k kVar2 = (s9.k) c0295v4.next();
                s9.h hVar2 = kVar2.f45380a;
                if (!((c9.d) this.f43326e).f19805a.a(hVar2) && (kVar = (s9.k) ((s9.i) this.f43325d).f45376a.b(hVar2)) != null && !kVar.c()) {
                    this.f43327f = ((c9.d) this.f43327f).a(kVar2.f45380a);
                }
            }
            ArrayList arrayList2 = new ArrayList(((c9.d) this.f43327f).f19805a.size() + dVar.f19805a.size());
            Iterator it5 = dVar.iterator();
            while (true) {
                C0295v c0295v5 = (C0295v) it5;
                if (!((Iterator) c0295v5.f1081b).hasNext()) {
                    break;
                }
                s9.h hVar3 = (s9.h) c0295v5.next();
                if (!((c9.d) this.f43327f).f19805a.a(hVar3)) {
                    arrayList2.add(new r(q.f43393b, hVar3));
                }
            }
            Iterator it6 = ((c9.d) this.f43327f).iterator();
            while (true) {
                C0295v c0295v6 = (C0295v) it6;
                if (!((Iterator) c0295v6.f1081b).hasNext()) {
                    break;
                }
                s9.h hVar4 = (s9.h) c0295v6.next();
                if (!dVar.f19805a.a(hVar4)) {
                    arrayList2.add(new r(q.f43392a, hVar4));
                }
            }
            list = arrayList2;
        } else {
            list = Collections.EMPTY_LIST;
        }
        int i5 = (((c9.d) this.f43327f).f19805a.size() == 0 && this.f43323b && !z2) ? 3 : 2;
        boolean z10 = i5 != this.f43322a;
        this.f43322a = i5;
        if (arrayList.size() != 0 || z10) {
            c3779d = new C3779D((u) this.f43324c, (s9.i) c0237b0.f813c, iVar, arrayList, i5 == 2, (c9.d) c0237b0.f815e, z10, false, (tVar == null || tVar.f47112a.isEmpty()) ? false : true);
        } else {
            c3779d = null;
        }
        return new X2.j(25, c3779d, list);
    }

    public u.k b() {
        Intent intent = (Intent) this.f43324c;
        if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", null);
            intent.putExtras(bundle);
        }
        intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f43323b);
        ((ab.b) this.f43325d).getClass();
        intent.putExtras(new Bundle());
        Bundle bundle2 = (Bundle) this.f43328g;
        if (bundle2 != null) {
            intent.putExtras(bundle2);
        }
        if (((SparseArray) this.f43327f) != null) {
            Bundle bundle3 = new Bundle();
            bundle3.putSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS", (SparseArray) this.f43327f);
            intent.putExtras(bundle3);
        }
        intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.f43322a);
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 24) {
            String strA = u.i.a();
            if (!TextUtils.isEmpty(strA)) {
                Bundle bundleExtra = intent.hasExtra("com.android.browser.headers") ? intent.getBundleExtra("com.android.browser.headers") : new Bundle();
                if (!bundleExtra.containsKey("Accept-Language")) {
                    bundleExtra.putString("Accept-Language", strA);
                    intent.putExtra("com.android.browser.headers", bundleExtra);
                }
            }
        }
        if (i5 >= 34) {
            if (((ActivityOptions) this.f43326e) == null) {
                this.f43326e = u.h.a();
            }
            u.j.a((ActivityOptions) this.f43326e, false);
        }
        ActivityOptions activityOptions = (ActivityOptions) this.f43326e;
        return new u.k(intent, activityOptions != null ? activityOptions.toBundle() : null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0101, code lost:
    
        if (r1.c() == false) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0157 A[PHI: r5
  0x0157: PHI (r5v8 char) = (r5v6 char), (r5v6 char), (r5v16 char), (r5v16 char) binds: [B:80:0x0153, B:81:0x0155, B:67:0x0125, B:64:0x0119] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0199  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public A7.C0237b0 d(c9.c r20, A7.C0237b0 r21) {
        /*
            Method dump skipped, instructions count: 521
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p9.C3778C.d(c9.c, A7.b0):A7.b0");
    }

    public void e(int i5) {
        if (i5 < 0 || i5 > 2) {
            throw new IllegalArgumentException("Invalid value for the shareState argument");
        }
        this.f43322a = i5;
        Intent intent = (Intent) this.f43324c;
        if (i5 == 1) {
            intent.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", true);
        } else if (i5 == 2) {
            intent.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", false);
        } else {
            intent.removeExtra("android.support.customtabs.extra.SHARE_MENU_ITEM");
        }
    }

    public C3778C() {
        this.f43324c = new Intent("android.intent.action.VIEW");
        this.f43325d = new ab.b();
        this.f43322a = 0;
        this.f43323b = true;
    }

    public C3778C(u.n nVar) {
        Intent intent = new Intent("android.intent.action.VIEW");
        this.f43324c = intent;
        this.f43325d = new ab.b();
        this.f43322a = 0;
        this.f43323b = true;
        if (nVar != null) {
            intent.setPackage(nVar.f46077d.getPackageName());
            u.f fVar = nVar.f46076c;
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", fVar);
            intent.putExtras(bundle);
        }
    }
}
