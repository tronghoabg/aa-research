package defpackage;

import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class lwi implements lhg {
    public boolean a = false;
    public final Set b = new HashSet();

    public static lwi a() {
        return (lwi) mki.a.b(lwi.class, new lpu(13));
    }

    public final void b(lwh lwhVar) {
        wer.c();
        this.b.add(lwhVar);
    }

    @Override // defpackage.lhg
    public final void c() {
        ((kzc) kfl.h().k()).f(11, new kyz(this, 3), Boolean.class);
    }

    @Override // defpackage.lhg
    public final void d() {
        this.b.clear();
    }

    public final void e(lwh lwhVar) {
        wer.c();
        this.b.remove(lwhVar);
    }
}
