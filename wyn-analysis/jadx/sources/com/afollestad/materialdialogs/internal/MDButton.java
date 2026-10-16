package com.afollestad.materialdialogs.internal;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.TextView;
import com.wynauto.wyn.R;
import l4.EnumC3388d;

/* loaded from: classes.dex */
public class MDButton extends TextView {

    /* renamed from: a, reason: collision with root package name */
    public boolean f19945a;

    /* renamed from: b, reason: collision with root package name */
    public EnumC3388d f19946b;

    /* renamed from: c, reason: collision with root package name */
    public final int f19947c;

    /* renamed from: d, reason: collision with root package name */
    public Drawable f19948d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f19949e;

    public MDButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f19945a = false;
        this.f19947c = context.getResources().getDimensionPixelSize(R.dimen.md_dialog_frame_margin);
        this.f19946b = EnumC3388d.f39954c;
    }

    public final void a(boolean z2, boolean z10) {
        int iOrdinal;
        if (this.f19945a != z2 || z10) {
            setGravity(z2 ? this.f19946b.a() | 16 : 17);
            int i5 = 4;
            if (z2 && (iOrdinal = this.f19946b.ordinal()) != 1) {
                i5 = iOrdinal != 2 ? 5 : 6;
            }
            setTextAlignment(i5);
            setBackground(z2 ? this.f19948d : this.f19949e);
            if (z2) {
                setPadding(this.f19947c, getPaddingTop(), this.f19947c, getPaddingBottom());
            }
            this.f19945a = z2;
        }
    }

    public void setAllCapsCompat(boolean z2) {
        setAllCaps(z2);
    }

    public void setDefaultSelector(Drawable drawable) {
        this.f19949e = drawable;
        if (this.f19945a) {
            return;
        }
        a(false, true);
    }

    public void setStackedGravity(EnumC3388d enumC3388d) {
        this.f19946b = enumC3388d;
    }

    public void setStackedSelector(Drawable drawable) {
        this.f19948d = drawable;
        if (this.f19945a) {
            a(true, true);
        }
    }
}
