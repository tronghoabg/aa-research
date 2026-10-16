package androidx.car.app.model;

import androidx.car.app.messaging.model.ConversationItem;
import defpackage.rb;
import defpackage.sv;
import defpackage.tl;
import defpackage.ua;
import defpackage.uf;
import defpackage.ug;
import defpackage.uj;
import defpackage.uk;
import defpackage.wb;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

@rb
/* loaded from: classes2.dex */
public final class ListTemplate implements wb {
    static final int MAX_ALLOWED_ITEMS = 100;
    static final int MAX_MESSAGES_PER_CONVERSATION = 10;

    @Deprecated
    private final ActionStrip mActionStrip;
    private final List<Action> mActions;
    private final Header mHeader;

    @Deprecated
    private final Action mHeaderAction;
    private final boolean mIsLoading;
    private final List<SectionedItemList> mSectionedLists;
    private final ItemList mSingleList;

    @Deprecated
    private final CarText mTitle;

    public ListTemplate(uj ujVar) {
        this.mIsLoading = ujVar.a;
        this.mTitle = ujVar.d;
        this.mHeaderAction = ujVar.e;
        this.mSingleList = ujVar.b;
        this.mSectionedLists = tl.b(ujVar.c);
        this.mActionStrip = ujVar.f;
        this.mActions = tl.b(ujVar.h);
        this.mHeader = ujVar.i;
    }

    public static List<SectionedItemList> getTruncatedCopy(List<SectionedItemList> list) {
        uk ukVar = new uk();
        ArrayList arrayList = new ArrayList();
        for (SectionedItemList sectionedItemList : list) {
            arrayList.add(SectionedItemList.create(truncate(sectionedItemList.getItemList(), ukVar), sectionedItemList.getHeader().toCharSequence()));
            if (ukVar.a <= 0) {
                break;
            }
        }
        return arrayList;
    }

    public static ItemList truncate(ItemList itemList, uk ukVar) {
        ug ugVar = new ug(itemList);
        ugVar.a.clear();
        for (uf ufVar : itemList.getItems()) {
            if (ufVar instanceof ConversationItem) {
                ConversationItem conversationItem = (ConversationItem) ufVar;
                if (!ukVar.b(2)) {
                    break;
                }
                sv svVar = new sv(conversationItem);
                int iMin = Math.min(ukVar.a(), 10);
                int size = conversationItem.getMessages().size();
                int iMin2 = Math.min(size, iMin);
                svVar.f = conversationItem.getMessages().subList(size - iMin2, size);
                ugVar.b(new ConversationItem(svVar));
                ukVar.a -= iMin2;
            } else {
                if (!ukVar.b(1)) {
                    break;
                }
                ugVar.b(ufVar);
                ukVar.a();
            }
        }
        return ugVar.a();
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
        ua uaVar = new ua();
        CarText carText = this.mTitle;
        if (carText != null) {
            uaVar.d(carText);
        }
        Action action = this.mHeaderAction;
        if (action != null) {
            uaVar.c(action);
        }
        ActionStrip actionStrip = this.mActionStrip;
        if (actionStrip != null) {
            Iterator<Action> it = actionStrip.getActions().iterator();
            while (it.hasNext()) {
                uaVar.b(it.next());
            }
        }
        return uaVar.a();
    }

    @Deprecated
    public Action getHeaderAction() {
        return this.mHeaderAction;
    }

    public List<SectionedItemList> getSectionedLists() {
        return tl.a(this.mSectionedLists);
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

    public uj toBuilder() {
        return new uj(this);
    }

    public String toString() {
        return "ListTemplate";
    }

    private ListTemplate() {
        this.mIsLoading = false;
        this.mTitle = null;
        this.mHeaderAction = null;
        this.mSingleList = null;
        this.mSectionedLists = Collections.EMPTY_LIST;
        this.mActionStrip = null;
        this.mActions = Collections.EMPTY_LIST;
        this.mHeader = null;
    }
}
