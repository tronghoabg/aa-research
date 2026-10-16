package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class hio {
    public final boolean a;
    public final java.lang.Object b;
    public final java.lang.Object c;

    public hio(androidx.car.app.model.Action action, ajnd ajndVar) {
        this.b = action;
        this.a = (action.getFlags() & 2) != 0;
        this.c = ajndVar;
    }

    public hio(defpackage.dec decVar, defpackage.dlx dlxVar, boolean z) {
        this.b = decVar;
        this.c = dlxVar;
        this.a = z;
    }
}
