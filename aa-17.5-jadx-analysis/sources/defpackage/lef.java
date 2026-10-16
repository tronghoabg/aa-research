package defpackage;

import android.content.Context;
import com.google.android.sidekick.shared.remoteapi.RemoteApiConstants;

/* loaded from: classes.dex */
public final class lef {
    public static final lee a = new lee();
    public static final afgl b = new kkp(mki.b, 6);

    public static final lef a() {
        return a.a();
    }

    private static final boolean d(long j) {
        Context context = mki.a.c;
        context.getClass();
        return context.getPackageManager().getPackageInfo(RemoteApiConstants.NOW_PACKAGE, 0).getLongVersionCode() >= j;
    }

    public final boolean b() {
        return (acxa.a.gu().aO() && d(acxa.C())) || lej.a.a().e();
    }

    public final boolean c() {
        return (acxa.aR() && d(acxa.D())) || lej.a.a().e();
    }
}
