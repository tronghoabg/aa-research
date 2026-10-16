package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class set extends ses {
    private final String[] e;

    public set(String str, String[] strArr) {
        super(str, true);
        this.e = strArr;
    }

    @Override // defpackage.ses
    public final int a(Context context) throws PackageManager.NameNotFoundException {
        String str = this.e[0];
        PackageInfo packageInfoB = b(context, str);
        if (packageInfoB == null) {
            return super.a(context);
        }
        if (e(packageInfoB)) {
            return 1;
        }
        throw new IllegalStateException(a.bq(str, "Beta package: ", " installed but does not meet min version"));
    }

    @Override // defpackage.ses
    public final String toString() {
        String[] strArr = this.e;
        return super.toString() + ", satisfiablePkgs=" + Arrays.toString(strArr);
    }
}
