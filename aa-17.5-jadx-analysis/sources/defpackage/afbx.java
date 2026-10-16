package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class afbx<K, V> extends afbw<K, V> implements Iterator<V>, afgc {
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afbx(afby afbyVar, int i, byte[] bArr) {
        super(afbyVar);
        this.d = i;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.d != 0) {
            a();
            int i = this.b;
            afby afbyVar = this.a;
            if (i >= afbyVar.e) {
                throw new NoSuchElementException();
            }
            this.b = i + 1;
            this.c = i;
            Object obj = afbyVar.b[i];
            b();
            return obj;
        }
        a();
        int i2 = this.b;
        afby afbyVar2 = this.a;
        if (i2 >= afbyVar2.e) {
            throw new NoSuchElementException();
        }
        this.b = i2 + 1;
        this.c = i2;
        Object[] objArr = afbyVar2.c;
        objArr.getClass();
        Object obj2 = objArr[i2];
        b();
        return obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afbx(afby afbyVar, int i) {
        super(afbyVar);
        this.d = i;
    }
}
