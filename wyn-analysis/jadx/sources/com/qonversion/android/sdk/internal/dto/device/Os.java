package com.qonversion.android.sdk.internal.dto.device;

import R8.v;
import android.os.Build;
import com.unity3d.ads.metadata.MediationMetaData;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge;
import hb.InterfaceC2812o;
import hb.s;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@s(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/qonversion/android/sdk/internal/dto/device/Os;", "", MediationMetaData.KEY_NAME, "", "version", "(Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", MobileAdsBridge.versionMethodName, "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class Os {

    @NotNull
    private final String name;

    @NotNull
    private final String version;

    /* JADX WARN: Multi-variable type inference failed */
    public Os() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ Os copy$default(Os os, String str, String str2, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = os.name;
        }
        if ((i5 & 2) != 0) {
            str2 = os.version;
        }
        return os.copy(str, str2);
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
    public final Os copy(@InterfaceC2812o(name = MediationMetaData.KEY_NAME) @NotNull String name, @InterfaceC2812o(name = "version") @NotNull String version) {
        AbstractC3340k.e(name, "name");
        AbstractC3340k.e(version, "version");
        return new Os(name, version);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Os)) {
            return false;
        }
        Os os = (Os) other;
        return AbstractC3340k.a(this.name, os.name) && AbstractC3340k.a(this.version, os.version);
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
        return this.version.hashCode() + (this.name.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return v.g("Os(name=", this.name, ", version=", this.version, ")");
    }

    public Os(@InterfaceC2812o(name = MediationMetaData.KEY_NAME) @NotNull String name, @InterfaceC2812o(name = "version") @NotNull String version) {
        AbstractC3340k.e(name, "name");
        AbstractC3340k.e(version, "version");
        this.name = name;
        this.version = version;
    }

    public /* synthetic */ Os(String str, String str2, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? "Android" : str, (i5 & 2) != 0 ? String.valueOf(Build.VERSION.SDK_INT) : str2);
    }
}
