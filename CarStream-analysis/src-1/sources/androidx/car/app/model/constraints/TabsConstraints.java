package androidx.car.app.model.constraints;

import androidx.car.app.annotations.RequiresCarApi;
import androidx.car.app.model.Alert;
import androidx.car.app.model.Tab;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
@RequiresCarApi(6)
/* loaded from: classes.dex */
public class TabsConstraints {
    public static final TabsConstraints DEFAULT = new Builder().setMaxTabs(4).setMinTabs(2).build();
    private static final int MAXIMUM_ALLOWED_TABS = 4;
    private static final int MINIMUM_REQUIRED_TABS = 2;
    private final int mMaxTabs;
    private final int mMinTabs;

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    public static final class Builder {
        int mMaxTabs = Alert.DURATION_SHOW_INDEFINITELY;
        int mMinTabs = 0;

        public TabsConstraints build() {
            return new TabsConstraints(this);
        }

        public Builder setMaxTabs(int i) {
            this.mMaxTabs = i;
            return this;
        }

        public Builder setMinTabs(int i) {
            this.mMinTabs = i;
            return this;
        }
    }

    public TabsConstraints(Builder builder) {
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
        boolean z = false;
        for (Tab tab : list) {
            if (str.equals(tab.getContentId())) {
                z = true;
            }
            if (!hashSet.add(tab.getContentId())) {
                throw new IllegalArgumentException("Found duplicate tab ID: " + tab.getContentId() + ". Each tab must have a unique ID.");
            }
        }
        if (!z) {
            throw new IllegalArgumentException("There is no tab with content ID matching the active tab content ID set on the template");
        }
    }
}
