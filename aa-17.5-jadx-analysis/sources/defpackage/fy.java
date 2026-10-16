package defpackage;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class fy {
    private static final Executor h = new dwn(1);
    public final gj a;
    public List d;
    public int f;
    final rz g;
    public final List c = new CopyOnWriteArrayList();
    public List e = Collections.EMPTY_LIST;
    public final Executor b = h;

    public fy(gj gjVar, rz rzVar) {
        this.a = gjVar;
        this.g = rzVar;
    }

    public final void a() {
        for (a aVar : this.c) {
        }
    }
}
