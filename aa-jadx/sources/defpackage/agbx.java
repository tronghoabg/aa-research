package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public interface agbx extends defpackage.agbv, defpackage.agdo {
    defpackage.agbx copy(defpackage.agci agciVar, defpackage.agdq agdqVar, defpackage.agdc agdcVar, defpackage.agbw agbwVar, boolean z);

    defpackage.agbw getKind();

    @Override // defpackage.agbv, defpackage.agci
    defpackage.agbx getOriginal();

    @Override // defpackage.agbv
    java.util.Collection<? extends defpackage.agbx> getOverriddenDescriptors();

    void setOverriddenDescriptors(java.util.Collection<? extends defpackage.agbx> collection);
}
