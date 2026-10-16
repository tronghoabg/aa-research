package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bqk implements aizk {
    final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public bqk(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v49, types: [aizk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v79, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v81, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v82, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v84, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v85, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v87, types: [affc, java.lang.Object] */
    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, defpackage.afdk afdkVar) {
        android.graphics.drawable.Drawable drawable;
        ijs ijsVar;
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                defpackage.asi asiVar = (defpackage.asi) obj;
                if (asiVar instanceof defpackage.asd) {
                    ((androidx.compose.runtime.snapshots.SnapshotStateList) this.a).add(asiVar);
                } else if (asiVar instanceof defpackage.ase) {
                    ((androidx.compose.runtime.snapshots.SnapshotStateList) this.a).remove(((defpackage.ase) asiVar).a);
                } else if (asiVar instanceof defpackage.asn) {
                    ((androidx.compose.runtime.snapshots.SnapshotStateList) this.a).add(asiVar);
                } else if (asiVar instanceof defpackage.aso) {
                    ((androidx.compose.runtime.snapshots.SnapshotStateList) this.a).remove(((defpackage.aso) asiVar).a);
                } else if (asiVar instanceof defpackage.asm) {
                    ((androidx.compose.runtime.snapshots.SnapshotStateList) this.a).remove(((defpackage.asm) asiVar).a);
                } else if (asiVar instanceof defpackage.asb) {
                    ((androidx.compose.runtime.snapshots.SnapshotStateList) this.a).add(asiVar);
                } else if (asiVar instanceof defpackage.asc) {
                    ((androidx.compose.runtime.snapshots.SnapshotStateList) this.a).remove(((defpackage.asc) asiVar).a);
                } else if (asiVar instanceof defpackage.asa) {
                    ((androidx.compose.runtime.snapshots.SnapshotStateList) this.a).remove(((defpackage.asa) asiVar).a);
                }
                return defpackage.afbk.a;
            case 1:
                defpackage.asi asiVar2 = (defpackage.asi) obj;
                if (asiVar2 instanceof defpackage.asf) {
                    ((androidx.compose.runtime.snapshots.SnapshotStateList) this.a).add(asiVar2);
                } else if (asiVar2 instanceof defpackage.asg) {
                    ((androidx.compose.runtime.snapshots.SnapshotStateList) this.a).remove(((defpackage.asg) asiVar2).a);
                } else if (asiVar2 instanceof defpackage.asd) {
                    ((androidx.compose.runtime.snapshots.SnapshotStateList) this.a).add(asiVar2);
                } else if (asiVar2 instanceof defpackage.ase) {
                    ((androidx.compose.runtime.snapshots.SnapshotStateList) this.a).remove(((defpackage.ase) asiVar2).a);
                } else if (asiVar2 instanceof defpackage.asn) {
                    ((androidx.compose.runtime.snapshots.SnapshotStateList) this.a).add(asiVar2);
                } else if (asiVar2 instanceof defpackage.aso) {
                    ((androidx.compose.runtime.snapshots.SnapshotStateList) this.a).remove(((defpackage.aso) asiVar2).a);
                } else if (asiVar2 instanceof defpackage.asm) {
                    ((androidx.compose.runtime.snapshots.SnapshotStateList) this.a).remove(((defpackage.asm) asiVar2).a);
                } else if (asiVar2 instanceof defpackage.asb) {
                    ((androidx.compose.runtime.snapshots.SnapshotStateList) this.a).add(asiVar2);
                } else if (asiVar2 instanceof defpackage.asc) {
                    ((androidx.compose.runtime.snapshots.SnapshotStateList) this.a).remove(((defpackage.asc) asiVar2).a);
                } else if (asiVar2 instanceof defpackage.asa) {
                    ((androidx.compose.runtime.snapshots.SnapshotStateList) this.a).remove(((defpackage.asa) asiVar2).a);
                }
                return defpackage.afbk.a;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                ((defpackage.dcb) this.a).b(((java.lang.Number) obj).floatValue());
                return defpackage.afbk.a;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                java.lang.Object objC = ((dxz) this.a).c((android.os.Bundle) obj, afdkVar);
                return objC == defpackage.afdr.a ? objC : defpackage.afbk.a;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                boolean zBooleanValue = ((java.lang.Boolean) obj).booleanValue();
                giv givVar = (giv) this.a;
                givVar.c = zBooleanValue;
                if (zBooleanValue) {
                    givVar.b();
                }
                return defpackage.afbk.a;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return this.a.a((gro) obj, afdkVar);
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                java.lang.Boolean bool = (java.lang.Boolean) obj;
                bool.booleanValue();
                ((gwk) this.a).c.d(bool);
                return defpackage.afbk.a;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                java.util.List list = (java.util.List) obj;
                list.getClass();
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    defpackage.afau afauVar = (defpackage.afau) ((ajku) this.a).b.get(java.lang.Integer.valueOf(((java.lang.Number) it.next()).intValue()));
                    if (afauVar != null) {
                        hcu hcuVar = (hcu) afauVar.a;
                        hdc hdcVar = (hdc) afauVar.b;
                        java.lang.Object obj2 = linkedHashMap.get(hcuVar);
                        if (obj2 == null) {
                            hdc hdcVar2 = new hdc(hdcVar.a, hdcVar.b);
                            linkedHashMap.put(hcuVar, hdcVar2);
                            obj2 = hdcVar2;
                        }
                        hdc hdcVar3 = (hdc) obj2;
                        hdcVar.getClass();
                        hdcVar3.a = java.lang.Math.min(hdcVar3.a, hdcVar.a);
                        hdcVar3.b = java.lang.Math.max(hdcVar3.b, hdcVar.b);
                    }
                }
                for (java.util.Map.Entry entry : linkedHashMap.entrySet()) {
                    defpackage.affg affgVar = ((hcu) entry.getKey()).b;
                    if (affgVar != null) {
                        affgVar.invoke(java.lang.Integer.valueOf(((hdc) entry.getValue()).a), java.lang.Integer.valueOf(((hdc) entry.getValue()).b));
                    }
                }
                return defpackage.afbk.a;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                int i = true != ((java.lang.Boolean) obj).booleanValue() ? 0 : 8;
                hgy hgyVar = (hgy) this.a;
                hgyVar.s().setVisibility(i);
                hgyVar.u().setVisibility(i);
                return defpackage.afbk.a;
            case 9:
                boolean zA = ((defpackage.epx) obj).a(defpackage.epx.d);
                java.lang.Object obj3 = this.a;
                if (zA) {
                    java.lang.Object obj4 = (android.graphics.drawable.Drawable) ((htr) obj3).d.a();
                    if (obj4 != null && (obj4 instanceof android.graphics.drawable.Animatable)) {
                        ((android.graphics.drawable.Animatable) obj4).start();
                    }
                } else {
                    java.lang.Object obj5 = (android.graphics.drawable.Drawable) ((htr) obj3).d.a();
                    if (obj5 != null && (obj5 instanceof android.graphics.drawable.Animatable)) {
                        ((android.graphics.drawable.Animatable) obj5).stop();
                    }
                }
                return defpackage.afbk.a;
            case 10:
                huf hufVar = (huc) obj;
                if (hufVar instanceof huf) {
                    drawable = (android.graphics.drawable.Drawable) hufVar.a;
                } else {
                    if (!(hufVar instanceof hue)) {
                        throw new defpackage.afas();
                    }
                    drawable = ((hue) hufVar).a;
                }
                if (drawable == null) {
                    ijsVar = null;
                } else if (drawable instanceof android.graphics.drawable.BitmapDrawable) {
                    android.graphics.Bitmap bitmap = ((android.graphics.drawable.BitmapDrawable) drawable).getBitmap();
                    bitmap.getClass();
                    ijsVar = new defpackage.cnc(new defpackage.cjr(bitmap));
                } else if (drawable instanceof android.graphics.drawable.ColorDrawable) {
                    ijsVar = new defpackage.cnd(defpackage.cjv.j(((android.graphics.drawable.ColorDrawable) drawable).getColor()));
                } else {
                    android.graphics.drawable.Drawable drawableMutate = drawable.mutate();
                    drawableMutate.getClass();
                    ijsVar = new ijs(drawableMutate);
                }
                htr htrVar = (htr) this.a;
                ijs ijsVarG = htrVar.g();
                if (ijsVar != ijsVarG) {
                    defpackage.bxw bxwVar = ijsVarG instanceof defpackage.bxw ? (defpackage.bxw) ijsVarG : null;
                    if (bxwVar != null) {
                        bxwVar.ef();
                    }
                    defpackage.bxw bxwVar2 = ijsVar instanceof defpackage.bxw ? (defpackage.bxw) ijsVar : null;
                    if (bxwVar2 != null) {
                        bxwVar2.dw();
                    }
                    htrVar.d.b(drawable);
                    htrVar.i(ijsVar);
                }
                htrVar.c.b(hufVar.a());
                return defpackage.afbk.a;
            case 11:
                defpackage.afau afauVar2 = (defpackage.afau) obj;
                float fFloatValue = ((java.lang.Number) afauVar2.a).floatValue();
                if (((bqx) afauVar2.b) == bqx.c && fFloatValue == 1.0f) {
                    this.a.invoke(new java.lang.Float(0.0f));
                } else {
                    this.a.invoke(new java.lang.Float(fFloatValue));
                }
                return defpackage.afbk.a;
            case 12:
                defpackage.afau afauVar3 = (defpackage.afau) obj;
                float fFloatValue2 = ((java.lang.Number) afauVar3.a).floatValue();
                if (((bqx) afauVar3.b) == bqx.c && fFloatValue2 == 1.0f) {
                    this.a.invoke(new java.lang.Float(0.0f));
                } else {
                    this.a.invoke(new java.lang.Float(fFloatValue2));
                }
                return defpackage.afbk.a;
            default:
                defpackage.afau afauVar4 = (defpackage.afau) obj;
                float fFloatValue3 = ((java.lang.Number) afauVar4.a).floatValue();
                if (((bqx) afauVar4.b) == bqx.c && fFloatValue3 == 1.0f) {
                    this.a.invoke(new java.lang.Float(0.0f));
                } else {
                    this.a.invoke(new java.lang.Float(fFloatValue3));
                }
                return defpackage.afbk.a;
        }
    }
}
