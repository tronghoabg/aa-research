package androidx.car.app.navigation.model;

import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import defpackage.rb;
import defpackage.wx;
import defpackage.wz;
import j$.util.Objects;

@rb
/* loaded from: classes2.dex */
public final class MessageInfo implements wz {
    private final CarIcon mImage;
    private final CarText mText;
    private final CarText mTitle;

    MessageInfo(wx wxVar) {
        CarText carText = wxVar.a;
        this.mTitle = null;
        CarText carText2 = wxVar.b;
        this.mText = null;
        CarIcon carIcon = wxVar.c;
        this.mImage = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessageInfo)) {
            return false;
        }
        MessageInfo messageInfo = (MessageInfo) obj;
        return Objects.equals(this.mTitle, messageInfo.mTitle) && Objects.equals(this.mText, messageInfo.mText) && Objects.equals(this.mImage, messageInfo.mImage);
    }

    public CarIcon getImage() {
        return this.mImage;
    }

    public CarText getText() {
        return this.mText;
    }

    public CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return Objects.hash(this.mTitle, this.mText, this.mImage);
    }

    public String toString() {
        return "MessageInfo";
    }

    private MessageInfo() {
        this.mTitle = null;
        this.mText = null;
        this.mImage = null;
    }
}
