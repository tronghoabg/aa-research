package android.support.v7.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import defpackage.fs;
import defpackage.hg;
import defpackage.hi;
import defpackage.ht;
import defpackage.lah;

/* loaded from: classes2.dex */
public class ListMenuItemView extends LinearLayout implements AbsListView.SelectionBoundsAdjuster, ht {
    public hi a;
    public ImageView b;
    public boolean c;
    public boolean d;
    public boolean e;
    private ImageView f;
    private RadioButton g;
    private TextView h;
    private CheckBox i;
    private TextView j;
    private ImageView k;
    private LinearLayout l;
    private Drawable m;
    private int n;
    private Context o;
    private Drawable p;
    private LayoutInflater q;

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        lah lahVarC = lah.C(getContext(), attributeSet, fs.s, i, 0);
        this.m = lahVarC.s(5);
        this.n = lahVarC.q(1, -1);
        this.c = lahVarC.x(7, false);
        this.o = context;
        this.p = lahVarC.s(8);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, com.google.android.projection.gearhead.R.attr.dropDownListViewStyle, 0);
        this.d = typedArrayObtainStyledAttributes.hasValue(0);
        lahVarC.w();
        typedArrayObtainStyledAttributes.recycle();
    }

    private final LayoutInflater b() {
        LayoutInflater layoutInflater = this.q;
        if (layoutInflater != null) {
            return layoutInflater;
        }
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        this.q = layoutInflaterFrom;
        return layoutInflaterFrom;
    }

    private final void c(View view, int i) {
        LinearLayout linearLayout = this.l;
        if (linearLayout != null) {
            linearLayout.addView(view, i);
        } else {
            addView(view, i);
        }
    }

    @Override // defpackage.ht
    public final hi a() {
        return this.a;
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.b;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.b.getLayoutParams();
        rect.top += this.b.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // defpackage.ht
    public final boolean e() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [android.support.v7.view.menu.ListMenuItemView, android.view.ViewGroup, ht] */
    /* JADX WARN: Type inference failed for: r4v10, types: [android.widget.RadioButton] */
    /* JADX WARN: Type inference failed for: r4v4, types: [android.widget.CheckBox] */
    /* JADX WARN: Type inference failed for: r4v8, types: [android.widget.CompoundButton] */
    /* JADX WARN: Type inference failed for: r5v4, types: [android.widget.CheckBox] */
    @Override // defpackage.ht
    public final void f(hi hiVar) {
        ?? r4;
        RadioButton radioButton;
        CheckBox checkBox;
        ImageView imageView;
        String string;
        this.a = hiVar;
        setVisibility(true != hiVar.isVisible() ? 8 : 0);
        CharSequence charSequenceF = hiVar.f(this);
        TextView textView = this.h;
        if (charSequenceF != null) {
            textView.setText(charSequenceF);
            if (this.h.getVisibility() != 0) {
                this.h.setVisibility(0);
            }
        } else if (textView.getVisibility() != 8) {
            this.h.setVisibility(8);
        }
        boolean zIsCheckable = hiVar.isCheckable();
        if (zIsCheckable || this.g != null || this.i != null) {
            if (this.a.p()) {
                if (this.g == null) {
                    RadioButton radioButton2 = (RadioButton) b().inflate(com.google.android.projection.gearhead.R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                    this.g = radioButton2;
                    c(radioButton2, -1);
                }
                r4 = this.g;
                ?? r5 = this.i;
                radioButton = r5;
                checkBox = r5;
            } else {
                if (this.i == null) {
                    CheckBox checkBox2 = (CheckBox) b().inflate(com.google.android.projection.gearhead.R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                    this.i = checkBox2;
                    c(checkBox2, -1);
                }
                r4 = this.i;
                radioButton = this.g;
                checkBox = r4;
            }
            if (zIsCheckable) {
                r4.setChecked(this.a.isChecked());
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
                RadioButton radioButton3 = this.g;
                if (radioButton3 != null) {
                    radioButton3.setVisibility(8);
                }
            }
        }
        boolean zT = hiVar.t();
        hiVar.e();
        int i = (zT && this.a.t()) ? 0 : 8;
        if (i == 0) {
            TextView textView2 = this.j;
            hi hiVar2 = this.a;
            char cE = hiVar2.e();
            if (cE == 0) {
                string = "";
            } else {
                hg hgVar = hiVar2.j;
                Context context = hgVar.a;
                Resources resources = context.getResources();
                StringBuilder sb = new StringBuilder();
                if (ViewConfiguration.get(context).hasPermanentMenuKey()) {
                    sb.append(resources.getString(com.google.android.projection.gearhead.R.string.abc_prepend_shortcut_label));
                }
                int i2 = hgVar.x() ? hiVar2.i : hiVar2.g;
                hi.g(sb, i2, 65536, resources.getString(com.google.android.projection.gearhead.R.string.abc_menu_meta_shortcut_label));
                hi.g(sb, i2, 4096, resources.getString(com.google.android.projection.gearhead.R.string.abc_menu_ctrl_shortcut_label));
                hi.g(sb, i2, 2, resources.getString(com.google.android.projection.gearhead.R.string.abc_menu_alt_shortcut_label));
                hi.g(sb, i2, 1, resources.getString(com.google.android.projection.gearhead.R.string.abc_menu_shift_shortcut_label));
                hi.g(sb, i2, 4, resources.getString(com.google.android.projection.gearhead.R.string.abc_menu_sym_shortcut_label));
                hi.g(sb, i2, 8, resources.getString(com.google.android.projection.gearhead.R.string.abc_menu_function_shortcut_label));
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
        Drawable icon = hiVar.getIcon();
        hg hgVar2 = this.a.j;
        boolean z = this.e;
        if ((z || this.c) && ((imageView = this.f) != null || icon != null || this.c)) {
            if (imageView == null) {
                ImageView imageView2 = (ImageView) b().inflate(com.google.android.projection.gearhead.R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f = imageView2;
                c(imageView2, 0);
            }
            if (icon != null || this.c) {
                ImageView imageView3 = this.f;
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
        setEnabled(hiVar.isEnabled());
        boolean zHasSubMenu = hiVar.hasSubMenu();
        ImageView imageView4 = this.k;
        if (imageView4 != null) {
            imageView4.setVisibility(true != zHasSubMenu ? 8 : 0);
        }
        setContentDescription(hiVar.l);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.m);
        TextView textView = (TextView) findViewById(com.google.android.projection.gearhead.R.id.title);
        this.h = textView;
        int i = this.n;
        if (i != -1) {
            textView.setTextAppearance(this.o, i);
        }
        this.j = (TextView) findViewById(com.google.android.projection.gearhead.R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(com.google.android.projection.gearhead.R.id.submenuarrow);
        this.k = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.p);
        }
        this.b = (ImageView) findViewById(com.google.android.projection.gearhead.R.id.group_divider);
        this.l = (LinearLayout) findViewById(com.google.android.projection.gearhead.R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        if (this.f != null && this.c) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f.getLayoutParams();
            if (layoutParams.height > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = layoutParams.height;
            }
        }
        super.onMeasure(i, i2);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.projection.gearhead.R.attr.listMenuViewStyle);
    }
}
