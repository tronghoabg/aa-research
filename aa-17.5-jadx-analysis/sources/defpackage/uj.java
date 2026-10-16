package defpackage;

import androidx.car.app.model.Action;
import androidx.car.app.model.ActionStrip;
import androidx.car.app.model.CarText;
import androidx.car.app.model.Header;
import androidx.car.app.model.ItemList;
import androidx.car.app.model.ListTemplate;
import androidx.car.app.model.SectionedItemList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class uj {
    public boolean a;
    public ItemList b;
    public final List c;
    public CarText d;
    public Action e;
    public ActionStrip f;
    boolean g;
    public final List h;
    public Header i;

    public uj(ListTemplate listTemplate) {
        this.a = listTemplate.isLoading();
        this.e = listTemplate.getHeaderAction();
        this.d = listTemplate.getTitle();
        this.b = listTemplate.getSingleList();
        this.c = new ArrayList(listTemplate.getSectionedLists());
        this.f = listTemplate.getActionStrip();
        this.h = new ArrayList(listTemplate.getActions());
        this.i = listTemplate.getHeader();
    }

    public final ListTemplate a() {
        boolean z = true;
        if (this.b == null && this.c.isEmpty()) {
            z = false;
        }
        if (this.a == z) {
            throw new IllegalStateException("Template is in a loading state but lists are added, or vice versa");
        }
        if (z) {
            List list = this.c;
            if (!list.isEmpty()) {
                wk wkVar = wk.d;
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ItemList itemList = ((SectionedItemList) it.next()).getItemList();
                    if (itemList.getOnSelectedDelegate() != null && !wkVar.g) {
                        throw new IllegalArgumentException("Selectable lists are not allowed");
                    }
                    arrayList.addAll(itemList.getItems());
                }
                wkVar.b(arrayList);
            } else if (this.b != null) {
                wk.d.a(this.b);
            }
        }
        List list2 = this.c;
        if (list2.isEmpty()) {
            ItemList itemList2 = this.b;
            if (itemList2 != null) {
                this.b = ListTemplate.truncate(itemList2, new uk());
            }
        } else {
            List<SectionedItemList> truncatedCopy = ListTemplate.getTruncatedCopy(list2);
            list2.clear();
            list2.addAll(truncatedCopy);
        }
        return new ListTemplate(this);
    }

    public final void b(Action action) {
        List list = this.h;
        ArrayList arrayList = new ArrayList(list);
        action.getClass();
        arrayList.add(action);
        wf.g.a(arrayList);
        list.add(action);
    }

    public final void c(SectionedItemList sectionedItemList) {
        sectionedItemList.getClass();
        if (sectionedItemList.getHeader().toString().length() == 0) {
            throw new IllegalArgumentException("Header cannot be empty");
        }
        ItemList itemList = sectionedItemList.getItemList();
        boolean z = itemList.getOnSelectedDelegate() != null;
        if (this.g || (z && !this.c.isEmpty())) {
            throw new IllegalArgumentException("A selectable list cannot be added alongside any other lists");
        }
        this.g = z;
        if (itemList.getItems().isEmpty()) {
            throw new IllegalArgumentException("List cannot be empty");
        }
        if (itemList.getOnItemVisibilityChangedDelegate() != null) {
            throw new IllegalArgumentException("OnItemVisibilityChangedListener in the list is disallowed");
        }
        this.b = null;
        this.c.add(sectionedItemList);
    }

    public final void d(Header header) {
        if (header.getStartHeaderAction() != null) {
            this.e = header.getStartHeaderAction();
        }
        if (header.getTitle() != null) {
            this.d = header.getTitle();
        }
        if (!header.getEndHeaderActions().isEmpty()) {
            sx sxVar = new sx();
            Iterator<Action> it = header.getEndHeaderActions().iterator();
            while (it.hasNext()) {
                sxVar.b(it.next());
            }
            this.f = sxVar.a();
        }
        this.i = header;
    }

    @Deprecated
    public final void e(Action action) {
        wf wfVar = wf.a;
        action.getClass();
        wfVar.a(Collections.singletonList(action));
        this.e = action;
    }

    public final void f(ItemList itemList) {
        itemList.getClass();
        this.b = itemList;
        this.c.clear();
        this.g = false;
    }

    @Deprecated
    public final void g(CharSequence charSequence) {
        charSequence.getClass();
        this.d = CarText.create(charSequence);
        wi.d.a(this.d);
    }

    public uj() {
        this.c = new ArrayList();
        this.h = new ArrayList();
    }
}
