package defpackage;

import java.lang.reflect.Type;
import java.util.Objects;

/* loaded from: classes3.dex */
public abstract class aflv<V> extends afln<V, afak> implements afhi<V> {
    static final /* synthetic */ afia<Object>[] $$delegatedProperties = {new affn(aflv.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertySetterDescriptor;", 0)};
    private final afup descriptor$delegate = afus.lazySoft(new afls(this));
    private final aezr caller$delegate = woy.dH(2, new aflt(this));

    /* JADX INFO: Access modifiers changed from: private */
    public static final afwf caller_delegate$lambda$0(aflv aflvVar) {
        return afmj.computeCallerForAccessor(aflvVar, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Type computeReturnType$lambda$0() {
        Class cls = Void.TYPE;
        cls.getClass();
        return cls;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final agdp descriptor_delegate$lambda$0(aflv aflvVar) {
        agdp setter = aflvVar.getProperty().getDescriptor().getSetter();
        return setter == null ? ahss.createDefaultSetter(aflvVar.getProperty().getDescriptor(), agfk.Companion.getEMPTY(), agfk.Companion.getEMPTY()) : setter;
    }

    @Override // defpackage.afko
    protected aiqp computeReturnType() {
        aigw unitType = ahvz.getBuiltIns(getDescriptor()).getUnitType();
        unitType.getClass();
        return new aiqp(unitType, aflu.INSTANCE);
    }

    public boolean equals(Object obj) {
        return (obj instanceof aflv) && affa.f(getProperty(), ((aflv) obj).getProperty());
    }

    @Override // defpackage.afue
    public afwf<?> getCaller() {
        return (afwf) this.caller$delegate.a();
    }

    @Override // defpackage.afln, defpackage.afko
    public agdp getDescriptor() {
        T value = this.descriptor$delegate.getValue(this, $$delegatedProperties[0]);
        value.getClass();
        return (agdp) value;
    }

    @Override // defpackage.afhd
    public String getName() {
        return "<set-" + getProperty().getName() + '>';
    }

    public int hashCode() {
        return getProperty().hashCode();
    }

    @Override // defpackage.afue
    public final afko<afak> shallowCopy(afrj afrjVar, afpq afpqVar) {
        afrjVar.getClass();
        afpqVar.getClass();
        throw new IllegalStateException("Property accessors can only be copied by copying the corresponding property");
    }

    public String toString() {
        afmi property = getProperty();
        Objects.toString(property);
        return "setter of ".concat(String.valueOf(property));
    }
}
