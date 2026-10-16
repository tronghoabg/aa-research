package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class blc {
    public static final defpackage.bks a = defpackage.bkr.b;

    public static final boolean a(defpackage.cqu cquVar) {
        java.util.List list = cquVar.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!defpackage.a.X(((defpackage.crd) list.get(i)).i, 2)) {
                android.view.MotionEvent motionEventA = cquVar.a();
                if (motionEventA != null && motionEventA.isFromSource(8194)) {
                    return true;
                }
                android.view.MotionEvent motionEventA2 = cquVar.a();
                return motionEventA2 != null && motionEventA2.isFromSource(1048584);
            }
        }
        return true;
    }
}
