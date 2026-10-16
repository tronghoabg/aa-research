package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class sre {
    public defpackage.sri a;
    public android.os.Bundle b;
    public java.util.LinkedList c;
    private final defpackage.xei d = new defpackage.xei(this);

    public static void l(android.widget.FrameLayout frameLayout) {
        defpackage.skr skrVar = defpackage.skr.a;
        android.content.Context context = frameLayout.getContext();
        int iK = skrVar.k(context);
        java.lang.String strC = defpackage.son.c(context, iK);
        java.lang.String strB = defpackage.son.b(context, iK);
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(frameLayout.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout);
        android.widget.TextView textView = new android.widget.TextView(frameLayout.getContext());
        textView.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-2, -2));
        textView.setText(strC);
        linearLayout.addView(textView);
        android.content.Intent intentM = skrVar.m(context, iK, null);
        if (intentM != null) {
            android.widget.Button button = new android.widget.Button(context);
            button.setId(android.R.id.button1);
            button.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-2, -2));
            button.setText(strB);
            linearLayout.addView(button);
            button.setOnClickListener(new defpackage.srb(context, intentM, 0));
        }
    }

    private final void n(int i) {
        while (!this.c.isEmpty() && ((defpackage.srd) this.c.getLast()).a() >= i) {
            this.c.removeLast();
        }
    }

    private final void o(android.os.Bundle bundle, defpackage.srd srdVar) {
        if (this.a != null) {
            srdVar.b();
            return;
        }
        java.util.LinkedList linkedList = this.c;
        if (linkedList == null) {
            linkedList = new java.util.LinkedList();
            this.c = linkedList;
        }
        linkedList.add(srdVar);
        if (bundle != null) {
            android.os.Bundle bundle2 = this.b;
            if (bundle2 == null) {
                this.b = (android.os.Bundle) bundle.clone();
            } else {
                bundle2.putAll(bundle);
            }
        }
        m(this.d);
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final android.view.View a(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(layoutInflater.getContext());
        o(bundle, new defpackage.sra(this, frameLayout, layoutInflater, viewGroup, bundle));
        if (this.a == null) {
            l(frameLayout);
        }
        return frameLayout;
    }

    public final void b(android.os.Bundle bundle) {
        o(bundle, new defpackage.sqz(this, bundle));
    }

    public final void c() {
        defpackage.sri sriVar = this.a;
        if (sriVar != null) {
            sriVar.onDestroy();
        } else {
            n(1);
        }
    }

    public final void d() {
        defpackage.sri sriVar = this.a;
        if (sriVar != null) {
            sriVar.onDestroyView();
        } else {
            n(2);
        }
    }

    public final void e(android.app.Activity activity, android.os.Bundle bundle, android.os.Bundle bundle2) {
        o(bundle2, new defpackage.sqy(this, activity, bundle, bundle2));
    }

    public final void f() {
        defpackage.sri sriVar = this.a;
        if (sriVar != null) {
            sriVar.onLowMemory();
        }
    }

    public final void g() {
        defpackage.sri sriVar = this.a;
        if (sriVar != null) {
            sriVar.onPause();
        } else {
            n(5);
        }
    }

    public final void h() {
        o(null, new defpackage.src(this, 0));
    }

    public final void i(android.os.Bundle bundle) {
        defpackage.sri sriVar = this.a;
        if (sriVar != null) {
            sriVar.onSaveInstanceState(bundle);
            return;
        }
        android.os.Bundle bundle2 = this.b;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
    }

    public final void j() {
        o(null, new defpackage.src(this, 1));
    }

    public final void k() {
        defpackage.sri sriVar = this.a;
        if (sriVar != null) {
            sriVar.onStop();
        } else {
            n(4);
        }
    }

    protected abstract void m(defpackage.xei xeiVar);
}
