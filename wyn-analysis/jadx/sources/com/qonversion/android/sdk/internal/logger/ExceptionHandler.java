package com.qonversion.android.sdk.internal.logger;

import Bf.k;
import Uf.h;
import android.util.Log;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.qonversion.android.sdk.BuildConfig;
import com.qonversion.android.sdk.internal.Constants;
import ff.m;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.Thread;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\tH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u000e*\u00020\tH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u0013\u0010\u0012\u001a\u00020\u0002*\u00020\tH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001cR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/qonversion/android/sdk/internal/logger/ExceptionHandler;", "Ljava/lang/Thread$UncaughtExceptionHandler;", "", "appPackageName", "defaultExceptionHandler", "Ljava/io/File;", "reportsDir", "<init>", "(Ljava/lang/String;Ljava/lang/Thread$UncaughtExceptionHandler;Ljava/io/File;)V", "", "exception", "Lef/C;", "storeException", "(Ljava/lang/Throwable;)V", "Lorg/json/JSONObject;", "toJSON", "(Ljava/lang/Throwable;)Lorg/json/JSONObject;", "traceJSON", "rawStackTrace", "(Ljava/lang/Throwable;)Ljava/lang/String;", "", "isQonversionException", "(Ljava/lang/Throwable;)Z", "Ljava/lang/Thread;", "thread", "uncaughtException", "(Ljava/lang/Thread;Ljava/lang/Throwable;)V", "Ljava/lang/String;", "Ljava/lang/Thread$UncaughtExceptionHandler;", "Ljava/io/File;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ExceptionHandler implements Thread.UncaughtExceptionHandler {

    @NotNull
    private final String appPackageName;

    @Nullable
    private final Thread.UncaughtExceptionHandler defaultExceptionHandler;

    @NotNull
    private final File reportsDir;

    public ExceptionHandler(@NotNull String appPackageName, @Nullable Thread.UncaughtExceptionHandler uncaughtExceptionHandler, @NotNull File reportsDir) {
        AbstractC3340k.e(appPackageName, "appPackageName");
        AbstractC3340k.e(reportsDir, "reportsDir");
        this.appPackageName = appPackageName;
        this.defaultExceptionHandler = uncaughtExceptionHandler;
        this.reportsDir = reportsDir;
    }

    private final boolean isQonversionException(Throwable exception) {
        StackTraceElement[] stackTrace = exception.getStackTrace();
        AbstractC3340k.d(stackTrace, "getStackTrace(...)");
        for (StackTraceElement stackTraceElement : stackTrace) {
            String className = stackTraceElement.getClassName();
            AbstractC3340k.d(className, "getClassName(...)");
            if (k.n0(className, BuildConfig.LIBRARY_PACKAGE_NAME, false)) {
                return true;
            }
            String className2 = stackTraceElement.getClassName();
            AbstractC3340k.d(className2, "getClassName(...)");
            if (k.n0(className2, this.appPackageName, false)) {
                break;
            }
        }
        return false;
    }

    private final String rawStackTrace(Throwable th) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            PrintStream printStream = new PrintStream(byteArrayOutputStream);
            th.printStackTrace(printStream);
            printStream.close();
            byteArrayOutputStream.close();
            String string = byteArrayOutputStream.toString("UTF-8");
            AbstractC3340k.b(string);
            return string;
        } catch (Exception unused) {
            return "";
        }
    }

    private final void storeException(Throwable exception) throws Throwable {
        BufferedWriter bufferedWriter;
        JSONObject json = toJSON(exception);
        String string = UUID.randomUUID().toString();
        AbstractC3340k.d(string, "toString(...)");
        long jCurrentTimeMillis = System.currentTimeMillis();
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                try {
                    bufferedWriter = new BufferedWriter(new FileWriter(new File(this.reportsDir, string + "-" + jCurrentTimeMillis + Constants.CRASH_LOG_FILE_SUFFIX)));
                } catch (Exception e7) {
                    e = e7;
                }
            } catch (Throwable th) {
                th = th;
            }
            try {
                bufferedWriter.write(json.toString());
                bufferedWriter.flush();
                bufferedWriter.close();
            } catch (Exception e10) {
                e = e10;
                bufferedWriter2 = bufferedWriter;
                Log.e("QExceptionHandler", "Failed to save exception info to a file", e);
                if (bufferedWriter2 != null) {
                    bufferedWriter2.close();
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedWriter2 = bufferedWriter;
                if (bufferedWriter2 != null) {
                    try {
                        bufferedWriter2.close();
                    } catch (IOException e11) {
                        Log.e("QExceptionHandler", "Failed to finish saving exception info to a file", e11);
                    }
                }
                throw th;
            }
        } catch (IOException e12) {
            Log.e("QExceptionHandler", "Failed to finish saving exception info to a file", e12);
        }
    }

    private final JSONObject toJSON(Throwable th) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        Throwable cause = th;
        do {
            if (cause != null) {
                jSONArray.put(traceJSON(cause));
            }
            cause = cause != null ? cause.getCause() : null;
        } while (cause != null);
        jSONObject.put("traces", jSONArray);
        jSONObject.put("title", th);
        StackTraceElement[] stackTrace = th.getStackTrace();
        AbstractC3340k.d(stackTrace, "getStackTrace(...)");
        Object obj = (StackTraceElement) m.v0(stackTrace);
        if (obj == null) {
            obj = "";
        }
        jSONObject.put("place", obj);
        return jSONObject;
    }

    private final JSONObject traceJSON(Throwable th) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        h hVarI = AbstractC3340k.i(th.getStackTrace());
        while (hVarI.hasNext()) {
            StackTraceElement stackTraceElement = (StackTraceElement) hVarI.next();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("class", stackTraceElement.getClassName());
            jSONObject2.put("file", stackTraceElement.getFileName());
            jSONObject2.put("method", stackTraceElement.getMethodName());
            jSONObject2.put("line", stackTraceElement.getLineNumber());
            jSONArray.put(jSONObject2);
        }
        jSONObject.put("rawStackTrace", rawStackTrace(th));
        jSONObject.put("class", th.getClass().getName());
        jSONObject.put(PglCryptUtils.KEY_MESSAGE, th.getMessage());
        jSONObject.put("elements", jSONArray);
        return jSONObject;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(@NotNull Thread thread, @NotNull Throwable exception) throws Throwable {
        AbstractC3340k.e(thread, "thread");
        AbstractC3340k.e(exception, "exception");
        if (isQonversionException(exception)) {
            storeException(exception);
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.defaultExceptionHandler;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, exception);
        }
    }
}
