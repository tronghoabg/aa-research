package i0;

import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final class C extends E9.c {
    public static C2823a w(AbstractC2822B abstractC2822B) {
        if (abstractC2822B instanceof C2823a) {
            return (C2823a) abstractC2822B;
        }
        throw new IllegalStateException("Cannot only insert VNode into Group");
    }

    @Override // E9.c
    public final void l(int i5, Object obj) {
        AbstractC2822B instance = (AbstractC2822B) obj;
        AbstractC3340k.e(instance, "instance");
    }

    @Override // E9.c
    public final void m(int i5, Object obj) {
        AbstractC2822B instance = (AbstractC2822B) obj;
        AbstractC3340k.e(instance, "instance");
        C2823a c2823aW = w((AbstractC2822B) this.f3603c);
        c2823aW.getClass();
        ArrayList arrayList = c2823aW.f36575c;
        if (i5 < arrayList.size()) {
            arrayList.set(i5, instance);
        } else {
            arrayList.add(instance);
        }
        instance.d(c2823aW.f36580h);
        c2823aW.c();
    }

    @Override // E9.c
    public final void n(int i5, int i10, int i11) {
        C2823a c2823aW = w((AbstractC2822B) this.f3603c);
        ArrayList arrayList = c2823aW.f36575c;
        int i12 = 0;
        if (i5 > i10) {
            while (i12 < i11) {
                AbstractC2822B abstractC2822B = (AbstractC2822B) arrayList.get(i5);
                arrayList.remove(i5);
                arrayList.add(i10, abstractC2822B);
                i10++;
                i12++;
            }
        } else {
            while (i12 < i11) {
                AbstractC2822B abstractC2822B2 = (AbstractC2822B) arrayList.get(i5);
                arrayList.remove(i5);
                arrayList.add(i10 - 1, abstractC2822B2);
                i12++;
            }
        }
        c2823aW.c();
    }

    @Override // E9.c
    public final void o() {
        C2823a c2823aW = w((AbstractC2822B) this.f3601a);
        c2823aW.e(0, c2823aW.f36575c.size());
    }

    @Override // E9.c
    public final void r(int i5, int i10) {
        w((AbstractC2822B) this.f3603c).e(i5, i10);
    }
}
