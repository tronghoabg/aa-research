package androidx.car.app.model;

import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.annotations.RequiresCarApi;
import androidx.car.app.model.Item;
import androidx.car.app.model.ItemList;
import androidx.car.app.model.constraints.CarTextConstraints;
import androidx.car.app.serialization.ListDelegate;
import androidx.car.app.serialization.ListDelegateImpl;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: WazeSource */
@CarProtocol
@RequiresCarApi(8)
/* loaded from: classes2.dex */
public abstract class Section<T extends Item> {
    private final ListDelegate<T> mItemsDelegate;
    private final CarText mNoItemsMessage;
    private final OnItemVisibilityChangedDelegate mOnItemVisibilityChangedDelegate;
    private final SectionHeader mSectionHeader;
    private final CarText mTitle;

    protected Section(BaseBuilder<T, ?> baseBuilder) {
        this.mItemsDelegate = new ListDelegateImpl(DesugarCollections.unmodifiableList(baseBuilder.mItems));
        this.mTitle = baseBuilder.mHeader;
        this.mSectionHeader = baseBuilder.mSectionHeader;
        this.mNoItemsMessage = baseBuilder.mNoItemsMessage;
        this.mOnItemVisibilityChangedDelegate = baseBuilder.mOnItemVisibilityChangedDelegate;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Section)) {
            return false;
        }
        Section section = (Section) obj;
        if (Objects.equals(this.mItemsDelegate, section.mItemsDelegate) && Objects.equals(this.mTitle, section.mTitle) && Objects.equals(this.mSectionHeader, section.mSectionHeader) && Objects.equals(this.mNoItemsMessage, section.mNoItemsMessage)) {
            if (Objects.equals(Boolean.valueOf(this.mOnItemVisibilityChangedDelegate == null), Boolean.valueOf(section.mOnItemVisibilityChangedDelegate == null))) {
                return true;
            }
        }
        return false;
    }

    public ListDelegate<T> getItemsDelegate() {
        return this.mItemsDelegate;
    }

    public CarText getNoItemsMessage() {
        return this.mNoItemsMessage;
    }

    public OnItemVisibilityChangedDelegate getOnItemVisibilityChangedDelegate() {
        return this.mOnItemVisibilityChangedDelegate;
    }

    @RequiresCarApi(9)
    public SectionHeader getSectionHeader() {
        return this.mSectionHeader;
    }

    public CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return Objects.hash(this.mItemsDelegate, this.mTitle, this.mSectionHeader, this.mNoItemsMessage, Boolean.valueOf(this.mOnItemVisibilityChangedDelegate == null));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Section { title: ");
        sb.append(this.mTitle);
        sb.append(", sectionHeader: ");
        sb.append(this.mSectionHeader);
        sb.append(", noItemsMessage: ");
        sb.append(this.mNoItemsMessage);
        sb.append(", itemsDelegate: ");
        sb.append(this.mItemsDelegate);
        sb.append(", onItemVisibilityChangedDelegate: ");
        sb.append(this.mOnItemVisibilityChangedDelegate != null);
        return sb.toString();
    }

    /* compiled from: WazeSource */
    public abstract class BaseBuilder<T extends Item, B> {
        CarText mHeader;
        List<T> mItems = new ArrayList();
        CarText mNoItemsMessage;
        OnItemVisibilityChangedDelegate mOnItemVisibilityChangedDelegate;
        SectionHeader mSectionHeader;

        protected BaseBuilder() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public B addItem(T t) {
            this.mItems.add(t);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public B clearItems() {
            this.mItems.clear();
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public B setItems(List<T> list) {
            this.mItems = list;
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public B setNoItemsMessage(CharSequence charSequence) {
            if (charSequence == null) {
                this.mNoItemsMessage = null;
                return this;
            }
            CarText carTextCreate = CarText.create(charSequence);
            CarTextConstraints.TEXT_ONLY.validateOrThrow(carTextCreate);
            this.mNoItemsMessage = carTextCreate;
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public B setOnItemVisibilityChangedDelegate(OnItemVisibilityChangedDelegate onItemVisibilityChangedDelegate) {
            this.mOnItemVisibilityChangedDelegate = onItemVisibilityChangedDelegate;
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public B setOnItemVisibilityChangedListener(ItemList.OnItemVisibilityChangedListener onItemVisibilityChangedListener) {
            this.mOnItemVisibilityChangedDelegate = onItemVisibilityChangedListener == null ? null : OnItemVisibilityChangedDelegateImpl.create(onItemVisibilityChangedListener);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @RequiresCarApi(9)
        public B setSectionHeader(SectionHeader sectionHeader) {
            this.mSectionHeader = sectionHeader;
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public B setTitle(CharSequence charSequence) {
            if (charSequence == null) {
                this.mHeader = null;
                return this;
            }
            CarText carTextCreate = CarText.create(charSequence);
            CarTextConstraints.TEXT_ONLY.validateOrThrow(carTextCreate);
            this.mHeader = carTextCreate;
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public B setNoItemsMessage(CarText carText) {
            if (carText != null) {
                CarTextConstraints.TEXT_ONLY.validateOrThrow(carText);
            }
            this.mNoItemsMessage = carText;
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public B setTitle(CarText carText) {
            if (carText != null) {
                CarTextConstraints.TEXT_ONLY.validateOrThrow(carText);
            }
            this.mHeader = carText;
            return this;
        }
    }

    protected Section() {
        this.mItemsDelegate = new ListDelegateImpl(Collections.EMPTY_LIST);
        this.mTitle = null;
        this.mSectionHeader = null;
        this.mNoItemsMessage = null;
        this.mOnItemVisibilityChangedDelegate = null;
    }
}
