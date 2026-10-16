package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class en extends defpackage.fh implements android.content.DialogInterface {
    final android.support.v7.app.AlertController a;

    protected en(android.content.Context context, int i) {
        super(context, a(context, i));
        this.a = new android.support.v7.app.AlertController(getContext(), this, getWindow());
    }

    static int a(android.content.Context context, int i) {
        if ((i >>> 24) > 0) {
            return i;
        }
        android.util.TypedValue typedValue = new android.util.TypedValue();
        context.getTheme().resolveAttribute(com.google.android.projection.gearhead.R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public final android.widget.ListView b() {
        return this.a.f;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0055  */
    /* JADX WARN: Code duplicated, block: B:17:0x006c  */
    /* JADX WARN: Code duplicated, block: B:46:0x018b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x018d  */
    @Override // defpackage.fh, defpackage.of, android.app.Dialog
    protected final void onCreate(android.os.Bundle bundle) {
        int i;
        android.view.View viewFindViewById;
        android.widget.ListAdapter listAdapter;
        int i2;
        android.view.View viewFindViewById2;
        super.onCreate(bundle);
        android.support.v7.app.AlertController alertController = this.a;
        int i3 = alertController.A;
        alertController.b.setContentView(alertController.z);
        android.view.Window window = alertController.c;
        android.view.View viewFindViewById3 = window.findViewById(com.google.android.projection.gearhead.R.id.parentPanel);
        android.view.View viewFindViewById4 = viewFindViewById3.findViewById(com.google.android.projection.gearhead.R.id.topPanel);
        android.view.View viewFindViewById5 = viewFindViewById3.findViewById(com.google.android.projection.gearhead.R.id.contentPanel);
        android.view.View viewFindViewById6 = viewFindViewById3.findViewById(com.google.android.projection.gearhead.R.id.buttonPanel);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) viewFindViewById3.findViewById(com.google.android.projection.gearhead.R.id.customPanel);
        android.view.View view = alertController.g;
        if (view == null) {
            view = null;
        }
        boolean z = view != null;
        if (z && android.support.v7.app.AlertController.b(view)) {
            ((android.widget.FrameLayout) window.findViewById(com.google.android.projection.gearhead.R.id.custom)).addView(view, new android.view.ViewGroup.LayoutParams(-1, -1));
            boolean z2 = alertController.h;
            if (alertController.f != null) {
                ((defpackage.le) viewGroup.getLayoutParams()).weight = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
            }
        } else {
            window.setFlags(131072, 131072);
            if (z) {
                ((android.widget.FrameLayout) window.findViewById(com.google.android.projection.gearhead.R.id.custom)).addView(view, new android.view.ViewGroup.LayoutParams(-1, -1));
                boolean z3 = alertController.h;
                if (alertController.f != null) {
                    ((defpackage.le) viewGroup.getLayoutParams()).weight = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
                }
            } else {
                viewGroup.setVisibility(8);
            }
        }
        android.view.View viewFindViewById7 = viewGroup.findViewById(com.google.android.projection.gearhead.R.id.topPanel);
        android.view.View viewFindViewById8 = viewGroup.findViewById(com.google.android.projection.gearhead.R.id.contentPanel);
        android.view.View viewFindViewById9 = viewGroup.findViewById(com.google.android.projection.gearhead.R.id.buttonPanel);
        android.view.ViewGroup viewGroupD = android.support.v7.app.AlertController.d(viewFindViewById7, viewFindViewById4);
        android.view.ViewGroup viewGroupD2 = android.support.v7.app.AlertController.d(viewFindViewById8, viewFindViewById5);
        android.view.ViewGroup viewGroupD3 = android.support.v7.app.AlertController.d(viewFindViewById9, viewFindViewById6);
        alertController.q = (androidx.core.widget.NestedScrollView) window.findViewById(com.google.android.projection.gearhead.R.id.scrollView);
        alertController.q.setFocusable(false);
        alertController.q.setNestedScrollingEnabled(false);
        alertController.v = (android.widget.TextView) viewGroupD2.findViewById(android.R.id.message);
        android.widget.TextView textView = alertController.v;
        if (textView != null) {
            java.lang.CharSequence charSequence = alertController.e;
            if (charSequence != null) {
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
                alertController.q.removeView(alertController.v);
                if (alertController.f != null) {
                    android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) alertController.q.getParent();
                    int iIndexOfChild = viewGroup2.indexOfChild(alertController.q);
                    viewGroup2.removeViewAt(iIndexOfChild);
                    viewGroup2.addView(alertController.f, iIndexOfChild, new android.view.ViewGroup.LayoutParams(-1, -1));
                } else {
                    viewGroupD2.setVisibility(8);
                }
            }
        }
        alertController.i = (android.widget.Button) viewGroupD3.findViewById(android.R.id.button1);
        android.widget.Button button = alertController.i;
        android.view.View.OnClickListener onClickListener = alertController.H;
        button.setOnClickListener(onClickListener);
        if (android.text.TextUtils.isEmpty(alertController.j)) {
            alertController.i.setVisibility(8);
            i = 0;
        } else {
            alertController.i.setText(alertController.j);
            alertController.i.setVisibility(0);
            i = 1;
        }
        alertController.l = (android.widget.Button) viewGroupD3.findViewById(android.R.id.button2);
        alertController.l.setOnClickListener(onClickListener);
        if (android.text.TextUtils.isEmpty(alertController.m)) {
            alertController.l.setVisibility(8);
        } else {
            alertController.l.setText(alertController.m);
            alertController.l.setVisibility(0);
            i |= 2;
        }
        alertController.o = (android.widget.Button) viewGroupD3.findViewById(android.R.id.button3);
        alertController.o.setOnClickListener(onClickListener);
        java.lang.CharSequence charSequence2 = alertController.p;
        alertController.o.setVisibility(8);
        android.content.Context context = alertController.a;
        android.util.TypedValue typedValue = new android.util.TypedValue();
        context.getTheme().resolveAttribute(com.google.android.projection.gearhead.R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data == 0) {
            if (i == 0) {
                viewGroupD3.setVisibility(8);
            }
        } else if (i == 1) {
            android.support.v7.app.AlertController.c(alertController.i);
        } else if (i == 2) {
            android.support.v7.app.AlertController.c(alertController.l);
        } else if (i == 4) {
            android.support.v7.app.AlertController.c(alertController.o);
        } else if (i == 0) {
            viewGroupD3.setVisibility(8);
        }
        if (alertController.w != null) {
            viewGroupD.addView(alertController.w, 0, new android.view.ViewGroup.LayoutParams(-1, -2));
            window.findViewById(com.google.android.projection.gearhead.R.id.title_template).setVisibility(8);
        } else {
            alertController.t = (android.widget.ImageView) window.findViewById(android.R.id.icon);
            if (android.text.TextUtils.isEmpty(alertController.d) || !alertController.F) {
                window.findViewById(com.google.android.projection.gearhead.R.id.title_template).setVisibility(8);
                alertController.t.setVisibility(8);
                viewGroupD.setVisibility(8);
            } else {
                alertController.u = (android.widget.TextView) window.findViewById(com.google.android.projection.gearhead.R.id.alertTitle);
                alertController.u.setText(alertController.d);
                int i4 = alertController.r;
                android.graphics.drawable.Drawable drawable = alertController.s;
                if (drawable != null) {
                    alertController.t.setImageDrawable(drawable);
                } else {
                    alertController.u.setPadding(alertController.t.getPaddingLeft(), alertController.t.getPaddingTop(), alertController.t.getPaddingRight(), alertController.t.getPaddingBottom());
                    alertController.t.setVisibility(8);
                }
            }
        }
        boolean z4 = (viewGroup == null || viewGroup.getVisibility() == 8) ? false : true;
        int i5 = (viewGroupD == null || viewGroupD.getVisibility() == 8) ? 0 : 1;
        boolean z5 = (viewGroupD3 == null || viewGroupD3.getVisibility() == 8) ? false : true;
        if (!z5 && viewGroupD2 != null && (viewFindViewById2 = viewGroupD2.findViewById(com.google.android.projection.gearhead.R.id.textSpacerNoButtons)) != null) {
            viewFindViewById2.setVisibility(0);
        }
        if (i5 != 0) {
            androidx.core.widget.NestedScrollView nestedScrollView = alertController.q;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            android.view.View viewFindViewById10 = (alertController.e == null && alertController.f == null) ? null : viewGroupD.findViewById(com.google.android.projection.gearhead.R.id.titleDividerNoCustom);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        } else if (viewGroupD2 != null && (viewFindViewById = viewGroupD2.findViewById(com.google.android.projection.gearhead.R.id.textSpacerNoTitle)) != null) {
            viewFindViewById.setVisibility(0);
        }
        android.widget.ListView listView = alertController.f;
        if (listView instanceof android.support.v7.app.AlertController.RecycleListView) {
            if (!z5) {
                i2 = i5;
            } else if (i5 == 0) {
                i2 = 0;
            }
            android.support.v7.app.AlertController.RecycleListView recycleListView = (android.support.v7.app.AlertController.RecycleListView) listView;
            recycleListView.setPadding(recycleListView.getPaddingLeft(), i2 != 0 ? recycleListView.getPaddingTop() : recycleListView.a, recycleListView.getPaddingRight(), z5 ? recycleListView.getPaddingBottom() : recycleListView.b);
        }
        if (!z4) {
            android.view.View view2 = alertController.f;
            if (view2 == null) {
                view2 = alertController.q;
            }
            if (view2 != null) {
                int i6 = i5 | (true == z5 ? 2 : 0);
                android.view.View viewFindViewById11 = window.findViewById(com.google.android.projection.gearhead.R.id.scrollIndicatorUp);
                android.view.View viewFindViewById12 = window.findViewById(com.google.android.projection.gearhead.R.id.scrollIndicatorDown);
                int[] iArr = defpackage.ebt.a;
                view2.setScrollIndicators(i6, 3);
                if (viewFindViewById11 != null) {
                    viewGroupD2.removeView(viewFindViewById11);
                }
                if (viewFindViewById12 != null) {
                    viewGroupD2.removeView(viewFindViewById12);
                }
            }
        }
        android.widget.ListView listView2 = alertController.f;
        if (listView2 == null || (listAdapter = alertController.x) == null) {
            return;
        }
        listView2.setAdapter(listAdapter);
        int i7 = alertController.y;
        if (i7 >= 0) {
            listView2.setItemChecked(i7, true);
            listView2.setSelection(i7);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, android.view.KeyEvent keyEvent) {
        androidx.core.widget.NestedScrollView nestedScrollView = this.a.q;
        if (nestedScrollView == null || !nestedScrollView.n(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, android.view.KeyEvent keyEvent) {
        androidx.core.widget.NestedScrollView nestedScrollView = this.a.q;
        if (nestedScrollView == null || !nestedScrollView.n(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    @Override // defpackage.fh, android.app.Dialog
    public final void setTitle(java.lang.CharSequence charSequence) {
        super.setTitle(charSequence);
        this.a.a(charSequence);
    }
}
