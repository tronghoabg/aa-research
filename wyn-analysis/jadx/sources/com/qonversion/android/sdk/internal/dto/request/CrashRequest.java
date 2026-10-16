package com.qonversion.android.sdk.internal.dto.request;

import A7.AbstractC0279p0;
import N0.a;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import hb.InterfaceC2812o;
import hb.s;
import java.util.List;
import ka.AbstractC3256n;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@s(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001:\u0004\u0015\u0016\u0017\u0018B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest;", "", "log", "Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$ExceptionInfo;", "deviceInfo", "Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$DeviceInfo;", "(Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$ExceptionInfo;Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$DeviceInfo;)V", "getDeviceInfo", "()Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$DeviceInfo;", "getLog", "()Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$ExceptionInfo;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "DeviceInfo", "ExceptionInfo", "ExceptionTrace", "ExceptionTraceElement", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CrashRequest {

    @NotNull
    private final DeviceInfo deviceInfo;

    @NotNull
    private final ExceptionInfo log;

    @s(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0001\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003JE\u0010\u0017\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0003\u0010\u0007\u001a\u00020\u00032\b\b\u0003\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001e"}, d2 = {"Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$DeviceInfo;", "", "platform", "", "platformVersion", "source", "sourceVersion", "projectKey", "uid", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPlatform", "()Ljava/lang/String;", "getPlatformVersion", "getProjectKey", "getSource", "getSourceVersion", "getUid", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DeviceInfo {

        @NotNull
        private final String platform;

        @NotNull
        private final String platformVersion;

        @NotNull
        private final String projectKey;

        @NotNull
        private final String source;

        @NotNull
        private final String sourceVersion;

        @NotNull
        private final String uid;

        public DeviceInfo(@InterfaceC2812o(name = "platform") @NotNull String platform, @InterfaceC2812o(name = "platform_version") @NotNull String platformVersion, @InterfaceC2812o(name = "source") @NotNull String source, @InterfaceC2812o(name = "source_version") @NotNull String sourceVersion, @InterfaceC2812o(name = "project_key") @NotNull String projectKey, @InterfaceC2812o(name = "uid") @NotNull String uid) {
            AbstractC3340k.e(platform, "platform");
            AbstractC3340k.e(platformVersion, "platformVersion");
            AbstractC3340k.e(source, "source");
            AbstractC3340k.e(sourceVersion, "sourceVersion");
            AbstractC3340k.e(projectKey, "projectKey");
            AbstractC3340k.e(uid, "uid");
            this.platform = platform;
            this.platformVersion = platformVersion;
            this.source = source;
            this.sourceVersion = sourceVersion;
            this.projectKey = projectKey;
            this.uid = uid;
        }

        public static /* synthetic */ DeviceInfo copy$default(DeviceInfo deviceInfo, String str, String str2, String str3, String str4, String str5, String str6, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                str = deviceInfo.platform;
            }
            if ((i5 & 2) != 0) {
                str2 = deviceInfo.platformVersion;
            }
            if ((i5 & 4) != 0) {
                str3 = deviceInfo.source;
            }
            if ((i5 & 8) != 0) {
                str4 = deviceInfo.sourceVersion;
            }
            if ((i5 & 16) != 0) {
                str5 = deviceInfo.projectKey;
            }
            if ((i5 & 32) != 0) {
                str6 = deviceInfo.uid;
            }
            String str7 = str5;
            String str8 = str6;
            return deviceInfo.copy(str, str2, str3, str4, str7, str8);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getPlatform() {
            return this.platform;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getPlatformVersion() {
            return this.platformVersion;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final String getSourceVersion() {
            return this.sourceVersion;
        }

        @NotNull
        /* renamed from: component5, reason: from getter */
        public final String getProjectKey() {
            return this.projectKey;
        }

        @NotNull
        /* renamed from: component6, reason: from getter */
        public final String getUid() {
            return this.uid;
        }

        @NotNull
        public final DeviceInfo copy(@InterfaceC2812o(name = "platform") @NotNull String platform, @InterfaceC2812o(name = "platform_version") @NotNull String platformVersion, @InterfaceC2812o(name = "source") @NotNull String source, @InterfaceC2812o(name = "source_version") @NotNull String sourceVersion, @InterfaceC2812o(name = "project_key") @NotNull String projectKey, @InterfaceC2812o(name = "uid") @NotNull String uid) {
            AbstractC3340k.e(platform, "platform");
            AbstractC3340k.e(platformVersion, "platformVersion");
            AbstractC3340k.e(source, "source");
            AbstractC3340k.e(sourceVersion, "sourceVersion");
            AbstractC3340k.e(projectKey, "projectKey");
            AbstractC3340k.e(uid, "uid");
            return new DeviceInfo(platform, platformVersion, source, sourceVersion, projectKey, uid);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DeviceInfo)) {
                return false;
            }
            DeviceInfo deviceInfo = (DeviceInfo) other;
            return AbstractC3340k.a(this.platform, deviceInfo.platform) && AbstractC3340k.a(this.platformVersion, deviceInfo.platformVersion) && AbstractC3340k.a(this.source, deviceInfo.source) && AbstractC3340k.a(this.sourceVersion, deviceInfo.sourceVersion) && AbstractC3340k.a(this.projectKey, deviceInfo.projectKey) && AbstractC3340k.a(this.uid, deviceInfo.uid);
        }

        @NotNull
        public final String getPlatform() {
            return this.platform;
        }

        @NotNull
        public final String getPlatformVersion() {
            return this.platformVersion;
        }

        @NotNull
        public final String getProjectKey() {
            return this.projectKey;
        }

        @NotNull
        public final String getSource() {
            return this.source;
        }

        @NotNull
        public final String getSourceVersion() {
            return this.sourceVersion;
        }

        @NotNull
        public final String getUid() {
            return this.uid;
        }

        public int hashCode() {
            return this.uid.hashCode() + a.c(a.c(a.c(a.c(this.platform.hashCode() * 31, 31, this.platformVersion), 31, this.source), 31, this.sourceVersion), 31, this.projectKey);
        }

        @NotNull
        public String toString() {
            String str = this.platform;
            String str2 = this.platformVersion;
            String str3 = this.source;
            String str4 = this.sourceVersion;
            String str5 = this.projectKey;
            String str6 = this.uid;
            StringBuilder sbR = AbstractC0279p0.r("DeviceInfo(platform=", str, ", platformVersion=", str2, ", source=");
            AbstractC3256n.p(sbR, str3, ", sourceVersion=", str4, ", projectKey=");
            return AbstractC3256n.h(sbR, str5, ", uid=", str6, ")");
        }
    }

    @s(generateAdapter = true)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\u000e\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$ExceptionInfo;", "", "title", "", "place", "traces", "", "Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$ExceptionTrace;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getPlace", "()Ljava/lang/String;", "getTitle", "getTraces", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ExceptionInfo {

        @NotNull
        private final String place;

        @NotNull
        private final String title;

        @NotNull
        private final List<ExceptionTrace> traces;

        public ExceptionInfo(@InterfaceC2812o(name = "title") @NotNull String title, @InterfaceC2812o(name = "place") @NotNull String place, @InterfaceC2812o(name = "traces") @NotNull List<ExceptionTrace> traces) {
            AbstractC3340k.e(title, "title");
            AbstractC3340k.e(place, "place");
            AbstractC3340k.e(traces, "traces");
            this.title = title;
            this.place = place;
            this.traces = traces;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ExceptionInfo copy$default(ExceptionInfo exceptionInfo, String str, String str2, List list, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                str = exceptionInfo.title;
            }
            if ((i5 & 2) != 0) {
                str2 = exceptionInfo.place;
            }
            if ((i5 & 4) != 0) {
                list = exceptionInfo.traces;
            }
            return exceptionInfo.copy(str, str2, list);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getPlace() {
            return this.place;
        }

        @NotNull
        public final List<ExceptionTrace> component3() {
            return this.traces;
        }

        @NotNull
        public final ExceptionInfo copy(@InterfaceC2812o(name = "title") @NotNull String title, @InterfaceC2812o(name = "place") @NotNull String place, @InterfaceC2812o(name = "traces") @NotNull List<ExceptionTrace> traces) {
            AbstractC3340k.e(title, "title");
            AbstractC3340k.e(place, "place");
            AbstractC3340k.e(traces, "traces");
            return new ExceptionInfo(title, place, traces);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ExceptionInfo)) {
                return false;
            }
            ExceptionInfo exceptionInfo = (ExceptionInfo) other;
            return AbstractC3340k.a(this.title, exceptionInfo.title) && AbstractC3340k.a(this.place, exceptionInfo.place) && AbstractC3340k.a(this.traces, exceptionInfo.traces);
        }

        @NotNull
        public final String getPlace() {
            return this.place;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        public final List<ExceptionTrace> getTraces() {
            return this.traces;
        }

        public int hashCode() {
            return this.traces.hashCode() + a.c(this.title.hashCode() * 31, 31, this.place);
        }

        @NotNull
        public String toString() {
            String str = this.title;
            String str2 = this.place;
            List<ExceptionTrace> list = this.traces;
            StringBuilder sbR = AbstractC0279p0.r("ExceptionInfo(title=", str, ", place=", str2, ", traces=");
            sbR.append(list);
            sbR.append(")");
            return sbR.toString();
        }
    }

    @s(generateAdapter = true)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J7\u0010\u0014\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$ExceptionTrace;", "", "rawStackTrace", "", "className", PglCryptUtils.KEY_MESSAGE, "elements", "", "Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$ExceptionTraceElement;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getClassName", "()Ljava/lang/String;", "getElements", "()Ljava/util/List;", "getMessage", "getRawStackTrace", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ExceptionTrace {

        @NotNull
        private final String className;

        @NotNull
        private final List<ExceptionTraceElement> elements;

        @NotNull
        private final String message;

        @NotNull
        private final String rawStackTrace;

        public ExceptionTrace(@InterfaceC2812o(name = "rawStackTrace") @NotNull String rawStackTrace, @InterfaceC2812o(name = "class") @NotNull String className, @InterfaceC2812o(name = PglCryptUtils.KEY_MESSAGE) @NotNull String message, @InterfaceC2812o(name = "elements") @NotNull List<ExceptionTraceElement> elements) {
            AbstractC3340k.e(rawStackTrace, "rawStackTrace");
            AbstractC3340k.e(className, "className");
            AbstractC3340k.e(message, "message");
            AbstractC3340k.e(elements, "elements");
            this.rawStackTrace = rawStackTrace;
            this.className = className;
            this.message = message;
            this.elements = elements;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ExceptionTrace copy$default(ExceptionTrace exceptionTrace, String str, String str2, String str3, List list, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                str = exceptionTrace.rawStackTrace;
            }
            if ((i5 & 2) != 0) {
                str2 = exceptionTrace.className;
            }
            if ((i5 & 4) != 0) {
                str3 = exceptionTrace.message;
            }
            if ((i5 & 8) != 0) {
                list = exceptionTrace.elements;
            }
            return exceptionTrace.copy(str, str2, str3, list);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getRawStackTrace() {
            return this.rawStackTrace;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getClassName() {
            return this.className;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        @NotNull
        public final List<ExceptionTraceElement> component4() {
            return this.elements;
        }

        @NotNull
        public final ExceptionTrace copy(@InterfaceC2812o(name = "rawStackTrace") @NotNull String rawStackTrace, @InterfaceC2812o(name = "class") @NotNull String className, @InterfaceC2812o(name = PglCryptUtils.KEY_MESSAGE) @NotNull String message, @InterfaceC2812o(name = "elements") @NotNull List<ExceptionTraceElement> elements) {
            AbstractC3340k.e(rawStackTrace, "rawStackTrace");
            AbstractC3340k.e(className, "className");
            AbstractC3340k.e(message, "message");
            AbstractC3340k.e(elements, "elements");
            return new ExceptionTrace(rawStackTrace, className, message, elements);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ExceptionTrace)) {
                return false;
            }
            ExceptionTrace exceptionTrace = (ExceptionTrace) other;
            return AbstractC3340k.a(this.rawStackTrace, exceptionTrace.rawStackTrace) && AbstractC3340k.a(this.className, exceptionTrace.className) && AbstractC3340k.a(this.message, exceptionTrace.message) && AbstractC3340k.a(this.elements, exceptionTrace.elements);
        }

        @NotNull
        public final String getClassName() {
            return this.className;
        }

        @NotNull
        public final List<ExceptionTraceElement> getElements() {
            return this.elements;
        }

        @NotNull
        public final String getMessage() {
            return this.message;
        }

        @NotNull
        public final String getRawStackTrace() {
            return this.rawStackTrace;
        }

        public int hashCode() {
            return this.elements.hashCode() + a.c(a.c(this.rawStackTrace.hashCode() * 31, 31, this.className), 31, this.message);
        }

        @NotNull
        public String toString() {
            String str = this.rawStackTrace;
            String str2 = this.className;
            String str3 = this.message;
            List<ExceptionTraceElement> list = this.elements;
            StringBuilder sbR = AbstractC0279p0.r("ExceptionTrace(rawStackTrace=", str, ", className=", str2, ", message=");
            sbR.append(str3);
            sbR.append(", elements=");
            sbR.append(list);
            sbR.append(")");
            return sbR.toString();
        }
    }

    @s(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$ExceptionTraceElement;", "", "className", "", "fileName", "methodName", "line", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getClassName", "()Ljava/lang/String;", "getFileName", "getLine", "()I", "getMethodName", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ExceptionTraceElement {

        @NotNull
        private final String className;

        @NotNull
        private final String fileName;
        private final int line;

        @NotNull
        private final String methodName;

        public ExceptionTraceElement(@InterfaceC2812o(name = "class") @NotNull String className, @InterfaceC2812o(name = "file") @NotNull String fileName, @InterfaceC2812o(name = "method") @NotNull String methodName, @InterfaceC2812o(name = "line") int i5) {
            AbstractC3340k.e(className, "className");
            AbstractC3340k.e(fileName, "fileName");
            AbstractC3340k.e(methodName, "methodName");
            this.className = className;
            this.fileName = fileName;
            this.methodName = methodName;
            this.line = i5;
        }

        public static /* synthetic */ ExceptionTraceElement copy$default(ExceptionTraceElement exceptionTraceElement, String str, String str2, String str3, int i5, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = exceptionTraceElement.className;
            }
            if ((i10 & 2) != 0) {
                str2 = exceptionTraceElement.fileName;
            }
            if ((i10 & 4) != 0) {
                str3 = exceptionTraceElement.methodName;
            }
            if ((i10 & 8) != 0) {
                i5 = exceptionTraceElement.line;
            }
            return exceptionTraceElement.copy(str, str2, str3, i5);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getClassName() {
            return this.className;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getFileName() {
            return this.fileName;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getMethodName() {
            return this.methodName;
        }

        /* renamed from: component4, reason: from getter */
        public final int getLine() {
            return this.line;
        }

        @NotNull
        public final ExceptionTraceElement copy(@InterfaceC2812o(name = "class") @NotNull String className, @InterfaceC2812o(name = "file") @NotNull String fileName, @InterfaceC2812o(name = "method") @NotNull String methodName, @InterfaceC2812o(name = "line") int line) {
            AbstractC3340k.e(className, "className");
            AbstractC3340k.e(fileName, "fileName");
            AbstractC3340k.e(methodName, "methodName");
            return new ExceptionTraceElement(className, fileName, methodName, line);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ExceptionTraceElement)) {
                return false;
            }
            ExceptionTraceElement exceptionTraceElement = (ExceptionTraceElement) other;
            return AbstractC3340k.a(this.className, exceptionTraceElement.className) && AbstractC3340k.a(this.fileName, exceptionTraceElement.fileName) && AbstractC3340k.a(this.methodName, exceptionTraceElement.methodName) && this.line == exceptionTraceElement.line;
        }

        @NotNull
        public final String getClassName() {
            return this.className;
        }

        @NotNull
        public final String getFileName() {
            return this.fileName;
        }

        public final int getLine() {
            return this.line;
        }

        @NotNull
        public final String getMethodName() {
            return this.methodName;
        }

        public int hashCode() {
            return a.c(a.c(this.className.hashCode() * 31, 31, this.fileName), 31, this.methodName) + this.line;
        }

        @NotNull
        public String toString() {
            String str = this.className;
            String str2 = this.fileName;
            String str3 = this.methodName;
            int i5 = this.line;
            StringBuilder sbR = AbstractC0279p0.r("ExceptionTraceElement(className=", str, ", fileName=", str2, ", methodName=");
            sbR.append(str3);
            sbR.append(", line=");
            sbR.append(i5);
            sbR.append(")");
            return sbR.toString();
        }
    }

    public CrashRequest(@InterfaceC2812o(name = "exception") @NotNull ExceptionInfo log, @InterfaceC2812o(name = "device") @NotNull DeviceInfo deviceInfo) {
        AbstractC3340k.e(log, "log");
        AbstractC3340k.e(deviceInfo, "deviceInfo");
        this.log = log;
        this.deviceInfo = deviceInfo;
    }

    public static /* synthetic */ CrashRequest copy$default(CrashRequest crashRequest, ExceptionInfo exceptionInfo, DeviceInfo deviceInfo, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            exceptionInfo = crashRequest.log;
        }
        if ((i5 & 2) != 0) {
            deviceInfo = crashRequest.deviceInfo;
        }
        return crashRequest.copy(exceptionInfo, deviceInfo);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ExceptionInfo getLog() {
        return this.log;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final DeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    @NotNull
    public final CrashRequest copy(@InterfaceC2812o(name = "exception") @NotNull ExceptionInfo log, @InterfaceC2812o(name = "device") @NotNull DeviceInfo deviceInfo) {
        AbstractC3340k.e(log, "log");
        AbstractC3340k.e(deviceInfo, "deviceInfo");
        return new CrashRequest(log, deviceInfo);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CrashRequest)) {
            return false;
        }
        CrashRequest crashRequest = (CrashRequest) other;
        return AbstractC3340k.a(this.log, crashRequest.log) && AbstractC3340k.a(this.deviceInfo, crashRequest.deviceInfo);
    }

    @NotNull
    public final DeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    @NotNull
    public final ExceptionInfo getLog() {
        return this.log;
    }

    public int hashCode() {
        return this.deviceInfo.hashCode() + (this.log.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "CrashRequest(log=" + this.log + ", deviceInfo=" + this.deviceInfo + ")";
    }
}
