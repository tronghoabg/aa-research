package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class occ extends obw {
    public static final /* synthetic */ int c = 0;
    private final CharSequence d;
    private final Drawable e;
    private eqn f;

    public occ(CharSequence charSequence, Drawable drawable) {
        this.d = charSequence;
        this.e = drawable;
    }

    @Override // defpackage.obw
    protected final View c(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        Context context = viewGroup.getContext();
        TextView textView = new TextView(context);
        textView.setText(this.d);
        leh.a();
        textView.setTextAppearance(R.style.TextAppearance_Gearhead_Tooltip);
        leh.a();
        this.f = new jue(textView, context, 11);
        ksa.d().e.i(this.f);
        textView.setGravity(16);
        Drawable drawable = this.e;
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        textView.setCompoundDrawablePadding(context.getResources().getDimensionPixelOffset(R.dimen.gearhead_tooltip_text_graphic_padding));
        layoutParams.height = -2;
        layoutParams.width = -2;
        textView.setMaxWidth(context.getResources().getDimensionPixelSize(drawable == null ? R.dimen.gearhead_tooltip_text_only_max_width : R.dimen.gearhead_tooltip_text_graphic_max_width));
        return textView;
    }

    @Override // defpackage.obw, defpackage.ocx
    public final void e() {
        ksa.d().e.k(this.a);
        ksa.d().e.k(this.f);
    }
}
