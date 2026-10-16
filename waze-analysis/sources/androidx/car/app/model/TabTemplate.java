package androidx.car.app.model;

import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.annotations.RequiresCarApi;
import androidx.car.app.model.constraints.ActionsConstraints;
import androidx.car.app.model.constraints.TabsConstraints;
import androidx.car.app.utils.CollectionUtils;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: WazeSource */
@CarProtocol
@RequiresCarApi(6)
/* loaded from: classes2.dex */
public class TabTemplate implements Template {
    private final String mActiveTabContentId;
    private final Action mHeaderAction;
    private final boolean mIsLoading;
    private final TabCallbackDelegate mTabCallbackDelegate;
    private final TabContents mTabContents;
    private final List<Tab> mTabs;

    TabTemplate(Builder builder) {
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
        return this.mIsLoading == tabTemplate.mIsLoading && Objects.equals(this.mHeaderAction, tabTemplate.mHeaderAction) && Objects.equals(this.mTabs, tabTemplate.mTabs) && Objects.equals(this.mTabContents, tabTemplate.mTabContents) && Objects.equals(this.mActiveTabContentId, tabTemplate.mActiveTabContentId);
    }

    public String getActiveTabContentId() {
        return (String) Objects.requireNonNull(this.mActiveTabContentId);
    }

    public Action getHeaderAction() {
        return (Action) Objects.requireNonNull(this.mHeaderAction);
    }

    public TabCallbackDelegate getTabCallbackDelegate() {
        return (TabCallbackDelegate) Objects.requireNonNull(this.mTabCallbackDelegate);
    }

    public TabContents getTabContents() {
        return (TabContents) Objects.requireNonNull(this.mTabContents);
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

    private TabTemplate() {
        this.mIsLoading = false;
        this.mHeaderAction = null;
        this.mTabs = Collections.EMPTY_LIST;
        this.mTabContents = null;
        this.mTabCallbackDelegate = null;
        this.mActiveTabContentId = null;
    }

    /* compiled from: WazeSource */
    public interface TabCallback {
        void onTabSelected(String str);

        /* compiled from: WazeSource */
        /* renamed from: androidx.car.app.model.TabTemplate$TabCallback$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
            public static void $default$onTabSelected(TabCallback tabCallback, String str) {
            }
        }
    }

    /* compiled from: WazeSource */
    public final class Builder {
        String mActiveTabContentId;
        Action mHeaderAction;
        boolean mIsLoading;
        final TabCallbackDelegate mTabCallbackDelegate;
        TabContents mTabContents;
        final List<Tab> mTabs;

        public Builder(TabTemplate tabTemplate) {
            this.mIsLoading = tabTemplate.isLoading();
            this.mHeaderAction = tabTemplate.getHeaderAction();
            this.mTabs = new ArrayList(tabTemplate.getTabs());
            this.mTabContents = tabTemplate.getTabContents();
            this.mTabCallbackDelegate = tabTemplate.getTabCallbackDelegate();
            this.mActiveTabContentId = tabTemplate.getActiveTabContentId();
        }

        public Builder addTab(Tab tab) {
            Objects.requireNonNull(tab);
            this.mTabs.add(tab);
            return this;
        }

        public TabTemplate build() {
            boolean z = false;
            if (this.mTabContents != null && !this.mTabs.isEmpty()) {
                z = true;
            }
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
            if (z && this.mActiveTabContentId != null) {
                TabsConstraints.DEFAULT.validateOrThrow(this.mTabs, this.mActiveTabContentId);
            }
            if (this.mIsLoading || this.mHeaderAction != null) {
                return new TabTemplate(this);
            }
            throw new IllegalArgumentException("Template requires a Header Action of TYPE_APP_ICON when not in Loading state");
        }

        public Builder setActiveTabContentId(String str) {
            if (((String) Objects.requireNonNull(str)).isEmpty()) {
                throw new IllegalArgumentException("The content ID cannot be null or empty");
            }
            this.mActiveTabContentId = str;
            return this;
        }

        public Builder setHeaderAction(Action action) {
            ActionsConstraints.ACTIONS_CONSTRAINTS_TABS.validateOrThrow(Collections.singletonList((Action) Objects.requireNonNull(action)));
            this.mHeaderAction = action;
            return this;
        }

        public Builder setLoading(boolean z) {
            this.mIsLoading = z;
            return this;
        }

        public Builder setTabContents(TabContents tabContents) {
            this.mTabContents = (TabContents) Objects.requireNonNull(tabContents);
            return this;
        }

        public Builder(TabCallback tabCallback) {
            this.mTabCallbackDelegate = TabCallbackDelegateImpl.create((TabCallback) Objects.requireNonNull(tabCallback));
            this.mTabs = new ArrayList();
        }
    }
}
