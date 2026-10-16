package defpackage;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.text.Spanned;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.apps.auto.components.settings.interactivetroubleshooter.ChargeOnlyFragment;
import com.google.android.gearhead.appdecor.CarUiEntry;
import com.google.android.gearhead.appdecor.StatusBarView;
import com.google.android.projection.gearhead.R;
import j$.time.Duration;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class whk {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public whk(CarUiEntry carUiEntry, ImageView imageView, ViewGroup viewGroup) {
        this.b = imageView;
        this.a = viewGroup;
        this.c = carUiEntry;
    }

    public final void a(boolean z) {
        if (((AtomicBoolean) this.b).getAndSet(true)) {
            return;
        }
        Duration durationC = ((xya) this.a).c();
        Duration duration = ChargeOnlyFragment.h;
        long millis = durationC.compareTo(duration) >= 0 ? 0L : duration.minus(durationC).toMillis();
        Object obj = this.c;
        if (!z) {
            ((ChargeOnlyFragment) obj).j.postDelayed(new mhr(obj, 4), millis);
            return;
        }
        Fragment fragment = (Fragment) obj;
        ols.M(fragment.requireContext(), yxi.INTERACTIVE_TROUBLESHOOTER_CHARGE_ONLY_DETECTED);
        Spanned spannedFromHtml = Html.fromHtml(fragment.requireContext().getString(R.string.charge_only_failure_message, acxj.d()));
        Bundle bundle = new Bundle();
        bundle.putInt("title_string_resource", R.string.charge_only_failure_title);
        bundle.putCharSequence("message_key", spannedFromHtml);
        ((ChargeOnlyFragment) obj).j.postDelayed(new mgw(obj, bundle, 6), millis);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.lang.Runnable] */
    public final void b() {
        ?? r0 = this.a;
        if (r0 != 0) {
            r0.run();
            return;
        }
        ?? r02 = this.b;
        ((fgc) this.c).o();
        r02.run();
    }

    public whk(CarUiEntry carUiEntry, StatusBarView statusBarView, lay layVar) {
        this.c = statusBarView;
        this.a = layVar;
        this.b = carUiEntry;
    }

    public whk(Object obj, Object obj2, Object obj3) {
        this.a = obj2;
        this.b = obj3;
        this.c = obj;
    }

    public /* synthetic */ whk(Object obj, Object obj2, Object obj3, byte[] bArr) {
        this.c = obj;
        this.b = obj2;
        this.a = obj3;
    }

    public /* synthetic */ whk(Runnable runnable, fgc fgcVar, Runnable runnable2) {
        this.a = runnable;
        this.c = fgcVar;
        this.b = runnable2;
    }

    public whk(qn qnVar, aitx aitxVar, bym bymVar) {
        this.c = qnVar;
        this.a = aitxVar;
        this.b = bymVar;
    }
}
