package android.support.v7.view.menu;

/* JADX INFO: loaded from: classes2.dex */
public class ListMenuItemView extends android.widget.LinearLayout implements android.widget.AbsListView.SelectionBoundsAdjuster, defpackage.hu {
    public defpackage.hj a;
    public android.widget.ImageView b;
    public boolean c;
    public boolean d;
    public boolean e;
    private android.widget.ImageView f;
    private android.widget.RadioButton g;
    private android.widget.TextView h;
    private android.widget.CheckBox i;
    private android.widget.TextView j;
    private android.widget.ImageView k;
    private android.widget.LinearLayout l;
    private android.graphics.drawable.Drawable m;
    private int n;
    private android.content.Context o;
    private android.graphics.drawable.Drawable p;
    private android.view.LayoutInflater q;

    public ListMenuItemView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        defpackage.lam lamVarC = defpackage.lam.C(getContext(), attributeSet, defpackage.ft.s, i, 0);
        this.m = lamVarC.s(5);
        this.n = lamVarC.q(1, -1);
        this.c = lamVarC.x(7, false);
        this.o = context;
        this.p = lamVarC.s(8);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, com.google.android.projection.gearhead.R.attr.dropDownListViewStyle, 0);
        this.d = typedArrayObtainStyledAttributes.hasValue(0);
        lamVarC.w();
        typedArrayObtainStyledAttributes.recycle();
    }

    private final android.view.LayoutInflater b() {
        android.view.LayoutInflater layoutInflater = this.q;
        if (layoutInflater != null) {
            return layoutInflater;
        }
        android.view.LayoutInflater layoutInflaterFrom = android.view.LayoutInflater.from(getContext());
        this.q = layoutInflaterFrom;
        return layoutInflaterFrom;
    }

    private final void c(android.view.View view, int i) {
        android.widget.LinearLayout linearLayout = this.l;
        if (linearLayout != null) {
            linearLayout.addView(view, i);
        } else {
            addView(view, i);
        }
    }

    @Override // defpackage.hu
    public final defpackage.hj a() {
        return this.a;
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(android.graphics.Rect rect) {
        android.widget.ImageView imageView = this.b;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) this.b.getLayoutParams();
        rect.top += this.b.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // defpackage.hu
    public final boolean e() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [android.support.v7.view.menu.ListMenuItemView, android.view.ViewGroup, hu] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v3, types: [android.widget.CheckBox] */
    @Override // defpackage.hu
    public final void f(defpackage.hj hjVar) {
        android.widget.CompoundButton compoundButton;
        android.widget.CompoundButton compoundButton2;
        ?? r5;
        android.widget.ImageView imageView;
        java.lang.String string;
        this.a = hjVar;
        setVisibility(true != hjVar.isVisible() ? 8 : 0);
        java.lang.CharSequence charSequenceF = hjVar.f(this);
        android.widget.TextView textView = this.h;
        if (charSequenceF != null) {
            textView.setText(charSequenceF);
            if (this.h.getVisibility() != 0) {
                this.h.setVisibility(0);
            }
        } else if (textView.getVisibility() != 8) {
            this.h.setVisibility(8);
        }
        boolean zIsCheckable = hjVar.isCheckable();
        if (zIsCheckable || this.g != null || this.i != null) {
            if (this.a.p()) {
                if (this.g == null) {
                    android.widget.RadioButton radioButton = (android.widget.RadioButton) b().inflate(com.google.android.projection.gearhead.R.layout.abc_list_menu_item_radio, (android.view.ViewGroup) this, false);
                    this.g = radioButton;
                    c(radioButton, -1);
                }
                compoundButton = this.g;
                android.widget.CheckBox checkBox = this.i;
                compoundButton2 = checkBox;
                r5 = checkBox;
            } else {
                if (this.i == null) {
                    android.widget.CheckBox checkBox2 = (android.widget.CheckBox) b().inflate(com.google.android.projection.gearhead.R.layout.abc_list_menu_item_checkbox, (android.view.ViewGroup) this, false);
                    this.i = checkBox2;
                    c(checkBox2, -1);
                }
                compoundButton = this.i;
                compoundButton2 = this.g;
                r5 = compoundButton;
            }
            if (zIsCheckable) {
                compoundButton.setChecked(this.a.isChecked());
                if (compoundButton.getVisibility() != 0) {
                    compoundButton.setVisibility(0);
                }
                if (compoundButton2 != null && compoundButton2.getVisibility() != 8) {
                    compoundButton2.setVisibility(8);
                }
            } else {
                if (r5 != 0) {
                    r5.setVisibility(8);
                }
                android.widget.RadioButton radioButton2 = this.g;
                if (radioButton2 != null) {
                    radioButton2.setVisibility(8);
                }
            }
        }
        boolean zT = hjVar.t();
        hjVar.e();
        int i = (zT && this.a.t()) ? 0 : 8;
        if (i == 0) {
            android.widget.TextView textView2 = this.j;
            defpackage.hj hjVar2 = this.a;
            char cE = hjVar2.e();
            if (cE == 0) {
                string = "";
            } else {
                defpackage.hh hhVar = hjVar2.j;
                android.content.Context context = hhVar.a;
                android.content.res.Resources resources = context.getResources();
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                if (android.view.ViewConfiguration.get(context).hasPermanentMenuKey()) {
                    sb.append(resources.getString(com.google.android.projection.gearhead.R.string.abc_prepend_shortcut_label));
                }
                int i2 = hhVar.x() ? hjVar2.i : hjVar2.g;
                defpackage.hj.g(sb, i2, 65536, resources.getString(com.google.android.projection.gearhead.R.string.abc_menu_meta_shortcut_label));
                defpackage.hj.g(sb, i2, 4096, resources.getString(com.google.android.projection.gearhead.R.string.abc_menu_ctrl_shortcut_label));
                defpackage.hj.g(sb, i2, 2, resources.getString(com.google.android.projection.gearhead.R.string.abc_menu_alt_shortcut_label));
                defpackage.hj.g(sb, i2, 1, resources.getString(com.google.android.projection.gearhead.R.string.abc_menu_shift_shortcut_label));
                defpackage.hj.g(sb, i2, 4, resources.getString(com.google.android.projection.gearhead.R.string.abc_menu_sym_shortcut_label));
                defpackage.hj.g(sb, i2, 8, resources.getString(com.google.android.projection.gearhead.R.string.abc_menu_function_shortcut_label));
                if (cE == '\b') {
                    sb.append(resources.getString(com.google.android.projection.gearhead.R.string.abc_menu_delete_shortcut_label));
                } else if (cE == '\n') {
                    sb.append(resources.getString(com.google.android.projection.gearhead.R.string.abc_menu_enter_shortcut_label));
                } else if (cE != ' ') {
                    sb.append(cE);
                } else {
                    sb.append(resources.getString(com.google.android.projection.gearhead.R.string.abc_menu_space_shortcut_label));
                }
                string = sb.toString();
            }
            textView2.setText(string);
        }
        if (this.j.getVisibility() != i) {
            this.j.setVisibility(i);
        }
        android.graphics.drawable.Drawable icon = hjVar.getIcon();
        defpackage.hh hhVar2 = this.a.j;
        boolean z = this.e;
        if ((z || this.c) && ((imageView = this.f) != null || icon != null || this.c)) {
            if (imageView == null) {
                android.widget.ImageView imageView2 = (android.widget.ImageView) b().inflate(com.google.android.projection.gearhead.R.layout.abc_list_menu_item_icon, (android.view.ViewGroup) this, false);
                this.f = imageView2;
                c(imageView2, 0);
            }
            if (icon != null || this.c) {
                android.widget.ImageView imageView3 = this.f;
                if (true != z) {
                    icon = null;
                }
                imageView3.setImageDrawable(icon);
                if (this.f.getVisibility() != 0) {
                    this.f.setVisibility(0);
                }
            } else {
                this.f.setVisibility(8);
            }
        }
        setEnabled(hjVar.isEnabled());
        boolean zHasSubMenu = hjVar.hasSubMenu();
        android.widget.ImageView imageView4 = this.k;
        if (imageView4 != null) {
            imageView4.setVisibility(true != zHasSubMenu ? 8 : 0);
        }
        setContentDescription(hjVar.l);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.m);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.google.android.projection.gearhead.R.id.title);
        this.h = textView;
        int i = this.n;
        if (i != -1) {
            textView.setTextAppearance(this.o, i);
        }
        this.j = (android.widget.TextView) findViewById(com.google.android.projection.gearhead.R.id.shortcut);
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.google.android.projection.gearhead.R.id.submenuarrow);
        this.k = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.p);
        }
        this.b = (android.widget.ImageView) findViewById(com.google.android.projection.gearhead.R.id.group_divider);
        this.l = (android.widget.LinearLayout) findViewById(com.google.android.projection.gearhead.R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        if (this.f != null && this.c) {
            android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
            android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) this.f.getLayoutParams();
            if (layoutParams.height > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = layoutParams.height;
            }
        }
        super.onMeasure(i, i2);
    }

    public ListMenuItemView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.projection.gearhead.R.attr.listMenuViewStyle);
    }
}
