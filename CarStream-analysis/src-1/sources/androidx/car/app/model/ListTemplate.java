package androidx.car.app.model;

import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.annotations.RequiresCarApi;
import androidx.car.app.messaging.model.ConversationItem;
import androidx.car.app.model.ActionStrip;
import androidx.car.app.model.Header;
import androidx.car.app.model.ItemList;
import androidx.car.app.model.constraints.ActionsConstraints;
import androidx.car.app.model.constraints.CarTextConstraints;
import androidx.car.app.model.constraints.RowListConstraints;
import androidx.car.app.utils.CollectionUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
@CarProtocol
/* loaded from: classes.dex */
public final class ListTemplate implements Template {
    static final int MAX_ALLOWED_ITEMS = 100;
    static final int MAX_MESSAGES_PER_CONVERSATION = 10;

    @Deprecated
    private final ActionStrip mActionStrip;
    private final List<Action> mActions;

    @RequiresCarApi(7)
    private final Header mHeader;

    @Deprecated
    private final Action mHeaderAction;
    private final boolean mIsLoading;
    private final List<SectionedItemList> mSectionedLists;
    private final ItemList mSingleList;

    @Deprecated
    private final CarText mTitle;

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    public static class TruncateCounter {
        private int mRemainingItems;

        public TruncateCounter(int i) {
            this.mRemainingItems = i;
        }

        public boolean canFit(int i) {
            return this.mRemainingItems >= i;
        }

        public int decrement() {
            int i = this.mRemainingItems - 1;
            this.mRemainingItems = i;
            return i;
        }

        public int remainingItems() {
            return this.mRemainingItems;
        }

        public int decrement(int i) {
            int i2 = this.mRemainingItems - i;
            this.mRemainingItems = i2;
            return i2;
        }
    }

    public ListTemplate(Builder builder) {
        this.mIsLoading = builder.mIsLoading;
        this.mTitle = builder.mTitle;
        this.mHeaderAction = builder.mHeaderAction;
        this.mSingleList = builder.mSingleList;
        this.mSectionedLists = CollectionUtils.unmodifiableCopy(builder.mSectionedLists);
        this.mActionStrip = builder.mActionStrip;
        this.mActions = CollectionUtils.unmodifiableCopy(builder.mActions);
        this.mHeader = builder.mHeader;
    }

    public static List<SectionedItemList> getTruncatedCopy(List<SectionedItemList> list) {
        TruncateCounter truncateCounter = new TruncateCounter(100);
        ArrayList arrayList = new ArrayList();
        for (SectionedItemList sectionedItemList : list) {
            arrayList.add(SectionedItemList.create(truncate(sectionedItemList.getItemList(), truncateCounter), sectionedItemList.getHeader().toCharSequence()));
            if (truncateCounter.remainingItems() <= 0) {
                break;
            }
        }
        return arrayList;
    }

