package androidx.car.app.model;

import defpackage.rb;
import defpackage.tl;
import defpackage.ua;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;

@rb
/* loaded from: classes2.dex */
public final class Header {
    private final Background mBackground;
    private final List<Action> mEndHeaderActions;
    private final Action mStartHeaderAction;
    private final CarIcon mStartHeaderImage;
    private final CarText mSubtitle;
    private final CarText mTitle;

    public Header(ua uaVar) {
        this.mTitle = uaVar.c;
        CarText carText = uaVar.d;
        this.mSubtitle = null;
        this.mStartHeaderAction = uaVar.b;
        this.mEndHeaderActions = tl.b(uaVar.a);
        Background background = uaVar.e;
        this.mBackground = null;
        CarIcon carIcon = uaVar.f;
        this.mStartHeaderImage = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Header)) {
            return false;
        }
        Header header = (Header) obj;
        return Objects.equals(this.mTitle, header.mTitle) && Objects.equals(this.mSubtitle, header.mSubtitle) && Objects.equals(this.mEndHeaderActions, header.mEndHeaderActions) && Objects.equals(this.mStartHeaderAction, header.mStartHeaderAction) && Objects.equals(this.mBackground, header.mBackground) && Objects.equals(this.mStartHeaderImage, header.mStartHeaderImage);
    }

    public Background getBackground() {
        return this.mBackground;
    }

    public List<Action> getEndHeaderActions() {
        return this.mEndHeaderActions;
    }

    public Action getStartHeaderAction() {
        return this.mStartHeaderAction;
    }

    public CarIcon getStartHeaderImage() {
        return this.mStartHeaderImage;
    }

    public CarText getSubtitle() {
        return this.mSubtitle;
    }

    public CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return Objects.hash(this.mTitle, this.mSubtitle, this.mEndHeaderActions, this.mStartHeaderAction, this.mBackground, this.mStartHeaderImage);
    }

    public String toString() {
        return "Header: " + this.mTitle + ", Subtitle: " + this.mSubtitle + ", Background: " + this.mBackground + ", StartHeaderImage: " + this.mStartHeaderImage;
    }

    private Header() {
        this.mTitle = null;
        this.mSubtitle = null;
        this.mStartHeaderAction = null;
        this.mEndHeaderActions = new ArrayList();
        this.mBackground = null;
        this.mStartHeaderImage = null;
    }
}
