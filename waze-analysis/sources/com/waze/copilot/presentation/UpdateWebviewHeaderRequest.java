package com.waze.copilot.presentation;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class UpdateWebviewHeaderRequest {
    public static final int $stable = 0;
    private final Boolean backButton;
    private final Boolean closeButton;
    private final String shareBody;
    private final String shareTitle;
    private final String shareUrl;
    private final String title;

    public /* synthetic */ UpdateWebviewHeaderRequest(String str, String str2, String str3, String str4, Boolean bool, Boolean bool2, int i2, h.g.b.o oVar) {
        this(str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? null : str4, bool, bool2);
    }

    public static /* synthetic */ UpdateWebviewHeaderRequest copy$default(UpdateWebviewHeaderRequest updateWebviewHeaderRequest, String str, String str2, String str3, String str4, Boolean bool, Boolean bool2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = updateWebviewHeaderRequest.title;
        }
        if ((i2 & 2) != 0) {
            str2 = updateWebviewHeaderRequest.shareUrl;
        }
        if ((i2 & 4) != 0) {
            str3 = updateWebviewHeaderRequest.shareTitle;
        }
        if ((i2 & 8) != 0) {
            str4 = updateWebviewHeaderRequest.shareBody;
        }
        if ((i2 & 16) != 0) {
            bool = updateWebviewHeaderRequest.backButton;
        }
        if ((i2 & 32) != 0) {
            bool2 = updateWebviewHeaderRequest.closeButton;
        }
        Boolean bool3 = bool;
        Boolean bool4 = bool2;
        return updateWebviewHeaderRequest.copy(str, str2, str3, str4, bool3, bool4);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.shareUrl;
    }

    public final String component3() {
        return this.shareTitle;
    }

    public final String component4() {
        return this.shareBody;
    }

    public final Boolean component5() {
        return this.backButton;
    }

    public final Boolean component6() {
        return this.closeButton;
    }

    public final UpdateWebviewHeaderRequest copy(String str, String str2, String str3, String str4, Boolean bool, Boolean bool2) {
        return new UpdateWebviewHeaderRequest(str, str2, str3, str4, bool, bool2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdateWebviewHeaderRequest)) {
            return false;
        }
        UpdateWebviewHeaderRequest updateWebviewHeaderRequest = (UpdateWebviewHeaderRequest) obj;
        return x.n(this.title, updateWebviewHeaderRequest.title) && x.n(this.shareUrl, updateWebviewHeaderRequest.shareUrl) && x.n(this.shareTitle, updateWebviewHeaderRequest.shareTitle) && x.n(this.shareBody, updateWebviewHeaderRequest.shareBody) && x.n(this.backButton, updateWebviewHeaderRequest.backButton) && x.n(this.closeButton, updateWebviewHeaderRequest.closeButton);
    }

    public final Boolean getBackButton() {
        return this.backButton;
    }

    public final Boolean getCloseButton() {
        return this.closeButton;
    }

    public final String getShareBody() {
        return this.shareBody;
    }

    public final String getShareTitle() {
        return this.shareTitle;
    }

    public final String getShareUrl() {
        return this.shareUrl;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.shareUrl;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        int i2 = iHashCode * 31;
        String str3 = this.shareTitle;
        int iHashCode3 = (((i2 + iHashCode2) * 31) + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.shareBody;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.backButton;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.closeButton;
        return iHashCode5 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public String toString() {
        return "UpdateWebviewHeaderRequest(title=" + this.title + ", shareUrl=" + this.shareUrl + ", shareTitle=" + this.shareTitle + ", shareBody=" + this.shareBody + ", backButton=" + this.backButton + ", closeButton=" + this.closeButton + ")";
    }

    public UpdateWebviewHeaderRequest(String str, String str2, String str3, String str4, Boolean bool, Boolean bool2) {
        this.title = str;
        this.shareUrl = str2;
        this.shareTitle = str3;
        this.shareBody = str4;
        this.backButton = bool;
        this.closeButton = bool2;
    }
}
