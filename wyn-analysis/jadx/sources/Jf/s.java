package Jf;

import a.AbstractC1304a;
import com.qonversion.android.sdk.internal.Constants;
import ef.C2530n;
import lf.AbstractC3462a;

/* loaded from: classes5.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f6137a = 0;

    static {
        Object objZ;
        Object objZ2;
        Exception exc = new Exception();
        String simpleName = AbstractC1304a.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), Constants.USER_ID_SEPARATOR, stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            objZ = AbstractC3462a.class.getCanonicalName();
        } catch (Throwable th) {
            objZ = Fe.e.z(th);
        }
        if (C2530n.a(objZ) != null) {
            objZ = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        try {
            objZ2 = s.class.getCanonicalName();
        } catch (Throwable th2) {
            objZ2 = Fe.e.z(th2);
        }
        if (C2530n.a(objZ2) != null) {
            objZ2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
    }
}
