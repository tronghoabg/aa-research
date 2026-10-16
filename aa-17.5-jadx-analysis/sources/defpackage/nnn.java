package defpackage;

import android.content.ComponentName;
import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class nnn implements afdr {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ nnn(int i, List list, aitx aitxVar, nov novVar, int i2) {
        this.e = i2;
        this.a = i;
        this.d = list;
        this.b = aitxVar;
        this.c = novVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [aitx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.afdr
    public final Object invoke() {
        if (this.e == 0) {
            nnu.n((yzy) this.b, (ComponentName) this.c, this.a);
            ((nnk) this.d).b.invoke();
            return afak.a;
        }
        ?? r0 = this.b;
        yph yphVar = nkl.a;
        ?? r1 = this.d;
        int size = (this.a + 1) % r1.size();
        not notVar = (not) r1.get(size);
        ((ype) nkl.a.f()).K("Setting new direction to %s at index %s", notVar, size);
        ahnc.d(r0, null, 0, new nkn(notVar, (nov) this.c, (afck) null, 1), 3);
        return afak.a;
    }

    public /* synthetic */ nnn(yzy yzyVar, ComponentName componentName, int i, nnk nnkVar, int i2) {
        this.e = i2;
        this.b = yzyVar;
        this.c = componentName;
        this.a = i;
        this.d = nnkVar;
    }
}
