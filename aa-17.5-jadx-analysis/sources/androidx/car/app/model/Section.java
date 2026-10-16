package androidx.car.app.model;

import androidx.car.app.serialization.ListDelegateImpl;
import defpackage.rb;
import defpackage.uf;
import defpackage.uw;
import defpackage.vn;
import defpackage.xs;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.Collections;

@rb
/* loaded from: classes2.dex */
public abstract class Section<T extends uf> {
    private final xs<T> mItemsDelegate;
    private final CarText mNoItemsMessage;
    private final uw mOnItemVisibilityChangedDelegate;
    private final SectionHeader mSectionHeader;
    private final CarText mTitle;

    protected Section(vn<T, ?> vnVar) {
        this.mItemsDelegate = new ListDelegateImpl(DesugarCollections.unmodifiableList(vnVar.c));
        CarText carText = vnVar.d;
        this.mTitle = null;
        SectionHeader sectionHeader = vnVar.e;
        this.mSectionHeader = null;
        CarText carText2 = vnVar.f;
        this.mNoItemsMessage = null;
        uw uwVar = vnVar.g;
        this.mOnItemVisibilityChangedDelegate = null;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Section)) {
            return false;
        }
        Section section = (Section) obj;
        if (Objects.equals(this.mItemsDelegate, section.mItemsDelegate) && Objects.equals(this.mTitle, section.mTitle) && Objects.equals(this.mSectionHeader, section.mSectionHeader) && Objects.equals(this.mNoItemsMessage, section.mNoItemsMessage)) {
            if (Objects.equals(Boolean.valueOf(this.mOnItemVisibilityChangedDelegate == null), Boolean.valueOf(section.mOnItemVisibilityChangedDelegate == null))) {
                return true;
            }
        }
        return false;
    }

    public xs<T> getItemsDelegate() {
        return this.mItemsDelegate;
    }

    public CarText getNoItemsMessage() {
        return this.mNoItemsMessage;
    }

    public uw getOnItemVisibilityChangedDelegate() {
        return this.mOnItemVisibilityChangedDelegate;
    }

    public SectionHeader getSectionHeader() {
        return this.mSectionHeader;
    }

    public CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return Objects.hash(this.mItemsDelegate, this.mTitle, this.mSectionHeader, this.mNoItemsMessage, Boolean.valueOf(this.mOnItemVisibilityChangedDelegate == null));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Section { title: ");
        sb.append(this.mTitle);
        sb.append(", sectionHeader: ");
        sb.append(this.mSectionHeader);
        sb.append(", noItemsMessage: ");
        sb.append(this.mNoItemsMessage);
        sb.append(", itemsDelegate: ");
        sb.append(this.mItemsDelegate);
        sb.append(", onItemVisibilityChangedDelegate: ");
        sb.append(this.mOnItemVisibilityChangedDelegate != null);
        return sb.toString();
    }

    protected Section() {
        this.mItemsDelegate = new ListDelegateImpl(Collections.EMPTY_LIST);
        this.mTitle = null;
        this.mSectionHeader = null;
        this.mNoItemsMessage = null;
        this.mOnItemVisibilityChangedDelegate = null;
    }
}
