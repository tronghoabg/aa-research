package defpackage;

import java.util.Objects;

/* loaded from: classes3.dex */
public abstract class aflr<V> extends afln<V, V> implements afht<V> {
    static final /* synthetic */ afia<Object>[] $$delegatedProperties = {new affn(aflr.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertyGetterDescriptor;", 0)};
    private final afup descriptor$delegate = afus.lazySoft(new aflp(this));
    private final aezr caller$delegate = woy.dH(2, new aflq(this));

    /* JADX INFO: Access modifiers changed from: private */
    public static final afwf caller_delegate$lambda$0(aflr aflrVar) {
        return afmj.computeCallerForAccessor(aflrVar, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final agdo descriptor_delegate$lambda$0(aflr aflrVar) {
        agdo getter = aflrVar.getProperty().getDescriptor().getGetter();
        if (getter != null) {
            return getter;
        }
        agil agilVarCreateDefaultGetter = ahss.createDefaultGetter(aflrVar.getProperty().getDescriptor(), agfk.Companion.getEMPTY());
        agilVarCreateDefaultGetter.initialize(aflrVar.getProperty().getDescriptor().getType());
        return agilVarCreateDefaultGetter;
    }

    @Override // defpackage.afko
    protected aiqp computeReturnType() {
        return (aiqp) getProperty().getReturnType();
    }

    public boolean equals(Object obj) {
        return (obj instanceof aflr) && affa.f(getProperty(), ((aflr) obj).getProperty());
    }

    @Override // defpackage.afue
    public afwf<?> getCaller() {
        return (afwf) this.caller$delegate.a();
    }

    @Override // defpackage.afln, defpackage.afko
    public agdo getDescriptor() {
        T value = this.descriptor$delegate.getValue(this, $$delegatedProperties[0]);
        value.getClass();
        return (agdo) value;
    }

    @Override // defpackage.afhd
    public String getName() {
        return "<get-" + getProperty().getName() + '>';
    }

    public int hashCode() {
        return getProperty().hashCode();
    }

    @Override // defpackage.afue
    public final afko<V> shallowCopy(afrj afrjVar, afpq afpqVar) {
        afrjVar.getClass();
        afpqVar.getClass();
        throw new IllegalStateException("Property accessors can only be copied by copying the corresponding property");
    }

    public String toString() {
        afmi property = getProperty();
        Objects.toString(property);
        return "getter of ".concat(String.valueOf(property));
    }
}
