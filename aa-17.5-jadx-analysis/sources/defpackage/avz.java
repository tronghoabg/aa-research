package defpackage;

/* loaded from: classes.dex */
public final class avz extends awb {
    public izj a;

    public avz(izj izjVar) {
        this.a = izjVar;
    }

    @Override // defpackage.cyq
    public final Object ek(Object obj) {
        avu avuVar = obj instanceof avu ? (avu) obj : null;
        if (avuVar == null) {
            avuVar = new avu(null);
        }
        avuVar.c = new atw(new aso(this.a));
        return avuVar;
    }
}
