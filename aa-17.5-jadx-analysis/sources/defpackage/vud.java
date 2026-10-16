package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Trace;
import android.util.ArrayMap;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class vud implements vqj {
    public boolean a = false;
    public Activity b;
    private final ackk c;

    public vud(ackk ackkVar, xxh xxhVar, Executor executor) {
        this.c = ackkVar;
        executor.execute(new unj(this, xxhVar, 11));
    }

    /* JADX WARN: Type inference failed for: r5v12, types: [ackk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v20, types: [ackk, java.lang.Object] */
    @Override // defpackage.vqj
    public final synchronized void b(Activity activity) {
        vuj vujVar;
        int i;
        ajgp ajgpVar;
        if (this.a) {
            vuh vuhVar = (vuh) this.c.a();
            vur vurVarA = vur.a(activity);
            xvy xvyVar = xvy.a;
            vul vulVar = new vul(vurVarA, xvyVar, xvyVar, xvyVar, xvyVar);
            if (vuhVar.d.c()) {
                ArrayMap arrayMap = vuhVar.c;
                synchronized (arrayMap) {
                    vujVar = (vuj) arrayMap.remove(vulVar.a);
                    if (arrayMap.isEmpty()) {
                        vuhVar.b.j();
                    }
                }
                if (vujVar == null) {
                    ((ynz) ((ynz) vlj.a.f()).ai((char) 9827)).y("Measurement not found: %s", new vpw(vulVar.a.a));
                    zgp zgpVar = zgl.a;
                } else {
                    vuo vuoVar = vuhVar.i;
                    vur vurVar = vulVar.a;
                    String strB = vurVar.b();
                    int i2 = 0;
                    if (Build.VERSION.SDK_INT >= 29 && Trace.isEnabled()) {
                        String.format("J<%s>", strB);
                        for (vus vusVar : ((vut) vuoVar.a.a()).c) {
                            int iAD = a.aD(vusVar.b);
                            if (iAD == 0) {
                                iAD = 1;
                            }
                            switch (iAD - 1) {
                                case 1:
                                    i = 0;
                                    break;
                                case 2:
                                    i = vujVar.g;
                                    break;
                                case 3:
                                    i = vujVar.i;
                                    break;
                                case 4:
                                    i = vujVar.j;
                                    break;
                                case 5:
                                    i = vujVar.k;
                                    break;
                                case 6:
                                    i = vujVar.l;
                                    break;
                                case 7:
                                    i = vujVar.n;
                                    break;
                                default:
                                    ((ynz) ((ynz) vlj.a.e()).ai(9829)).y("UNKNOWN COUNTER with %s as the name", vusVar.c);
                                    continue;
                            }
                            Trace.setCounter(vusVar.c.replace("%EVENT_NAME%", strB), i);
                        }
                    }
                    if (vujVar.i == 0) {
                        zgp zgpVar2 = zgl.a;
                    } else {
                        aezk aezkVar = vuoVar.a;
                        if (((vut) aezkVar.a()).d) {
                            TimeUnit timeUnit = TimeUnit.SECONDS;
                            Long l = 9000L;
                            l.getClass();
                            if (vujVar.n <= 9000 && vujVar.g != 0) {
                                vsg vsgVar = (vsg) vuoVar.b.a();
                                String strReplace = ((vut) aezkVar.a()).b.replace("%PACKAGE_NAME%", ((Context) vuoVar.d).getPackageName());
                                strReplace.getClass();
                                vsgVar.a(strReplace);
                            }
                        }
                        long jA = vujVar.c.a() - vujVar.d;
                        abnr abnrVar = (abnr) ajgl.a.n();
                        abnrVar.t();
                        ajgl ajglVar = (ajgl) abnrVar.b;
                        ajglVar.b |= 16;
                        ajglVar.g = ((int) jA) + 1;
                        int i3 = vujVar.g;
                        abnrVar.t();
                        ajgl ajglVar2 = (ajgl) abnrVar.b;
                        ajglVar2.b |= 1;
                        ajglVar2.c = i3;
                        int i4 = vujVar.i;
                        abnrVar.t();
                        ajgl ajglVar3 = (ajgl) abnrVar.b;
                        ajglVar3.b |= 2;
                        ajglVar3.d = i4;
                        int i5 = vujVar.j;
                        abnrVar.t();
                        ajgl ajglVar4 = (ajgl) abnrVar.b;
                        ajglVar4.b |= 4;
                        ajglVar4.e = i5;
                        int i6 = vujVar.l;
                        abnrVar.t();
                        ajgl ajglVar5 = (ajgl) abnrVar.b;
                        ajglVar5.b |= 32;
                        ajglVar5.h = i6;
                        int i7 = vujVar.n;
                        abnrVar.t();
                        ajgl ajglVar6 = (ajgl) abnrVar.b;
                        ajglVar6.b |= 64;
                        ajglVar6.i = i7;
                        int i8 = vujVar.k;
                        abnrVar.t();
                        ajgl ajglVar7 = (ajgl) abnrVar.b;
                        ajglVar7.b |= 8;
                        ajglVar7.f = i8;
                        if (vujVar.p && !vujVar.q) {
                            long j = vujVar.r / 1000000;
                            abnrVar.t();
                            ajgl ajglVar8 = (ajgl) abnrVar.b;
                            ajglVar8.b |= 4096;
                            ajglVar8.p = (int) j;
                        }
                        int i9 = vujVar.o;
                        if (i9 != Integer.MIN_VALUE) {
                            int[] iArr = vujVar.f;
                            int[] iArr2 = vuj.b;
                            abnp abnpVarN = ajgp.a.n();
                            int i10 = 0;
                            while (true) {
                                if (i10 >= 52) {
                                    if (iArr[51] > 0) {
                                        abnpVarN.aO(i9 + 1);
                                        abnpVarN.aP(0);
                                    }
                                    ajgpVar = (ajgp) abnpVarN.q();
                                } else if (iArr2[i10] > i9) {
                                    abnpVarN.aP(0);
                                    abnpVarN.aO(i9 + 1);
                                    ajgpVar = (ajgp) abnpVarN.q();
                                } else {
                                    int i11 = iArr[i10];
                                    if (i11 > 0 || (i10 > 0 && iArr[i10 - 1] > 0)) {
                                        abnpVarN.aP(i11);
                                        abnpVarN.aO(iArr2[i10]);
                                    }
                                    i10++;
                                }
                            }
                            abnrVar.t();
                            ajgl ajglVar9 = (ajgl) abnrVar.b;
                            ajgpVar.getClass();
                            ajglVar9.o = ajgpVar;
                            ajglVar9.b |= 2048;
                            int i12 = vujVar.h;
                            abnrVar.t();
                            ajgl ajglVar10 = (ajgl) abnrVar.b;
                            ajglVar10.b |= sk.AUDIO_CONTENT_BUFFER_SIZE;
                            ajglVar10.m = i12;
                            int i13 = vujVar.m;
                            abnrVar.t();
                            ajgl ajglVar11 = (ajgl) abnrVar.b;
                            ajglVar11.b |= 1024;
                            ajglVar11.n = i13;
                        }
                        while (i2 < 29) {
                            int i14 = i2 + 1;
                            int[] iArr3 = vujVar.e;
                            if (iArr3[i2] > 0) {
                                abnp abnpVarN2 = ajgk.a.n();
                                int i15 = iArr3[i2];
                                abnpVarN2.t();
                                ajgk ajgkVar = (ajgk) abnpVarN2.b;
                                ajgkVar.b |= 1;
                                ajgkVar.c = i15;
                                int[] iArr4 = vuj.a;
                                int i16 = iArr4[i2];
                                abnpVarN2.t();
                                ajgk ajgkVar2 = (ajgk) abnpVarN2.b;
                                ajgkVar2.b |= 2;
                                ajgkVar2.d = i16;
                                if (i14 < 29) {
                                    int i17 = iArr4[i14] - 1;
                                    abnpVarN2.t();
                                    ajgk ajgkVar3 = (ajgk) abnpVarN2.b;
                                    ajgkVar3.b |= 4;
                                    ajgkVar3.e = i17;
                                }
                                abnrVar.t();
                                ajgl ajglVar12 = (ajgl) abnrVar.b;
                                ajgk ajgkVar4 = (ajgk) abnpVarN2.q();
                                ajgkVar4.getClass();
                                aboh abohVar = ajglVar12.k;
                                if (!abohVar.c()) {
                                    ajglVar12.k = abnv.I(abohVar);
                                }
                                ajglVar12.k.add(ajgkVar4);
                            }
                            i2 = i14;
                        }
                        abnr abnrVar2 = (abnr) ((ajgl) abnrVar.q()).K();
                        xxh xxhVarL = vuf.l(vuhVar.a);
                        if (xxhVarL.f()) {
                            int iIntValue = ((Float) xxhVarL.b()).intValue();
                            abnrVar2.t();
                            ajgl ajglVar13 = (ajgl) abnrVar2.b;
                            ajglVar13.b |= 256;
                            ajglVar13.l = iIntValue;
                        }
                        vry vryVar = vuhVar.d;
                        ajgl ajglVar14 = (ajgl) abnrVar2.q();
                        vrt vrtVarA = vru.a();
                        abnp abnpVarN3 = ajgu.a.n();
                        abnpVarN3.t();
                        ajgu ajguVar = (ajgu) abnpVarN3.b;
                        ajglVar14.getClass();
                        ajguVar.l = ajglVar14;
                        ajguVar.b |= sk.AUDIO_CONTENT_BUFFER_SIZE;
                        vrtVarA.g((ajgu) abnpVarN3.q());
                        vrtVarA.b = null;
                        vrtVarA.c = "Activity";
                        vrtVarA.a = vurVar.b();
                        vrtVarA.d(true);
                        vryVar.a(vrtVarA.a());
                    }
                }
            } else {
                zgp zgpVar3 = zgl.a;
            }
        } else if (!activity.equals(this.b)) {
            ((ynz) ((ynz) vlj.a.e()).ai(9824)).M("Activity mismatch (currentActivity=%s, activity=%s)", this.b, activity);
        }
        this.b = null;
    }

    @Override // defpackage.vqj
    public final synchronized void c(Activity activity) {
        if (!this.a) {
            this.b = activity;
            return;
        }
        vuh vuhVar = (vuh) this.c.a();
        vur vurVarA = vur.a(activity);
        if (vuhVar.d.b(vurVarA.b())) {
            ArrayMap arrayMap = vuhVar.c;
            synchronized (arrayMap) {
                if (arrayMap.size() >= 25) {
                    ((ynz) ((ynz) vlj.a.h()).ai(9826)).y("Too many concurrent measurements, ignoring %s", vurVarA);
                    return;
                }
                vuj vujVarA = ((vuk) vuhVar.e).a();
                vuj vujVar = (vuj) arrayMap.put(vurVarA, vujVarA);
                if (vujVar != null) {
                    arrayMap.put(vurVarA, vujVar);
                    ((ynz) ((ynz) vlj.a.h()).ai(9825)).y("measurement already started: %s", vurVarA);
                    return;
                }
                xxh xxhVar = vuhVar.j;
                if (xxhVar.f() && ((vuv) xxhVar.b()).a()) {
                    vujVarA.p = true;
                }
                if (arrayMap.size() == 1) {
                    vuhVar.b.g();
                }
                vuo vuoVar = vuhVar.i;
                String strB = vurVarA.b();
                if (Build.VERSION.SDK_INT >= 29 && Trace.isEnabled()) {
                    String.format("J<%s>", strB);
                }
            }
        }
    }

    @Override // defpackage.vqj
    public final /* synthetic */ void h() {
    }

    @Override // defpackage.vqj
    public final /* synthetic */ void i() {
    }

    @Override // defpackage.vqj
    public final /* synthetic */ void a(Activity activity) {
    }

    @Override // defpackage.vqj
    public final /* synthetic */ void d(Activity activity) {
    }

    @Override // defpackage.vqj
    public final /* synthetic */ void e(Activity activity) {
    }

    @Override // defpackage.vqj
    public final /* synthetic */ void f(int i) {
    }
}
