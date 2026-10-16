package android.support.v7.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.gc;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class ListMenuItemView extends LinearLayout implements AbsListView.SelectionBoundsAdjuster, ae {

    /* renamed from: a, reason: collision with root package name */
    private t f725a;

    /* renamed from: b, reason: collision with root package name */
    private ImageView f726b;

    /* renamed from: c, reason: collision with root package name */
    private RadioButton f727c;

    /* renamed from: d, reason: collision with root package name */
    private TextView f728d;

    /* renamed from: e, reason: collision with root package name */
    private CheckBox f729e;

    /* renamed from: f, reason: collision with root package name */
    private TextView f730f;

    /* renamed from: g, reason: collision with root package name */
    private ImageView f731g;

    /* renamed from: h, reason: collision with root package name */
    private ImageView f732h;

    /* renamed from: i, reason: collision with root package name */
    private LinearLayout f733i;

    /* renamed from: j, reason: collision with root package name */
    private Drawable f734j;

    /* renamed from: k, reason: collision with root package name */
    private int f735k;

    /* renamed from: l, reason: collision with root package name */
    private Context f736l;
    private boolean m;
    private Drawable n;
    private boolean o;
    private LayoutInflater p;
    private boolean q;

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet);
        gc gcVarN = gc.n(getContext(), attributeSet, android.support.v7.a.a.r, i2, 0);
        this.f734j = gcVarN.j(5);
        this.f735k = gcVarN.f(1, -1);
        this.m = gcVarN.r(7, false);
        this.f736l = context;
        this.n = gcVarN.j(8);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, com.waze.R.attr.dropDownListViewStyle, 0);
        this.o = typedArrayObtainStyledAttributes.hasValue(0);
        gcVarN.q();
        typedArrayObtainStyledAttributes.recycle();
    }

    private final LayoutInflater d() {
        LayoutInflater layoutInflater = this.p;
        if (layoutInflater != null) {
            return layoutInflater;
        }
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        this.p = layoutInflaterFrom;
        return layoutInflaterFrom;
    }

    private final void e(View view) {
        f(view, -1);
    }

    private final void f(View view, int i2) {
        LinearLayout linearLayout = this.f733i;
        if (linearLayout != null) {
            linearLayout.addView(view, i2);
        } else {
            addView(view, i2);
        }
    }

    @Override // android.support.v7.view.menu.ae
    public final t a() {
        return this.f725a;
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f732h;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f732h.getLayoutParams();
        rect.top += this.f732h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    public final void b(boolean z) {
        ImageView imageView = this.f732h;
        if (imageView != null) {
            int i2 = 8;
            if (!this.o && z) {
                i2 = 0;
            }
            imageView.setVisibility(i2);
        }
    }

    public final void c() {
        this.q = true;
        this.m = true;
    }

    @Override // android.support.v7.view.menu.ae
    public final boolean g() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [android.widget.RadioButton] */
    /* JADX WARN: Type inference failed for: r4v4, types: [android.widget.CheckBox] */
    /* JADX WARN: Type inference failed for: r4v8, types: [android.widget.CompoundButton] */
    /* JADX WARN: Type inference failed for: r5v4, types: [android.widget.CheckBox] */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.support.v7.view.menu.ListMenuItemView, android.support.v7.view.menu.ae, android.view.ViewGroup] */
    @Override // android.support.v7.view.menu.ae
    public final void h(t tVar) {
        ?? r4;
        RadioButton radioButton;
        CheckBox checkBox;
        ImageView imageView;
        this.f725a = tVar;
        setVisibility(true != tVar.isVisible() ? 8 : 0);
        CharSequence charSequenceC = tVar.c(this);
        TextView textView = this.f728d;
        if (charSequenceC != null) {
            textView.setText(charSequenceC);
            if (this.f728d.getVisibility() != 0) {
                this.f728d.setVisibility(0);
            }
        } else if (textView.getVisibility() != 8) {
            this.f728d.setVisibility(8);
        }
        boolean zIsCheckable = tVar.isCheckable();
        if (zIsCheckable || this.f727c != null || this.f729e != null) {
            if (this.f725a.m()) {
                if (this.f727c == null) {
                    RadioButton radioButton2 = (RadioButton) d().inflate(com.waze.R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                    this.f727c = radioButton2;
                    e(radioButton2);
                }
                r4 = this.f727c;
                ?? r5 = this.f729e;
                radioButton = r5;
                checkBox = r5;
            } else {
                if (this.f729e == null) {
                    CheckBox checkBox2 = (CheckBox) d().inflate(com.waze.R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                    this.f729e = checkBox2;
                    e(checkBox2);
                }
                r4 = this.f729e;
                radioButton = this.f727c;
                checkBox = r4;
            }
            if (zIsCheckable) {
                r4.setChecked(this.f725a.isChecked());
                if (r4.getVisibility() != 0) {
                    r4.setVisibility(0);
                }
                if (radioButton != null && radioButton.getVisibility() != 8) {
                    radioButton.setVisibility(8);
                }
            } else {
                if (checkBox != null) {
                    checkBox.setVisibility(8);
                }
                RadioButton radioButton3 = this.f727c;
                if (radioButton3 != null) {
                    radioButton3.setVisibility(8);
                }
            }
        }
        boolean zP = tVar.p();
        tVar.a();
        int i2 = (zP && this.f725a.p()) ? 0 : 8;
        if (i2 == 0) {
            this.f730f.setText(this.f725a.d());
        }
        if (this.f730f.getVisibility() != i2) {
            this.f730f.setVisibility(i2);
        }
        Drawable icon = tVar.getIcon();
        q qVar = this.f725a.f841a;
        boolean z = this.q;
        if ((z || this.m) && ((imageView = this.f726b) != null || icon != null || this.m)) {
            if (imageView == null) {
                ImageView imageView2 = (ImageView) d().inflate(com.waze.R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f726b = imageView2;
                f(imageView2, 0);
            }
            if (icon != null || this.m) {
                ImageView imageView3 = this.f726b;
                if (true != z) {
                    icon = null;
                }
                imageView3.setImageDrawable(icon);
                if (this.f726b.getVisibility() != 0) {
                    this.f726b.setVisibility(0);
                }
            } else {
                this.f726b.setVisibility(8);
            }
        }
        setEnabled(tVar.isEnabled());
        boolean zHasSubMenu = tVar.hasSubMenu();
        ImageView imageView4 = this.f731g;
        if (imageView4 != null) {
            imageView4.setVisibility(true != zHasSubMenu ? 8 : 0);
        }
        setContentDescription(tVar.getContentDescription());
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f734j);
        TextView textView = (TextView) findViewById(com.waze.R.id.title);
        this.f728d = textView;
        int i2 = this.f735k;
        if (i2 != -1) {
            textView.setTextAppearance(this.f736l, i2);
        }
        this.f730f = (TextView) findViewById(com.waze.R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(com.waze.R.id.submenuarrow);
        this.f731g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.n);
        }
        this.f732h = (ImageView) findViewById(com.waze.R.id.group_divider);
        this.f733i = (LinearLayout) findViewById(com.waze.R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i2, int i3) {
        if (this.f726b != null && this.m) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f726b.getLayoutParams();
            if (layoutParams.height > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = layoutParams.height;
            }
        }
        super.onMeasure(i2, i3);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.waze.R.attr.listMenuViewStyle);
    }
}
