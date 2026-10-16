package com.google.android.libraries.maps.internal;

import android.app.Activity;
import android.app.UiModeManager;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import com.google.android.apps.gmm.jni.util.NativeHelper;
import com.google.android.libraries.maps.GoogleMapOptions;
import com.google.android.libraries.maps.MapsInitializer;
import com.google.android.libraries.maps.StreetViewPanoramaOptions;
import com.google.android.libraries.maps.model.internal.IBitmapDescriptorFactoryDelegate;
import defpackage.a;
import defpackage.aaau;
import defpackage.aabc;
import defpackage.aahu;
import defpackage.addg;
import defpackage.gjt;
import defpackage.kex;
import defpackage.pta;
import defpackage.ptb;
import defpackage.sqi;
import defpackage.sqj;
import defpackage.vdv;
import defpackage.vdy;
import defpackage.vec;
import defpackage.ved;
import defpackage.veo;
import defpackage.veq;
import defpackage.vew;
import defpackage.viu;
import defpackage.viw;
import defpackage.vjb;
import defpackage.vjj;
import defpackage.ynz;
import defpackage.yob;
import defpackage.zfr;
import defpackage.zkt;
import defpackage.zrn;
import defpackage.zsv;
import defpackage.ztg;
import defpackage.zue;
import defpackage.zvb;
import defpackage.zwb;
import defpackage.zws;
import defpackage.zyd;
import defpackage.zyk;
import defpackage.zys;
import defpackage.zyx;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes3.dex */
public class CreatorImpl extends vec {
    private boolean a;
    private zyx b;
    private Resources c;
    private final boolean d;
    private aabc e;

    public CreatorImpl() {
        ved vedVar = vjb.a;
        this.d = true;
        this.a = false;
        this.b = null;
        this.e = null;
        this.c = null;
    }

    private final Resources n(Context context) {
        return (this.d && ((UiModeManager) context.getSystemService("uimode")).getCurrentModeType() == 3) ? context.getResources() : this.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0200  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final defpackage.aabc o(defpackage.gjt r28) throws android.content.pm.PackageManager.NameNotFoundException {
        /*
            Method dump skipped, instructions count: 1405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.maps.internal.CreatorImpl.o(gjt):aabc");
    }

    @Override // defpackage.ved
    public final vdy a() {
        return new zue();
    }

    @Override // defpackage.ved
    public final veo b(sqj sqjVar) {
        zkt.g(this.a, "CreatorImpl not initialized properly.");
        Activity activity = (Activity) sqi.a(sqjVar);
        gjt gjtVar = new gjt(activity, n(activity));
        return new zwb(new aaau(gjtVar, o(gjtVar)), gjtVar);
    }

    @Override // defpackage.ved
    public final veq c(sqj sqjVar, GoogleMapOptions googleMapOptions) {
        zkt.g(this.a, "CreatorImpl not initialized properly.");
        Context context = (Context) sqi.a(sqjVar);
        gjt gjtVar = new gjt(context, n(context));
        return new zws(googleMapOptions, gjtVar, o(gjtVar));
    }

    @Override // defpackage.ved
    public final viu d(sqj sqjVar) {
        zkt.g(this.a, "CreatorImpl not initialized properly.");
        gjt gjtVar = new gjt((Activity) sqi.a(sqjVar), this.c);
        return new zyd(new aaau(gjtVar, o(gjtVar)), gjtVar, Build.VERSION.SDK_INT);
    }

    @Override // defpackage.ved
    public final viw f(sqj sqjVar, StreetViewPanoramaOptions streetViewPanoramaOptions) {
        zkt.g(this.a, "CreatorImpl not initialized properly.");
        gjt gjtVar = new gjt((Context) sqi.a(sqjVar), this.c);
        return new zyk(streetViewPanoramaOptions, gjtVar, o(gjtVar));
    }

    @Override // defpackage.ved
    public final IBitmapDescriptorFactoryDelegate g() {
        return new ztg();
    }

    @Override // defpackage.ved
    public final void h(sqj sqjVar) {
        i(sqjVar, 0);
    }

    @Override // defpackage.ved
    public final void i(sqj sqjVar, int i) {
        zrn.a(4, a.bp(i, "Google Play services client version: "), new Object[0]);
        this.c = (Resources) sqi.a(sqjVar);
        ved vedVar = vjb.a;
        this.b = new zyx(i);
        MapsInitializer.initFactories(this);
        this.a = true;
    }

    @Override // defpackage.ved
    public final void j(sqj sqjVar, int i) {
        Context context = (Context) sqi.a(sqjVar);
        zvb.a(context);
        zys zysVarG = zys.g(context, this.b, "P", new kex(context, new zfr()), null);
        aahu aahuVar = aahu.MAP_INITIALIZATION_REQUEST_DEFAULT;
        if (i == 1) {
            aahuVar = aahu.MAP_INITIALIZATION_REQUEST_OPT_OUT;
        } else if (i == 2) {
            aahuVar = aahu.MAP_INITIALIZATION_REQUEST_OPT_IN;
        }
        zysVarG.b(aahuVar);
        zysVarG.b(aahu.MAP_INITIALIZATION_RESULT_LATEST);
    }

    @Override // defpackage.ved
    public final void k(String str) {
        yob yobVar = vjj.a;
        if (str.length() > 50) {
            ((ynz) ((ynz) vjj.a.h()).ai((char) 9736)).y("Internal Usage Attribution Id is too long: %s", str);
            return;
        }
        Set set = vjj.b;
        if (set.size() >= 10) {
            ((ynz) ((ynz) vjj.a.h()).ai((char) 9735)).u("Internal Usage Attribution Ids list is full.");
        } else {
            set.add(str);
        }
    }

    @Override // defpackage.ved
    public final void l() {
        try {
            NativeHelper.ensureLibraryLoaded();
        } catch (RuntimeException e) {
            UnsatisfiedLinkError unsatisfiedLinkError = new UnsatisfiedLinkError(e.getMessage());
            unsatisfiedLinkError.initCause(e);
            throw unsatisfiedLinkError;
        }
    }

    @Override // defpackage.ved
    public final void m(vew vewVar) {
        if (addg.c()) {
            vdv vdvVar = new vdv(vewVar, 0);
            String str = zsv.a;
            if (addg.c()) {
                ptb ptbVar = ptb.a;
                ptbVar.c = vdvVar;
                Iterator it = ptbVar.b.iterator();
                while (it.hasNext()) {
                    ((pta) it.next()).a();
                }
            }
        }
    }
}
