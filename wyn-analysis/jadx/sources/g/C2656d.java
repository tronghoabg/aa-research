package g;

import android.os.Bundle;
import androidx.lifecycle.EnumC1449m;
import androidx.lifecycle.InterfaceC1455t;
import androidx.lifecycle.InterfaceC1457v;
import h.AbstractC2762a;
import java.util.HashMap;

/* renamed from: g.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2656d implements InterfaceC1455t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f35456a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2654b f35457b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC2762a f35458c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h f35459d;

    public C2656d(h hVar, String str, InterfaceC2654b interfaceC2654b, AbstractC2762a abstractC2762a) {
        this.f35459d = hVar;
        this.f35456a = str;
        this.f35457b = interfaceC2654b;
        this.f35458c = abstractC2762a;
    }

    @Override // androidx.lifecycle.InterfaceC1455t
    public final void onStateChanged(InterfaceC1457v interfaceC1457v, EnumC1449m enumC1449m) {
        boolean zEquals = EnumC1449m.ON_START.equals(enumC1449m);
        String str = this.f35456a;
        h hVar = this.f35459d;
        if (!zEquals) {
            if (EnumC1449m.ON_STOP.equals(enumC1449m)) {
                hVar.f35472e.remove(str);
                return;
            } else {
                if (EnumC1449m.ON_DESTROY.equals(enumC1449m)) {
                    hVar.f(str);
                    return;
                }
                return;
            }
        }
        HashMap map = hVar.f35472e;
        InterfaceC2654b interfaceC2654b = this.f35457b;
        AbstractC2762a abstractC2762a = this.f35458c;
        map.put(str, new C2658f(abstractC2762a, interfaceC2654b));
        HashMap map2 = hVar.f35473f;
        if (map2.containsKey(str)) {
            Object obj = map2.get(str);
            map2.remove(str);
            interfaceC2654b.onActivityResult(obj);
        }
        Bundle bundle = hVar.f35474g;
        C2653a c2653a = (C2653a) bundle.getParcelable(str);
        if (c2653a != null) {
            bundle.remove(str);
            interfaceC2654b.onActivityResult(abstractC2762a.c(c2653a.f35455b, c2653a.f35454a));
        }
    }
}
