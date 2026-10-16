package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class qlf {
    public final qlk g;
    public final qlc h;
    public final List i;

    protected qlf(qlk qlkVar, spk spkVar) {
        spu.aw(qlkVar);
        this.g = qlkVar;
        this.i = new ArrayList();
        qlc qlcVar = new qlc(this, spkVar);
        qlcVar.f = true;
        this.h = qlcVar;
    }

    public void a(qlc qlcVar) {
        throw null;
    }

    public final List b() {
        return this.h.h;
    }
}
