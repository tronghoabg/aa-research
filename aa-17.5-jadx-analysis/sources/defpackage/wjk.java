package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.material.card.MaterialCardView;
import com.google.android.projection.gearhead.R;
import java.text.NumberFormat;

/* loaded from: classes3.dex */
public final class wjk extends LinearLayout {
    public static final /* synthetic */ int b = 0;
    private static final yfq c = yfq.u(Integer.valueOf(R.drawable.very_dissatisfied), Integer.valueOf(R.drawable.dissatisfied), Integer.valueOf(R.drawable.neutral), Integer.valueOf(R.drawable.satisfied), Integer.valueOf(R.drawable.very_satisfied));
    public wjj a;
    private abyv d;

    public wjk(Context context) {
        super(context);
        setOrientation(1);
        LayoutInflater.from(context).inflate(R.layout.survey_question_rating_container, (ViewGroup) this, true);
    }

    public static void b(ViewGroup viewGroup) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            viewGroup.getChildAt(i).setOnClickListener(null);
            viewGroup.getChildAt(i).setClickable(false);
        }
    }

    public static void c(ViewGroup viewGroup, int i, Drawable drawable, Drawable drawable2) {
        int i2 = 0;
        while (i2 < viewGroup.getChildCount()) {
            ((ImageView) viewGroup.getChildAt(i2).findViewById(R.id.survey_rating_image_icon)).setImageDrawable(i2 >= i ? drawable : drawable2);
            i2++;
        }
    }

    public static boolean e(MotionEvent motionEvent, View view) {
        return motionEvent.getX() >= BitmapDescriptorFactory.HUE_RED && motionEvent.getX() < ((float) view.getWidth()) && motionEvent.getY() >= BitmapDescriptorFactory.HUE_RED && motionEvent.getY() < ((float) view.getHeight());
    }

    private final Drawable f(int i, int i2) {
        return vuf.F(getContext().getDrawable(i), getContext(), i2);
    }

    private static void g(TextView textView, String str) {
        textView.setText(str);
        textView.setContentDescription(str);
    }

    private final void h(View view, int i, int i2, int i3) throws Resources.NotFoundException {
        NumberFormat numberFormat = NumberFormat.getInstance(getContext().getResources().getConfiguration().getLocales().get(0));
        String str = numberFormat.format(i);
        String str2 = numberFormat.format(i2);
        String string = getContext().getString(R.string.survey_num_rating, str, str2);
        if (i3 == 4) {
            string = getResources().getQuantityString(R.plurals.survey_star_rating, i, Integer.valueOf(i), Integer.valueOf(i2));
            i3 = 4;
        }
        if (i == 1) {
            string = string + " " + this.d.e;
        } else if (i == i2) {
            string = string + " " + this.d.f;
        }
        if (i3 == 3) {
            string = getContext().getString(R.string.survey_smiley_rating, str, str2, i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "" : getContext().getString(R.string.survey_very_satisfied) : getContext().getString(R.string.survey_somewhat_satisfied) : getContext().getString(R.string.survey_neutral) : getContext().getString(R.string.survey_somewhat_dissatisfied) : getContext().getString(R.string.survey_very_dissatisfied));
        }
        view.setContentDescription(string);
    }

    public final int a(int i) {
        return getContext().getColor(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(abyv abyvVar) throws Resources.NotFoundException {
        this.d = abyvVar;
        int i = abyvVar.c;
        final int i2 = 2;
        if (i < 2 || i > 7) {
            throw new IllegalArgumentException("Number of ratings must be between 2 and 7.");
        }
        int iAx = a.ax(abyvVar.b);
        if (iAx == 0 || iAx != 6) {
            g((TextView) findViewById(R.id.survey_rating_low_value_text), abyvVar.e);
            g((TextView) findViewById(R.id.survey_rating_high_value_text), abyvVar.f);
        }
        int i3 = abyvVar.b;
        int iAx2 = a.ax(i3);
        int i4 = R.id.survey_rating_image_icon;
        int i5 = R.id.survey_rating_image_layout;
        int i6 = R.layout.survey_question_rating_image_item;
        int i7 = -2;
        int i8 = R.color.survey_grey_icon_color;
        final int i9 = 1;
        final int i10 = 0;
        if (iAx2 != 0 && iAx2 == 3) {
            final ViewGroup viewGroup = (ViewGroup) findViewById(R.id.survey_rating_images_container);
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
            yfq yfqVar = c;
            int i11 = ((yls) yfqVar).c;
            final int i12 = 0;
            while (i12 < i11) {
                View viewInflate = layoutInflaterFrom.inflate(i6, viewGroup, false);
                if (i12 == 0) {
                    viewInflate.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                    i12 = 0;
                }
                FrameLayout frameLayout = (FrameLayout) viewInflate.findViewById(i5);
                ImageView imageView = (ImageView) frameLayout.findViewById(i4);
                imageView.setImageDrawable(vuf.F(getContext().getDrawable(((Integer) yfqVar.get(i12)).intValue()), getContext(), a(i8)));
                i12++;
                imageView.setTag(Integer.valueOf(i12));
                h(imageView, i12, i11, 3);
                frameLayout.setOnTouchListener(new wjg(this, frameLayout, imageView, i10));
                frameLayout.setOnClickListener(new View.OnClickListener(this) { // from class: wjh
                    public final /* synthetic */ wjk a;

                    {
                        this.a = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i13 = i10;
                        if (i13 == 0) {
                            wjk.b(viewGroup);
                            new Handler().postDelayed(new rgm(this.a, i12, 13, null), 250L);
                            return;
                        }
                        ViewGroup viewGroup2 = viewGroup;
                        if (i13 != 1) {
                            wjk.b(viewGroup2);
                            new Handler().postDelayed(new rgm(this.a, i12, 11, null), 250L);
                            return;
                        }
                        wjk.b(viewGroup2);
                        new Handler().postDelayed(new rgm(this.a, i12, 12, null), 250L);
                    }
                });
                viewGroup.addView(viewInflate);
                i4 = R.id.survey_rating_image_icon;
                i5 = R.id.survey_rating_image_layout;
                i6 = R.layout.survey_question_rating_image_item;
                i8 = R.color.survey_grey_icon_color;
            }
            return;
        }
        int iAx3 = a.ax(i3);
        if (iAx3 != 0 && iAx3 == 5) {
            final ViewGroup viewGroup2 = (ViewGroup) findViewById(R.id.survey_rating_images_container);
            LayoutInflater layoutInflaterFrom2 = LayoutInflater.from(getContext());
            int i13 = this.d.c;
            final int i14 = 0;
            while (i14 < i13) {
                View viewInflate2 = layoutInflaterFrom2.inflate(R.layout.survey_question_rating_number_item, viewGroup2, false);
                if (i14 == 0) {
                    viewInflate2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                    i14 = 0;
                }
                final FrameLayout frameLayout2 = (FrameLayout) viewInflate2.findViewById(R.id.survey_rating_number_layout);
                int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.survey_rating_number_large_button_horizontal_padding);
                viewGroup2.setPadding(dimensionPixelOffset, 0, dimensionPixelOffset, 0);
                final MaterialCardView materialCardView = (MaterialCardView) frameLayout2.findViewById(R.id.survey_rating_number_card);
                int dimension = (int) getResources().getDimension(R.dimen.survey_rating_number_large_side_length);
                ViewGroup.LayoutParams layoutParams = materialCardView.getLayoutParams();
                layoutParams.width = dimension;
                layoutParams.height = dimension;
                materialCardView.setLayoutParams(layoutParams);
                final TextView textView = (TextView) materialCardView.findViewById(R.id.survey_rating_number_text);
                i14++;
                textView.setTag(Integer.valueOf(i14));
                textView.setText(String.valueOf(i14));
                h(textView, i14, i13, 5);
                frameLayout2.setOnTouchListener(new View.OnTouchListener() { // from class: wjf
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        FrameLayout frameLayout3 = frameLayout2;
                        wjk wjkVar = this.a;
                        MaterialCardView materialCardView2 = materialCardView;
                        TextView textView2 = textView;
                        int action = motionEvent.getAction();
                        if (action == 0) {
                            if (!wjk.e(motionEvent, view)) {
                                return true;
                            }
                            frameLayout3.setPressed(true);
                            materialCardView2.fB(wjkVar.a(R.color.survey_accent_color));
                            textView2.setTextColor(wjkVar.a(R.color.survey_surface_color_elevation_2));
                            return true;
                        }
                        if (action == 1) {
                            if (!frameLayout3.isPressed()) {
                                return true;
                            }
                            frameLayout3.performClick();
                            return true;
                        }
                        if (action != 2) {
                            return false;
                        }
                        if (wjk.e(motionEvent, view)) {
                            return true;
                        }
                        frameLayout3.setPressed(false);
                        materialCardView2.fB(wjkVar.a(R.color.google_transparent));
                        textView2.setTextColor(wjkVar.a(R.color.survey_primary_text_color));
                        return true;
                    }
                });
                frameLayout2.setOnClickListener(new View.OnClickListener(this) { // from class: wjh
                    public final /* synthetic */ wjk a;

                    {
                        this.a = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i132 = i9;
                        if (i132 == 0) {
                            wjk.b(viewGroup2);
                            new Handler().postDelayed(new rgm(this.a, i14, 13, null), 250L);
                            return;
                        }
                        ViewGroup viewGroup22 = viewGroup2;
                        if (i132 != 1) {
                            wjk.b(viewGroup22);
                            new Handler().postDelayed(new rgm(this.a, i14, 11, null), 250L);
                            return;
                        }
                        wjk.b(viewGroup22);
                        new Handler().postDelayed(new rgm(this.a, i14, 12, null), 250L);
                    }
                });
                viewGroup2.addView(viewInflate2);
            }
            return;
        }
        int iAx4 = a.ax(i3);
        if (iAx4 == 0 || iAx4 != 4) {
            int iAx5 = a.ax(i3);
            if (iAx5 != 0 && iAx5 == 6) {
                int iA = a(R.color.survey_grey_icon_color);
                Drawable drawableF = f(2131233640, iA);
                Drawable drawableF2 = f(2131233635, iA);
                LinearLayout linearLayout = (LinearLayout) findViewById(R.id.survey_rating_images_container);
                linearLayout.setGravity(17);
                View viewInflate3 = LayoutInflater.from(getContext()).inflate(R.layout.survey_question_rating_thumb_item, (ViewGroup) linearLayout, false);
                ImageView imageView2 = (ImageView) viewInflate3.findViewById(R.id.survey_rating_thumb_up_icon);
                imageView2.setImageDrawable(drawableF);
                imageView2.setContentDescription(this.d.e);
                imageView2.setOnClickListener(new sqd(this, linearLayout, 8));
                ImageView imageView3 = (ImageView) viewInflate3.findViewById(R.id.survey_rating_thumb_down_icon);
                imageView3.setImageDrawable(drawableF2);
                imageView3.setContentDescription(this.d.f);
                imageView3.setOnClickListener(new sqd(this, linearLayout, 9));
                linearLayout.addView(viewInflate3);
                return;
            }
            return;
        }
        int iA2 = a(R.color.survey_accent_color);
        Drawable drawableF3 = f(2131233619, a(R.color.survey_grey_icon_color));
        final Drawable drawableF4 = f(2131233620, iA2);
        final ViewGroup viewGroup3 = (ViewGroup) findViewById(R.id.survey_rating_images_container);
        LayoutInflater layoutInflaterFrom3 = LayoutInflater.from(getContext());
        int i15 = this.d.c;
        final int i16 = 0;
        while (i16 < i15) {
            View viewInflate4 = layoutInflaterFrom3.inflate(R.layout.survey_question_rating_image_item, viewGroup3, false);
            if (i16 == 0) {
                viewInflate4.setLayoutParams(new LinearLayout.LayoutParams(i7, i7));
                i16 = 0;
            }
            final FrameLayout frameLayout3 = (FrameLayout) viewInflate4.findViewById(R.id.survey_rating_image_layout);
            int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(R.dimen.survey_rating_image_large_button_horizontal_padding);
            viewGroup3.setPadding(dimensionPixelOffset2, 0, dimensionPixelOffset2, 0);
            ImageView imageView4 = (ImageView) frameLayout3.findViewById(R.id.survey_rating_image_icon);
            imageView4.setImageDrawable(drawableF3);
            i16++;
            imageView4.setTag(Integer.valueOf(i16));
            h(imageView4, i16, i15, 4);
            final Drawable drawable = drawableF3;
            frameLayout3.setOnTouchListener(new View.OnTouchListener() { // from class: wji
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    int i17 = wjk.b;
                    ViewGroup viewGroup4 = viewGroup3;
                    FrameLayout frameLayout4 = frameLayout3;
                    int i18 = i16;
                    Drawable drawable2 = drawable;
                    int action = motionEvent.getAction();
                    Drawable drawable3 = drawableF4;
                    if (action == 0) {
                        if (!wjk.e(motionEvent, view)) {
                            return true;
                        }
                        frameLayout4.setPressed(true);
                        wjk.c(viewGroup4, i18, drawable2, drawable3);
                        return true;
                    }
                    if (action == 1) {
                        if (!frameLayout4.isPressed()) {
                            return true;
                        }
                        frameLayout4.performClick();
                        wjk.c(viewGroup4, i18, drawable2, drawable3);
                        return true;
                    }
                    if (action != 2) {
                        return false;
                    }
                    if (wjk.e(motionEvent, view)) {
                        return true;
                    }
                    frameLayout4.setPressed(false);
                    wjk.c(viewGroup4, 0, drawable2, drawable3);
                    return true;
                }
            });
            frameLayout3.setOnClickListener(new View.OnClickListener(this) { // from class: wjh
                public final /* synthetic */ wjk a;

                {
                    this.a = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i132 = i2;
                    if (i132 == 0) {
                        wjk.b(viewGroup3);
                        new Handler().postDelayed(new rgm(this.a, i16, 13, null), 250L);
                        return;
                    }
                    ViewGroup viewGroup22 = viewGroup3;
                    if (i132 != 1) {
                        wjk.b(viewGroup22);
                        new Handler().postDelayed(new rgm(this.a, i16, 11, null), 250L);
                        return;
                    }
                    wjk.b(viewGroup22);
                    new Handler().postDelayed(new rgm(this.a, i16, 12, null), 250L);
                }
            });
            viewGroup3.addView(viewInflate4);
            drawableF3 = drawable;
            i7 = -2;
        }
    }
}
