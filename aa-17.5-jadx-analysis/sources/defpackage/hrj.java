package defpackage;

import androidx.car.app.model.Distance;
import androidx.car.app.navigation.model.Step;
import j$.util.DesugarCollections;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class hrj {
    public final int a;
    public final int b;
    public final Object c;
    public final Object d;

    public hrj(int i, Step step, Distance distance, int i2) {
        this.a = i;
        this.c = step;
        this.d = distance;
        this.b = i2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    public final List a() {
        return DesugarCollections.unmodifiableList(this.c);
    }

    public hrj(int i, WeakReference weakReference, Map map, int i2) {
        this.b = i;
        this.d = weakReference;
        this.c = map;
        this.a = i2;
    }

    public hrj(int i, List list, int i2, InputStream inputStream) {
        this.a = i;
        this.c = list;
        this.b = i2;
        this.d = inputStream;
    }
}
