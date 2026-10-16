package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bls extends com.google.v.dm<blt, bls> implements com.google.v.fj {
    /* synthetic */ bls(byte[] bArr) {
        super(blt.DEFAULT_INSTANCE);
    }

    public final void a(Iterable iterable) {
        copyOnWrite();
        ((blt) this.instance).addAllLabelsLocations(iterable);
    }

    public final void b(iu iuVar) {
        copyOnWrite();
        ((blt) this.instance).setDestinationIconLocation(iuVar);
    }

    public final void c(iu iuVar) {
        copyOnWrite();
        ((blt) this.instance).setOriginIconLocation(iuVar);
    }

    public final void d(iu iuVar) {
        copyOnWrite();
        ((blt) this.instance).setParkingIconLocation(iuVar);
    }

    private bls() {
        throw null;
    }
}
