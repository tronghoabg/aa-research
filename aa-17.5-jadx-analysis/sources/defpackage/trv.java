package defpackage;

import java.util.function.Consumer;

/* loaded from: classes3.dex */
public final class trv {
    public final abhj a;
    public final trt b;
    public final trn c;
    public final Consumer d;
    private final toi e;
    private final uqh f;

    public trv(abhj abhjVar, trt trtVar, trn trnVar, uqh uqhVar, toi toiVar, Consumer consumer) {
        abhjVar.getClass();
        this.a = abhjVar;
        this.b = trtVar;
        this.c = trnVar;
        this.f = uqhVar;
        this.e = toiVar;
        this.d = consumer;
    }

    public static trv a(abhj abhjVar, toi toiVar, uqh uqhVar, Consumer consumer) {
        abdl abdlVar = abhjVar.c;
        if (abdlVar == null) {
            abdlVar = abdl.a;
        }
        abnh abnhVar = abhg.a;
        abdlVar.j(abnhVar);
        Object objJ = abdlVar.w.j(abnhVar.d);
        abhf abhfVar = (abhf) (objJ == null ? abnhVar.b : abnhVar.c(objJ));
        trn trnVar = (abhfVar.b & 1) != 0 ? new trn(abhfVar.c) : null;
        abdl abdlVar2 = abhjVar.c;
        if (abdlVar2 == null) {
            abdlVar2 = abdl.a;
        }
        abnh abnhVar2 = abhe.a;
        abdlVar2.j(abnhVar2);
        Object objJ2 = abdlVar2.w.j(abnhVar2.d);
        abhd abhdVar = (abhd) (objJ2 == null ? abnhVar2.b : abnhVar2.c(objJ2));
        return new trv(abhjVar, (abhdVar.b & 1) != 0 ? new trt(abhdVar.c) : null, trnVar, uqhVar, toiVar, consumer);
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final int hashCode() {
        return System.identityHashCode(this);
    }

    public final String toString() {
        Consumer consumer = this.d;
        toi toiVar = this.e;
        uqh uqhVar = this.f;
        trn trnVar = this.c;
        trt trtVar = this.b;
        return "{" + this.a.toString() + ", " + String.valueOf(trtVar) + ", " + String.valueOf(trnVar) + ", " + String.valueOf(uqhVar) + ", " + String.valueOf(toiVar) + ", " + String.valueOf(consumer) + "}";
    }

    public trv() {
        throw null;
    }
}
