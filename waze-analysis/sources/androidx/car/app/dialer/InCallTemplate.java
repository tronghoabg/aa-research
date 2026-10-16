package androidx.car.app.dialer;

import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.model.Action;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import androidx.car.app.model.Header;
import androidx.car.app.model.Template;
import androidx.car.app.model.constraints.ActionsConstraints;
import androidx.car.app.model.constraints.CarIconConstraints;
import androidx.car.app.model.constraints.CarTextConstraints;
import androidx.car.app.utils.CollectionUtils;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: WazeSource */
@CarProtocol
/* loaded from: classes2.dex */
public class InCallTemplate implements Template {
    private static final int MAX_TEXTS_SIZE = 2;
    private final List<Action> mActions;
    private final Header mHeader;
    private final CarIcon mIcon;
    private final boolean mIsLoading;
    private final List<CarText> mTexts;
    private final CarText mTitle;

    private InCallTemplate(Builder builder) {
        this.mHeader = builder.mHeader;
        this.mIcon = builder.mIcon;
        this.mTitle = builder.mTitle;
        this.mTexts = builder.mTexts;
        this.mActions = CollectionUtils.unmodifiableCopy(builder.mActions);
        this.mIsLoading = builder.mIsLoading;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InCallTemplate)) {
            return false;
        }
        InCallTemplate inCallTemplate = (InCallTemplate) obj;
        return Objects.equals(this.mHeader, inCallTemplate.mHeader) && Objects.equals(this.mIcon, inCallTemplate.mIcon) && Objects.equals(this.mTitle, inCallTemplate.mTitle) && Objects.equals(this.mTexts, inCallTemplate.mTexts) && Objects.equals(this.mActions, inCallTemplate.mActions) && this.mIsLoading == inCallTemplate.mIsLoading;
    }

    public List<Action> getActions() {
        return this.mActions;
    }

    public Header getHeader() {
        return this.mHeader;
    }

    public CarIcon getIcon() {
        return this.mIcon;
    }

    public List<CarText> getTexts() {
        return this.mTexts;
    }

    public CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return Objects.hash(this.mHeader, this.mIcon, this.mTitle, this.mTexts, this.mActions, Boolean.valueOf(this.mIsLoading));
    }

    public boolean isLoading() {
        return this.mIsLoading;
    }

    public String toString() {
        return "InCallTemplate";
    }

    /* compiled from: WazeSource */
    public final class Builder {
        private final List<Action> mActions;
        private Header mHeader;
        private CarIcon mIcon;
        private boolean mIsLoading;
        private final List<CarText> mTexts;
        private CarText mTitle;

        public Builder(InCallTemplate inCallTemplate) {
            ArrayList arrayList = new ArrayList();
            this.mTexts = arrayList;
            ArrayList arrayList2 = new ArrayList();
            this.mActions = arrayList2;
            this.mTitle = inCallTemplate.getTitle();
            this.mIcon = inCallTemplate.getIcon();
            this.mHeader = inCallTemplate.getHeader();
            arrayList.addAll(inCallTemplate.mTexts);
            arrayList2.addAll(inCallTemplate.mActions);
            this.mIsLoading = inCallTemplate.mIsLoading;
        }

        public Builder addAction(Action action) {
            this.mActions.add((Action) Objects.requireNonNull(action));
            ActionsConstraints.ACTION_CONSTRAINTS_IN_CALL_CONTENT.validateOrThrow(this.mActions);
            return this;
        }

        public Builder addText(CarText carText) {
            if (this.mTexts.size() >= 2) {
                throw new IllegalStateException("A maximum of 2 texts can be added.");
            }
            CarTextConstraints.TEXT_AND_ICON.validateOrThrow((CarText) Objects.requireNonNull(carText));
            this.mTexts.add(carText);
            return this;
        }

        public InCallTemplate build() {
            boolean z = true;
            if (this.mTexts.isEmpty() && this.mActions.isEmpty() && this.mIcon == null && this.mTitle == null) {
                z = false;
            }
            if (z != this.mIsLoading) {
                return new InCallTemplate(this);
            }
            throw new IllegalStateException("Must have either content or be loading but not both");
        }

        public Builder setHeader(Header header) {
            Action startHeaderAction;
            if (header != null && (startHeaderAction = header.getStartHeaderAction()) != null) {
                ActionsConstraints.ACTION_CONSTRAINTS_IN_CALL_HEADER.validateOrThrow(Collections.singletonList(startHeaderAction));
            }
            this.mHeader = header;
            return this;
        }

        public Builder setIcon(CarIcon carIcon) {
            if (carIcon != null) {
                CarIconConstraints.DEFAULT.validateOrThrow(carIcon);
            }
            this.mIcon = carIcon;
            return this;
        }

        public Builder setLoading(boolean z) {
            this.mIsLoading = z;
            return this;
        }

        public Builder setTitle(CarText carText) {
            if (carText != null) {
                CarTextConstraints.TEXT_ONLY.validateOrThrow(carText);
            }
            this.mTitle = carText;
            return this;
        }

        public Builder setTitle(CharSequence charSequence) {
            if (charSequence != null) {
                setTitle(CarText.create(charSequence));
            }
            return this;
        }

        public Builder addText(CharSequence charSequence) {
            addText(CarText.create(charSequence));
            return this;
        }

        public Builder() {
            this.mTexts = new ArrayList();
            this.mActions = new ArrayList();
        }
    }

    private InCallTemplate() {
        this.mHeader = null;
        this.mIcon = null;
        this.mTitle = null;
        this.mTexts = Collections.EMPTY_LIST;
        this.mActions = Collections.EMPTY_LIST;
        this.mIsLoading = false;
    }
}
