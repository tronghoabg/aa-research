package com.qonversion.android.sdk.internal.dto.app;

import A7.AbstractC0279p0;
import N0.a;
import com.unity3d.ads.metadata.MediationMetaData;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge;
import hb.InterfaceC2812o;
import hb.s;
import ka.AbstractC3256n;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@s(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/qonversion/android/sdk/internal/dto/app/App;", "", MediationMetaData.KEY_NAME, "", "version", "build", "bundle", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBuild", "()Ljava/lang/String;", "getBundle", "getName", MobileAdsBridge.versionMethodName, "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class App {

    @NotNull
    private final String build;

    @NotNull
    private final String bundle;

    @NotNull
    private final String name;

    @NotNull
    private final String version;

    public App(@InterfaceC2812o(name = MediationMetaData.KEY_NAME) @NotNull String name, @InterfaceC2812o(name = "version") @NotNull String version, @InterfaceC2812o(name = "build") @NotNull String build, @InterfaceC2812o(name = "bundle") @NotNull String bundle) {
        AbstractC3340k.e(name, "name");
        AbstractC3340k.e(version, "version");
        AbstractC3340k.e(build, "build");
        AbstractC3340k.e(bundle, "bundle");
        this.name = name;
        this.version = version;
        this.build = build;
        this.bundle = bundle;
    }

    public static /* synthetic */ App copy$default(App app, String str, String str2, String str3, String str4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = app.name;
        }
        if ((i5 & 2) != 0) {
            str2 = app.version;
        }
        if ((i5 & 4) != 0) {
            str3 = app.build;
        }
        if ((i5 & 8) != 0) {
            str4 = app.bundle;
        }
        return app.copy(str, str2, str3, str4);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getBuild() {
        return this.build;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getBundle() {
        return this.bundle;
    }

    @NotNull
    public final App copy(@InterfaceC2812o(name = MediationMetaData.KEY_NAME) @NotNull String name, @InterfaceC2812o(name = "version") @NotNull String version, @InterfaceC2812o(name = "build") @NotNull String build, @InterfaceC2812o(name = "bundle") @NotNull String bundle) {
        AbstractC3340k.e(name, "name");
        AbstractC3340k.e(version, "version");
        AbstractC3340k.e(build, "build");
        AbstractC3340k.e(bundle, "bundle");
        return new App(name, version, build, bundle);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof App)) {
            return false;
        }
        App app = (App) other;
        return AbstractC3340k.a(this.name, app.name) && AbstractC3340k.a(this.version, app.version) && AbstractC3340k.a(this.build, app.build) && AbstractC3340k.a(this.bundle, app.bundle);
    }

    @NotNull
    public final String getBuild() {
        return this.build;
    }

    @NotNull
    public final String getBundle() {
        return this.bundle;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return this.bundle.hashCode() + a.c(a.c(this.name.hashCode() * 31, 31, this.version), 31, this.build);
    }

    @NotNull
    public String toString() {
        String str = this.name;
        String str2 = this.version;
        return AbstractC3256n.h(AbstractC0279p0.r("App(name=", str, ", version=", str2, ", build="), this.build, ", bundle=", this.bundle, ")");
    }
}
