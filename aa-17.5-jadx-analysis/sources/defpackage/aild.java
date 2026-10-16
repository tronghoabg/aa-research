package defpackage;

import java.util.Collection;
import java.util.List;

/* loaded from: classes3.dex */
public final class aild extends agio {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aild(agba agbaVar) {
        super(agbaVar, null, agfk.Companion.getEMPTY(), ahnj.special(ailb.ERROR_FUNCTION.getDebugText()), agaw.DECLARATION, agdx.NO_SOURCE);
        agbaVar.getClass();
        afbe afbeVar = afbe.a;
        initialize((agdq) null, (agdq) null, (List<agdq>) afbeVar, (List<? extends agee>) afbeVar, (List<agel>) afbeVar, (aigl) ailm.createErrorType(aill.RETURN_TYPE_FOR_FUNCTION, new String[0]), agcq.OPEN, agcb.PUBLIC);
    }

    @Override // defpackage.agio, defpackage.aghm, defpackage.agax
    public agdv copy(agbi agbiVar, agcq agcqVar, agcc agccVar, agaw agawVar, boolean z) {
        agbiVar.getClass();
        agcqVar.getClass();
        agccVar.getClass();
        agawVar.getClass();
        return this;
    }

    @Override // defpackage.agio, defpackage.aghm
    protected aghm createSubstitutedCopy(agbi agbiVar, agcj agcjVar, agaw agawVar, ahnj ahnjVar, agfk agfkVar, agdx agdxVar) {
        agbiVar.getClass();
        agawVar.getClass();
        agfkVar.getClass();
        agdxVar.getClass();
        return this;
    }

    @Override // defpackage.aghm, defpackage.agav
    public <V> V getUserData(agau<V> agauVar) {
        agauVar.getClass();
        return null;
    }

    @Override // defpackage.aghm, defpackage.agcj
    public boolean isSuspend() {
        return false;
    }

    @Override // defpackage.agio, defpackage.aghm, defpackage.agcj
    public agci<agdv> newCopyBuilder() {
        return new ailc(this);
    }

    @Override // defpackage.aghm, defpackage.agax
    public void setOverriddenDescriptors(Collection<? extends agax> collection) {
        collection.getClass();
    }

    @Override // defpackage.agio, defpackage.aghm, defpackage.agax
    public /* bridge */ /* synthetic */ agcj copy(agbi agbiVar, agcq agcqVar, agcc agccVar, agaw agawVar, boolean z) {
        copy(agbiVar, agcqVar, agccVar, agawVar, z);
        return this;
    }

    @Override // defpackage.agio, defpackage.aghm, defpackage.agax
    public /* bridge */ /* synthetic */ agax copy(agbi agbiVar, agcq agcqVar, agcc agccVar, agaw agawVar, boolean z) {
        copy(agbiVar, agcqVar, agccVar, agawVar, z);
        return this;
    }
}
