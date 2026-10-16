package androidx.car.app.model;

import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.annotations.RequiresCarApi;
import androidx.car.app.model.constraints.ActionsConstraints;
import androidx.car.app.model.constraints.TabsConstraints;
import androidx.car.app.utils.CollectionUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
@CarProtocol
@RequiresCarApi(6)
/* loaded from: classes.dex */
public class TabTemplate implements Template {
    private final String mActiveTabContentId;
    private final Action mHeaderAction;
    private final boolean mIsLoading;
    private final TabCallbackDelegate mTabCallbackDelegate;
    private final TabContents mTabContents;
    private final List<Tab> mTabs;

    public TabTemplate(Builder builder) {
        this.mIsLoading = builder.mIsLoading;
        this.mHeaderAction = builder.mHeaderAction;
        this.mTabs = CollectionUtils.unmodifiableCopy(builder.mTabs);
        this.mTabContents = builder.mTabContents;
        this.mTabCallbackDelegate = builder.mTabCallbackDelegate;
        this.mActiveTabContentId = builder.mActiveTabContentId;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TabTemplate)) {
            return false;
        }
        TabTemplate tabTemplate = (TabTemplate) obj;
        return this.mIsLoading == tabTemplate.mIsLoading && Objects.equals(this.mHeaderAction, tabTemplate.mHeaderAction) && Objects.equals(this.mTabs, tabTemplate.mTabs) && Objects.equals(this.mTabContents, tabTemplate.mTabContents) && Objects.equals(this.mActiveTabContentId, tabTemplate.getActiveTabContentId());
    }

    public String getActiveTabContentId() {
        String str = this.mActiveTabContentId;
        Objects.requireNonNull(str);
        return str;
    }

    public Action getHeaderAction() {
        Action action = this.mHeaderAction;
        Objects.requireNonNull(action);
        return action;
    }

    public TabCallbackDelegate getTabCallbackDelegate() {
        TabCallbackDelegate tabCallbackDelegate = this.mTabCallbackDelegate;
        Objects.requireNonNull(tabCallbackDelegate);
        return tabCallbackDelegate;
    }

    public TabContents getTabContents() {
        TabContents tabContents = this.mTabContents;
        Objects.requireNonNull(tabContents);
        return tabContents;
    }

    public List<Tab> getTabs() {
        return CollectionUtils.emptyIfNull(this.mTabs);
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.mIsLoading), this.mHeaderAction, this.mTabs, this.mTabContents, this.mActiveTabContentId);
    }

    public boolean isLoading() {
        return this.mIsLoading;
    }

    public String toString() {
        return "TabTemplate";
    }

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    public static final class Builder {
        String mActiveTabContentId;
        Action mHeaderAction;
        boolean mIsLoading;
        final TabCallbackDelegate mTabCallbackDelegate;
        TabContents mTabContents;
        final List<Tab> mTabs;

        public Builder(TabCallback tabCallback) {
            Objects.requireNonNull(tabCallback);
            this.mTabCallbackDelegate = TabCallbackDelegateImpl.create(tabCallback);
            this.mTabs = new ArrayList();
        }

        public Builder addTab(Tab tab) {
            Objects.requireNonNull(tab);
            this.mTabs.add(tab);
            return this;
        }

        public TabTemplate build() {
            String str;
            boolean z = (this.mTabContents == null || this.mTabs.isEmpty()) ? false : true;
            boolean z2 = this.mIsLoading;
            if (z2 && z) {
                throw new IllegalStateException("Template is in a loading state but tabs are added");
            }
            if (!z2 && !z) {
                throw new IllegalStateException("Template is not in a loading state but does not contain tabs or tab contents");
            }
            if (z && this.mActiveTabContentId == null) {
                throw new IllegalStateException("Template requires setting content ID for the active tab when not in Loading state");
            }
            if (z && (str = this.mActiveTabContentId) != null) {
                TabsConstraints.DEFAULT.validateOrThrow(this.mTabs, str);
            }
            if (this.mIsLoading || this.mHeaderAction != null) {
                return new TabTemplate(this);
            }
            throw new IllegalArgumentException("Template requires a Header Action of TYPE_APP_ICON when not in Loading state");
        }

        public Builder setActiveTabContentId(String str) {
            Objects.requireNonNull(str);
            if (str.isEmpty()) {
                throw new IllegalArgumentException("The content ID cannot be null or empty");
            }
            this.mActiveTabContentId = str;
            return this;
        }

        public Builder setHeaderAction(Action action) {
            ActionsConstraints actionsConstraints = ActionsConstraints.ACTIONS_CONSTRAINTS_TABS;
            Objects.requireNonNull(action);
            actionsConstraints.validateOrThrow(Collections.singletonList(action));
            this.mHeaderAction = action;
            return this;
        }

        public Builder setLoading(boolean z) {
            this.mIsLoading = z;
            return this;
        }

        public Builder setTabContents(TabContents tabContents) {
            Objects.requireNonNull(tabContents);
            this.mTabContents = tabContents;
            return this;
        }

        public Builder(TabTemplate tabTemplate) {
            this.mIsLoading = tabTemplate.isLoading();
            this.mHeaderAction = tabTemplate.getHeaderAction();
            this.mTabs = new ArrayList(tabTemplate.getTabs());
            this.mTabContents = tabTemplate.getTabContents();
            this.mTabCallbackDelegate = tabTemplate.getTabCallbackDelegate();
            this.mActiveTabContentId = tabTemplate.getActiveTabContentId();
        }
    }

    private TabTemplate() {
        this.mIsLoading = false;
        this.mHeaderAction = null;
        this.mTabs = Collections.EMPTY_LIST;
        this.mTabContents = null;
        this.mTabCallbackDelegate = null;
        this.mActiveTabContentId = null;
    }

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    public interface TabCallback {
        default void onTabSelected(String str) {
        }
    }
}
