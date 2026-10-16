package defpackage;

/* loaded from: classes3.dex */
public abstract class agng<T> extends agnp {
    private agng() {
        super(null);
    }

    public abstract T getValue();

    @Override // defpackage.agnp
    public final String toString() {
        String string;
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('(');
        if (this instanceof agnk) {
            string = "\"" + ((Object) ((agnk) this).getValue()) + '\"';
        } else {
            string = getValue().toString();
        }
        sb.append(string);
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ agng(afeu afeuVar) {
        this();
    }
}
