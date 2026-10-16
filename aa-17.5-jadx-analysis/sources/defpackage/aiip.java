package defpackage;

import com.google.android.sidekick.shared.remoteapi.RemoteApiConstants;

/* loaded from: classes3.dex */
public final class aiip extends aiio {
    private final aijg projection;
    private final aigl type;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str = (i == 4 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 4 || i == 5) ? 2 : 3];
        switch (i) {
            case 1:
            case 2:
            case 3:
                objArr[0] = RemoteApiConstants.BROADCAST_INTENT_TYPE_EXTRA;
                break;
            case 4:
            case 5:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
                break;
            case 6:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "projection";
                break;
        }
        if (i == 4) {
            objArr[1] = "getProjectionKind";
        } else if (i != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
        } else {
            objArr[1] = "getType";
        }
        if (i == 3) {
            objArr[2] = "replaceType";
        } else if (i != 4 && i != 5) {
            if (i != 6) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "refine";
            }
        }
        String str2 = String.format(str, objArr);
        if (i != 4 && i != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public aiip(aijg aijgVar, aigl aiglVar) {
        if (aijgVar == null) {
            $$$reportNull$$$0(0);
        }
        if (aiglVar == null) {
            $$$reportNull$$$0(1);
        }
        this.projection = aijgVar;
        this.type = aiglVar;
    }

    @Override // defpackage.aiin
    public aijg getProjectionKind() {
        aijg aijgVar = this.projection;
        if (aijgVar == null) {
            $$$reportNull$$$0(4);
        }
        return aijgVar;
    }

    @Override // defpackage.aiin
    public aigl getType() {
        aigl aiglVar = this.type;
        if (aiglVar == null) {
            $$$reportNull$$$0(5);
        }
        return aiglVar;
    }

    @Override // defpackage.aiin
    public boolean isStarProjection() {
        return false;
    }

    @Override // defpackage.aiin
    public aiin refine(aiju aijuVar) {
        if (aijuVar == null) {
            $$$reportNull$$$0(6);
        }
        return new aiip(this.projection, aijuVar.refineType((ailw) this.type));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public aiip(aigl aiglVar) {
        this(aijg.INVARIANT, aiglVar);
        if (aiglVar == null) {
            $$$reportNull$$$0(2);
        }
    }
}
