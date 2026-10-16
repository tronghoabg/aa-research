package androidx.car.app.model;

import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.annotations.RequiresCarApi;
import androidx.car.app.model.constraints.ActionsConstraints;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: WazeSource */
@CarProtocol
@RequiresCarApi(8)
/* loaded from: classes2.dex */
public final class SectionedItemTemplate implements Template {
    public static final int ALPHABETICAL_INDEXING_DISABLED = 0;
    public static final int ALPHABETICAL_INDEXING_TITLE_AS_IS = 1;
    public static final int ALPHABETICAL_INDEXING_TITLE_IGNORE_ARTICLES_AND_SYMBOLS = 2;
    public static final int SCROLL_STATE_PRESERVE_INDEX = 1;
    public static final int SCROLL_STATE_RESET_TO_TOP = 0;
    private final List<Action> mActions;
    private final int mAlphabeticalIndexingStrategy;
    private final Header mHeader;

    @Deprecated
    private final boolean mIsAlphabeticalIndexingAllowed;
    private final boolean mIsLoading;
    private final int mScrollStatePersistenceStrategy;
    private final List<Section<?>> mSections;

    /* compiled from: WazeSource */
    @Retention(RetentionPolicy.SOURCE)
    public @interface AlphabeticalIndexingStrategy {
    }

    /* compiled from: WazeSource */
    @Retention(RetentionPolicy.SOURCE)
    public @interface ScrollStatePersistenceStrategy {
    }

    private SectionedItemTemplate(Builder builder) {
        this.mSections = DesugarCollections.unmodifiableList(builder.mSections);
        this.mActions = DesugarCollections.unmodifiableList(builder.mActions);
        this.mHeader = builder.mHeader;
        this.mIsLoading = builder.mIsLoading;
        this.mIsAlphabeticalIndexingAllowed = builder.mIsAlphabeticalIndexingAllowed;
        this.mAlphabeticalIndexingStrategy = builder.mAlphabeticalIndexingStrategy;
        this.mScrollStatePersistenceStrategy = builder.mScrollStatePersistenceStrategy;
    }

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
        return Objects.equals(this.mSections, sectionedItemTemplate.mSections) && Objects.equals(this.mActions, sectionedItemTemplate.mActions) && Objects.equals(this.mHeader, sectionedItemTemplate.mHeader) && this.mIsLoading == sectionedItemTemplate.mIsLoading && this.mIsAlphabeticalIndexingAllowed == sectionedItemTemplate.mIsAlphabeticalIndexingAllowed && this.mScrollStatePersistenceStrategy == sectionedItemTemplate.mScrollStatePersistenceStrategy;
    }

    public List<Action> getActions() {
        return this.mActions;
    }

    public int getAlphabeticalIndexingStrategy() {
        int i2 = this.mAlphabeticalIndexingStrategy;
        return i2 == 0 ? !this.mIsAlphabeticalIndexingAllowed ? 0 : 2 : i2;
    }

    public Header getHeader() {
        return this.mHeader;
    }

    public int getScrollStatePersistenceStrategy() {
        return this.mScrollStatePersistenceStrategy;
    }

    public List<Section<?>> getSections() {
        return this.mSections;
    }

    public int hashCode() {
        return Objects.hash(this.mSections, this.mActions, this.mHeader, Boolean.valueOf(this.mIsLoading), Boolean.valueOf(this.mIsAlphabeticalIndexingAllowed), Integer.valueOf(this.mScrollStatePersistenceStrategy));
    }

    @Deprecated
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
        this.mSections = Collections.EMPTY_LIST;
        this.mActions = Collections.EMPTY_LIST;
        this.mHeader = null;
        this.mIsLoading = false;
        this.mIsAlphabeticalIndexingAllowed = false;
        this.mAlphabeticalIndexingStrategy = 0;
        this.mScrollStatePersistenceStrategy = 1;
    }

    /* compiled from: WazeSource */
    public final class Builder {
        private List<Action> mActions;
        private int mAlphabeticalIndexingStrategy;
        private Header mHeader;
        private boolean mIsAlphabeticalIndexingAllowed;
        private boolean mIsLoading;
        private int mScrollStatePersistenceStrategy;
        private List<Section<?>> mSections;

        public Builder(SectionedItemTemplate sectionedItemTemplate) {
            this.mSections = new ArrayList();
            this.mActions = new ArrayList();
            this.mHeader = null;
            this.mIsLoading = false;
            this.mIsAlphabeticalIndexingAllowed = false;
            this.mAlphabeticalIndexingStrategy = 0;
            this.mScrollStatePersistenceStrategy = 1;
            this.mSections = sectionedItemTemplate.mSections;
            this.mActions = sectionedItemTemplate.mActions;
            this.mHeader = sectionedItemTemplate.mHeader;
            this.mIsLoading = sectionedItemTemplate.mIsLoading;
            this.mIsAlphabeticalIndexingAllowed = sectionedItemTemplate.mIsAlphabeticalIndexingAllowed;
            this.mAlphabeticalIndexingStrategy = sectionedItemTemplate.mAlphabeticalIndexingStrategy;
            this.mScrollStatePersistenceStrategy = sectionedItemTemplate.mScrollStatePersistenceStrategy;
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
            boolean z = false;
            for (int i2 = 0; i2 < this.mSections.size(); i2++) {
                Section<?> section = this.mSections.get(i2);
                if (section instanceof ChipSection) {
                    if (z) {
                        throw new IllegalArgumentException("Only one ChipSection is allowed in SectionedItemTemplate.");
                    }
                    if (i2 != 0) {
                        throw new IllegalArgumentException("ChipSection must be the first section in SectionedItemTemplate.");
                    }
                    z = true;
                } else if (!(section instanceof RowSection) && !(section instanceof GridSection) && !(section instanceof CondensedSection) && !(section instanceof SpotlightSection) && !(section instanceof BannerSection)) {
                    throw new IllegalArgumentException("Only ChipSections, RowSections, GridSections, CondensedSections, SpotlightSections, and BannerSections are allowed in SectionedItemTemplate.");
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

        @Deprecated
        public Builder setAlphabeticalIndexingAllowed(boolean z) {
            this.mIsAlphabeticalIndexingAllowed = z;
            return this;
        }

        public Builder setAlphabeticalIndexingStrategy(int i2) {
            this.mAlphabeticalIndexingStrategy = i2;
            this.mIsAlphabeticalIndexingAllowed = i2 != 0;
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

        public Builder setScrollStatePersistenceStrategy(int i2) {
            this.mScrollStatePersistenceStrategy = i2;
            return this;
        }

        public Builder setSections(List<Section<?>> list) {
            this.mSections = list;
            return this;
        }

        public Builder() {
            this.mSections = new ArrayList();
            this.mActions = new ArrayList();
            this.mHeader = null;
            this.mIsLoading = false;
            this.mIsAlphabeticalIndexingAllowed = false;
            this.mAlphabeticalIndexingStrategy = 0;
            this.mScrollStatePersistenceStrategy = 1;
        }
    }
}
