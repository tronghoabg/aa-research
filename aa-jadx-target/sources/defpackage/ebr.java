package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class ebr {
    static android.view.WindowInsets a(android.view.View view, android.view.WindowInsets windowInsets) {
        return view.dispatchApplyWindowInsets(windowInsets);
    }

    static java.lang.CharSequence b(android.view.View view) {
        return bgp$.ExternalSyntheticApiModelOutline0.m(view);
    }

    static void c(android.view.View view, java.lang.CharSequence charSequence) {
        bgp$.ExternalSyntheticApiModelOutline0.m(view, charSequence);
    }

    public static defpackage.evk h(defpackage.affc affcVar) {
        evl evlVar = new evl();
        affcVar.invoke(evlVar);
        defpackage.evj evjVar = evlVar.a;
        evjVar.a = evlVar.b;
        evjVar.b = evlVar.c;
        evjVar.b(evlVar.d, false, evlVar.e);
        return evjVar.a();
    }

    public static java.util.List i(java.util.Map map, defpackage.affc affcVar) {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry entry : map.entrySet()) {
            defpackage.euu euuVar = (defpackage.euu) entry.getValue();
            java.lang.Boolean boolValueOf = euuVar != null ? java.lang.Boolean.valueOf(euuVar.b) : null;
            boolValueOf.getClass();
            if (!boolValueOf.booleanValue() && !euuVar.c) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        java.util.Set setKeySet = linkedHashMap.keySet();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : setKeySet) {
            if (((java.lang.Boolean) affcVar.invoke((java.lang.String) obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public boolean f() {
        return false;
    }

    public void g() {
    }

    public void d(boolean z) {
    }

    public void e(boolean z) {
    }
}
