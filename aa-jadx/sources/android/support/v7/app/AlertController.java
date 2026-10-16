package android.support.v7.app;

/* JADX INFO: loaded from: classes2.dex */
public final class AlertController {
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    public final boolean F;
    public final android.os.Handler G;
    public final android.content.Context a;
    public final defpackage.fh b;
    public final android.view.Window c;
    public java.lang.CharSequence d;
    public java.lang.CharSequence e;
    public android.widget.ListView f;
    public android.view.View g;
    public android.widget.Button i;
    public java.lang.CharSequence j;
    public android.os.Message k;
    public android.widget.Button l;
    public java.lang.CharSequence m;
    public android.os.Message n;
    public android.widget.Button o;
    public java.lang.CharSequence p;
    public androidx.core.widget.NestedScrollView q;
    public android.graphics.drawable.Drawable s;
    public android.widget.ImageView t;
    public android.widget.TextView u;
    public android.widget.TextView v;
    public android.view.View w;
    public android.widget.ListAdapter x;
    public final int z;
    public boolean h = false;
    public int r = 0;
    public int y = -1;
    public final android.view.View.OnClickListener H = new defpackage.ViewOnClickListenerC0002if(this, 1);

    public AlertController(android.content.Context context, defpackage.fh fhVar, android.view.Window window) {
        this.a = context;
        this.b = fhVar;
        this.c = window;
        this.G = new defpackage.ek(fhVar);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, defpackage.ft.e, com.google.android.projection.gearhead.R.attr.alertDialogStyle, 0);
        this.z = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        this.A = typedArrayObtainStyledAttributes.getResourceId(2, 0);
        this.B = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.C = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.D = typedArrayObtainStyledAttributes.getResourceId(7, 0);
        this.E = typedArrayObtainStyledAttributes.getResourceId(3, 0);
        this.F = typedArrayObtainStyledAttributes.getBoolean(6, true);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        fhVar.e();
    }

    public static boolean b(android.view.View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof android.view.ViewGroup)) {
            return false;
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (b(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public static final void c(android.widget.Button button) {
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    public static final android.view.ViewGroup d(android.view.View view, android.view.View view2) {
        if (view == null) {
            if (view2 instanceof android.view.ViewStub) {
                view2 = ((android.view.ViewStub) view2).inflate();
            }
            return (android.view.ViewGroup) view2;
        }
        if (view2 != null) {
            android.view.ViewParent parent = view2.getParent();
            if (parent instanceof android.view.ViewGroup) {
                ((android.view.ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof android.view.ViewStub) {
            view = ((android.view.ViewStub) view).inflate();
        }
        return (android.view.ViewGroup) view;
    }

    public final void a(java.lang.CharSequence charSequence) {
        this.d = charSequence;
        android.widget.TextView textView = this.u;
        if (textView != null) {
            textView.setText(charSequence);
        }
        this.c.setTitle(charSequence);
    }

    public final void e(int i, java.lang.CharSequence charSequence, android.content.DialogInterface.OnClickListener onClickListener) {
        android.os.Message messageObtainMessage = onClickListener != null ? this.G.obtainMessage(i, onClickListener) : null;
        if (i != -2) {
            this.j = charSequence;
            this.k = messageObtainMessage;
        } else {
            this.m = charSequence;
            this.n = messageObtainMessage;
        }
    }

    public static class RecycleListView extends android.widget.ListView {
        public final int a;
        public final int b;

        public RecycleListView(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.ft.u);
            this.b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, -1);
            this.a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, -1);
        }

        public RecycleListView(android.content.Context context) {
            this(context, null);
        }
    }
}
