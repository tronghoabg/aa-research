package com.google.android.apps.auto.components.messaging.template;

import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.car.app.model.Action;
import defpackage.actj;
import defpackage.eqj;
import defpackage.llv;
import defpackage.lou;
import defpackage.luh;
import defpackage.luj;
import defpackage.lxs;
import defpackage.lxw;
import defpackage.lyf;
import defpackage.lyg;
import defpackage.lyh;
import defpackage.miq;
import defpackage.mqc;
import defpackage.mqp;
import defpackage.qn;
import defpackage.qz;
import defpackage.szp;
import defpackage.tlh;
import defpackage.tll;
import defpackage.tlm;
import defpackage.tlq;
import defpackage.uj;
import defpackage.ynz;
import j$.util.Collection;
import j$.util.Optional;
import java.io.FileNotFoundException;

/* loaded from: classes2.dex */
public class MessagingRemoteScreenService extends tlq {
    private lyf d;

    @Override // defpackage.tlq
    protected final tlm e(String str, qz qzVar) throws PackageManager.NameNotFoundException, FileNotFoundException {
        lyf lyfVar = this.d;
        Optional optionalFindFirst = Collection.EL.stream(lyfVar.b()).filter(new lou(str, 8)).findFirst();
        miq miqVar = new miq(lyfVar, 1);
        if (true == optionalFindFirst.isPresent()) {
            mqc mqcVar = (mqc) optionalFindFirst.get();
            lyf lyfVar2 = (lyf) miqVar.a;
            mqp mqpVar = (mqp) lyfVar2.c.apply(mqcVar);
            if (mqpVar == null) {
                ((ynz) ((ynz) lyf.a.h()).ai((char) 4451)).y("Could not load app info for component %s", mqcVar.a());
                optionalFindFirst = Optional.empty();
            } else {
                Drawable drawableF = mqpVar.d.f(lyfVar2.b, -1);
                if (drawableF == null) {
                    ((ynz) ((ynz) lyf.a.h()).ai((char) 4450)).y("Could not load app icon for app %s", mqcVar);
                    optionalFindFirst = Optional.empty();
                } else {
                    optionalFindFirst = Optional.of(new tlh(mqcVar.a().getPackageName(), new tll(mqcVar.a().getPackageName()), mqpVar.e, drawableF));
                }
            }
        }
        tlh tlhVar = (tlh) optionalFindFirst.orElseThrow(new llv(str, 8));
        qn qnVarA = qzVar.a();
        String str2 = tlhVar.a;
        ((ynz) ((ynz) lyh.a.e()).ai((char) 4458)).y("Creating the RemoteScreen for %s", str2);
        lxw.c();
        luh luhVarB = lxw.b(str2);
        luj lujVarE = luhVarB.e();
        Resources resources = qnVarA.getResources();
        lxw.c();
        eqj eqjVarA = lxw.a(luhVarB);
        Optional optionalC = lxs.b().c(tlhVar.c, lujVarE.a, actj.B() ? lujVarE.d : 0);
        tlhVar.getClass();
        uj ujVarR = szp.r(tlhVar);
        ujVarR.a = true;
        return new lyg(ujVarR.a(), resources, tlhVar, (Action) optionalC.orElse(null), eqjVarA, lujVarE);
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.d = lyf.a();
    }
}
