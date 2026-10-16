package com.waze.design_components.header_view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.waze.R;
import com.waze.design_components.b.d;
import com.waze.design_components.b.e;
import com.waze.design_components.button.WazeButton;
import com.waze.design_components.button.WazeIconButton;
import com.waze.design_components.text_view.WazeTextView;
import com.waze.x.g;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class WazeHeaderView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private final WazeIconButton f23468a;

    /* renamed from: b, reason: collision with root package name */
    private final WazeButton f23469b;

    /* renamed from: c, reason: collision with root package name */
    private final WazeIconButton f23470c;

    /* renamed from: d, reason: collision with root package name */
    private final WazeTextView f23471d;

    /* renamed from: e, reason: collision with root package name */
    private final View f23472e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WazeHeaderView(Context context, AttributeSet attributeSet, int i2) {
        a aVar;
        super(context, attributeSet, i2);
        x.f(context, "context");
        View viewInflate = FrameLayout.inflate(context, R.layout.waze_header_view_layout, this);
        View viewFindViewById = findViewById(R.id.headerViewRightIconButton);
        x.e(viewFindViewById, "findViewById(...)");
        WazeIconButton wazeIconButton = (WazeIconButton) viewFindViewById;
        this.f23468a = wazeIconButton;
        View viewFindViewById2 = findViewById(R.id.headerViewRightButton);
        x.e(viewFindViewById2, "findViewById(...)");
        this.f23469b = (WazeButton) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.headerViewBackIconButton);
        x.e(viewFindViewById3, "findViewById(...)");
        this.f23470c = (WazeIconButton) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.headerViewTitle);
        x.e(viewFindViewById4, "findViewById(...)");
        this.f23471d = (WazeTextView) viewFindViewById4;
        View viewFindViewById5 = findViewById(R.id.headerViewMainRightContainer);
        x.e(viewFindViewById5, "findViewById(...)");
        this.f23472e = viewFindViewById5;
        ViewCompat.setOnApplyWindowInsetsListener(viewInflate, new OnApplyWindowInsetsListener() { // from class: com.waze.design_components.header_view.b
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                WazeHeaderView wazeHeaderView = this.f23478a;
                Insets insets = windowInsetsCompat.getInsets(1);
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.height = (int) (wazeHeaderView.getResources().getDimension(R.dimen.header_view_height) + Math.abs(insets.bottom - insets.top));
                view.setLayoutParams(layoutParams);
                return WindowInsetsCompat.CONSUMED;
            }
        });
        int[] iArr = com.waze.design_components.a.f23284c;
        x.e(iArr, "WazeHeaderView");
        int i3 = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        int i4 = typedArrayObtainStyledAttributes.getInt(3, d.n.a());
        int i5 = typedArrayObtainStyledAttributes.getInt(4, e.f23312a.a());
        a aVar2 = a.f23473a;
        int i6 = typedArrayObtainStyledAttributes.getInt(2, aVar2.a());
        String string = typedArrayObtainStyledAttributes.getString(0);
        d dVarH = g.h(i4);
        e eVarG = g.g(i5);
        x.f(dVarH, "systemIcon");
        x.f(eVarG, "systemIconType");
        wazeIconButton.a(dVarH, eVarG);
        a[] aVarArrValues = a.values();
        int length = aVarArrValues.length;
        while (true) {
            if (i3 >= length) {
                aVar = null;
                break;
            }
            aVar = aVarArrValues[i3];
            if (aVar.a() == i6) {
                break;
            } else {
                i3++;
            }
        }
        g(aVar != null ? aVar : aVar2);
        d(string);
        setElevation(typedArrayObtainStyledAttributes.getResources().getDimension(R.dimen.card_elevation_1));
        setOutlineProvider(ViewOutlineProvider.BOUNDS);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void a() {
        this.f23470c.setVisibility(8);
    }

    public final void b() {
        this.f23472e.setVisibility(8);
    }

    public final void c(View.OnClickListener onClickListener) {
        x.f(onClickListener, "clickListener");
        this.f23470c.setOnClickListener(onClickListener);
    }

    public final void d(String str) {
        this.f23469b.h(str);
    }

    public final void e(boolean z) {
        this.f23469b.d(z);
    }

    public final void f(View.OnClickListener onClickListener) {
        x.f(onClickListener, "clickListener");
        this.f23468a.setOnClickListener(onClickListener);
        this.f23469b.setOnClickListener(onClickListener);
    }

    public final void g(a aVar) {
        x.f(aVar, "rightElement");
        this.f23469b.setVisibility(aVar == a.f23475c ? 0 : 8);
        this.f23468a.setVisibility(aVar != a.f23474b ? 8 : 0);
    }

    public final void h(String str) {
        this.f23471d.setText(str);
    }

    public final void i() {
        this.f23470c.setVisibility(0);
    }

    public final void j() {
        this.f23472e.setVisibility(0);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(getResources().getDimensionPixelOffset(R.dimen.header_view_height), 1073741824));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WazeHeaderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        x.f(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WazeHeaderView(Context context) {
        this(context, null, 0, 6, null);
        x.f(context, "context");
    }

    public /* synthetic */ WazeHeaderView(Context context, AttributeSet attributeSet, int i2, int i3, o oVar) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i2);
    }
}
