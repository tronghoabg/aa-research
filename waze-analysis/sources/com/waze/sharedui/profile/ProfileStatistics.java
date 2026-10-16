package com.waze.sharedui.profile;

import java.io.Serializable;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ProfileStatistics implements Serializable {
    private final long joinDateSec;
    private final long lastLoginSec;

    public ProfileStatistics(long j2, long j3) {
        this.joinDateSec = j2;
        this.lastLoginSec = j3;
    }

    public static /* synthetic */ ProfileStatistics copy$default(ProfileStatistics profileStatistics, long j2, long j3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = profileStatistics.joinDateSec;
        }
        if ((i2 & 2) != 0) {
            j3 = profileStatistics.lastLoginSec;
        }
        return profileStatistics.copy(j2, j3);
    }

    public final long component1() {
        return this.joinDateSec;
    }

    public final long component2() {
        return this.lastLoginSec;
    }

    public final ProfileStatistics copy(long j2, long j3) {
        return new ProfileStatistics(j2, j3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileStatistics)) {
            return false;
        }
        ProfileStatistics profileStatistics = (ProfileStatistics) obj;
        return this.joinDateSec == profileStatistics.joinDateSec && this.lastLoginSec == profileStatistics.lastLoginSec;
    }

    public final long getJoinDateSec() {
        return this.joinDateSec;
    }

    public final long getLastLoginSec() {
        return this.lastLoginSec;
    }

    public int hashCode() {
        return (a.a.b(this.joinDateSec) * 31) + a.a.b(this.lastLoginSec);
    }

    public String toString() {
        return "ProfileStatistics(joinDateSec=" + this.joinDateSec + ", lastLoginSec=" + this.lastLoginSec + ")";
    }
}
