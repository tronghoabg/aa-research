package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class akfc extends defpackage.akey {
    private static final long serialVersionUID = -203813474600094134L;
    final /* synthetic */ defpackage.akfd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akfc(defpackage.akfd akfdVar, defpackage.akdo akdoVar) {
        super(akdoVar);
        this.a = akfdVar;
    }

    @Override // defpackage.akdm
    public final long a(long j, int i) {
        return this.a.e(j, i);
    }

    @Override // defpackage.akdm
    public final long b(long j, long j2) {
        return this.a.x(j, j2);
    }

    @Override // defpackage.akdm
    public final long c() {
        return this.a.b;
    }

    @Override // defpackage.akdm
    public final boolean e() {
        return false;
    }
}
