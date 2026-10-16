package defpackage;

import android.os.SystemClock;
import android.view.KeyEvent;
import androidx.car.app.model.OnClickListener;
import com.carstream.tech.surf.a;
import com.carstream.tech.surf.c;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class jb implements OnClickListener {
    public final /* synthetic */ c a;

    public jb(c cVar) {
        this.a = cVar;
    }

    @Override // androidx.car.app.model.OnClickListener
    public final void onClick() {
        c cVar = this.a;
        a aVar = cVar.a;
        boolean zOnKeyUp = false;
        if (aVar.h != null) {
            try {
                long jUptimeMillis = SystemClock.uptimeMillis();
                if (aVar.h.onKeyDown(4, new KeyEvent(jUptimeMillis, jUptimeMillis, 0, 4, 0))) {
                    zOnKeyUp = true;
                } else {
                    zOnKeyUp = aVar.h.onKeyUp(4, new KeyEvent(jUptimeMillis, jUptimeMillis, 1, 4, 0));
                }
            } catch (Throwable th) {
                String.valueOf(th);
            }
        }
        if (zOnKeyUp) {
            return;
        }
        cVar.getScreenManager().pop();
    }
}
