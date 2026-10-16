package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.Map;

/* loaded from: classes2.dex */
public final class nvv extends FrameLayout implements nwe {
    public static final float a;
    public static final float b;
    public static final float c;
    public static final float d;
    public final bwq e;
    public final bwq f;
    public nwc g;
    public final bwq h;
    public final cil i;
    public final cil j;
    public final cil k;
    public final cil l;
    public final cil m;
    public final byd n;

    static {
        yph.c("GH.ComposeHUN");
        a = 710.0f;
        b = 60.0f;
        c = 10.0f;
        d = 2.0f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nvv(Context context, final nwr nwrVar) {
        super(context);
        nwrVar.getClass();
        bxp bxpVar = bxp.c;
        this.e = new ParcelableSnapshotMutableState(nwrVar, bxpVar);
        this.f = new ParcelableSnapshotMutableState(true, bxpVar);
        this.g = nwc.a;
        this.h = new ParcelableSnapshotMutableState(null, bxpVar);
        this.i = new cil();
        this.j = new cil();
        this.k = new cil();
        this.l = new cil();
        this.m = new cil();
        this.n = new ParcelableSnapshotMutableIntState(0);
        setOnApplyWindowInsetsListener(new jsg(this, 2));
        final kmf kmfVar = new kmf(context);
        kmfVar.a(new cct(-2143135380, true, new afeg() { // from class: nvt
            @Override // defpackage.afeg
            public final Object invoke(Object obj, Object obj2) {
                bux buxVar = (bux) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i = iIntValue & 3;
                if (buxVar.I(i != 2, iIntValue & 1)) {
                    final nvv nvvVar = this.a;
                    dlg dlgVar = (dlg) buxVar.f(dbc.d);
                    boolean zA = buxVar.A(nvvVar.a());
                    Object objG = buxVar.g();
                    if (zA || objG == buw.a) {
                        objG = new dlj(dlgVar.ey(nvvVar.a()));
                        buxVar.x(objG);
                    }
                    final float f = ((dlj) objG).a;
                    Object objG2 = buxVar.g();
                    Object obj3 = buw.a;
                    if (objG2 == obj3) {
                        objG2 = new afm(nwd.a);
                        buxVar.x(objG2);
                    }
                    afm afmVar = (afm) objG2;
                    afmVar.d(nvvVar.b() ? nwd.b : nwd.c);
                    agg aggVarR = afp.r(afmVar, "HunTransition", buxVar, 48);
                    Object objG3 = buxVar.g();
                    if (objG3 == obj3) {
                        objG3 = new nqz(9);
                        buxVar.x(objG3);
                    }
                    afec afecVar = (afec) objG3;
                    byte[] bArr = null;
                    aft aftVar = new aft(1.0f, 50.0f, null);
                    Object objG4 = buxVar.g();
                    if (objG4 == obj3) {
                        objG4 = new nqz(10);
                        buxVar.x(objG4);
                    }
                    acp acpVarE = acl.e(aftVar, (afec) objG4);
                    boolean zE = buxVar.E(nvvVar);
                    Object objG5 = buxVar.g();
                    int i2 = 11;
                    if (zE || objG5 == obj3) {
                        objG5 = new noo(nvvVar, i2);
                        buxVar.x(objG5);
                    }
                    final nwr nwrVar2 = nwrVar;
                    Map map = ahc.a;
                    ca.S(aggVarR, afecVar, null, acpVarE, acl.h(new aft(1.0f, 400.0f, new dlo(4294967297L)), (afec) objG5), bxc.i(-1647476797, true, new afeh() { // from class: nvu
                        @Override // defpackage.afeh
                        public final Object invoke(Object obj4, Object obj5, Object obj6) {
                            bux buxVar2 = (bux) obj5;
                            int iIntValue2 = ((Integer) obj6).intValue();
                            ((abu) obj4).getClass();
                            int i3 = iIntValue2 & 17;
                            if (buxVar2.I(i3 != 16, iIntValue2 & 1)) {
                                cfy cfyVarJ = asl.J(cfy.e, BitmapDescriptorFactory.HUE_RED, f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
                                ctp ctpVarB = atk.b(cfl.a, false);
                                int iG = a.g(buxVar2.b());
                                ccx ccxVarN = buxVar2.N();
                                cfy cfyVarJ2 = bzi.j(buxVar2, cfyVarJ);
                                afdr afdrVar = cwb.a;
                                buxVar2.M();
                                buxVar2.w();
                                if (buxVar2.G()) {
                                    buxVar2.j(afdrVar);
                                } else {
                                    buxVar2.y();
                                }
                                nvv nvvVar2 = nvvVar;
                                byq.c(buxVar2, ctpVarB, cwb.e);
                                byq.c(buxVar2, ccxVarN, cwb.d);
                                byq.c(buxVar2, Integer.valueOf(iG), cwb.f);
                                byq.b(buxVar2, cwb.g);
                                byq.c(buxVar2, cfyVarJ2, cwb.c);
                                boolean zE2 = buxVar2.E(nvvVar2);
                                Object objG6 = buxVar2.g();
                                if (zE2 || objG6 == buw.a) {
                                    objG6 = new nwy(nvvVar2, 1, (byte[]) null);
                                    buxVar2.x(objG6);
                                }
                                lxw.w(nwrVar2, (afec) objG6, nvvVar2.i, nvvVar2.j, nvvVar2.k, nvvVar2.l, nvvVar2.m, buxVar2, 0);
                                buxVar2.n();
                            } else {
                                buxVar2.s();
                            }
                            return afak.a;
                        }
                    }, buxVar), buxVar, 199728);
                    if (afmVar.e()) {
                        buxVar.v(-1455750262);
                        int i3 = 12;
                        if (afmVar.a() == nwd.b) {
                            buxVar.v(-1455676451);
                            if (leh.a.a().b()) {
                                buxVar.v(-1455623286);
                                boolean zE2 = buxVar.E(nwrVar2) | buxVar.E(nvvVar);
                                Object objG6 = buxVar.g();
                                if (zE2 || objG6 == obj3) {
                                    objG6 = new nlh(nwrVar2, nvvVar, i3, bArr);
                                    buxVar.x(objG6);
                                }
                                buxVar.r((afdr) objG6);
                                buxVar.o();
                            } else {
                                kmf kmfVar2 = kmfVar;
                                buxVar.v(-1454681289);
                                boolean zE3 = buxVar.E(kmfVar2);
                                Object objG7 = buxVar.g();
                                if (zE3 || objG7 == obj3) {
                                    objG7 = new npz(kmfVar2, i2);
                                    buxVar.x(objG7);
                                }
                                buxVar.r((afdr) objG7);
                                buxVar.o();
                            }
                            buxVar.o();
                        } else if (afmVar.a() == nwd.c) {
                            buxVar.v(-1454527281);
                            boolean zE4 = buxVar.E(nvvVar);
                            Object objG8 = buxVar.g();
                            if (zE4 || objG8 == obj3) {
                                objG8 = new npz(nvvVar, i3);
                                buxVar.x(objG8);
                            }
                            buxVar.r((afdr) objG8);
                            buxVar.o();
                        } else {
                            buxVar.v(-1454459050);
                            buxVar.o();
                        }
                        buxVar.o();
                    } else {
                        buxVar.v(-1454447146);
                        buxVar.o();
                    }
                } else {
                    buxVar.s();
                }
                return afak.a;
            }
        }));
        addView(kmfVar);
    }

    public final int a() {
        return this.n.e();
    }

    public final boolean b() {
        return ((Boolean) this.f.a()).booleanValue();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        requestApplyInsets();
    }
}
