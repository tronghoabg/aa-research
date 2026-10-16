package androidx.datastore.core;

import android.os.Parcel;
import android.os.Process;
import android.util.Log;
import androidx.credentials.provider.CredentialEntry;
import e.a.h.ad;
import h.g.b.x;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class DirectBootExceptionUtilKt {
    private static final String TAG = "DirectBootExceptionUtil";

    public static final boolean isDeviceUnlocked(Throwable th) {
        x.f(th, "<this>");
        try {
            Method method = Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class);
            x.e(method, "getMethod(...)");
            Object objInvoke = method.invoke(null, "sys.user." + primaryUserId() + ".ce_available", CredentialEntry.FALSE_STRING);
            x.d(objInvoke, "null cannot be cast to non-null type kotlin.String");
            return x.n((String) objInvoke, CredentialEntry.TRUE_STRING);
        } catch (Throwable th2) {
            ad.c(th, th2);
            return false;
        }
    }

    private static final int primaryUserId() {
        try {
            Parcel parcelObtain = Parcel.obtain();
            x.e(parcelObtain, "obtain(...)");
            Process.myUserHandle().writeToParcel(parcelObtain, 0);
            parcelObtain.setDataPosition(0);
            return parcelObtain.readInt();
        } catch (Throwable unused) {
            Log.d(TAG, "Error when reading current user id. Selected default user id `0`.");
            return 0;
        }
    }

    public static final Exception wrapExceptionIfDueToDirectBoot(String str, Exception exc) {
        x.f(exc, "exception");
        if (isDeviceUnlocked(exc) || str == null) {
            return exc;
        }
        File file = new File(str, "siblingTestFile.txt");
        if (file.exists()) {
            file.delete();
        }
        try {
            try {
                file.createNewFile();
            } catch (IOException unused) {
                exc = new DirectBootUsageException(exc);
            }
            return exc;
        } finally {
            file.delete();
        }
    }
}
