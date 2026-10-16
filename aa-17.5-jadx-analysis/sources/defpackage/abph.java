package defpackage;

import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
final class abph extends abmm {
    final abpi a;
    abmo b = b();
    final /* synthetic */ abpk c;

    public abph(abpk abpkVar) {
        this.c = abpkVar;
        this.a = new abpi(abpkVar);
    }

    private final abmo b() {
        abpi abpiVar = this.a;
        if (abpiVar.hasNext()) {
            return abpiVar.next().iterator();
        }
        return null;
    }

    @Override // defpackage.abmo
    public final byte a() {
        abmo abmoVar = this.b;
        if (abmoVar == null) {
            throw new NoSuchElementException();
        }
        byte bA = abmoVar.a();
        if (!this.b.hasNext()) {
            this.b = b();
        }
        return bA;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b != null;
    }
}
