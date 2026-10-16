package defpackage;

import android.content.Intent;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.carstream.tech.car.CarScreen;
import com.carstream.tech.car.e;
import com.carstream.tech.phone.MainActivity;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class aa implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fa b;

    public /* synthetic */ aa(fa faVar, int i) {
        this.a = i;
        this.b = faVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TextView textView;
        switch (this.a) {
            case 0:
                fa faVar = this.b;
                LinearLayout linearLayout = faVar.d;
                if (linearLayout != null && linearLayout.isShown() && (textView = faVar.k) != null) {
                    textView.setText(faVar.k());
                    faVar.l.postDelayed(this, 3000L);
                    break;
                } else {
                    faVar.m = false;
                    break;
                }
            case 1:
                e eVar = this.b.c;
                if (eVar != null) {
                    eVar.o();
                    break;
                }
                break;
            default:
                CarScreen carScreen = this.b.a;
                try {
                    Intent intent = new Intent(carScreen, (Class<?>) MainActivity.class);
                    intent.putExtra(MainActivity.EXTRA_PHONE_UI, true);
                    carScreen.startActivity(intent);
                    break;
                } catch (Throwable th) {
                    String.valueOf(th);
                }
        }
    }
}
