package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Set;

/* loaded from: classes2.dex */
public final class dss {
    public int a;
    public boolean b;
    private final IconCompat c;
    private final CharSequence d;
    private final PendingIntent e;
    private boolean f;
    private final Bundle g;
    private ArrayList h;
    private boolean i;

    private dss(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle) {
        this.f = true;
        this.i = true;
        this.c = iconCompat;
        this.d = dsx.c(charSequence);
        this.e = pendingIntent;
        this.g = bundle;
        this.h = null;
        this.f = true;
        this.a = 0;
        this.i = true;
        this.b = false;
    }

    public final dst a() {
        CharSequence[] charSequenceArr;
        Set set;
        if (this.b && this.e == null) {
            throw new NullPointerException("Contextual Actions must contain a valid PendingIntent");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = this.h;
        if (arrayList3 != null) {
            int size = arrayList3.size();
            for (int i = 0; i < size; i++) {
                dum dumVar = (dum) arrayList3.get(i);
                if (dumVar.d || (!((charSequenceArr = dumVar.c) == null || charSequenceArr.length == 0) || (set = dumVar.g) == null || set.isEmpty())) {
                    arrayList2.add(dumVar);
                } else {
                    arrayList.add(dumVar);
                }
            }
        }
        if (!arrayList.isEmpty()) {
        }
        return new dst(this.c, this.d, this.e, this.g, arrayList2.isEmpty() ? null : (dum[]) arrayList2.toArray(new dum[arrayList2.size()]), this.f, this.a, this.i, this.b, 0, 0, false);
    }

    public final void b(dum dumVar) {
        ArrayList arrayList = this.h;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.h = arrayList;
        }
        arrayList.add(dumVar);
    }

    public final void c() {
        this.i = false;
    }

    public dss(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
        this(iconCompat, charSequence, pendingIntent, new Bundle());
    }

    public dss(int i, CharSequence charSequence, PendingIntent pendingIntent) {
        this(i != 0 ? IconCompat.n(null, "", i) : null, charSequence, pendingIntent, new Bundle());
    }
}
