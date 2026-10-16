package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.car.app.model.Metadata;
import androidx.car.app.model.Place;
import androidx.car.app.model.PlaceMarker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
final class goi extends afde implements afeh {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    final /* synthetic */ gok c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public goi(gok gokVar, afck afckVar) {
        super(3, afckVar);
        this.c = gokVar;
    }

    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9, types: [androidx.car.app.model.CarColor, androidx.car.app.model.CarIcon, gac] */
    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        Object obj2;
        Iterator it;
        goa goaVar;
        han hanVarC;
        PlaceMarker marker;
        ?? r12;
        woy.dF(obj);
        gou gouVar = (gou) this.a;
        gos gosVar = gouVar.a;
        Object obj3 = this.b;
        gok gokVar = this.c;
        goa goaVar2 = new goa(gokVar, 2);
        hay hayVar = (hay) gosVar.a;
        List<haw> list = hayVar.c;
        int i = 10;
        ArrayList arrayList = new ArrayList(woy.bp(list, 10));
        for (haw hawVar : list) {
            hawVar.getClass();
            har harVar = (har) hawVar;
            List list2 = harVar.f;
            ArrayList<Place> arrayList2 = new ArrayList();
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                Metadata metadata = ((han) it2.next()).g;
                Place place = metadata != null ? metadata.getPlace() : null;
                if (place != null) {
                    arrayList2.add(place);
                }
            }
            if (!arrayList2.isEmpty()) {
                for (Place place2 : arrayList2) {
                }
            }
            goh gohVar = new goh();
            ArrayList arrayList3 = new ArrayList(woy.bp(list2, i));
            Iterator it3 = list2.iterator();
            while (it3.hasNext()) {
                han hanVar = (han) it3.next();
                Metadata metadata2 = hanVar.g;
                Place place3 = metadata2 != null ? metadata2.getPlace() : null;
                if (place3 == null || (marker = place3.getMarker()) == null) {
                    obj2 = obj3;
                } else {
                    if (marker.getIcon() == null && marker.getLabel() == null) {
                        int i2 = gohVar.a;
                        obj2 = obj3;
                        gohVar.a = i2 + 1;
                        ve veVar = new ve();
                        veVar.a(String.valueOf(i2));
                        PlaceMarker placeMarker = new PlaceMarker(veVar);
                        vc vcVar = new vc(place3);
                        vcVar.b = placeMarker;
                        Place place4 = new Place(vcVar);
                        un unVar = new un(metadata2);
                        unVar.a = place4;
                        metadata2 = new Metadata(unVar);
                    } else {
                        obj2 = obj3;
                    }
                    Metadata metadata3 = metadata2;
                    Place place5 = metadata3.getPlace();
                    place5.getClass();
                    gph gphVar = gokVar.c;
                    geu geuVar = gokVar.a;
                    Bitmap bitmapC = gphVar.c(geuVar, place5.getMarker());
                    if (bitmapC != null) {
                        if (marker.getIcon() == null) {
                            int i3 = gokVar.d;
                            int i4 = i3 + i3;
                            it = it3;
                            goaVar = goaVar2;
                            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapC.getWidth() + i4, bitmapC.getHeight() + i4, Bitmap.Config.ARGB_8888);
                            bitmapCreateBitmap.getClass();
                            float f = i3;
                            r12 = 0;
                            new Canvas(bitmapCreateBitmap).drawBitmap(bitmapC, f, f, (Paint) null);
                            bitmapC = bitmapCreateBitmap;
                        } else {
                            it = it3;
                            goaVar = goaVar2;
                            r12 = 0;
                        }
                        Resources resources = geuVar.getResources();
                        resources.getClass();
                        hanVarC = han.c(hanVar, false, new fzy(r12, r12, new gaf(bitmapC, resources, r12)), null, metadata3, null, 65391);
                    }
                    arrayList3.add(hanVarC);
                    obj3 = obj2;
                    it3 = it;
                    goaVar2 = goaVar;
                }
                it = it3;
                goaVar = goaVar2;
                hanVarC = hanVar;
                arrayList3.add(hanVarC);
                obj3 = obj2;
                it3 = it;
                goaVar2 = goaVar;
            }
            Object obj4 = obj3;
            goa goaVar3 = goaVar2;
            ArrayList arrayList4 = new ArrayList(woy.bp(arrayList3, 10));
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                Metadata metadata4 = ((han) it4.next()).g;
                arrayList4.add(metadata4 != null ? metadata4.getPlace() : null);
            }
            goaVar2 = goaVar3;
            arrayList.add(har.f(harVar, null, new brf((Object) goaVar2, (Object) arrayList4, (Object) harVar.d, 8, (byte[]) null), 0, arrayList3, 87));
            i = 10;
            obj3 = obj4;
        }
        gos gosVar2 = new gos(hay.b(hayVar, arrayList), gosVar.b);
        gog gogVar = gokVar.b;
        gogVar.g(gosVar2);
        gogVar.h((gzc) obj3);
        return gouVar.b;
    }

    @Override // defpackage.afeh
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        goi goiVar = new goi(this.c, (afck) obj3);
        goiVar.a = (gou) obj;
        goiVar.b = (gzc) obj2;
        return goiVar.hT(afak.a);
    }
}
