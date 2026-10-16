package defpackage;

import androidx.car.app.model.ItemList;
import com.android.car.libraries.apphost.internal.model.GoogleListTemplate;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class meh implements jsy {
    private final jsy a;

    public meh(jsy jsyVar) {
        this.a = jsyVar;
    }

    @Override // defpackage.jsy
    public final Map a(GoogleListTemplate googleListTemplate) {
        ItemList itemListA;
        ItemList singleList = googleListTemplate.getSingleList();
        if (singleList != null) {
            ug ugVar = new ug();
            List<uf> items = singleList.getItems();
            items.getClass();
            Iterator it = woy.bR(items, 1).iterator();
            while (it.hasNext()) {
                ugVar.b((uf) it.next());
            }
            itemListA = ugVar.a();
        } else {
            itemListA = null;
        }
        return this.a.a(GoogleListTemplate.copy$default(googleListTemplate, false, itemListA, null, null, null, 29, null));
    }
}
