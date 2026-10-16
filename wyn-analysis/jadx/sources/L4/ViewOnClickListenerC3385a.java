package l4;

import android.view.View;
import android.widget.CompoundButton;
import androidx.recyclerview.widget.m0;
import com.wynauto.wyn.R;

/* renamed from: l4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC3385a extends m0 implements View.OnClickListener, View.OnLongClickListener {

    /* renamed from: c, reason: collision with root package name */
    public final CompoundButton f39944c;

    /* renamed from: d, reason: collision with root package name */
    public final C3386b f39945d;

    public ViewOnClickListenerC3385a(View view, C3386b c3386b) {
        super(view);
        this.f39944c = (CompoundButton) view.findViewById(R.id.md_control);
        this.f39945d = c3386b;
        view.setOnClickListener(this);
        c3386b.f39946i.f39988c.getClass();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C3386b c3386b = this.f39945d;
        if (c3386b.k == null || getAdapterPosition() == -1) {
            return;
        }
        c3386b.f39946i.f39988c.getClass();
        c3386b.k.b(view, getAdapterPosition(), false);
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        C3386b c3386b = this.f39945d;
        if (c3386b.k == null || getAdapterPosition() == -1) {
            return false;
        }
        c3386b.f39946i.f39988c.getClass();
        return c3386b.k.b(view, getAdapterPosition(), true);
    }
}
