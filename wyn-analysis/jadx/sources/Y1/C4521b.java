package y1;

import android.content.pm.PackageManager;
import android.content.pm.Signature;

/* renamed from: y1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4521b extends ab.b {
    @Override // ab.b
    public final Signature[] d(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }
}
