package defpackage;

import java.util.HashSet;
import java.util.Set;

/* loaded from: classes3.dex */
public final class aipc<N> implements aipb<N> {
    private final Set<N> visited;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "visited", "kotlin/reflect/jvm/internal/impl/utils/DFS$VisitedWithSet", "<init>"));
    }

    public aipc(Set<N> set) {
        if (set == null) {
            $$$reportNull$$$0(0);
        }
        this.visited = set;
    }

    @Override // defpackage.aipb
    public boolean checkAndMarkVisited(N n) {
        return this.visited.add(n);
    }

    public aipc() {
        this(new HashSet());
    }
}
