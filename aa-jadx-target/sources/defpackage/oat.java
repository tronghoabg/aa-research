package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class oat implements defpackage.affc {
    private final /* synthetic */ int a;

    public /* synthetic */ oat(int i) {
        this.a = i;
    }

    @Override // defpackage.affc
    public final java.lang.Object invoke(java.lang.Object obj) throws java.io.IOException {
        switch (this.a) {
            case defpackage.abnt.b /* 0 */:
                ((java.lang.Boolean) obj).booleanValue();
                return defpackage.afbk.a;
            case 1:
                ((java.lang.Boolean) obj).booleanValue();
                return defpackage.afbk.a;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                java.util.List list = (java.util.List) obj;
                defpackage.yhx yhxVar = defpackage.obg.a;
                list.getClass();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj2 : list) {
                    if (obj2 instanceof kjq) {
                        arrayList.add(obj2);
                    }
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList(defpackage.afga.aj(arrayList, 10));
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((kjq) it.next()).a);
                }
                return arrayList2;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                java.lang.Integer num = (java.lang.Integer) obj;
                return java.lang.Boolean.valueOf(num.intValue() == 1 || num.intValue() == 2);
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                defpackage.nfh nfhVar = (defpackage.nfh) obj;
                defpackage.oji ojiVar = defpackage.ojl.a;
                nfhVar.getClass();
                return java.lang.Boolean.valueOf(nfhVar.b >= ((float) defpackage.acyc.v()) / 10.0f);
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                defpackage.nfh nfhVar2 = (defpackage.nfh) obj;
                defpackage.oji ojiVar2 = defpackage.ojl.a;
                nfhVar2.getClass();
                return java.lang.Boolean.valueOf(nfhVar2.c == 3);
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                com.google.android.gms.car.navigation.NavigationCurrentPosition navigationCurrentPosition = (com.google.android.gms.car.navigation.NavigationCurrentPosition) obj;
                if (navigationCurrentPosition != null) {
                    return navigationCurrentPosition.a;
                }
                return null;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                com.google.android.gms.car.navigation.NavigationState navigationState = (com.google.android.gms.car.navigation.NavigationState) obj;
                if (navigationState != null) {
                    return (com.google.android.gms.car.navigation.NavigationStep) defpackage.ysr.au(navigationState.c());
                }
                return null;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                com.google.android.gms.car.navigation.NavigationCurrentPosition navigationCurrentPosition2 = (com.google.android.gms.car.navigation.NavigationCurrentPosition) obj;
                if (navigationCurrentPosition2 != null) {
                    return (com.google.android.gms.car.navigation.DestinationDistance) defpackage.ysr.au(navigationCurrentPosition2.a());
                }
                return null;
            case 9:
                com.google.android.gms.car.navigation.NavigationStep navigationStep = (com.google.android.gms.car.navigation.NavigationStep) obj;
                defpackage.yqm yqmVar = olt.a;
                if (navigationStep == null) {
                    return null;
                }
                java.lang.String str = navigationStep.b;
                if (true != defpackage.xzh.a(str)) {
                    return str;
                }
                return null;
            case 10:
                return olt.b((com.google.android.gms.car.navigation.DestinationDistance) obj);
            case 11:
                return com.google.android.apps.auto.components.graphics.icon.GhIcon.j((android.content.ComponentName) obj);
            case 12:
                defpackage.yqm yqmVar2 = com.google.android.apps.auto.components.ui.media.MediaPlaybackView.a;
                ((emw) obj).c(0.75f);
                return defpackage.afbk.a;
            case 13:
                defpackage.abo aboVar = (defpackage.abo) obj;
                aboVar.getClass();
                int i = aboVar.g() != oqc.b ? -1 : 1;
                return new defpackage.acf(defpackage.acs.c(new defpackage.aga(1.0f, 400.0f, new defpackage.dlw(4294967297L)), new defpackage.aap(new defpackage.cii(i, 7), 13)).a(defpackage.acs.z(null, 3)), defpackage.acs.h(new defpackage.aga(1.0f, 400.0f, new defpackage.dlw(4294967297L)), new defpackage.aap(new defpackage.cii(i, 8), 14)).a(defpackage.acs.A(null, 3)), 0.0f, 12);
            case 14:
                defpackage.cla claVar = (defpackage.cla) obj;
                claVar.getClass();
                claVar.z(0.33333334f);
                claVar.A(0.33333334f);
                claVar.E(defpackage.tna.aK(0.0f, 0.0f));
                return defpackage.afbk.a;
            case 15:
                pab pabVar = pac.a;
                return pcl.a;
            case 16:
                java.util.List list2 = (java.util.List) obj;
                defpackage.afdo afdoVar = defpackage.tcu.a;
                list2.getClass();
                return defpackage.afga.ak(defpackage.afga.aO(list2));
            case 17:
                defpackage.afdo afdoVar2 = defpackage.tcu.a;
                return java.lang.Boolean.valueOf(obj == null);
            case 18:
                ((defpackage.to) obj).getClass();
                return defpackage.afbk.a;
            case 19:
                ((defpackage.to) obj).getClass();
                return defpackage.afbk.a;
            default:
                java.net.URL url = (java.net.URL) obj;
                url.getClass();
                java.io.InputStream inputStreamOpenStream = url.openStream();
                inputStreamOpenStream.getClass();
                return inputStreamOpenStream;
        }
    }
}
