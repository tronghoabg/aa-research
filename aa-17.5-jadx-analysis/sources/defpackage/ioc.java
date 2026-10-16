package defpackage;

import android.content.ComponentName;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class ioc {
    public static final yph a = yph.c("CAR.CAM.TASK");
    private static int f;
    public final int b;
    public final iob c;
    public final ComponentName d;
    protected final List e = new ArrayList();

    public ioc(iob iobVar, ComponentName componentName) {
        int i = f;
        f = i + 1;
        this.b = i;
        this.c = iobVar;
        this.d = componentName;
    }

    @ResultIgnorabilityUnspecified
    protected abstract ing a(inz inzVar, iob iobVar, int i, boolean z);

    public final ing b() {
        List list = this.e;
        if (list.isEmpty()) {
            return null;
        }
        return (ing) list.get(0);
    }

    public final ing c() {
        List list = this.e;
        if (list.isEmpty()) {
            return null;
        }
        return (ing) list.get(list.size() - 1);
    }

    public final void d() {
        ArrayList arrayList = new ArrayList(this.e);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((ing) arrayList.get(i)).l();
        }
    }

    public final String toString() {
        List list = this.e;
        return "CarActivityTask{#" + this.b + ": mRoot=" + this.d.flattenToShortString() + ", activity count=" + list.size() + "}";
    }
}
