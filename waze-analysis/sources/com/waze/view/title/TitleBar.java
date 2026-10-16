package com.waze.view.title;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import com.waze.R;
import com.waze.sharedui.views.OvalButton;
import com.waze.sharedui.views.WazeTextView;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class TitleBar extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    private final WazeTextView f45396a;

    /* renamed from: b, reason: collision with root package name */
    private String f45397b;

    /* renamed from: c, reason: collision with root package name */
    private final ImageButton f45398c;

    /* renamed from: d, reason: collision with root package name */
    private final WazeTextView f45399d;

    /* renamed from: e, reason: collision with root package name */
    private final OvalButton f45400e;

    /* renamed from: f, reason: collision with root package name */
    private final ImageButton f45401f;

    /* renamed from: g, reason: collision with root package name */
    private View.OnClickListener f45402g;

    /* renamed from: h, reason: collision with root package name */
    private View.OnClickListener f45403h;

    /* renamed from: i, reason: collision with root package name */
    private int f45404i;

    public TitleBar(Context context, AttributeSet attributeSet) {
        int resourceId;
        super(context, attributeSet);
        this.f45397b = null;
        this.f45402g = null;
        this.f45403h = null;
        int i2 = 0;
        this.f45404i = 0;
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService("layout_inflater");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.TitleBar);
        layoutInflater.inflate(R.layout.title_bar, this);
        setElevation(getResources().getDimension(R.dimen.card_elevation_2));
        if (super.getBackground() == null) {
            setBackgroundResource(R.color.background_default);
        }
        WazeTextView wazeTextView = (WazeTextView) findViewById(R.id.titleBarTitleText);
        this.f45396a = wazeTextView;
        if (attributeSet != null && (resourceId = typedArrayObtainStyledAttributes.getResourceId(1, 0)) != 0) {
            this.f45397b = com.waze.shared_infra.o.b.a().c(resourceId, new Object[0]);
        }
        this.f45404i = typedArrayObtainStyledAttributes.getInt(3, 0);
        int integer = typedArrayObtainStyledAttributes.getInteger(2, 1);
        String str = this.f45397b;
        if (str != null) {
            wazeTextView.setText(str);
        }
        boolean z = typedArrayObtainStyledAttributes.getBoolean(R.styleable.TitleBar_statusBarPaddingEnabled, true);
        wazeTextView.setGravity(integer == 0 ? GravityCompat.START : 17);
        ImageButton imageButton = (ImageButton) findViewById(R.id.titleBarCloseButton);
        this.f45398c = imageButton;
        this.f45399d = (WazeTextView) findViewById(R.id.titleBarCloseButtonText);
        OvalButton ovalButton = (OvalButton) findViewById(R.id.titleBarCloseButtonWithText);
        this.f45400e = ovalButton;
        ImageButton imageButton2 = (ImageButton) findViewById(R.id.titleBarCloseButtonFake);
        this.f45401f = imageButton2;
        imageButton.setOnClickListener(new b(this, 1, (byte[]) null));
        ovalButton.setOnClickListener(new b(this, 0));
        imageButton2.setOnClickListener(new b(this, 2, (char[]) null));
        s();
        if (z) {
            ViewCompat.setOnApplyWindowInsetsListener(this, new a(i2));
        }
    }

    private final void s() {
        int i2 = this.f45404i;
        if (i2 == 0) {
            ImageButton imageButton = this.f45398c;
            imageButton.setVisibility(0);
            WazeTextView wazeTextView = this.f45399d;
            wazeTextView.setVisibility(8);
            if (imageButton.getVisibility() == 0) {
                wazeTextView.setText((CharSequence) null);
            }
            this.f45400e.setVisibility(8);
            imageButton.setImageResource(R.drawable.close_outline_24px);
        } else if (i2 != 1) {
            com.waze.shared_infra.i.a.b().b("Undefined TitleBar type");
        } else {
            ImageButton imageButton2 = this.f45398c;
            imageButton2.setVisibility(8);
            WazeTextView wazeTextView2 = this.f45399d;
            wazeTextView2.setVisibility(0);
            this.f45400e.setVisibility(0);
            if (wazeTextView2.getVisibility() == 0) {
                imageButton2.setImageResource(0);
            }
        }
        setPadding(0, 0, 0, 0);
    }

    public final void c(String str) {
        d(str, null);
    }

    public final void d(String str, String str2) {
        WazeTextView wazeTextView = this.f45396a;
        if (wazeTextView != null && str != null) {
            wazeTextView.setText(str);
            wazeTextView.setVisibility(0);
        }
        if (this.f45398c.getVisibility() != 0 || str2 == null || str2.length() <= 0) {
            return;
        }
        i(str2);
    }

    public final void e(String str, boolean z) {
        l(z);
        c(str);
    }

    public final void f(boolean z) {
        this.f45401f.setVisibility(true != z ? 8 : 0);
    }

    public final void g(boolean z) {
        this.f45400e.setEnabled(!z);
    }

    public final void h(int i2) {
        ImageButton imageButton = this.f45398c;
        imageButton.setVisibility(0);
        this.f45399d.setVisibility(8);
        imageButton.setImageResource(i2);
    }

    public final void i(String str) {
        if (str == null) {
            this.f45404i = 0;
            s();
        } else {
            this.f45404i = 1;
            s();
            this.f45399d.setText(str);
        }
    }

    public final void j(int i2) {
        this.f45400e.bz(i2);
    }

    public final void k(int i2) {
        this.f45399d.setTextColor(i2);
    }

    public final void l(boolean z) {
        if (z) {
            if (this.f45404i == 1) {
                this.f45400e.setVisibility(0);
                return;
            } else {
                this.f45398c.setVisibility(0);
                return;
            }
        }
        ImageButton imageButton = this.f45398c;
        imageButton.setVisibility(4);
        imageButton.setOnClickListener(null);
        this.f45400e.setVisibility(8);
    }

    public final void m(View.OnClickListener onClickListener) {
        this.f45403h = onClickListener;
    }

    public final void n(View.OnClickListener onClickListener) {
        this.f45402g = onClickListener;
    }

    public final void o(int i2) {
        this.f45396a.setTextColor(ColorStateList.valueOf(i2));
    }

    public final void p(String str) {
        WazeTextView wazeTextView = this.f45396a;
        if (wazeTextView != null) {
            wazeTextView.setVisibility(0);
            wazeTextView.setText(str);
        }
    }

    public final void q() {
        WazeTextView wazeTextView = this.f45396a;
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) wazeTextView.getLayoutParams();
        layoutParams.addRule(1, R.id.titleBarCloseButtonFake);
        wazeTextView.setGravity(19);
        wazeTextView.setLayoutParams(layoutParams);
        wazeTextView.setTextSize(1, 27.0f);
        wazeTextView.setTextColor(getResources().getColor(R.color.content_default));
    }

    public final void r() {
        this.f45401f.setVisibility(8);
        setPadding(0, 0, 0, 0);
    }
}
