package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class akfd extends defpackage.akex {
    private final defpackage.akdm a;
    final long b;

    public akfd(defpackage.akdh akdhVar, long j) {
        super(akdhVar);
        this.b = j;
        this.a = new defpackage.akfc(this, ((defpackage.akdg) akdhVar).a);
    }

    @Override // defpackage.akex, defpackage.akdf
    public final defpackage.akdm q() {
        return this.a;
    }

    public abstract long x(long j, long j2);
}
