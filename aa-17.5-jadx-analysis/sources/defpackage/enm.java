package defpackage;

import android.support.v4.app.Fragment;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class enm extends ens {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public enm(Fragment fragment) {
        super(fragment, "Attempting to get target request code from fragment ".concat(fragment.toString()));
        Objects.toString(fragment);
    }
}
