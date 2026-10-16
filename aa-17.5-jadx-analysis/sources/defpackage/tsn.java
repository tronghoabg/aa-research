package defpackage;

/* loaded from: classes3.dex */
public final class tsn {
    public abgi a = null;
    private final aezk b;
    private final ackk c;
    private final xyc d;

    public tsn(aezk aezkVar, ackk ackkVar) {
        this.c = ackkVar;
        this.b = aezkVar;
        this.d = wub.L(new qfe(aezkVar, 6));
    }

    public final abgi a() {
        if (!((Boolean) this.d.gu()).booleanValue()) {
            return ((zwm) this.b.a()).d();
        }
        synchronized (this) {
            abgi abgiVar = this.a;
            return abgiVar != null ? abgiVar : ((zwm) ((ajmd) this.c.a()).a).d();
        }
    }
}
