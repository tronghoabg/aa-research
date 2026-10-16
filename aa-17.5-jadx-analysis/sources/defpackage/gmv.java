package defpackage;

import androidx.car.app.model.Action;
import androidx.car.app.model.Tab;
import androidx.car.app.model.TabTemplate;
import com.android.car.libraries.apphost.internal.model.TabContentsInternal;
import com.android.car.libraries.apphost.internal.model.TabInternal;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class gmv {
    public final vu a;
    public boolean b;
    public Action c;
    public List d = new ArrayList();
    public TabContentsInternal e;
    public String f;

    public gmv(wa waVar) {
        vz vzVar = new vz(waVar);
        vzVar.b = true;
        this.a = new TabTemplate(vzVar).getTabCallbackDelegate();
    }

    public final void a(Tab tab) {
        this.d.add(new TabInternal(tab.getTitle(), tab.getIcon(), tab.getContentId()));
    }

    public final void b(List list) {
        this.d = woy.ch(list);
    }

    public gmv(vu vuVar) {
        this.a = vuVar;
    }
}
