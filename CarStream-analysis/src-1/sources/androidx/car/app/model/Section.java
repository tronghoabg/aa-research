package androidx.car.app.model;

import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.model.Item;
import androidx.car.app.model.constraints.CarTextConstraints;
import androidx.car.app.serialization.ListDelegate;
import androidx.car.app.serialization.ListDelegateImpl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
@CarProtocol
/* loaded from: classes.dex */
public abstract class Section<T extends Item> {
    private final ListDelegate<T> mItemsDelegate;
    private final CarText mNoItemsMessage;
    private final CarText mTitle;

    public Section() {
        this.mItemsDelegate = new ListDelegateImpl(Collections.EMPTY_LIST);
        this.mTitle = null;
        this.mNoItemsMessage = null;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Section)) {
            return false;
        }
        Section section = (Section) obj;
        return Objects.equals(this.mItemsDelegate, section.mItemsDelegate) && Objects.equals(this.mTitle, section.mTitle) && Objects.equals(this.mNoItemsMessage, section.mNoItemsMessage);
    }

    public ListDelegate<T> getItemsDelegate() {
        return this.mItemsDelegate;
    }

    public CarText getNoItemsMessage() {
        return this.mNoItemsMessage;
    }

    public CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return Objects.hash(this.mItemsDelegate, this.mTitle, this.mNoItemsMessage);
    }

    public String toString() {
        return "Section";
    }

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    public static abstract class BaseBuilder<T extends Item, B> {
        CarText mHeader;
        List<T> mItems = new ArrayList();
        CarText mNoItemsMessage;

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

    public Section(BaseBuilder<T, ?> baseBuilder) {
        this.mItemsDelegate = new ListDelegateImpl(Collections.unmodifiableList(baseBuilder.mItems));
        this.mTitle = baseBuilder.mHeader;
        this.mNoItemsMessage = baseBuilder.mNoItemsMessage;
    }
}
