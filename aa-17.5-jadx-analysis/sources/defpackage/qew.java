package defpackage;

import android.os.Build;

/* loaded from: classes.dex */
public final class qew extends mki {
    public static final /* synthetic */ int g = 0;

    @Override // defpackage.mki
    public final mkh a() {
        return mkh.b;
    }

    @Override // defpackage.mki
    public final void f() {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("CarApi is not supported in Lite CSL on Android R+");
        }
    }

    @Override // defpackage.mki
    public final void g() {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("CarFirstPartyApi is not supported in Lite CSL on Android R+");
        }
    }
}
