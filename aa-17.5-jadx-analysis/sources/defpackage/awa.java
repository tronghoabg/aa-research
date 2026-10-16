package defpackage;

/* loaded from: classes.dex */
public final class awa extends awb {
    public crw a;

    public awa(crw crwVar) {
        this.a = crwVar;
    }

    @Override // defpackage.cyq
    public final Object ek(Object obj) {
        avu avuVar = obj instanceof avu ? (avu) obj : null;
        if (avuVar == null) {
            avuVar = new avu(null);
        }
        avuVar.c = new atw(new asp(this.a));
        return avuVar;
    }
}
