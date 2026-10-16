package defpackage;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.libraries.maps.model.BitmapDescriptor;
import com.google.android.libraries.maps.model.LatLng;
import com.google.android.libraries.maps.model.MarkerOptions;
import com.google.android.libraries.maps.model.PinConfig;
import com.google.android.libraries.maps.model.internal.IMarkerDelegate;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zwv extends IMarkerDelegate.Stub {
    private static final MarkerOptions l = new MarkerOptions();
    private static final sqj m = new sqi(null);
    private boolean A;
    private float B;
    private final int C;
    private int D;
    private final String E;
    public final String a;
    public final zwz b;
    public final zys c;
    public final zrt d;
    public zwu e;
    public ztq g;
    public View h;
    public boolean i;
    public int j;
    public final aacq k;
    private LatLng n;
    private float o;
    private float q;
    private float r;
    private boolean s;
    private float t;
    private boolean u;
    private boolean v;
    private String w;
    private String x;
    private float y;
    private float z;
    public long f = 0;
    private volatile Bitmap p = null;
    private sqj F = m;

    public zwv(String str, MarkerOptions markerOptions, zwz zwzVar, aacq aacqVar, zrt zrtVar, zys zysVar) {
        this.D = 0;
        this.a = str;
        this.b = zwzVar;
        this.k = aacqVar;
        this.c = zysVar;
        this.d = zrtVar;
        LatLng position = markerOptions.getPosition();
        ysi.X(position, "latlng cannot be null - a position is required.");
        this.n = position;
        this.o = markerOptions.getZIndex();
        BitmapDescriptor icon = markerOptions.getIcon();
        if (icon == null) {
            this.g = ztq.b();
        } else {
            ztq ztqVar = (ztq) sqi.a(icon.getRemoteObject());
            this.g = ztqVar;
            if ((ztqVar instanceof ztn) && (markerOptions.getMarkerType() != 1 || !zwzVar.n)) {
                this.g = ztq.b();
            }
        }
        n();
        this.q = markerOptions.getAnchorU();
        this.r = markerOptions.getAnchorV();
        this.s = markerOptions.isFlat();
        this.t = markerOptions.getRotation();
        this.B = markerOptions.getAlpha();
        this.w = markerOptions.getTitle();
        this.x = markerOptions.getSnippet();
        this.u = markerOptions.isDraggable();
        this.v = markerOptions.isVisible();
        this.y = markerOptions.getInfoWindowAnchorU();
        this.z = markerOptions.getInfoWindowAnchorV();
        this.C = markerOptions.getCollisionBehavior();
        this.D = markerOptions.getMarkerType();
        if (zwzVar.n) {
            View iconViewInternal = markerOptions.getIconViewInternal();
            this.h = iconViewInternal;
            if (iconViewInternal != null) {
                ztq ztqVar2 = this.g;
                if (ztqVar2 != null) {
                    aacqVar.j(ztqVar2);
                }
                this.g = new ztp(1, 1);
                n();
                this.h.getViewTreeObserver().addOnGlobalLayoutListener(new hx(this, 8));
                if (!this.v) {
                    this.h.setVisibility(8);
                }
            }
        }
        this.E = markerOptions.getContentDescription();
        float anchorU = markerOptions.getAnchorU();
        MarkerOptions markerOptions2 = l;
        if (anchorU != markerOptions2.getAnchorU() || markerOptions.getAnchorV() != markerOptions2.getAnchorV()) {
            zysVar.b(aahu.MARKER_ANCHOR);
        }
        if (markerOptions.getInfoWindowAnchorU() != markerOptions2.getInfoWindowAnchorU() || markerOptions.getInfoWindowAnchorV() != markerOptions2.getInfoWindowAnchorV()) {
            zysVar.b(aahu.MARKER_INFO_WINDOW_ANCHOR);
        }
        if (markerOptions.getIcon() != markerOptions2.getIcon()) {
            zysVar.b(aahu.MARKER_ICON);
        }
        if (!a.C(markerOptions.getTitle(), markerOptions2.getTitle())) {
            zysVar.b(aahu.MARKER_TITLE);
        }
        if (!a.C(markerOptions.getSnippet(), markerOptions2.getSnippet())) {
            zysVar.b(aahu.MARKER_SNIPPET);
        }
        if (markerOptions.isDraggable() != markerOptions2.isDraggable()) {
            zysVar.b(aahu.MARKER_DRAGGABLE);
        }
        if (markerOptions.isVisible() != markerOptions2.isVisible()) {
            zysVar.b(aahu.MARKER_VISIBILITY);
        }
        if (markerOptions.isFlat() != markerOptions2.isFlat()) {
            zysVar.b(aahu.MARKER_FLAT);
        }
        if (markerOptions.getRotation() != markerOptions2.getRotation()) {
            zysVar.b(aahu.MARKER_ROTATION);
        }
        if (markerOptions.getAlpha() != markerOptions2.getAlpha()) {
            zysVar.b(aahu.MARKER_ALPHA);
        }
        if (markerOptions.getZIndex() != markerOptions2.getZIndex()) {
            zysVar.b(aahu.MARKER_Z_INDEX);
        }
        if (markerOptions.getCollisionBehavior() != markerOptions2.getCollisionBehavior()) {
            zysVar.b(aahu.MARKER_COLLISION_BEHAVIOR);
        }
        if (!a.C(markerOptions.getContentDescription(), markerOptions2.getContentDescription())) {
            zysVar.b(aahu.MARKER_CONTENT_DESCRIPTION);
        }
        if (markerOptions.getIconViewInternal() != null) {
            zysVar.b(aahu.ADVANCED_MARKER_ICON_VIEW);
        }
        x();
    }

    private final void x() {
        ztq ztqVar = this.g;
        if (ztqVar instanceof ztn) {
            PinConfig pinConfig = ((ztn) ztqVar).a;
            if (pinConfig.getGlyph().getGlyphColor() != -5041134) {
                this.c.b(aahu.ADVANCED_MARKER_CUSTOMIZED_GLYPH_COLOR);
            }
            if (pinConfig.getGlyph().getBitmapDescriptor() != null) {
                this.c.b(aahu.ADVANCED_MARKER_CUSTOMIZED_GLYPH_IMAGE);
            }
            if (pinConfig.getGlyph().getText() != null) {
                this.c.b(aahu.ADVANCED_MARKER_CUSTOMIZED_GLYPH_TEXT);
            }
            if (pinConfig.getBorderColor() != -3857889) {
                this.c.b(aahu.ADVANCED_MARKER_CUSTOMIZED_BORDER_COLOR);
            }
            if (pinConfig.getBackgroundColor() != -1424587) {
                this.c.b(aahu.ADVANCED_MARKER_CUSTOMIZED_BACKGROUND_COLOR);
            }
        }
    }

    public final synchronized float a() {
        return this.B;
    }

    public final synchronized float b() {
        return this.q;
    }

    public final synchronized float c() {
        return this.r;
    }

    public final synchronized float d() {
        return this.y;
    }

    @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
    public final boolean equalsRemote(IMarkerDelegate iMarkerDelegate) {
        return equals(iMarkerDelegate);
    }

    public final synchronized float f() {
        return this.z;
    }

    public final synchronized float g() {
        return this.t;
    }

    @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
    public final float getAlpha() {
        this.d.a();
        return a();
    }

    @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
    public final int getCollisionBehavior() {
        this.d.a();
        return i();
    }

    @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
    public final String getContentDescription() {
        this.d.a();
        return this.E;
    }

    @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
    public final synchronized sqj getIconView() {
        this.d.a();
        return new sqi(this.h);
    }

    @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
    public final String getId() {
        return this.a;
    }

    @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
    public final int getMarkerType() {
        this.d.a();
        return this.D;
    }

    @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
    public final LatLng getPosition() {
        this.d.a();
        return l();
    }

    @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
    public final float getRotation() {
        this.d.a();
        return g();
    }

    @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
    public final String getSnippet() {
        this.d.a();
        return this.x;
    }

    @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
    public final sqj getTag() {
        this.d.a();
        return this.F;
    }

    @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
    public final String getTitle() {
        this.d.a();
        return m();
    }

    @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
    public final float getZIndex() {
        this.d.a();
        return h();
    }

    public final synchronized float h() {
        return this.o;
    }

    @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
    public final int hashCodeRemote() {
        return hashCode();
    }

    @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
    public final void hideInfoWindow() {
        this.d.a();
        synchronized (this) {
            this.j = 1;
        }
        o(12);
    }

    public final int i() {
        if (this.b.n) {
            return this.C;
        }
        return 0;
    }

    @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
    public final boolean isDraggable() {
        this.d.a();
        return s();
    }

    @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
    public final boolean isFlat() {
        this.d.a();
        return t();
    }

    @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
    public final boolean isInfoWindowShown() {
        this.d.a();
        if (this.A) {
            return false;
        }
        zwz zwzVar = this.b;
        zwu zwuVarB = zwzVar.b(this);
        return zwuVarB == null ? (w() == 2 || w() == 3) && v() : zwuVarB.g() || zwzVar.d.containsKey(this);
    }

    @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
    public final boolean isVisible() {
        this.d.a();
        return v();
    }

    @ResultIgnorabilityUnspecified
    public final synchronized Bitmap j() {
        return this.p;
    }

    public final Rect k() {
        return this.e.a();
    }

    public final synchronized LatLng l() {
        return this.n;
    }

    public final synchronized String m() {
        return this.w;
    }

    public final synchronized void n() {
        this.p = this.k.i(this.g);
    }

    public final void o(int i) {
        if (this.A) {
            return;
        }
        this.b.c(this, i);
    }

    final void p() {
        if (this.A) {
            return;
        }
        if (isInfoWindowShown()) {
            hideInfoWindow();
        }
        this.F = m;
        synchronized (this) {
            this.A = true;
            this.k.j(this.g);
            this.p = null;
        }
        zwz zwzVar = this.b;
        zwr zwrVar = zwzVar.l;
        if (!zwrVar.d && zwrVar.e == this) {
            zwrVar.c();
        }
        Map map = zwzVar.e;
        View view = (View) map.get(this);
        if (view != null) {
            ViewParent parent = zwzVar.m.a().getParent();
            if (parent instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) parent;
                viewGroup.removeView(view);
                Map map2 = zwzVar.d;
                if (map2.containsKey(this)) {
                    viewGroup.removeView((View) map2.get(this));
                }
            }
            map.remove(this);
        }
        ymf ymfVar = zwzVar.f;
        String str = this.a;
        ymfVar.E(str);
        Map map3 = zwzVar.c;
        zwu zwuVar = (zwu) map3.get(this);
        if (zwuVar != null) {
            zwuVar.f();
            map3.remove(this);
        } else {
            String str2 = zwz.a;
            if (zrn.e(str2, 6)) {
                Log.e(str2, "MarkerRenderer is null for Marker: ".concat(str));
            }
        }
    }

    public final void q(LatLng latLng) {
        r(latLng);
        o(0);
    }

    public final synchronized void r(LatLng latLng) {
        this.n = latLng;
    }

    @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
    public final void remove() {
        this.d.a();
        int i = this.D;
        zys zysVar = this.c;
        if (i == 1) {
            zysVar.b(aahu.ADVANCED_MARKER_REMOVE);
            p();
        } else {
            zysVar.b(aahu.MARKER_REMOVE);
            p();
        }
    }

    public final synchronized boolean s() {
        return this.u;
    }

    @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
    public final void setAlpha(float f) {
        this.d.a();
        synchronized (this) {
            if (this.B == f) {
                return;
            }
            this.B = f;
            o(10);
        }
    }

    @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
    public final void setAnchor(float f, float f2) {
        this.d.a();
        synchronized (this) {
            if (this.q == f && this.r == f2) {
                return;
            }
            this.q = f;
            this.r = f2;
            o(2);
        }
    }

    @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
    public final void setDraggable(boolean z) {
        this.d.a();
        synchronized (this) {
            if (this.u == z) {
                return;
            }
            this.u = z;
            o(5);
        }
    }

    @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
    public final void setFlat(boolean z) {
        this.d.a();
        synchronized (this) {
            if (this.s == z) {
                return;
            }
            this.s = z;
            o(3);
        }
    }

    @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
    public final void setIcon(sqj sqjVar) {
        this.d.a();
        synchronized (this) {
            this.k.j(this.g);
            if (sqjVar == null) {
                this.g = ztq.b();
            } else {
                ztq ztqVar = (ztq) sqi.a(sqjVar);
                this.g = ztqVar;
                if (ztqVar instanceof ztn) {
                    if (this.D == 1 && this.b.n) {
                        x();
                    } else {
                        this.g = ztq.b();
                    }
                }
            }
            n();
        }
        o(1);
    }

    @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
    public final synchronized void setIconView(sqj sqjVar) {
        this.d.a();
        if (this.b.n) {
            ztq ztqVar = this.g;
            if (ztqVar != null) {
                this.k.j(ztqVar);
            }
            View view = (View) sqi.a(sqjVar);
            this.h = view;
            if (view == null) {
                this.g = ztq.b();
            } else {
                this.c.b(aahu.ADVANCED_MARKER_ICON_VIEW);
                this.g = new ztp(1, 1);
                this.h.getViewTreeObserver().addOnGlobalLayoutListener(new hx(this, 9));
            }
            n();
            o(1);
        }
    }

    @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
    public final void setInfoWindowAnchor(float f, float f2) {
        this.d.a();
        synchronized (this) {
            if (this.y == f && this.z == f2) {
                return;
            }
            this.y = f;
            this.z = f2;
            o(9);
        }
    }

    @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
    public final void setMarkerType(int i) {
        this.d.a();
        this.D = i;
    }

    @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
    public final void setPosition(LatLng latLng) {
        this.d.a();
        this.c.b(aahu.MARKER_SET_POSITION);
        q(latLng);
    }

    @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
    public final void setRotation(float f) {
        this.d.a();
        synchronized (this) {
            if (this.t == f) {
                return;
            }
            this.t = f;
            o(4);
        }
    }

    @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
    public final void setSnippet(String str) {
        this.d.a();
        this.x = str;
        o(8);
    }

    @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
    public final void setTag(sqj sqjVar) {
        this.d.a();
        this.c.b(aahu.MARKER_SET_TAG);
        this.F = sqjVar;
    }

    @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
    public final void setTitle(String str) {
        this.d.a();
        synchronized (this) {
            this.w = str;
        }
        o(7);
    }

    @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
    public final void setVisible(boolean z) {
        this.d.a();
        synchronized (this) {
            if (this.v == z) {
                return;
            }
            this.v = z;
            View view = this.h;
            if (view != null) {
                view.setVisibility(true != z ? 8 : 0);
            }
            o(6);
        }
    }

    @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
    public final void setZIndex(float f) {
        this.d.a();
        this.c.b(aahu.MARKER_Z_INDEX);
        synchronized (this) {
            if (this.o == f) {
                return;
            }
            this.o = f;
            o(11);
        }
    }

    @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
    public final void showInfoWindow() {
        this.d.a();
        synchronized (this) {
            this.j = 2;
        }
        o(12);
    }

    public final synchronized boolean t() {
        return this.s;
    }

    public final String toString() {
        return this.a;
    }

    public final synchronized boolean u() {
        return this.A;
    }

    public final synchronized boolean v() {
        View view = this.h;
        if (view != null) {
            return view.getVisibility() == 0;
        }
        return this.v && !this.i;
    }

    public final int w() {
        int i;
        synchronized (this) {
            i = this.j;
        }
        return i;
    }
}
