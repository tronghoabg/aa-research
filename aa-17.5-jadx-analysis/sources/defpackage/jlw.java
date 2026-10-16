package defpackage;

import android.companion.AssociationInfo;
import android.content.Context;

/* loaded from: classes.dex */
public final class jlw implements tep {
    private final /* synthetic */ tep a = new teq(jlv.a);

    public static final String c(AssociationInfo associationInfo, String str) {
        if (!affa.f(associationInfo.getDeviceProfile(), "android.app.role.SYSTEM_AUTOMOTIVE_PROJECTION")) {
            throw new IllegalArgumentException("Association must be for DEVICE_PROFILE_AUTOMOTIVE_PROJECTION!");
        }
        if (!associationInfo.isSelfManaged()) {
            throw new IllegalArgumentException("Association must be self-managed!");
        }
        CharSequence displayName = associationInfo.getDisplayName();
        if (displayName == null) {
            throw new IllegalArgumentException("Self-managed association must have display name set!");
        }
        String string = displayName.toString();
        if (str == null || affa.f(string, str)) {
            return string;
        }
        throw new IllegalArgumentException("Display name of returned association didn't match expected value!");
    }

    public final jme a(Context context) {
        return (jme) this.a.b(context);
    }

    @Override // defpackage.tep
    public final /* bridge */ /* synthetic */ Object b(Context context) {
        throw null;
    }
}
