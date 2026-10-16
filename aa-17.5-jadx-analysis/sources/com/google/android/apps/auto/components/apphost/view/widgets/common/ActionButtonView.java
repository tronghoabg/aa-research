package com.google.android.apps.auto.components.apphost.view.widgets.common;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.LayerDrawable;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.car.app.model.CarColor;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarIconSpan;
import androidx.car.app.model.CarText;
import androidx.car.app.model.ForegroundCarColorSpan;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.projection.gearhead.R;
import defpackage.dvd;
import defpackage.fvv;
import defpackage.gbt;
import defpackage.gcs;
import defpackage.geu;
import defpackage.ghv;
import defpackage.ghw;
import defpackage.hbz;
import defpackage.hlb;
import defpackage.hls;
import defpackage.hlu;
import defpackage.hlv;
import defpackage.hmb;
import defpackage.ie;
import defpackage.kdv;
import defpackage.leh;
import defpackage.olm;
import defpackage.tj;
import defpackage.ype;
import defpackage.yph;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class ActionButtonView extends FrameLayout {
    public static final /* synthetic */ int a = 0;
    private static final yph b = yph.c("CarApp.H.Tem");
    private LinearLayout c;
    private final hmb d;
    private final int e;
    private final int f;
    private final int g;
    private final int h;
    private final int i;
    private final int j;
    private final int k;
    private final int l;
    private final int m;
    private final boolean n;
    private boolean o;

    public ActionButtonView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.templateActionButtonDefaultBackgroundColor, R.attr.templateActionDefaultIconTint, R.attr.templateActionWithTextMinWidth, R.attr.templateActionWithoutTextMinWidth, R.attr.templateActionButtonTimerColor, R.attr.templateActionButtonDefaultBackgroundDisabledColor, R.attr.templateActionButtonTextDisabledColor, R.attr.templateActionButtonTextColor, R.attr.templateActionButtonColor});
        this.e = typedArrayObtainStyledAttributes.getColor(0, 0);
        int color = typedArrayObtainStyledAttributes.getColor(1, 0);
        this.k = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.l = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, 0);
        this.f = typedArrayObtainStyledAttributes.getColor(4, 0);
        this.g = typedArrayObtainStyledAttributes.getColor(5, 0);
        this.h = typedArrayObtainStyledAttributes.getColor(6, 0);
        this.i = typedArrayObtainStyledAttributes.getColor(7, 0);
        this.j = typedArrayObtainStyledAttributes.getColor(8, 0);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, kdv.b, i, i2);
        this.m = typedArrayObtainStyledAttributes2.getInt(0, 0);
        this.n = typedArrayObtainStyledAttributes2.getBoolean(1, false);
        typedArrayObtainStyledAttributes2.recycle();
        hmb hmbVar = hmb.a;
        this.d = new hmb(color, true, false, ghw.b, null, false, 0);
        this.o = true;
    }

    public final void a(geu geuVar, fvv fvvVar, hls hlsVar) {
        geu geuVar2;
        int iE;
        CarColor tint;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        ghv ghvVar = ghv.a;
        hlv hlvVar = hlv.a;
        hlu hluVar = new hlu();
        hluVar.a = ghvVar;
        hlv hlvVarA = hluVar.a();
        CarColor carColor = fvvVar.d;
        if (carColor == null || !hlsVar.a) {
            geuVar2 = geuVar;
            ((ype) ((ype) b.h()).ai((char) 2916)).u("Background color on the Action is expected but not set");
        } else {
            geuVar2 = geuVar;
            setBackgroundTintList(ColorStateList.valueOf(gbt.k(geuVar2, carColor, !leh.a().b() || olm.b(geuVar), leh.a().b() ? this.j : this.e, ghvVar, 0)));
        }
        if (this.n) {
            if (carColor == null) {
                iE = this.f;
            } else {
                boolean zB = leh.a().b() ? olm.b(geuVar2) : true;
                int i = this.e;
                int iK = gbt.k(geuVar2, carColor, zB, i, ghvVar, 0);
                gcs gcsVar = fvvVar.g;
                if (iK == i || gcsVar == null) {
                    iE = this.f;
                    break loop0;
                }
                CarText carTextA = gcs.a(gcsVar);
                if (carTextA == null) {
                    carTextA = new CarText.Builder("").build();
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(carTextA.toCharSequence());
                arrayList.addAll(carTextA.getVariants());
                int size = arrayList.size();
                loop0: for (int i2 = 0; i2 < size; i2++) {
                    CharSequence charSequence = (CharSequence) arrayList.get(i2);
                    if (charSequence instanceof Spanned) {
                        Spanned spanned = (Spanned) charSequence;
                        for (Object obj : spanned.getSpans(0, spanned.length(), Object.class)) {
                            if (((obj instanceof ForegroundCarColorSpan) && !gbt.l(geuVar2, ((ForegroundCarColorSpan) obj).getColor(), iK)) || ((obj instanceof CarIconSpan) && (tint = ((CarIconSpan) obj).getIcon().getTint()) != null && !gbt.l(geuVar2, tint, iK))) {
                                iE = this.f;
                                break loop0;
                            }
                        }
                    }
                }
                iE = dvd.e(-16777216, 128);
            }
            ((ClipDrawable) ((LayerDrawable) findViewById(R.id.action_button_with_timer).getBackground()).findDrawableByLayerId(R.id.clip_drawable)).setTint(iE);
        }
        this.c.removeAllViews();
        gcs gcsVar2 = fvvVar.g;
        CharSequence charSequenceE = hlb.e(geuVar2, gcs.a(gcsVar2), hlvVarA, -1);
        CarIcon carIconI = hbz.i(fvvVar);
        boolean z = charSequenceE.length() > 0;
        setMinimumWidth(z ? this.k : this.l);
        if (carIconI != null) {
            layoutInflaterFrom.inflate(R.layout.action_button_view_icon, this.c);
            ImageView imageView = (ImageView) this.c.findViewById(R.id.action_icon);
            if (z) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) imageView.getLayoutParams();
                layoutParams.setMarginStart(getResources().getDimensionPixelSize(R.dimen.template_padding_3));
                imageView.setLayoutParams(layoutParams);
            }
            if (leh.a().b() && carIconI.getTint() == null && carIconI.getIcon() != null && carIconI.getIcon().b() == 2) {
                IconCompat icon = carIconI.getIcon();
                icon.getClass();
                tj tjVar = new tj(icon);
                int i3 = this.i;
                tjVar.a(CarColor.createCustom(i3, i3));
                carIconI = new CarIcon(tjVar);
            }
            hbz.j(geuVar2, carIconI, imageView, this.d);
        }
        if (geuVar2.i().c() >= 5 && !fvvVar.b) {
            this.o = false;
            setBackgroundTintList(ColorStateList.valueOf(this.g));
        }
        if (z) {
            layoutInflaterFrom.inflate(carIconI != null ? R.layout.action_button_view_text : R.layout.action_button_view_text_no_icon, this.c);
            CarTextView carTextView = (CarTextView) this.c.findViewById(R.id.action_text);
            int i4 = this.m;
            if (i4 > 0) {
                carTextView.setMaxEms(i4);
            }
            carTextView.b(geuVar2, gcs.a(gcsVar2), hlvVarA);
            if (leh.a().b()) {
                carTextView.setTextColor(this.i);
            }
            if (!this.o) {
                carTextView.setTextColor(this.h);
            }
        }
        byte[] bArr = null;
        if (fvvVar.f != null) {
            setOnClickListener(new ie(fvvVar, 18, bArr));
        } else {
            setOnClickListener(null);
        }
        if (this.o) {
            return;
        }
        setOnClickListener(null);
        setFocusable(false);
        setClickable(false);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.c = (LinearLayout) findViewById(R.id.action_container);
    }

    public ActionButtonView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionButtonView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public ActionButtonView(Context context) {
        this(context, null);
    }
}
