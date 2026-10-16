package defpackage;

import j$.time.Duration;

/* loaded from: classes.dex */
final class jgd implements jgf {
    private final jgf a;
    private final jgf b;

    public jgd(jgf jgfVar, jgf jgfVar2) {
        this.a = jgfVar;
        this.b = jgfVar2;
    }

    @Override // defpackage.jgf
    public final void a(Duration duration) {
        this.a.a(duration);
        this.b.a(duration);
    }
}
