package com.waze.sharedui.profile;

import h.g.b.x;
import java.io.Serializable;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ProfileSocialInfo implements Serializable {
    private final String imageUrl;
    private final int moodId;

    public ProfileSocialInfo(String str, int i2) {
        x.f(str, "imageUrl");
        this.imageUrl = str;
        this.moodId = i2;
    }

    public static /* synthetic */ ProfileSocialInfo copy$default(ProfileSocialInfo profileSocialInfo, String str, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = profileSocialInfo.imageUrl;
        }
        if ((i3 & 2) != 0) {
            i2 = profileSocialInfo.moodId;
        }
        return profileSocialInfo.copy(str, i2);
    }

    public final String component1() {
        return this.imageUrl;
    }

    public final int component2() {
        return this.moodId;
    }

    public final ProfileSocialInfo copy(String str, int i2) {
        x.f(str, "imageUrl");
        return new ProfileSocialInfo(str, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileSocialInfo)) {
            return false;
        }
        ProfileSocialInfo profileSocialInfo = (ProfileSocialInfo) obj;
        return x.n(this.imageUrl, profileSocialInfo.imageUrl) && this.moodId == profileSocialInfo.moodId;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final int getMoodId() {
        return this.moodId;
    }

    public int hashCode() {
        return (this.imageUrl.hashCode() * 31) + this.moodId;
    }

    public String toString() {
        return "ProfileSocialInfo(imageUrl=" + this.imageUrl + ", moodId=" + this.moodId + ")";
    }
}
