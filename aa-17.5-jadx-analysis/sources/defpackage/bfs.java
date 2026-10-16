package defpackage;

/* loaded from: classes.dex */
public final class bfs {
    private final int a;

    public bfs(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof bfs) && this.a == ((bfs) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }
}
