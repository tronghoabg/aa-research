package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aite implements java.util.Iterator, defpackage.afhc {
    final /* synthetic */ defpackage.aitf a;
    private int b = -1;
    private int c;
    private int d;
    private defpackage.afia e;
    private int f;

    public aite(defpackage.aitf aitfVar) {
        this.a = aitfVar;
        int iG = defpackage.afqt.g(0, 0, aitfVar.a.length());
        this.c = iG;
        this.d = iG;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001a  */
    /* JADX WARN: Code duplicated, block: B:12:0x0022  */
    /* JADX WARN: Code duplicated, block: B:13:0x0034  */
    /* JADX WARN: Code duplicated, block: B:15:0x0042  */
    /* JADX WARN: Code duplicated, block: B:16:0x0052  */
    /* JADX WARN: Code duplicated, block: B:18:0x0071  */
    private final void a() {
        java.lang.CharSequence charSequence;
        java.lang.Object objInvoke;
        int i = this.d;
        if (i < 0) {
            this.b = 0;
            this.e = null;
            return;
        }
        defpackage.aitf aitfVar = this.a;
        int i2 = aitfVar.b;
        if (i2 > 0) {
            int i3 = this.f + 1;
            this.f = i3;
            if (i3 < i2) {
                charSequence = aitfVar.a;
                if (i > charSequence.length()) {
                    this.e = new defpackage.afia(this.c, defpackage.afzh.i(aitfVar.a));
                    this.d = -1;
                } else {
                    objInvoke = aitfVar.c.invoke(charSequence, java.lang.Integer.valueOf(this.d));
                    if (objInvoke == null) {
                        this.e = new defpackage.afia(this.c, defpackage.afzh.i(charSequence));
                        this.d = -1;
                    } else {
                        defpackage.afau afauVar = (defpackage.afau) objInvoke;
                        int iIntValue = ((java.lang.Number) afauVar.a).intValue();
                        int iIntValue2 = ((java.lang.Number) afauVar.b).intValue();
                        this.e = defpackage.afqt.m(this.c, iIntValue);
                        int i4 = iIntValue + iIntValue2;
                        this.c = i4;
                        this.d = i4 + (iIntValue2 == 0 ? 1 : 0);
                    }
                }
            } else {
                this.e = new defpackage.afia(this.c, defpackage.afzh.i(aitfVar.a));
                this.d = -1;
            }
        } else {
            charSequence = aitfVar.a;
            if (i > charSequence.length()) {
                this.e = new defpackage.afia(this.c, defpackage.afzh.i(aitfVar.a));
                this.d = -1;
            } else {
                objInvoke = aitfVar.c.invoke(charSequence, java.lang.Integer.valueOf(this.d));
                if (objInvoke == null) {
                    this.e = new defpackage.afia(this.c, defpackage.afzh.i(charSequence));
                    this.d = -1;
                } else {
                    defpackage.afau afauVar2 = (defpackage.afau) objInvoke;
                    int iIntValue3 = ((java.lang.Number) afauVar2.a).intValue();
                    int iIntValue4 = ((java.lang.Number) afauVar2.b).intValue();
                    this.e = defpackage.afqt.m(this.c, iIntValue3);
                    int i5 = iIntValue3 + iIntValue4;
                    this.c = i5;
                    this.d = i5 + (iIntValue4 == 0 ? 1 : 0);
                }
            }
        }
        this.b = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.b == -1) {
            a();
        }
        return this.b == 1;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ java.lang.Object next() {
        if (this.b == -1) {
            a();
        }
        if (this.b == 0) {
            throw new java.util.NoSuchElementException();
        }
        defpackage.afia afiaVar = this.e;
        afiaVar.getClass();
        this.e = null;
        this.b = -1;
        return afiaVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
