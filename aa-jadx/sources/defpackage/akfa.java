package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public class akfa extends defpackage.akey {
    private static final long serialVersionUID = 8019982251647420015L;
    public final defpackage.akdm a;

    public akfa(defpackage.akdm akdmVar, defpackage.akdo akdoVar) {
        super(akdoVar);
        if (!akdmVar.f()) {
            throw new java.lang.IllegalArgumentException("The field must be supported");
        }
        this.a = akdmVar;
    }

    @Override // defpackage.akdm
    public long a(long j, int i) {
        return this.a.a(j, i);
    }

    @Override // defpackage.akdm
    public long b(long j, long j2) {
        return this.a.b(j, j2);
    }

    @Override // defpackage.akdm
    public long c() {
        return this.a.c();
    }

    @Override // defpackage.akdm
    public final boolean e() {
        return this.a.e();
    }
}
