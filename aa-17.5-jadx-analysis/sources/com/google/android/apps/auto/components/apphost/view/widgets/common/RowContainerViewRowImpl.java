package com.google.android.apps.auto.components.apphost.view.widgets.common;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.car.app.model.Row;
import androidx.car.app.model.Toggle;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;
import defpackage.ghy;
import defpackage.gpg;
import defpackage.gph;
import defpackage.hif;
import defpackage.him;
import defpackage.kdx;
import defpackage.kex;
import defpackage.uq;
import defpackage.ype;
import defpackage.yph;
import java.util.List;

/* loaded from: classes2.dex */
public class RowContainerViewRowImpl extends kdx {
    public static final /* synthetic */ int b = 0;
    private static final yph c = yph.c("CarApp.H.Tem");
    RowViewPrimaryContentContainer a;
    private final int d;
    private View e;
    private final gph f;
    private final int g;
    private final int h;
    private final int i;
    private final int j;
    private final int k;
    private View l;
    private ImageView m;
    private hif n;
    private int o;
    private RowView p;
    private View q;
    private final kex r;

    public RowContainerViewRowImpl(Context context, AttributeSet attributeSet, int i, int i2) throws Resources.NotFoundException {
        super(context, attributeSet, i);
        this.o = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.templateRowBackgroundType, R.attr.templateRowBackgroundSectionalBottomMargin, R.attr.templateRowHorizontalPadding, R.attr.templateRowHorizontalHalfPadding, R.attr.templateRowListToLargeImageRatio, R.attr.templateRowListLargeImageContainerMaxWidth, R.attr.templateRowListAndImagePadding, R.attr.templateRowListStyle});
        this.g = typedArrayObtainStyledAttributes.getInt(0, 0);
        this.h = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.i = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.j = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, 0);
        float f = typedArrayObtainStyledAttributes.getFloat(4, BitmapDescriptorFactory.HUE_RED);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, 0);
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(7, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.r = new kex(context);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, new int[]{R.attr.listMaxWidth, R.attr.listWidthFraction});
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, 0);
        float f2 = typedArrayObtainStyledAttributes2.getFloat(1, BitmapDescriptorFactory.HUE_RED);
        typedArrayObtainStyledAttributes2.recycle();
        if (f2 > BitmapDescriptorFactory.HUE_RED) {
            int iMin = Math.min((int) (getResources().getDisplayMetrics().widthPixels * f2), dimensionPixelSize3);
            this.d = iMin;
            this.k = Math.min(dimensionPixelSize, (int) (f * iMin)) + dimensionPixelSize2;
        } else {
            this.d = -1;
            this.k = -1;
        }
        this.f = new gph(context, new gpg(context, attributeSet, i, i2));
    }

    private static uq g(him himVar, boolean z) {
        Row row = (Row) himVar.a;
        uq onClickDelegate = row.getOnClickDelegate();
        ghy ghyVar = himVar.g;
        if (h(row, ghyVar) != null) {
            ((ype) ((ype) c.h()).ai((char) 2954)).u("The row contains a toggle, ignoring click listener");
            onClickDelegate = null;
        }
        if (z) {
            ((ype) ((ype) c.h()).ai((char) 2953)).u("The row contains belongs to a selection group, ignoring click listener");
            onClickDelegate = null;
        }
        if (onClickDelegate == null || ghyVar.i) {
            return onClickDelegate;
        }
        ((ype) ((ype) c.h()).ai((char) 2952)).u("The row cannot be actionable, ignoring click handlers");
        return null;
    }

    private static Toggle h(Row row, ghy ghyVar) {
        Toggle toggle = row.getToggle();
        if (toggle == null) {
            return null;
        }
        if (ghyVar.h) {
            return toggle;
        }
        ((ype) ((ype) c.h()).ai((char) 2955)).u("Ignoring disallowed toggle on the row");
        return null;
    }

    private static hif i(List list, int i) {
        if (i >= list.size() || i < 0) {
            return null;
        }
        Object obj = list.get(i);
        if (obj instanceof hif) {
            return (hif) obj;
        }
        return null;
    }

    private static boolean j(Object obj) {
        return (obj instanceof hif) && !((hif) obj).b();
    }

    private static boolean k(List list, int i) {
        if (i == list.size() - 1) {
            return true;
        }
        Object obj = list.get(i + 1);
        obj.getClass();
        return !j(obj);
    }

    private static boolean l(List list, int i) {
        if (i == 0) {
            return true;
        }
        Object obj = list.get(i - 1);
        obj.getClass();
        return !j(obj);
    }

    private static boolean m(hif hifVar) {
        if (hifVar == null) {
            return false;
        }
        him himVar = hifVar.a;
        boolean z = himVar.l != null;
        if (g(himVar, z) == null && !z) {
            if (h((Row) himVar.a, himVar.g) == null) {
                return false;
            }
        }
        return true;
    }

    private static final void n(View view, int i, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.getClass();
        if (marginLayoutParams.bottomMargin == i && marginLayoutParams.getMarginEnd() == i2) {
            return;
        }
        marginLayoutParams.bottomMargin = i;
        marginLayoutParams.setMarginEnd(i2);
        view.setLayoutParams(marginLayoutParams);
    }

    @Override // defpackage.kdx
    public final hif a() {
        return this.n;
    }

    public final void b(boolean z) {
        if ((this.o & 4) != 0) {
            this.a.setSelected(z);
            this.q.setSelected(z);
        }
    }

    @Override // defpackage.kdx
    public final void c(boolean z, boolean z2) {
        if ((this.o & 4) != 0) {
            boolean z3 = false;
            if (z && z2) {
                z3 = true;
            }
            b(z3);
        }
        RowView rowView = this.p;
        if (rowView != null) {
            rowView.e(z, z2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x05de  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x05eb  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x05f5  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0608  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x061b  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x07ab  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x07b1 A[PHI: r4
  0x07b1: PHI (r4v53 int) = (r4v51 int), (r4v52 int), (r4v55 int) binds: [B:342:0x07a7, B:343:0x07a9, B:339:0x07a2] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.kdx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.geu r38, java.util.List r39, int r40, defpackage.hie r41) {
        /*
            Method dump skipped, instructions count: 2028
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.auto.components.apphost.view.widgets.common.RowContainerViewRowImpl.d(geu, java.util.List, int, hie):void");
    }

    @Override // defpackage.kdx
    public final void e() {
        RowView rowView = this.p;
        if (rowView != null) {
            b(rowView.k());
        }
    }

    @Override // defpackage.kdx
    public final boolean f() {
        return this.a.getGlobalVisibleRect(new Rect());
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.e = findViewById(R.id.row_divider);
        this.l = findViewById(R.id.marker_label);
        this.m = (ImageView) findViewById(R.id.marker_icon);
        this.p = (RowView) findViewById(R.id.row_view_root);
        this.a = (RowViewPrimaryContentContainer) findViewById(R.id.row_view_primary_content_container);
        this.q = findViewById(R.id.row_view_secondary_content_container);
    }

    public RowContainerViewRowImpl(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.markerAppearance);
    }

    public RowContainerViewRowImpl(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public RowContainerViewRowImpl(Context context) {
        this(context, null);
    }
}
