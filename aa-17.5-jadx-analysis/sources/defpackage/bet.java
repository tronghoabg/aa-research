package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class bet {
    public final bed a;
    public final blr b;
    public final djv c;
    public final boolean d = true;
    public final boolean e;
    public final djn f;
    public final bfl g;
    public final afec h;
    public final int i;
    public final ntn j;
    public final ntn k;
    public final asl l;

    public bet(bed bedVar, blr blrVar, djv djvVar, boolean z, ntn ntnVar, djn djnVar, bfl bflVar, ntn ntnVar2, asl aslVar, afec afecVar, int i) {
        this.a = bedVar;
        this.b = blrVar;
        this.c = djvVar;
        this.e = z;
        this.j = ntnVar;
        this.f = djnVar;
        this.g = bflVar;
        this.k = ntnVar2;
        this.l = aslVar;
        this.h = afecVar;
        this.i = i;
    }

    public final void a(diz dizVar) {
        List listSingletonList = Collections.singletonList(dizVar);
        listSingletonList.getClass();
        b(listSingletonList);
    }

    public final void b(List list) {
        ArrayList arrayList = new ArrayList(list);
        arrayList.add(0, new djb());
        this.h.invoke(this.a.t.b(arrayList));
    }
}
