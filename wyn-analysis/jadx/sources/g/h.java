package g;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.AbstractC1451o;
import androidx.lifecycle.EnumC1450n;
import androidx.lifecycle.InterfaceC1455t;
import androidx.lifecycle.InterfaceC1457v;
import h.AbstractC2762a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import xf.AbstractC4513a;
import xf.AbstractC4516d;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f35468a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f35469b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f35470c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f35471d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final transient HashMap f35472e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f35473f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f35474g = new Bundle();

    public final boolean a(int i5, int i10, Intent intent) {
        InterfaceC2654b interfaceC2654b;
        String str = (String) this.f35468a.get(Integer.valueOf(i5));
        if (str == null) {
            return false;
        }
        C2658f c2658f = (C2658f) this.f35472e.get(str);
        if (c2658f == null || (interfaceC2654b = c2658f.f35464a) == null || !this.f35471d.contains(str)) {
            this.f35473f.remove(str);
            this.f35474g.putParcelable(str, new C2653a(intent, i10));
            return true;
        }
        interfaceC2654b.onActivityResult(c2658f.f35465b.c(intent, i10));
        this.f35471d.remove(str);
        return true;
    }

    public abstract void b(int i5, AbstractC2762a abstractC2762a, Object obj);

    public final C2657e c(String str, InterfaceC1457v interfaceC1457v, AbstractC2762a abstractC2762a, InterfaceC2654b interfaceC2654b) {
        AbstractC1451o lifecycle = interfaceC1457v.getLifecycle();
        if (lifecycle.b().compareTo(EnumC1450n.f18679d) >= 0) {
            throw new IllegalStateException("LifecycleOwner " + interfaceC1457v + " is attempting to register while current state is " + lifecycle.b() + ". LifecycleOwners must call register before they are STARTED.");
        }
        e(str);
        HashMap map = this.f35470c;
        C2659g c2659g = (C2659g) map.get(str);
        if (c2659g == null) {
            c2659g = new C2659g(lifecycle);
        }
        C2656d c2656d = new C2656d(this, str, interfaceC2654b, abstractC2762a);
        c2659g.f35466a.a(c2656d);
        c2659g.f35467b.add(c2656d);
        map.put(str, c2659g);
        return new C2657e(this, str, abstractC2762a, 0);
    }

    public final C2657e d(String str, AbstractC2762a abstractC2762a, InterfaceC2654b interfaceC2654b) {
        e(str);
        this.f35472e.put(str, new C2658f(abstractC2762a, interfaceC2654b));
        HashMap map = this.f35473f;
        if (map.containsKey(str)) {
            Object obj = map.get(str);
            map.remove(str);
            interfaceC2654b.onActivityResult(obj);
        }
        Bundle bundle = this.f35474g;
        C2653a c2653a = (C2653a) bundle.getParcelable(str);
        if (c2653a != null) {
            bundle.remove(str);
            interfaceC2654b.onActivityResult(abstractC2762a.c(c2653a.f35455b, c2653a.f35454a));
        }
        return new C2657e(this, str, abstractC2762a, 1);
    }

    public final void e(String str) {
        HashMap map = this.f35469b;
        if (((Integer) map.get(str)) != null) {
            return;
        }
        AbstractC4513a abstractC4513a = AbstractC4516d.f47897a;
        int iNextInt = AbstractC4516d.f47897a.g().nextInt(2147418112);
        while (true) {
            int i5 = iNextInt + 65536;
            HashMap map2 = this.f35468a;
            if (!map2.containsKey(Integer.valueOf(i5))) {
                map2.put(Integer.valueOf(i5), str);
                map.put(str, Integer.valueOf(i5));
                return;
            } else {
                AbstractC4513a abstractC4513a2 = AbstractC4516d.f47897a;
                iNextInt = AbstractC4516d.f47897a.g().nextInt(2147418112);
            }
        }
    }

    public final void f(String str) {
        Integer num;
        if (!this.f35471d.contains(str) && (num = (Integer) this.f35469b.remove(str)) != null) {
            this.f35468a.remove(num);
        }
        this.f35472e.remove(str);
        HashMap map = this.f35473f;
        if (map.containsKey(str)) {
            StringBuilder sbW = com.google.android.gms.internal.consent_sdk.a.w("Dropping pending result for request ", str, ": ");
            sbW.append(map.get(str));
            Log.w("ActivityResultRegistry", sbW.toString());
            map.remove(str);
        }
        Bundle bundle = this.f35474g;
        if (bundle.containsKey(str)) {
            StringBuilder sbW2 = com.google.android.gms.internal.consent_sdk.a.w("Dropping pending result for request ", str, ": ");
            sbW2.append(bundle.getParcelable(str));
            Log.w("ActivityResultRegistry", sbW2.toString());
            bundle.remove(str);
        }
        HashMap map2 = this.f35470c;
        C2659g c2659g = (C2659g) map2.get(str);
        if (c2659g != null) {
            ArrayList arrayList = c2659g.f35467b;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                c2659g.f35466a.c((InterfaceC1455t) it.next());
            }
            arrayList.clear();
            map2.remove(str);
        }
    }
}
