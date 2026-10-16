package com.waze.uid.state_impl.email;

import androidx.autofill.HintConstants;
import com.waze.sharedui.api.EmailConsent;
import com.waze.sharedui.api.PinCodeStatus;
import com.waze.sharedui.profile.UserProfile;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class EmailParameters extends com.waze.uid.e.d {
    public static final int $stable = 8;
    private EmailConsent consent;
    private boolean continuedAsGuest;
    private String emailAddress;
    private boolean emailAuthSkipped;
    private UserProfile existingProfile;
    private String pinCode;
    private int pinCodeLength;
    private PinCodeStatus pinCodeStatus;
    private String pinCodeToken;
    private String pinCodeUuid;
    private String verificationToken;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ EmailParameters(String str, String str2, String str3, int i2, PinCodeStatus pinCodeStatus, String str4, boolean z, boolean z2, UserProfile userProfile, EmailConsent emailConsent, String str5, int i3, h.g.b.o oVar) {
        PinCodeStatus pinCodeStatus2 = (i3 & 16) != 0 ? PinCodeStatus.UNKNOWN : pinCodeStatus;
        String str6 = (i3 & 32) != 0 ? "" : str4;
        boolean z3 = ((i3 & 64) == 0) & z;
        boolean z4 = ((i3 & 128) == 0) & z2;
        UserProfile userProfile2 = (i3 & 256) != 0 ? null : userProfile;
        EmailConsent emailConsent2 = (i3 & 512) != 0 ? EmailConsent.None : emailConsent;
        int i4 = i3 & 4;
        int i5 = i3 & 2;
        int i6 = i3 & 1;
        int i7 = (i3 & 8) == 0 ? i2 : 0;
        String str7 = i4 != 0 ? "" : str3;
        this(1 == i6 ? "" : str, i5 != 0 ? "" : str2, str7, i7, pinCodeStatus2, str6, z3, z4, userProfile2, emailConsent2, (i3 & 1024) != 0 ? "" : str5);
    }

    public static /* synthetic */ EmailParameters copy$default(EmailParameters emailParameters, String str, String str2, String str3, int i2, PinCodeStatus pinCodeStatus, String str4, boolean z, boolean z2, UserProfile userProfile, EmailConsent emailConsent, String str5, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = emailParameters.emailAddress;
        }
        if ((i3 & 2) != 0) {
            str2 = emailParameters.pinCode;
        }
        if ((i3 & 4) != 0) {
            str3 = emailParameters.pinCodeUuid;
        }
        if ((i3 & 8) != 0) {
            i2 = emailParameters.pinCodeLength;
        }
        if ((i3 & 16) != 0) {
            pinCodeStatus = emailParameters.pinCodeStatus;
        }
        if ((i3 & 32) != 0) {
            str4 = emailParameters.pinCodeToken;
        }
        if ((i3 & 64) != 0) {
            z = emailParameters.emailAuthSkipped;
        }
        if ((i3 & 128) != 0) {
            z2 = emailParameters.continuedAsGuest;
        }
        if ((i3 & 256) != 0) {
            userProfile = emailParameters.existingProfile;
        }
        if ((i3 & 512) != 0) {
            emailConsent = emailParameters.consent;
        }
        if ((i3 & 1024) != 0) {
            str5 = emailParameters.verificationToken;
        }
        EmailConsent emailConsent2 = emailConsent;
        String str6 = str5;
        boolean z3 = z2;
        UserProfile userProfile2 = userProfile;
        String str7 = str4;
        boolean z4 = z;
        PinCodeStatus pinCodeStatus2 = pinCodeStatus;
        String str8 = str3;
        return emailParameters.copy(str, str2, str8, i2, pinCodeStatus2, str7, z4, z3, userProfile2, emailConsent2, str6);
    }

    public final String component1() {
        return this.emailAddress;
    }

    public final EmailConsent component10() {
        return this.consent;
    }

    public final String component11() {
        return this.verificationToken;
    }

    public final String component2() {
        return this.pinCode;
    }

    public final String component3() {
        return this.pinCodeUuid;
    }

    public final int component4() {
        return this.pinCodeLength;
    }

    public final PinCodeStatus component5() {
        return this.pinCodeStatus;
    }

    public final String component6() {
        return this.pinCodeToken;
    }

    public final boolean component7() {
        return this.emailAuthSkipped;
    }

    public final boolean component8() {
        return this.continuedAsGuest;
    }

    public final UserProfile component9() {
        return this.existingProfile;
    }

    public final EmailParameters copy(String str, String str2, String str3, int i2, PinCodeStatus pinCodeStatus, String str4, boolean z, boolean z2, UserProfile userProfile, EmailConsent emailConsent, String str5) {
        h.g.b.x.f(str, HintConstants.AUTOFILL_HINT_EMAIL_ADDRESS);
        h.g.b.x.f(str2, "pinCode");
        h.g.b.x.f(str3, "pinCodeUuid");
        h.g.b.x.f(pinCodeStatus, "pinCodeStatus");
        h.g.b.x.f(str4, "pinCodeToken");
        h.g.b.x.f(emailConsent, "consent");
        h.g.b.x.f(str5, "verificationToken");
        return new EmailParameters(str, str2, str3, i2, pinCodeStatus, str4, z, z2, userProfile, emailConsent, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EmailParameters)) {
            return false;
        }
        EmailParameters emailParameters = (EmailParameters) obj;
        return h.g.b.x.n(this.emailAddress, emailParameters.emailAddress) && h.g.b.x.n(this.pinCode, emailParameters.pinCode) && h.g.b.x.n(this.pinCodeUuid, emailParameters.pinCodeUuid) && this.pinCodeLength == emailParameters.pinCodeLength && this.pinCodeStatus == emailParameters.pinCodeStatus && h.g.b.x.n(this.pinCodeToken, emailParameters.pinCodeToken) && this.emailAuthSkipped == emailParameters.emailAuthSkipped && this.continuedAsGuest == emailParameters.continuedAsGuest && h.g.b.x.n(this.existingProfile, emailParameters.existingProfile) && this.consent == emailParameters.consent && h.g.b.x.n(this.verificationToken, emailParameters.verificationToken);
    }

    public final EmailConsent getConsent() {
        return this.consent;
    }

    public final boolean getContinuedAsGuest() {
        return this.continuedAsGuest;
    }

    public final String getEmailAddress() {
        return this.emailAddress;
    }

    public final boolean getEmailAuthSkipped() {
        return this.emailAuthSkipped;
    }

    public final UserProfile getExistingProfile() {
        return this.existingProfile;
    }

    public final String getPinCode() {
        return this.pinCode;
    }

    public final int getPinCodeLength() {
        return this.pinCodeLength;
    }

    public final PinCodeStatus getPinCodeStatus() {
        return this.pinCodeStatus;
    }

    public final String getPinCodeToken() {
        return this.pinCodeToken;
    }

    public final String getPinCodeUuid() {
        return this.pinCodeUuid;
    }

    public final String getVerificationToken() {
        return this.verificationToken;
    }

    public int hashCode() {
        int iHashCode = (((((((((this.emailAddress.hashCode() * 31) + this.pinCode.hashCode()) * 31) + this.pinCodeUuid.hashCode()) * 31) + this.pinCodeLength) * 31) + this.pinCodeStatus.hashCode()) * 31) + this.pinCodeToken.hashCode();
        int iA = a.a.a(this.emailAuthSkipped);
        int iA2 = a.a.a(this.continuedAsGuest);
        UserProfile userProfile = this.existingProfile;
        return (((((((((iHashCode * 31) + iA) * 31) + iA2) * 31) + (userProfile == null ? 0 : userProfile.hashCode())) * 31) + this.consent.hashCode()) * 31) + this.verificationToken.hashCode();
    }

    @Override // com.waze.uid.e.d
    public void reset() {
        resetPinCodeDetails();
        this.emailAddress = "";
        this.continuedAsGuest = false;
        this.existingProfile = null;
        this.consent = EmailConsent.None;
    }

    public final void resetPinCodeDetails() {
        this.pinCode = "";
        this.pinCodeStatus = PinCodeStatus.UNKNOWN;
        this.pinCodeLength = 0;
        this.pinCodeToken = "";
        this.pinCodeUuid = "";
        this.emailAuthSkipped = false;
    }

    public final void setConsent(EmailConsent emailConsent) {
        h.g.b.x.f(emailConsent, "<set-?>");
        this.consent = emailConsent;
    }

    public final void setContinuedAsGuest(boolean z) {
        this.continuedAsGuest = z;
    }

    public final void setEmailAddress(String str) {
        h.g.b.x.f(str, "<set-?>");
        this.emailAddress = str;
    }

    public final void setEmailAuthSkipped(boolean z) {
        this.emailAuthSkipped = z;
    }

    public final void setExistingProfile(UserProfile userProfile) {
        this.existingProfile = userProfile;
    }

    public final void setPinCode(String str) {
        h.g.b.x.f(str, "<set-?>");
        this.pinCode = str;
    }

    public final void setPinCodeLength(int i2) {
        this.pinCodeLength = i2;
    }

    public final void setPinCodeStatus(PinCodeStatus pinCodeStatus) {
        h.g.b.x.f(pinCodeStatus, "<set-?>");
        this.pinCodeStatus = pinCodeStatus;
    }

    public final void setPinCodeToken(String str) {
        h.g.b.x.f(str, "<set-?>");
        this.pinCodeToken = str;
    }

    public final void setPinCodeUuid(String str) {
        h.g.b.x.f(str, "<set-?>");
        this.pinCodeUuid = str;
    }

    public final void setVerificationToken(String str) {
        h.g.b.x.f(str, "<set-?>");
        this.verificationToken = str;
    }

    public String toString() {
        return "EmailParameters(emailAddress=" + this.emailAddress + ", pinCode=" + this.pinCode + ", pinCodeUuid=" + this.pinCodeUuid + ", pinCodeLength=" + this.pinCodeLength + ", pinCodeStatus=" + this.pinCodeStatus + ", pinCodeToken=" + this.pinCodeToken + ", emailAuthSkipped=" + this.emailAuthSkipped + ", continuedAsGuest=" + this.continuedAsGuest + ", existingProfile=" + this.existingProfile + ", consent=" + this.consent + ", verificationToken=" + this.verificationToken + ")";
    }

    public EmailParameters(String str, String str2, String str3, int i2, PinCodeStatus pinCodeStatus, String str4, boolean z, boolean z2, UserProfile userProfile, EmailConsent emailConsent, String str5) {
        h.g.b.x.f(str, HintConstants.AUTOFILL_HINT_EMAIL_ADDRESS);
        h.g.b.x.f(str2, "pinCode");
        h.g.b.x.f(str3, "pinCodeUuid");
        h.g.b.x.f(pinCodeStatus, "pinCodeStatus");
        h.g.b.x.f(str4, "pinCodeToken");
        h.g.b.x.f(emailConsent, "consent");
        h.g.b.x.f(str5, "verificationToken");
        this.emailAddress = str;
        this.pinCode = str2;
        this.pinCodeUuid = str3;
        this.pinCodeLength = i2;
        this.pinCodeStatus = pinCodeStatus;
        this.pinCodeToken = str4;
        this.emailAuthSkipped = z;
        this.continuedAsGuest = z2;
        this.existingProfile = userProfile;
        this.consent = emailConsent;
        this.verificationToken = str5;
    }

    public EmailParameters() {
        this(null, null, null, 0, null, null, false, false, null, null, null, 2047, null);
    }
}
