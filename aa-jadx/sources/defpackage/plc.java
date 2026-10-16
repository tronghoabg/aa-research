package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class plc {
    private static final java.util.Map a = new java.util.EnumMap(defpackage.plb.class);

    public static synchronized void a(android.content.Context context) {
        java.util.Iterator it = a.values().iterator();
        while (it.hasNext()) {
            ((defpackage.pld) it.next()).a(context);
        }
    }
}
