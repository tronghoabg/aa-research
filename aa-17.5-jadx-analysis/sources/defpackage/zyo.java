package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.libraries.maps.model.TileOverlayOptions;
import com.google.android.libraries.maps.model.TileProvider;
import com.google.android.libraries.maps.model.internal.ITileOverlayDelegate;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class zyo extends ITileOverlayDelegate.Stub implements zxc {
    private static final TileOverlayOptions d = new TileOverlayOptions();
    private static final AtomicInteger e = new AtomicInteger(0);
    public final String a = String.format(Locale.getDefault(), "to%d", Integer.valueOf(e.getAndIncrement()));
    public final TileProvider b;
    public aacv c;
    private final zxd f;
    private final zys g;
    private final zrt h;
    private boolean i;
    private float j;
    private boolean k;
    private float l;
    private boolean m;

    public zyo(TileOverlayOptions tileOverlayOptions, zxd zxdVar, zys zysVar, zrt zrtVar) {
        this.f = zxdVar;
        this.g = zysVar;
        this.h = zrtVar;
        zkt.e(tileOverlayOptions.getTileProvider() != null, "TileOverlayOptions must specify a TileProvider");
        this.b = tileOverlayOptions.getTileProvider();
        this.i = tileOverlayOptions.isVisible();
        this.j = tileOverlayOptions.getZIndex();
        this.k = tileOverlayOptions.getFadeIn();
        this.l = tileOverlayOptions.getTransparency();
        this.m = false;
        boolean zIsVisible = tileOverlayOptions.isVisible();
        TileOverlayOptions tileOverlayOptions2 = d;
        if (zIsVisible != tileOverlayOptions2.isVisible()) {
            zysVar.b(aahu.TILE_OVERLAY_VISIBILITY);
        }
        if (tileOverlayOptions.getZIndex() != tileOverlayOptions2.getZIndex()) {
            zysVar.b(aahu.TILE_OVERLAY_Z_INDEX);
        }
        if (tileOverlayOptions.getFadeIn() != tileOverlayOptions2.getFadeIn()) {
            zysVar.b(aahu.TILE_OVERLAY_FADE);
        }
        if (tileOverlayOptions.getTransparency() != tileOverlayOptions2.getTransparency()) {
            zysVar.b(aahu.TILE_OVERLAY_TRANSPARENCY);
        }
    }

    private final void f(int i) {
        synchronized (this) {
            if (this.m) {
                return;
            }
            aacv aacvVar = this.c;
            if (aacvVar != null) {
                aacvVar.b.a();
                nzj nzjVar = aacvVar.e;
                if (nzjVar == null) {
                    return;
                }
                if (i == 0) {
                    ((ufs) nzjVar.b).K = aacvVar.a.c();
                } else {
                    if (i == 1) {
                        aacvVar.b();
                        return;
                    }
                    if (i == 2) {
                        aacvVar.a();
                        return;
                    }
                    zyo zyoVar = aacvVar.a;
                    if (zyoVar.d()) {
                        nzjVar.g(zyoVar.a());
                    }
                }
            }
        }
    }

    public final synchronized float a() {
        return 1.0f - this.l;
    }

    public final synchronized float b() {
        return this.j;
    }

    public final synchronized boolean c() {
        return this.k;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, uor] */
    @Override // com.google.android.libraries.maps.model.internal.ITileOverlayDelegate
    public final void clearTileCache() {
        this.h.a();
        this.g.b(aahu.TILE_OVERLAY_CLEAR_CACHE);
        aacv aacvVar = this.c;
        if (aacvVar != null) {
            aacvVar.b.a();
            nzj nzjVar = aacvVar.e;
            if (nzjVar == null) {
                return;
            }
            ((ufs) nzjVar.b).t();
            nzjVar.c.d();
        }
    }

    public final synchronized boolean d() {
        return this.i;
    }

    @Override // com.google.android.libraries.maps.model.internal.ITileOverlayDelegate
    public final boolean equalsRemote(ITileOverlayDelegate iTileOverlayDelegate) {
        return equals(iTileOverlayDelegate);
    }

    @Override // com.google.android.libraries.maps.model.internal.ITileOverlayDelegate
    public final synchronized boolean getFadeIn() {
        this.h.a();
        return c();
    }

    @Override // com.google.android.libraries.maps.model.internal.ITileOverlayDelegate
    public final String getId() {
        return this.a;
    }

    @Override // com.google.android.libraries.maps.model.internal.ITileOverlayDelegate
    public final synchronized float getTransparency() {
        this.h.a();
        return this.l;
    }

    @Override // com.google.android.libraries.maps.model.internal.ITileOverlayDelegate
    public final synchronized float getZIndex() {
        this.h.a();
        return b();
    }

    @Override // com.google.android.libraries.maps.model.internal.ITileOverlayDelegate
    public final int hashCodeRemote() {
        return hashCode();
    }

    @Override // com.google.android.libraries.maps.model.internal.ITileOverlayDelegate
    public final synchronized boolean isVisible() {
        this.h.a();
        return d();
    }

    @Override // defpackage.zxc
    public final void j() {
        synchronized (this) {
            if (this.m) {
                return;
            }
            this.m = true;
            aacv aacvVar = this.c;
            if (aacvVar != null) {
                aacvVar.b.a();
                nzj nzjVar = aacvVar.e;
                if (nzjVar == null) {
                    return;
                }
                aacvVar.d.h.d.f((ufj) nzjVar.b);
                aacvVar.e = null;
            }
        }
    }

    @Override // com.google.android.libraries.maps.model.internal.ITileOverlayDelegate
    public final void remove() {
        this.h.a();
        this.g.b(aahu.TILE_OVERLAY_REMOVE);
        j();
        this.f.b(this);
    }

    @Override // com.google.android.libraries.maps.model.internal.ITileOverlayDelegate
    public final void setFadeIn(boolean z) {
        this.h.a();
        this.g.b(aahu.TILE_OVERLAY_FADE);
        synchronized (this) {
            this.k = z;
        }
        f(0);
    }

    @Override // com.google.android.libraries.maps.model.internal.ITileOverlayDelegate
    public final void setTransparency(float f) {
        this.h.a();
        this.g.b(aahu.TILE_OVERLAY_TRANSPARENCY);
        boolean z = false;
        if (f >= BitmapDescriptorFactory.HUE_RED && f <= 1.0f) {
            z = true;
        }
        zkt.e(z, "Transparency must be in the range [0..1]");
        synchronized (this) {
            this.l = f;
        }
        f(3);
    }

    @Override // com.google.android.libraries.maps.model.internal.ITileOverlayDelegate
    public final void setVisible(boolean z) {
        this.h.a();
        this.g.b(aahu.TILE_OVERLAY_VISIBILITY);
        synchronized (this) {
            this.i = z;
        }
        f(2);
    }

    @Override // com.google.android.libraries.maps.model.internal.ITileOverlayDelegate
    public final void setZIndex(float f) {
        this.h.a();
        this.g.b(aahu.TILE_OVERLAY_Z_INDEX);
        synchronized (this) {
            this.j = f;
        }
        f(1);
    }

    public final synchronized String toString() {
        zsa zsaVarA;
        zsaVarA = zsa.a(this);
        zsaVarA.b("id", this.a);
        zsaVarA.g("visible", this.i);
        zsaVarA.d("zIndex", this.j);
        zsaVarA.g("fadeIn", this.k);
        return zsaVarA.toString();
    }
}
