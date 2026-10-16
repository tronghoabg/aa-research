package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public interface agen extends defpackage.agbx, defpackage.agfn {
    java.util.List<defpackage.agem> getAccessors();

    defpackage.agde getBackingField();

    defpackage.agde getDelegateField();

    defpackage.ageo getGetter();

    @Override // defpackage.agbx, defpackage.agbv, defpackage.agci
    defpackage.agen getOriginal();

    @Override // defpackage.agbx, defpackage.agbv
    java.util.Collection<? extends defpackage.agen> getOverriddenDescriptors();

    defpackage.agep getSetter();

    @Override // defpackage.agfa
    defpackage.agen substitute(defpackage.aijy aijyVar);
}
