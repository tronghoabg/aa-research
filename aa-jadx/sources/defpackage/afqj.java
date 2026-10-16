package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class afqj extends defpackage.afqn {
    private final java.lang.reflect.Field field;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afqj(java.lang.reflect.Field field) {
        super(null);
        field.getClass();
        this.field = field;
    }

    @Override // defpackage.afqn
    public java.lang.String asString() {
        return defpackage.afwj.getJvmSignature(this.field);
    }

    public final java.lang.reflect.Field getField() {
        return this.field;
    }
}
