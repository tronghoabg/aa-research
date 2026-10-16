package defpackage;

import androidx.car.app.model.Action;
import androidx.car.app.model.TabCallbackDelegateImpl;
import com.android.car.libraries.apphost.external.model.GoogleTabContents;
import com.android.car.libraries.apphost.external.model.GoogleTabTemplate;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class gjw {
    public final vu a;
    public boolean b;
    public Action c;
    public final List d = new ArrayList();
    public GoogleTabContents e;
    public String f;

    public gjw(wa waVar) {
        this.a = TabCallbackDelegateImpl.create(waVar);
    }

    public final GoogleTabTemplate a() {
        boolean z = false;
        if (this.e != null && !this.d.isEmpty()) {
            z = true;
        }
        boolean z2 = this.b;
        if (z2 && z) {
            throw new IllegalStateException("Template is in a loading state but tabs are added");
        }
        if (!z2 && !z) {
            throw new IllegalStateException("Template is not in a loading state but does not contain tabs or tab contents");
        }
        if (z && this.f == null) {
            throw new IllegalStateException("Template requires setting content ID for the active tab when not in Loading state");
        }
        if (z2 || this.c != null) {
            return new GoogleTabTemplate(this);
        }
        throw new IllegalArgumentException("Template requires a Header Action of TYPE_APP_ICON when not in Loading state");
    }
}
