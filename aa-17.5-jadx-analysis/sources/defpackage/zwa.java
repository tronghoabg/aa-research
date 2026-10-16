package defpackage;

import android.os.RemoteException;
import com.google.android.libraries.maps.model.FeatureType;
import com.google.android.libraries.maps.model.RuntimeRemoteException;
import com.google.android.libraries.maps.model.internal.IMapCapabilitiesDelegate;
import java.util.ArrayList;
import java.util.Set;

/* loaded from: classes3.dex */
public final class zwa extends IMapCapabilitiesDelegate.Stub {
    public boolean a;
    public boolean b;
    public String c;
    public zwp d;
    final ArrayList e = new ArrayList();
    private final zuv f;
    private final zys g;
    private final abnp h;

    public zwa(zwp zwpVar, zuv zuvVar, zys zysVar) {
        this.f = zuvVar;
        this.a = k(zwpVar);
        this.b = h(zwpVar);
        this.d = zwpVar;
        if (adeb.d()) {
            abnp abnpVarN = yvs.a.n();
            boolean z = this.a;
            abnpVarN.t();
            yvs yvsVar = (yvs) abnpVarN.b;
            yvsVar.b |= 1;
            yvsVar.c = z;
            boolean z2 = this.b;
            abnpVarN.t();
            yvs yvsVar2 = (yvs) abnpVarN.b;
            yvsVar2.b |= 2;
            yvsVar2.d = z2;
            this.h = abnpVarN;
        } else {
            this.h = yvs.a.n();
        }
        this.g = zysVar;
    }

    public static final boolean k(zwp zwpVar) {
        return zwpVar == zwp.c;
    }

    public final Set a() {
        zuv zuvVar = this.f;
        return zuvVar == null ? yly.a : zuvVar.d;
    }

    public final Set b() {
        zuv zuvVar = this.f;
        return zuvVar == null ? yly.a : zuvVar.c;
    }

    final void c(vgj vgjVar) {
        this.e.add(vgjVar);
    }

    public final void d() {
        zrn.a(4, "Map capabilities changed. Capabilities available for the Map ID: ".concat(true != this.a ? "" : "AdvancedMarkers, ").concat(true == this.b ? "Data-driven styling, " : "").concat("See debug log level for details.\n"), new Object[0]);
        f();
        if (adeb.d()) {
            zys zysVar = this.g;
            aahu aahuVar = aahu.MAP_CAPABILITIES_CHANGED;
            abnp abnpVarN = yvv.a.n();
            abnp abnpVarN2 = yvt.a.n();
            abnp abnpVar = this.h;
            abnpVarN2.t();
            yvt yvtVar = (yvt) abnpVarN2.b;
            yvs yvsVar = (yvs) abnpVar.q();
            yvsVar.getClass();
            yvtVar.d = yvsVar;
            yvtVar.b |= 2;
            boolean z = this.a;
            abnpVar.t();
            yvs yvsVar2 = (yvs) abnpVar.b;
            yvsVar2.b |= 1;
            yvsVar2.c = z;
            boolean z2 = this.b;
            abnpVar.t();
            yvs yvsVar3 = (yvs) abnpVar.b;
            yvsVar3.b |= 2;
            yvsVar3.d = z2;
            abnpVarN2.t();
            yvt yvtVar2 = (yvt) abnpVarN2.b;
            yvs yvsVar4 = (yvs) abnpVar.q();
            yvsVar4.getClass();
            yvtVar2.c = yvsVar4;
            yvtVar2.b |= 1;
            yvt yvtVar3 = (yvt) abnpVarN2.q();
            abnpVarN.t();
            yvv yvvVar = (yvv) abnpVarN.b;
            yvtVar3.getClass();
            yvvVar.c = yvtVar3;
            yvvVar.b = 1;
            zysVar.c(aahuVar, (yvv) abnpVarN.q());
        }
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ((vgj) arrayList.get(i)).e(this);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void f() {
        /*
            r3 = this;
            boolean r0 = r3.a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "For capability in capabilities, log:\n\"AdvancedMarkers: "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            boolean r1 = r3.a
            if (r1 != 0) goto L27
            java.lang.String r1 = r3.c
            boolean r2 = defpackage.woy.am(r1)
            if (r2 != 0) goto L27
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = ": "
            java.lang.String r1 = r2.concat(r1)
            goto L29
        L27:
            java.lang.String r1 = "\n"
        L29:
            java.lang.String r0 = r0.concat(r1)
            boolean r3 = r3.b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "\"Data-driven styling: "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 3
            defpackage.zrn.a(r1, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zwa.f():void");
    }

    final void g(String str, String str2, String str3) {
        String strConcat = this.d != zwp.c ? "%s: The map is initialized without a valid Map ID, that will prevent use of data-driven styling." : (a().isEmpty() && b().isEmpty()) ? "%s: The Map Style does not have any Datasets or FeatureLayers configured for data-driven styling." : (str2 == null || i(str2)) ? (str.equals(FeatureType.DATASET) || j(str)) ? "" : "%s: The Map Style does not have the following FeatureLayer configured for data-driven styling: ".concat(String.valueOf(str)) : "%s: The Map Style does not have the following Dataset ID associated with it: ".concat(str2);
        if (strConcat.isEmpty()) {
            return;
        }
        zrn.b(String.format(strConcat, str3));
    }

    public final boolean h(zwp zwpVar) {
        if (zwpVar == zwp.c) {
            return (b().isEmpty() && a().isEmpty()) ? false : true;
        }
        return false;
    }

    final boolean i(String str) {
        return this.b && a().contains(str);
    }

    @Override // com.google.android.libraries.maps.model.internal.IMapCapabilitiesDelegate
    public final boolean isAdvancedMarkersAvailable() {
        return this.a;
    }

    @Override // com.google.android.libraries.maps.model.internal.IMapCapabilitiesDelegate
    public final boolean isDataDrivenStylingAvailable() {
        return this.b;
    }

    final boolean j(String str) {
        return this.b && b().contains(zuv.a.get(str));
    }
}
