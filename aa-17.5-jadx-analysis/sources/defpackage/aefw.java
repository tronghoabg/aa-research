package defpackage;

import java.util.function.IntPredicate;
import java.util.function.Predicate;

@FunctionalInterface
/* loaded from: classes3.dex */
public interface aefw extends Predicate, IntPredicate {
    aefw a(aefw aefwVar);

    aefw b(aefw aefwVar);

    boolean c(byte b);

    @Deprecated
    boolean d(Byte b);
}
