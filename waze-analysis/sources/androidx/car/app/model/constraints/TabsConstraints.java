package androidx.car.app.model.constraints;

import androidx.car.app.annotations.RequiresCarApi;
import androidx.car.app.model.Tab;
import java.util.HashSet;
import java.util.List;

/* compiled from: WazeSource */
@RequiresCarApi(6)
/* loaded from: classes2.dex */
public class TabsConstraints {
    public static final TabsConstraints DEFAULT;
    private static final int MAXIMUM_ALLOWED_TABS = 4;
    private static final int MINIMUM_REQUIRED_TABS = 2;
    private final int mMaxTabs;
    private final int mMinTabs;

    /* compiled from: WazeSource */
    public final class Builder {
        int mMaxTabs = Integer.MAX_VALUE;
        int mMinTabs = 0;

        public TabsConstraints build() {
            return new TabsConstraints(this);
        }

        public Builder setMaxTabs(int i2) {
            this.mMaxTabs = i2;
            return this;
        }

        public Builder setMinTabs(int i2) {
            this.mMinTabs = i2;
            return this;
        }
    }

    static {
        Builder builder = new Builder();
        builder.setMaxTabs(4);
        builder.setMinTabs(2);
        DEFAULT = builder.build();
    }

    TabsConstraints(Builder builder) {
        this.mMaxTabs = builder.mMaxTabs;
        this.mMinTabs = builder.mMinTabs;
    }

    public void validateOrThrow(List<Tab> list, String str) {
        if (list.size() < this.mMinTabs) {
            throw new IllegalArgumentException("There must be at least " + this.mMinTabs + " tab(s) added, but only found " + list.size());
        }
        if (list.size() > this.mMaxTabs) {
            throw new IllegalArgumentException("There cannot be more than " + this.mMaxTabs + " tabs added, found " + list.size());
        }
        HashSet hashSet = new HashSet();
        boolean zEquals = false;
        for (Tab tab : list) {
            zEquals |= str.equals(tab.getContentId());
            if (!hashSet.add(tab.getContentId())) {
                throw new IllegalArgumentException("Found duplicate tab ID: " + tab.getContentId() + ". Each tab must have a unique ID.");
            }
        }
        if (!zEquals) {
            throw new IllegalArgumentException("There is no tab with content ID matching the active tab content ID set on the template");
        }
    }
}
