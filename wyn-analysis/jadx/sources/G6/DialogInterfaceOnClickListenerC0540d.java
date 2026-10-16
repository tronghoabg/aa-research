package G6;

import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: G6.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC0540d implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4587a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4588b;

    public /* synthetic */ DialogInterfaceOnClickListenerC0540d(Object obj, int i5) {
        this.f4587a = i5;
        this.f4588b = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i5) {
        switch (this.f4587a) {
            case 0:
                ((AtomicInteger) this.f4588b).set(i5);
                break;
            case 1:
                ((C0546j) this.f4588b).b();
                break;
            default:
                U u10 = C6.n.f1857D.f1863c;
                U.t((Context) this.f4588b, Uri.parse("https://support.google.com/dfp_premium/answer/7160685#push"));
                break;
        }
    }

    public DialogInterfaceOnClickListenerC0540d(RunnableC0548l runnableC0548l, Context context) {
        this.f4587a = 2;
        this.f4588b = context;
    }
}
