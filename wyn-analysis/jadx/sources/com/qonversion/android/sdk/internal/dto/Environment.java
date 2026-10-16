package com.qonversion.android.sdk.internal.dto;

import A7.AbstractC0279p0;
import N0.a;
import com.applovin.shadow.okio.Segment;
import hb.InterfaceC2812o;
import hb.s;
import ka.AbstractC3256n;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@s(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b'\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u007f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0001\u0010\b\u001a\u00020\u0003\u0012\b\b\u0001\u0010\t\u001a\u00020\u0003\u0012\b\b\u0001\u0010\n\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0001\u0010\f\u001a\u00020\u0003\u0012\b\b\u0001\u0010\r\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\u0083\u0001\u0010)\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0003\u0010\u0007\u001a\u00020\u00032\b\b\u0003\u0010\b\u001a\u00020\u00032\b\b\u0003\u0010\t\u001a\u00020\u00032\b\b\u0003\u0010\n\u001a\u00020\u00032\b\b\u0003\u0010\u000b\u001a\u00020\u00032\b\b\u0003\u0010\f\u001a\u00020\u00032\b\b\u0003\u0010\r\u001a\u00020\u00032\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020.HÖ\u0001J\t\u0010/\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0011¨\u00060"}, d2 = {"Lcom/qonversion/android/sdk/internal/dto/Environment;", "", "app_version", "", "carrier", "deviceId", "locale", "manufacturer", "model", "os", "osVersion", "timezone", "platform", "country", "advertiserId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAdvertiserId", "()Ljava/lang/String;", "getApp_version", "getCarrier", "getCountry", "getDeviceId", "getLocale", "getManufacturer", "getModel", "getOs", "getOsVersion", "getPlatform", "getTimezone", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class Environment {

    @Nullable
    private final String advertiserId;

    @NotNull
    private final String app_version;

    @NotNull
    private final String carrier;

    @NotNull
    private final String country;

    @NotNull
    private final String deviceId;

    @NotNull
    private final String locale;

    @NotNull
    private final String manufacturer;

    @NotNull
    private final String model;

    @NotNull
    private final String os;

    @NotNull
    private final String osVersion;

    @NotNull
    private final String platform;

    @NotNull
    private final String timezone;

    public Environment(@InterfaceC2812o(name = "app_version") @NotNull String app_version, @InterfaceC2812o(name = "carrier") @NotNull String carrier, @InterfaceC2812o(name = "device_id") @NotNull String deviceId, @InterfaceC2812o(name = "locale") @NotNull String locale, @InterfaceC2812o(name = "manufacturer") @NotNull String manufacturer, @InterfaceC2812o(name = "model") @NotNull String model, @InterfaceC2812o(name = "os") @NotNull String os, @InterfaceC2812o(name = "os_version") @NotNull String osVersion, @InterfaceC2812o(name = "timezone") @NotNull String timezone, @InterfaceC2812o(name = "platform") @NotNull String platform, @InterfaceC2812o(name = "country") @NotNull String country, @InterfaceC2812o(name = "advertiser_id") @Nullable String str) {
        AbstractC3340k.e(app_version, "app_version");
        AbstractC3340k.e(carrier, "carrier");
        AbstractC3340k.e(deviceId, "deviceId");
        AbstractC3340k.e(locale, "locale");
        AbstractC3340k.e(manufacturer, "manufacturer");
        AbstractC3340k.e(model, "model");
        AbstractC3340k.e(os, "os");
        AbstractC3340k.e(osVersion, "osVersion");
        AbstractC3340k.e(timezone, "timezone");
        AbstractC3340k.e(platform, "platform");
        AbstractC3340k.e(country, "country");
        this.app_version = app_version;
        this.carrier = carrier;
        this.deviceId = deviceId;
        this.locale = locale;
        this.manufacturer = manufacturer;
        this.model = model;
        this.os = os;
        this.osVersion = osVersion;
        this.timezone = timezone;
        this.platform = platform;
        this.country = country;
        this.advertiserId = str;
    }

    public static /* synthetic */ Environment copy$default(Environment environment, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = environment.app_version;
        }
        if ((i5 & 2) != 0) {
            str2 = environment.carrier;
        }
        if ((i5 & 4) != 0) {
            str3 = environment.deviceId;
        }
        if ((i5 & 8) != 0) {
            str4 = environment.locale;
        }
        if ((i5 & 16) != 0) {
            str5 = environment.manufacturer;
        }
        if ((i5 & 32) != 0) {
            str6 = environment.model;
        }
        if ((i5 & 64) != 0) {
            str7 = environment.os;
        }
        if ((i5 & 128) != 0) {
            str8 = environment.osVersion;
        }
        if ((i5 & 256) != 0) {
            str9 = environment.timezone;
        }
        if ((i5 & 512) != 0) {
            str10 = environment.platform;
        }
        if ((i5 & Segment.SHARE_MINIMUM) != 0) {
            str11 = environment.country;
        }
        if ((i5 & 2048) != 0) {
            str12 = environment.advertiserId;
        }
        String str13 = str11;
        String str14 = str12;
        String str15 = str9;
        String str16 = str10;
        String str17 = str7;
        String str18 = str8;
        String str19 = str5;
        String str20 = str6;
        return environment.copy(str, str2, str3, str4, str19, str20, str17, str18, str15, str16, str13, str14);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getApp_version() {
        return this.app_version;
    }

    @NotNull
    /* renamed from: component10, reason: from getter */
    public final String getPlatform() {
        return this.platform;
    }

    @NotNull
    /* renamed from: component11, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final String getAdvertiserId() {
        return this.advertiserId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getCarrier() {
        return this.carrier;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getLocale() {
        return this.locale;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getManufacturer() {
        return this.manufacturer;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final String getOs() {
        return this.os;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final String getOsVersion() {
        return this.osVersion;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final String getTimezone() {
        return this.timezone;
    }

    @NotNull
    public final Environment copy(@InterfaceC2812o(name = "app_version") @NotNull String app_version, @InterfaceC2812o(name = "carrier") @NotNull String carrier, @InterfaceC2812o(name = "device_id") @NotNull String deviceId, @InterfaceC2812o(name = "locale") @NotNull String locale, @InterfaceC2812o(name = "manufacturer") @NotNull String manufacturer, @InterfaceC2812o(name = "model") @NotNull String model, @InterfaceC2812o(name = "os") @NotNull String os, @InterfaceC2812o(name = "os_version") @NotNull String osVersion, @InterfaceC2812o(name = "timezone") @NotNull String timezone, @InterfaceC2812o(name = "platform") @NotNull String platform, @InterfaceC2812o(name = "country") @NotNull String country, @InterfaceC2812o(name = "advertiser_id") @Nullable String advertiserId) {
        AbstractC3340k.e(app_version, "app_version");
        AbstractC3340k.e(carrier, "carrier");
        AbstractC3340k.e(deviceId, "deviceId");
        AbstractC3340k.e(locale, "locale");
        AbstractC3340k.e(manufacturer, "manufacturer");
        AbstractC3340k.e(model, "model");
        AbstractC3340k.e(os, "os");
        AbstractC3340k.e(osVersion, "osVersion");
        AbstractC3340k.e(timezone, "timezone");
        AbstractC3340k.e(platform, "platform");
        AbstractC3340k.e(country, "country");
        return new Environment(app_version, carrier, deviceId, locale, manufacturer, model, os, osVersion, timezone, platform, country, advertiserId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Environment)) {
            return false;
        }
        Environment environment = (Environment) other;
        return AbstractC3340k.a(this.app_version, environment.app_version) && AbstractC3340k.a(this.carrier, environment.carrier) && AbstractC3340k.a(this.deviceId, environment.deviceId) && AbstractC3340k.a(this.locale, environment.locale) && AbstractC3340k.a(this.manufacturer, environment.manufacturer) && AbstractC3340k.a(this.model, environment.model) && AbstractC3340k.a(this.os, environment.os) && AbstractC3340k.a(this.osVersion, environment.osVersion) && AbstractC3340k.a(this.timezone, environment.timezone) && AbstractC3340k.a(this.platform, environment.platform) && AbstractC3340k.a(this.country, environment.country) && AbstractC3340k.a(this.advertiserId, environment.advertiserId);
    }

    @Nullable
    public final String getAdvertiserId() {
        return this.advertiserId;
    }

    @NotNull
    public final String getApp_version() {
        return this.app_version;
    }

    @NotNull
    public final String getCarrier() {
        return this.carrier;
    }

    @NotNull
    public final String getCountry() {
        return this.country;
    }

    @NotNull
    public final String getDeviceId() {
        return this.deviceId;
    }

    @NotNull
    public final String getLocale() {
        return this.locale;
    }

    @NotNull
    public final String getManufacturer() {
        return this.manufacturer;
    }

    @NotNull
    public final String getModel() {
        return this.model;
    }

    @NotNull
    public final String getOs() {
        return this.os;
    }

    @NotNull
    public final String getOsVersion() {
        return this.osVersion;
    }

    @NotNull
    public final String getPlatform() {
        return this.platform;
    }

    @NotNull
    public final String getTimezone() {
        return this.timezone;
    }

    public int hashCode() {
        int iC = a.c(a.c(a.c(a.c(a.c(a.c(a.c(a.c(a.c(a.c(this.app_version.hashCode() * 31, 31, this.carrier), 31, this.deviceId), 31, this.locale), 31, this.manufacturer), 31, this.model), 31, this.os), 31, this.osVersion), 31, this.timezone), 31, this.platform), 31, this.country);
        String str = this.advertiserId;
        return iC + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        String str = this.app_version;
        String str2 = this.carrier;
        String str3 = this.deviceId;
        String str4 = this.locale;
        String str5 = this.manufacturer;
        String str6 = this.model;
        String str7 = this.os;
        String str8 = this.osVersion;
        String str9 = this.timezone;
        String str10 = this.platform;
        String str11 = this.country;
        String str12 = this.advertiserId;
        StringBuilder sbR = AbstractC0279p0.r("Environment(app_version=", str, ", carrier=", str2, ", deviceId=");
        AbstractC3256n.p(sbR, str3, ", locale=", str4, ", manufacturer=");
        AbstractC3256n.p(sbR, str5, ", model=", str6, ", os=");
        AbstractC3256n.p(sbR, str7, ", osVersion=", str8, ", timezone=");
        AbstractC3256n.p(sbR, str9, ", platform=", str10, ", country=");
        return AbstractC3256n.h(sbR, str11, ", advertiserId=", str12, ")");
    }
}
