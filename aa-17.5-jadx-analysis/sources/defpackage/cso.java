package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.google.android.libraries.handwriting.networkrecognizer.CloudRecognizerProtocolStrings;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.List;

/* loaded from: classes.dex */
public final class cso extends ebx implements Runnable, View.OnAttachStateChangeListener, eaj {
    public final aan a;
    public final SnapshotStateList b;
    public final byd c;
    public final aag d;
    private boolean g;
    private int h;
    private ecy i;

    public cso() {
        super(1);
        aan aanVar = new aan(9);
        int i = cvj.a;
        aanVar.m(cvi.a, new cvm("caption bar"));
        aanVar.m(cvi.b, new cvm("display cutout"));
        aanVar.m(cvi.c, new cvm(CloudRecognizerProtocolStrings.IME));
        aanVar.m(cvi.d, new cvm("mandatory system gestures"));
        aanVar.m(cvi.e, new cvm("navigation bars"));
        aanVar.m(cvi.f, new cvm("status bars"));
        aanVar.m(cvi.g, new cvm("system gestures"));
        aanVar.m(cvi.h, new cvm("tappable element"));
        aanVar.m(cvi.i, new cvm("waterfall"));
        this.a = aanVar;
        this.c = new ParcelableSnapshotMutableIntState(0);
        this.d = new aag(4);
        this.b = new SnapshotStateList();
    }

