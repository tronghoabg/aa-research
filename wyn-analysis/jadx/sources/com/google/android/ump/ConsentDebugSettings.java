package com.google.android.ump;

import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.internal.consent_sdk.zzct;
import com.google.android.gms.internal.consent_sdk.zzdb;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public class ConsentDebugSettings {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f27261a;

    /* renamed from: b, reason: collision with root package name */
    public final int f27262b;

    public static class Builder {

        /* renamed from: b, reason: collision with root package name */
        public final Context f27264b;

        /* renamed from: d, reason: collision with root package name */
        public boolean f27266d;

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f27263a = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        public int f27265c = 0;

        public Builder(@RecentlyNonNull Context context) {
            this.f27264b = context.getApplicationContext();
        }

        @RecentlyNonNull
        public Builder addTestDeviceHashedId(@RecentlyNonNull String str) {
            this.f27263a.add(str);
            return this;
        }

        @RecentlyNonNull
        public ConsentDebugSettings build() {
            boolean z2 = true;
            if (!zzdb.zza(true) && !this.f27263a.contains(zzct.zza(this.f27264b)) && !this.f27266d) {
                z2 = false;
            }
            return new ConsentDebugSettings(z2, this);
        }

        @RecentlyNonNull
        public Builder setDebugGeography(int i5) {
            this.f27265c = i5;
            return this;
        }

        @RecentlyNonNull
        public Builder setForceTesting(boolean z2) {
            this.f27266d = z2;
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface DebugGeography {
        public static final int DEBUG_GEOGRAPHY_DISABLED = 0;
        public static final int DEBUG_GEOGRAPHY_EEA = 1;

        @Deprecated
        public static final int DEBUG_GEOGRAPHY_NOT_EEA = 2;
        public static final int DEBUG_GEOGRAPHY_OTHER = 4;
        public static final int DEBUG_GEOGRAPHY_REGULATED_US_STATE = 3;
    }

    public /* synthetic */ ConsentDebugSettings(boolean z2, Builder builder) {
        this.f27261a = z2;
        this.f27262b = builder.f27265c;
    }

    public int getDebugGeography() {
        return this.f27262b;
    }

    public boolean isTestDevice() {
        return this.f27261a;
    }
}
