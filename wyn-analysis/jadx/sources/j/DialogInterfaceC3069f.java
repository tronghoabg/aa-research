package j;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import com.unity3d.services.UnityAdsConstants;
import com.wynauto.wyn.R;
import java.lang.reflect.InvocationTargetException;
import java.util.WeakHashMap;
import k1.InterfaceC3122i;
import k1.K;
import k1.S;
import q.C3846x0;

/* renamed from: j.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceC3069f extends androidx.activity.m implements DialogInterface, i {

    /* renamed from: d, reason: collision with root package name */
    public w f38458d;

    /* renamed from: e, reason: collision with root package name */
    public final x f38459e;

    /* renamed from: f, reason: collision with root package name */
    public final C3067d f38460f;

    /* JADX WARN: Type inference failed for: r2v2, types: [j.x] */
    public DialogInterfaceC3069f(ContextThemeWrapper contextThemeWrapper, int i5) {
        int i10;
        int iE = e(contextThemeWrapper, i5);
        if (iE == 0) {
            TypedValue typedValue = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i10 = typedValue.resourceId;
        } else {
            i10 = iE;
        }
        super(contextThemeWrapper, i10);
        this.f38459e = new InterfaceC3122i() { // from class: j.x
            @Override // k1.InterfaceC3122i
            public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
                return this.f38553a.g(keyEvent);
            }
        };
        l lVarC = c();
        if (iE == 0) {
            TypedValue typedValue2 = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            iE = typedValue2.resourceId;
        }
        ((w) lVarC).f38523T = iE;
        lVarC.d();
        this.f38460f = new C3067d(getContext(), this, getWindow());
    }

    public static int e(Context context, int i5) {
        if (((i5 >>> 24) & 255) >= 1) {
            return i5;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // androidx.activity.m, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        w wVar = (w) c();
        wVar.v();
        ((ViewGroup) wVar.f38505A.findViewById(android.R.id.content)).addView(view, layoutParams);
        wVar.f38539m.a(wVar.f38538l.getCallback());
    }

    public final l c() {
        if (this.f38458d == null) {
            T3.m mVar = l.f38464a;
            this.f38458d = new w(getContext(), getWindow(), this, this);
        }
        return this.f38458d;
    }

    public final void d(Bundle bundle) {
        c().a();
        super.onCreate(bundle);
        c().d();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        c().e();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return S3.f.o(this.f38459e, getWindow().getDecorView(), this, keyEvent);
    }

    public final void f(CharSequence charSequence) {
        super.setTitle(charSequence);
        c().l(charSequence);
    }

    @Override // android.app.Dialog
    public final View findViewById(int i5) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        w wVar = (w) c();
        wVar.v();
        return wVar.f38538l.findViewById(i5);
    }

    public final boolean g(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        c().b();
    }

    @Override // androidx.activity.m, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i5;
        int i10;
        int i11;
        ListAdapter listAdapter;
        View viewFindViewById;
        d(bundle);
        C3067d c3067d = this.f38460f;
        c3067d.f38432b.setContentView(c3067d.f38454y);
        Window window = c3067d.f38433c;
        View viewFindViewById2 = window.findViewById(R.id.parentPanel);
        View viewFindViewById3 = viewFindViewById2.findViewById(R.id.topPanel);
        View viewFindViewById4 = viewFindViewById2.findViewById(R.id.contentPanel);
        View viewFindViewById5 = viewFindViewById2.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById2.findViewById(R.id.customPanel);
        View view = c3067d.f38436f;
        if (view == null) {
            view = null;
        }
        boolean z2 = view != null;
        if (!z2 || !C3067d.a(view)) {
            window.setFlags(131072, 131072);
        }
        if (z2) {
            i5 = 2;
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.custom);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (c3067d.f38437g) {
                frameLayout.setPadding(0, 0, 0, 0);
            }
            if (c3067d.f38435e != null) {
                ((LinearLayout.LayoutParams) ((C3846x0) viewGroup.getLayoutParams())).weight = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
        } else {
            i5 = 2;
            viewGroup.setVisibility(8);
        }
        View viewFindViewById6 = viewGroup.findViewById(R.id.topPanel);
        View viewFindViewById7 = viewGroup.findViewById(R.id.contentPanel);
        View viewFindViewById8 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup viewGroupB = C3067d.b(viewFindViewById6, viewFindViewById3);
        ViewGroup viewGroupB2 = C3067d.b(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupB3 = C3067d.b(viewFindViewById8, viewFindViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        c3067d.f38446q = nestedScrollView;
        nestedScrollView.setFocusable(false);
        c3067d.f38446q.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroupB2.findViewById(android.R.id.message);
        c3067d.f38450u = textView;
        if (textView != null) {
            textView.setVisibility(8);
            c3067d.f38446q.removeView(c3067d.f38450u);
            if (c3067d.f38435e != null) {
                ViewGroup viewGroup2 = (ViewGroup) c3067d.f38446q.getParent();
                int iIndexOfChild = viewGroup2.indexOfChild(c3067d.f38446q);
                viewGroup2.removeViewAt(iIndexOfChild);
                viewGroup2.addView(c3067d.f38435e, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
            } else {
                viewGroupB2.setVisibility(8);
            }
        }
        Button button = (Button) viewGroupB3.findViewById(android.R.id.button1);
        c3067d.f38438h = button;
        F6.f fVar = c3067d.f38430E;
        button.setOnClickListener(fVar);
        if (TextUtils.isEmpty(c3067d.f38439i)) {
            c3067d.f38438h.setVisibility(8);
            i10 = 0;
        } else {
            c3067d.f38438h.setText(c3067d.f38439i);
            c3067d.f38438h.setVisibility(0);
            i10 = 1;
        }
        Button button2 = (Button) viewGroupB3.findViewById(android.R.id.button2);
        c3067d.k = button2;
        button2.setOnClickListener(fVar);
        if (TextUtils.isEmpty(c3067d.f38441l)) {
            c3067d.k.setVisibility(8);
        } else {
            c3067d.k.setText(c3067d.f38441l);
            c3067d.k.setVisibility(0);
            i10 |= 2;
        }
        Button button3 = (Button) viewGroupB3.findViewById(android.R.id.button3);
        c3067d.f38443n = button3;
        button3.setOnClickListener(fVar);
        if (TextUtils.isEmpty(c3067d.f38444o)) {
            c3067d.f38443n.setVisibility(8);
        } else {
            c3067d.f38443n.setText(c3067d.f38444o);
            c3067d.f38443n.setVisibility(0);
            i10 |= 4;
        }
        TypedValue typedValue = new TypedValue();
        c3067d.f38431a.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data == 0) {
            i11 = i5;
        } else if (i10 == 1) {
            Button button4 = c3067d.f38438h;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button4.getLayoutParams();
            layoutParams.gravity = 1;
            layoutParams.weight = 0.5f;
            button4.setLayoutParams(layoutParams);
            i11 = i5;
        } else {
            i11 = i5;
            if (i10 == i11) {
                Button button5 = c3067d.k;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button5.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button5.setLayoutParams(layoutParams2);
            } else if (i10 == 4) {
                Button button6 = c3067d.f38443n;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button6.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button6.setLayoutParams(layoutParams3);
            }
        }
        if (i10 == 0) {
            viewGroupB3.setVisibility(8);
        }
        if (c3067d.f38451v != null) {
            viewGroupB.addView(c3067d.f38451v, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            c3067d.f38448s = (ImageView) window.findViewById(android.R.id.icon);
            if (TextUtils.isEmpty(c3067d.f38434d) || !c3067d.f38428C) {
                window.findViewById(R.id.title_template).setVisibility(8);
                c3067d.f38448s.setVisibility(8);
                viewGroupB.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                c3067d.f38449t = textView2;
                textView2.setText(c3067d.f38434d);
                Drawable drawable = c3067d.f38447r;
                if (drawable != null) {
                    c3067d.f38448s.setImageDrawable(drawable);
                } else {
                    c3067d.f38449t.setPadding(c3067d.f38448s.getPaddingLeft(), c3067d.f38448s.getPaddingTop(), c3067d.f38448s.getPaddingRight(), c3067d.f38448s.getPaddingBottom());
                    c3067d.f38448s.setVisibility(8);
                }
            }
        }
        boolean z10 = viewGroup.getVisibility() != 8;
        int i12 = (viewGroupB == null || viewGroupB.getVisibility() == 8) ? 0 : 1;
        boolean z11 = viewGroupB3.getVisibility() != 8;
        if (!z11 && (viewFindViewById = viewGroupB2.findViewById(R.id.textSpacerNoButtons)) != null) {
            viewFindViewById.setVisibility(0);
        }
        if (i12 != 0) {
            NestedScrollView nestedScrollView2 = c3067d.f38446q;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View viewFindViewById9 = c3067d.f38435e != null ? viewGroupB.findViewById(R.id.titleDividerNoCustom) : null;
            if (viewFindViewById9 != null) {
                viewFindViewById9.setVisibility(0);
            }
        } else {
            View viewFindViewById10 = viewGroupB2.findViewById(R.id.textSpacerNoTitle);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = c3067d.f38435e;
        if (alertController$RecycleListView instanceof AlertController$RecycleListView) {
            alertController$RecycleListView.getClass();
            if (!z11 || i12 == 0) {
                alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i12 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.f17754a, alertController$RecycleListView.getPaddingRight(), z11 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.f17755b);
            }
        }
        if (!z10) {
            View view2 = c3067d.f38435e;
            if (view2 == null) {
                view2 = c3067d.f38446q;
            }
            if (view2 != null) {
                int i13 = i12 | (z11 ? i11 : 0);
                View viewFindViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                View viewFindViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                WeakHashMap weakHashMap = S.f38779a;
                K.b(view2, i13, 3);
                if (viewFindViewById11 != null) {
                    viewGroupB2.removeView(viewFindViewById11);
                }
                if (viewFindViewById12 != null) {
                    viewGroupB2.removeView(viewFindViewById12);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = c3067d.f38435e;
        if (alertController$RecycleListView2 == null || (listAdapter = c3067d.f38452w) == null) {
            return;
        }
        alertController$RecycleListView2.setAdapter(listAdapter);
        int i14 = c3067d.f38453x;
        if (i14 > -1) {
            alertController$RecycleListView2.setItemChecked(i14, true);
            alertController$RecycleListView2.setSelection(i14);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i5, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f38460f.f38446q;
        if (nestedScrollView == null || !nestedScrollView.j(keyEvent)) {
            return super.onKeyDown(i5, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i5, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f38460f.f38446q;
        if (nestedScrollView == null || !nestedScrollView.j(keyEvent)) {
            return super.onKeyUp(i5, keyEvent);
        }
        return true;
    }

    @Override // androidx.activity.m, android.app.Dialog
    public final void onStop() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onStop();
        w wVar = (w) c();
        wVar.B();
        H h10 = wVar.f38541o;
        if (h10 != null) {
            h10.f38408y = false;
            mc.b bVar = h10.f38407x;
            if (bVar != null) {
                bVar.a();
            }
        }
    }

    @Override // androidx.activity.m, android.app.Dialog
    public final void setContentView(int i5) {
        c().i(i5);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i5) {
        super.setTitle(i5);
        c().l(getContext().getString(i5));
    }

    @Override // androidx.activity.m, android.app.Dialog
    public final void setContentView(View view) {
        c().j(view);
    }

    @Override // androidx.activity.m, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        c().k(view, layoutParams);
    }

    @Override // android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        f(charSequence);
        C3067d c3067d = this.f38460f;
        c3067d.f38434d = charSequence;
        TextView textView = c3067d.f38449t;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
