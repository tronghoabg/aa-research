package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ujx {
    public static final byte[] a = new byte[0];

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    public static void a(java.lang.Object obj, defpackage.ygn ygnVar, java.util.Map map) {
        if (ygnVar != null) {
            ?? r2 = ygnVar.a;
            if (r2.isEmpty()) {
                return;
            }
            defpackage.uav uavVar = (defpackage.uav) r2.get(0);
            java.util.List arrayList = (java.util.List) map.get(uavVar);
            if (arrayList == null) {
                arrayList = new java.util.ArrayList();
                map.put(uavVar, arrayList);
            }
            arrayList.add(obj);
        }
    }
}
