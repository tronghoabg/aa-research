package androidx.car.app.model;

import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.annotations.RequiresCarApi;
import androidx.car.app.model.ActionStrip;
import androidx.car.app.model.Header;
import androidx.car.app.model.constraints.ActionsConstraints;
import androidx.car.app.model.constraints.CarTextConstraints;
import androidx.car.app.utils.CollectionUtils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
@CarProtocol
/* loaded from: classes.dex */
public final class GridTemplate implements Template {
    public static final int ITEM_IMAGE_SHAPE_CIRCLE = 2;
    public static final int ITEM_IMAGE_SHAPE_UNSET = 1;
    public static final int ITEM_SIZE_LARGE = 4;
    public static final int ITEM_SIZE_MEDIUM = 2;
    public static final int ITEM_SIZE_SMALL = 1;

    @Deprecated
    private final ActionStrip mActionStrip;
    private final List<Action> mActions;

    @RequiresCarApi(7)
    private final Header mHeader;

    @Deprecated
    private final Action mHeaderAction;
    private final boolean mIsLoading;
    private final int mItemImageShape;
    private final int mItemSize;
    private final ItemList mSingleList;

    @Deprecated
    private final CarText mTitle;

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    public static final class Builder {
        ActionStrip mActionStrip;
        Header mHeader;
        Action mHeaderAction;
        boolean mIsLoading;
        ItemList mSingleList;
        CarText mTitle;
        final List<Action> mActions = new ArrayList();
        int mItemSize = 1;
        int mItemImageShape = 1;

        @RequiresCarApi(7)
        public Builder addAction(Action action) {
            ArrayList arrayList = new ArrayList(this.mActions);
            Objects.requireNonNull(action);
            arrayList.add(action);
            ActionsConstraints.ACTIONS_CONSTRAINTS_FAB.validateOrThrow(arrayList);
            this.mActions.add(action);
            return this;
        }

        public GridTemplate build() {
            ItemList itemList = this.mSingleList;
            if (this.mIsLoading == (itemList != null)) {
                throw new IllegalStateException("Template is in a loading state but lists are added, or vice versa");
            }
            if (itemList != null) {
                Iterator<Item> it = itemList.getItems().iterator();
                while (it.hasNext()) {
                    if (!(it.next() instanceof GridItem)) {
                        throw new IllegalArgumentException("All the items in grid template's item list must be grid items");
                    }
                }
            }
            return new GridTemplate(this);
        }

        @Deprecated
        public Builder setActionStrip(ActionStrip actionStrip) {
            ActionsConstraints actionsConstraints = ActionsConstraints.ACTIONS_CONSTRAINTS_SIMPLE;
            Objects.requireNonNull(actionStrip);
            actionsConstraints.validateOrThrow(actionStrip.getActions());
            this.mActionStrip = actionStrip;
            return this;
        }

        @RequiresCarApi(7)
        public Builder setHeader(Header header) {
            if (header.getStartHeaderAction() != null) {
                this.mHeaderAction = header.getStartHeaderAction();
            }
            if (header.getTitle() != null) {
                this.mTitle = header.getTitle();
            }
            if (!header.getEndHeaderActions().isEmpty()) {
                ActionStrip.Builder builder = new ActionStrip.Builder();
                Iterator<Action> it = header.getEndHeaderActions().iterator();
                while (it.hasNext()) {
                    builder.addAction(it.next());
                }
                this.mActionStrip = builder.build();
            }
            this.mHeader = header;
            return this;
        }

        @Deprecated
        public Builder setHeaderAction(Action action) {
            ActionsConstraints.ACTIONS_CONSTRAINTS_HEADER.validateOrThrow(Collections.singletonList(action));
            this.mHeaderAction = action;
            return this;
        }

        public Builder setItemImageShape(int i) {
            this.mItemImageShape = i;
            return this;
        }

        public Builder setItemSize(int i) {
            this.mItemSize = i;
            return this;
        }

        public Builder setLoading(boolean z) {
            this.mIsLoading = z;
            return this;
        }

        public Builder setSingleList(ItemList itemList) {
            Objects.requireNonNull(itemList);
            this.mSingleList = itemList;
            return this;
        }

        @Deprecated
        public Builder setTitle(CharSequence charSequence) {
            Objects.requireNonNull(charSequence);
            CarText carTextCreate = CarText.create(charSequence);
            this.mTitle = carTextCreate;
            CarTextConstraints.TEXT_ONLY.validateOrThrow(carTextCreate);
            return this;
        }
    }

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface ItemImageShape {
    }

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface ItemSize {
    }

