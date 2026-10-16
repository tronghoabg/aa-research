package defpackage;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import androidx.car.app.messaging.model.ConversationItem;
import androidx.car.app.model.CarColor;
import androidx.car.app.model.CarLocation;
import androidx.car.app.model.ItemList;
import androidx.car.app.model.Metadata;
import androidx.car.app.model.Place;
import androidx.car.app.model.PlaceMarker;
import androidx.car.app.model.Row;
import androidx.car.app.model.Toggle;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes2.dex */
public final class guo {
    public static final void a(gup gupVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-1104022092);
        int i4 = 1;
        if (i3 == 0) {
            i2 = (true != buxVarC.E(gupVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            gui.b(gui.d(cfyVar, gupVar.a, buxVarC, 0), atd.e, cfl.k, bxc.i(-1358817814, true, new guq(gupVar, i4), buxVarC), buxVarC, 3504, 0);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new gul(gupVar, cfyVar, i, 2, null);
        }
    }

    public static final void b(geu geuVar, CarColor carColor, SpannableString spannableString) {
        int iK = gbt.k(geuVar, carColor, false, 0, ghv.b, 0);
        if (iK != 0) {
            spannableString.setSpan(new ForegroundColorSpan(iK), 0, spannableString.length(), 33);
        }
    }

    public static int c(ItemList itemList) {
        return itemList.getOnSelectedDelegate() != null ? 2 : 1;
    }

    public static hih d(geu geuVar, ItemList itemList) {
        if (itemList == null) {
            return new hih(geuVar);
        }
        List<uf> items = itemList.getItems();
        hih hihVar = new hih(geuVar);
        hihVar.c = items;
        hihVar.e = c(itemList);
        hihVar.k = itemList.getNoItemsMessage();
        hihVar.h = itemList.getOnItemVisibilityChangedDelegate();
        uy onSelectedDelegate = itemList.getOnSelectedDelegate();
        if (onSelectedDelegate != null) {
            hihVar.b = new hin(0, items.size() - 1, itemList.getSelectedIndex(), onSelectedDelegate);
        }
        return hihVar;
    }

    public static hih e(geu geuVar, List list) {
        if (list.isEmpty()) {
            return new hih(geuVar);
        }
        hih hihVar = new hih(geuVar);
        hihVar.c = list;
        return hihVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x01b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.yfq f(defpackage.geu r24, java.util.List r25, defpackage.hin r26, defpackage.ghz r27, androidx.car.app.model.CarText r28, int r29, int r30, int r31, boolean r32, boolean r33, boolean r34) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 670
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.guo.f(geu, java.util.List, hin, ghz, androidx.car.app.model.CarText, int, int, int, boolean, boolean, boolean):yfq");
    }

    public static final hif g(him himVar) {
        himVar.getClass();
        return new hif(himVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final List h(geu geuVar, List list, ghz ghzVar) {
        him himVar;
        geuVar.getClass();
        ghzVar.getClass();
        if (list.isEmpty()) {
            return afbe.a;
        }
        afbt afbtVar = new afbt(10);
        ynp ynpVarListIterator = ((yfq) list).listIterator(0);
        loop0: while (true) {
            himVar = null;
            while (ynpVarListIterator.hasNext()) {
                him himVar2 = (him) ynpVarListIterator.next();
                if (himVar2.a()) {
                    if (himVar != null) {
                        gks.j("CarApp.H.Tem", "Consecutive header rows detected and is not supported, only the last one will be used");
                    }
                    himVar = himVar2;
                } else {
                    if (himVar != null) {
                        afbtVar.add(himVar);
                    }
                    afbtVar.add(himVar2);
                }
            }
            break loop0;
        }
        if (himVar != null) {
            gks.j("CarApp.H.Tem", "List ends in a header, which is not supported. The header will be omitted.");
        }
        List listF = afbtVar.f();
        afbt afbtVar2 = new afbt(10);
        int iA = geuVar.w().a(ghzVar.f);
        ListIterator listIterator = ((afbt) listF).listIterator(0);
        int i = iA;
        while (true) {
            if (!listIterator.hasNext()) {
                break;
            }
            him himVar3 = (him) listIterator.next();
            Object obj = himVar3.a;
            if (himVar3.a() && i > 0) {
                afbtVar2.add(himVar3);
            } else {
                if (i <= 0) {
                    gks.k("CarApp.H.Tem", "Row count exceeds the supported maximum of %d, will drop the remaining excess rows", Integer.valueOf(iA));
                    break;
                }
                afbtVar2.add(himVar3);
                i--;
            }
        }
        List listF2 = afbtVar2.f();
        ArrayList arrayList = new ArrayList(woy.bp(listF2, 10));
        ListIterator listIterator2 = ((afbt) listF2).listIterator(0);
        while (listIterator2.hasNext()) {
            arrayList.add(g((him) listIterator2.next()));
        }
        return arrayList;
    }

    private static him i(Row row, ConversationItem conversationItem, hij hijVar) {
        hil hilVar = new hil(row, hijVar.g + hijVar.l);
        ghy ghyVar = hijVar.c.g;
        if (row != null) {
            Metadata metadata = row.getMetadata();
            if (metadata != null) {
                Place place = metadata.getPlace();
                if (place != null) {
                    CarLocation location = place.getLocation();
                    PlaceMarker marker = place.getMarker();
                    if (marker != null && marker.getIcon() == null && marker.getLabel() == null) {
                        ve veVar = new ve();
                        veVar.a(Integer.toString(hijVar.k));
                        CarColor color = marker.getColor();
                        if (color != null) {
                            wg.a.a(color);
                            veVar.c = color;
                        }
                        vc vcVar = new vc(location);
                        vcVar.b = new PlaceMarker(veVar);
                        Place place2 = new Place(vcVar);
                        un unVar = new un(metadata);
                        unVar.a = place2;
                        metadata = new Metadata(unVar);
                        hijVar.k++;
                    }
                }
                hilVar.c = metadata;
            }
            Toggle toggle = row.getToggle();
            if (toggle != null) {
                hilVar.g = toggle.isChecked();
            }
            hilVar.h = hijVar.d;
        }
        hijVar.l++;
        hilVar.e = hijVar.e;
        hilVar.d = hijVar.f;
        hilVar.j = hijVar.h;
        hilVar.f = hijVar.b;
        hilVar.i = ghyVar;
        hilVar.m = conversationItem;
        hilVar.k = hijVar.i;
        hilVar.l = hijVar.j;
        return new him(hilVar);
    }
}
