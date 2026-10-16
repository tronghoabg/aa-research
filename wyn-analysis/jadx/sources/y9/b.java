package Y9;

import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f16734a;

    /* renamed from: b, reason: collision with root package name */
    public final c f16735b;

    public b(Set set, c cVar) {
        this.f16734a = b(set);
        this.f16735b = cVar;
    }

    public static String b(Set set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            sb2.append(aVar.f16732a);
            sb2.append('/');
            sb2.append(aVar.f16733b);
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    public final String a() {
        Set setUnmodifiableSet;
        c cVar = this.f16735b;
        synchronized (((HashSet) cVar.f16739b)) {
            setUnmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) cVar.f16739b);
        }
        boolean zIsEmpty = setUnmodifiableSet.isEmpty();
        String str = this.f16734a;
        if (zIsEmpty) {
            return str;
        }
        return str + ' ' + b(cVar.j());
    }
}
