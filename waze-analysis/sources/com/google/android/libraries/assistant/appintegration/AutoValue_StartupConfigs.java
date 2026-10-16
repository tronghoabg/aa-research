package com.google.android.libraries.assistant.appintegration;

import com.google.android.libraries.assistant.appintegration.StartupConfigs;
import com.google.d.b.aa;
import com.google.v.v;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class AutoValue_StartupConfigs extends StartupConfigs {
    private final aa<v> clientInput;
    private final aa<Integer> customizedSource;
    private final aa<Boolean> expandToFullScreen;
    private final aa<Integer> fulfillmentPlateHeightCap;
    private final int inputModality;
    private final aa<Long> micClickedTimeNs;
    private final aa<Boolean> proactiveModeEnabled;
    private final aa<String> queryString;
    private final aa<Boolean> suppressTtsForTextQueries;

    private AutoValue_StartupConfigs(aa<String> aaVar, aa<Boolean> aaVar2, aa<Boolean> aaVar3, aa<Integer> aaVar4, aa<v> aaVar5, aa<Integer> aaVar6, int i2, aa<Boolean> aaVar7, aa<Long> aaVar8) {
        this.queryString = aaVar;
        this.proactiveModeEnabled = aaVar2;
        this.suppressTtsForTextQueries = aaVar3;
        this.fulfillmentPlateHeightCap = aaVar4;
        this.clientInput = aaVar5;
        this.customizedSource = aaVar6;
        this.inputModality = i2;
        this.expandToFullScreen = aaVar7;
        this.micClickedTimeNs = aaVar8;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof StartupConfigs) {
            StartupConfigs startupConfigs = (StartupConfigs) obj;
            if (this.queryString.equals(startupConfigs.getQueryString()) && this.proactiveModeEnabled.equals(startupConfigs.getProactiveModeEnabled()) && this.suppressTtsForTextQueries.equals(startupConfigs.getSuppressTtsForTextQueries()) && this.fulfillmentPlateHeightCap.equals(startupConfigs.getFulfillmentPlateHeightCap()) && this.clientInput.equals(startupConfigs.getClientInput()) && this.customizedSource.equals(startupConfigs.getCustomizedSource()) && this.inputModality == startupConfigs.getInputModality() && this.expandToFullScreen.equals(startupConfigs.getExpandToFullScreen()) && this.micClickedTimeNs.equals(startupConfigs.getMicClickedTimeNs())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.assistant.appintegration.StartupConfigs
    public aa<v> getClientInput() {
        return this.clientInput;
    }

    @Override // com.google.android.libraries.assistant.appintegration.StartupConfigs
    public aa<Integer> getCustomizedSource() {
        return this.customizedSource;
    }

    @Override // com.google.android.libraries.assistant.appintegration.StartupConfigs
    public aa<Boolean> getExpandToFullScreen() {
        return this.expandToFullScreen;
    }

    @Override // com.google.android.libraries.assistant.appintegration.StartupConfigs
    public aa<Integer> getFulfillmentPlateHeightCap() {
        return this.fulfillmentPlateHeightCap;
    }

    @Override // com.google.android.libraries.assistant.appintegration.StartupConfigs
    @Deprecated
    public int getInputModality() {
        return this.inputModality;
    }

    @Override // com.google.android.libraries.assistant.appintegration.StartupConfigs
    aa<Long> getMicClickedTimeNs() {
        return this.micClickedTimeNs;
    }

    @Override // com.google.android.libraries.assistant.appintegration.StartupConfigs
    public aa<Boolean> getProactiveModeEnabled() {
        return this.proactiveModeEnabled;
    }

    @Override // com.google.android.libraries.assistant.appintegration.StartupConfigs
    public aa<String> getQueryString() {
        return this.queryString;
    }

    @Override // com.google.android.libraries.assistant.appintegration.StartupConfigs
    public aa<Boolean> getSuppressTtsForTextQueries() {
        return this.suppressTtsForTextQueries;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((this.queryString.hashCode() ^ 1000003) * 1000003) ^ this.proactiveModeEnabled.hashCode()) * 1000003) ^ this.suppressTtsForTextQueries.hashCode()) * 1000003) ^ this.fulfillmentPlateHeightCap.hashCode()) * 1000003) ^ this.clientInput.hashCode()) * 1000003) ^ this.customizedSource.hashCode()) * 1000003) ^ this.inputModality) * 1000003) ^ this.expandToFullScreen.hashCode();
        return this.micClickedTimeNs.hashCode() ^ (iHashCode * 1000003);
    }

    @Override // com.google.android.libraries.assistant.appintegration.StartupConfigs
    public StartupConfigs.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        aa<Long> aaVar = this.micClickedTimeNs;
        aa<Boolean> aaVar2 = this.expandToFullScreen;
        aa<Integer> aaVar3 = this.customizedSource;
        aa<v> aaVar4 = this.clientInput;
        aa<Integer> aaVar5 = this.fulfillmentPlateHeightCap;
        aa<Boolean> aaVar6 = this.suppressTtsForTextQueries;
        aa<Boolean> aaVar7 = this.proactiveModeEnabled;
        return "StartupConfigs{queryString=" + String.valueOf(this.queryString) + ", proactiveModeEnabled=" + String.valueOf(aaVar7) + ", suppressTtsForTextQueries=" + String.valueOf(aaVar6) + ", fulfillmentPlateHeightCap=" + String.valueOf(aaVar5) + ", clientInput=" + String.valueOf(aaVar4) + ", customizedSource=" + String.valueOf(aaVar3) + ", inputModality=" + this.inputModality + ", expandToFullScreen=" + String.valueOf(aaVar2) + ", micClickedTimeNs=" + String.valueOf(aaVar) + "}";
    }

    /* compiled from: WazeSource */
    final class Builder extends StartupConfigs.Builder {
        private aa<v> clientInput;
        private aa<Integer> customizedSource;
        private aa<Boolean> expandToFullScreen;
        private aa<Integer> fulfillmentPlateHeightCap;
        private int inputModality;
        private aa<Long> micClickedTimeNs;
        private aa<Boolean> proactiveModeEnabled;
        private aa<String> queryString;
        private byte set$0;
        private aa<Boolean> suppressTtsForTextQueries;

        Builder(StartupConfigs startupConfigs) {
            this.queryString = aa.g();
            this.proactiveModeEnabled = aa.g();
            this.suppressTtsForTextQueries = aa.g();
            this.fulfillmentPlateHeightCap = aa.g();
            this.clientInput = aa.g();
            this.customizedSource = aa.g();
            this.expandToFullScreen = aa.g();
            this.micClickedTimeNs = aa.g();
            this.queryString = startupConfigs.getQueryString();
            this.proactiveModeEnabled = startupConfigs.getProactiveModeEnabled();
            this.suppressTtsForTextQueries = startupConfigs.getSuppressTtsForTextQueries();
            this.fulfillmentPlateHeightCap = startupConfigs.getFulfillmentPlateHeightCap();
            this.clientInput = startupConfigs.getClientInput();
            this.customizedSource = startupConfigs.getCustomizedSource();
            this.inputModality = startupConfigs.getInputModality();
            this.expandToFullScreen = startupConfigs.getExpandToFullScreen();
            this.micClickedTimeNs = startupConfigs.getMicClickedTimeNs();
            this.set$0 = (byte) 1;
        }

        @Override // com.google.android.libraries.assistant.appintegration.StartupConfigs.Builder
        public StartupConfigs build() {
            if (this.set$0 == 1) {
                return new AutoValue_StartupConfigs(this.queryString, this.proactiveModeEnabled, this.suppressTtsForTextQueries, this.fulfillmentPlateHeightCap, this.clientInput, this.customizedSource, this.inputModality, this.expandToFullScreen, this.micClickedTimeNs);
            }
            throw new IllegalStateException("Missing required properties: inputModality");
        }

        @Override // com.google.android.libraries.assistant.appintegration.StartupConfigs.Builder
        public StartupConfigs.Builder setClientInput(v vVar) {
            this.clientInput = aa.i(vVar);
            return this;
        }

        @Override // com.google.android.libraries.assistant.appintegration.StartupConfigs.Builder
        public StartupConfigs.Builder setCustomizedSource(int i2) {
            this.customizedSource = aa.i(Integer.valueOf(i2));
            return this;
        }

        @Override // com.google.android.libraries.assistant.appintegration.StartupConfigs.Builder
        public StartupConfigs.Builder setExpandToFullScreen(boolean z) {
            this.expandToFullScreen = aa.i(Boolean.valueOf(z));
            return this;
        }

        @Override // com.google.android.libraries.assistant.appintegration.StartupConfigs.Builder
        public StartupConfigs.Builder setFulfillmentPlateHeightCap(int i2) {
            this.fulfillmentPlateHeightCap = aa.i(Integer.valueOf(i2));
            return this;
        }

        @Override // com.google.android.libraries.assistant.appintegration.StartupConfigs.Builder
        public StartupConfigs.Builder setInputModality(int i2) {
            this.inputModality = i2;
            this.set$0 = (byte) (this.set$0 | 1);
            return this;
        }

        @Override // com.google.android.libraries.assistant.appintegration.StartupConfigs.Builder
        StartupConfigs.Builder setMicClickedTimeNs(long j2) {
            this.micClickedTimeNs = aa.i(Long.valueOf(j2));
            return this;
        }

        @Override // com.google.android.libraries.assistant.appintegration.StartupConfigs.Builder
        public StartupConfigs.Builder setProactiveModeEnabled(boolean z) {
            this.proactiveModeEnabled = aa.i(Boolean.valueOf(z));
            return this;
        }

        @Override // com.google.android.libraries.assistant.appintegration.StartupConfigs.Builder
        public StartupConfigs.Builder setQueryString(String str) {
            this.queryString = aa.i(str);
            return this;
        }

        @Override // com.google.android.libraries.assistant.appintegration.StartupConfigs.Builder
        public StartupConfigs.Builder setSuppressTtsForTextQueries(boolean z) {
            this.suppressTtsForTextQueries = aa.i(Boolean.valueOf(z));
            return this;
        }

        Builder() {
            this.queryString = aa.g();
            this.proactiveModeEnabled = aa.g();
            this.suppressTtsForTextQueries = aa.g();
            this.fulfillmentPlateHeightCap = aa.g();
            this.clientInput = aa.g();
            this.customizedSource = aa.g();
            this.expandToFullScreen = aa.g();
            this.micClickedTimeNs = aa.g();
        }
    }
}
