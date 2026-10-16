package android.support.v7.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class j {
    private TextView A;
    private View B;
    private final int C;
    private final boolean D;

    /* renamed from: a, reason: collision with root package name */
    final ap f597a;

    /* renamed from: b, reason: collision with root package name */
    ListView f598b;

    /* renamed from: c, reason: collision with root package name */
    Button f599c;

    /* renamed from: d, reason: collision with root package name */
    Message f600d;

    /* renamed from: e, reason: collision with root package name */
    Button f601e;

    /* renamed from: f, reason: collision with root package name */
    Message f602f;

    /* renamed from: g, reason: collision with root package name */
    Button f603g;

    /* renamed from: h, reason: collision with root package name */
    NestedScrollView f604h;

    /* renamed from: i, reason: collision with root package name */
    ListAdapter f605i;

    /* renamed from: k, reason: collision with root package name */
    final int f607k;

    /* renamed from: l, reason: collision with root package name */
    final int f608l;
    final int m;
    final int n;
    final Handler o;
    private final Context p;
    private final Window q;
    private CharSequence r;
    private CharSequence s;
    private View t;
    private CharSequence u;
    private CharSequence v;
    private Drawable x;
    private ImageView y;
    private TextView z;
    private int w = 0;

    /* renamed from: j, reason: collision with root package name */
    int f606j = -1;
    private final View.OnClickListener E = new c(this);

    public j(Context context, ap apVar, Window window) {
        this.p = context;
        this.f597a = apVar;
        this.q = window;
        this.o = new h(apVar);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, android.support.v7.a.a.f483e, R.attr.alertDialogStyle, 0);
        this.C = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.getResourceId(2, 0);
        this.f607k = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.f608l = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.m = typedArrayObtainStyledAttributes.getResourceId(7, 0);
        this.n = typedArrayObtainStyledAttributes.getResourceId(3, 0);
        this.D = typedArrayObtainStyledAttributes.getBoolean(6, true);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        apVar.bA().A(1);
    }

    static boolean h(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (h(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    private static final void j(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    private static final ViewGroup k(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0184  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 701
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.app.j.a():void");
    }

    public final void b(View view) {
        this.B = view;
    }

    public final void c(int i2) {
        this.x = null;
        this.w = i2;
        ImageView imageView = this.y;
        if (imageView != null) {
            imageView.setVisibility(0);
            this.y.setImageResource(this.w);
        }
    }

    public final void d(Drawable drawable) {
        this.x = drawable;
        this.w = 0;
        ImageView imageView = this.y;
        if (imageView != null) {
            imageView.setVisibility(0);
            this.y.setImageDrawable(drawable);
        }
    }

    public final void e(CharSequence charSequence) {
        this.s = charSequence;
        TextView textView = this.A;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public final void f(CharSequence charSequence) {
        this.r = charSequence;
        TextView textView = this.z;
        if (textView != null) {
            textView.setText(charSequence);
        }
        this.q.setTitle(charSequence);
    }

    public final void g(View view) {
        this.t = view;
    }

    public final void i(int i2, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        Message messageObtainMessage = onClickListener != null ? this.o.obtainMessage(i2, onClickListener) : null;
        if (i2 != -2) {
            this.u = charSequence;
            this.f600d = messageObtainMessage;
        } else {
            this.v = charSequence;
            this.f602f = messageObtainMessage;
        }
    }
}
