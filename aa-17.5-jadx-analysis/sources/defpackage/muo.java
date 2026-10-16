package defpackage;

import com.google.android.apps.auto.components.media.repository.suggestion.AssistantMediaSuggestionPlaybackPayload;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class muo implements afec {
    private final /* synthetic */ int r;
    public static final muo q = new muo(16);
    public static final muo p = new muo(15);
    public static final muo o = new muo(14);
    public static final muo n = new muo(13);
    public static final muo m = new muo(12);
    public static final muo l = new muo(11);
    public static final muo k = new muo(10);
    public static final muo j = new muo(9);
    public static final muo i = new muo(8);
    public static final muo h = new muo(7);
    public static final muo g = new muo(6);
    public static final muo f = new muo(5);
    public static final muo e = new muo(4);
    public static final muo d = new muo(3);
    public static final muo c = new muo(2);
    public static final muo b = new muo(1);
    public static final muo a = new muo(0);

    public muo(int i2) {
        this.r = i2;
    }

    @Override // defpackage.afec
    public final /* synthetic */ Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                return afak.a;
            case 1:
                return afak.a;
            case 2:
                return afak.a;
            case 3:
                return afak.a;
            case 4:
                return afak.a;
            case 5:
                return afak.a;
            case 6:
                return afak.a;
            case 7:
                return Boolean.valueOf(obj instanceof AssistantMediaSuggestionPlaybackPayload);
            case 8:
                doi doiVar = (doi) obj;
                doiVar.getClass();
                doiVar.c(new ncp("parent"));
                doiVar.b(new ncp("parent"));
                return afak.a;
            case 9:
                doi doiVar2 = (doi) obj;
                doiVar2.getClass();
                doj dojVar = doiVar2.c;
                doiVar2.i.k(dojVar.d, BitmapDescriptorFactory.HUE_RED);
                doiVar2.j.k(dojVar.g, BitmapDescriptorFactory.HUE_RED);
                doiVar2.g.j(dojVar.e, BitmapDescriptorFactory.HUE_RED);
                return afak.a;
            case 10:
                doi doiVar3 = (doi) obj;
                doiVar3.getClass();
                doj dojVar2 = doiVar3.c;
                doiVar3.e.j(dojVar2.b, BitmapDescriptorFactory.HUE_RED);
                doiVar3.g.j(dojVar2.e, BitmapDescriptorFactory.HUE_RED);
                doiVar3.j.k(dojVar2.g, BitmapDescriptorFactory.HUE_RED);
                doiVar3.c(new ncp("spread"));
                return afak.a;
            case 11:
                kso ksoVar = (kso) obj;
                ksoVar.getClass();
                return new cjv(ksoVar.d());
            case 12:
                kso ksoVar2 = (kso) obj;
                ksoVar2.getClass();
                return new cjv(ksoVar2.C());
            case 13:
                kso ksoVar3 = (kso) obj;
                ksoVar3.getClass();
                return new cjv(ksoVar3.t());
            case 14:
                return afak.a;
            case 15:
                return null;
            default:
                return Boolean.valueOf(obj instanceof afdb);
        }
    }
}
