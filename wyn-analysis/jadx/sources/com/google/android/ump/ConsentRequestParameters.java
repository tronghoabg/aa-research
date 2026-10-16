package com.google.android.ump;

import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;

/* loaded from: classes4.dex */
public class ConsentRequestParameters {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f27268a;

    /* renamed from: b, reason: collision with root package name */
    public final String f27269b;

    /* renamed from: c, reason: collision with root package name */
    public final ConsentDebugSettings f27270c;

    /* renamed from: d, reason: collision with root package name */
    public final String f27271d;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public boolean f27272a;

        /* renamed from: b, reason: collision with root package name */
        public String f27273b;

        /* renamed from: c, reason: collision with root package name */
        public ConsentDebugSettings f27274c;

        /* renamed from: d, reason: collision with root package name */
        public String f27275d;

        @RecentlyNonNull
        public ConsentRequestParameters build() {
            return new ConsentRequestParameters(this);
        }

        @RecentlyNonNull
        public Builder setAdMobAppId(String str) {
            this.f27273b = str;
            return this;
        }

        @RecentlyNonNull
        public Builder setConsentDebugSettings(ConsentDebugSettings consentDebugSettings) {
            this.f27274c = consentDebugSettings;
            return this;
        }

        @RecentlyNonNull
        public Builder setConsentSyncId(@RecentlyNonNull String str) {
            if (str == null) {
                str = null;
            } else if (!str.matches("^[0-9a-zA-Z+.=\\/_,$\\-{}]{22,150}$")) {
                Log.e("UserMessagingPlatform", "The UMP SDK requires a valid consent sync ID matching the following regex: ^[0-9a-zA-Z+.=\\/_,$\\-{}]{22,150}$. See the setConsentSyncId() API documentation for more details.");
                return this;
            }
            this.f27275d = str;
            return this;
        }

        @RecentlyNonNull
        public Builder setTagForUnderAgeOfConsent(boolean z2) {
            this.f27272a = z2;
            return this;
        }
    }

    public /* synthetic */ ConsentRequestParameters(Builder builder) {
        this.f27268a = builder.f27272a;
        this.f27269b = builder.f27273b;
        this.f27270c = builder.f27274c;
        this.f27271d = builder.f27275d;
    }

    @RecentlyNullable
    public ConsentDebugSettings getConsentDebugSettings() {
        return this.f27270c;
    }

    @RecentlyNullable
    public String getConsentSyncId() {
        return this.f27271d;
    }

    public boolean isTagForUnderAgeOfConsent() {
        return this.f27268a;
    }

    @RecentlyNullable
    public final String zza() {
        return this.f27269b;
    }
}
