package com.waze.navbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.waze.R;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class InstructionView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private final ImageView f30867a;

    /* renamed from: b, reason: collision with root package name */
    private final TextView f30868b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstructionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        x.f(context, "context");
        Object systemService = context.getSystemService("layout_inflater");
        x.d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        ((LayoutInflater) systemService).inflate(R.layout.instruction_view, this);
        View viewFindViewById = findViewById(R.id.navBarDirection);
        x.e(viewFindViewById, "findViewById(...)");
        this.f30867a = (ImageView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.navBarDirectionText);
        x.e(viewFindViewById2, "findViewById(...)");
        this.f30868b = (TextView) viewFindViewById2;
    }

    public final void a(Integer num) {
        if (num != null) {
            this.f30867a.setImageResource(num.intValue());
        }
    }

    public final void b(String str) {
        this.f30868b.setText(str);
    }

    public final void c(float f2) {
        this.f30868b.setTextSize(1, f2);
    }

    @Override // android.view.View
    public final void postInvalidate() {
        this.f30867a.postInvalidate();
    }

    @Override // android.view.View
    public final void setPadding(int i2, int i3, int i4, int i5) {
        this.f30867a.setPadding(i2, i3, i4, i5);
    }

    public /* synthetic */ InstructionView(Context context, AttributeSet attributeSet, int i2, h.g.b.o oVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet);
    }
}
