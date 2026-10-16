package defpackage;

import android.support.v4.app.Fragment;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class enp extends eno {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public enp(Fragment fragment) {
        super(fragment, "Attempting to set retain instance for fragment ".concat(fragment.toString()));
        Objects.toString(fragment);
    }
}
