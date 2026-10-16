package defpackage;

import android.graphics.Rect;
import android.view.Surface;
import android.view.SurfaceControl;
import android.view.SurfaceControlViewHost;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.apps.auto.carservice.car.window.composition.ProjectionRootActivity;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class jiz implements aiyl {
    final /* synthetic */ ProjectionRootActivity a;

    public jiz(ProjectionRootActivity projectionRootActivity) {
        this.a = projectionRootActivity;
    }

    @Override // defpackage.aiyl
    public final /* bridge */ /* synthetic */ Object a(Object obj, afck afckVar) throws IOException {
        FrameLayout frameLayout;
        yph yphVar;
        Throwable th;
        SurfaceControl surfaceControl;
        jjg jjgVar = (jjg) obj;
        jjgVar.getClass();
        ProjectionRootActivity projectionRootActivity = this.a;
        if (!projectionRootActivity.isFinishing()) {
            FrameLayout frameLayoutA = projectionRootActivity.a();
            int i = jjgVar.c;
            frameLayoutA.setBackgroundColor(i);
            projectionRootActivity.b(jjgVar.d);
            yph yphVar2 = ProjectionRootActivity.a;
            yop yopVarL = yphVar2.l();
            Map map = projectionRootActivity.e;
            yopVarL.M("Received state: %s, current views: %s", jjgVar, map.keySet());
            if (jjgVar.b) {
                ((ype) yphVar2.f()).u("Finishing activity due to shouldFinish signal");
                projectionRootActivity.finish();
            } else {
                List<jjl> list = jjgVar.a;
                ArrayList arrayList = new ArrayList(woy.bp(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf(((jjl) it.next()).a));
                }
                Set setCl = woy.cl(arrayList);
                Set setKeySet = map.keySet();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : setKeySet) {
                    if (!setCl.contains(Integer.valueOf(((Number) obj2).intValue()))) {
                        arrayList2.add(obj2);
                    }
                }
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    int iIntValue = ((Number) it2.next()).intValue();
                    jja jjaVar = (jja) map.remove(Integer.valueOf(iIntValue));
                    if (jjaVar != null) {
                        ((ype) yphVar2.f()).w("Removing orphaned view for window %d", iIntValue);
                        projectionRootActivity.a().removeView(jjaVar);
                    }
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                for (jjl jjlVar : list) {
                    int i2 = jjlVar.a;
                    Integer numValueOf = Integer.valueOf(i2);
                    if (!linkedHashSet.add(numValueOf)) {
                        throw new IllegalStateException(a.bp(i2, "Duplicate window ID detected: "));
                    }
                    jja jjaVar2 = (jja) map.get(numValueOf);
                    if (jjaVar2 == null) {
                        jjf jjfVar = projectionRootActivity.b;
                        if (jjfVar == null) {
                            throw new IllegalStateException("RelayHostCallback cannot be null when views are created");
                        }
                        jja jjaVar3 = new jja(projectionRootActivity, i2, jjfVar);
                        map.put(numValueOf, jjaVar3);
                        ((ype) yphVar2.f()).w("Adding window view for window %d", i2);
                        projectionRootActivity.a().addView(jjaVar3);
                        jjaVar2 = jjaVar3;
                    }
                    jjlVar.getClass();
                    ViewGroup.LayoutParams layoutParams = jjaVar2.getLayoutParams();
                    FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
                    if (layoutParams2 == null) {
                        layoutParams2 = new FrameLayout.LayoutParams(0, 0);
                    }
                    Rect rect = jjlVar.c;
                    if (layoutParams2.width != rect.width() || layoutParams2.height != rect.height() || layoutParams2.leftMargin != rect.left || layoutParams2.topMargin != rect.top) {
                        layoutParams2.width = rect.width();
                        layoutParams2.height = rect.height();
                        layoutParams2.leftMargin = rect.left;
                        layoutParams2.topMargin = rect.top;
                        jjaVar2.setLayoutParams(layoutParams2);
                    }
                    float f = jjlVar.d;
                    if (jjaVar2.getZ() != f) {
                        jjaVar2.setZ(f);
                    }
                    float alpha = jjaVar2.getAlpha();
                    float f2 = jjlVar.e;
                    if (alpha != f2) {
                        jjaVar2.setAlpha(f2);
                    }
                }
                int i3 = 0;
                for (jjl jjlVar2 : list) {
                    int i4 = i3 + 1;
                    int i5 = jjlVar2.a;
                    jja jjaVar4 = (jja) map.get(Integer.valueOf(i5));
                    if (jjaVar4 != null) {
                        jjlVar2.getClass();
                        if (jjaVar4.getCompositionOrder() != i3) {
                            jjaVar4.setCompositionOrder(i3);
                        }
                        SurfaceControlViewHost.SurfacePackage surfacePackage = jjaVar4.e;
                        SurfaceControlViewHost.SurfacePackage surfacePackage2 = jjlVar2.i;
                        if (surfacePackage != surfacePackage2) {
                            if (surfacePackage2 != null) {
                                jjaVar4.setChildSurfacePackage(surfacePackage2);
                            }
                            SurfaceControlViewHost.SurfacePackage surfacePackage3 = jjaVar4.e;
                            if (surfacePackage3 != null) {
                                surfacePackage3.release();
                            }
                            jjaVar4.e = surfacePackage2;
                        }
                        Rect rect2 = jjlVar2.c;
                        Rect rect3 = jjlVar2.f;
                        yphVar = yphVar2;
                        Rect rect4 = new Rect(rect3.left - rect2.left, rect3.top - rect2.top, rect3.right - rect2.left, rect3.bottom - rect2.top);
                        SurfaceControl.Transaction transaction = new SurfaceControl.Transaction();
                        try {
                            SurfaceControl surfaceControl2 = jjaVar4.getSurfaceControl();
                            if (surfaceControl2 != null) {
                                if (true != surfaceControl2.isValid()) {
                                    surfaceControl2 = null;
                                }
                                if (surfaceControl2 != null) {
                                    transaction.setCrop(surfaceControl2, rect4);
                                }
                            }
                            if (surfacePackage2 != null && (surfaceControl = surfacePackage2.getSurfaceControl()) != null) {
                                if (surfaceControl.isValid()) {
                                    transaction.setCrop(surfaceControl, rect4).getClass();
                                } else {
                                    ((ype) jja.a.h()).w("Failed to apply config, SurfaceControl invalid for window id=%d", i5);
                                }
                            }
                            jjk jjkVar = jjaVar4.d;
                            float f3 = jjlVar2.h;
                            if (f3 > BitmapDescriptorFactory.HUE_RED) {
                                if (jjkVar == null) {
                                    jjk jjkVar2 = new jjk(jjaVar4, jjaVar4.b, rect4, f3, i);
                                    jjkVar2.b(transaction);
                                    jjkVar2.e(transaction);
                                    jjaVar4.d = jjkVar2;
                                } else {
                                    Rect rect5 = jjkVar.c;
                                    boolean z = (affa.f(rect5, rect4) && jjkVar.d == f3 && jjkVar.e == i) ? false : true;
                                    List list2 = jjkVar.f;
                                    if (z || list2 == null) {
                                        float f4 = jjkVar.d;
                                        rect5.set(rect4);
                                        jjkVar.d = f3;
                                        jjkVar.e = i;
                                        Surface surface = jjkVar.b.getHolder().getSurface();
                                        if (surface != null && surface.isValid()) {
                                            transaction = new SurfaceControl.Transaction();
                                            if (f4 != f3) {
                                                try {
                                                    int iMax = Math.max(1, afgi.k(jjkVar.d));
                                                    List list3 = jjkVar.f;
                                                    if (list3 != null) {
                                                        Iterator it3 = list3.iterator();
                                                        while (it3.hasNext()) {
                                                            transaction.setBufferSize(((jji) it3.next()).b, iMax, iMax).getClass();
                                                        }
                                                    }
                                                } finally {
                                                }
                                            }
                                            jjkVar.e(transaction);
                                            transaction.apply();
                                            affa.n(transaction, null);
                                            jjkVar.a();
                                        }
                                    }
                                }
                                th = null;
                            } else {
                                if (jjkVar != null) {
                                    jjkVar.c();
                                }
                                th = null;
                                jjaVar4.d = null;
                            }
                            transaction.apply();
                            affa.n(transaction, th);
                        } finally {
                        }
                    } else {
                        yphVar = yphVar2;
                    }
                    yphVar2 = yphVar;
                    i3 = i4;
                }
                yph yphVar3 = yphVar2;
                StringBuilder sb = new StringBuilder("View Hierarchy State:\n");
                FrameLayout frameLayout2 = projectionRootActivity.c;
                if (frameLayout2 == null) {
                    affa.d("rootLayout");
                    frameLayout = null;
                } else {
                    frameLayout = frameLayout2;
                }
                projectionRootActivity.c(frameLayout, 0, list, sb);
                ((ype) yphVar3.f()).y("%s", sb.toString());
            }
        }
        return afak.a;
    }
}
