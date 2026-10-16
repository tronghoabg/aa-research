package A1;

import android.widget.EditText;
import androidx.appcompat.widget.SwitchCompat;
import java.lang.ref.WeakReference;
import y1.AbstractC4524e;

/* loaded from: classes.dex */
public final class h extends AbstractC4524e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f249a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f250b;

    public h(EditText editText) {
        this.f250b = new WeakReference(editText);
    }

    @Override // y1.AbstractC4524e
    public void a() {
        switch (this.f249a) {
            case 1:
                SwitchCompat switchCompat = (SwitchCompat) this.f250b.get();
                if (switchCompat != null) {
                    switchCompat.c();
                    break;
                }
                break;
        }
    }

    @Override // y1.AbstractC4524e
    public final void b() {
        switch (this.f249a) {
            case 0:
                i.a((EditText) this.f250b.get(), 1);
                break;
            default:
                SwitchCompat switchCompat = (SwitchCompat) this.f250b.get();
                if (switchCompat != null) {
                    switchCompat.c();
                    break;
                }
                break;
        }
    }

    public h(SwitchCompat switchCompat) {
        this.f250b = new WeakReference(switchCompat);
    }
}
