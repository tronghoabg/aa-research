package defpackage;

import j$.util.Spliterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes3.dex */
final class aexg extends aerh {
    private static final long serialVersionUID = -3185226345314976296L;
    final /* synthetic */ aexh d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected aexg(aexh aexhVar, int i, int i2) {
        super(aexhVar, i, i2);
        this.d = aexhVar;
    }

    @Override // defpackage.aerk, defpackage.aerl, defpackage.aerf, defpackage.aexk
    public final aeus b() {
        return new aexf(this);
    }

    @Override // defpackage.aerk, defpackage.aerl, defpackage.aexm
    /* renamed from: d */
    public final aeui listIterator(int i) {
        return new aexe(this, i, 0);
    }

    @Override // defpackage.aerl, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof List)) {
            return false;
        }
        if (obj instanceof aexh) {
            aexh aexhVar = (aexh) obj;
            return n(aexhVar.a, 0, aexhVar.b);
        }
        if (!(obj instanceof aexg)) {
            return super.equals(obj);
        }
        aexg aexgVar = (aexg) obj;
        aexh aexhVar2 = aexgVar.d;
        return n(aexhVar2.a, aexgVar.b, aexgVar.c);
    }

    @Override // defpackage.aerk, java.util.List
    public final Object get(int i) {
        j(i);
        return this.d.a[i + this.b];
    }

    @Override // defpackage.aerk, defpackage.aerl, java.util.List
    public final /* synthetic */ ListIterator listIterator(int i) {
        return new aexe(this, i, 0);
    }

    final boolean n(Object[] objArr, int i, int i2) {
        aexh aexhVar = this.d;
        if (aexhVar.a == objArr && this.b == i && this.c == i2) {
            return true;
        }
        if (i2 - i != size()) {
            return false;
        }
        int i3 = this.b;
        while (i3 < this.c) {
            int i4 = i3 + 1;
            int i5 = i + 1;
            if (aexhVar.a[i3] != objArr[i]) {
                return false;
            }
            i3 = i4;
            i = i5;
        }
        return true;
    }

    @Override // defpackage.aerk, defpackage.aerl, defpackage.aerf, java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final /* synthetic */ Spliterator spliterator() {
        return new aexf(this);
    }
}
