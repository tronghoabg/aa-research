package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
@java.lang.Deprecated
public final class etl {
    public final java.lang.Object a;
    public final java.lang.Object b;

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Map] */
    public etl(java.util.Map map) {
        this.a = map;
        this.b = new java.util.HashMap();
        for (java.util.Map.Entry entry : map.entrySet()) {
            defpackage.epw epwVar = (defpackage.epw) entry.getValue();
            java.util.List arrayList = (java.util.List) this.b.get(epwVar);
            if (arrayList == null) {
                arrayList = new java.util.ArrayList();
                this.b.put(epwVar, arrayList);
            }
            arrayList.add((defpackage.epg) entry.getKey());
        }
    }

    public static void a(java.util.List list, defpackage.eqg eqgVar, defpackage.epw epwVar, java.lang.Object obj) {
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            defpackage.epg epgVar = (defpackage.epg) list.get(size);
            try {
                int i = epgVar.a;
                if (i == 0) {
                    epgVar.b.invoke(obj, null);
                } else if (i != 1) {
                    epgVar.b.invoke(obj, eqgVar, epwVar);
                } else {
                    epgVar.b.invoke(obj, eqgVar);
                }
            } catch (java.lang.IllegalAccessException e) {
                throw new java.lang.RuntimeException(e);
            } catch (java.lang.reflect.InvocationTargetException e2) {
                throw new java.lang.RuntimeException("Failed to call observer method", e2.getCause());
            }
        }
    }

    public etl(java.lang.String str, android.os.Bundle bundle) {
        this.a = str;
        this.b = bundle;
    }
}
