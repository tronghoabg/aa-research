package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class nic extends defpackage.afee implements defpackage.affg {
    final /* synthetic */ boolean a;
    final /* synthetic */ defpackage.bwx b;
    private final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nic(defpackage.bwx bwxVar, boolean z, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.c = i;
        this.b = bwxVar;
        this.a = z;
    }

    @Override // defpackage.afdy
    public final defpackage.afdk b(java.lang.Object obj, defpackage.afdk afdkVar) {
        return this.c != 0 ? new defpackage.nic(this.b, this.a, afdkVar, 1) : new defpackage.nic(this.a, (defpackage.byj) this.b, afdkVar, 0);
    }

    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) throws java.lang.Throwable {
        if (this.c != 0) {
            defpackage.afga.cz(obj);
            defpackage.bwx bwxVar = this.b;
            if (((defpackage.asn) bwxVar.a()) != null) {
                bwxVar.b(null);
            }
            return defpackage.afbk.a;
        }
        defpackage.afga.cz(obj);
        if (!this.a) {
            defpackage.byj byjVar = (defpackage.byj) this.b;
            byjVar.h(byjVar.e() - 1);
        }
        return defpackage.afbk.a;
    }

    @Override // defpackage.affg
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        if (this.c != 0) {
            return ((defpackage.nic) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
        }
        return ((defpackage.nic) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nic(boolean z, defpackage.byj byjVar, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.c = i;
        this.a = z;
        this.b = byjVar;
    }
}
