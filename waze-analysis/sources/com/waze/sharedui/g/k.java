package com.waze.sharedui.g;

import android.content.Context;
import android.content.DialogInterface;
import com.waze.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    private final Context f38973a;

    /* renamed from: b, reason: collision with root package name */
    private int f38974b;

    /* renamed from: c, reason: collision with root package name */
    private String f38975c;

    /* renamed from: d, reason: collision with root package name */
    private CharSequence f38976d;

    /* renamed from: e, reason: collision with root package name */
    private final List f38977e = new ArrayList(2);

    /* renamed from: f, reason: collision with root package name */
    private DialogInterface.OnCancelListener f38978f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f38979g;

    public k(Context context) {
        this.f38973a = context;
    }

    public final n a() {
        int i2 = this.f38974b;
        String str = this.f38975c;
        CharSequence charSequence = this.f38976d;
        List list = this.f38977e;
        boolean z = true;
        if (!this.f38979g && !list.isEmpty()) {
            z = false;
        }
        n nVar = new n(this.f38973a, i2, str, charSequence, list, z, this.f38978f);
        nVar.a();
        nVar.setOnDismissListener(null);
        return nVar;
    }

    public final void b(m mVar) {
        this.f38977e.add(mVar);
    }

    public final void c() {
        this.f38979g = true;
    }

    public final void d(CharSequence charSequence) {
        this.f38976d = charSequence;
    }

    public final void e(DialogInterface.OnCancelListener onCancelListener) {
        this.f38978f = onCancelListener;
    }

    public final void f(String str) {
        this.f38975c = str;
    }

    public final void g() {
        this.f38974b = R.drawable.addid;
    }
}
