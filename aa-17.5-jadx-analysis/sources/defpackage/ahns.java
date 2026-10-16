package defpackage;

import defpackage.ahns;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes3.dex */
public abstract class ahns<BuilderType extends ahns> implements ahpf {
    protected static <T> void addAll(Iterable<T> iterable, Collection<? super T> collection) {
        if (iterable instanceof ahpb) {
            checkForNullValues(((ahpb) iterable).getUnderlyingElements());
            collection.addAll((Collection) iterable);
        } else {
            if (iterable instanceof Collection) {
                checkForNullValues(iterable);
                collection.addAll((Collection) iterable);
                return;
            }
            for (T t : iterable) {
                t.getClass();
                collection.add(t);
            }
        }
    }

    private static void checkForNullValues(Iterable<?> iterable) {
        Iterator<?> it = iterable.iterator();
        while (it.hasNext()) {
            it.next().getClass();
        }
    }

    protected static ahpy newUninitializedMessageException(ahpg ahpgVar) {
        return new ahpy(ahpgVar);
    }

    @Override // 
    /* renamed from: clone */
    public abstract BuilderType mo86clone();

    @Override // defpackage.ahpf
    public abstract BuilderType mergeFrom(ahoc ahocVar, ahog ahogVar) throws IOException;
}
