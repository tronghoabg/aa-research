package com.google.android.apps.auto.components.apphost.view.widgets.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import androidx.car.app.model.Badge;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import androidx.car.app.model.GridItem;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.projection.gearhead.R;
import defpackage.a;
import defpackage.gbt;
import defpackage.geu;
import defpackage.ghv;
import defpackage.ghw;
import defpackage.gmh;
import defpackage.hbz;
import defpackage.hin;
import defpackage.hlb;
import defpackage.hle;
import defpackage.hlu;
import defpackage.hlv;
import defpackage.hmb;
import defpackage.jmq;
import defpackage.kdi;
import defpackage.kdl;
import defpackage.leh;
import defpackage.naj;
import defpackage.uq;
import defpackage.wug;
import defpackage.wuj;
import defpackage.wuk;
import defpackage.yph;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class GridRowContainerView extends FrameLayout {
    public ViewGroup a;
    public int b;
    final ViewTreeObserver.OnGlobalFocusChangeListener c;
    private final int d;
    private final int e;

    static {
        yph.c("CarApp.H.Tem");
    }

    public GridRowContainerView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        this.b = -1;
        this.c = new hle(this, 4);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.templateGridItemHorizontalSpacing, R.attr.templateFocusStrokeWidthFocused, R.attr.templateGridItemHorizontalSpacingForSetItemSize, R.attr.templateGridItemTopBottomPadding});
        this.d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, -1);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(2, -1);
        typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0);
        typedArrayObtainStyledAttributes.recycle();
        leh.a();
    }

    public final int a() {
        ViewGroup viewGroup = this.a;
        if (viewGroup == null || !viewGroup.hasFocus()) {
            return -1;
        }
        for (int i = 0; i < this.a.getChildCount(); i++) {
            if (this.a.getChildAt(i).isFocused()) {
                return i;
            }
        }
        return -1;
    }

    public final View b(int i) {
        if (i < 0 || i >= this.a.getChildCount()) {
            return null;
        }
        return this.a.getChildAt(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v5 */
    public final void c(geu geuVar, List list, int i) {
        boolean z;
        boolean z2;
        CarText carText;
        boolean z3;
        Badge badge;
        boolean z4;
        kdl kdlVar = (kdl) list.get(i);
        kdlVar.getClass();
        ?? r8 = 0;
        boolean z5 = true;
        int i2 = !(kdlVar.c == 1) ? this.e : this.d;
        this.a.removeAllViews();
        List list2 = kdlVar.a;
        Iterator it = list2.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            kdi kdiVar = (kdi) it.next();
            ViewGroup viewGroup = this.a;
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
            leh.a();
            GridItemView gridItemView = (GridItemView) layoutInflaterFrom.inflate(R.layout.material_grid_item_view, this, (boolean) r8);
            gridItemView.setLayoutParams(new LinearLayout.LayoutParams(r8, gridItemView.getLayoutParams().height, 1.0f));
            viewGroup.addView(gridItemView);
            Iterator it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z = r8;
                    break;
                }
                CarText title = ((kdi) it2.next()).a.getTitle();
                if (title != null && !title.isEmpty()) {
                    z = z5;
                    break;
                }
            }
            Iterator it3 = list2.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    z2 = r8;
                    break;
                }
                CarText text = ((kdi) it3.next()).a.getText();
                if (text != null && !text.isEmpty()) {
                    z2 = z5;
                    break;
                }
            }
            GridItem gridItem = kdiVar.a;
            gridItemView.setOnClickListener(null);
            gridItemView.setOnFocusChangeListener(null);
            CarText title2 = gridItem.getTitle();
            CarText text2 = gridItem.getText();
            boolean z6 = kdiVar.d;
            if (z6) {
                CharSequence charSequenceC = hlb.c(title2);
                CharSequence charSequenceC2 = hlb.c(text2);
                title2 = charSequenceC != null ? CarText.create(charSequenceC) : null;
                if (charSequenceC2 != null) {
                    text2 = CarText.create(charSequenceC2);
                    carText = text2;
                } else {
                    carText = null;
                }
            } else {
                carText = text2;
            }
            int i4 = kdiVar.e;
            gridItemView.s.setGravity(i4);
            if (i4 == 8388611) {
                gridItemView.t.setGravity(8388627);
                gridItemView.u.setGravity(8388627);
            }
            if (geuVar.i().c() >= 8) {
                hlv hlvVarA = gridItemView.a(gridItemView.t).a();
                hlu hluVarA = gridItemView.a(gridItemView.u);
                z3 = z6;
                hluVarA.a = ghv.b;
                hlv hlvVarA2 = hluVarA.a();
                GridItemView.b(geuVar, gridItemView.t, title2, hlvVarA, z);
                GridItemView.b(geuVar, gridItemView.u, carText, hlvVarA2, z2);
            } else {
                z3 = z6;
                GridItemView.b(geuVar, gridItemView.t, title2, hlv.a, z);
                GridItemView.b(geuVar, gridItemView.u, carText, GridItemView.a, z2);
            }
            int i5 = kdiVar.g;
            if (i5 == 0) {
                throw null;
            }
            int i6 = (i5 != 1 || z3) ? 0 : gridItemView.h;
            LinearLayout linearLayout = gridItemView.s;
            int paddingTop = linearLayout.getPaddingTop();
            int paddingBottom = gridItemView.s.getPaddingBottom();
            if (true == z2) {
                i6 = 0;
            }
            linearLayout.setPadding(0, paddingTop, 0, paddingBottom + i6);
            hin hinVar = kdiVar.f;
            uq onClickDelegate = gridItem.getOnClickDelegate();
            boolean zIsLoading = gridItem.isLoading();
            boolean z7 = (zIsLoading || (onClickDelegate == null && hinVar == null)) ? false : true;
            int i7 = i5 - 1;
            int i8 = (i7 == 0 || i7 == 1) ? gridItemView.c : i7 != 2 ? i7 != 3 ? gridItemView.f : gridItemView.e : gridItemView.d;
            List list3 = list2;
            gridItemView.z.getLayoutParams().width = i8;
            gridItemView.z.getLayoutParams().height = i8;
            Iterator it4 = it;
            gridItemView.w.setVisibility(true != zIsLoading ? 8 : 0);
            gridItemView.v.setVisibility(true != zIsLoading ? 0 : 8);
            if (!zIsLoading) {
                int imageType = gridItem.getImageType();
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) gridItemView.v.getLayoutParams();
                layoutParams.width = i8;
                layoutParams.height = i8;
                gridItemView.v.setLayoutParams(layoutParams);
                CarIcon image = gridItem.getImage();
                ShapeableImageView shapeableImageView = gridItemView.v;
                hmb hmbVar = hmb.a;
                ghw ghwVar = ghw.a;
                int i9 = gridItemView.g;
                boolean z8 = imageType == 1;
                int i10 = 4;
                hbz.j(geuVar, image, shapeableImageView, new hmb(i9, z8, false, ghw.a, (i7 == 3 || i7 == 4) ? gridItemView.p : gridItemView.o, false, 0));
                int i11 = kdiVar.c;
                if (geuVar.i().c() >= 7 && i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalArgumentException(a.bp(i11, "Unrecognized grid item image shape: "));
                    }
                    ShapeableImageView shapeableImageView2 = gridItemView.v;
                    wuj wujVar = new wuj();
                    wujVar.f(new wug(0.5f));
                    shapeableImageView2.d(new wuk(wujVar));
                }
                if (onClickDelegate != null) {
                    gridItemView.setOnClickListener(new jmq(geuVar, onClickDelegate, i10, null));
                } else if (hinVar != null) {
                    gridItemView.setOnClickListener(new naj(hinVar, kdiVar, geuVar, 1));
                }
            }
            leh.a();
            if (!z3) {
                int i12 = gridItemView.n;
                gridItemView.setPadding(i12, i12, i12, i12);
            }
            if (geuVar.i().c() >= 7 && (badge = gridItem.getBadge()) != null) {
                if (gridItem.getImage() == null) {
                    throw new IllegalStateException("A badge can only be set when a grid item image is also provided");
                }
                if (!badge.hasDot() && badge.getIcon() == null) {
                    throw new IllegalStateException("A badge must have at least one property set");
                }
                if (badge.hasDot()) {
                    int iK = gbt.k(geuVar, badge.getDotColor(), true, gridItemView.j, ghv.a, 0);
                    if (i5 == 3) {
                        ViewGroup.LayoutParams layoutParams2 = gridItemView.y.getLayoutParams();
                        int i13 = gridItemView.q;
                        layoutParams2.height = i13;
                        gridItemView.y.getLayoutParams().width = i13;
                        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) gridItemView.y.getLayoutParams();
                        int i14 = gridItemView.r;
                        layoutParams3.topMargin = i14;
                        layoutParams3.rightMargin = i14;
                    }
                    ((GradientDrawable) gridItemView.y.getBackground()).setColor(iK);
                    gridItemView.y.setVisibility(0);
                }
                if (badge.getIcon() != null) {
                    if (i5 == 3) {
                        ViewGroup.LayoutParams layoutParams4 = gridItemView.x.getLayoutParams();
                        int i15 = gridItemView.m;
                        layoutParams4.width = i15;
                        gridItemView.x.getLayoutParams().height = i15;
                    }
                    gridItemView.x.setVisibility(0);
                    hmb hmbVar2 = hmb.a;
                    ghw ghwVar2 = ghw.b;
                    int i16 = gridItemView.l;
                    if (((gmh) geuVar.d()).a.getPackageName().equals("com.google.android.dialer")) {
                        float f = gridItemView.getResources().getDisplayMetrics().density;
                        gridItemView.x.setBackgroundColor(gridItemView.k);
                        int i17 = (int) (f + f);
                        gridItemView.x.g(i17, i17, i17, i17);
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (badge.getIconBackgroundColor() != null) {
                        gridItemView.x.setBackgroundColor(badge.getIconBackgroundColor().getColorDark());
                    }
                    hbz.j(geuVar, badge.getIcon(), gridItemView.x, new hmb(i16, z4, false, ghwVar2, null, false, 0));
                }
            }
            gridItemView.setClickable(z7);
            gridItemView.setBackground(gridItemView.i);
            gridItemView.setDescendantFocusability(393216);
            boolean z9 = !z7;
            if (gridItemView.b != z9) {
                gridItemView.b = z9;
                gridItemView.refreshDrawableState();
            }
            i3++;
            list2 = list3;
            it = it4;
            r8 = 0;
            z5 = true;
        }
        int i18 = kdlVar.b;
        while (i3 < i18) {
            ViewGroup viewGroup2 = this.a;
            Space space = new Space(getContext());
            space.setLayoutParams(new LinearLayout.LayoutParams(0, 1, 1.0f));
            viewGroup2.addView(space);
            ViewGroup viewGroup3 = this.a;
            Space space2 = new Space(getContext());
            space2.setLayoutParams(new LinearLayout.LayoutParams(i2, 1));
            viewGroup3.addView(space2);
            i3++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnGlobalFocusChangeListener(this.c);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        getViewTreeObserver().removeOnGlobalFocusChangeListener(this.c);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (ViewGroup) findViewById(R.id.container);
    }

    @Override // android.view.ViewGroup
    protected final boolean onRequestFocusInDescendants(int i, Rect rect) {
        View viewB = b(this.b);
        return viewB != null ? viewB.requestFocus() : super.onRequestFocusInDescendants(i, rect);
    }

    public GridRowContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GridRowContainerView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public GridRowContainerView(Context context) {
        this(context, null);
    }
}
