package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class afbu extends afbw implements Iterator, afgc {
    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        a();
        afby afbyVar = this.a;
        int i = this.b;
        if (i >= afbyVar.e) {
            throw new NoSuchElementException();
        }
        this.b = i + 1;
        this.c = i;
        afbv afbvVar = new afbv(afbyVar, i);
        b();
        return afbvVar;
    }
}
