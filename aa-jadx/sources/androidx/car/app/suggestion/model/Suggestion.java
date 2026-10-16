package androidx.car.app.suggestion.model;

/* JADX INFO: loaded from: classes2.dex */
@defpackage.rg
public final class Suggestion {
    private final android.app.PendingIntent mAction;
    private final androidx.car.app.model.CarIcon mIcon;
    private final java.lang.String mIdentifier;
    private final androidx.car.app.model.CarText mSubtitle;
    private final androidx.car.app.model.CarText mTitle;

    private Suggestion() {
        this.mIdentifier = "";
        this.mTitle = androidx.car.app.model.CarText.create("");
        this.mSubtitle = null;
        this.mIcon = null;
        this.mAction = null;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.car.app.suggestion.model.Suggestion)) {
            return false;
        }
        androidx.car.app.suggestion.model.Suggestion suggestion = (androidx.car.app.suggestion.model.Suggestion) obj;
        return j$.util.Objects.equals(this.mIdentifier, suggestion.mIdentifier) && j$.util.Objects.equals(this.mTitle, suggestion.mTitle) && j$.util.Objects.equals(this.mSubtitle, suggestion.mSubtitle) && j$.util.Objects.equals(this.mAction, suggestion.mAction) && j$.util.Objects.equals(this.mIcon, suggestion.mIcon);
    }

    public android.app.PendingIntent getAction() {
        return this.mAction;
    }

    public androidx.car.app.model.CarIcon getIcon() {
        return this.mIcon;
    }

    public java.lang.String getIdentifier() {
        return this.mIdentifier;
    }

    public androidx.car.app.model.CarText getSubtitle() {
        return this.mSubtitle;
    }

    public androidx.car.app.model.CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return j$.util.Objects.hash(this.mIdentifier, this.mTitle, this.mSubtitle, this.mIcon, this.mAction);
    }

    public java.lang.String toString() {
        return "[id: " + this.mIdentifier + ", title: " + androidx.car.app.model.CarText.toShortString(this.mTitle) + ", subtitle: " + androidx.car.app.model.CarText.toShortString(this.mSubtitle) + ", pendingIntent: " + this.mAction + ", icon: " + this.mIcon + "]";
    }

    Suggestion(defpackage.yc ycVar) {
        java.lang.Object obj = ycVar.a;
        throw null;
    }
}
