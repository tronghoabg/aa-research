package android.support.v7.widget;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import android.widget.ListView;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class av implements DialogInterface.OnClickListener, bc {

    /* renamed from: a, reason: collision with root package name */
    android.support.v7.app.l f1089a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bd f1090b;

    /* renamed from: c, reason: collision with root package name */
    private ListAdapter f1091c;

    /* renamed from: d, reason: collision with root package name */
    private CharSequence f1092d;

    av(bd bdVar) {
        this.f1090b = bdVar;
    }

    @Override // android.support.v7.widget.bc
    public final int bi() {
        return 0;
    }

    @Override // android.support.v7.widget.bc
    public final int bj() {
        return 0;
    }

    @Override // android.support.v7.widget.bc
    public final Drawable c() {
        return null;
    }

    @Override // android.support.v7.widget.bc
    public final CharSequence d() {
        return this.f1092d;
    }

    @Override // android.support.v7.widget.bc
    public final void e(ListAdapter listAdapter) {
        this.f1091c = listAdapter;
    }

    @Override // android.support.v7.widget.bc
    public final void f(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // android.support.v7.widget.bc
    public final void g(int i2) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // android.support.v7.widget.bc
    public final void h(int i2) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // android.support.v7.widget.bc
    public final void i(CharSequence charSequence) {
        this.f1092d = charSequence;
    }

    @Override // android.support.v7.widget.bc
    public final void j(int i2) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // android.support.v7.widget.bc
    public final void k() {
        android.support.v7.app.l lVar = this.f1089a;
        if (lVar != null) {
            lVar.dismiss();
            this.f1089a = null;
        }
    }

    @Override // android.support.v7.widget.bc
    public final void l(int i2, int i3) {
        if (this.f1091c == null) {
            return;
        }
        bd bdVar = this.f1090b;
        android.support.v7.app.k kVar = new android.support.v7.app.k(bdVar.getPopupContext());
        CharSequence charSequence = this.f1092d;
        if (charSequence != null) {
            kVar.s(charSequence);
        }
        kVar.q(this.f1091c, bdVar.getSelectedItemPosition(), this);
        android.support.v7.app.l lVarB = kVar.b();
        this.f1089a = lVarB;
        ListView listViewB = lVarB.b();
        listViewB.setTextDirection(i2);
        listViewB.setTextAlignment(i3);
        this.f1089a.show();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        bd bdVar = this.f1090b;
        bdVar.setSelection(i2);
        if (bdVar.getOnItemClickListener() != null) {
            bdVar.performItemClick(null, i2, this.f1091c.getItemId(i2));
        }
        k();
    }

    @Override // android.support.v7.widget.bc
    public final boolean u() {
        android.support.v7.app.l lVar = this.f1089a;
        if (lVar != null) {
            return lVar.isShowing();
        }
        return false;
    }
}
