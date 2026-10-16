package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hrs {
    public final int a;
    public final int b;
    public final java.lang.Object c;
    public final java.lang.Object d;

    public hrs(int i, androidx.car.app.navigation.model.Step step, androidx.car.app.model.Distance distance, int i2) {
        this.a = i;
        this.c = step;
        this.d = distance;
        this.b = i2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    public final java.util.List a() {
        return j$.util.DesugarCollections.unmodifiableList(this.c);
    }

    public hrs(int i, java.lang.ref.WeakReference weakReference, java.util.Map map, int i2) {
        this.b = i;
        this.d = weakReference;
        this.c = map;
        this.a = i2;
    }

    public hrs(int i, java.util.List list, int i2, java.io.InputStream inputStream) {
        this.a = i;
        this.c = list;
        this.b = i2;
        this.d = inputStream;
    }
}
