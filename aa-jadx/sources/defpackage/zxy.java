package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zxy extends com.google.android.libraries.maps.model.internal.IMarkerDelegate.Stub {
    private static final com.google.android.libraries.maps.model.MarkerOptions l = new com.google.android.libraries.maps.model.MarkerOptions();
    private static final defpackage.srh m = new defpackage.srg(null);
    private boolean A;
    private float B;
    private final int C;
    private int D;
    private final java.lang.String E;
    public final java.lang.String a;
    public final defpackage.zyb b;
    public final defpackage.zzw c;
    public final defpackage.zsx d;
    public defpackage.zxx e;
    public defpackage.zut g;
    public android.view.View h;
    public boolean i;
    public int j;
    public final defpackage.zzx k;
    private com.google.android.libraries.maps.model.LatLng n;
    private float o;
    private float q;
    private float r;
    private boolean s;
    private float t;
    private boolean u;
    private boolean v;
    private java.lang.String w;
    private java.lang.String x;
    private float y;
    private float z;
    public long f = 0;
    private volatile android.graphics.Bitmap p = null;
    private defpackage.srh F = m;

    public zxy(java.lang.String str, com.google.android.libraries.maps.model.MarkerOptions markerOptions, defpackage.zyb zybVar, defpackage.zzx zzxVar, defpackage.zsx zsxVar, defpackage.zzw zzwVar) {
        this.D = 0;
        this.a = str;
        this.b = zybVar;
        this.k = zzxVar;
        this.c = zzwVar;
        this.d = zsxVar;
        com.google.android.libraries.maps.model.LatLng position = markerOptions.getPosition();
        defpackage.zlv.M(position, "latlng cannot be null - a position is required.");
        this.n = position;
        this.o = markerOptions.getZIndex();
        com.google.android.libraries.maps.model.BitmapDescriptor icon = markerOptions.getIcon();
        if (icon == null) {
            this.g = defpackage.zut.b();
        } else {
            defpackage.zut zutVar = (defpackage.zut) defpackage.srg.a(icon.getRemoteObject());
            this.g = zutVar;
            if ((zutVar instanceof defpackage.zuq) && (markerOptions.getMarkerType() != 1 || !zybVar.n)) {
                this.g = defpackage.zut.b();
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
        if (zybVar.n) {
            android.view.View iconViewInternal = markerOptions.getIconViewInternal();
            this.h = iconViewInternal;
            if (iconViewInternal != null) {
                defpackage.zut zutVar2 = this.g;
                if (zutVar2 != null) {
                    zzxVar.j(zutVar2);
                }
                this.g = new defpackage.zus(1, 1);
                n();
                this.h.getViewTreeObserver().addOnGlobalLayoutListener(new defpackage.hy(this, 8));
                if (!this.v) {
                    this.h.setVisibility(8);
                }
            }
        }
        this.E = markerOptions.getContentDescription();
        float anchorU = markerOptions.getAnchorU();
        com.google.android.libraries.maps.model.MarkerOptions markerOptions2 = l;
        if (anchorU != markerOptions2.getAnchorU() || markerOptions.getAnchorV() != markerOptions2.getAnchorV()) {
            zzwVar.b(defpackage.aaix.MARKER_ANCHOR);
        }
        if (markerOptions.getInfoWindowAnchorU() != markerOptions2.getInfoWindowAnchorU() || markerOptions.getInfoWindowAnchorV() != markerOptions2.getInfoWindowAnchorV()) {
            zzwVar.b(defpackage.aaix.MARKER_INFO_WINDOW_ANCHOR);
        }
        if (markerOptions.getIcon() != markerOptions2.getIcon()) {
            zzwVar.b(defpackage.aaix.MARKER_ICON);
        }
        if (!defpackage.a.B(markerOptions.getTitle(), markerOptions2.getTitle())) {
            zzwVar.b(defpackage.aaix.MARKER_TITLE);
        }
        if (!defpackage.a.B(markerOptions.getSnippet(), markerOptions2.getSnippet())) {
            zzwVar.b(defpackage.aaix.MARKER_SNIPPET);
        }
        if (markerOptions.isDraggable() != markerOptions2.isDraggable()) {
            zzwVar.b(defpackage.aaix.MARKER_DRAGGABLE);
        }
        if (markerOptions.isVisible() != markerOptions2.isVisible()) {
            zzwVar.b(defpackage.aaix.MARKER_VISIBILITY);
        }
        if (markerOptions.isFlat() != markerOptions2.isFlat()) {
            zzwVar.b(defpackage.aaix.MARKER_FLAT);
        }
        if (markerOptions.getRotation() != markerOptions2.getRotation()) {
            zzwVar.b(defpackage.aaix.MARKER_ROTATION);
        }
        if (markerOptions.getAlpha() != markerOptions2.getAlpha()) {
            zzwVar.b(defpackage.aaix.MARKER_ALPHA);
        }
        if (markerOptions.getZIndex() != markerOptions2.getZIndex()) {
            zzwVar.b(defpackage.aaix.MARKER_Z_INDEX);
        }
        if (markerOptions.getCollisionBehavior() != markerOptions2.getCollisionBehavior()) {
            zzwVar.b(defpackage.aaix.MARKER_COLLISION_BEHAVIOR);
        }
        if (!defpackage.a.B(markerOptions.getContentDescription(), markerOptions2.getContentDescription())) {
            zzwVar.b(defpackage.aaix.MARKER_CONTENT_DESCRIPTION);
        }
        if (markerOptions.getIconViewInternal() != null) {
            zzwVar.b(defpackage.aaix.ADVANCED_MARKER_ICON_VIEW);
        }
        x();
    }

    private final void x() {
        defpackage.zut zutVar = this.g;
        if (zutVar instanceof defpackage.zuq) {
            com.google.android.libraries.maps.model.PinConfig pinConfig = ((defpackage.zuq) zutVar).a;
            if (pinConfig.getGlyph().getGlyphColor() != -5041134) {
                this.c.b(defpackage.aaix.ADVANCED_MARKER_CUSTOMIZED_GLYPH_COLOR);
            }
            if (pinConfig.getGlyph().getBitmapDescriptor() != null) {
                this.c.b(defpackage.aaix.ADVANCED_MARKER_CUSTOMIZED_GLYPH_IMAGE);
            }
            if (pinConfig.getGlyph().getText() != null) {
                this.c.b(defpackage.aaix.ADVANCED_MARKER_CUSTOMIZED_GLYPH_TEXT);
            }
            if (pinConfig.getBorderColor() != -3857889) {
                this.c.b(defpackage.aaix.ADVANCED_MARKER_CUSTOMIZED_BORDER_COLOR);
            }
            if (pinConfig.getBackgroundColor() != -1424587) {
                this.c.b(defpackage.aaix.ADVANCED_MARKER_CUSTOMIZED_BACKGROUND_COLOR);
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
    public final boolean equalsRemote(com.google.android.libraries.maps.model.internal.IMarkerDelegate iMarkerDelegate) {
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
    public final java.lang.String getContentDescription() {
        this.d.a();
        return this.E;
    }

    @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
    public final synchronized defpackage.srh getIconView() {
        this.d.a();
        return new defpackage.srg(this.h);
    }

    @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
    public final java.lang.String getId() {
        return this.a;
    }

    @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
    public final int getMarkerType() {
        this.d.a();
        return this.D;
    }

    @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
    public final com.google.android.libraries.maps.model.LatLng getPosition() {
        this.d.a();
        return l();
    }

    @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
    public final float getRotation() {
        this.d.a();
        return g();
    }

    @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
    public final java.lang.String getSnippet() {
        this.d.a();
        return this.x;
    }

    @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
    public final defpackage.srh getTag() {
        this.d.a();
        return this.F;
    }

    @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
    public final java.lang.String getTitle() {
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
        defpackage.zyb zybVar = this.b;
        defpackage.zxx zxxVarB = zybVar.b(this);
        if (zxxVarB == null) {
            return (w() == 2 || w() == 3) && v();
        }
        return zxxVarB.g() || zybVar.d.containsKey(this);
    }

    @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
    public final boolean isVisible() {
        this.d.a();
        return v();
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final synchronized android.graphics.Bitmap j() {
        return this.p;
    }

    public final android.graphics.Rect k() {
        return this.e.a();
    }

    public final synchronized com.google.android.libraries.maps.model.LatLng l() {
        return this.n;
    }

    public final synchronized java.lang.String m() {
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
        defpackage.zyb zybVar = this.b;
        defpackage.zxu zxuVar = zybVar.l;
        if (!zxuVar.d && zxuVar.e == this) {
            zxuVar.c();
        }
        java.util.Map map = zybVar.e;
        android.view.View view = (android.view.View) map.get(this);
        if (view != null) {
            android.view.ViewParent parent = zybVar.m.a().getParent();
            if (parent instanceof android.view.ViewGroup) {
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) parent;
                viewGroup.removeView(view);
                java.util.Map map2 = zybVar.d;
                if (map2.containsKey(this)) {
                    viewGroup.removeView((android.view.View) map2.get(this));
                }
            }
            map.remove(this);
        }
        defpackage.ynk ynkVar = zybVar.f;
        java.lang.String str = this.a;
        ynkVar.E(str);
        java.util.Map map3 = zybVar.c;
        defpackage.zxx zxxVar = (defpackage.zxx) map3.get(this);
        if (zxxVar != null) {
            zxxVar.f();
            map3.remove(this);
        } else {
            java.lang.String str2 = defpackage.zyb.a;
            if (defpackage.zsr.e(str2, 6)) {
                android.util.Log.e(str2, "MarkerRenderer is null for Marker: ".concat(str));
            }
        }
    }

    public final void q(com.google.android.libraries.maps.model.LatLng latLng) {
        r(latLng);
        o(0);
    }

    public final synchronized void r(com.google.android.libraries.maps.model.LatLng latLng) {
        this.n = latLng;
    }

    @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
    public final void remove() {
        this.d.a();
        int i = this.D;
        defpackage.zzw zzwVar = this.c;
        if (i == 1) {
            zzwVar.b(defpackage.aaix.ADVANCED_MARKER_REMOVE);
            p();
        } else {
            zzwVar.b(defpackage.aaix.MARKER_REMOVE);
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
    public final void setIcon(defpackage.srh srhVar) {
        this.d.a();
        synchronized (this) {
            this.k.j(this.g);
            if (srhVar == null) {
                this.g = defpackage.zut.b();
            } else {
                defpackage.zut zutVar = (defpackage.zut) defpackage.srg.a(srhVar);
                this.g = zutVar;
                if (zutVar instanceof defpackage.zuq) {
                    if (this.D == 1 && this.b.n) {
                        x();
                    } else {
                        this.g = defpackage.zut.b();
                    }
                }
            }
            n();
        }
        o(1);
    }

    @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
    public final synchronized void setIconView(defpackage.srh srhVar) {
        this.d.a();
        if (this.b.n) {
            defpackage.zut zutVar = this.g;
            if (zutVar != null) {
                this.k.j(zutVar);
            }
            android.view.View view = (android.view.View) defpackage.srg.a(srhVar);
            this.h = view;
            if (view == null) {
                this.g = defpackage.zut.b();
            } else {
                this.c.b(defpackage.aaix.ADVANCED_MARKER_ICON_VIEW);
                this.g = new defpackage.zus(1, 1);
                this.h.getViewTreeObserver().addOnGlobalLayoutListener(new defpackage.hy(this, 9));
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
    public final void setPosition(com.google.android.libraries.maps.model.LatLng latLng) {
        this.d.a();
        this.c.b(defpackage.aaix.MARKER_SET_POSITION);
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
    public final void setSnippet(java.lang.String str) {
        this.d.a();
        this.x = str;
        o(8);
    }

    @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
    public final void setTag(defpackage.srh srhVar) {
        this.d.a();
        this.c.b(defpackage.aaix.MARKER_SET_TAG);
        this.F = srhVar;
    }

    @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
    public final void setTitle(java.lang.String str) {
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
            android.view.View view = this.h;
            if (view != null) {
                view.setVisibility(true != z ? 8 : 0);
            }
            o(6);
        }
    }

    @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
    public final void setZIndex(float f) {
        this.d.a();
        this.c.b(defpackage.aaix.MARKER_Z_INDEX);
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

    public final java.lang.String toString() {
        return this.a;
    }

    public final synchronized boolean u() {
        return this.A;
    }

    public final synchronized boolean v() {
        android.view.View view = this.h;
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
