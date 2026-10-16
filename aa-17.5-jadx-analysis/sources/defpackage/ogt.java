package defpackage;

import com.google.android.apps.auto.components.telecom.call.CarCall;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final /* synthetic */ class ogt implements ogx {
    @Override // defpackage.ogx
    public final void a(ajmd ajmdVar) {
        ArrayList<CarCall> arrayList;
        yph yphVar = ogy.a;
        ((ype) ((ype) ogp.a.f()).ai((char) 5887)).u("onUnbind, ending ongoing calls.");
        if (acqd.m()) {
            ogc ogcVar = ((ogp) ajmdVar.a).b;
            ((ype) ((ype) ogc.a.f()).ai((char) 5879)).u("getAllCalls");
            arrayList = new ArrayList(ogcVar.c.values());
        } else {
            ogc ogcVar2 = ((ogp) ajmdVar.a).b;
            ((ype) ((ype) ogc.a.f()).ai((char) 5878)).u("clearCalls");
            ConcurrentHashMap concurrentHashMap = ogcVar2.c;
            arrayList = new ArrayList(concurrentHashMap.values());
            concurrentHashMap.clear();
        }
        for (CarCall carCall : arrayList) {
            ((ogp) ajmdVar.a).a(new ogk(carCall, 3));
        }
    }
}
