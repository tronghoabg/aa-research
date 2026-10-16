package androidx.car.app.model;

import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.model.constraints.ActionsConstraints;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
@CarProtocol
/* loaded from: classes.dex */
public final class SectionedItemTemplate implements Template {
    private final List<Action> mActions;
    private final Header mHeader;
    private final boolean mIsAlphabeticalIndexingAllowed;
    private final boolean mIsLoading;
    private final List<Section<?>> mSections;

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SectionedItemTemplate)) {
            return false;
        }
        SectionedItemTemplate sectionedItemTemplate = (SectionedItemTemplate) obj;
        return Objects.equals(this.mSections, sectionedItemTemplate.mSections) && Objects.equals(this.mActions, sectionedItemTemplate.mActions) && Objects.equals(this.mHeader, sectionedItemTemplate.mHeader) && this.mIsLoading == sectionedItemTemplate.mIsLoading && this.mIsAlphabeticalIndexingAllowed == sectionedItemTemplate.mIsAlphabeticalIndexingAllowed;
    }

    public List<Action> getActions() {
        return this.mActions;
    }

    public Header getHeader() {
        return this.mHeader;
    }

    public List<Section<?>> getSections() {
        return this.mSections;
    }

    public int hashCode() {
        return Objects.hash(this.mSections, this.mActions, this.mHeader, Boolean.valueOf(this.mIsLoading), Boolean.valueOf(this.mIsAlphabeticalIndexingAllowed));
    }

    public boolean isAlphabeticalIndexingAllowed() {
        return this.mIsAlphabeticalIndexingAllowed;
    }

    public boolean isLoading() {
        return this.mIsLoading;
    }

    public String toString() {
        return "SectionedItemTemplate";
    }

    private SectionedItemTemplate() {
        List list = Collections.EMPTY_LIST;
        this.mSections = list;
        this.mActions = list;
        this.mHeader = null;
        this.mIsLoading = false;
        this.mIsAlphabeticalIndexingAllowed = false;
    }

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    public static final class Builder {
        private List<Action> mActions;
        private Header mHeader;
        private boolean mIsAlphabeticalIndexingAllowed;
        private boolean mIsLoading;
        private List<Section<?>> mSections;

        public Builder() {
            this.mSections = new ArrayList();
            this.mActions = new ArrayList();
            this.mHeader = null;
            this.mIsLoading = false;
            this.mIsAlphabeticalIndexingAllowed = false;
        }

        public Builder addAction(Action action) {
            ArrayList arrayList = new ArrayList(this.mActions);
            arrayList.add(action);
            ActionsConstraints.ACTIONS_CONSTRAINTS_FAB.validateOrThrow(arrayList);
            this.mActions.add(action);
            return this;
        }

        public Builder addSection(Section<?> section) {
            this.mSections.add(section);
            return this;
        }

        public SectionedItemTemplate build() {
            if (this.mIsLoading && !this.mSections.isEmpty()) {
                throw new IllegalArgumentException("A template cannot both be in a loading state and have sections added");
            }
            for (Section<?> section : this.mSections) {
                if (!(section instanceof RowSection) && !(section instanceof GridSection)) {
                    throw new IllegalArgumentException("Only RowSections and GridSections are allowed in SectionedItemTemplate.");
                }
            }
            return new SectionedItemTemplate(this);
        }

        public Builder clearActions() {
            this.mActions.clear();
            return this;
        }

        public Builder clearSections() {
            this.mSections.clear();
            return this;
        }

        public Builder setActions(List<Action> list) {
            ActionsConstraints.ACTIONS_CONSTRAINTS_FAB.validateOrThrow(list);
            this.mActions = list;
            return this;
        }

        public Builder setAlphabeticalIndexingAllowed(boolean z) {
            this.mIsAlphabeticalIndexingAllowed = z;
            return this;
        }

        public Builder setHeader(Header header) {
            this.mHeader = header;
            return this;
        }

        public Builder setLoading(boolean z) {
            this.mIsLoading = z;
            return this;
        }

        public Builder setSections(List<Section<?>> list) {
            this.mSections = list;
            return this;
        }

        public Builder(SectionedItemTemplate sectionedItemTemplate) {
            this.mSections = new ArrayList();
            this.mActions = new ArrayList();
            this.mHeader = null;
            this.mIsLoading = false;
            this.mIsAlphabeticalIndexingAllowed = false;
            this.mSections = sectionedItemTemplate.mSections;
            this.mActions = sectionedItemTemplate.mActions;
            this.mHeader = sectionedItemTemplate.mHeader;
            this.mIsLoading = sectionedItemTemplate.mIsLoading;
            this.mIsAlphabeticalIndexingAllowed = sectionedItemTemplate.mIsAlphabeticalIndexingAllowed;
        }
    }

    private SectionedItemTemplate(Builder builder) {
        this.mSections = Collections.unmodifiableList(builder.mSections);
        this.mActions = Collections.unmodifiableList(builder.mActions);
        this.mHeader = builder.mHeader;
        this.mIsLoading = builder.mIsLoading;
        this.mIsAlphabeticalIndexingAllowed = builder.mIsAlphabeticalIndexingAllowed;
    }
}
