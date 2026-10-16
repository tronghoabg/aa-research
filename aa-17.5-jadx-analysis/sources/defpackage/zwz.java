package defpackage;

import android.graphics.Point;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.libraries.maps.model.CameraPosition;
import com.google.android.libraries.maps.model.RuntimeRemoteException;
import com.google.android.libraries.maps.model.internal.IMapCapabilitiesDelegate;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;

/* loaded from: classes3.dex */
public final class zwz implements vez, vgj {
    public static final String a = "zwz";
    public final zys g;
    public final zwy h;
    public final zrt i;
    public final zvo k;
    public final zwr l;
    public final zwl m;
    public final aacq o;
    private final ztt t;
    public int b = 0;
    public final Map c = new ConcurrentHashMap();
    public final Map d = new ConcurrentHashMap();
    public final Map e = new ConcurrentHashMap();
    public final ymf f = new ykw(new ycx(8), new ykt());
    public boolean n = true;
    private vgy p = null;
    public vhb j = null;
    private vfx q = null;
    private vgd r = null;
    private vga s = null;

    public zwz(zwy zwyVar, zvo zvoVar, aacq aacqVar, zrt zrtVar, zys zysVar, zwr zwrVar, zwl zwlVar, ztt zttVar) {
        this.h = zwyVar;
        this.k = zvoVar;
        this.o = aacqVar;
        this.i = zrtVar;
        this.g = zysVar;
        this.l = zwrVar;
        this.m = zwlVar;
        this.t = zttVar;
    }

    private static final Point s(zxm zxmVar, zwv zwvVar) {
        return zxmVar.a(zwvVar.getPosition());
    }

