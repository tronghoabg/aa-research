package androidx.car.app.navigation.model;

import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.annotations.RequiresCarApi;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: WazeSource */
@CarProtocol
@RequiresCarApi(9)
/* loaded from: classes2.dex */
public final class NavigationVoiceAssistantCapabilities {
    public static final int ACTION_ALLOW_AND_AVOID_FERRIES = 1;
    public static final int ACTION_ALLOW_AND_AVOID_HIGHWAYS = 2;
    public static final int ACTION_ALLOW_AND_AVOID_TOLLS = 3;
    public static final int ACTION_CLEAR_SEARCH_RESULTS = 4;
    public static final int ACTION_EXIT_NAVIGATION = 5;
    public static final int ACTION_FOLLOW_MODE = 6;
    public static final int ACTION_MUTE_AND_UNMUTE = 7;
    public static final int ACTION_ROUTE_OVERVIEW = 8;
    public static final int ACTION_SHOW_ALTERNATES = 9;
    public static final int ACTION_SHOW_DIRECTIONS_LIST = 10;
    public static final int ACTION_SHOW_SATELLITE = 11;
    public static final int ACTION_SHOW_TRAFFIC = 12;
    public static final int ACTION_UNDEFINED = 0;
    public static final int DISRUPTION_REPORT_CONSTRUCTION = 1;
    public static final int DISRUPTION_REPORT_CRASH = 2;
    public static final int DISRUPTION_REPORT_FLOODING = 3;
    public static final int DISRUPTION_REPORT_FOG = 4;
    public static final int DISRUPTION_REPORT_OBJECT_ON_ROAD = 5;
    public static final int DISRUPTION_REPORT_POLICE = 6;
    public static final int DISRUPTION_REPORT_POTHOLE = 7;
    public static final int DISRUPTION_REPORT_ROAD_CLOSURE = 8;
    public static final int DISRUPTION_REPORT_SNOW = 9;
    public static final int DISRUPTION_REPORT_TRAFFIC = 10;
    public static final int DISRUPTION_REPORT_UNDEFINED = 0;
    public static final int DISRUPTION_REPORT_VEHICLE = 11;
    private final boolean mIsVoiceAssistantConsentGranted;
    private final Set<Integer> mSupportedActions;
    private final Set<Integer> mSupportedDisruptions;

    /* compiled from: WazeSource */
    public final class Builder {
        boolean mIsVoiceAssistantConsentGranted;
        final Set<Integer> mSupportedActions = new HashSet();
        final Set<Integer> mSupportedDisruptions = new HashSet();

        public Builder addSupportedAction(int i2) {
            this.mSupportedActions.add(Integer.valueOf(i2));
            return this;
        }

        public Builder addSupportedDisruption(int i2) {
            this.mSupportedDisruptions.add(Integer.valueOf(i2));
            return this;
        }

        public NavigationVoiceAssistantCapabilities build() {
            return new NavigationVoiceAssistantCapabilities(this);
        }

        public Builder setVoiceAssistantConsentGranted(boolean z) {
            this.mIsVoiceAssistantConsentGranted = z;
            return this;
        }
    }

    /* compiled from: WazeSource */
    @Retention(RetentionPolicy.SOURCE)
    public @interface VoiceAssistantAction {
    }

    /* compiled from: WazeSource */
    @Retention(RetentionPolicy.SOURCE)
    public @interface VoiceAssistantDisruption {
    }

    private NavigationVoiceAssistantCapabilities(Builder builder) {
        this.mIsVoiceAssistantConsentGranted = builder.mIsVoiceAssistantConsentGranted;
        this.mSupportedActions = DesugarCollections.unmodifiableSet(new HashSet(builder.mSupportedActions));
        this.mSupportedDisruptions = DesugarCollections.unmodifiableSet(new HashSet(builder.mSupportedDisruptions));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NavigationVoiceAssistantCapabilities)) {
            return false;
        }
        NavigationVoiceAssistantCapabilities navigationVoiceAssistantCapabilities = (NavigationVoiceAssistantCapabilities) obj;
        return this.mIsVoiceAssistantConsentGranted == navigationVoiceAssistantCapabilities.mIsVoiceAssistantConsentGranted && Objects.equals(this.mSupportedActions, navigationVoiceAssistantCapabilities.mSupportedActions) && Objects.equals(this.mSupportedDisruptions, navigationVoiceAssistantCapabilities.mSupportedDisruptions);
    }

    public Set<Integer> getSupportedActions() {
        return this.mSupportedActions;
    }

    public Set<Integer> getSupportedDisruptions() {
        return this.mSupportedDisruptions;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.mIsVoiceAssistantConsentGranted), this.mSupportedActions, this.mSupportedDisruptions);
    }

    public boolean isVoiceAssistantConsentGranted() {
        return this.mIsVoiceAssistantConsentGranted;
    }

    public String toString() {
        return "NavigationVoiceAssistantCapabilities[ isVoiceAssistantConsentGranted: " + this.mIsVoiceAssistantConsentGranted + ", supportedActions: " + this.mSupportedActions + ", supportedDisruptions: " + this.mSupportedDisruptions + " ]";
    }

    private NavigationVoiceAssistantCapabilities() {
        this.mIsVoiceAssistantConsentGranted = false;
        this.mSupportedActions = Collections.EMPTY_SET;
        this.mSupportedDisruptions = Collections.EMPTY_SET;
    }
}
