package defpackage;

import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import androidx.car.app.model.GridItem;
import androidx.car.app.model.Row;
import com.android.car.libraries.apphost.external.model.CheckoutItem;
import com.android.car.libraries.apphost.external.model.PaymentItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes2.dex */
public final class fux {
    public gml a = gml.a;
    public fvd b;
    public final eql c;
    public final fvl d;
    private final eqj e;
    private final gjv f;

    public fux(eqj eqjVar, fvl fvlVar, gjv gjvVar) {
        this.e = eqjVar;
        this.d = fvlVar;
        this.f = gjvVar;
        eql eqlVar = new eql();
        eqlVar.r(eqjVar, new ewg(new ewm(this, 20), 2));
        this.c = eqlVar;
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [fvf, java.lang.Object] */
    public final void a() {
        Row rowA;
        eqj eqjVar = this.e;
        if (eqjVar.o()) {
            Object objE = eqjVar.e();
            objE.getClass();
            gjv gjvVar = this.f;
            gru gruVar = (gru) objE;
            List list = fvh.b;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            ListIterator listIterator = ((afbt) list).listIterator(0);
            while (listIterator.hasNext()) {
                linkedHashMap.put((fvd) listIterator.next(), new ArrayList());
            }
            if (!gruVar.a) {
                List list2 = gruVar.c;
                ArrayList arrayList = new ArrayList(woy.bp(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((grr) it.next()).a);
                }
                for (uf ufVar : woy.bq(arrayList)) {
                    if (ufVar instanceof Row) {
                        rowA = (Row) ufVar;
                    } else if (ufVar instanceof GridItem) {
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
                            vfVar.e(image, 2);
                        }
                        uq onClickDelegate = gridItem.getOnClickDelegate();
                        if (onClickDelegate != null) {
                            vfVar.i = onClickDelegate;
                        }
                        rowA = vfVar.a();
                    } else if (ufVar instanceof CheckoutItem) {
                        CheckoutItem checkoutItem = (CheckoutItem) ufVar;
                        vf vfVar2 = new vf();
                        vfVar2.h(checkoutItem.getTitle());
                        CarText subtitle = checkoutItem.getSubtitle();
                        if (subtitle != null) {
                            vfVar2.c(subtitle);
                        }
                        CarIcon image2 = checkoutItem.getImage();
                        if (image2 != null) {
                            vfVar2.e(image2, 1);
                        }
                        rowA = vfVar2.a();
                    } else {
                        if (!(ufVar instanceof PaymentItem)) {
                            throw new IllegalStateException("Item type " + affw.b(ufVar.getClass()).getSimpleName() + " not supported");
                        }
                        PaymentItem paymentItem = (PaymentItem) ufVar;
                        vf vfVar3 = new vf();
                        vfVar3.h(paymentItem.getTitle());
                        vfVar3.c(paymentItem.getSubtitle());
                        CarIcon image3 = paymentItem.getImage();
                        if (image3 != null) {
                            vfVar3.e(image3, 1);
                        }
                        rowA = vfVar3.a();
                    }
                    ?? r6 = gjvVar.a;
                    CarText title2 = rowA.getTitle();
                    title2.getClass();
                    String string = title2.toString();
                    string.getClass();
                    fva fvaVar = new fva(r6.a(string), ufVar, rowA);
                    Object obj = linkedHashMap.get(fvaVar.a);
                    obj.getClass();
                    ((List) obj).add(fvaVar);
                }
            }
            this.c.m(new fuw(gruVar, this.a, this.b, linkedHashMap));
        }
    }
}
