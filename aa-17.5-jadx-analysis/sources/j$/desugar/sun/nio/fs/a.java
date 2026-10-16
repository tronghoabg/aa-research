package j$.desugar.sun.nio.fs;

import java.util.HashMap;
import java.util.HashSet;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final class a {
    public HashSet a;
    public HashMap b;
    public boolean c;

    public final void a(Object obj, String str) {
        this.b.put(str, obj);
    }

    public final boolean b(String str) {
        return this.c || this.a.contains(str);
    }
}
