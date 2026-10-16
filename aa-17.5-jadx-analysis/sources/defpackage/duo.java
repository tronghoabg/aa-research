package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class duo implements Iterable {
    public final Context a;
    private final ArrayList b = new ArrayList();

    public duo(Context context) {
        this.a = context;
    }

    public final void a(Intent intent) {
        this.b.add(intent);
    }

    public final void b(ComponentName componentName) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        try {
            Context context = this.a;
            for (Intent intentR = dln.r(context, componentName); intentR != null; intentR = dln.r(context, intentR.getComponent())) {
                arrayList.add(size, intentR);
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e);
        }
    }

    public final void c() {
        ArrayList arrayList = this.b;
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        this.a.startActivities(intentArr, null);
    }

    @Override // java.lang.Iterable
    @Deprecated
    public final Iterator<Intent> iterator() {
        return this.b.iterator();
    }
}
