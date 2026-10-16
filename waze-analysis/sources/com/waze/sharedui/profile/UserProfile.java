package com.waze.sharedui.profile;

import androidx.core.app.NotificationCompat;
import h.g.b.x;
import java.io.Serializable;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class UserProfile implements Serializable {
    public static final c Companion = new c();
    public static final long INVALID_USER_ID = 0;
    private final ProfileBasicInfo basicInfo;
    private final ProfilePlaces places;
    private final ProfileSocialInfo socialInfo;
    private final UserProfileSource source;
    private final ProfileStatistics statistics;
    private final ProfileStatus status;
    private final long userId;
    private final String userName;

    public UserProfile(long j2, String str, ProfileBasicInfo profileBasicInfo, ProfileSocialInfo profileSocialInfo, ProfileStatistics profileStatistics, ProfileStatus profileStatus, ProfilePlaces profilePlaces, UserProfileSource userProfileSource) {
        x.f(str, "userName");
        x.f(profileBasicInfo, "basicInfo");
        x.f(profileSocialInfo, "socialInfo");
        x.f(profileStatistics, "statistics");
        x.f(profileStatus, NotificationCompat.CATEGORY_STATUS);
        x.f(profilePlaces, "places");
        x.f(userProfileSource, "source");
        this.userId = j2;
        this.userName = str;
        this.basicInfo = profileBasicInfo;
        this.socialInfo = profileSocialInfo;
        this.statistics = profileStatistics;
        this.status = profileStatus;
        this.places = profilePlaces;
        this.source = userProfileSource;
    }

    public static /* synthetic */ UserProfile copy$default(UserProfile userProfile, long j2, String str, ProfileBasicInfo profileBasicInfo, ProfileSocialInfo profileSocialInfo, ProfileStatistics profileStatistics, ProfileStatus profileStatus, ProfilePlaces profilePlaces, UserProfileSource userProfileSource, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = userProfile.userId;
        }
        long j3 = j2;
        if ((i2 & 2) != 0) {
            str = userProfile.userName;
        }
        String str2 = str;
        if ((i2 & 4) != 0) {
            profileBasicInfo = userProfile.basicInfo;
        }
        ProfileBasicInfo profileBasicInfo2 = profileBasicInfo;
        if ((i2 & 8) != 0) {
            profileSocialInfo = userProfile.socialInfo;
        }
        return userProfile.copy(j3, str2, profileBasicInfo2, profileSocialInfo, (i2 & 16) != 0 ? userProfile.statistics : profileStatistics, (i2 & 32) != 0 ? userProfile.status : profileStatus, (i2 & 64) != 0 ? userProfile.places : profilePlaces, (i2 & 128) != 0 ? userProfile.source : userProfileSource);
    }

    public final long component1() {
        return this.userId;
    }

    public final String component2() {
        return this.userName;
    }

    public final ProfileBasicInfo component3() {
        return this.basicInfo;
    }

    public final ProfileSocialInfo component4() {
        return this.socialInfo;
    }

    public final ProfileStatistics component5() {
        return this.statistics;
    }

    public final ProfileStatus component6() {
        return this.status;
    }

    public final ProfilePlaces component7() {
        return this.places;
    }

    public final UserProfileSource component8() {
        return this.source;
    }

    public final UserProfile copy(long j2, String str, ProfileBasicInfo profileBasicInfo, ProfileSocialInfo profileSocialInfo, ProfileStatistics profileStatistics, ProfileStatus profileStatus, ProfilePlaces profilePlaces, UserProfileSource userProfileSource) {
        x.f(str, "userName");
        x.f(profileBasicInfo, "basicInfo");
        x.f(profileSocialInfo, "socialInfo");
        x.f(profileStatistics, "statistics");
        x.f(profileStatus, NotificationCompat.CATEGORY_STATUS);
        x.f(profilePlaces, "places");
        x.f(userProfileSource, "source");
        return new UserProfile(j2, str, profileBasicInfo, profileSocialInfo, profileStatistics, profileStatus, profilePlaces, userProfileSource);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserProfile)) {
            return false;
        }
        UserProfile userProfile = (UserProfile) obj;
        return this.userId == userProfile.userId && x.n(this.userName, userProfile.userName) && x.n(this.basicInfo, userProfile.basicInfo) && x.n(this.socialInfo, userProfile.socialInfo) && x.n(this.statistics, userProfile.statistics) && x.n(this.status, userProfile.status) && x.n(this.places, userProfile.places) && this.source == userProfile.source;
    }

    public final ProfileBasicInfo getBasicInfo() {
        return this.basicInfo;
    }

    public final ProfilePlaces getPlaces() {
        return this.places;
    }

    public final ProfileSocialInfo getSocialInfo() {
        return this.socialInfo;
    }

    public final UserProfileSource getSource() {
        return this.source;
    }

    public final ProfileStatistics getStatistics() {
        return this.statistics;
    }

    public final ProfileStatus getStatus() {
        return this.status;
    }

    public final long getUserId() {
        return this.userId;
    }

    public final String getUserName() {
        return this.userName;
    }

    public int hashCode() {
        return (((((((((((((a.a.b(this.userId) * 31) + this.userName.hashCode()) * 31) + this.basicInfo.hashCode()) * 31) + this.socialInfo.hashCode()) * 31) + this.statistics.hashCode()) * 31) + this.status.hashCode()) * 31) + this.places.hashCode()) * 31) + this.source.hashCode();
    }

    public final boolean isValid() {
        return this.userId != 0;
    }

    public String toString() {
        return "UserProfile(userId=" + this.userId + ", userName=" + this.userName + ", basicInfo=" + this.basicInfo + ", socialInfo=" + this.socialInfo + ", statistics=" + this.statistics + ", status=" + this.status + ", places=" + this.places + ", source=" + this.source + ")";
    }
}
