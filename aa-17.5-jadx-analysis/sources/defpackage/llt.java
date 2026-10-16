package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
final class llt extends db {
    final /* synthetic */ llu d;

    public llt(llu lluVar) {
        this.d = lluVar;
    }

    @Override // defpackage.db
    public final void a(String str, List list) {
        this.d.e(str, llu.g(list, new lka(3)));
    }

    @Override // defpackage.db
    public final void b(String str) {
        this.d.f(str);
    }
}
