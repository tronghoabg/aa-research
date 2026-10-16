package com.waze.sharedui.profile;

import h.g.b.x;
import java.io.Serializable;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ProfileStatus implements Serializable {
    private final AgeRestrictionMode aadcRestrictionMode;
    private final boolean isAgeConfirmed;
    private final boolean isRegistered;
    private final AgeRestrictionMode u16RestrictionMode;
    private final AgeRestrictionMode u18RestrictionMode;

    public ProfileStatus(boolean z, AgeRestrictionMode ageRestrictionMode, AgeRestrictionMode ageRestrictionMode2, AgeRestrictionMode ageRestrictionMode3, boolean z2) {
        x.f(ageRestrictionMode, "aadcRestrictionMode");
        x.f(ageRestrictionMode2, "u18RestrictionMode");
        x.f(ageRestrictionMode3, "u16RestrictionMode");
        this.isRegistered = z;
        this.aadcRestrictionMode = ageRestrictionMode;
        this.u18RestrictionMode = ageRestrictionMode2;
        this.u16RestrictionMode = ageRestrictionMode3;
        this.isAgeConfirmed = z2;
    }

    public static /* synthetic */ ProfileStatus copy$default(ProfileStatus profileStatus, boolean z, AgeRestrictionMode ageRestrictionMode, AgeRestrictionMode ageRestrictionMode2, AgeRestrictionMode ageRestrictionMode3, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = profileStatus.isRegistered;
        }
        if ((i2 & 2) != 0) {
            ageRestrictionMode = profileStatus.aadcRestrictionMode;
        }
        if ((i2 & 4) != 0) {
            ageRestrictionMode2 = profileStatus.u18RestrictionMode;
        }
        if ((i2 & 8) != 0) {
            ageRestrictionMode3 = profileStatus.u16RestrictionMode;
        }
        if ((i2 & 16) != 0) {
            z2 = profileStatus.isAgeConfirmed;
        }
        boolean z3 = z2;
        AgeRestrictionMode ageRestrictionMode4 = ageRestrictionMode2;
        return profileStatus.copy(z, ageRestrictionMode, ageRestrictionMode4, ageRestrictionMode3, z3);
    }

    public final boolean component1() {
        return this.isRegistered;
    }

    public final AgeRestrictionMode component2() {
        return this.aadcRestrictionMode;
    }

    public final AgeRestrictionMode component3() {
        return this.u18RestrictionMode;
    }

    public final AgeRestrictionMode component4() {
        return this.u16RestrictionMode;
    }

    public final boolean component5() {
        return this.isAgeConfirmed;
    }

    public final ProfileStatus copy(boolean z, AgeRestrictionMode ageRestrictionMode, AgeRestrictionMode ageRestrictionMode2, AgeRestrictionMode ageRestrictionMode3, boolean z2) {
        x.f(ageRestrictionMode, "aadcRestrictionMode");
        x.f(ageRestrictionMode2, "u18RestrictionMode");
        x.f(ageRestrictionMode3, "u16RestrictionMode");
        return new ProfileStatus(z, ageRestrictionMode, ageRestrictionMode2, ageRestrictionMode3, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileStatus)) {
            return false;
        }
        ProfileStatus profileStatus = (ProfileStatus) obj;
        return this.isRegistered == profileStatus.isRegistered && this.aadcRestrictionMode == profileStatus.aadcRestrictionMode && this.u18RestrictionMode == profileStatus.u18RestrictionMode && this.u16RestrictionMode == profileStatus.u16RestrictionMode && this.isAgeConfirmed == profileStatus.isAgeConfirmed;
    }

    public final AgeRestrictionMode getAadcRestrictionMode() {
        return this.aadcRestrictionMode;
    }

    public final AgeRestrictionMode getU16RestrictionMode() {
        return this.u16RestrictionMode;
    }

    public final AgeRestrictionMode getU18RestrictionMode() {
        return this.u18RestrictionMode;
    }

    public int hashCode() {
        return (((((((a.a.a(this.isRegistered) * 31) + this.aadcRestrictionMode.hashCode()) * 31) + this.u18RestrictionMode.hashCode()) * 31) + this.u16RestrictionMode.hashCode()) * 31) + a.a.a(this.isAgeConfirmed);
    }

    public final boolean isAgeConfirmed() {
        return this.isAgeConfirmed;
    }

    public final boolean isRegistered() {
        return this.isRegistered;
    }

    public String toString() {
        return "ProfileStatus(isRegistered=" + this.isRegistered + ", aadcRestrictionMode=" + this.aadcRestrictionMode + ", u18RestrictionMode=" + this.u18RestrictionMode + ", u16RestrictionMode=" + this.u16RestrictionMode + ", isAgeConfirmed=" + this.isAgeConfirmed + ")";
    }
}
