package androidx.profileinstaller;

import ae.b;
import android.content.Context;
import android.os.Build;
import i3.e;
import java.util.Collections;
import java.util.List;
import r3.InterfaceC3914b;

/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements InterfaceC3914b {
    @Override // r3.InterfaceC3914b
    public final Object create(Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return new b();
        }
        e.a(new com.applovin.impl.sdk.nativeAd.e(20, this, context.getApplicationContext()));
        return new b();
    }

    @Override // r3.InterfaceC3914b
    public final List dependencies() {
        return Collections.EMPTY_LIST;
    }
}
