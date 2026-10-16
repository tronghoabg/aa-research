package defpackage;

/* loaded from: classes3.dex */
public final class agku extends agkf implements agzg {
    private final Class<?> klass;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agku(ahnj ahnjVar, Class<?> cls) {
        super(ahnjVar, null);
        cls.getClass();
        this.klass = cls;
    }

    public agzw getReferencedType() {
        return agli.Factory.create(this.klass);
    }
}
