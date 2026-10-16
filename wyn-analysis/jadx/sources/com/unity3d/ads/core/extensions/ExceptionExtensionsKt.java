package com.unity3d.ads.core.extensions;

import A7.AbstractC0279p0;
import Af.c;
import Af.d;
import Af.e;
import Af.n;
import Af.o;
import Bf.k;
import com.unity3d.services.SDKErrorHandler;
import java.io.PrintWriter;
import java.io.StringWriter;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u001a\n\u0010\u0005\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0006"}, d2 = {"getShortenedStackTrace", "", "", "maxLines", "", "retrieveUnityCrashValue", "unity-ads_defaultRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ExceptionExtensionsKt {
    @NotNull
    public static final String getShortenedStackTrace(@NotNull Throwable th, int i5) {
        AbstractC3340k.e(th, "<this>");
        try {
            StringWriter stringWriter = new StringWriter();
            try {
                PrintWriter printWriter = new PrintWriter(stringWriter);
                try {
                    th.printStackTrace(printWriter);
                    String string = stringWriter.toString();
                    AbstractC3340k.d(string, "stringWriter.toString()");
                    String string2 = k.V0(string).toString();
                    AbstractC3340k.e(string2, "<this>");
                    Af.k oVar = new o(string2, 3);
                    if (i5 < 0) {
                        throw new IllegalArgumentException(AbstractC0279p0.i(i5, "Requested element count ", " is less than zero.").toString());
                    }
                    String strB0 = n.b0(i5 == 0 ? e.f1294a : oVar instanceof d ? ((d) oVar).b(i5) : new c(oVar, i5, 1), "\n");
                    printWriter.close();
                    stringWriter.close();
                    return strB0;
                } finally {
                }
            } finally {
            }
        } catch (Throwable unused) {
            return "";
        }
    }

    public static /* synthetic */ String getShortenedStackTrace$default(Throwable th, int i5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i5 = 15;
        }
        return getShortenedStackTrace(th, i5);
    }

    @NotNull
    public static final String retrieveUnityCrashValue(@NotNull Throwable th) {
        StackTraceElement stackTraceElement;
        String className;
        AbstractC3340k.e(th, "<this>");
        StackTraceElement[] stackTrace = th.getStackTrace();
        AbstractC3340k.d(stackTrace, "this.stackTrace");
        int length = stackTrace.length;
        int i5 = 0;
        while (true) {
            if (i5 >= length) {
                stackTraceElement = null;
                break;
            }
            stackTraceElement = stackTrace[i5];
            if ((stackTraceElement == null || (className = stackTraceElement.getClassName()) == null) ? false : k.n0(className, SDKErrorHandler.UNITY_PACKAGE, false)) {
                break;
            }
            i5++;
        }
        if (stackTraceElement != null) {
            String fileName = stackTraceElement.getFileName();
            if (fileName == null) {
                fileName = "unknown";
            }
            String str = fileName + '_' + stackTraceElement.getLineNumber();
            if (str != null) {
                return str;
            }
        }
        return "unknown";
    }
}
