package defpackage;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.LinkedList;

/* loaded from: classes2.dex */
public abstract class sqg {
    public sqk a;
    public Bundle b;
    public LinkedList c;
    private final ykd d = new ykd(this, null);

    public static void l(FrameLayout frameLayout) {
        sjv sjvVar = sjv.a;
        Context context = frameLayout.getContext();
        int iK = sjvVar.k(context);
        String strC = sns.c(context, iK);
        String strB = sns.b(context, iK);
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout);
        TextView textView = new TextView(frameLayout.getContext());
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        textView.setText(strC);
        linearLayout.addView(textView);
        Intent intentM = sjvVar.m(context, iK, null);
        if (intentM != null) {
            Button button = new Button(context);
            button.setId(R.id.button1);
            button.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            button.setText(strB);
            linearLayout.addView(button);
            button.setOnClickListener(new sqd(context, intentM, 0));
        }
    }

    private final void n(int i) {
        while (!this.c.isEmpty() && ((sqf) this.c.getLast()).a() >= i) {
            this.c.removeLast();
        }
    }

    private final void o(Bundle bundle, sqf sqfVar) {
        if (this.a != null) {
            sqfVar.b();
            return;
        }
        LinkedList linkedList = this.c;
        if (linkedList == null) {
            linkedList = new LinkedList();
            this.c = linkedList;
        }
        linkedList.add(sqfVar);
        if (bundle != null) {
            Bundle bundle2 = this.b;
            if (bundle2 == null) {
                this.b = (Bundle) bundle.clone();
            } else {
                bundle2.putAll(bundle);
            }
        }
        m(this.d);
    }

    @ResultIgnorabilityUnspecified
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        o(bundle, new sqc(this, frameLayout, layoutInflater, viewGroup, bundle));
        if (this.a == null) {
            l(frameLayout);
        }
        return frameLayout;
    }

    public final void b(Bundle bundle) {
        o(bundle, new sqb(this, bundle));
    }

    public final void c() {
        sqk sqkVar = this.a;
        if (sqkVar != null) {
            sqkVar.onDestroy();
        } else {
            n(1);
        }
    }

    public final void d() {
        sqk sqkVar = this.a;
        if (sqkVar != null) {
            sqkVar.onDestroyView();
        } else {
            n(2);
        }
    }

    public final void e(Activity activity, Bundle bundle, Bundle bundle2) {
        o(bundle2, new sqa(this, activity, bundle, bundle2));
    }

    public final void f() {
        sqk sqkVar = this.a;
        if (sqkVar != null) {
            sqkVar.onLowMemory();
        }
    }

    public final void g() {
        sqk sqkVar = this.a;
        if (sqkVar != null) {
            sqkVar.onPause();
        } else {
            n(5);
        }
    }

    public final void h() {
        o(null, new sqe(this, 0));
    }

    public final void i(Bundle bundle) {
        sqk sqkVar = this.a;
        if (sqkVar != null) {
            sqkVar.onSaveInstanceState(bundle);
            return;
        }
        Bundle bundle2 = this.b;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
    }

    public final void j() {
        o(null, new sqe(this, 1));
    }

    public final void k() {
        sqk sqkVar = this.a;
        if (sqkVar != null) {
            sqkVar.onStop();
        } else {
            n(4);
        }
    }

    protected abstract void m(ykd ykdVar);
}
