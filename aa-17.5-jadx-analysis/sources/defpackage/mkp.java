package defpackage;

import android.content.Context;
import com.google.android.projection.gearhead.R;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

@Deprecated
/* loaded from: classes.dex */
public final class mkp {
    @ResultIgnorabilityUnspecified
    public static final boolean a() {
        mko mkoVarA = ((mkq) mki.a.i(mkq.class)).a();
        return mkoVarA.g("key_settings_allow_connection_while_locked", ((Context) mkoVarA.a).getResources().getBoolean(R.bool.settings_allow_connection_while_locked_default));
    }

    public static void b() {
    }
}
