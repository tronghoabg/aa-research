package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;

/* loaded from: classes3.dex */
public class ailh implements ahxe {
    private final String debugMessage;
    private final aili kind;

    public ailh(aili ailiVar, String... strArr) {
        ailiVar.getClass();
        strArr.getClass();
        this.kind = ailiVar;
        String debugMessage = ailiVar.getDebugMessage();
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
        String str = String.format(debugMessage, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        str.getClass();
        this.debugMessage = str;
    }

    @Override // defpackage.ahxe
    public Set<ahnj> getClassifierNames() {
        return afbg.a;
    }

    @Override // defpackage.ahxi
    public agbd getContributedClassifier(ahnj ahnjVar, aglo agloVar) {
        ahnjVar.getClass();
        agloVar.getClass();
        String str = String.format(ailb.ERROR_CLASS.getDebugText(), Arrays.copyOf(new Object[]{ahnjVar}, 1));
        str.getClass();
        return new aila(ahnj.special(str));
    }

    @Override // defpackage.ahxi
    public Collection<agbi> getContributedDescriptors(ahwt ahwtVar, afec<? super ahnj, Boolean> afecVar) {
        ahwtVar.getClass();
        afecVar.getClass();
        return afbe.a;
    }

    @Override // defpackage.ahxe, defpackage.ahxi
    public Set<agdv> getContributedFunctions(ahnj ahnjVar, aglo agloVar) {
        ahnjVar.getClass();
        agloVar.getClass();
        return woy.aO(new aild(ailm.INSTANCE.getErrorClass()));
    }

    @Override // defpackage.ahxe
    public Set<agdn> getContributedVariables(ahnj ahnjVar, aglo agloVar) {
        ahnjVar.getClass();
        agloVar.getClass();
        return ailm.INSTANCE.getErrorPropertyGroup();
    }

    protected final String getDebugMessage() {
        return this.debugMessage;
    }

    @Override // defpackage.ahxe
    public Set<ahnj> getFunctionNames() {
        return afbg.a;
    }

    @Override // defpackage.ahxe
    public Set<ahnj> getVariableNames() {
        return afbg.a;
    }

    @Override // defpackage.ahxi
    /* renamed from: recordLookup */
    public void mo95recordLookup(ahnj ahnjVar, aglo agloVar) {
        ahnjVar.getClass();
        agloVar.getClass();
    }

    public String toString() {
        return "ErrorScope{" + this.debugMessage + '}';
    }
}
