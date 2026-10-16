package androidx.car.app.navigation.model;

/* JADX INFO: loaded from: classes2.dex */
@defpackage.rg
public final class MessageInfo implements defpackage.xg {
    private final androidx.car.app.model.CarIcon mImage;
    private final androidx.car.app.model.CarText mText;
    private final androidx.car.app.model.CarText mTitle;

    MessageInfo(defpackage.xe xeVar) {
        androidx.car.app.model.CarText carText = xeVar.a;
        this.mTitle = null;
        androidx.car.app.model.CarText carText2 = xeVar.b;
        this.mText = null;
        androidx.car.app.model.CarIcon carIcon = xeVar.c;
        this.mImage = null;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.car.app.navigation.model.MessageInfo)) {
            return false;
        }
        androidx.car.app.navigation.model.MessageInfo messageInfo = (androidx.car.app.navigation.model.MessageInfo) obj;
        return j$.util.Objects.equals(this.mTitle, messageInfo.mTitle) && j$.util.Objects.equals(this.mText, messageInfo.mText) && j$.util.Objects.equals(this.mImage, messageInfo.mImage);
    }

    public androidx.car.app.model.CarIcon getImage() {
        return this.mImage;
    }

    public androidx.car.app.model.CarText getText() {
        return this.mText;
    }

    public androidx.car.app.model.CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return j$.util.Objects.hash(this.mTitle, this.mText, this.mImage);
    }

    public java.lang.String toString() {
        return "MessageInfo";
    }

    private MessageInfo() {
        this.mTitle = null;
        this.mText = null;
        this.mImage = null;
    }
}
