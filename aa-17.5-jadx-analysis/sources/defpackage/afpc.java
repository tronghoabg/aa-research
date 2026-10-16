package defpackage;

import java.lang.reflect.Method;
import java.util.Comparator;

/* loaded from: classes3.dex */
public final class afpc<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        return affa.x(((Method) t).getName(), ((Method) t2).getName());
    }
}
