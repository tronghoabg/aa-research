package com.moloco.sdk.internal;

import E4.F;
import android.util.Log;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s8.C4026b;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\bÇ\u0002\u0018\u00002\u00020\u0001:\u0004:';<B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\bJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\n*\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\n*\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u001d\u0010\u0015\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u0019\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ)\u0010\u001b\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001b\u0010\u001aJ5\u0010\u001e\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\b\u0002\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001e\u0010\u001fJ5\u0010 \u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\b\u0002\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b \u0010\u001fJ5\u0010!\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\b\u0002\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b!\u0010\u001fJ!\u0010#\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\n2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\n¢\u0006\u0004\b%\u0010&J\u0017\u0010+\u001a\u00020\u00062\u0006\u0010(\u001a\u00020'H\u0001¢\u0006\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010(\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010.R$\u00101\u001a\u0012\u0012\u0004\u0012\u00020\u00040/j\b\u0012\u0004\u0012\u00020\u0004`08\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R*\u00109\u001a\u00020\u00172\u0006\u00103\u001a\u00020\u00178F@FX\u0087\u000e¢\u0006\u0012\u0012\u0004\b8\u0010\u0003\u001a\u0004\b4\u00105\"\u0004\b6\u00107¨\u0006="}, d2 = {"Lcom/moloco/sdk/internal/MolocoLogger;", "", "<init>", "()V", "Lcom/moloco/sdk/internal/MolocoLogger$LoggerListener;", "loggerListener", "Lef/C;", "addListener", "(Lcom/moloco/sdk/internal/MolocoLogger$LoggerListener;)V", "removeListener", "", "tag", "msg", "fireListeners", "(Ljava/lang/String;Ljava/lang/String;)V", "prefixWithMolocoName", "(Ljava/lang/String;)Ljava/lang/String;", "prefixWithMethodName", "", "Ljava/lang/StackTraceElement;", "stackTraceArray", "findMostRelevantStackTrace", "([Ljava/lang/StackTraceElement;)Ljava/lang/StackTraceElement;", "", "forceLogging", "debug", "(Ljava/lang/String;Ljava/lang/String;Z)V", "debugBuildLog", "", "exception", "info", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Z)V", "warn", "error", "throwable", "tlog", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "getCallingMethodName", "()Ljava/lang/String;", "Lcom/moloco/sdk/internal/c;", "configuration", "setConfiguration$moloco_sdk_release", "(Lcom/moloco/sdk/internal/c;)V", "setConfiguration", "MOLOCO_TAG", "Ljava/lang/String;", "Lcom/moloco/sdk/internal/c;", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/LinkedHashSet;", "listeners", "Ljava/util/LinkedHashSet;", MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, "getLogEnabled", "()Z", "setLogEnabled", "(Z)V", "getLogEnabled$annotations", "logEnabled", "LoggerListener", "E4/F", "s8/b", "moloco-sdk_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes4.dex */
public final class MolocoLogger {
    public static final int $stable;

    @NotNull
    public static final MolocoLogger INSTANCE = new MolocoLogger();

    @NotNull
    private static final String MOLOCO_TAG = "Moloco";

    @NotNull
    private static InterfaceC1881c configuration;

    @NotNull
    private static final LinkedHashSet<LoggerListener> listeners;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/moloco/sdk/internal/MolocoLogger$LoggerListener;", "", "", "tag", "msg", "Lef/C;", "onLog", "(Ljava/lang/String;Ljava/lang/String;)V", "moloco-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface LoggerListener {
        void onLog(@NotNull String tag, @NotNull String msg);
    }

    static {
        C4026b c4026b = new C4026b(4);
        new H4.a(3, (Object) new Af.q(c4026b, 6), false).start();
        configuration = new F(7, c4026b, false);
        listeners = new LinkedHashSet<>();
        $stable = 8;
    }

    private MolocoLogger() {
    }

    public static final void addListener(@NotNull LoggerListener loggerListener) {
        AbstractC3340k.e(loggerListener, "loggerListener");
        listeners.add(loggerListener);
    }

    public static /* synthetic */ void debug$default(MolocoLogger molocoLogger, String str, String str2, boolean z2, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = MOLOCO_TAG;
        }
        if ((i5 & 4) != 0) {
            z2 = false;
        }
        molocoLogger.debug(str, str2, z2);
    }

    public static /* synthetic */ void debugBuildLog$default(MolocoLogger molocoLogger, String str, String str2, boolean z2, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = MOLOCO_TAG;
        }
        if ((i5 & 4) != 0) {
            z2 = false;
        }
        molocoLogger.debugBuildLog(str, str2, z2);
    }

    public static /* synthetic */ void error$default(MolocoLogger molocoLogger, String str, String str2, Throwable th, boolean z2, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = MOLOCO_TAG;
        }
        if ((i5 & 4) != 0) {
            th = null;
        }
        if ((i5 & 8) != 0) {
            z2 = false;
        }
        molocoLogger.error(str, str2, th, z2);
    }

    private final StackTraceElement findMostRelevantStackTrace(StackTraceElement[] stackTraceArray) {
        for (StackTraceElement stackTraceElement : stackTraceArray) {
            if (!AbstractC3340k.a(stackTraceElement.getClassName(), INSTANCE.getClass().getCanonicalName())) {
                return stackTraceElement;
            }
        }
        return (StackTraceElement) ff.m.u0(stackTraceArray);
    }

    private final void fireListeners(String tag, String msg) {
        Iterator<T> it = listeners.iterator();
        while (it.hasNext()) {
            ((LoggerListener) it.next()).onLog(INSTANCE.prefixWithMolocoName(tag), msg);
        }
    }

    public static final boolean getLogEnabled() {
        InterfaceC1881c interfaceC1881c = configuration;
        interfaceC1881c.getClass();
        F f10 = (F) interfaceC1881c;
        return ((C4026b) f10.f2854c).f45322b || f10.f2853b;
    }

    public static /* synthetic */ void getLogEnabled$annotations() {
    }

    public static /* synthetic */ void info$default(MolocoLogger molocoLogger, String str, String str2, Throwable th, boolean z2, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = MOLOCO_TAG;
        }
        if ((i5 & 4) != 0) {
            th = null;
        }
        if ((i5 & 8) != 0) {
            z2 = false;
        }
        molocoLogger.info(str, str2, th, z2);
    }

    private final String prefixWithMethodName(String str) {
        try {
            return "[" + getCallingMethodName() + "] " + str;
        } catch (Throwable unused) {
            return str;
        }
    }

    private final String prefixWithMolocoName(String str) {
        return Bf.r.k0(str, MOLOCO_TAG, false) ? str : MOLOCO_TAG.concat(str);
    }

    public static final void removeListener(@NotNull LoggerListener loggerListener) {
        AbstractC3340k.e(loggerListener, "loggerListener");
        listeners.remove(loggerListener);
    }

    public static final void setLogEnabled(boolean z2) {
        ((F) configuration).f2853b = z2;
    }

    public static /* synthetic */ void tlog$default(MolocoLogger molocoLogger, String str, Throwable th, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            th = null;
        }
        molocoLogger.tlog(str, th);
    }

    public static /* synthetic */ void warn$default(MolocoLogger molocoLogger, String str, String str2, Throwable th, boolean z2, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = MOLOCO_TAG;
        }
        if ((i5 & 4) != 0) {
            th = null;
        }
        if ((i5 & 8) != 0) {
            z2 = false;
        }
        molocoLogger.warn(str, str2, th, z2);
    }

    public final void debug(@NotNull String tag, @NotNull String msg, boolean forceLogging) {
        AbstractC3340k.e(tag, "tag");
        AbstractC3340k.e(msg, "msg");
        if (getLogEnabled() || forceLogging) {
            String strPrefixWithMolocoName = prefixWithMolocoName(tag);
            String strPrefixWithMethodName = prefixWithMethodName(msg);
            Log.d(strPrefixWithMolocoName, strPrefixWithMethodName);
            fireListeners(strPrefixWithMolocoName, strPrefixWithMethodName);
        }
    }

    public final void debugBuildLog(@NotNull String tag, @NotNull String msg, boolean forceLogging) {
        AbstractC3340k.e(tag, "tag");
        AbstractC3340k.e(msg, "msg");
    }

    public final void error(@NotNull String tag, @NotNull String msg, @Nullable Throwable exception, boolean forceLogging) {
        AbstractC3340k.e(tag, "tag");
        AbstractC3340k.e(msg, "msg");
        if (getLogEnabled() || forceLogging) {
            String strPrefixWithMolocoName = prefixWithMolocoName(tag);
            String strPrefixWithMethodName = prefixWithMethodName(msg);
            Log.e(strPrefixWithMolocoName, strPrefixWithMethodName, exception);
            fireListeners(strPrefixWithMolocoName, strPrefixWithMethodName);
        }
    }

    @NotNull
    public final String getCallingMethodName() throws ClassNotFoundException, SecurityException {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        AbstractC3340k.d(stackTrace, "getStackTrace(...)");
        StackTraceElement stackTraceElementFindMostRelevantStackTrace = findMostRelevantStackTrace(stackTrace);
        String className = stackTraceElementFindMostRelevantStackTrace.getClassName();
        stackTraceElementFindMostRelevantStackTrace.getMethodName();
        Class<?> cls = Class.forName(className);
        cls.isAnonymousClass();
        cls.getDeclaredMethods();
        String methodName = stackTraceElementFindMostRelevantStackTrace.getMethodName();
        if (AbstractC3340k.a(methodName, "invokeSuspend")) {
            String className2 = stackTraceElementFindMostRelevantStackTrace.getClassName();
            AbstractC3340k.d(className2, "getClassName(...)");
            methodName = Bf.k.O0(Bf.k.F0(className2, "$1"), "$");
        }
        AbstractC3340k.d(methodName, "let(...)");
        return methodName;
    }

    public final void info(@NotNull String tag, @NotNull String msg, @Nullable Throwable exception, boolean forceLogging) {
        AbstractC3340k.e(tag, "tag");
        AbstractC3340k.e(msg, "msg");
        if (getLogEnabled() || forceLogging) {
            String strPrefixWithMolocoName = prefixWithMolocoName(tag);
            String strPrefixWithMethodName = prefixWithMethodName(msg);
            Log.i(strPrefixWithMolocoName, strPrefixWithMethodName, exception);
            fireListeners(strPrefixWithMolocoName, strPrefixWithMethodName);
        }
    }

    public final void setConfiguration$moloco_sdk_release(@NotNull InterfaceC1881c configuration2) {
        AbstractC3340k.e(configuration2, "configuration");
        configuration = configuration2;
    }

    public final void tlog(@NotNull String msg, @Nullable Throwable throwable) {
        AbstractC3340k.e(msg, "msg");
        Log.i("==tlog==", prefixWithMethodName(msg), throwable);
    }

    public final void warn(@NotNull String tag, @NotNull String msg, @Nullable Throwable exception, boolean forceLogging) {
        AbstractC3340k.e(tag, "tag");
        AbstractC3340k.e(msg, "msg");
        if (getLogEnabled() || forceLogging) {
            String strPrefixWithMolocoName = prefixWithMolocoName(tag);
            String strPrefixWithMethodName = prefixWithMethodName(msg);
            Log.w(strPrefixWithMolocoName, strPrefixWithMethodName, exception);
            fireListeners(strPrefixWithMolocoName, strPrefixWithMethodName);
        }
    }
}
