package defpackage;

/* loaded from: classes.dex */
final class cvk implements cvj {
    private final String b;
    private final cuq c;
    private final cuq d;

    public cvk(String str) {
        this.b = str;
        this.c = new cur(str, 0);
        this.d = new cur(str.concat(" maximum"), 0);
    }

    @Override // defpackage.cvj
    public final cuq a() {
        return this.c;
    }

    @Override // defpackage.cvj
    public final cuq b() {
        return this.d;
    }

    public final String toString() {
        return this.b;
    }
}