    public static ItemList truncate(ItemList itemList, TruncateCounter truncateCounter) {
        ItemList.Builder builder = new ItemList.Builder(itemList);
        builder.clearItems();
        for (Item item : itemList.getItems()) {
            if (item instanceof ConversationItem) {
                ConversationItem conversationItem = (ConversationItem) item;
                if (!truncateCounter.canFit(2)) {
                    break;
                }
                ConversationItem.Builder builder2 = new ConversationItem.Builder(conversationItem);
                int iMin = Math.min(truncateCounter.decrement(), 10);
                int size = conversationItem.getMessages().size();
                int iMin2 = Math.min(size, iMin);
                builder2.setMessages(conversationItem.getMessages().subList(size - iMin2, size));
                builder.addItem(builder2.build());
                truncateCounter.decrement(iMin2);
            } else {
                if (!truncateCounter.canFit(1)) {
                    break;
                }
                builder.addItem(item);
                truncateCounter.decrement();
            }
        }
        return builder.build();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListTemplate)) {
            return false;
        }
        ListTemplate listTemplate = (ListTemplate) obj;
        return this.mIsLoading == listTemplate.mIsLoading && Objects.equals(this.mTitle, listTemplate.mTitle) && Objects.equals(this.mHeaderAction, listTemplate.mHeaderAction) && Objects.equals(this.mSingleList, listTemplate.mSingleList) && Objects.equals(this.mSectionedLists, listTemplate.mSectionedLists) && Objects.equals(this.mActionStrip, listTemplate.mActionStrip) && Objects.equals(this.mActions, listTemplate.mActions) && Objects.equals(this.mHeader, listTemplate.mHeader);
    }

    @Deprecated
    public ActionStrip getActionStrip() {
        return this.mActionStrip;
    }

    @RequiresCarApi(6)
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

    public List<SectionedItemList> getSectionedLists() {
        return CollectionUtils.emptyIfNull(this.mSectionedLists);
    }

    public ItemList getSingleList() {
        return this.mSingleList;
    }

    @Deprecated
    public CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.mIsLoading), this.mTitle, this.mHeaderAction, this.mSingleList, this.mSectionedLists, this.mActionStrip, this.mHeader);
    }

    public boolean isLoading() {
        return this.mIsLoading;
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        return "ListTemplate";
    }

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    public static final class Builder {
        ActionStrip mActionStrip;
        final List<Action> mActions;
        boolean mHasSelectableList;
        Header mHeader;
        Action mHeaderAction;
        boolean mIsLoading;
        final List<SectionedItemList> mSectionedLists;
        ItemList mSingleList;
        CarText mTitle;

        public Builder() {
            this.mSectionedLists = new ArrayList();
            this.mActions = new ArrayList();
        }

        @RequiresCarApi(6)
        public Builder addAction(Action action) {
            ArrayList arrayList = new ArrayList(this.mActions);
            Objects.requireNonNull(action);
            arrayList.add(action);
            ActionsConstraints.ACTIONS_CONSTRAINTS_FAB.validateOrThrow(arrayList);
            this.mActions.add(action);
            return this;
        }

        public Builder addSectionedList(SectionedItemList sectionedItemList) {
            Objects.requireNonNull(sectionedItemList);
            if (sectionedItemList.getHeader().toString().length() == 0) {
                throw new IllegalArgumentException("Header cannot be empty");
            }
            ItemList itemList = sectionedItemList.getItemList();
            boolean z = itemList.getOnSelectedDelegate() != null;
            if (this.mHasSelectableList || (z && !this.mSectionedLists.isEmpty())) {
                throw new IllegalArgumentException("A selectable list cannot be added alongside any other lists");
            }
            this.mHasSelectableList = z;
            if (itemList.getItems().isEmpty()) {
                throw new IllegalArgumentException("List cannot be empty");
            }
            if (itemList.getOnItemVisibilityChangedDelegate() != null) {
                throw new IllegalArgumentException("OnItemVisibilityChangedListener in the list is disallowed");
            }
            this.mSingleList = null;
            this.mSectionedLists.add(sectionedItemList);
            return this;
        }

        public ListTemplate build() {
            boolean z = (this.mSingleList == null && this.mSectionedLists.isEmpty()) ? false : true;
            if (this.mIsLoading == z) {
                throw new IllegalStateException("Template is in a loading state but lists are added, or vice versa");
            }
            if (z) {
                if (this.mSectionedLists.isEmpty()) {
                    ItemList itemList = this.mSingleList;
                    if (itemList != null) {
                        RowListConstraints.ROW_LIST_CONSTRAINTS_FULL_LIST.validateOrThrow(itemList);
                    }
                } else {
                    RowListConstraints.ROW_LIST_CONSTRAINTS_FULL_LIST.validateOrThrow(this.mSectionedLists);
                }
            }
            if (this.mSectionedLists.isEmpty()) {
                ItemList itemList2 = this.mSingleList;
                if (itemList2 != null) {
                    this.mSingleList = ListTemplate.truncate(itemList2, new TruncateCounter(100));
                }
            } else {
                List<SectionedItemList> truncatedCopy = ListTemplate.getTruncatedCopy(this.mSectionedLists);
                this.mSectionedLists.clear();
                this.mSectionedLists.addAll(truncatedCopy);
            }
            return new ListTemplate(this);
        }

        public Builder clearSectionedLists() {
            this.mSectionedLists.clear();
            return this;
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
            ActionsConstraints actionsConstraints = ActionsConstraints.ACTIONS_CONSTRAINTS_HEADER;
            Objects.requireNonNull(action);
            actionsConstraints.validateOrThrow(Collections.singletonList(action));
            this.mHeaderAction = action;
            return this;
        }

        public Builder setLoading(boolean z) {
            this.mIsLoading = z;
            return this;
        }

        public Builder setSingleList(ItemList itemList) {
            Objects.requireNonNull(itemList);
            this.mSingleList = itemList;
            this.mSectionedLists.clear();
            this.mHasSelectableList = false;
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

        public Builder(ListTemplate listTemplate) {
            this.mIsLoading = listTemplate.isLoading();
            this.mHeaderAction = listTemplate.getHeaderAction();
            this.mTitle = listTemplate.getTitle();
            this.mSingleList = listTemplate.getSingleList();
            this.mSectionedLists = new ArrayList(listTemplate.getSectionedLists());
            this.mActionStrip = listTemplate.getActionStrip();
            this.mActions = new ArrayList(listTemplate.getActions());
            this.mHeader = listTemplate.getHeader();
        }
    }

    private ListTemplate() {
        this.mIsLoading = false;
        this.mTitle = null;
        this.mHeaderAction = null;
        this.mSingleList = null;
        List list = Collections.EMPTY_LIST;
        this.mSectionedLists = list;
        this.mActionStrip = null;
        this.mActions = list;
        this.mHeader = null;
    }
}
