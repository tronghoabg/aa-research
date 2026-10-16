package defpackage;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatSpinner;
import android.util.Log;
import android.widget.ListAdapter;
import android.widget.ListView;

/* loaded from: classes2.dex */
public final class jo implements DialogInterface.OnClickListener, js {
    en a;
    final /* synthetic */ AppCompatSpinner b;
    private ListAdapter c;
    private CharSequence d;

    public jo(AppCompatSpinner appCompatSpinner) {
        this.b = appCompatSpinner;
    }

    @Override // defpackage.js
    public final int a() {
        return 0;
    }

    @Override // defpackage.js
    public final int b() {
        return 0;
    }

    @Override // defpackage.js
    public final Drawable c() {
        return null;
    }

    @Override // defpackage.js
    public final CharSequence d() {
        return this.d;
    }

    @Override // defpackage.js
    public final void e(ListAdapter listAdapter) {
        this.c = listAdapter;
    }

    @Override // defpackage.js
    public final void f(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.js
    public final void g(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.js
    public final void h(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.js
    public final void i(CharSequence charSequence) {
        this.d = charSequence;
    }

    @Override // defpackage.js
    public final void j(int i) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.js
    public final void k() {
        en enVar = this.a;
        if (enVar != null) {
            enVar.dismiss();
            this.a = null;
        }
    }

    @Override // defpackage.js
    public final void l(int i, int i2) {
        if (this.c == null) {
            return;
        }
        AppCompatSpinner appCompatSpinner = this.b;
        em emVar = new em(appCompatSpinner.a);
        CharSequence charSequence = this.d;
        if (charSequence != null) {
            emVar.o(charSequence);
        }
        ListAdapter listAdapter = this.c;
        int selectedItemPosition = appCompatSpinner.getSelectedItemPosition();
        ej ejVar = emVar.a;
        ejVar.p = listAdapter;
        ejVar.q = this;
        ejVar.v = selectedItemPosition;
        ejVar.u = true;
        en enVarB = emVar.b();
        this.a = enVarB;
        ListView listViewB = enVarB.b();
        listViewB.setTextDirection(i);
        listViewB.setTextAlignment(i2);
        this.a.show();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        AppCompatSpinner appCompatSpinner = this.b;
        appCompatSpinner.setSelection(i);
        if (appCompatSpinner.getOnItemClickListener() != null) {
            appCompatSpinner.performItemClick(null, i, this.c.getItemId(i));
        }
        k();
    }

    @Override // defpackage.js
    public final boolean u() {
        en enVar = this.a;
        if (enVar != null) {
            return enVar.isShowing();
        }
        return false;
    }
}
