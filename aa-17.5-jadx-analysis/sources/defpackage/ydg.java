package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
final class ydg extends yaq {
    final /* synthetic */ ydj a;
    private final Iterator b;

    public ydg(ydj ydjVar) {
        this.a = ydjVar;
        this.b = ydjVar.countMap.entrySet().iterator();
    }

    @Override // defpackage.yaq
    protected final /* bridge */ /* synthetic */ Object a() {
        Map.Entry entry;
        int i;
        do {
            Iterator it = this.b;
            if (!it.hasNext()) {
                b();
                return null;
            }
            entry = (Map.Entry) it.next();
            i = ((AtomicInteger) entry.getValue()).get();
        } while (i == 0);
        return new ylg(entry.getKey(), i);
    }
}
