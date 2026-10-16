package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class tip implements defpackage.afer {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ tip(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r5v18, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v42, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v48, types: [afer, java.lang.Object] */
    @Override // defpackage.afer
    public final java.lang.Object invoke() {
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                java.lang.Object obj = this.a;
                ((ajba) ((defpackage.ndd) obj).c).d(java.lang.Boolean.TRUE);
                return defpackage.afbk.a;
            case 1:
                defpackage.tdo tdoVar = (defpackage.tdo) this.a;
                java.util.Set setEntrySet = tdoVar.a.entrySet();
                java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.afga.aj(setEntrySet, 10));
                java.util.Iterator it = setEntrySet.iterator();
                while (it.hasNext()) {
                    arrayList.add(new tdl(tdoVar, (java.util.Map.Entry) it.next()));
                }
                return new tdn(defpackage.afga.be(arrayList), setEntrySet, tdoVar);
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                return new tkg(((tiu) this.a).b);
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                return new androidx.compose.runtime.ParcelableSnapshotMutableState(((re) this.a).a().getResources().getConfiguration(), defpackage.bxv.c);
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return new tjk((androidx.car.app.model.CarText) this.a);
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return new tkf((java.lang.CharSequence) this.a);
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                return java.lang.Boolean.valueOf(((tlx) this.a).c.isCurrentThread());
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                return java.lang.Boolean.valueOf(((tlx) this.a).c.isCurrentThread());
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                return java.lang.Boolean.valueOf(((tlx) this.a).c.isCurrentThread());
            case 9:
                return java.lang.Boolean.valueOf(defpackage.afga.f(java.lang.Thread.currentThread(), ((tmb) this.a).c));
            case 10:
                return defpackage.affz.c((java.lang.Object[]) this.a);
            case 11:
                return this.a.iterator();
            case 12:
                return afgc.javaContainingDeclaration_delegate$lambda$0((afgc) this.a);
            case 13:
                return this.a;
            case 14:
                return ajit.b((defpackage.afer) this.a);
            case 15:
                return this.a;
            default:
                ((ajmc) this.a).g(false, 2, 0);
                return defpackage.afbk.a;
        }
    }
}
