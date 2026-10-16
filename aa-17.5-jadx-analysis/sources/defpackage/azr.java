package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class azr {
    public final int a;
    public final List b = new ArrayList();
    final /* synthetic */ azt c;

    public azr(azt aztVar, int i) {
        this.c = aztVar;
        this.a = i;
    }

    public final void a(int i) {
        azt aztVar = this.c;
        sji sjiVar = aztVar.f;
        if (sjiVar == null) {
            return;
        }
        List list = this.b;
        epk epkVar = aztVar.e;
        Object obj = sjiVar.c;
        if (obj instanceof ayd) {
        }
        list.add(new bag(sjiVar, i, epkVar, null));
    }
}
