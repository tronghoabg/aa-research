package com.waze.sharedui.profile;

import h.g.b.x;
import java.io.Serializable;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ProfileBasicInfo implements Serializable {
    private final boolean anonymous;
    private final Long birthDateSec;
    private final String email;
    private final boolean emailVerified;
    private final EmailVerifier emailVerifier;
    private final String firstName;
    private final String lastName;
    private final String phone;
    private final long points;
    private final String userName;

    public ProfileBasicInfo(String str, String str2, String str3, boolean z, EmailVerifier emailVerifier, String str4, String str5, long j2, boolean z2, Long l2) {
        x.f(str, "firstName");
        x.f(str2, "lastName");
        x.f(emailVerifier, "emailVerifier");
        x.f(str5, "userName");
        this.firstName = str;
        this.lastName = str2;
        this.email = str3;
        this.emailVerified = z;
        this.emailVerifier = emailVerifier;
        this.phone = str4;
        this.userName = str5;
        this.points = j2;
        this.anonymous = z2;
        this.birthDateSec = l2;
    }

    public static /* synthetic */ ProfileBasicInfo copy$default(ProfileBasicInfo profileBasicInfo, String str, String str2, String str3, boolean z, EmailVerifier emailVerifier, String str4, String str5, long j2, boolean z2, Long l2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = profileBasicInfo.firstName;
        }
        if ((i2 & 2) != 0) {
            str2 = profileBasicInfo.lastName;
        }
        if ((i2 & 4) != 0) {
            str3 = profileBasicInfo.email;
        }
        if ((i2 & 8) != 0) {
            z = profileBasicInfo.emailVerified;
        }
        if ((i2 & 16) != 0) {
            emailVerifier = profileBasicInfo.emailVerifier;
        }
        if ((i2 & 32) != 0) {
            str4 = profileBasicInfo.phone;
        }
        if ((i2 & 64) != 0) {
            str5 = profileBasicInfo.userName;
        }
        if ((i2 & 128) != 0) {
            j2 = profileBasicInfo.points;
        }
        if ((i2 & 256) != 0) {
            z2 = profileBasicInfo.anonymous;
        }
        if ((i2 & 512) != 0) {
            l2 = profileBasicInfo.birthDateSec;
        }
        long j3 = j2;
        String str6 = str4;
        String str7 = str5;
        boolean z3 = z;
        EmailVerifier emailVerifier2 = emailVerifier;
        String str8 = str3;
        return profileBasicInfo.copy(str, str2, str8, z3, emailVerifier2, str6, str7, j3, z2, l2);
    }

    public final String component1() {
        return this.firstName;
    }

    public final Long component10() {
        return this.birthDateSec;
    }

    public final String component2() {
        return this.lastName;
    }

    public final String component3() {
        return this.email;
    }

    public final boolean component4() {
        return this.emailVerified;
    }

    public final EmailVerifier component5() {
        return this.emailVerifier;
    }

    public final String component6() {
        return this.phone;
    }

    public final String component7() {
        return this.userName;
    }

    public final long component8() {
        return this.points;
    }

    public final boolean component9() {
        return this.anonymous;
    }

    public final ProfileBasicInfo copy(String str, String str2, String str3, boolean z, EmailVerifier emailVerifier, String str4, String str5, long j2, boolean z2, Long l2) {
        x.f(str, "firstName");
        x.f(str2, "lastName");
        x.f(emailVerifier, "emailVerifier");
        x.f(str5, "userName");
        return new ProfileBasicInfo(str, str2, str3, z, emailVerifier, str4, str5, j2, z2, l2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileBasicInfo)) {
            return false;
        }
        ProfileBasicInfo profileBasicInfo = (ProfileBasicInfo) obj;
        return x.n(this.firstName, profileBasicInfo.firstName) && x.n(this.lastName, profileBasicInfo.lastName) && x.n(this.email, profileBasicInfo.email) && this.emailVerified == profileBasicInfo.emailVerified && this.emailVerifier == profileBasicInfo.emailVerifier && x.n(this.phone, profileBasicInfo.phone) && x.n(this.userName, profileBasicInfo.userName) && this.points == profileBasicInfo.points && this.anonymous == profileBasicInfo.anonymous && x.n(this.birthDateSec, profileBasicInfo.birthDateSec);
    }

    public final boolean getAnonymous() {
        return this.anonymous;
    }

    public final Long getBirthDateSec() {
        return this.birthDateSec;
    }

    public final String getEmail() {
        return this.email;
    }

    public final boolean getEmailVerified() {
        return this.emailVerified;
    }

    public final EmailVerifier getEmailVerifier() {
        return this.emailVerifier;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final String getPhone() {
        return this.phone;
    }

    public final long getPoints() {
        return this.points;
    }

    public final String getUserName() {
        return this.userName;
    }

    public int hashCode() {
        int iHashCode = (this.firstName.hashCode() * 31) + this.lastName.hashCode();
        String str = this.email;
        int iHashCode2 = ((((((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + a.a.a(this.emailVerified)) * 31) + this.emailVerifier.hashCode()) * 31;
        String str2 = this.phone;
        int iHashCode3 = (((((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.userName.hashCode()) * 31) + a.a.b(this.points)) * 31) + a.a.a(this.anonymous)) * 31;
        Long l2 = this.birthDateSec;
        return iHashCode3 + (l2 != null ? l2.hashCode() : 0);
    }

    public String toString() {
        return "ProfileBasicInfo(firstName=" + this.firstName + ", lastName=" + this.lastName + ", email=" + this.email + ", emailVerified=" + this.emailVerified + ", emailVerifier=" + this.emailVerifier + ", phone=" + this.phone + ", userName=" + this.userName + ", points=" + this.points + ", anonymous=" + this.anonymous + ", birthDateSec=" + this.birthDateSec + ")";
    }
}
