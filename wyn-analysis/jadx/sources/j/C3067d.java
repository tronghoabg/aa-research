package j;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import com.wynauto.wyn.R;
import i.AbstractC2820a;
import java.lang.ref.WeakReference;

/* renamed from: j.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3067d {

    /* renamed from: A, reason: collision with root package name */
    public final int f38426A;

    /* renamed from: B, reason: collision with root package name */
    public final int f38427B;

    /* renamed from: C, reason: collision with root package name */
    public final boolean f38428C;

    /* renamed from: D, reason: collision with root package name */
    public final V5.c f38429D;

    /* renamed from: a, reason: collision with root package name */
    public final Context f38431a;

    /* renamed from: b, reason: collision with root package name */
    public final DialogInterfaceC3069f f38432b;

    /* renamed from: c, reason: collision with root package name */
    public final Window f38433c;

    /* renamed from: d, reason: collision with root package name */
    public CharSequence f38434d;

    /* renamed from: e, reason: collision with root package name */
    public AlertController$RecycleListView f38435e;

    /* renamed from: f, reason: collision with root package name */
    public View f38436f;

    /* renamed from: h, reason: collision with root package name */
    public Button f38438h;

    /* renamed from: i, reason: collision with root package name */
    public CharSequence f38439i;

    /* renamed from: j, reason: collision with root package name */
    public Message f38440j;
    public Button k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f38441l;

    /* renamed from: m, reason: collision with root package name */
    public Message f38442m;

    /* renamed from: n, reason: collision with root package name */
    public Button f38443n;

    /* renamed from: o, reason: collision with root package name */
    public CharSequence f38444o;

    /* renamed from: p, reason: collision with root package name */
    public Message f38445p;

    /* renamed from: q, reason: collision with root package name */
    public NestedScrollView f38446q;

    /* renamed from: r, reason: collision with root package name */
    public Drawable f38447r;

    /* renamed from: s, reason: collision with root package name */
    public ImageView f38448s;

    /* renamed from: t, reason: collision with root package name */
    public TextView f38449t;

    /* renamed from: u, reason: collision with root package name */
    public TextView f38450u;

    /* renamed from: v, reason: collision with root package name */
    public View f38451v;

    /* renamed from: w, reason: collision with root package name */
    public ListAdapter f38452w;

    /* renamed from: y, reason: collision with root package name */
    public final int f38454y;

    /* renamed from: z, reason: collision with root package name */
    public final int f38455z;

    /* renamed from: g, reason: collision with root package name */
    public boolean f38437g = false;

    /* renamed from: x, reason: collision with root package name */
    public int f38453x = -1;

    /* renamed from: E, reason: collision with root package name */
    public final F6.f f38430E = new F6.f(this, 3);

    public C3067d(Context context, DialogInterfaceC3069f dialogInterfaceC3069f, Window window) {
        this.f38431a = context;
        this.f38432b = dialogInterfaceC3069f;
        this.f38433c = window;
        V5.c cVar = new V5.c();
        cVar.f13024b = new WeakReference(dialogInterfaceC3069f);
        this.f38429D = cVar;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC2820a.f36442e, R.attr.alertDialogStyle, 0);
        this.f38454y = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.getResourceId(2, 0);
        this.f38455z = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.f38426A = typedArrayObtainStyledAttributes.getResourceId(7, 0);
        this.f38427B = typedArrayObtainStyledAttributes.getResourceId(3, 0);
        this.f38428C = typedArrayObtainStyledAttributes.getBoolean(6, true);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        dialogInterfaceC3069f.c().h(1);
    }

    public static boolean a(View view) {
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
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public static ViewGroup b(View view, View view2) {
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

    public final void c(int i5, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        Message messageObtainMessage = onClickListener != null ? this.f38429D.obtainMessage(i5, onClickListener) : null;
        if (i5 == -3) {
            this.f38444o = charSequence;
            this.f38445p = messageObtainMessage;
        } else if (i5 == -2) {
            this.f38441l = charSequence;
            this.f38442m = messageObtainMessage;
        } else {
            if (i5 != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f38439i = charSequence;
            this.f38440j = messageObtainMessage;
        }
    }
}
