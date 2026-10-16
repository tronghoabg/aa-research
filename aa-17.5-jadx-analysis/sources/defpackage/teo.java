package defpackage;

import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class teo {
    private int a = Integer.MIN_VALUE;
    private final Set b = new HashSet();

    public final int b() {
        int i;
        synchronized (this.b) {
            i = this.a + 1;
            this.a = i;
        }
        return i;
    }

    public final void c(int i, Runnable runnable) {
        Set set = this.b;
        synchronized (set) {
            if (set.add(Integer.valueOf(i))) {
                runnable.run();
            }
        }
    }
}
