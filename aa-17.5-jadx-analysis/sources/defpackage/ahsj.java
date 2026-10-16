package defpackage;

import java.util.Comparator;

/* loaded from: classes3.dex */
public final class ahsj<T> implements Comparator {
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        return affa.x(ahvz.getFqNameSafe((agba) t).asString(), ahvz.getFqNameSafe((agba) t2).asString());
    }
}
