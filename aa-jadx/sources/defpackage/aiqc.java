package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aiqc<N> implements defpackage.aiqb<N> {
    private final java.util.Set<N> visited;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "visited", "kotlin/reflect/jvm/internal/impl/utils/DFS$VisitedWithSet", "<init>"));
    }

    public aiqc(java.util.Set<N> set) {
        if (set == null) {
            $$$reportNull$$$0(0);
        }
        this.visited = set;
    }

    @Override // defpackage.aiqb
    public boolean checkAndMarkVisited(N n) {
        return this.visited.add(n);
    }

    public aiqc() {
        this(new java.util.HashSet());
    }
}
