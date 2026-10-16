package G6;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import j$.util.Objects;

/* renamed from: G6.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC0548l implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f4614a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f4615b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f4616c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f4617d;

    public RunnableC0548l(C0549m c0549m, Context context, String str, boolean z2, boolean z10) {
        this.f4614a = context;
        this.f4615b = str;
        this.f4616c = z2;
        this.f4617d = z10;
        Objects.requireNonNull(c0549m);
    }

    @Override // java.lang.Runnable
    public final void run() {
        U u10 = C6.n.f1857D.f1863c;
        Context context = this.f4614a;
        AlertDialog.Builder builderK = U.k(context);
        builderK.setMessage(this.f4615b);
        if (this.f4616c) {
            builderK.setTitle("Error");
        } else {
            builderK.setTitle("Info");
        }
        if (this.f4617d) {
            builderK.setNeutralButton("Dismiss", (DialogInterface.OnClickListener) null);
        } else {
            builderK.setPositiveButton("Learn More", new DialogInterfaceOnClickListenerC0540d(this, context));
            builderK.setNegativeButton("Dismiss", (DialogInterface.OnClickListener) null);
        }
        builderK.create().show();
    }
}
