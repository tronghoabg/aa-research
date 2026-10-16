package defpackage;

import java.util.HashMap;
import java.util.List;

/* loaded from: classes3.dex */
public final class ahdl implements ahfh {
    final /* synthetic */ HashMap $annotationParametersDefaultValues;
    final /* synthetic */ ahfj $kotlinClass;
    final /* synthetic */ HashMap<ahfn, List> $memberAnnotations;
    final /* synthetic */ HashMap $propertyConstants;
    final /* synthetic */ ahdm this$0;

    public ahdl(ahdm ahdmVar, HashMap<ahfn, List> map, ahfj ahfjVar, HashMap map2, HashMap map3) {
        this.this$0 = ahdmVar;
        this.$memberAnnotations = map;
        this.$kotlinClass = ahfjVar;
        this.$annotationParametersDefaultValues = map2;
        this.$propertyConstants = map3;
    }

    @Override // defpackage.ahfh
    public ahfg visitField(ahnj ahnjVar, String str, Object obj) {
        Object objLoadConstant;
        ahnjVar.getClass();
        str.getClass();
        ahfm ahfmVar = ahfn.Companion;
        String strAsString = ahnjVar.asString();
        strAsString.getClass();
        ahfn ahfnVarFromFieldNameAndDesc = ahfmVar.fromFieldNameAndDesc(strAsString, str);
        if (obj != null && (objLoadConstant = this.this$0.loadConstant(str, obj)) != null) {
            this.$propertyConstants.put(ahfnVarFromFieldNameAndDesc, objLoadConstant);
        }
        return new ahdk(this, ahfnVarFromFieldNameAndDesc);
    }

    @Override // defpackage.ahfh
    public ahfi visitMethod(ahnj ahnjVar, String str) {
        ahnjVar.getClass();
        str.getClass();
        ahfm ahfmVar = ahfn.Companion;
        String strAsString = ahnjVar.asString();
        strAsString.getClass();
        return new ahdj(this, ahfmVar.fromMethodNameAndDesc(strAsString, str));
    }
}
