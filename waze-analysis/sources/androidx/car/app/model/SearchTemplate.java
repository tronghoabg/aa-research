package androidx.car.app.model;

import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.model.constraints.ActionsConstraints;
import androidx.car.app.model.constraints.RowListConstraints;
import j$.util.Objects;
import java.util.Collections;

/* compiled from: WazeSource */
@CarProtocol
/* loaded from: classes2.dex */
public final class SearchTemplate implements Template {
    private final ActionStrip mActionStrip;
    private final Action mHeaderAction;
    private final String mInitialSearchText;
    private final boolean mIsLoading;
    private final ItemList mItemList;
    private final SearchCallbackDelegate mSearchCallbackDelegate;
    private final String mSearchHint;
    private final boolean mShowKeyboardByDefault;

    /* compiled from: WazeSource */
    public final class Builder {
        ActionStrip mActionStrip;
        Action mHeaderAction;
        String mInitialSearchText;
        boolean mIsLoading;
        ItemList mItemList;
        final SearchCallbackDelegate mSearchCallbackDelegate;
        String mSearchHint;
        boolean mShowKeyboardByDefault = true;

        public Builder(SearchCallback searchCallback) {
            this.mSearchCallbackDelegate = SearchCallbackDelegateImpl.create(searchCallback);
        }

        public SearchTemplate build() {
            if (!this.mIsLoading || this.mItemList == null) {
                return new SearchTemplate(this);
            }
            throw new IllegalArgumentException("Template is in a loading state but a list is set");
        }

        public Builder setActionStrip(ActionStrip actionStrip) {
            ActionsConstraints.ACTIONS_CONSTRAINTS_SIMPLE.validateOrThrow(((ActionStrip) Objects.requireNonNull(actionStrip)).getActions());
            this.mActionStrip = actionStrip;
            return this;
        }

        public Builder setHeaderAction(Action action) {
            ActionsConstraints.ACTIONS_CONSTRAINTS_HEADER.validateOrThrow(Collections.singletonList((Action) Objects.requireNonNull(action)));
            this.mHeaderAction = action;
            return this;
        }

        public Builder setInitialSearchText(String str) {
            this.mInitialSearchText = (String) Objects.requireNonNull(str);
            return this;
        }

        public Builder setItemList(ItemList itemList) {
            RowListConstraints.ROW_LIST_CONSTRAINTS_SIMPLE.validateOrThrow((ItemList) Objects.requireNonNull(itemList));
            this.mItemList = itemList;
            return this;
        }

        public Builder setLoading(boolean z) {
            this.mIsLoading = z;
            return this;
        }

        public Builder setSearchHint(String str) {
            this.mSearchHint = (String) Objects.requireNonNull(str);
            return this;
        }

        public Builder setShowKeyboardByDefault(boolean z) {
            this.mShowKeyboardByDefault = z;
            return this;
        }
    }

    SearchTemplate(Builder builder) {
        this.mInitialSearchText = builder.mInitialSearchText;
        this.mSearchHint = builder.mSearchHint;
        this.mIsLoading = builder.mIsLoading;
        this.mItemList = builder.mItemList;
        this.mSearchCallbackDelegate = builder.mSearchCallbackDelegate;
        this.mShowKeyboardByDefault = builder.mShowKeyboardByDefault;
        this.mHeaderAction = builder.mHeaderAction;
        this.mActionStrip = builder.mActionStrip;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchTemplate)) {
            return false;
        }
        SearchTemplate searchTemplate = (SearchTemplate) obj;
        return this.mIsLoading == searchTemplate.mIsLoading && Objects.equals(this.mInitialSearchText, searchTemplate.mInitialSearchText) && Objects.equals(this.mSearchHint, searchTemplate.mSearchHint) && Objects.equals(this.mItemList, searchTemplate.mItemList) && Objects.equals(this.mHeaderAction, searchTemplate.mHeaderAction) && Objects.equals(this.mActionStrip, searchTemplate.mActionStrip) && this.mShowKeyboardByDefault == searchTemplate.mShowKeyboardByDefault;
    }

    public ActionStrip getActionStrip() {
        return this.mActionStrip;
    }

    public Action getHeaderAction() {
        return this.mHeaderAction;
    }

    public String getInitialSearchText() {
        return this.mInitialSearchText;
    }

    public ItemList getItemList() {
        return this.mItemList;
    }

    public SearchCallbackDelegate getSearchCallbackDelegate() {
        return (SearchCallbackDelegate) Objects.requireNonNull(this.mSearchCallbackDelegate);
    }

    public String getSearchHint() {
        return this.mSearchHint;
    }

    public int hashCode() {
        return Objects.hash(this.mInitialSearchText, Boolean.valueOf(this.mIsLoading), this.mSearchHint, this.mItemList, Boolean.valueOf(this.mShowKeyboardByDefault), this.mHeaderAction, this.mActionStrip);
    }

    public boolean isLoading() {
        return this.mIsLoading;
    }

    public boolean isShowKeyboardByDefault() {
        return this.mShowKeyboardByDefault;
    }

    public String toString() {
        return "SearchTemplate";
    }

    /* compiled from: WazeSource */
    public interface SearchCallback {
        void onSearchSubmitted(String str);

        void onSearchTextChanged(String str);

        /* compiled from: WazeSource */
        /* renamed from: androidx.car.app.model.SearchTemplate$SearchCallback$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
            public static void $default$onSearchSubmitted(SearchCallback searchCallback, String str) {
            }

            public static void $default$onSearchTextChanged(SearchCallback searchCallback, String str) {
            }
        }
    }

    private SearchTemplate() {
        this.mInitialSearchText = null;
        this.mSearchHint = null;
        this.mIsLoading = false;
        this.mItemList = null;
        this.mHeaderAction = null;
        this.mActionStrip = null;
        this.mSearchCallbackDelegate = null;
        this.mShowKeyboardByDefault = true;
    }
}
