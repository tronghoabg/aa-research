package defpackage;

import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import androidx.car.app.model.GridItem;
import androidx.car.app.model.ItemList;
import androidx.car.app.model.Row;
import com.android.car.libraries.apphost.internal.model.GoogleListTemplate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class jsz implements jsy {
    @Override // defpackage.jsy
    public final Map a(GoogleListTemplate googleListTemplate) {
        Row rowA;
        jtb jtbVar;
        List list = jte.e;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ListIterator listIterator = ((afbt) list).listIterator(0);
        while (listIterator.hasNext()) {
            linkedHashMap.put((jtb) listIterator.next(), new ArrayList());
        }
        if (!googleListTemplate.getIsLoading()) {
            ItemList singleList = googleListTemplate.getSingleList();
            singleList.getClass();
            for (uf ufVar : singleList.getItems()) {
                ufVar.getClass();
                if (ufVar instanceof Row) {
                    rowA = (Row) ufVar;
                } else {
                    if (!(ufVar instanceof GridItem)) {
                        throw new IllegalStateException("Item type " + affw.b(ufVar.getClass()).getSimpleName() + " not supported");
                    }
                    GridItem gridItem = (GridItem) ufVar;
                    vf vfVar = new vf();
                    CarText title = gridItem.getTitle();
                    if (title != null) {
                        vfVar.h(title);
                    }
                    CarText text = gridItem.getText();
                    if (text != null) {
                        vfVar.c(text);
                    }
                    CarIcon image = gridItem.getImage();
                    if (image != null) {
                        vfVar.e(image, 1);
                    }
                    rowA = vfVar.a();
                }
                CarText title2 = rowA.getTitle();
                title2.getClass();
                String string = title2.toString();
                string.getClass();
                ArrayList arrayList = new ArrayList(string.length());
                for (int i = 0; i < string.length(); i++) {
                    arrayList.add(Character.valueOf(Character.toUpperCase(string.charAt(i))));
                }
                char cCharValue = ((Character) arrayList.get(0)).charValue();
                if (!jte.b.e(cCharValue)) {
                    Iterator it = jte.c.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            jtbVar = jtc.a;
                            break;
                        }
                        jtb jtbVar2 = (jtb) it.next();
                        if (jtbVar2.a.charAt(0) == cCharValue) {
                            jtbVar = jtbVar2;
                            break;
                        }
                    }
                } else {
                    jtbVar = jte.d;
                }
                jsx jsxVar = new jsx(jtbVar, ufVar, rowA);
                Object obj = linkedHashMap.get(jsxVar.a);
                obj.getClass();
                ((List) obj).add(jsxVar);
            }
        }
        return linkedHashMap;
    }
}
