package defpackage;

import android.view.View;
import com.google.android.projection.gearhead.R;

/* loaded from: classes3.dex */
public final /* synthetic */ class aafb implements zxv {
    public final /* synthetic */ View a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ aafb(aafc aafcVar, String str, int i) {
        this.c = i;
        this.a = aafcVar;
        this.b = str;
    }

    @Override // defpackage.zxv
    public final void a(zxw zxwVar) {
        if (this.c == 0) {
            Object obj = this.b;
            zkt.n(obj, "requestedPanoId");
            aafc aafcVar = (aafc) this.a;
            aagi aagiVarA = aafcVar.i.a();
            if (aagiVarA.i() || !a.C(obj, aagiVarA.b)) {
                return;
            }
            if (zxwVar.k() <= 0) {
                aafcVar.setContentDescription(String.format("%s: %s", aafcVar.n, aafcVar.p));
                return;
            } else {
                aafcVar.setContentDescription(String.format("%s: %s", aafcVar.n, zxwVar.l().f()));
                return;
            }
        }
        if (zxwVar.k() > 0) {
            View view = this.a;
            Object obj2 = this.b;
            aacq aacqVarL = zxwVar.l();
            zkt.m(aacqVarL);
            view.announceForAccessibility(((zxa) obj2).j.F(R.string.maps_YOUR_LOCATION) + ": " + aacqVarL.f());
        }
    }

    public /* synthetic */ aafb(zxa zxaVar, View view, int i) {
        this.c = i;
        this.b = zxaVar;
        this.a = view;
    }
}
