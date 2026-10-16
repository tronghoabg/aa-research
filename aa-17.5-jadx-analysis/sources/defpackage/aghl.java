package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import com.google.android.sidekick.shared.remoteapi.RemoteApiConstants;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class aghl implements agci<agcj> {
    private agfk additionalAnnotations;
    protected boolean copyOverrides;
    protected agdq dispatchReceiverParameter;
    protected boolean dropOriginalInContainingParts;
    private boolean isHiddenForResolutionEverywhereBesideSupercalls;
    private boolean isHiddenToOvercomeSignatureClash;
    protected boolean justForTypeSubstitution;
    protected agaw kind;
    protected ahnj name;
    protected List<agdq> newContextReceiverParameters;
    protected agdq newExtensionReceiverParameter;
    private Boolean newHasSynthesizedParameterNames;
    protected agcq newModality;
    protected agbi newOwner;
    protected aigl newReturnType;
    private List<agee> newTypeParameters;
    protected List<agel> newValueParameterDescriptors;
    protected agcc newVisibility;
    protected agcj original;
    protected boolean preserveSourceElement;
    protected boolean signatureChange;
    protected aiit substitution;
    final /* synthetic */ aghm this$0;
    private Map<agau<?>, Object> userDataMap;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str;
        int i2;
        switch (i) {
            case 9:
            case 11:
            case 13:
            case 15:
            case 16:
            case 18:
            case 20:
            case 22:
            case 24:
            case 26:
            case 27:
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
            case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
            case 30:
            case 31:
            case 32:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
            case Maneuver.TYPE_STRAIGHT /* 36 */:
            case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
            case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
            case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
            case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 10:
            case 12:
            case 14:
            case 17:
            case 19:
            case 21:
            case 23:
            case 25:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
            case 37:
            case Maneuver.TYPE_DESTINATION /* 39 */:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 9:
            case 11:
            case 13:
            case 15:
            case 16:
            case 18:
            case 20:
            case 22:
            case 24:
            case 26:
            case 27:
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
            case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
            case 30:
            case 31:
            case 32:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
            case Maneuver.TYPE_STRAIGHT /* 36 */:
            case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
            case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
            case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
            case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                i2 = 2;
                break;
            case 10:
            case 12:
            case 14:
            case 17:
            case 19:
            case 21:
            case 23:
            case 25:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
            case 37:
            case Maneuver.TYPE_DESTINATION /* 39 */:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "newOwner";
                break;
            case 2:
                objArr[0] = "newModality";
                break;
            case 3:
                objArr[0] = "newVisibility";
                break;
            case 4:
            case 14:
                objArr[0] = "kind";
                break;
            case 5:
                objArr[0] = "newValueParameterDescriptors";
                break;
            case 6:
                objArr[0] = "newContextReceiverParameters";
                break;
            case 7:
                objArr[0] = "newReturnType";
                break;
            case 8:
                objArr[0] = "owner";
                break;
            case 9:
            case 11:
            case 13:
            case 15:
            case 16:
            case 18:
            case 20:
            case 22:
            case 24:
            case 26:
            case 27:
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
            case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
            case 30:
            case 31:
            case 32:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
            case Maneuver.TYPE_STRAIGHT /* 36 */:
            case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
            case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
            case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
            case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                break;
            case 10:
                objArr[0] = "modality";
                break;
            case 12:
                objArr[0] = "visibility";
                break;
            case 17:
                objArr[0] = "name";
                break;
            case 19:
            case 21:
                objArr[0] = "parameters";
                break;
            case 23:
                objArr[0] = RemoteApiConstants.BROADCAST_INTENT_TYPE_EXTRA;
                break;
            case 25:
                objArr[0] = "contextReceiverParameters";
                break;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                objArr[0] = "additionalAnnotations";
                break;
            case 37:
            default:
                objArr[0] = "substitution";
                break;
            case Maneuver.TYPE_DESTINATION /* 39 */:
                objArr[0] = "userDataKey";
                break;
        }
        switch (i) {
            case 9:
                objArr[1] = "setOwner";
                break;
            case 10:
            case 12:
            case 14:
            case 17:
            case 19:
            case 21:
            case 23:
            case 25:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
            case 37:
            case Maneuver.TYPE_DESTINATION /* 39 */:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                break;
            case 11:
                objArr[1] = "setModality";
                break;
            case 13:
                objArr[1] = "setVisibility";
                break;
            case 15:
                objArr[1] = "setKind";
                break;
            case 16:
                objArr[1] = "setCopyOverrides";
                break;
            case 18:
                objArr[1] = "setName";
                break;
            case 20:
                objArr[1] = "setValueParameters";
                break;
            case 22:
                objArr[1] = "setTypeParameters";
                break;
            case 24:
                objArr[1] = "setReturnType";
                break;
            case 26:
                objArr[1] = "setContextReceiverParameters";
                break;
            case 27:
                objArr[1] = "setExtensionReceiverParameter";
                break;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                objArr[1] = "setDispatchReceiverParameter";
                break;
            case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                objArr[1] = "setOriginal";
                break;
            case 30:
                objArr[1] = "setSignatureChange";
                break;
            case 31:
                objArr[1] = "setPreserveSourceElement";
                break;
            case 32:
                objArr[1] = "setDropOriginalInContainingParts";
                break;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                objArr[1] = "setHiddenToOvercomeSignatureClash";
                break;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                objArr[1] = "setHiddenForResolutionEverywhereBesideSupercalls";
                break;
            case Maneuver.TYPE_STRAIGHT /* 36 */:
                objArr[1] = "setAdditionalAnnotations";
                break;
            case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                objArr[1] = "setSubstitution";
                break;
            case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                objArr[1] = "putUserData";
                break;
            case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                objArr[1] = "getSubstitution";
                break;
            case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                objArr[1] = "setJustForTypeSubstitution";
                break;
        }
        switch (i) {
            case 8:
                objArr[2] = "setOwner";
                break;
            case 9:
            case 11:
            case 13:
            case 15:
            case 16:
            case 18:
            case 20:
            case 22:
            case 24:
            case 26:
            case 27:
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
            case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
            case 30:
            case 31:
            case 32:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
            case Maneuver.TYPE_STRAIGHT /* 36 */:
            case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
            case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
            case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
            case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                break;
            case 10:
                objArr[2] = "setModality";
                break;
            case 12:
                objArr[2] = "setVisibility";
                break;
            case 14:
                objArr[2] = "setKind";
                break;
            case 17:
                objArr[2] = "setName";
                break;
            case 19:
                objArr[2] = "setValueParameters";
                break;
            case 21:
                objArr[2] = "setTypeParameters";
                break;
            case 23:
                objArr[2] = "setReturnType";
                break;
            case 25:
                objArr[2] = "setContextReceiverParameters";
                break;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                objArr[2] = "setAdditionalAnnotations";
                break;
            case 37:
                objArr[2] = "setSubstitution";
                break;
            case Maneuver.TYPE_DESTINATION /* 39 */:
                objArr[2] = "putUserData";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 9:
            case 11:
            case 13:
            case 15:
            case 16:
            case 18:
            case 20:
            case 22:
            case 24:
            case 26:
            case 27:
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
            case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
            case 30:
            case 31:
            case 32:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
            case Maneuver.TYPE_STRAIGHT /* 36 */:
            case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
            case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
            case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
            case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                throw new IllegalStateException(str2);
            case 10:
            case 12:
            case 14:
            case 17:
            case 19:
            case 21:
            case 23:
            case 25:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
            case 37:
            case Maneuver.TYPE_DESTINATION /* 39 */:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public aghl(aghm aghmVar, aiit aiitVar, agbi agbiVar, agcq agcqVar, agcc agccVar, agaw agawVar, List<agel> list, List<agdq> list2, agdq agdqVar, aigl aiglVar, ahnj ahnjVar) {
        if (aiitVar == null) {
            $$$reportNull$$$0(0);
        }
        if (agbiVar == null) {
            $$$reportNull$$$0(1);
        }
        if (agcqVar == null) {
            $$$reportNull$$$0(2);
        }
        if (agccVar == null) {
            $$$reportNull$$$0(3);
        }
        if (agawVar == null) {
            $$$reportNull$$$0(4);
        }
        if (list == null) {
            $$$reportNull$$$0(5);
        }
        if (list2 == null) {
            $$$reportNull$$$0(6);
        }
        if (aiglVar == null) {
            $$$reportNull$$$0(7);
        }
        this.this$0 = aghmVar;
        this.original = null;
        this.dispatchReceiverParameter = aghmVar.dispatchReceiverParameter;
        this.copyOverrides = true;
        this.signatureChange = false;
        this.preserveSourceElement = false;
        this.dropOriginalInContainingParts = false;
        this.isHiddenToOvercomeSignatureClash = aghmVar.isHiddenToOvercomeSignatureClash();
        this.newTypeParameters = null;
        this.additionalAnnotations = null;
        this.isHiddenForResolutionEverywhereBesideSupercalls = aghmVar.isHiddenForResolutionEverywhereBesideSupercalls();
        this.userDataMap = new LinkedHashMap();
        this.newHasSynthesizedParameterNames = null;
        this.justForTypeSubstitution = false;
        this.substitution = aiitVar;
        this.newOwner = agbiVar;
        this.newModality = agcqVar;
        this.newVisibility = agccVar;
        this.kind = agawVar;
        this.newValueParameterDescriptors = list;
        this.newContextReceiverParameters = list2;
        this.newExtensionReceiverParameter = agdqVar;
        this.newReturnType = aiglVar;
        this.name = ahnjVar;
    }

    @Override // defpackage.agci
    public agcj build() {
        return this.this$0.doSubstitute(this);
    }

    @Override // defpackage.agci
    public <V> agci<agcj> putUserData(agau<V> agauVar, V v) {
        if (agauVar == null) {
            $$$reportNull$$$0(39);
        }
        this.userDataMap.put(agauVar, v);
        return this;
    }

    @Override // defpackage.agci
    public aghl setAdditionalAnnotations(agfk agfkVar) {
        if (agfkVar == null) {
            $$$reportNull$$$0(35);
        }
        this.additionalAnnotations = agfkVar;
        return this;
    }

    @Override // defpackage.agci
    public /* bridge */ /* synthetic */ agci setCopyOverrides(boolean z) {
        setCopyOverrides(z);
        return this;
    }

    @Override // defpackage.agci
    public /* bridge */ /* synthetic */ agci setDispatchReceiverParameter(agdq agdqVar) {
        setDispatchReceiverParameter(agdqVar);
        return this;
    }

    @Override // defpackage.agci
    public aghl setDropOriginalInContainingParts() {
        this.dropOriginalInContainingParts = true;
        return this;
    }

    @Override // defpackage.agci
    public /* bridge */ /* synthetic */ agci setExtensionReceiverParameter(agdq agdqVar) {
        setExtensionReceiverParameter(agdqVar);
        return this;
    }

    public aghl setHasSynthesizedParameterNames(boolean z) {
        this.newHasSynthesizedParameterNames = Boolean.valueOf(z);
        return this;
    }

    @Override // defpackage.agci
    public aghl setHiddenForResolutionEverywhereBesideSupercalls() {
        this.isHiddenForResolutionEverywhereBesideSupercalls = true;
        return this;
    }

    @Override // defpackage.agci
    public aghl setHiddenToOvercomeSignatureClash() {
        this.isHiddenToOvercomeSignatureClash = true;
        return this;
    }

    public aghl setJustForTypeSubstitution(boolean z) {
        this.justForTypeSubstitution = z;
        return this;
    }

    @Override // defpackage.agci
    public aghl setKind(agaw agawVar) {
        if (agawVar == null) {
            $$$reportNull$$$0(14);
        }
        this.kind = agawVar;
        return this;
    }

    @Override // defpackage.agci
    public aghl setModality(agcq agcqVar) {
        if (agcqVar == null) {
            $$$reportNull$$$0(10);
        }
        this.newModality = agcqVar;
        return this;
    }

    @Override // defpackage.agci
    public aghl setName(ahnj ahnjVar) {
        if (ahnjVar == null) {
            $$$reportNull$$$0(17);
        }
        this.name = ahnjVar;
        return this;
    }

    @Override // defpackage.agci
    public aghl setOriginal(agax agaxVar) {
        this.original = (agcj) agaxVar;
        return this;
    }

    @Override // defpackage.agci
    public aghl setOwner(agbi agbiVar) {
        if (agbiVar == null) {
            $$$reportNull$$$0(8);
        }
        this.newOwner = agbiVar;
        return this;
    }

    @Override // defpackage.agci
    public aghl setPreserveSourceElement() {
        this.preserveSourceElement = true;
        return this;
    }

    @Override // defpackage.agci
    public aghl setReturnType(aigl aiglVar) {
        if (aiglVar == null) {
            $$$reportNull$$$0(23);
        }
        this.newReturnType = aiglVar;
        return this;
    }

    @Override // defpackage.agci
    public aghl setSignatureChange() {
        this.signatureChange = true;
        return this;
    }

    @Override // defpackage.agci
    public aghl setSubstitution(aiit aiitVar) {
        if (aiitVar == null) {
            $$$reportNull$$$0(37);
        }
        this.substitution = aiitVar;
        return this;
    }

    @Override // defpackage.agci
    public aghl setTypeParameters(List<agee> list) {
        if (list == null) {
            $$$reportNull$$$0(21);
        }
        this.newTypeParameters = list;
        return this;
    }

    @Override // defpackage.agci
    public aghl setValueParameters(List<agel> list) {
        if (list == null) {
            $$$reportNull$$$0(19);
        }
        this.newValueParameterDescriptors = list;
        return this;
    }

    @Override // defpackage.agci
    public aghl setVisibility(agcc agccVar) {
        if (agccVar == null) {
            $$$reportNull$$$0(12);
        }
        this.newVisibility = agccVar;
        return this;
    }

    @Override // defpackage.agci
    public aghl setCopyOverrides(boolean z) {
        this.copyOverrides = z;
        return this;
    }

    @Override // defpackage.agci
    public aghl setDispatchReceiverParameter(agdq agdqVar) {
        this.dispatchReceiverParameter = agdqVar;
        return this;
    }

    @Override // defpackage.agci
    public /* bridge */ /* synthetic */ agci setDropOriginalInContainingParts() {
        setDropOriginalInContainingParts();
        return this;
    }

    @Override // defpackage.agci
    public aghl setExtensionReceiverParameter(agdq agdqVar) {
        this.newExtensionReceiverParameter = agdqVar;
        return this;
    }

    @Override // defpackage.agci
    public /* bridge */ /* synthetic */ agci setHiddenForResolutionEverywhereBesideSupercalls() {
        setHiddenForResolutionEverywhereBesideSupercalls();
        return this;
    }

    @Override // defpackage.agci
    public /* bridge */ /* synthetic */ agci setHiddenToOvercomeSignatureClash() {
        setHiddenToOvercomeSignatureClash();
        return this;
    }

    @Override // defpackage.agci
    public /* bridge */ /* synthetic */ agci setPreserveSourceElement() {
        setPreserveSourceElement();
        return this;
    }

    @Override // defpackage.agci
    public /* bridge */ /* synthetic */ agci setSignatureChange() {
        setSignatureChange();
        return this;
    }

    @Override // defpackage.agci
    public /* bridge */ /* synthetic */ agci setOriginal(agax agaxVar) {
        setOriginal(agaxVar);
        return this;
    }

    @Override // defpackage.agci
    public /* bridge */ /* synthetic */ agci setAdditionalAnnotations(agfk agfkVar) {
        setAdditionalAnnotations(agfkVar);
        return this;
    }

    @Override // defpackage.agci
    public /* bridge */ /* synthetic */ agci setKind(agaw agawVar) {
        setKind(agawVar);
        return this;
    }

    @Override // defpackage.agci
    public /* bridge */ /* synthetic */ agci setModality(agcq agcqVar) {
        setModality(agcqVar);
        return this;
    }

    @Override // defpackage.agci
    public /* bridge */ /* synthetic */ agci setName(ahnj ahnjVar) {
        setName(ahnjVar);
        return this;
    }

    @Override // defpackage.agci
    public /* bridge */ /* synthetic */ agci setOwner(agbi agbiVar) {
        setOwner(agbiVar);
        return this;
    }

    @Override // defpackage.agci
    public /* bridge */ /* synthetic */ agci setReturnType(aigl aiglVar) {
        setReturnType(aiglVar);
        return this;
    }

    @Override // defpackage.agci
    public /* bridge */ /* synthetic */ agci setSubstitution(aiit aiitVar) {
        setSubstitution(aiitVar);
        return this;
    }

    @Override // defpackage.agci
    public /* bridge */ /* synthetic */ agci setTypeParameters(List list) {
        setTypeParameters((List<agee>) list);
        return this;
    }

    @Override // defpackage.agci
    public /* bridge */ /* synthetic */ agci setValueParameters(List list) {
        setValueParameters((List<agel>) list);
        return this;
    }

    @Override // defpackage.agci
    public /* bridge */ /* synthetic */ agci setVisibility(agcc agccVar) {
        setVisibility(agccVar);
        return this;
    }
}
