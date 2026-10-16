package com.google.d.d;

import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class bc implements Iterable {
    protected bc() {
    }

    public static bc a(Iterable iterable, Iterable iterable2) {
        Iterable[] iterableArr = {iterable, iterable2};
        for (int i2 = 0; i2 < 2; i2++) {
            com.google.d.b.an.B(iterableArr[i2]);
        }
        return new bb(iterableArr);
    }

    public final String toString() {
        Iterator it = iterator();
        StringBuilder sb = new StringBuilder("[");
        boolean z = true;
        while (it.hasNext()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(it.next());
            z = false;
        }
        sb.append(']');
        return sb.toString();
    }
}
