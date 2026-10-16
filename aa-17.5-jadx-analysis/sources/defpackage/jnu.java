package defpackage;

import java.util.concurrent.CancellationException;

/* loaded from: classes2.dex */
final class jnu implements zge {
    final /* synthetic */ long a;
    final /* synthetic */ long b;
    final /* synthetic */ jnv c;

    public jnu(jnv jnvVar, long j, long j2) {
        this.a = j;
        this.b = j2;
        this.c = jnvVar;
    }

    @Override // defpackage.zge
    public final void a(Throwable th) {
        boolean z = th instanceof CancellationException;
        jnv jnvVar = this.c;
        if (z) {
            jnv.d(jnvVar.b, jnvVar.c, jnvVar.f, jnvVar.g, 5, this.b, -1L);
        } else {
            jnv.d(jnvVar.b, jnvVar.c, jnvVar.f, jnvVar.g, 3, this.b, -1L);
        }
    }

    @Override // defpackage.zge
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        long j = this.a;
        jnv jnvVar = this.c;
        jnv.d(jnvVar.b, jnvVar.c, jnvVar.f, jnvVar.g, 2, this.b, j - jnvVar.j.get());
    }
}
