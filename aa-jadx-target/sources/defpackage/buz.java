package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class buz extends defpackage.afed implements defpackage.affg {
    int a;
    int b;
    int c;
    int d;
    final /* synthetic */ defpackage.bva e;
    private /* synthetic */ java.lang.Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public buz(defpackage.bva bvaVar, defpackage.afdk afdkVar) {
        super(afdkVar);
        this.e = bvaVar;
    }

    @Override // defpackage.afdy
    public final defpackage.afdk b(java.lang.Object obj, defpackage.afdk afdkVar) {
        defpackage.buz buzVar = new defpackage.buz(this.e, afdkVar);
        buzVar.f = obj;
        return buzVar;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0157 A[LOOP:0: B:6:0x001f->B:24:0x0157, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x015a A[SYNTHETIC] */
    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) throws java.lang.Throwable {
        aisr aisrVar;
        int i;
        int i2;
        int i3;
        java.lang.String strConcat;
        int i4;
        int i5;
        java.lang.String str;
        defpackage.afdr afdrVar = defpackage.afdr.a;
        if (this.d != 0) {
            i = this.c;
            i2 = this.b;
            i3 = this.a;
            aisrVar = (aisr) this.f;
            defpackage.afga.cz(obj);
        } else {
            defpackage.afga.cz(obj);
            aisrVar = (aisr) this.f;
            i = 0;
            i2 = 0;
            i3 = 0;
        }
        while (true) {
            defpackage.bva bvaVar = this.e;
            int i6 = bvaVar.d;
            defpackage.zm zmVar = bvaVar.c;
            if (i3 >= java.lang.Math.min(i6 + 10, zmVar.b)) {
                return defpackage.afbk.a;
            }
            int i7 = i3 + 1;
            int iA = zmVar.a(i3);
            switch (iA) {
                case defpackage.abnt.b /* 0 */:
                    strConcat = "up";
                    str = i3 + ": " + strConcat;
                    this.f = aisrVar;
                    this.a = i7;
                    this.b = i2;
                    this.c = i;
                    this.d = 1;
                    if (aisrVar.a(str, this) != afdrVar) {
                        return afdrVar;
                    }
                    i3 = i7;
                    break;
                    break;
                case 1:
                    java.lang.Object objC = bvaVar.a.c(i2);
                    java.util.Objects.toString(objC);
                    strConcat = "down ".concat(java.lang.String.valueOf(objC));
                    i2++;
                    str = i3 + ": " + strConcat;
                    this.f = aisrVar;
                    this.a = i7;
                    this.b = i2;
                    this.c = i;
                    this.d = 1;
                    if (aisrVar.a(str, this) != afdrVar) {
                        return afdrVar;
                    }
                    i3 = i7;
                    break;
                    break;
                case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                    strConcat = "remove " + zmVar.a(i7) + " " + zmVar.a(i3 + 2);
                    i7 = i3 + 3;
                    str = i3 + ": " + strConcat;
                    this.f = aisrVar;
                    this.a = i7;
                    this.b = i2;
                    this.c = i;
                    this.d = 1;
                    if (aisrVar.a(str, this) != afdrVar) {
                        return afdrVar;
                    }
                    i3 = i7;
                    break;
                    break;
                case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                    strConcat = "move " + zmVar.a(i7) + " " + zmVar.a(i3 + 2) + " " + zmVar.a(i3 + 3);
                    i7 = i3 + 4;
                    str = i3 + ": " + strConcat;
                    this.f = aisrVar;
                    this.a = i7;
                    this.b = i2;
                    this.c = i;
                    this.d = 1;
                    if (aisrVar.a(str, this) != afdrVar) {
                        return afdrVar;
                    }
                    i3 = i7;
                    break;
                    break;
                case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                    strConcat = "clear";
                    str = i3 + ": " + strConcat;
                    this.f = aisrVar;
                    this.a = i7;
                    this.b = i2;
                    this.c = i;
                    this.d = 1;
                    if (aisrVar.a(str, this) != afdrVar) {
                        return afdrVar;
                    }
                    i3 = i7;
                    break;
                    break;
                case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                    i4 = i3 + 2;
                    i5 = i2 + 1;
                    strConcat = "insertBottomUp " + zmVar.a(i7) + " " + bvaVar.a.c(i2);
                    break;
                case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                    i4 = i3 + 2;
                    i5 = i2 + 1;
                    strConcat = "insertTopDown " + zmVar.a(i7) + " " + bvaVar.a.c(i2);
                    break;
                case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                    java.lang.Object objC2 = bvaVar.a.c(i2);
                    objC2.getClass();
                    defpackage.afgz.g(objC2, 2);
                    i2 += 2;
                    defpackage.affg affgVar = (defpackage.affg) objC2;
                    java.util.Objects.toString(affgVar);
                    strConcat = "apply ".concat(affgVar.toString());
                    str = i3 + ": " + strConcat;
                    this.f = aisrVar;
                    this.a = i7;
                    this.b = i2;
                    this.c = i;
                    this.d = 1;
                    if (aisrVar.a(str, this) != afdrVar) {
                        return afdrVar;
                    }
                    i3 = i7;
                    break;
                    break;
                case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                    java.lang.Object objC3 = bvaVar.b.c(i);
                    java.util.Objects.toString(objC3);
                    strConcat = "reuse ".concat(java.lang.String.valueOf(objC3));
                    i++;
                    str = i3 + ": " + strConcat;
                    this.f = aisrVar;
                    this.a = i7;
                    this.b = i2;
                    this.c = i;
                    this.d = 1;
                    if (aisrVar.a(str, this) != afdrVar) {
                        return afdrVar;
                    }
                    i3 = i7;
                    break;
                    break;
                case 9:
                    strConcat = "recompose pending";
                    str = i3 + ": " + strConcat;
                    this.f = aisrVar;
                    this.a = i7;
                    this.b = i2;
                    this.c = i;
                    this.d = 1;
                    if (aisrVar.a(str, this) != afdrVar) {
                        return afdrVar;
                    }
                    i3 = i7;
                    break;
                    break;
                default:
                    strConcat = defpackage.a.bo(iA, "unknown op: ");
                    str = i3 + ": " + strConcat;
                    this.f = aisrVar;
                    this.a = i7;
                    this.b = i2;
                    this.c = i;
                    this.d = 1;
                    if (aisrVar.a(str, this) != afdrVar) {
                        return afdrVar;
                    }
                    i3 = i7;
                    break;
                    break;
            }
            i7 = i4;
            i2 = i5;
            str = i3 + ": " + strConcat;
            this.f = aisrVar;
            this.a = i7;
            this.b = i2;
            this.c = i;
            this.d = 1;
            if (aisrVar.a(str, this) != afdrVar) {
                return afdrVar;
            }
            i3 = i7;
        }
    }

    @Override // defpackage.affg
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.buz) b((aisr) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
    }
}
