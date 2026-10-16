package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import android.telecom.Call;
import android.util.Log;
import com.google.android.apps.auto.components.telecom.call.CarCall;
import com.google.android.enterprise.connectedapps.internal.Bundler;
import com.google.android.enterprise.connectedapps.internal.BundlerType;
import java.util.Map;

/* loaded from: classes2.dex */
public final class ohb {
    public final Object a;
    public final Object b;
    public final Object c;

    public ohb() {
        this.a = "g";
        this.b = "h";
        this.c = "i";
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Map] */
    public final void a(final boolean z) {
        yph yphVar = ohh.b;
        ((ype) yphVar.f()).u("onVoipCallSilenceStateChanged");
        ?? r1 = this.b;
        Object obj = this.a;
        ohf ohfVar = (ohf) r1.get(obj);
        if (ohfVar == null) {
            ((ype) yphVar.h()).y("No entry in call silence map for call %s", obj);
            return;
        }
        ohfVar.a();
        ohfVar.c = z;
        ((ajmd) this.c).m(new ogx() { // from class: oha
            @Override // defpackage.ogx
            public final void a(ajmd ajmdVar) {
                ogp ogpVar = (ogp) ajmdVar.a;
                ogc ogcVar = ogpVar.b;
                ogcVar.getClass();
                Call call = (Call) this.a.a;
                final CarCall carCallC = ogcVar.c(call);
                carCallC.getClass();
                ((ype) ((ype) ogp.a.f()).ai(5886)).w("onVoipCallSilenceStateChanged for call: %s", carCallC.a);
                call.registerCallback(ogpVar.c);
                final boolean z2 = z;
                ogpVar.a(new ogo() { // from class: ogm
                    @Override // defpackage.ogo
                    public final void a(ogs ogsVar) throws RemoteException {
                        ogsVar.s(carCallC, z2);
                    }
                });
            }
        });
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, qdc] */
    public final void b(Throwable th) throws InterruptedException {
        Bundle bundle = new Bundle(Bundler.class.getClassLoader());
        bundle.putSerializable("throwable", th);
        try {
            new qdq(this.a).makeBundleCall(bundle);
        } catch (qdl unused) {
            Log.e("FutureResult", "Connection was dropped before response");
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [aezk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [aezk, java.lang.Object] */
    public final /* synthetic */ qsb c(qbv qbvVar) {
        tmb tmbVar = (tmb) this.b.a();
        tmbVar.getClass();
        zgt zgtVarB = ((uxv) this.a).b();
        plo ploVar = (plo) this.c.a();
        ploVar.getClass();
        qbvVar.getClass();
        return new qsb(tmbVar, zgtVarB, ploVar, qbvVar);
    }

    public ohb(byte[] bArr) {
        this.b = "b";
        this.c = "c";
        this.a = "d";
    }

    public ohb(byte[] bArr, byte[] bArr2) {
        this.a = "e";
        this.c = "f";
        this.b = "g";
    }

    public ohb(char[] cArr) {
        this.a = "g";
        this.c = "h";
        this.b = "i";
    }

    public ohb(ajmd ajmdVar, Call call, Map map) {
        ajmdVar.getClass();
        map.getClass();
        this.c = ajmdVar;
        this.a = call;
        this.b = map;
    }

    public ohb(aezk aezkVar, aezk aezkVar2, aezk aezkVar3) {
        aezkVar.getClass();
        this.b = aezkVar;
        aezkVar2.getClass();
        this.a = aezkVar2;
        this.c = aezkVar3;
    }

    public ohb(qdc qdcVar, Bundler bundler, BundlerType bundlerType) {
        qdcVar.getClass();
        this.a = qdcVar;
        this.c = bundler;
        this.b = bundlerType;
    }
}
