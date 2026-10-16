package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class js extends defpackage.ll implements defpackage.jt {
    public java.lang.CharSequence a;
    public android.widget.ListAdapter b;
    public final android.graphics.Rect c;
    public final /* synthetic */ android.support.v7.widget.AppCompatSpinner d;
    private int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public js(android.support.v7.widget.AppCompatSpinner appCompatSpinner, android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, com.google.android.projection.gearhead.R.attr.spinnerStyle);
        this.d = appCompatSpinner;
        this.c = new android.graphics.Rect();
        this.k = appCompatSpinner;
        y();
        this.l = new defpackage.lcq(this, 1);
    }

    @Override // defpackage.jt
    public final java.lang.CharSequence d() {
        return this.a;
    }

    @Override // defpackage.ll, defpackage.jt
    public final void e(android.widget.ListAdapter listAdapter) {
        super.e(listAdapter);
        this.b = listAdapter;
    }

    @Override // defpackage.jt
    public final void h(int i) {
        this.r = i;
    }

    @Override // defpackage.jt
    public final void i(java.lang.CharSequence charSequence) {
        this.a = charSequence;
    }

    @Override // defpackage.jt
    public final void l(int i, int i2) {
        android.view.ViewTreeObserver viewTreeObserver;
        boolean zU = u();
        n();
        x();
        super.s();
        defpackage.kt ktVar = this.e;
        ktVar.setChoiceMode(1);
        ktVar.setTextDirection(i);
        ktVar.setTextAlignment(i2);
        android.support.v7.widget.AppCompatSpinner appCompatSpinner = this.d;
        int selectedItemPosition = appCompatSpinner.getSelectedItemPosition();
        defpackage.kt ktVar2 = this.e;
        if (u() && ktVar2 != null) {
            ktVar2.a = false;
            ktVar2.setSelection(selectedItemPosition);
            if (ktVar2.getChoiceMode() != 0) {
                ktVar2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (zU || (viewTreeObserver = appCompatSpinner.getViewTreeObserver()) == null) {
            return;
        }
        defpackage.hy hyVar = new defpackage.hy(this, 3);
        viewTreeObserver.addOnGlobalLayoutListener(hyVar);
        v(new defpackage.jr(this, hyVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [android.widget.ListAdapter, android.widget.SpinnerAdapter] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void n() {
        int i;
        android.graphics.drawable.Drawable drawableC = c();
        android.support.v7.widget.AppCompatSpinner appCompatSpinner = this.d;
        if (drawableC != null) {
            android.graphics.Rect rect = appCompatSpinner.d;
            drawableC.getPadding(rect);
            i = defpackage.ca.l(appCompatSpinner) ? rect.right : -rect.left;
        } else {
            android.graphics.Rect rect2 = appCompatSpinner.d;
            rect2.right = 0;
            rect2.left = 0;
            i = 0;
        }
        android.support.v7.widget.AppCompatSpinner appCompatSpinner2 = this.d;
        int paddingLeft = appCompatSpinner2.getPaddingLeft();
        int paddingRight = appCompatSpinner2.getPaddingRight();
        int width = appCompatSpinner2.getWidth();
        int i2 = appCompatSpinner2.c;
        if (i2 == -2) {
            int i3 = (width - paddingLeft) - paddingRight;
            int iA = appCompatSpinner2.a(this.b, c());
            int i4 = appCompatSpinner2.getContext().getResources().getDisplayMetrics().widthPixels;
            android.graphics.Rect rect3 = appCompatSpinner2.d;
            int i5 = (i4 - rect3.left) - rect3.right;
            if (iA > i5) {
                iA = i5;
            }
            r(java.lang.Math.max(iA, i3));
        } else if (i2 == -1) {
            r((width - paddingLeft) - paddingRight);
        } else {
            r(i2);
        }
        this.g = defpackage.ca.l(appCompatSpinner2) ? i + (((width - paddingRight) - this.f) - this.r) : i + paddingLeft + this.r;
    }
}
