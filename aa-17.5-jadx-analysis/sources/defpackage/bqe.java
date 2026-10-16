package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class bqe implements aiyl {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public bqe(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v15, types: [cmv] */
    /* JADX WARN: Type inference failed for: r1v16, types: [cmu] */
    /* JADX WARN: Type inference failed for: r5v49, types: [aiyl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v79, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v81, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v82, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v84, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v85, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v87, types: [afec, java.lang.Object] */
    @Override // defpackage.aiyl
    public final /* synthetic */ Object a(Object obj, afck afckVar) throws Throwable {
        Drawable drawable;
        ijk ijkVar;
        switch (this.b) {
            case 0:
                asd asdVar = (asd) obj;
                if (asdVar instanceof ary) {
                    ((SnapshotStateList) this.a).add(asdVar);
                } else if (asdVar instanceof arz) {
                    ((SnapshotStateList) this.a).remove(((arz) asdVar).a);
                } else if (asdVar instanceof asi) {
                    ((SnapshotStateList) this.a).add(asdVar);
                } else if (asdVar instanceof asj) {
                    ((SnapshotStateList) this.a).remove(((asj) asdVar).a);
                } else if (asdVar instanceof ash) {
                    ((SnapshotStateList) this.a).remove(((ash) asdVar).a);
                } else if (asdVar instanceof arw) {
                    ((SnapshotStateList) this.a).add(asdVar);
                } else if (asdVar instanceof arx) {
                    ((SnapshotStateList) this.a).remove(((arx) asdVar).a);
                } else if (asdVar instanceof arv) {
                    ((SnapshotStateList) this.a).remove(((arv) asdVar).a);
                }
                return afak.a;
            case 1:
                asd asdVar2 = (asd) obj;
                if (asdVar2 instanceof asa) {
                    ((SnapshotStateList) this.a).add(asdVar2);
                } else if (asdVar2 instanceof asb) {
                    ((SnapshotStateList) this.a).remove(((asb) asdVar2).a);
                } else if (asdVar2 instanceof ary) {
                    ((SnapshotStateList) this.a).add(asdVar2);
                } else if (asdVar2 instanceof arz) {
                    ((SnapshotStateList) this.a).remove(((arz) asdVar2).a);
                } else if (asdVar2 instanceof asi) {
                    ((SnapshotStateList) this.a).add(asdVar2);
                } else if (asdVar2 instanceof asj) {
                    ((SnapshotStateList) this.a).remove(((asj) asdVar2).a);
                } else if (asdVar2 instanceof ash) {
                    ((SnapshotStateList) this.a).remove(((ash) asdVar2).a);
                } else if (asdVar2 instanceof arw) {
                    ((SnapshotStateList) this.a).add(asdVar2);
                } else if (asdVar2 instanceof arx) {
                    ((SnapshotStateList) this.a).remove(((arx) asdVar2).a);
                } else if (asdVar2 instanceof arv) {
                    ((SnapshotStateList) this.a).remove(((arv) asdVar2).a);
                }
                return afak.a;
            case 2:
                ((dbt) this.a).b(((Number) obj).floatValue());
                return afak.a;
            case 3:
                Object objC = ((dxs) this.a).c((Bundle) obj, afckVar);
                return objC == afcr.a ? objC : afak.a;
            case 4:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                gio gioVar = (gio) this.a;
                gioVar.c = zBooleanValue;
                if (zBooleanValue) {
                    gioVar.b();
                }
                return afak.a;
            case 5:
                return this.a.a((gre) obj, afckVar);
            case 6:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((gwa) this.a).c.d(bool);
                return afak.a;
            case 7:
                List list = (List) obj;
                list.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    aezu aezuVar = (aezu) ((ajju) this.a).b.get(Integer.valueOf(((Number) it.next()).intValue()));
                    if (aezuVar != null) {
                        hck hckVar = (hck) aezuVar.a;
                        hcr hcrVar = (hcr) aezuVar.b;
                        Object obj2 = linkedHashMap.get(hckVar);
                        if (obj2 == null) {
                            hcr hcrVar2 = new hcr(hcrVar.a, hcrVar.b);
                            linkedHashMap.put(hckVar, hcrVar2);
                            obj2 = hcrVar2;
                        }
                        hcr hcrVar3 = (hcr) obj2;
                        hcrVar.getClass();
                        hcrVar3.a = Math.min(hcrVar3.a, hcrVar.a);
                        hcrVar3.b = Math.max(hcrVar3.b, hcrVar.b);
                    }
                }
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    afeg afegVar = ((hck) entry.getKey()).b;
                    if (afegVar != null) {
                        afegVar.invoke(Integer.valueOf(((hcr) entry.getValue()).a), Integer.valueOf(((hcr) entry.getValue()).b));
                    }
                }
                return afak.a;
            case 8:
                int i = true != ((Boolean) obj).booleanValue() ? 0 : 8;
                hgr hgrVar = (hgr) this.a;
                hgrVar.s().setVisibility(i);
                hgrVar.u().setVisibility(i);
                return afak.a;
            case 9:
                boolean zA = ((eps) obj).a(eps.d);
                Object obj3 = this.a;
                if (zA) {
                    Object obj4 = (Drawable) ((hth) obj3).d.a();
                    if (obj4 != null && (obj4 instanceof Animatable)) {
                        ((Animatable) obj4).start();
                    }
                } else {
                    Object obj5 = (Drawable) ((hth) obj3).d.a();
                    if (obj5 != null && (obj5 instanceof Animatable)) {
                        ((Animatable) obj5).stop();
                    }
                }
                return afak.a;
            case 10:
                hts htsVar = (hts) obj;
                if (htsVar instanceof htv) {
                    drawable = (Drawable) ((htv) htsVar).a;
                } else {
                    if (!(htsVar instanceof htu)) {
                        throw new aezs();
                    }
                    drawable = ((htu) htsVar).a;
                }
                if (drawable == null) {
                    ijkVar = null;
                } else if (drawable instanceof BitmapDrawable) {
                    Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                    bitmap.getClass();
                    ijkVar = new cmu(new cjj(bitmap));
                } else if (drawable instanceof ColorDrawable) {
                    ijkVar = new cmv(cjn.i(((ColorDrawable) drawable).getColor()));
                } else {
                    Drawable drawableMutate = drawable.mutate();
                    drawableMutate.getClass();
                    ijkVar = new ijk(drawableMutate);
                }
                hth hthVar = (hth) this.a;
                Object objG = hthVar.g();
                if (ijkVar != objG) {
                    bxq bxqVar = objG instanceof bxq ? (bxq) objG : null;
                    if (bxqVar != null) {
                        bxqVar.eX();
                    }
                    ijk ijkVar2 = ijkVar instanceof bxq ? ijkVar : null;
                    if (ijkVar2 != null) {
                        ijkVar2.eo();
                    }
                    hthVar.d.b(drawable);
                    hthVar.i(ijkVar);
                }
                hthVar.c.b(htsVar.a());
                return afak.a;
            case 11:
                aezu aezuVar2 = (aezu) obj;
                float fFloatValue = ((Number) aezuVar2.a).floatValue();
                if (((bqr) aezuVar2.b) == bqr.c && fFloatValue == 1.0f) {
                    this.a.invoke(new Float(BitmapDescriptorFactory.HUE_RED));
                } else {
                    this.a.invoke(new Float(fFloatValue));
                }
                return afak.a;
            case 12:
                aezu aezuVar3 = (aezu) obj;
                float fFloatValue2 = ((Number) aezuVar3.a).floatValue();
                if (((bqr) aezuVar3.b) == bqr.c && fFloatValue2 == 1.0f) {
                    this.a.invoke(new Float(BitmapDescriptorFactory.HUE_RED));
                } else {
                    this.a.invoke(new Float(fFloatValue2));
                }
                return afak.a;
            default:
                aezu aezuVar4 = (aezu) obj;
                float fFloatValue3 = ((Number) aezuVar4.a).floatValue();
                if (((bqr) aezuVar4.b) == bqr.c && fFloatValue3 == 1.0f) {
                    this.a.invoke(new Float(BitmapDescriptorFactory.HUE_RED));
                } else {
                    this.a.invoke(new Float(fFloatValue3));
                }
                return afak.a;
        }
    }
}