    private final void f(ecy ecyVar) {
        char c;
        char c2;
        char c3;
        long j;
        boolean z;
        boolean z2;
        boolean z3;
        long j2;
        long[] jArr;
        int[] iArr;
        Object[] objArr;
        int i;
        long[] jArr2;
        int[] iArr2;
        Object[] objArr2;
        long j3;
        char c4;
        zh zhVar = cvl.a;
        int[] iArr3 = zhVar.b;
        Object[] objArr3 = zhVar.c;
        long[] jArr3 = zhVar.a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i2 = 0;
            z2 = false;
            z3 = false;
            c = 16;
            c2 = ' ';
            while (true) {
                long j4 = jArr3[i2];
                c3 = '0';
                j = 0;
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = i2 - length;
                    int i4 = 0;
                    while (true) {
                        z = true;
                        i = 8 - ((~i3) >>> 31);
                        if (i4 >= i) {
                            break;
                        }
                        if ((j4 & 255) < 128) {
                            int i5 = (i2 << 3) + i4;
                            int i6 = iArr3[i5];
                            cvj cvjVar = (cvj) objArr3[i5];
                            jArr2 = jArr3;
                            iArr2 = iArr3;
                            long j5 = r12.b << 48;
                            long j6 = r12.c << 32;
                            long j7 = r12.d << 16;
                            int i7 = ecyVar.f(i6).e;
                            Object objA = this.a.a(cvjVar);
                            objA.getClass();
                            cvm cvmVar = (cvm) objA;
                            objArr2 = objArr3;
                            long j8 = j5 | j6 | j7 | i7;
                            if (j8 != cvmVar.c) {
                                cvmVar.c = j8;
                                if (j8 == 0) {
                                    z2 = true;
                                } else {
                                    z2 = true;
                                    z3 = true;
                                }
                            }
                            if (i6 != 8) {
                                dve dveVarG = ecyVar.g(i6);
                                j3 = j4;
                                long j9 = (dveVarG.b << 48) | (dveVarG.c << 32) | (dveVarG.d << 16) | dveVarG.e;
                                if (cvmVar.d != j9) {
                                    cvmVar.d = j9;
                                    z2 = true;
                                    if (j9 != 0) {
                                        z3 = true;
                                    }
                                }
                            } else {
                                j3 = j4;
                            }
                            cvmVar.e(ecyVar.z(i6));
                            c4 = '\b';
                        } else {
                            jArr2 = jArr3;
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            j3 = j4;
                            c4 = '\b';
                        }
                        j4 = j3 >> c4;
                        i4++;
                        jArr3 = jArr2;
                        iArr3 = iArr2;
                        objArr3 = objArr2;
                    }
                    jArr = jArr3;
                    iArr = iArr3;
                    objArr = objArr3;
                    if (i == 8) {
                        break;
                        break;
                    }
                    break;
                }
                jArr = jArr3;
                iArr = iArr3;
                objArr = objArr3;
                z = true;
                if (i2 == length) {
                    break;
                }
                i2++;
                jArr3 = jArr;
                iArr3 = iArr;
                objArr3 = objArr;
            }
        } else {
            c = 16;
            c2 = ' ';
            c3 = '0';
            j = 0;
            z = true;
            z2 = false;
            z3 = false;
        }
        dzz dzzVarK = ecyVar.k();
        if (dzzVarK == null) {
            j2 = j;
        } else {
            dve dveVarA = dzzVarK.a();
            j2 = (dveVarA.b << c3) | (dveVarA.c << c2) | (dveVarA.d << c) | dveVarA.e;
        }
        aan aanVar = this.a;
        int i8 = cvj.a;
        Object objA2 = aanVar.a(cvi.i);
        objA2.getClass();
        cvm cvmVar2 = (cvm) objA2;
        cvmVar2.e(!(j2 == j ? z : false));
        if (cvmVar2.c != j2) {
            cvmVar2.c = j2;
            cvmVar2.d = j2;
            if (j2 == j) {
                z2 = z;
            } else {
                z2 = z;
                z3 = z2;
            }
        }
        if (dzzVarK == null) {
            aag aagVar = this.d;
            if (aagVar.b > 0) {
                aagVar.k();
                this.b.clear();
                z2 = z;
            }
        } else {
            List boundingRects = dzzVarK.a.getBoundingRects();
            int size = boundingRects.size();
            aag aagVar2 = this.d;
            if (size < aagVar2.b) {
                aagVar2.l(boundingRects.size(), aagVar2.b);
                SnapshotStateList snapshotStateList = this.b;
                snapshotStateList.f(boundingRects.size(), snapshotStateList.a());
                z2 = z;
            } else {
                int size2 = boundingRects.size() - aagVar2.b;
                int i9 = 0;
                while (i9 < size2) {
                    aagVar2.p(new ParcelableSnapshotMutableState(boundingRects.get(aagVar2.b), bxp.c));
                    this.b.add(new cur("display cutout rect " + aagVar2.b, 0));
                    i9++;
                    z2 = z;
                }
            }
            int size3 = boundingRects.size();
            for (int i10 = 0; i10 < size3; i10++) {
                Rect rect = (Rect) boundingRects.get(i10);
                bwq bwqVar = (bwq) aagVar2.c(i10);
                if (!affa.f(bwqVar.a(), rect)) {
                    bwqVar.b(rect);
                    z2 = z;
                }
            }
            if (!boundingRects.isEmpty()) {
                z3 = z;
            }
        }
        if ((z3 || this.c.e() != 0) && z2) {
            byd bydVar = this.c;
            bydVar.h(bydVar.e() + 1);
            byx.m();
        }
    }

    private static final void g(cvm cvmVar, lds ldsVar) {
        cvmVar.d(ldsVar.S());
        cvmVar.a(ldsVar.R());
        cvmVar.c(ldsVar.U());
    }

    @Override // defpackage.eaj
    public final ecy a(View view, ecy ecyVar) {
        if (this.g) {
            this.i = ecyVar;
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
                return ecyVar;
            }
        } else if (this.h == 0) {
            f(ecyVar);
        }
        return ecyVar;
    }

    @Override // defpackage.ebx
    public final ecy b(ecy ecyVar, List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            lds ldsVar = (lds) list.get(i);
            cvj cvjVar = (cvj) cvl.a.a(ldsVar.T());
            if (cvjVar != null) {
                Object objA = this.a.a(cvjVar);
                objA.getClass();
                cvm cvmVar = (cvm) objA;
                if (cvmVar.f()) {
                    g(cvmVar, ldsVar);
                }
            }
        }
        f(ecyVar);
        return ecyVar;
    }

    @Override // defpackage.ebx
    public final ebw c(lds ldsVar, ebw ebwVar) {
        ecy ecyVar = this.i;
        this.g = false;
        this.i = null;
        if (ldsVar.U() > 0 && ecyVar != null) {
            int iT = ldsVar.T();
            this.h |= iT;
            cvj cvjVar = (cvj) cvl.a.a(iT);
            if (cvjVar != null) {
                Object objA = this.a.a(cvjVar);
                objA.getClass();
                cvm cvmVar = (cvm) objA;
                dve dveVarF = ecyVar.f(iT);
                int i = dveVarF.b;
                int i2 = dveVarF.c;
                int i3 = dveVarF.d;
                int i4 = dveVarF.e;
                long j = cvmVar.c;
                long j2 = i4;
                long j3 = j2 | (i3 << 16) | (i << 48) | (i2 << 32);
                if (j3 != j) {
                    cvmVar.e = j;
                    cvmVar.f = j3;
                    cvmVar.b(true);
                    g(cvmVar, ldsVar);
                    byd bydVar = this.c;
                    bydVar.h(bydVar.e() + 1);
                    byx.m();
                }
            }
        }
        return ebwVar;
    }

    @Override // defpackage.ebx
    public final void d(lds ldsVar) {
        this.g = false;
        int iT = ldsVar.T();
        this.h = (~iT) & this.h;
        this.i = null;
        cvj cvjVar = (cvj) cvl.a.a(iT);
        if (cvjVar != null) {
            Object objA = this.a.a(cvjVar);
            objA.getClass();
            cvm cvmVar = (cvm) objA;
            cvmVar.d(BitmapDescriptorFactory.HUE_RED);
            cvmVar.a(1.0f);
            cvmVar.c(0L);
            cvmVar.d(BitmapDescriptorFactory.HUE_RED);
            cvmVar.b(false);
            cvmVar.e = -1L;
            cvmVar.f = -1L;
            byd bydVar = this.c;
            bydVar.h(bydVar.e() + 1);
            byx.m();
        }
    }

    @Override // defpackage.ebx
    public final void e(lds ldsVar) {
        this.g = true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        int[] iArr = ebm.a;
        ebe.e(view, this);
        lds.V(view, this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        int[] iArr = ebm.a;
        ebe.e(view, null);
        lds.V(view, null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.g) {
            this.h = 0;
            this.g = false;
            ecy ecyVar = this.i;
            if (ecyVar != null) {
                f(ecyVar);
                this.i = null;
            }
        }
    }
}
