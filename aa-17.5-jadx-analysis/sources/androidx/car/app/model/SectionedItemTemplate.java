package androidx.car.app.model;

import defpackage.rb;
import defpackage.vp;
import defpackage.vq;
import defpackage.wb;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.Collections;
import java.util.List;

@rb
/* loaded from: classes2.dex */
public final class SectionedItemTemplate implements wb {
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

    private SectionedItemTemplate(vp vpVar) {
        this.mSections = DesugarCollections.unmodifiableList(vpVar.a);
        this.mActions = DesugarCollections.unmodifiableList(vpVar.b);
        this.mHeader = vpVar.c;
        this.mIsLoading = vpVar.d;
        this.mIsAlphabeticalIndexingAllowed = vpVar.e;
        this.mAlphabeticalIndexingStrategy = vpVar.f;
        this.mScrollStatePersistenceStrategy = vpVar.g;
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
        int i = this.mAlphabeticalIndexingStrategy;
        return i == 0 ? !this.mIsAlphabeticalIndexingAllowed ? 0 : 2 : i;
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

    public /* synthetic */ SectionedItemTemplate(vp vpVar, vq vqVar) {
        this(vpVar);
    }
}
