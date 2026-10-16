package defpackage;

import androidx.car.app.model.CarText;
import androidx.car.app.model.ItemList;
import androidx.car.app.model.OnSelectedDelegateImpl;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class ug {
    public final List a;
    public int b;
    public uy c;
    public uw d;
    public CarText e;

    public ug(ItemList itemList) {
        this.b = itemList.getSelectedIndex();
        this.c = itemList.getOnSelectedDelegate();
        this.d = itemList.getOnItemVisibilityChangedDelegate();
        this.e = itemList.getNoItemsMessage();
        this.a = new ArrayList(itemList.getItems());
    }

    public final ItemList a() {
        if (this.c != null) {
            List<uf> list = this.a;
            int size = list.size();
            if (size == 0) {
                throw new IllegalStateException("A selectable list cannot be empty");
            }
            if (this.b >= size) {
                throw new IllegalStateException("The selected item index (" + this.b + ") is larger than the size of the list (" + size + ")");
            }
            for (uf ufVar : list) {
                if (ItemList.getOnClickDelegate(ufVar) != null) {
                    throw new IllegalStateException("Items that belong to selectable lists can't have an onClickListener. Use the OnSelectedListener of the list instead");
                }
                if (ItemList.getToggle(ufVar) != null) {
                    throw new IllegalStateException("Items that belong to selectable lists can't have a toggle");
                }
            }
        }
        return new ItemList(this);
    }

    public final void b(uf ufVar) {
        ufVar.getClass();
        this.a.add(ufVar);
    }

    public final void c(CharSequence charSequence) {
        charSequence.getClass();
        this.e = CarText.create(charSequence);
    }

    public final void d(ui uiVar) {
        this.c = OnSelectedDelegateImpl.create(uiVar);
    }

    public final void e(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("The item index must be larger than or equal to 0");
        }
        this.b = i;
    }

    public ug() {
        this.a = new ArrayList();
    }
}
