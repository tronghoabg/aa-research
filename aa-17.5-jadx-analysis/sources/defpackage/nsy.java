package defpackage;

import android.content.Context;
import com.google.android.apps.auto.sdk.nav.state.TurnEvent;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class nsy {
    public final Object a;

    public nsy(Context context) {
        zfy zfyVar = new zfy();
        zfyVar.c = "com.google.android.enterprise.connectedapps.CrossProfileConnector_Service";
        zfyVar.a = qdi.DEFAULT;
        zfyVar.b = context;
        this.a = new qco(zfyVar);
    }

    public static nsy a() {
        return (nsy) mki.a.i(nsy.class);
    }

    public final void b(TurnEvent turnEvent) {
        wer.c();
        ((eqj) this.a).m(turnEvent);
    }

    public final abzn c(long j) {
        abnp abnpVarA = ((abnp) this.a).a();
        abnpVarA.t();
        abzn abznVar = (abzn) abnpVarA.b;
        abzn abznVar2 = abzn.a;
        abznVar.b |= 1;
        abznVar.c = j;
        return (abzn) abnpVarA.q();
    }

    public final boolean d() {
        return DesugarCollections.unmodifiableList(((abzn) ((abnp) this.a).b).d).isEmpty();
    }

    public final void e(abnp abnpVar) {
        abnp abnpVar2 = (abnp) this.a;
        abnpVar2.t();
        abzn abznVar = (abzn) abnpVar2.b;
        abzo abzoVar = (abzo) abnpVar.q();
        abzn abznVar2 = abzn.a;
        abzoVar.getClass();
        abznVar.b();
        abznVar.d.add(abzoVar);
    }

    public final void f(String str, String str2) {
        abnp abnpVarN = abzo.a.n();
        if (str != null) {
            abnpVarN.t();
            abzo abzoVar = (abzo) abnpVarN.b;
            abzoVar.b |= 1;
            abzoVar.e = str;
            if (str2 != null) {
                abnpVarN.t();
                abzo abzoVar2 = (abzo) abnpVarN.b;
                abzoVar2.c = 24;
                abzoVar2.d = str2;
                e(abnpVarN);
                return;
            }
        }
        throw null;
    }

    public final void g(Enum r2, afdr afdrVar) {
        Map map = ((teh) this.a).a;
        Object arrayList = map.get(r2);
        if (arrayList == null) {
            arrayList = new ArrayList();
            map.put(r2, arrayList);
        }
        ((List) arrayList).add(afdrVar);
    }

    public final void h(Enum r2, afdr afdrVar) {
        Map map = ((teh) this.a).b;
        Object arrayList = map.get(r2);
        if (arrayList == null) {
            arrayList = new ArrayList();
            map.put(r2, arrayList);
        }
        ((List) arrayList).add(afdrVar);
    }

    public final void i(Enum r4, Enum[] enumArr, afdr afdrVar) {
        Set setDi = woy.di(enumArr);
        Iterator it = setDi.iterator();
        while (it.hasNext()) {
            ((teh) this.a).b(r4, (Enum) it.next());
        }
        if (afdrVar != null) {
            Iterator it2 = setDi.iterator();
            while (it2.hasNext()) {
                ((teh) this.a).c(r4, (Enum) it2.next(), afdrVar);
            }
        }
    }

    public final boolean j() {
        return ((qco) this.a).e().a();
    }

    public nsy(byte[] bArr) {
        this.a = abzn.a.n();
    }

    public nsy() {
        this.a = new eqm();
    }

    public nsy(Enum r2, tei teiVar, tek tekVar) {
        teh tehVar = new teh(r2, teiVar);
        this.a = tehVar;
        if (tekVar != null) {
            tehVar.c = tekVar;
        }
    }
}
