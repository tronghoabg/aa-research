package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class agog<T> extends defpackage.agop {
    private agog() {
        super(null);
    }

    public abstract T getValue();

    @Override // defpackage.agop
    public final java.lang.String toString() {
        java.lang.String string;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('(');
        if (this instanceof defpackage.agok) {
            string = "\"" + ((java.lang.Object) ((defpackage.agok) this).getValue()) + '\"';
        } else {
            string = getValue().toString();
        }
        sb.append(string);
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ agog(defpackage.affu affuVar) {
        this();
    }
}
