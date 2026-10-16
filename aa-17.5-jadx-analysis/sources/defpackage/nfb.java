package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public final /* synthetic */ class nfb implements lip {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ nfb(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.lip
    public final void a(int i) {
        if (this.b == 0) {
            ((eqj) this.a).j(Integer.valueOf(i));
        } else {
            Iterator it = ((ljk) this.a).i.iterator();
            while (it.hasNext()) {
                ((lip) it.next()).a(i);
            }
        }
    }
}
