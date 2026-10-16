package com.waze.sharedui.d.a;

import android.R;
import android.content.DialogInterface;
import android.support.v7.app.l;
import android.text.util.Linkify;
import android.widget.TextView;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class c implements DialogInterface {

    /* renamed from: a, reason: collision with root package name */
    private final l f38854a;

    /* synthetic */ c(b bVar) {
        b.a(bVar).z(new a(0));
        this.f38854a = b.a(bVar).b();
    }

    public final void a() {
        l lVar = this.f38854a;
        lVar.show();
        TextView textView = (TextView) lVar.findViewById(R.id.message);
        if (textView != null) {
            Linkify.addLinks(textView, 1);
        }
    }

    public final void b() {
        this.f38854a.setCanceledOnTouchOutside(true);
    }

    @Override // android.content.DialogInterface
    public final void cancel() {
        this.f38854a.cancel();
    }

    @Override // android.content.DialogInterface
    public final void dismiss() {
        this.f38854a.dismiss();
    }
}
