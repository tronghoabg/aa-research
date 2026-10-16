package com.google.android.apps.auto.components.system.facetbar.hotseat;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.apps.auto.components.graphics.icon.GhIcon;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;
import defpackage.afeu;
import defpackage.affa;
import defpackage.gjo;
import defpackage.hrt;
import defpackage.hsq;
import defpackage.icg;
import defpackage.iek;
import defpackage.ieq;
import defpackage.jrm;
import defpackage.jzt;
import defpackage.kok;
import defpackage.leh;
import defpackage.lgi;
import defpackage.mhr;
import defpackage.nmj;
import defpackage.nmn;
import defpackage.nmo;
import defpackage.nmp;
import defpackage.nmq;
import defpackage.ols;
import defpackage.yop;
import defpackage.yph;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 D2\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006E"}, d2 = {"Lcom/google/android/apps/auto/components/system/facetbar/hotseat/RailHotseatItemView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "root", "Landroid/view/ViewGroup;", "getRoot$annotations", "()V", "getRoot", "()Landroid/view/ViewGroup;", "setRoot", "(Landroid/view/ViewGroup;)V", "badge", "Landroid/widget/ImageView;", "largeIcon", "largeIconOutline", "Lcom/google/android/apps/auto/components/system/facetbar/hotseat/RailHotseatItemOutline;", "iconImageViewPadding", "animatingHotseatItem", "Lcom/google/android/apps/auto/components/system/facetbar/hotseat/HotseatItem;", "currentHotseatItem", "name", "", "kotlin.jvm.PlatformType", "onGlobalLayoutListenerRegistered", "", "customTarget", "Lcom/bumptech/glide/request/target/CustomTarget;", "Landroid/graphics/drawable/Drawable;", "getCustomTarget$annotations", "getCustomTarget", "()Lcom/bumptech/glide/request/target/CustomTarget;", "bind", "", "hotseatItem", "hasImageChanged", "other", "onHotseatAppTouch", "hotseatApp", "Landroid/view/View;", "event", "Landroid/view/MotionEvent;", "maybeDrawIconRipple", "updateLargeIconFromImageInfo", "imageInfo", "Lcom/android/car/libraries/apphost/external/graphics/ImageInfo;", "animateTransition", "scale", "", "alpha", "interpolator", "Landroid/animation/TimeInterpolator;", "endAction", "Ljava/lang/Runnable;", "setImageIcon", "icon", "Lcom/google/android/apps/auto/components/graphics/icon/GhIcon;", "disabled", "setDisabledAppearance", "isKnownBlackBackground", "setOutlineColor", "outlineColor", "Companion", "java.com.google.android.apps.auto.components.system.facetbar.hotseat_hotseat"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RailHotseatItemView extends FrameLayout {
    public static final yph a = yph.c("GH.RailHotSeatView");
    public final ImageView b;
    public final ImageView c;
    public nmj d;
    public nmj e;
    public final String f;
    public boolean g;
    public final ieq h;
    private ViewGroup i;
    private final nmo j;
    private final int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RailHotseatItemView(Context context, AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        super(context, attributeSet, i);
        context.getClass();
        this.f = getId() != -1 ? context.getResources().getResourceName(getId()) : "HotseatItem";
        Object systemService = getContext().getSystemService("layout_inflater");
        systemService.getClass();
        View viewInflate = ((LayoutInflater) systemService).inflate(R.layout.rail_hotseat_item_view_dynamic_icon_shape, this);
        viewInflate.getClass();
        ViewGroup viewGroup = (ViewGroup) viewInflate;
        this.i = viewGroup;
        View viewFindViewById = viewGroup.findViewById(R.id.badge);
        viewFindViewById.getClass();
        this.b = (ImageView) viewFindViewById;
        View viewFindViewById2 = this.i.findViewById(R.id.large_icon);
        viewFindViewById2.getClass();
        ImageView imageView = (ImageView) viewFindViewById2;
        this.c = imageView;
        nmo nmoVar = new nmo(context);
        this.j = nmoVar;
        leh.a.a();
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.coolwalk_rail_dock_icon_padding_gm3);
        this.k = dimensionPixelSize;
        imageView.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        View viewFindViewById3 = this.i.findViewById(R.id.large_icon_background);
        viewFindViewById3.getClass();
        ImageView imageView2 = (ImageView) viewFindViewById3;
        imageView2.setVisibility(0);
        imageView2.setImageDrawable(nmoVar);
        imageView.setForeground(new nmn(context));
        this.h = new nmq(this);
    }

    public static final void f(View view, float f, float f2, TimeInterpolator timeInterpolator, Runnable runnable) {
        view.animate().scaleX(f).scaleY(f).alpha(f2).setDuration(83L).setInterpolator(timeInterpolator).withEndAction(runnable).start();
    }

    private static final void g(ImageView imageView, boolean z) {
        if (!z) {
            imageView.setColorFilter((ColorFilter) null);
            imageView.setImageAlpha(255);
        } else {
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(BitmapDescriptorFactory.HUE_RED);
            imageView.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            imageView.setImageAlpha(178);
        }
    }

    public final void a(nmj nmjVar) {
        GhIcon ghIcon;
        yph yphVar = a;
        yop yopVarL = yphVar.l();
        String str = this.f;
        yopVarL.M("%s binding to %s", str, nmjVar);
        Object tag = getTag();
        nmj nmjVar2 = tag instanceof nmj ? (nmj) tag : null;
        setTag(nmjVar);
        if (!this.i.isLaidOut()) {
            yphVar.l().N("%s not laid out, listenerRegistered=%s, waiting", str, this.g);
            this.d = nmjVar;
            if (this.g) {
                return;
            }
            ols.a(this.i, new kok(this, 12));
            this.g = true;
            return;
        }
        if (this.e == null) {
            this.e = nmjVar;
            gjo gjoVar = nmjVar.d;
            if (gjoVar != null) {
                d(gjoVar);
            } else {
                b(this.c, nmjVar.a, nmjVar.e);
            }
            GhIcon ghIcon2 = nmjVar.c;
            ImageView imageView = this.b;
            if (ghIcon2 != null) {
                lgi.d(imageView, ghIcon2, true, true, false);
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(8);
            }
            ImageView imageView2 = this.c;
            imageView2.setOnTouchListener(new jzt(this, 4, null));
            imageView2.setOnClickListener(new nmp(nmjVar, 0));
            this.d = null;
            return;
        }
        nmj nmjVar3 = this.d;
        if (nmjVar3 != null) {
            yphVar.l().M("%s already animating %s, will use new item after animation", str, nmjVar3);
            this.d = nmjVar;
            return;
        }
        if (nmjVar2 == null || !nmjVar.a.u(nmjVar2.a) || !affa.f(nmjVar.d, nmjVar2.d) || ((ghIcon = nmjVar.c) == null ? nmjVar2.c != null : !ghIcon.u(nmjVar2.c))) {
            this.d = nmjVar;
            f(this.c, 0.85f, 0.75f, new AccelerateInterpolator(), new mhr(this, 17));
            return;
        }
        nmj nmjVar4 = this.e;
        if (nmjVar4 == null) {
            affa.d("currentHotseatItem");
            nmjVar4 = null;
        }
        boolean z = nmjVar.e;
        if (nmjVar4.e != z) {
            g(this.c, z);
        }
        this.e = nmjVar;
        ImageView imageView3 = this.c;
        imageView3.setOnTouchListener(new jzt(this, 5, null));
        imageView3.setOnClickListener(new nmp(nmjVar, 2));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:27:0x004b
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1178)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* JADX WARN: Path cross not found for [B:11:0x0026, B:22:0x0043], limit reached: 33 */
    /* JADX WARN: Path cross not found for [B:13:0x002b, B:19:0x003a], limit reached: 33 */
    /* JADX WARN: Path cross not found for [B:24:0x004b, B:25:0x0050], limit reached: 33 */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(android.widget.ImageView r3, com.google.android.apps.auto.components.graphics.icon.GhIcon r4, boolean r5) {
        /*
            r2 = this;
            r0 = 1
            if (r3 == 0) goto Lc
            oga r1 = defpackage.ogb.a
            boolean r1 = r1.c()
            defpackage.lgi.d(r3, r4, r0, r0, r1)
        Lc:
            if (r3 == 0) goto L11
            g(r3, r5)
        L11:
            nmo r2 = r2.j
            if (r2 == 0) goto L52
            android.content.ComponentName r3 = r4.c()     // Catch: java.lang.IllegalStateException -> L4b
            java.lang.String r3 = r3.getPackageName()     // Catch: java.lang.IllegalStateException -> L4b
            int r4 = r3.hashCode()     // Catch: java.lang.IllegalStateException -> L4b
            r5 = -1424951015(0xffffffffab10f919, float:-5.150477E-13)
            if (r4 == r5) goto L43
            r5 = -1092352502(0xffffffffbee4060a, float:-0.44535857)
            if (r4 == r5) goto L3a
            r5 = 613209156(0x248cd444, float:6.1074914E-17)
            if (r4 == r5) goto L31
            goto L4b
        L31:
            java.lang.String r4 = "com.spotify.music"
            boolean r3 = r3.equals(r4)     // Catch: java.lang.IllegalStateException -> L4b
            if (r3 != 0) goto L50
            goto L4b
        L3a:
            java.lang.String r4 = "com.nbaimd.gametime.nba2011"
            boolean r3 = r3.equals(r4)     // Catch: java.lang.IllegalStateException -> L4b
            if (r3 != 0) goto L50
            goto L4b
        L43:
            java.lang.String r4 = "com.ubercab.driver"
            boolean r3 = r3.equals(r4)     // Catch: java.lang.IllegalStateException -> L4b
            if (r3 != 0) goto L50
        L4b:
            leg r3 = defpackage.leh.a
            r3.a()
        L50:
            r2.a = r0
        L52:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.auto.components.system.facetbar.hotseat.RailHotseatItemView.b(android.widget.ImageView, com.google.android.apps.auto.components.graphics.icon.GhIcon, boolean):void");
    }

    public final void c(int i) {
        nmo nmoVar = this.j;
        if (nmoVar != null) {
            nmoVar.b = i;
        }
    }

    public final void d(gjo gjoVar) {
        if (this.e == null) {
            throw new IllegalStateException("currentHotseatItem must be initialized first");
        }
        Bitmap bitmap = gjoVar.d;
        if (bitmap == null && gjoVar.b == null) {
            hrt.e(this).i(this.h);
            return;
        }
        hsq hsqVar = (hsq) hrt.e(this).d(bitmap).O(new jrm());
        hsq hsqVarM = ((hsq) hrt.e(this).e(gjoVar.b).O(new jrm())).n(iek.d()).m(icg.b());
        ImageView imageView = this.c;
        ((hsq) ((hsq) hsqVarM.G(imageView.getWidth(), imageView.getHeight())).l(hsqVar).I(imageView.getDrawable())).q(this.h);
    }

    public final void e(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            leh.a.a();
            view.animate().scaleX(0.95f).scaleY(0.95f).setDuration(50L).start();
        } else if (motionEvent.getAction() == 1) {
            view.setBackground(null);
            view.animate().scaleX(1.0f).scaleY(1.0f).setDuration(50L).start();
        }
        int i = this.k;
        view.setPadding(i, i, i, i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RailHotseatItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RailHotseatItemView(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ RailHotseatItemView(Context context, AttributeSet attributeSet, int i, int i2, afeu afeuVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
