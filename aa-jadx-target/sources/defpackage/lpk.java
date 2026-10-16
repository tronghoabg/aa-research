package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class lpk implements java.util.function.Function {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ lpk(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function andThen(java.util.function.Function function) {
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                break;
            case 1:
                break;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                break;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                break;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                break;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                break;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                break;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                break;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
        }
        return j$.util.function.Function.-CC.$default$andThen(this, function);
    }

    /* JADX WARN: Type inference failed for: r14v17, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v19, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v21, types: [affc, java.lang.Object] */
    @Override // java.util.function.Function
    public final java.lang.Object apply(java.lang.Object obj) throws java.io.IOException {
        java.lang.String strBo;
        java.lang.String string;
        int i = 1;
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                defpackage.yqm yqmVar = defpackage.lpx.a;
                return new lpv((lmi) this.a);
            case 1:
                return defpackage.lpx.h((defpackage.qsh) this.a, (lpm) obj);
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                return defpackage.lpx.h((defpackage.qsh) this.a, (lpm) obj);
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                defpackage.yqm yqmVar2 = defpackage.lqf.a;
                return new lpy((defpackage.lma) obj, (android.content.ComponentName) this.a);
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return defpackage.tcu.C(defpackage.tcu.v(defpackage.tcu.C(((lrb) this.a).a, new defpackage.lra(defpackage.lpg.j(), i)), new defpackage.lqi(4)), new defpackage.lra(((defpackage.lma) obj).i(), 0));
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                defpackage.mdb mdbVar = defpackage.mdc.a;
                return this.a.invoke(obj);
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.mdb mdbVar2 = defpackage.mdc.a;
                return this.a.invoke(obj);
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.mdb mdbVar3 = defpackage.mdc.a;
                return this.a.invoke(obj);
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                com.google.android.gms.car.RadioProgramInfo radioProgramInfo = (com.google.android.gms.car.RadioProgramInfo) obj;
                defpackage.yqm yqmVar3 = miq.a;
                return new mip(((mja) this.a).u(radioProgramInfo), radioProgramInfo.a);
            case 9:
                com.google.android.gms.car.RadioProgramInfo radioProgramInfo2 = (com.google.android.gms.car.RadioProgramInfo) obj;
                defpackage.yqm yqmVar4 = miq.a;
                return new mip(((mja) this.a).u(radioProgramInfo2), radioProgramInfo2.a);
            case 10:
                min minVar = (min) obj;
                dc dcVar = new dc();
                com.google.android.gms.car.RadioConfiguration.RadioBandGroup radioBandGroup = minVar.c;
                android.content.Context context = ((mis) this.a).f;
                if (radioBandGroup == null) {
                    strBo = context.getString(2132084868);
                    strBo.getClass();
                } else {
                    java.util.List<java.lang.Integer> list = radioBandGroup.a;
                    list.getClass();
                    if (defpackage.afga.f(defpackage.afga.bf(list), min.a)) {
                        strBo = context.getString(2132084870);
                        strBo.getClass();
                    } else {
                        list.getClass();
                        java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.afga.aj(list, 10));
                        for (java.lang.Integer num : list) {
                            if (num != null && num.intValue() == 1) {
                                string = context.getString(2132084866);
                            } else if (num != null && num.intValue() == 2) {
                                string = context.getString(2132084869);
                            } else {
                                string = (num != null && num.intValue() == 3) ? context.getString(2132084867) : null;
                            }
                            arrayList.add(string);
                        }
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        for (java.lang.Object obj2 : arrayList) {
                            java.lang.String str = (java.lang.String) obj2;
                            if (str != null && str.length() != 0) {
                                arrayList2.add(obj2);
                            }
                        }
                        strBo = defpackage.afga.bo(arrayList2, " | ", null, null, null, 62);
                    }
                }
                dcVar.b = strBo;
                dcVar.a = minVar.a();
                java.lang.String str2 = radioBandGroup != null ? radioBandGroup.c : null;
                android.os.Bundle bundle = new android.os.Bundle();
                if (minVar.c()) {
                    bundle.putInt("android.media.browse.CONTENT_STYLE_PLAYABLE_HINT", 2);
                } else if (!android.text.TextUtils.isEmpty(str2)) {
                    java.util.ArrayList<java.lang.String> arrayList3 = new java.util.ArrayList<>();
                    arrayList3.add(str2);
                    bundle.putStringArrayList("androidx.media.utils.extras.CUSTOM_BROWSER_ACTION_ID_LIST", arrayList3);
                }
                if (radioBandGroup != null) {
                    java.util.ArrayList<java.lang.Integer> arrayList4 = new java.util.ArrayList<>();
                    java.util.Iterator it = radioBandGroup.a.iterator();
                    while (it.hasNext()) {
                        arrayList4.add((java.lang.Integer) it.next());
                    }
                    bundle.putIntegerArrayList("com.google.android.apps.auto.radio.CONFIGURED_BANDS", arrayList4);
                }
                if (!bundle.isEmpty()) {
                    dcVar.g = bundle;
                }
                return new android.support.v4.media.MediaBrowserCompat.MediaItem(dcVar.a(), 1);
            case 11:
                return (java.lang.String) a$.ExternalSyntheticApiModelOutline2.m(ll$.ExternalSyntheticApiModelOutline0.m(obj), this.a);
            case 12:
                return ((miy) this.a).e((com.google.android.gms.car.RadioProgramInfo) obj);
            case 13:
                return ((miy) this.a).e((com.google.android.gms.car.RadioProgramInfo) obj);
            case 14:
                return ((miy) this.a).f((com.google.android.gms.car.RadioProgramInfo) obj);
            case 15:
                return ((miy) this.a).d((com.google.android.gms.car.RadioProgramInfo) obj);
            case 16:
                return ((miy) this.a).h((com.google.android.gms.car.RadioProgramInfo) obj);
            case 17:
                return ((miy) this.a).e((com.google.android.gms.car.RadioProgramInfo) obj);
            case 18:
                return ((miy) this.a).d((com.google.android.gms.car.RadioProgramInfo) obj);
            case 19:
                return ((miy) this.a).f((com.google.android.gms.car.RadioProgramInfo) obj);
            default:
                return ((miy) this.a).e((com.google.android.gms.car.RadioProgramInfo) obj);
        }
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                break;
            case 1:
                break;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                break;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                break;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                break;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                break;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                break;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                break;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
        }
        return j$.util.function.Function.-CC.$default$compose(this, function);
    }
}
