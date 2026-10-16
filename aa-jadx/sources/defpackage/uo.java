package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class uo {
    public boolean a;
    public androidx.car.app.model.ItemList b;
    public final java.util.List c;
    public androidx.car.app.model.CarText d;
    public androidx.car.app.model.Action e;
    public androidx.car.app.model.ActionStrip f;
    boolean g;
    public final java.util.List h;
    public androidx.car.app.model.Header i;

    public uo(androidx.car.app.model.ListTemplate listTemplate) {
        this.a = listTemplate.isLoading();
        this.e = listTemplate.getHeaderAction();
        this.d = listTemplate.getTitle();
        this.b = listTemplate.getSingleList();
        this.c = new java.util.ArrayList(listTemplate.getSectionedLists());
        this.f = listTemplate.getActionStrip();
        this.h = new java.util.ArrayList(listTemplate.getActions());
        this.i = listTemplate.getHeader();
    }

    public final androidx.car.app.model.ListTemplate a() {
        boolean z = true;
        if (this.b == null && this.c.isEmpty()) {
            z = false;
        }
        if (this.a == z) {
            throw new java.lang.IllegalStateException("Template is in a loading state but lists are added, or vice versa");
        }
        if (z) {
            java.util.List list = this.c;
            if (!list.isEmpty()) {
                defpackage.wr wrVar = defpackage.wr.d;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    androidx.car.app.model.ItemList itemList = ((androidx.car.app.model.SectionedItemList) it.next()).getItemList();
                    if (itemList.getOnSelectedDelegate() != null && !wrVar.g) {
                        throw new java.lang.IllegalArgumentException("Selectable lists are not allowed");
                    }
                    arrayList.addAll(itemList.getItems());
                }
                wrVar.b(arrayList);
            } else if (this.b != null) {
                defpackage.wr.d.a(this.b);
            }
        }
        java.util.List list2 = this.c;
        if (list2.isEmpty()) {
            androidx.car.app.model.ItemList itemList2 = this.b;
            if (itemList2 != null) {
                this.b = androidx.car.app.model.ListTemplate.truncate(itemList2, new defpackage.up());
            }
        } else {
            java.util.List<androidx.car.app.model.SectionedItemList> truncatedCopy = androidx.car.app.model.ListTemplate.getTruncatedCopy(list2);
            list2.clear();
            list2.addAll(truncatedCopy);
        }
        return new androidx.car.app.model.ListTemplate(this);
    }

    public final void b(androidx.car.app.model.Action action) {
        java.util.List list = this.h;
        java.util.ArrayList arrayList = new java.util.ArrayList(list);
        action.getClass();
        arrayList.add(action);
        defpackage.wm.g.a(arrayList);
        if (action.getType() == 65542) {
            android.util.Log.w("CarApp", "Action.TYPE_MEDIA_PLAYBACK is ignored as a floating action button on Car API 9+ hosts.");
        }
        list.add(action);
    }

    public final void c(androidx.car.app.model.SectionedItemList sectionedItemList) {
        sectionedItemList.getClass();
        if (sectionedItemList.getHeader().toString().length() == 0) {
            throw new java.lang.IllegalArgumentException("Header cannot be empty");
        }
        androidx.car.app.model.ItemList itemList = sectionedItemList.getItemList();
        boolean z = itemList.getOnSelectedDelegate() != null;
        if (this.g || (z && !this.c.isEmpty())) {
            throw new java.lang.IllegalArgumentException("A selectable list cannot be added alongside any other lists");
        }
        this.g = z;
        if (itemList.getItems().isEmpty()) {
            throw new java.lang.IllegalArgumentException("List cannot be empty");
        }
        if (itemList.getOnItemVisibilityChangedDelegate() != null) {
            throw new java.lang.IllegalArgumentException("OnItemVisibilityChangedListener in the list is disallowed");
        }
        this.b = null;
        this.c.add(sectionedItemList);
    }

    public final void d(androidx.car.app.model.Header header) {
        if (header.getStartHeaderAction() != null) {
            this.e = header.getStartHeaderAction();
        }
        if (header.getTitle() != null) {
            this.d = header.getTitle();
        }
        if (!header.getEndHeaderActions().isEmpty()) {
            defpackage.tc tcVar = new defpackage.tc();
            java.util.Iterator<androidx.car.app.model.Action> it = header.getEndHeaderActions().iterator();
            while (it.hasNext()) {
                tcVar.b(it.next());
            }
            this.f = tcVar.a();
        }
        this.i = header;
    }

    @java.lang.Deprecated
    public final void e(androidx.car.app.model.Action action) {
        defpackage.wm wmVar = defpackage.wm.a;
        action.getClass();
        wmVar.a(java.util.Collections.singletonList(action));
        this.e = action;
    }

    public final void f(androidx.car.app.model.ItemList itemList) {
        itemList.getClass();
        this.b = itemList;
        this.c.clear();
        this.g = false;
    }

    @java.lang.Deprecated
    public final void g(java.lang.CharSequence charSequence) {
        charSequence.getClass();
        this.d = androidx.car.app.model.CarText.create(charSequence);
        defpackage.wp.d.a(this.d);
    }

    public uo() {
        this.c = new java.util.ArrayList();
        this.h = new java.util.ArrayList();
    }
}
