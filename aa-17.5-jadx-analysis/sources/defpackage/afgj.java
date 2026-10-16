package defpackage;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class afgj<T> implements afgm<Object, T> {
    private Object a;

    @Override // defpackage.afgm, defpackage.afgl
    public final T getValue(Object obj, afia<?> afiaVar) {
        afiaVar.getClass();
        T t = (T) this.a;
        if (t != null) {
            return t;
        }
        throw new IllegalStateException("Property " + afiaVar.getName() + " should be initialized before get.");
    }

    @Override // defpackage.afgm
    public final void setValue(Object obj, afia<?> afiaVar, T t) {
        afiaVar.getClass();
        t.getClass();
        this.a = t;
    }

    public final String toString() {
        String strConcat;
        Object obj = this.a;
        if (obj != null) {
            Objects.toString(obj);
            strConcat = "value=".concat(obj.toString());
        } else {
            strConcat = "value not initialized yet";
        }
        return a.bq(strConcat, "NotNullProperty(", ")");
    }
}
