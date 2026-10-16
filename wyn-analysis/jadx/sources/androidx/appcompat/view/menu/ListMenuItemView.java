package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.wynauto.wyn.R;
import i.AbstractC2820a;
import java.util.WeakHashMap;
import k1.S;
import md.J;
import p.m;
import p.y;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements y, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: a, reason: collision with root package name */
    public m f17769a;

    /* renamed from: b, reason: collision with root package name */
    public ImageView f17770b;

    /* renamed from: c, reason: collision with root package name */
    public RadioButton f17771c;

    /* renamed from: d, reason: collision with root package name */
    public TextView f17772d;

    /* renamed from: e, reason: collision with root package name */
    public CheckBox f17773e;

    /* renamed from: f, reason: collision with root package name */
    public TextView f17774f;

    /* renamed from: g, reason: collision with root package name */
    public ImageView f17775g;

    /* renamed from: h, reason: collision with root package name */
    public ImageView f17776h;

    /* renamed from: i, reason: collision with root package name */
    public LinearLayout f17777i;

    /* renamed from: j, reason: collision with root package name */
    public final Drawable f17778j;
    public final int k;

    /* renamed from: l, reason: collision with root package name */
    public final Context f17779l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f17780m;

    /* renamed from: n, reason: collision with root package name */
    public final Drawable f17781n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f17782o;

    /* renamed from: p, reason: collision with root package name */
    public LayoutInflater f17783p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f17784q;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        J jS = J.s(getContext(), attributeSet, AbstractC2820a.f36454r, R.attr.listMenuViewStyle, 0);
        this.f17778j = jS.n(5);
        TypedArray typedArray = (TypedArray) jS.f40581b;
        this.k = typedArray.getResourceId(1, -1);
        this.f17780m = typedArray.getBoolean(7, false);
        this.f17779l = context;
        this.f17781n = jS.n(8);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.f17782o = typedArrayObtainStyledAttributes.hasValue(0);
        jS.v();
        typedArrayObtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f17783p == null) {
            this.f17783p = LayoutInflater.from(getContext());
        }
        return this.f17783p;
    }

    private void setSubMenuArrowVisible(boolean z2) {
        ImageView imageView = this.f17775g;
        if (imageView != null) {
            imageView.setVisibility(z2 ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f17776h;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f17776h.getLayoutParams();
        rect.top = this.f17776h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005e  */
    @Override // p.y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(p.m r11) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ListMenuItemView.c(p.m):void");
    }

    @Override // p.y
    public m getItemData() {
        return this.f17769a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        WeakHashMap weakHashMap = S.f38779a;
        setBackground(this.f17778j);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f17772d = textView;
        int i5 = this.k;
        if (i5 != -1) {
            textView.setTextAppearance(this.f17779l, i5);
        }
        this.f17774f = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f17775g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f17781n);
        }
        this.f17776h = (ImageView) findViewById(R.id.group_divider);
        this.f17777i = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i5, int i10) {
        if (this.f17770b != null && this.f17780m) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f17770b.getLayoutParams();
            int i11 = layoutParams.height;
            if (i11 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i11;
            }
        }
        super.onMeasure(i5, i10);
    }

    public void setCheckable(boolean z2) {
        CompoundButton compoundButton;
        View view;
        if (!z2 && this.f17771c == null && this.f17773e == null) {
            return;
        }
        if ((this.f17769a.f43090x & 4) != 0) {
            if (this.f17771c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f17771c = radioButton;
                LinearLayout linearLayout = this.f17777i;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f17771c;
            view = this.f17773e;
        } else {
            if (this.f17773e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f17773e = checkBox;
                LinearLayout linearLayout2 = this.f17777i;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f17773e;
            view = this.f17771c;
        }
        if (z2) {
            compoundButton.setChecked(this.f17769a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.f17773e;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f17771c;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z2) {
        CompoundButton compoundButton;
        if ((this.f17769a.f43090x & 4) != 0) {
            if (this.f17771c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f17771c = radioButton;
                LinearLayout linearLayout = this.f17777i;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f17771c;
        } else {
            if (this.f17773e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f17773e = checkBox;
                LinearLayout linearLayout2 = this.f17777i;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f17773e;
        }
        compoundButton.setChecked(z2);
    }

    public void setForceShowIcon(boolean z2) {
        this.f17784q = z2;
        this.f17780m = z2;
    }

    public void setGroupDividerEnabled(boolean z2) {
        ImageView imageView = this.f17776h;
        if (imageView != null) {
            imageView.setVisibility((this.f17782o || !z2) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        this.f17769a.f43080n.getClass();
        boolean z2 = this.f17784q;
        if (z2 || this.f17780m) {
            ImageView imageView = this.f17770b;
            if (imageView == null && drawable == null && !this.f17780m) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f17770b = imageView2;
                LinearLayout linearLayout = this.f17777i;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f17780m) {
                this.f17770b.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f17770b;
            if (!z2) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f17770b.getVisibility() != 0) {
                this.f17770b.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f17772d.getVisibility() != 8) {
                this.f17772d.setVisibility(8);
            }
        } else {
            this.f17772d.setText(charSequence);
            if (this.f17772d.getVisibility() != 0) {
                this.f17772d.setVisibility(0);
            }
        }
    }
}
