package f8;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.wynauto.wyn.R;
import java.util.WeakHashMap;
import k1.S;
import md.J;
import q.Y;

/* loaded from: classes4.dex */
public final class v extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f35227a;

    /* renamed from: b, reason: collision with root package name */
    public final Y f35228b;

    /* renamed from: c, reason: collision with root package name */
    public CharSequence f35229c;

    /* renamed from: d, reason: collision with root package name */
    public final CheckableImageButton f35230d;

    /* renamed from: e, reason: collision with root package name */
    public ColorStateList f35231e;

    /* renamed from: f, reason: collision with root package name */
    public PorterDuff.Mode f35232f;

    /* renamed from: g, reason: collision with root package name */
    public int f35233g;

    /* renamed from: h, reason: collision with root package name */
    public ImageView.ScaleType f35234h;

    /* renamed from: i, reason: collision with root package name */
    public View.OnLongClickListener f35235i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f35236j;

    public v(TextInputLayout textInputLayout, J j8) {
        CharSequence text;
        super(textInputLayout.getContext());
        this.f35227a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.f35230d = checkableImageButton;
        Y y10 = new Y(getContext(), null);
        this.f35228b = y10;
        if (Ba.c.F(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        View.OnLongClickListener onLongClickListener = this.f35235i;
        checkableImageButton.setOnClickListener(null);
        gc.b.H(checkableImageButton, onLongClickListener);
        this.f35235i = null;
        checkableImageButton.setOnLongClickListener(null);
        gc.b.H(checkableImageButton, null);
        TypedArray typedArray = (TypedArray) j8.f40581b;
        if (typedArray.hasValue(67)) {
            this.f35231e = Ba.c.x(getContext(), j8, 67);
        }
        if (typedArray.hasValue(68)) {
            this.f35232f = W7.k.g(typedArray.getInt(68, -1), null);
        }
        if (typedArray.hasValue(64)) {
            a(j8.n(64));
            if (typedArray.hasValue(63) && checkableImageButton.getContentDescription() != (text = typedArray.getText(63))) {
                checkableImageButton.setContentDescription(text);
            }
            checkableImageButton.setCheckable(typedArray.getBoolean(62, true));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(65, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.f35233g) {
            this.f35233g = dimensionPixelSize;
            checkableImageButton.setMinimumWidth(dimensionPixelSize);
            checkableImageButton.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(66)) {
            ImageView.ScaleType scaleTypeM = gc.b.m(typedArray.getInt(66, -1));
            this.f35234h = scaleTypeM;
            checkableImageButton.setScaleType(scaleTypeM);
        }
        y10.setVisibility(8);
        y10.setId(R.id.textinput_prefix_text);
        y10.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        WeakHashMap weakHashMap = S.f38779a;
        y10.setAccessibilityLiveRegion(1);
        y10.setTextAppearance(typedArray.getResourceId(58, 0));
        if (typedArray.hasValue(59)) {
            y10.setTextColor(j8.m(59));
        }
        CharSequence text2 = typedArray.getText(57);
        this.f35229c = TextUtils.isEmpty(text2) ? null : text2;
        y10.setText(text2);
        d();
        addView(checkableImageButton);
        addView(y10);
    }

    public final void a(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f35230d;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.f35231e;
            PorterDuff.Mode mode = this.f35232f;
            TextInputLayout textInputLayout = this.f35227a;
            gc.b.e(textInputLayout, checkableImageButton, colorStateList, mode);
            b(true);
            gc.b.D(textInputLayout, checkableImageButton, this.f35231e);
            return;
        }
        b(false);
        View.OnLongClickListener onLongClickListener = this.f35235i;
        checkableImageButton.setOnClickListener(null);
        gc.b.H(checkableImageButton, onLongClickListener);
        this.f35235i = null;
        checkableImageButton.setOnLongClickListener(null);
        gc.b.H(checkableImageButton, null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription(null);
        }
    }

    public final void b(boolean z2) {
        CheckableImageButton checkableImageButton = this.f35230d;
        if ((checkableImageButton.getVisibility() == 0) != z2) {
            checkableImageButton.setVisibility(z2 ? 0 : 8);
            c();
            d();
        }
    }

    public final void c() throws Resources.NotFoundException {
        int paddingStart;
        EditText editText = this.f35227a.f27043d;
        if (editText == null) {
            return;
        }
        if (this.f35230d.getVisibility() == 0) {
            paddingStart = 0;
        } else {
            WeakHashMap weakHashMap = S.f38779a;
            paddingStart = editText.getPaddingStart();
        }
        int compoundPaddingTop = editText.getCompoundPaddingTop();
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int compoundPaddingBottom = editText.getCompoundPaddingBottom();
        WeakHashMap weakHashMap2 = S.f38779a;
        this.f35228b.setPaddingRelative(paddingStart, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
    }

    public final void d() {
        int i5 = (this.f35229c == null || this.f35236j) ? 8 : 0;
        setVisibility((this.f35230d.getVisibility() == 0 || i5 == 0) ? 0 : 8);
        this.f35228b.setVisibility(i5);
        this.f35227a.p();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i5, int i10) throws Resources.NotFoundException {
        super.onMeasure(i5, i10);
        c();
    }
}
