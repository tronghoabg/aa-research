package androidx.car.app.model;

/* JADX INFO: loaded from: classes2.dex */
@defpackage.rg
public final class Header {
    private final androidx.car.app.model.Background mBackground;
    private final java.util.List<androidx.car.app.model.Action> mEndHeaderActions;
    private final androidx.car.app.model.Action mStartHeaderAction;
    private final androidx.car.app.model.CarIcon mStartHeaderImage;
    private final androidx.car.app.model.CarText mSubtitle;
    private final androidx.car.app.model.CarText mTitle;

    public Header(defpackage.uf ufVar) {
        this.mTitle = ufVar.c;
        androidx.car.app.model.CarText carText = ufVar.d;
        this.mSubtitle = null;
        this.mStartHeaderAction = ufVar.b;
        this.mEndHeaderActions = defpackage.tq.b(ufVar.a);
        androidx.car.app.model.Background background = ufVar.e;
        this.mBackground = null;
        androidx.car.app.model.CarIcon carIcon = ufVar.f;
        this.mStartHeaderImage = null;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.car.app.model.Header)) {
            return false;
        }
        androidx.car.app.model.Header header = (androidx.car.app.model.Header) obj;
        return j$.util.Objects.equals(this.mTitle, header.mTitle) && j$.util.Objects.equals(this.mSubtitle, header.mSubtitle) && j$.util.Objects.equals(this.mEndHeaderActions, header.mEndHeaderActions) && j$.util.Objects.equals(this.mStartHeaderAction, header.mStartHeaderAction) && j$.util.Objects.equals(this.mBackground, header.mBackground) && j$.util.Objects.equals(this.mStartHeaderImage, header.mStartHeaderImage);
    }

    public androidx.car.app.model.Background getBackground() {
        return this.mBackground;
    }

    public java.util.List<androidx.car.app.model.Action> getEndHeaderActions() {
        return this.mEndHeaderActions;
    }

    public androidx.car.app.model.Action getStartHeaderAction() {
        return this.mStartHeaderAction;
    }

    public androidx.car.app.model.CarIcon getStartHeaderImage() {
        return this.mStartHeaderImage;
    }

    public androidx.car.app.model.CarText getSubtitle() {
        return this.mSubtitle;
    }

    public androidx.car.app.model.CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return j$.util.Objects.hash(this.mTitle, this.mSubtitle, this.mEndHeaderActions, this.mStartHeaderAction, this.mBackground, this.mStartHeaderImage);
    }

    public java.lang.String toString() {
        return "Header: " + this.mTitle + ", Subtitle: " + this.mSubtitle + ", Background: " + this.mBackground + ", StartHeaderImage: " + this.mStartHeaderImage;
    }

    private Header() {
        this.mTitle = null;
        this.mSubtitle = null;
        this.mStartHeaderAction = null;
        this.mEndHeaderActions = new java.util.ArrayList();
        this.mBackground = null;
        this.mStartHeaderImage = null;
    }
}
