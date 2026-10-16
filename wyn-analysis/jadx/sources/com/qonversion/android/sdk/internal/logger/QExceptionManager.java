package com.qonversion.android.sdk.internal.logger;

import R8.h;
import android.content.Context;
import android.util.Log;
import com.applovin.adview.a;
import com.qonversion.android.sdk.internal.Constants;
import com.qonversion.android.sdk.internal.ExtensionsKt;
import com.qonversion.android.sdk.internal.InternalConfig;
import com.qonversion.android.sdk.internal.api.ApiHeadersProvider;
import com.qonversion.android.sdk.internal.dto.request.CrashRequest;
import com.qonversion.android.sdk.internal.repository.QRepository;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import ff.m;
import ff.v;
import hb.K;
import hb.r;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Thread;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010!R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00140\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010&\u001a\u00020%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b&\u0010'R\u001c\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001b0(8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lcom/qonversion/android/sdk/internal/logger/QExceptionManager;", "Lcom/qonversion/android/sdk/internal/logger/ExceptionManager;", "Lcom/qonversion/android/sdk/internal/repository/QRepository;", "repository", "Lcom/qonversion/android/sdk/internal/InternalConfig;", "intervalConfig", "Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;", "headersProvider", "Lhb/K;", "moshi", "<init>", "(Lcom/qonversion/android/sdk/internal/repository/QRepository;Lcom/qonversion/android/sdk/internal/InternalConfig;Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;Lhb/K;)V", "Lef/C;", "sendCrashReportsInBackground", "()V", "", "", "getAvailableReportNames", "()Ljava/util/List;", "filename", "Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$ExceptionInfo;", "getContentOfCrashReport", "(Ljava/lang/String;)Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$ExceptionInfo;", "exception", "Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest;", "prepareCrashData", "(Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$ExceptionInfo;)Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest;", "Landroid/content/Context;", "context", MobileAdsBridgeBase.initializeMethodName, "(Landroid/content/Context;)V", "Lcom/qonversion/android/sdk/internal/repository/QRepository;", "Lcom/qonversion/android/sdk/internal/InternalConfig;", "Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;", "Lhb/r;", "exceptionAdapter", "Lhb/r;", "Ljava/io/File;", "reportsDir", "Ljava/io/File;", "Ljava/lang/ref/WeakReference;", "contextRef", "Ljava/lang/ref/WeakReference;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class QExceptionManager implements ExceptionManager {
    private WeakReference<Context> contextRef;

    @NotNull
    private final r exceptionAdapter;

    @NotNull
    private final ApiHeadersProvider headersProvider;

    @NotNull
    private final InternalConfig intervalConfig;
    private File reportsDir;

    @NotNull
    private final QRepository repository;

    public QExceptionManager(@NotNull QRepository repository, @NotNull InternalConfig intervalConfig, @NotNull ApiHeadersProvider headersProvider, @NotNull K moshi) {
        AbstractC3340k.e(repository, "repository");
        AbstractC3340k.e(intervalConfig, "intervalConfig");
        AbstractC3340k.e(headersProvider, "headersProvider");
        AbstractC3340k.e(moshi, "moshi");
        this.repository = repository;
        this.intervalConfig = intervalConfig;
        this.headersProvider = headersProvider;
        this.exceptionAdapter = moshi.a(CrashRequest.ExceptionInfo.class);
    }

    private final List<String> getAvailableReportNames() {
        File file = this.reportsDir;
        if (file == null) {
            AbstractC3340k.m("reportsDir");
            throw null;
        }
        boolean zExists = file.exists();
        v vVar = v.f35432a;
        if (!zExists) {
            File file2 = this.reportsDir;
            if (file2 == null) {
                AbstractC3340k.m("reportsDir");
                throw null;
            }
            if (!file2.mkdir()) {
                return vVar;
            }
        }
        h hVar = new h(4);
        File file3 = this.reportsDir;
        if (file3 != null) {
            String[] list = file3.list(hVar);
            return list != null ? m.L0(list) : vVar;
        }
        AbstractC3340k.m("reportsDir");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getAvailableReportNames$lambda$3(File file, String str) {
        AbstractC3340k.b(str);
        return Bf.r.b0(str, Constants.CRASH_LOG_FILE_SUFFIX, false);
    }

    private final CrashRequest.ExceptionInfo getContentOfCrashReport(String filename) throws IOException {
        File fileStreamPath;
        WeakReference<Context> weakReference = this.contextRef;
        if (weakReference == null) {
            AbstractC3340k.m("contextRef");
            throw null;
        }
        Context context = weakReference.get();
        if (context == null || (fileStreamPath = context.getFileStreamPath(filename)) == null) {
            return null;
        }
        if (!fileStreamPath.exists()) {
            fileStreamPath = null;
        }
        if (fileStreamPath == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(context.openFileInput(filename)));
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    sb2.append(line);
                    sb2.append('\n');
                } finally {
                }
            }
            bufferedReader.close();
        } catch (IOException e7) {
            Log.e("QExceptionManager", "Failed to read crash report from the file", e7);
        }
        try {
            return (CrashRequest.ExceptionInfo) this.exceptionAdapter.fromJson(sb2.toString());
        } catch (Exception e10) {
            Log.e("QExceptionManager", "Failed to parse JSON from the crash report file", e10);
            return null;
        }
    }

    private final CrashRequest prepareCrashData(CrashRequest.ExceptionInfo exception) {
        return new CrashRequest(exception, new CrashRequest.DeviceInfo(this.headersProvider.getPlatform(), this.headersProvider.getPlatformVersion(), this.headersProvider.getSource(), this.headersProvider.getSourceVersion(), this.headersProvider.getProjectKey(), this.intervalConfig.getUid()));
    }

    private final void sendCrashReportsInBackground() {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        AbstractC3340k.d(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor(...)");
        executorServiceNewSingleThreadExecutor.execute(new a(this, 13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendCrashReportsInBackground$lambda$2(QExceptionManager this$0) throws IOException {
        AbstractC3340k.e(this$0, "this$0");
        for (String str : this$0.getAvailableReportNames()) {
            CrashRequest.ExceptionInfo contentOfCrashReport = this$0.getContentOfCrashReport(str);
            if (contentOfCrashReport != null) {
                this$0.repository.crashReport(this$0.prepareCrashData(contentOfCrashReport), new QExceptionManager$sendCrashReportsInBackground$1$1$1$1(this$0, str), QExceptionManager$sendCrashReportsInBackground$1$1$1$2.INSTANCE);
            }
        }
    }

    @Override // com.qonversion.android.sdk.internal.logger.ExceptionManager
    public void initialize(@NotNull Context context) {
        AbstractC3340k.e(context, "context");
        File filesDir = context.getFilesDir();
        AbstractC3340k.d(filesDir, "getFilesDir(...)");
        this.reportsDir = filesDir;
        this.contextRef = new WeakReference<>(context);
        if (ExtensionsKt.isDebuggable(context)) {
            return;
        }
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        String packageName = context.getPackageName();
        AbstractC3340k.d(packageName, "getPackageName(...)");
        File file = this.reportsDir;
        if (file == null) {
            AbstractC3340k.m("reportsDir");
            throw null;
        }
        Thread.setDefaultUncaughtExceptionHandler(new ExceptionHandler(packageName, defaultUncaughtExceptionHandler, file));
        sendCrashReportsInBackground();
    }
}