    public GridTemplate(Builder builder) {
        this.mIsLoading = builder.mIsLoading;
        this.mTitle = builder.mTitle;
        this.mHeaderAction = builder.mHeaderAction;
        this.mSingleList = builder.mSingleList;
        this.mActionStrip = builder.mActionStrip;
        this.mActions = CollectionUtils.unmodifiableCopy(builder.mActions);
        this.mItemSize = builder.mItemSize;
        this.mItemImageShape = builder.mItemImageShape;
        this.mHeader = builder.mHeader;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GridTemplate)) {
            return false;
        }
        GridTemplate gridTemplate = (GridTemplate) obj;
        return this.mIsLoading == gridTemplate.mIsLoading && Objects.equals(this.mTitle, gridTemplate.mTitle) && Objects.equals(this.mHeaderAction, gridTemplate.mHeaderAction) && Objects.equals(this.mSingleList, gridTemplate.mSingleList) && Objects.equals(this.mActionStrip, gridTemplate.mActionStrip) && Objects.equals(this.mActions, gridTemplate.mActions) && this.mItemSize == gridTemplate.mItemSize && this.mItemImageShape == gridTemplate.mItemImageShape && Objects.equals(this.mHeader, gridTemplate.mHeader);
    }

    @Deprecated
    public ActionStrip getActionStrip() {
        return this.mActionStrip;
    }

    @RequiresCarApi(7)
    public List<Action> getActions() {
        return this.mActions;
    }

    public Header getHeader() {
        Header header = this.mHeader;
        if (header != null) {
            return header;
        }
        if (this.mTitle == null && this.mHeaderAction == null && this.mActionStrip == null) {
            return null;
        }
        Header.Builder builder = new Header.Builder();
        CarText carText = this.mTitle;
        if (carText != null) {
            builder.setTitle(carText);
        }
        Action action = this.mHeaderAction;
        if (action != null) {
            builder.setStartHeaderAction(action);
        }
        ActionStrip actionStrip = this.mActionStrip;
        if (actionStrip != null) {
            Iterator<Action> it = actionStrip.getActions().iterator();
            while (it.hasNext()) {
                builder.addEndHeaderAction(it.next());
            }
        }
        return builder.build();
    }

    @Deprecated
    public Action getHeaderAction() {
        return this.mHeaderAction;
    }

    public int getItemImageShape() {
        return this.mItemImageShape;
    }

    public int getItemSize() {
        return this.mItemSize;
    }

    public ItemList getSingleList() {
        return this.mSingleList;
    }

    @Deprecated
    public CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.mIsLoading), this.mTitle, this.mHeaderAction, this.mSingleList, this.mActionStrip, Integer.valueOf(this.mItemSize), Integer.valueOf(this.mItemImageShape), this.mHeader);
    }

    public boolean isLoading() {
        return this.mIsLoading;
    }

    public String toString() {
        return "GridTemplate";
    }

    private GridTemplate() {
        this.mIsLoading = false;
        this.mTitle = null;
        this.mHeaderAction = null;
        this.mSingleList = null;
        this.mActionStrip = null;
        this.mActions = Collections.EMPTY_LIST;
        this.mItemSize = 1;
        this.mItemImageShape = 1;
        this.mHeader = null;
    }
}
