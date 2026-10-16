package defpackage;

import android.util.Pair;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* loaded from: classes2.dex */
final class eon extends ArrayList {
    private final Class a;
    private final Class b;

    public eon(Class cls, Class cls2) {
        this.a = cls;
        this.b = cls2;
    }

    public final void a(Object obj, Object obj2) {
        add(Pair.create(obj, obj2));
    }

    public final ncp b() {
        Class cls = this.a;
        int size = size();
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) cls, size);
        Object[] objArr2 = (Object[]) Array.newInstance((Class<?>) this.b, size);
        for (int i = 0; i < size; i++) {
            objArr[i] = ((Pair) get(i)).first;
            objArr2[i] = ((Pair) get(i)).second;
        }
        return new ncp(objArr, objArr2);
    }
}
