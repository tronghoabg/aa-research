package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.InProductHelp;
import com.google.android.gms.googlehelp.internal.common.TogglingData;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class sry extends sse {
    final /* synthetic */ Intent a;
    final /* synthetic */ WeakReference b;
    final /* synthetic */ thg c;

    public sry(Intent intent, WeakReference weakReference, thg thgVar) {
        this.a = intent;
        this.b = weakReference;
        this.c = thgVar;
    }

    @Override // defpackage.sse
    public final void c(GoogleHelp googleHelp) {
        GoogleHelp googleHelp2;
        ViewGroup viewGroup;
        Intent intent = this.a;
        long jNanoTime = System.nanoTime();
        intent.putExtra("EXTRA_START_TICK", jNanoTime);
        Activity activity = (Activity) this.b.get();
        if (activity == null) {
            return;
        }
        thg thgVar = this.c;
        if (thgVar != null) {
            Context applicationContext = activity.getApplicationContext();
            googleHelp.B = true;
            googleHelp2 = googleHelp;
            std.d(new srt(applicationContext, googleHelp2, thgVar, jNanoTime, 1));
            std.d(new srt(applicationContext, googleHelp2, thgVar, jNanoTime, 0));
        } else {
            googleHelp2 = googleHelp;
        }
        googleHelp2.z = sjv.b;
        TogglingData togglingData = googleHelp2.w;
        if (togglingData != null) {
            String string = activity.getTitle().toString();
            int identifier = activity.getResources().getIdentifier("action_bar", "id", activity.getPackageName());
            if (identifier != 0 && (viewGroup = (ViewGroup) activity.findViewById(identifier)) != null) {
                int i = 0;
                while (true) {
                    if (i >= viewGroup.getChildCount()) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt instanceof TextView) {
                        string = ((TextView) childAt).getText().toString();
                        break;
                    }
                    i++;
                }
            }
            togglingData.c = string;
        }
        if (intent.hasExtra("EXTRA_GOOGLE_HELP")) {
            intent.putExtra("EXTRA_GOOGLE_HELP", googleHelp2);
        } else if (intent.hasExtra("EXTRA_IN_PRODUCT_HELP")) {
            Parcelable.Creator<InProductHelp> creator = InProductHelp.CREATOR;
            byte[] byteArrayExtra = intent.getByteArrayExtra("EXTRA_IN_PRODUCT_HELP");
            InProductHelp inProductHelp = (InProductHelp) (byteArrayExtra == null ? null : spu.h(byteArrayExtra, creator));
            inProductHelp.a = googleHelp2;
            intent.putExtra("EXTRA_IN_PRODUCT_HELP", spu.k(inProductHelp));
        }
        new sss(Looper.getMainLooper()).post(new sbj(activity, intent, 10));
    }
}
