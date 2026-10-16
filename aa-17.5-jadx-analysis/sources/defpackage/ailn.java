package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;

/* loaded from: classes3.dex */
public final class ailn extends ailh {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ailn(aili ailiVar, String... strArr) {
        super(ailiVar, (String[]) Arrays.copyOf(strArr, strArr.length));
        ailiVar.getClass();
        strArr.getClass();
    }

    @Override // defpackage.ailh, defpackage.ahxe
    public Set<ahnj> getClassifierNames() {
        throw new IllegalStateException();
    }

    @Override // defpackage.ailh, defpackage.ahxi
    public agbd getContributedClassifier(ahnj ahnjVar, aglo agloVar) {
        ahnjVar.getClass();
        agloVar.getClass();
        throw new IllegalStateException(getDebugMessage() + ", required name: " + ahnjVar);
    }

    @Override // defpackage.ailh, defpackage.ahxi
    public Collection<agbi> getContributedDescriptors(ahwt ahwtVar, afec<? super ahnj, Boolean> afecVar) {
        ahwtVar.getClass();
        afecVar.getClass();
        throw new IllegalStateException(getDebugMessage());
    }

    @Override // defpackage.ailh, defpackage.ahxe, defpackage.ahxi
    public Set<agdv> getContributedFunctions(ahnj ahnjVar, aglo agloVar) {
        ahnjVar.getClass();
        agloVar.getClass();
        throw new IllegalStateException(getDebugMessage() + ", required name: " + ahnjVar);
    }

    @Override // defpackage.ailh, defpackage.ahxe
    public Set<agdn> getContributedVariables(ahnj ahnjVar, aglo agloVar) {
        ahnjVar.getClass();
        agloVar.getClass();
        throw new IllegalStateException(getDebugMessage() + ", required name: " + ahnjVar);
    }

    @Override // defpackage.ailh, defpackage.ahxe
    public Set<ahnj> getFunctionNames() {
        throw new IllegalStateException();
    }

    @Override // defpackage.ailh, defpackage.ahxe
    public Set<ahnj> getVariableNames() {
        throw new IllegalStateException();
    }

    @Override // defpackage.ailh, defpackage.ahxi
    /* renamed from: recordLookup, reason: merged with bridge method [inline-methods] */
    public Void mo95recordLookup(ahnj ahnjVar, aglo agloVar) {
        ahnjVar.getClass();
        agloVar.getClass();
        throw new IllegalStateException();
    }

    @Override // defpackage.ailh
    public String toString() {
        return "ThrowingScope{" + getDebugMessage() + '}';
    }

    @Override // defpackage.ailh, defpackage.ahxe, defpackage.ahxi
    public /* bridge */ /* synthetic */ Collection getContributedFunctions(ahnj ahnjVar, aglo agloVar) {
        return getContributedFunctions(ahnjVar, agloVar);
    }

    @Override // defpackage.ailh, defpackage.ahxe
    public /* bridge */ /* synthetic */ Collection getContributedVariables(ahnj ahnjVar, aglo agloVar) {
        return getContributedVariables(ahnjVar, agloVar);
    }
}
