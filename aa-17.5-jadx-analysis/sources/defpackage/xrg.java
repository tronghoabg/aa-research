package defpackage;

import android.util.Log;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: classes3.dex */
public final class xrg {
    public final long a;
    public final long b;
    public final aes c;
    public final List d;

    public xrg(long j, long j2, aes aesVar, List list) {
        aesVar.getClass();
        this.a = j;
        this.b = j2;
        this.c = aesVar;
        this.d = list;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            xrc xrcVar = (xrc) it.next();
            if (!linkedHashSet.add(xrcVar.a)) {
                linkedHashSet2.add(xrcVar.a.a());
            }
        }
        if (linkedHashSet2.isEmpty()) {
            return;
        }
        Log.w("KeyframeTransition", "Warning: Duplicate uniform(s) defined in KeyframeTransition: " + linkedHashSet2 + ". Duration: " + this.a + ", Delay: " + this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xrg)) {
            return false;
        }
        xrg xrgVar = (xrg) obj;
        return this.a == xrgVar.a && this.b == xrgVar.b && affa.f(this.c, xrgVar.c) && affa.f(this.d, xrgVar.d);
    }

    public final int hashCode() {
        return (((((a.g(this.a) * 31) + a.g(this.b)) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "KeyframeTransition(duration=" + this.a + ", delay=" + this.b + ", easing=" + this.c + ", targetKeyFrames=" + this.d + ")";
    }
}
