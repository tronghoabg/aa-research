package com.google.android.libraries.assistant.appintegration;

import com.google.android.libraries.assistant.appintegration.AutoValue_StartupConfigs;
import com.google.d.b.aa;
import com.google.v.v;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class StartupConfigs {

    /* compiled from: WazeSource */
    public abstract class Builder {
        public abstract StartupConfigs build();

        public abstract Builder setClientInput(v vVar);

        public abstract Builder setCustomizedSource(int i2);

        public abstract Builder setExpandToFullScreen(boolean z);

        public abstract Builder setFulfillmentPlateHeightCap(int i2);

        @Deprecated
        public abstract Builder setInputModality(int i2);

        abstract Builder setMicClickedTimeNs(long j2);

        public abstract Builder setProactiveModeEnabled(boolean z);

        public abstract Builder setQueryString(String str);

        public abstract Builder setSuppressTtsForTextQueries(boolean z);
    }

    public static Builder builder() {
        AutoValue_StartupConfigs.Builder builder = new AutoValue_StartupConfigs.Builder();
        builder.setInputModality(1);
        return builder;
    }

    public abstract aa<v> getClientInput();

    public abstract aa<Integer> getCustomizedSource();

    public abstract aa<Boolean> getExpandToFullScreen();

    public abstract aa<Integer> getFulfillmentPlateHeightCap();

    @Deprecated
    public abstract int getInputModality();

    abstract aa<Long> getMicClickedTimeNs();

    public abstract aa<Boolean> getProactiveModeEnabled();

    public abstract aa<String> getQueryString();

    public abstract aa<Boolean> getSuppressTtsForTextQueries();

    public abstract Builder toBuilder();
}
