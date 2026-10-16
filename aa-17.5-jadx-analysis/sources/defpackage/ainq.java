package defpackage;

import java.util.Iterator;

/* loaded from: classes3.dex */
public final class ainq extends aina {
    public static final ainq INSTANCE = new ainq();

    private ainq() {
        super(null);
    }

    @Override // defpackage.aina
    public /* bridge */ /* synthetic */ Object get(int i) {
        return null;
    }

    @Override // defpackage.aina
    public int getSize() {
        return 0;
    }

    @Override // defpackage.aina, java.lang.Iterable
    public Iterator iterator() {
        return new ainp();
    }

    @Override // defpackage.aina
    public void set(int i, Void r2) {
        r2.getClass();
        throw new IllegalStateException();
    }

    @Override // defpackage.aina
    public Void get(int i) {
        return null;
    }
}
