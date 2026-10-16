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
import com.google.android.material.materialswitch.MaterialSwitch;
import com.google.android.projection.gearhead.R;
import defpackage.geu;
import defpackage.ghy;
import defpackage.gpg;
import defpackage.gph;
import defpackage.hbz;
import defpackage.hif;
import defpackage.him;
import defpackage.kdx;
import defpackage.uq;
import defpackage.ype;
import defpackage.yph;
import java.util.List;

/* loaded from: classes2.dex */
public class MaterialRowContainerViewRowImpl extends kdx {
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
    private MaterialRowView p;
    private View q;

    public MaterialRowContainerViewRowImpl(Context context, AttributeSet attributeSet, int i, int i2) throws Resources.NotFoundException {
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
            ((ype) ((ype) c.h()).ai((char) 2940)).u("The row contains a toggle, ignoring click listener");
            onClickDelegate = null;
        }
        if (z) {
            ((ype) ((ype) c.h()).ai((char) 2939)).u("The row contains belongs to a selection group, ignoring click listener");
            onClickDelegate = null;
        }
        if (onClickDelegate == null || ghyVar.i) {
            return onClickDelegate;
        }
        ((ype) ((ype) c.h()).ai((char) 2938)).u("The row cannot be actionable, ignoring click handlers");
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
        ((ype) ((ype) c.h()).ai((char) 2941)).u("Ignoring disallowed toggle on the row");
        return null;
    }

    private static boolean i(Object obj) {
        return (obj instanceof hif) && !((hif) obj).b();
    }

    private static boolean j(List list, int i) {
        if (i == list.size() - 1) {
            return true;
        }
        Object obj = list.get(i + 1);
        obj.getClass();
        return !i(obj);
    }

    private static boolean k(hif hifVar) {
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

    private static final void l(View view, int i, int i2) {
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
            b(z && z2);
        }
        MaterialRowView materialRowView = this.p;
        if (materialRowView != null) {
            if (materialRowView.E.getVisibility() == 0) {
                ImageView imageView = materialRowView.F;
                geu geuVar = materialRowView.L;
                hbz.j(geuVar, materialRowView.a(geuVar, z, z2), imageView, materialRowView.k);
            }
            CarTextView carTextView = materialRowView.D;
            if (carTextView != null) {
                carTextView.setVisibility(true != z ? 8 : 0);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x065d  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x066a  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0676  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0689  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0799  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x079f  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x07a4  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x07a9  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x07ac  */
    @Override // defpackage.kdx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.geu r37, java.util.List r38, int r39, defpackage.hie r40) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 2005
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.auto.components.apphost.view.widgets.common.MaterialRowContainerViewRowImpl.d(geu, java.util.List, int, hie):void");
    }

    @Override // defpackage.kdx
    public final void e() throws Resources.NotFoundException {
        boolean zIsChecked;
        MaterialRowView materialRowView = this.p;
        if (materialRowView != null) {
            MaterialSwitch materialSwitch = materialRowView.w;
            if (materialSwitch == null) {
                zIsChecked = false;
            } else {
                materialSwitch.toggle();
                zIsChecked = materialSwitch.isChecked();
            }
            b(zIsChecked);
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
        this.p = (MaterialRowView) findViewById(R.id.row_view_root);
        this.a = (RowViewPrimaryContentContainer) findViewById(R.id.row_view_primary_content_container);
        this.q = findViewById(R.id.row_view_secondary_content_container);
    }

    public MaterialRowContainerViewRowImpl(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.markerAppearance);
    }

    public MaterialRowContainerViewRowImpl(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public MaterialRowContainerViewRowImpl(Context context) {
        this(context, null);
    }
}
