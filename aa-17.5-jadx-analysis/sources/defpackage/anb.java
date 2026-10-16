package defpackage;

/* loaded from: classes.dex */
public final class anb {
    public final afdr a;
    public final aitf b;

    public anb(afdr afdrVar, aitf aitfVar) {
        this.a = afdrVar;
        this.b = aitfVar;
    }

    public final String toString() {
        aitf aitfVar = this.b;
        aitw aitwVar = (aitw) ((aitg) aitfVar).b.get(aitw.b);
        String str = aitwVar != null ? aitwVar.a : null;
        String string = Integer.toString(hashCode(), 16);
        string.getClass();
        return "Request@" + string + (str != null ? a.bq(str, "[", "](") : "(") + "currentBounds()=" + this.a.invoke() + ", continuation=" + aitfVar + ")";
    }
}