    @Override // defpackage.vez
    public final void a(CameraPosition cameraPosition) throws RemoteException {
        View view;
        for (Map.Entry entry : this.e.entrySet()) {
            zwv zwvVar = (zwv) entry.getKey();
            if (zwvVar.getMarkerType() == 1 && (view = (View) entry.getValue()) != null) {
                Point pointS = s(this.t.e(), zwvVar);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
                float fB = zwvVar.b() * view.getMeasuredWidth();
                float fC = zwvVar.c() * view.getMeasuredHeight();
                int i = (int) fB;
                layoutParams.leftMargin = pointS.x - i;
                int i2 = (int) fC;
                layoutParams.topMargin = pointS.y - i2;
                view.setLayoutParams(layoutParams);
                view.setAlpha(zwvVar.a());
                float fG = zwvVar.g();
                if (fG != BitmapDescriptorFactory.HUE_RED) {
                    view.setPivotX(i);
                    view.setPivotY(i2);
                    view.setRotation(fG);
                }
            }
        }
        Iterator it = this.d.keySet().iterator();
        while (it.hasNext()) {
            q((zwv) it.next());
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return null;
    }

    public final zwu b(zwv zwvVar) {
        zwu zwuVar = (zwu) this.c.get(zwvVar);
        if (zwuVar != null) {
            return zwuVar;
        }
        String str = a;
        if (zrn.e(str, 6)) {
            Log.e(str, "MarkerRenderer is null for Marker: ".concat(String.valueOf(String.valueOf(zwvVar))));
        }
        return null;
    }

    public final void c(zwv zwvVar, int i) {
        this.i.a();
        if (zwvVar.u()) {
            return;
        }
        zwu zwuVarB = b(zwvVar);
        if (zwuVarB != null) {
            zwuVarB.e(i);
        } else {
            this.f.t(zwvVar.a, Integer.valueOf(i));
        }
        if (zwvVar.u()) {
            return;
        }
        if (zwvVar.getMarkerType() == 1) {
            if (i == 11) {
                p();
            }
            o(zwvVar);
        }
        if (this.d.containsKey(zwvVar)) {
            q(zwvVar);
        }
    }

    public final void d(zwv zwvVar) {
        ((zwu) this.c.get(zwvVar)).c();
        View view = (View) this.d.get(zwvVar);
        if (view != null) {
            view.setVisibility(0);
            q(zwvVar);
        }
        vhb vhbVar = this.j;
        if (vhbVar != null) {
            try {
                vhbVar.f(zwvVar);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }
        if (this.e.get(zwvVar) != null) {
            p();
        }
    }

    @Override // defpackage.vgj
    public final void e(IMapCapabilitiesDelegate iMapCapabilitiesDelegate) throws RemoteException {
        boolean z = this.n;
        if (z == ((zwa) iMapCapabilitiesDelegate).a) {
            return;
        }
        this.n = !z;
        Iterator it = this.c.keySet().iterator();
        while (it.hasNext()) {
            zrz.b().execute(new zww(this, (zwv) it.next(), 0));
        }
    }

    public final void f(zwv zwvVar) {
        this.i.a();
        vfx vfxVar = this.q;
        zys zysVar = this.g;
        if (vfxVar == null) {
            zysVar.b(aahu.MARKER_INFO_WINDOW_CLICK_WITHOUT_LISTENER);
            return;
        }
        zysVar.b(aahu.MARKER_INFO_WINDOW_CLICK_WITH_LISTENER);
        try {
            this.q.e(zwvVar);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void g(zwv zwvVar) {
        if (this.n) {
            Map map = this.d;
            View view = (View) map.get(zwvVar);
            if (view != null && (view.getParent() instanceof ViewGroup)) {
                ((ViewGroup) view.getParent()).removeView(view);
                map.remove(zwvVar);
            }
        }
        vga vgaVar = this.s;
        zys zysVar = this.g;
        if (vgaVar == null) {
            zysVar.b(aahu.MARKER_INFO_WINDOW_CLOSE_WITHOUT_LISTENER);
            return;
        }
        zysVar.b(aahu.MARKER_INFO_WINDOW_CLOSE_WITH_LISTENER);
        try {
            this.s.e(zwvVar);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void h(zwv zwvVar) {
        vgd vgdVar = this.r;
        zys zysVar = this.g;
        if (vgdVar == null) {
            zysVar.b(aahu.MARKER_INFO_WINDOW_LONG_CLICK_WITHOUT_LISTENER);
            return;
        }
        zysVar.b(aahu.MARKER_INFO_WINDOW_LONG_CLICK_WITH_LISTENER);
        try {
            this.r.e(zwvVar);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    final void i(boolean z) {
        for (zwv zwvVar : this.c.keySet()) {
            zwvVar.d.a();
            synchronized (zwvVar) {
                if (zwvVar.i != z) {
                    zwvVar.i = z;
                    zwvVar.o(6);
                }
            }
        }
    }

    public final void j(vgy vgyVar) {
        this.i.a();
        this.p = vgyVar;
    }

    public final void k(vhb vhbVar) {
        this.i.a();
        this.j = vhbVar;
    }

    public final void l(vfx vfxVar) {
        this.i.a();
        this.q = vfxVar;
    }

    public final void m(vga vgaVar) {
        this.i.a();
        this.s = vgaVar;
    }

    public final void n(vgd vgdVar) {
        this.i.a();
        this.r = vgdVar;
    }

    final void o(zwv zwvVar) {
        ViewParent parent = this.m.a().getParent();
        if (!(parent instanceof FrameLayout)) {
            throw new IllegalStateException("Map container must be a FrameLayout for native view markers to work");
        }
        FrameLayout frameLayout = (FrameLayout) parent;
        View view = (View) sqi.a(zwvVar.getIconView());
        Map map = this.e;
        FrameLayout zwxVar = (FrameLayout) map.get(zwvVar);
        if (view == null || zwvVar.u() || !zwvVar.isVisible() || !this.n) {
            if (zwxVar != null) {
                zwxVar.removeAllViews();
                frameLayout.removeView(zwxVar);
                map.remove(zwvVar);
                return;
            }
            return;
        }
        if (zwxVar == null) {
            zwxVar = new zwx(view.getContext());
            zwxVar.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            if (view.getParent() instanceof ViewGroup) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            zwxVar.addView(view);
        } else if (zwxVar.getChildCount() > 0 && zwxVar.getChildAt(0) != view) {
            zwxVar.removeAllViews();
            zwxVar.addView(view);
        }
        view.setImportantForAccessibility(4);
        Point pointS = s(this.t.e(), zwvVar);
        zwxVar.measure(View.MeasureSpec.makeMeasureSpec(frameLayout.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(frameLayout.getMeasuredHeight(), Integer.MIN_VALUE));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(zwxVar.getMeasuredWidth(), zwxVar.getMeasuredHeight());
        float fB = zwvVar.b() * zwxVar.getMeasuredWidth();
        float fC = zwvVar.c() * zwxVar.getMeasuredHeight();
        int i = (int) fB;
        layoutParams.leftMargin = pointS.x - i;
        int i2 = (int) fC;
        layoutParams.topMargin = pointS.y - i2;
        if (zwxVar.getParent() == null) {
            frameLayout.addView(zwxVar, layoutParams);
        } else {
            zwxVar.setLayoutParams(layoutParams);
        }
        zwxVar.setAlpha(zwvVar.a());
        float fG = zwvVar.g();
        if (fG != BitmapDescriptorFactory.HUE_RED) {
            zwxVar.setPivotX(i);
            zwxVar.setPivotY(i2);
            zwxVar.setRotation(fG);
        }
        map.put(zwvVar, zwxVar);
    }

    public final void p() {
        TreeSet treeSet = new TreeSet(new tui(13));
        Map map = this.e;
        treeSet.addAll(map.keySet());
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            View view = (View) map.get((zwv) it.next());
            if (view != null) {
                view.bringToFront();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0154  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean q(defpackage.zwv r22) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zwz.q(zwv):boolean");
    }

    public final boolean r(zwv zwvVar) {
        this.i.a();
        vgy vgyVar = this.p;
        if (vgyVar != null) {
            try {
                boolean zE = vgyVar.e(zwvVar);
                zys zysVar = this.g;
                if (zE) {
                    zysVar.b(aahu.MARKER_CLICK_WITH_INTERRUPTING_LISTENER);
                    return true;
                }
                zysVar.b(aahu.MARKER_CLICK_WITH_LISTENER);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            View viewA = this.m.a();
            int i = zvg.f;
            viewA.announceForAccessibility(!ysi.R(zwvVar.getTitle()) ? zvg.w(zwvVar) : !ysi.R(zwvVar.getContentDescription()) ? zwvVar.getContentDescription() : "");
            this.g.b(aahu.MARKER_CLICK_WITHOUT_LISTENER);
        }
        zwvVar.d.a();
        zwvVar.c.b(aahu.MARKER_SHOW_INFO_BUBBLE);
        synchronized (zwvVar) {
            zwvVar.j = 3;
        }
        zwvVar.o(12);
        zwr zwrVar = this.l;
        boolean z = this.h.c().size() > 1;
        if (!zwrVar.d) {
            zwrVar.f(true, zwvVar, z);
        }
        return false;
    }
}
