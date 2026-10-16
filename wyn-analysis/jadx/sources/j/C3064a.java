package j;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* renamed from: j.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3064a implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3067d f38410a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3065b f38411b;

    public C3064a(C3065b c3065b, C3067d c3067d) {
        this.f38411b = c3065b;
        this.f38410a = c3067d;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i5, long j8) {
        C3065b c3065b = this.f38411b;
        DialogInterface.OnClickListener onClickListener = c3065b.f38422l;
        C3067d c3067d = this.f38410a;
        onClickListener.onClick(c3067d.f38432b, i5);
        if (c3065b.f38424n) {
            return;
        }
        c3067d.f38432b.dismiss();
    }
}
