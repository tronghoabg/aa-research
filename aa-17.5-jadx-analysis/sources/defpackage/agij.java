package defpackage;

import com.google.android.sidekick.shared.remoteapi.RemoteApiConstants;
import java.util.List;

/* loaded from: classes3.dex */
public final class agij {
    private agdq dispatchReceiverParameter;
    private agaw kind;
    private agcq modality;
    private ahnj name;
    private agbi owner;
    private aigl returnType;
    final /* synthetic */ agik this$0;
    private agcc visibility;
    private agdn original = null;
    private boolean preserveSourceElement = false;
    private aiit substitution = aiit.EMPTY;
    private boolean copyOverrides = true;
    private List<agee> newTypeParameters = null;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str = (i == 1 || i == 2 || i == 3 || i == 5 || i == 7 || i == 9 || i == 11 || i == 19 || i == 13 || i == 14 || i == 16 || i == 17) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 1 || i == 2 || i == 3 || i == 5 || i == 7 || i == 9 || i == 11 || i == 19 || i == 13 || i == 14 || i == 16 || i == 17) ? 2 : 3];
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 7:
            case 9:
            case 11:
            case 13:
            case 14:
            case 16:
            case 17:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
                break;
            case 4:
                objArr[0] = RemoteApiConstants.BROADCAST_INTENT_TYPE_EXTRA;
                break;
            case 6:
                objArr[0] = "modality";
                break;
            case 8:
                objArr[0] = "visibility";
                break;
            case 10:
                objArr[0] = "kind";
                break;
            case 12:
                objArr[0] = "typeParameters";
                break;
            case 15:
                objArr[0] = "substitution";
                break;
            case 18:
                objArr[0] = "name";
                break;
            default:
                objArr[0] = "owner";
                break;
        }
        if (i == 1) {
            objArr[1] = "setOwner";
        } else if (i == 2) {
            objArr[1] = "setOriginal";
        } else if (i == 3) {
            objArr[1] = "setPreserveSourceElement";
        } else if (i == 5) {
            objArr[1] = "setReturnType";
        } else if (i == 7) {
            objArr[1] = "setModality";
        } else if (i == 9) {
            objArr[1] = "setVisibility";
        } else if (i == 11) {
            objArr[1] = "setKind";
        } else if (i == 19) {
            objArr[1] = "setName";
        } else if (i == 13) {
            objArr[1] = "setTypeParameters";
        } else if (i == 14) {
            objArr[1] = "setDispatchReceiverParameter";
        } else if (i == 16) {
            objArr[1] = "setSubstitution";
        } else if (i != 17) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
        } else {
            objArr[1] = "setCopyOverrides";
        }
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 7:
            case 9:
            case 11:
            case 13:
            case 14:
            case 16:
            case 17:
            case 19:
                break;
            case 4:
                objArr[2] = "setReturnType";
                break;
            case 6:
                objArr[2] = "setModality";
                break;
            case 8:
                objArr[2] = "setVisibility";
                break;
            case 10:
                objArr[2] = "setKind";
                break;
            case 12:
                objArr[2] = "setTypeParameters";
                break;
            case 15:
                objArr[2] = "setSubstitution";
                break;
            case 18:
                objArr[2] = "setName";
                break;
            default:
                objArr[2] = "setOwner";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 1 && i != 2 && i != 3 && i != 5 && i != 7 && i != 9 && i != 11 && i != 19 && i != 13 && i != 14 && i != 16 && i != 17) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public agij(agik agikVar) {
        this.this$0 = agikVar;
        this.owner = agikVar.getContainingDeclaration();
        this.modality = agikVar.getModality();
        this.visibility = agikVar.getVisibility();
        this.kind = agikVar.getKind();
        this.dispatchReceiverParameter = agikVar.dispatchReceiverParameter;
        this.name = agikVar.getName();
        this.returnType = agikVar.getType();
    }

    public agdn build() {
        return this.this$0.doSubstitute(this);
    }

    public agdo getOriginalGetter() {
        agdn agdnVar = this.original;
        if (agdnVar == null) {
            return null;
        }
        return agdnVar.getGetter();
    }

    public agdp getOriginalSetter() {
        agdn agdnVar = this.original;
        if (agdnVar == null) {
            return null;
        }
        return agdnVar.getSetter();
    }

    public agij setCopyOverrides(boolean z) {
        this.copyOverrides = z;
        return this;
    }

    public agij setKind(agaw agawVar) {
        if (agawVar == null) {
            $$$reportNull$$$0(10);
        }
        this.kind = agawVar;
        return this;
    }

    public agij setModality(agcq agcqVar) {
        if (agcqVar == null) {
            $$$reportNull$$$0(6);
        }
        this.modality = agcqVar;
        return this;
    }

    public agij setOriginal(agax agaxVar) {
        this.original = (agdn) agaxVar;
        return this;
    }

    public agij setOwner(agbi agbiVar) {
        if (agbiVar == null) {
            $$$reportNull$$$0(0);
        }
        this.owner = agbiVar;
        return this;
    }

    public agij setSubstitution(aiit aiitVar) {
        if (aiitVar == null) {
            $$$reportNull$$$0(15);
        }
        this.substitution = aiitVar;
        return this;
    }

    public agij setVisibility(agcc agccVar) {
        if (agccVar == null) {
            $$$reportNull$$$0(8);
        }
        this.visibility = agccVar;
        return this;
    }
}
