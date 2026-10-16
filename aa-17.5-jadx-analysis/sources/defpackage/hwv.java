package defpackage;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public final class hwv {
    public final dzk a;
    public final List b;
    public final String c;

    public hwv(Class cls, Class cls2, Class cls3, List list, dzk dzkVar) {
        this.a = dzkVar;
        fxy.i(list);
        this.b = list;
        this.c = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public final String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.b.toArray()) + "}";
    }
}
