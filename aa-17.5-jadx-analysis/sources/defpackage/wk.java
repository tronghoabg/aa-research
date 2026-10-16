package defpackage;

import androidx.car.app.messaging.model.ConversationItem;
import androidx.car.app.model.Banner;
import androidx.car.app.model.ItemList;
import androidx.car.app.model.Row;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class wk {
    public static final wk a;
    public static final wk b;
    public static final wk c;
    public static final wk d;
    public final int e;
    public final wj f;
    public final boolean g;

    static {
        uxe uxeVar = new uxe((byte[]) null);
        uxeVar.a = 0;
        uxeVar.c = wj.b;
        uxeVar.b = false;
        wk wkVar = new wk(uxeVar);
        a = wkVar;
        uxe uxeVar2 = new uxe(wkVar);
        uxeVar2.a = 2;
        uxeVar2.c = wj.c;
        uxeVar2.b = false;
        b = new wk(uxeVar2);
        uxe uxeVar3 = new uxe(wkVar);
        uxeVar3.c = wj.d;
        c = new wk(uxeVar3);
        uxe uxeVar4 = new uxe(wkVar);
        uxeVar4.c = wj.d;
        uxeVar4.b = true;
        uxe uxeVar5 = new uxe(wkVar);
        uxeVar5.c = wj.d;
        uxeVar5.b = true;
        uxe uxeVar6 = new uxe(wkVar);
        uxeVar6.c = wj.e;
        uxeVar6.b = true;
        d = new wk(uxeVar6);
    }

    public wk(uxe uxeVar) {
        this.e = uxeVar.a;
        this.f = (wj) uxeVar.c;
        this.g = uxeVar.b;
    }

    public final void a(ItemList itemList) {
        if (itemList.getOnSelectedDelegate() != null && !this.g) {
            throw new IllegalArgumentException("Selectable lists are not allowed");
        }
        b(itemList.getItems());
    }

    public final void b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            uf ufVar = (uf) it.next();
            if (ufVar instanceof Row) {
                this.f.a((Row) ufVar);
            } else if (!(ufVar instanceof ConversationItem) && !(ufVar instanceof Banner)) {
                throw new IllegalArgumentException(String.format("Unsupported item type: %s", ufVar.getClass().getSimpleName()));
            }
        }
    }
}
