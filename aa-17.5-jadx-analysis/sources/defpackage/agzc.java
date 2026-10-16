package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class agzc extends aiga {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public agzc(aigw aigwVar, aigw aigwVar2) {
        this(aigwVar, aigwVar2, false);
        aigwVar.getClass();
        aigwVar2.getClass();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence render$lambda$1(String str) {
        str.getClass();
        return "(raw) ".concat(str);
    }

    private static final boolean render$onlyOutDiffers(String str, String str2) {
        return affa.f(str, afyh.m(str2, "out ")) || affa.f(str2, "*");
    }

    private static final List<String> render$renderArguments(ahre ahreVar, aigl aiglVar) {
        List<aiin> arguments = aiglVar.getArguments();
        ArrayList arrayList = new ArrayList(woy.bp(arguments, 10));
        Iterator<T> it = arguments.iterator();
        while (it.hasNext()) {
            arrayList.add(ahreVar.renderTypeProjection((aiin) it.next()));
        }
        return arrayList;
    }

    private static final String render$replaceArgs(String str, String str2) {
        if (!afyh.A(str, '<')) {
            return str;
        }
        return afyh.q(str, '<', str) + '<' + str2 + '>' + afyh.p(str, '>', str);
    }

    @Override // defpackage.aiga
    public aigw getDelegate() {
        return getLowerBound();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.aiga, defpackage.aigl
    public ahxe getMemberScope() {
        agbd declarationDescriptor = getConstructor().getDeclarationDescriptor();
        aiim aiimVar = null;
        Object[] objArr = 0;
        agba agbaVar = declarationDescriptor instanceof agba ? (agba) declarationDescriptor : null;
        if (agbaVar != null) {
            ahxe memberScope = agbaVar.getMemberScope(new agza(aiimVar, 1, objArr == true ? 1 : 0));
            memberScope.getClass();
            return memberScope;
        }
        agbd declarationDescriptor2 = getConstructor().getDeclarationDescriptor();
        Objects.toString(declarationDescriptor2);
        throw new IllegalStateException("Incorrect classifier: ".concat(String.valueOf(declarationDescriptor2)));
    }

    @Override // defpackage.aijf
    public agzc makeNullableAsSpecified(boolean z) {
        return new agzc(getLowerBound().makeNullableAsSpecified(z), getUpperBound().makeNullableAsSpecified(z));
    }

    @Override // defpackage.aijf, defpackage.aigl
    public aiga refine(aiju aijuVar) {
        aijuVar.getClass();
        aigl aiglVarRefineType = aijuVar.refineType((ailw) getLowerBound());
        aiglVarRefineType.getClass();
        aigl aiglVarRefineType2 = aijuVar.refineType((ailw) getUpperBound());
        aiglVarRefineType2.getClass();
        return new agzc((aigw) aiglVarRefineType, (aigw) aiglVarRefineType2, true);
    }

    @Override // defpackage.aiga
    public String render(ahre ahreVar, ahrt ahrtVar) throws IOException {
        ahreVar.getClass();
        ahrtVar.getClass();
        String strRenderType = ahreVar.renderType(getLowerBound());
        String strRenderType2 = ahreVar.renderType(getUpperBound());
        if (ahrtVar.getDebugMode()) {
            return "raw (" + strRenderType + ".." + strRenderType2 + ')';
        }
        if (getUpperBound().getArguments().isEmpty()) {
            return ahreVar.renderFlexibleType(strRenderType, strRenderType2, aimr.getBuiltIns(this));
        }
        List<String> listRender$renderArguments = render$renderArguments(ahreVar, getLowerBound());
        List<String> listRender$renderArguments2 = render$renderArguments(ahreVar, getUpperBound());
        String strCu = woy.cu(listRender$renderArguments, ", ", null, null, agzb.INSTANCE, 30);
        List<aezu> listCi = woy.ci(listRender$renderArguments, listRender$renderArguments2);
        if (listCi.isEmpty()) {
            strRenderType2 = render$replaceArgs(strRenderType2, strCu);
        } else {
            for (aezu aezuVar : listCi) {
                if (!render$onlyOutDiffers((String) aezuVar.a, (String) aezuVar.b)) {
                    break;
                }
            }
            strRenderType2 = render$replaceArgs(strRenderType2, strCu);
        }
        String strRender$replaceArgs = render$replaceArgs(strRenderType, strCu);
        return affa.f(strRender$replaceArgs, strRenderType2) ? strRender$replaceArgs : ahreVar.renderFlexibleType(strRender$replaceArgs, strRenderType2, aimr.getBuiltIns(this));
    }

    @Override // defpackage.aijf
    public agzc replaceAttributes(aihr aihrVar) {
        aihrVar.getClass();
        return new agzc(getLowerBound().replaceAttributes(aihrVar), getUpperBound().replaceAttributes(aihrVar));
    }

    private agzc(aigw aigwVar, aigw aigwVar2, boolean z) {
        super(aigwVar, aigwVar2);
        if (z) {
            return;
        }
        aijp.DEFAULT.isSubtypeOf(aigwVar, aigwVar2);
    }
}
