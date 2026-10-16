package defpackage;

import android.app.Notification;
import android.app.Person;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;

/* loaded from: classes2.dex */
public final class dtk {
    static Notification.MessagingStyle.Message a(CharSequence charSequence, long j, Person person) {
        return new Notification.MessagingStyle.Message(charSequence, j, person);
    }

    static void b(Notification.MessagingStyle.Message message, Bundle bundle) {
        message.getExtras().putAll(bundle);
    }

    public static int c(Object obj) {
        return ((Icon) obj).getResId();
    }

    public static int d(Object obj) {
        return ((Icon) obj).getType();
    }

    public static Uri e(Object obj) {
        return ((Icon) obj).getUri();
    }

    public static String f(Object obj) {
        return ((Icon) obj).getResPackage();
    }

    public static boolean g(byte[] bArr, byte[] bArr2) {
        if (bArr2 == null || bArr.length < bArr2.length) {
            return false;
        }
        for (int i = 0; i < bArr2.length; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static long[] h(Object obj) {
        if (!(obj instanceof int[])) {
            if (obj instanceof long[]) {
                return (long[]) obj;
            }
            return null;
        }
        int[] iArr = (int[]) obj;
        long[] jArr = new long[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            jArr[i] = iArr[i];
        }
        return jArr;
    }

    public static final void i(final Class cls, cfy cfyVar, final vo voVar, final Bundle bundle, final eps epsVar, afec afecVar, bux buxVar, int i) {
        int i2;
        eps epsVar2;
        bc bcVar;
        bt btVarA;
        int i3;
        int i4;
        boolean z;
        final bt btVar;
        Object obj;
        int i5;
        bvv bvvVar;
        final enz enzVar;
        int i6;
        int i7 = i & 6;
        bux buxVarC = buxVar.c(1148251591);
        if (i7 == 0) {
            i2 = (true != buxVarC.E(cls) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.C(voVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != buxVarC.E(bundle) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != buxVarC.A(epsVar == null ? -1 : epsVar.ordinal()) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != buxVarC.E(afecVar) ? 65536 : 131072;
        }
        if (buxVarC.I((74899 & i2) != 74898, i2 & 1)) {
            bvv bvvVar2 = (bvv) buxVarC;
            bvvVar2.ab(-127, null, 0, null);
            if ((i & 1) != 0 && !buxVarC.F()) {
                buxVarC.s();
            }
            buxVarC.l();
            final bym bymVarC = byx.c(afecVar, buxVarC);
            final int iA = buxVarC.a();
            View view = (View) buxVarC.f(daa.f);
            boolean zC = buxVarC.C(view);
            Object objS = bvvVar2.S();
            if (zC || objS == buw.a) {
                Fragment fragmentG = bt.g(view);
                if (fragmentG == null) {
                    Context context = view.getContext();
                    while (true) {
                        if (!(context instanceof ContextWrapper)) {
                            bcVar = null;
                            break;
                        } else {
                            if (context instanceof bc) {
                                bcVar = (bc) context;
                                break;
                            }
                            context = ((ContextWrapper) context).getBaseContext();
                        }
                    }
                    if (bcVar == null) {
                        throw new IllegalStateException(a.bm(view, "View ", " is not within a subclass of FragmentActivity."));
                    }
                    btVarA = bcVar.a();
                } else {
                    if (!fragmentG.isAdded()) {
                        throw new IllegalStateException(a.bw(view, fragmentG, "The Fragment ", " that owns View ", " has already been destroyed. Nested fragments should always use the child FragmentManager."));
                    }
                    btVarA = fragmentG.getChildFragmentManager();
                }
                objS = btVarA;
                bvvVar2.ad(objS);
            }
            bt btVar2 = (bt) objS;
            final Context context2 = (Context) buxVarC.f(daa.b);
            Object objS2 = bvvVar2.S();
            Object obj2 = buw.a;
            if (objS2 == obj2) {
                objS2 = new enz(iA);
                bvvVar2.ad(objS2);
            }
            enz enzVar2 = (enz) objS2;
            dmj.b(enzVar2, cfyVar, null, buxVarC, i2 & 112, 4);
            Object[] objArr = {btVar2, enzVar2, cls, voVar};
            boolean zE = buxVarC.E(btVar2) | buxVarC.E(enzVar2) | buxVarC.E(context2) | buxVarC.E(cls) | ((((i2 & 896) ^ 384) > 256 && buxVarC.C(voVar)) || (i2 & 384) == 256) | buxVarC.E(bundle) | buxVarC.A(iA);
            int i8 = (57344 & i2) ^ 24576;
            if (i8 <= 16384 || !buxVarC.A(epsVar.ordinal())) {
                int i9 = i2 & 24576;
                i3 = i2;
                i4 = 16384;
                z = i9 == 16384;
            } else {
                i3 = i2;
                z = true;
                i4 = 16384;
            }
            boolean zC2 = zE | z | buxVarC.C(bymVarC);
            Object objS3 = bvvVar2.S();
            if (zC2 || objS3 == obj2) {
                btVar = btVar2;
                obj = obj2;
                i5 = i4;
                bvvVar = bvvVar2;
                enzVar = enzVar2;
                i6 = i3;
                afec afecVar2 = new afec() { // from class: enw
                    /* JADX WARN: Type inference failed for: r7v2, types: [bwq, java.lang.Object] */
                    @Override // defpackage.afec
                    public final Object invoke(Object obj3) {
                        affq affqVar = new affq();
                        enz enzVar3 = enzVar;
                        int id = enzVar3.a().getId();
                        bt btVar3 = btVar;
                        Fragment fragmentE = btVar3.e(id);
                        vo voVar2 = voVar;
                        if (fragmentE == null) {
                            eps epsVar3 = epsVar;
                            int i10 = iA;
                            Bundle bundle2 = bundle;
                            Class cls2 = cls;
                            Fragment fragmentA = btVar3.i().a(context2.getClassLoader(), cls2.getName());
                            fragmentA.setInitialSavedState((Fragment.SavedState) voVar2.a.a());
                            fragmentA.setArguments(bundle2);
                            w wVar = new w(btVar3);
                            wVar.s();
                            wVar.t(enzVar3.a(), fragmentA, String.valueOf(i10));
                            if (epsVar3.a(eps.c)) {
                                wVar.h(fragmentA, epsVar3);
                            }
                            if (btVar3.af()) {
                                affqVar.a = true;
                                fragmentA.getLifecycle().c(new epu(affqVar, fragmentA, 1));
                                wVar.d();
                            } else {
                                wVar.c();
                            }
                            fragmentE = fragmentA;
                        }
                        bym bymVar = bymVarC;
                        btVar3.O(enzVar3.a());
                        afec afecVar3 = (afec) bymVar.a();
                        fragmentE.getClass();
                        afecVar3.invoke(fragmentE);
                        return new enx(btVar3, fragmentE, voVar2, affqVar);
                    }
                };
                bvvVar.ad(afecVar2);
                objS3 = afecVar2;
            } else {
                i5 = i4;
                btVar = btVar2;
                obj = obj2;
                enzVar = enzVar2;
                bvvVar = bvvVar2;
                i6 = i3;
            }
            bvq.d(objArr, (afec) objS3, buxVarC);
            boolean zE2 = buxVarC.E(btVar) | buxVarC.E(enzVar) | ((i8 > i5 && buxVarC.A(epsVar.ordinal())) || (i6 & 24576) == i5);
            Object objS4 = bvvVar.S();
            if (zE2 || objS4 == obj) {
                cib cibVar = new cib((Object) btVar, (Object) enzVar, (Object) epsVar, 3, (byte[]) null);
                epsVar2 = epsVar;
                bvvVar.ad(cibVar);
                objS4 = cibVar;
            } else {
                epsVar2 = epsVar;
            }
            bvq.c(epsVar2, (afec) objS4, buxVarC);
        } else {
            epsVar2 = epsVar;
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new bpj(cls, cfyVar, voVar, bundle, epsVar2, afecVar, i, 2);
        }
    }
}
