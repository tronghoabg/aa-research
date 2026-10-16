package defpackage;

import java.util.Collection;
import java.util.List;

/* loaded from: classes3.dex */
public final class ahxl extends ahxf {
    static final /* synthetic */ afia<Object>[] $$delegatedProperties = {new affn(ahxl.class, "functions", "getFunctions()Ljava/util/List;", 0), new affn(ahxl.class, "properties", "getProperties()Ljava/util/List;", 0)};
    private final agba containingClass;
    private final boolean enumEntriesCanBeUsed;
    private final aiec functions$delegate;
    private final aiec properties$delegate;

    public ahxl(aiei aieiVar, agba agbaVar, boolean z) {
        aieiVar.getClass();
        agbaVar.getClass();
        this.containingClass = agbaVar;
        this.enumEntriesCanBeUsed = z;
        agbaVar.getKind();
        agbb agbbVar = agbb.CLASS;
        this.functions$delegate = aieiVar.createLazyValue(new ahxj(this));
        this.properties$delegate = aieiVar.createLazyValue(new ahxk(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List functions_delegate$lambda$0(ahxl ahxlVar) {
        return woy.bi(ahss.createEnumValueOfMethod(ahxlVar.containingClass), ahss.createEnumValuesMethod(ahxlVar.containingClass));
    }

    private final List<agdv> getFunctions() {
        return (List) aieh.getValue(this.functions$delegate, this, $$delegatedProperties[0]);
    }

    private final List<agdn> getProperties() {
        return (List) aieh.getValue(this.properties$delegate, this, $$delegatedProperties[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List properties_delegate$lambda$0(ahxl ahxlVar) {
        return ahxlVar.enumEntriesCanBeUsed ? woy.bj(ahss.createEnumEntriesProperty(ahxlVar.containingClass)) : afbe.a;
    }

    /* renamed from: getContributedClassifier, reason: collision with other method in class */
    public Void m91getContributedClassifier(ahnj ahnjVar, aglo agloVar) {
        ahnjVar.getClass();
        agloVar.getClass();
        return null;
    }

    @Override // defpackage.ahxf, defpackage.ahxi
    public List<agax> getContributedDescriptors(ahwt ahwtVar, afec<? super ahnj, Boolean> afecVar) {
        ahwtVar.getClass();
        afecVar.getClass();
        return woy.bY(getFunctions(), getProperties());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ahxf, defpackage.ahxe, defpackage.ahxi
    public aipr<agdv> getContributedFunctions(ahnj ahnjVar, aglo agloVar) {
        ahnjVar.getClass();
        agloVar.getClass();
        List<agdv> functions = getFunctions();
        aipr<agdv> aiprVar = new aipr<>();
        for (Object obj : functions) {
            if (affa.f(((agdv) obj).getName(), ahnjVar)) {
                aiprVar.add(obj);
            }
        }
        return aiprVar;
    }

    @Override // defpackage.ahxf, defpackage.ahxe
    public Collection<agdn> getContributedVariables(ahnj ahnjVar, aglo agloVar) {
        ahnjVar.getClass();
        agloVar.getClass();
        List<agdn> properties = getProperties();
        aipr aiprVar = new aipr();
        for (Object obj : properties) {
            if (affa.f(((agdn) obj).getName(), ahnjVar)) {
                aiprVar.add(obj);
            }
        }
        return aiprVar;
    }

    @Override // defpackage.ahxf, defpackage.ahxi
    public /* bridge */ /* synthetic */ agbd getContributedClassifier(ahnj ahnjVar, aglo agloVar) {
        m91getContributedClassifier(ahnjVar, agloVar);
        return null;
    }

    @Override // defpackage.ahxf, defpackage.ahxi
    public /* bridge */ /* synthetic */ Collection getContributedDescriptors(ahwt ahwtVar, afec afecVar) {
        return getContributedDescriptors(ahwtVar, (afec<? super ahnj, Boolean>) afecVar);
    }
}
