package kotlinx.b.c;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public abstract class x extends w {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(kotlinx.b.b bVar) {
        super(bVar);
        h.g.b.x.f(bVar, "element");
    }

    @Override // kotlinx.b.c.a
    public final /* bridge */ /* synthetic */ int b(Object obj) {
        Collection collection = (Collection) obj;
        h.g.b.x.f(collection, "<this>");
        return collection.size();
    }

    @Override // kotlinx.b.c.a
    public final /* bridge */ /* synthetic */ Iterator f(Object obj) {
        Collection collection = (Collection) obj;
        h.g.b.x.f(collection, "<this>");
        return collection.iterator();
    }
}
