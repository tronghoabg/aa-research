package defpackage;

import com.google.android.sidekick.shared.remoteapi.RemoteApiConstants;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class ahyc extends ahxu {
    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        Object[] objArr = new Object[3];
        if (i != 2) {
            objArr[0] = RemoteApiConstants.BROADCAST_INTENT_TYPE_EXTRA;
        } else {
            objArr[0] = "newType";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/TransientReceiver";
        if (i != 2) {
            objArr[2] = "<init>";
        } else {
            objArr[2] = "replaceType";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ahyc(aigl aiglVar) {
        this(aiglVar, null);
        if (aiglVar == null) {
            $$$reportNull$$$0(0);
        }
    }

    public String toString() {
        aigl type = getType();
        Objects.toString(type);
        return "{Transient} : ".concat(String.valueOf(type));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private ahyc(aigl aiglVar, ahya ahyaVar) {
        super(aiglVar, ahyaVar);
        if (aiglVar == null) {
            $$$reportNull$$$0(1);
        }
    }
}
