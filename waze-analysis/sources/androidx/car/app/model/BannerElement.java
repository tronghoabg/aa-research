package androidx.car.app.model;

import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.annotations.RequiresCarApi;
import j$.util.Objects;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: WazeSource */
@CarProtocol
@RequiresCarApi(9)
/* loaded from: classes2.dex */
public final class BannerElement {
    public static final int TYPE_ACTION = 1;
    public static final int TYPE_ICON = 2;
    public static final int TYPE_IMAGE = 3;
    private final Action mAction;
    private final CarIcon mIcon;
    private final int mType;

    /* compiled from: WazeSource */
    @Retention(RetentionPolicy.SOURCE)
    public @interface ElementType {
    }

    private BannerElement() {
        this.mType = 1;
        this.mAction = null;
        this.mIcon = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BannerElement)) {
            return false;
        }
        BannerElement bannerElement = (BannerElement) obj;
        return this.mType == bannerElement.mType && Objects.equals(this.mAction, bannerElement.mAction) && Objects.equals(this.mIcon, bannerElement.mIcon);
    }

    public Action getAction() {
        return this.mAction;
    }

    public CarIcon getIcon() {
        return this.mIcon;
    }

    public int getType() {
        return this.mType;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.mType), this.mAction, this.mIcon);
    }

    public String toString() {
        return "[type: " + this.mType + ", action: " + this.mAction + ", icon: " + this.mIcon + "]";
    }

    BannerElement(int i2, Action action, CarIcon carIcon) {
        this.mType = i2;
        this.mAction = action;
        this.mIcon = carIcon;
    }
}
