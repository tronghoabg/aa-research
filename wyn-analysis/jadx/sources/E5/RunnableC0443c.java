package E5;

import A.AbstractC0213f;
import A7.AbstractC0279p0;
import A7.C0295v;
import N1.C0754c;
import U1.C0833c;
import U1.C0850u;
import U1.C0855z;
import Va.X7;
import a1.AbstractC1312b;
import android.util.SparseArray;
import android.view.View;
import ba.C1521a;
import com.applovin.impl.sdk.i;
import com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import p7.AbstractC3772b;
import r9.C3955l;
import uc.C4281r;
import uc.InterfaceC4269f;

/* renamed from: E5.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class RunnableC0443c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3297a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3298b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3299c;

    public /* synthetic */ RunnableC0443c(C0855z c0855z, int i5, boolean z2) {
        this.f3297a = 2;
        this.f3299c = c0855z;
        this.f3298b = i5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = null;
        int i5 = this.f3298b;
        Object obj2 = this.f3299c;
        switch (this.f3297a) {
            case 0:
                C0447e c0447e = (C0447e) ((C0445d) obj2).f3302c;
                c0447e.getClass();
                if (i5 != -3 && i5 != -2) {
                    if (i5 == -1) {
                        F f10 = c0447e.f3312c;
                        if (f10 != null) {
                            I i10 = f10.f3030a;
                            boolean zS0 = i10.s0();
                            i10.N0(-1, zS0 ? 2 : 1, zS0);
                        }
                        c0447e.a();
                        break;
                    } else if (i5 == 1) {
                        c0447e.b(1);
                        F f11 = c0447e.f3312c;
                        if (f11 != null) {
                            I i11 = f11.f3030a;
                            i11.N0(1, 1, i11.s0());
                            break;
                        }
                    } else {
                        AbstractC0279p0.u(i5, "Unknown focus change type: ", "AudioFocusManager");
                        break;
                    }
                } else if (i5 == -2) {
                    F f12 = c0447e.f3312c;
                    if (f12 != null) {
                        I i12 = f12.f3030a;
                        boolean zS02 = i12.s0();
                        i12.N0(0, zS02 ? 2 : 1, zS02);
                    }
                    c0447e.b(2);
                    break;
                } else {
                    c0447e.b(3);
                    break;
                }
                break;
            case 1:
                C0833c c0833c = (C0833c) ((C0445d) obj2).f3302c;
                c0833c.getClass();
                if (i5 != -3 && i5 != -2) {
                    if (i5 == -1) {
                        U1.r rVar = c0833c.f12024c;
                        if (rVar != null) {
                            C0850u c0850u = rVar.f12116a;
                            c0850u.P0(-1, 2, c0850u.s0());
                        }
                        c0833c.a();
                        c0833c.c(1);
                        break;
                    } else if (i5 == 1) {
                        c0833c.c(2);
                        U1.r rVar2 = c0833c.f12024c;
                        if (rVar2 != null) {
                            C0850u c0850u2 = rVar2.f12116a;
                            c0850u2.P0(1, 1, c0850u2.s0());
                            break;
                        }
                    } else {
                        N0.a.o(i5, "Unknown focus change type: ", "AudioFocusManager");
                        break;
                    }
                } else {
                    if (i5 != -2) {
                        C0754c c0754c = c0833c.f12025d;
                        if (!(c0754c != null && c0754c.f8140a == 1)) {
                            c0833c.c(4);
                            break;
                        }
                    }
                    U1.r rVar3 = c0833c.f12024c;
                    if (rVar3 != null) {
                        C0850u c0850u3 = rVar3.f12116a;
                        c0850u3.P0(0, 1, c0850u3.s0());
                    }
                    c0833c.c(3);
                    break;
                }
                break;
            case 2:
                C0855z c0855z = (C0855z) obj2;
                c0855z.f12210a[i5].f();
                V1.d dVar = c0855z.f12232x;
                dVar.L(dVar.K(), 1033, new V1.b(i));
                break;
            case 3:
                ((AbstractC1312b) obj2).j(i5);
                break;
            case 4:
                ((com.applovin.impl.adview.a) obj2).a(i5);
                break;
            case 5:
                ((i.a) obj2).a(i5);
                break;
            case 6:
                ((MaxAdPlacer) obj2).a(i5);
                break;
            case 7:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj2;
                View view = (View) sideSheetBehavior.f27001o.get();
                if (view != null) {
                    sideSheetBehavior.t(view, i5, false);
                    break;
                }
                break;
            case 8:
                int i13 = i5 & 4;
                N2.j jVar = ((io.flutter.plugin.platform.d) obj2).f37094b;
                if (i13 != 0) {
                    C1521a c1521a = (C1521a) jVar.f8381d;
                    c1521a.getClass();
                    ((C4281r) c1521a.f19414b).a("SystemChrome.systemUIChange", Arrays.asList(Boolean.FALSE), null);
                    break;
                } else {
                    C1521a c1521a2 = (C1521a) jVar.f8381d;
                    c1521a2.getClass();
                    ((C4281r) c1521a2.f19414b).a("SystemChrome.systemUIChange", Arrays.asList(Boolean.TRUE), null);
                    break;
                }
            case 9:
                C3955l c3955l = (C3955l) obj2;
                SparseArray sparseArray = c3955l.k;
                r9.S s10 = (r9.S) sparseArray.get(i5);
                A6.c.z(s10 != null, "Tried to release nonexistent target: %s", Integer.valueOf(i5));
                Iterator it = c3955l.f44638h.C(i5).iterator();
                while (true) {
                    C0295v c0295v = (C0295v) it;
                    boolean zHasNext = ((Iterator) c0295v.f1081b).hasNext();
                    AbstractC3772b abstractC3772b = c3955l.f44631a;
                    if (!zHasNext) {
                        abstractC3772b.D().l(s10);
                        sparseArray.remove(i5);
                        c3955l.f44641l.remove(s10.f44596a);
                        break;
                    } else {
                        abstractC3772b.D().g((s9.h) c0295v.next());
                    }
                }
            default:
                md.J j8 = (md.J) obj2;
                int iF = AbstractC0213f.f(i5);
                yc.t tVar = yc.t.PORTRAIT_UP;
                if (iF != 0) {
                    if (iF == 1) {
                        tVar = yc.t.PORTRAIT_DOWN;
                    } else if (iF == 2) {
                        tVar = yc.t.LANDSCAPE_LEFT;
                    } else if (iF == 3) {
                        tVar = yc.t.LANDSCAPE_RIGHT;
                    }
                }
                new X7((InterfaceC4269f) ((com.google.android.gms.ads.nativead.l) j8.f40581b).f26356b, yc.p.f48158d, obj, "dev.flutter.pigeon.camera_android.CameraGlobalEventApi.deviceOrientationChanged").m(new ArrayList(Collections.singletonList(tVar)), new m9.B(new a2.k()));
                break;
        }
    }

    public /* synthetic */ RunnableC0443c(Object obj, int i5, int i10) {
        this.f3297a = i10;
        this.f3299c = obj;
        this.f3298b = i5;
    }
}
