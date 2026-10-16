package defpackage;

/* loaded from: classes3.dex */
public final class agrj implements agpy {
    public static final agri Companion = new agri(null);
    public static final agpv TYPE = new agpv(affw.b(agrj.class));
    private agql fieldSignature;
    private agqp getterSignature;
    private int jvmFlags;
    private agqp setterSignature;
    private agqp syntheticMethodForAnnotations;
    private agqp syntheticMethodForDelegate;

    public final agql getFieldSignature() {
        return this.fieldSignature;
    }

    public final agqp getGetterSignature() {
        return this.getterSignature;
    }

    public final int getJvmFlags() {
        return this.jvmFlags;
    }

    public final agqp getSetterSignature() {
        return this.setterSignature;
    }

    public final agqp getSyntheticMethodForAnnotations() {
        return this.syntheticMethodForAnnotations;
    }

    public final agqp getSyntheticMethodForDelegate() {
        return this.syntheticMethodForDelegate;
    }

    @Override // defpackage.agpu
    public agpv getType() {
        return TYPE;
    }

    public final void setFieldSignature(agql agqlVar) {
        this.fieldSignature = agqlVar;
    }

    public final void setGetterSignature(agqp agqpVar) {
        this.getterSignature = agqpVar;
    }

    public final void setJvmFlags(int i) {
        this.jvmFlags = i;
    }

    public final void setSetterSignature(agqp agqpVar) {
        this.setterSignature = agqpVar;
    }

    public final void setSyntheticMethodForAnnotations(agqp agqpVar) {
        this.syntheticMethodForAnnotations = agqpVar;
    }

    public final void setSyntheticMethodForDelegate(agqp agqpVar) {
        this.syntheticMethodForDelegate = agqpVar;
    }
}
