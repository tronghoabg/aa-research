package defpackage;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentContainerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class jvk {
    public static final /* synthetic */ int a = 0;
    private static final yph b = yph.c("ComposeVoicePlate");

    public static final void a(cfy cfyVar, boolean z, eqj eqjVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-495065443);
        if (i3 == 0) {
            i2 = (true != buxVarC.C(cfyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.D(z) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.E(eqjVar) ? 128 : 256;
        }
        if (buxVarC.I((i2 & 147) != 146, i2 & 1)) {
            bym bymVarF = bxc.f(eqjVar, 0, buxVarC);
            boolean zC = z ? lef.a.a().c() : lef.a.a().b();
            final boolean z2 = ((Number) bymVarF.a()).intValue() == 2;
            yph yphVar = b;
            ((ype) yphVar.f()).R("Compose Voice Plate: demandSpaceState=%s, useCalVoicePlate=%s, voicePlateVisible=%s", Integer.valueOf(((Number) bymVarF.a()).intValue()), Boolean.valueOf(zC), Boolean.valueOf(z2));
            if (!zC) {
                ((ype) yphVar.f()).u("Not showing Compose Voice Plate due to CAL Voice Plate disabled");
                bxf bxfVarJ = buxVarC.J();
                if (bxfVarJ != null) {
                    bxfVarJ.c = new jvi(cfyVar, z, eqjVar, i, 0);
                    return;
                }
                return;
            }
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            Object obj = buw.a;
            if (objS == obj) {
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = new ParcelableSnapshotMutableState(false, bxp.c);
                bvvVar.ad(parcelableSnapshotMutableState);
                objS = parcelableSnapshotMutableState;
            }
            bwq bwqVar = (bwq) objS;
            if (((Number) bymVarF.a()).intValue() == 2 || (acxa.ay() && ((Number) bymVarF.a()).intValue() == 1)) {
                bwqVar.b(true);
            }
            if (!((Boolean) bwqVar.a()).booleanValue()) {
                bxf bxfVarJ2 = buxVarC.J();
                if (bxfVarJ2 != null) {
                    bxfVarJ2.c = new gvo(cfyVar, z, eqjVar, i, 3, null);
                    return;
                }
                return;
            }
            View view = (View) buxVarC.f(daa.f);
            boolean zC2 = buxVarC.C(view);
            Object objS2 = bvvVar.S();
            if (zC2 || objS2 == obj) {
                view.getClass();
                objS2 = bt.g(view);
                if (objS2 == null) {
                    throw new IllegalStateException(a.bm(view, "View ", " does not have a Fragment set"));
                }
                bvvVar.ad(objS2);
            }
            final bt childFragmentManager = ((Fragment) objS2).getChildFragmentManager();
            childFragmentManager.getClass();
            Object objS3 = bvvVar.S();
            if (objS3 == obj) {
                Fragment fragmentF = childFragmentManager.f("VoicePlateFragment");
                objS3 = fragmentF instanceof jvo ? (jvo) fragmentF : null;
                if (objS3 == null) {
                    objS3 = new jvo(true);
                }
                bvvVar.ad(objS3);
            }
            final jvo jvoVar = (jvo) objS3;
            Object[] objArr = new Object[0];
            Object objS4 = bvvVar.S();
            if (objS4 == obj) {
                objS4 = new grl(19);
                bvvVar.ad(objS4);
            }
            final int iIntValue = ((Number) byx.s(Arrays.copyOf(objArr, 0), cdu.a, (afdr) objS4, buxVarC, 3456)).intValue();
            cfy cfyVarA = cfyVar.a(new aix(kfn.i(buxVarC).a(), ckq.a));
            boolean zA = buxVarC.A(iIntValue);
            Object objS5 = bvvVar.S();
            if (zA || objS5 == obj) {
                objS5 = new cia(iIntValue, 5);
                bvvVar.ad(objS5);
            }
            afec afecVar = (afec) objS5;
            boolean zE = buxVarC.E(childFragmentManager) | buxVarC.E(jvoVar) | buxVarC.A(iIntValue) | buxVarC.D(z2);
            Object objS6 = bvvVar.S();
            if (zE || objS6 == obj) {
                objS6 = new afec() { // from class: jvj
                    @Override // defpackage.afec
                    public final Object invoke(Object obj2) {
                        FragmentContainerView fragmentContainerView = (FragmentContainerView) obj2;
                        int i4 = jvk.a;
                        fragmentContainerView.getClass();
                        bt btVar = childFragmentManager;
                        Fragment fragmentF2 = btVar.f("VoicePlateFragment");
                        jvo jvoVar2 = fragmentF2 instanceof jvo ? (jvo) fragmentF2 : null;
                        jvo jvoVar3 = jvoVar;
                        if (jvoVar2 == null) {
                            jvoVar2 = jvoVar3;
                        }
                        if (jvoVar2.isAdded()) {
                            View view2 = jvoVar2.getView();
                            if (view2 != null && !affa.f(view2.getParent(), fragmentContainerView)) {
                                ViewParent parent = view2.getParent();
                                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                                if (viewGroup != null) {
                                    viewGroup.removeView(view2);
                                }
                                fragmentContainerView.addView(view2);
                            }
                        } else {
                            int i5 = iIntValue;
                            w wVar = new w(btVar);
                            wVar.e(i5, jvoVar2, "VoicePlateFragment", 1);
                            wVar.c();
                        }
                        boolean z3 = z2;
                        fragmentContainerView.setVisibility(true != z3 ? 8 : 0);
                        fragmentContainerView.setFocusable(z3);
                        fragmentContainerView.setDescendantFocusability(true != z3 ? 393216 : 262144);
                        jvoVar2.l(z3);
                        return afak.a;
                    }
                };
                bvvVar.ad(objS6);
            }
            jur.f(afecVar, cfyVarA, (afec) objS6, buxVarC, 0);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ3 = buxVarC.J();
        if (bxfVarJ3 != null) {
            bxfVarJ3.c = new gvo(cfyVar, z, eqjVar, i, 4, null);
        }
    }
}
