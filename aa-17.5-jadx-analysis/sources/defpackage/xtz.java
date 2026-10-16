package defpackage;

import java.util.UUID;

/* loaded from: classes.dex */
public final class xtz extends xtn {
    public static final xtz a = new xtz(UUID.randomUUID());

    private xtz(UUID uuid) {
        super("<skip trace>", uuid, xtj.gQ(uuid), xud.a, (nrd) xts.c.get());
    }

    @Override // defpackage.xuk
    public final xue i() {
        return xud.a;
    }

    @Override // defpackage.xuk
    public final xuk m(String str, xue xueVar, nrd nrdVar) {
        throw new IllegalStateException("Can't create child trace for no trace!");
    }

    @Override // defpackage.xuk
    public final void j() {
    }

    @Override // defpackage.xuk
    public final void k() {
    }

    @Override // defpackage.xuk
    public final void l() {
    }
}
