package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class afqe extends defpackage.afqi {
    private final java.lang.reflect.Constructor<?> constructor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afqe(java.lang.reflect.Constructor<?> constructor) {
        super(null);
        constructor.getClass();
        this.constructor = constructor;
    }

    @Override // defpackage.afqi
    public java.lang.String asString() {
        return defpackage.afwj.getJvmSignature(this.constructor);
    }

    public final java.lang.reflect.Constructor<?> getConstructor() {
        return this.constructor;
    }
}
