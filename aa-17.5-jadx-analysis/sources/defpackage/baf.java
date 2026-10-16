package defpackage;

import java.util.List;

/* loaded from: classes.dex */
final class baf {
    public final List a;
    public final List[] b;
    public int c;
    public int d;
    public boolean e;
    final /* synthetic */ bag f;

    public baf(bag bagVar, List list) {
        this.f = bagVar;
        this.a = list;
        this.b = new List[list.size()];
        if (list.isEmpty()) {
            asl.c("NestedPrefetchController shouldn't be created with no states");
        }
    }
}
