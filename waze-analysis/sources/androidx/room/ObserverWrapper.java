package androidx.room;

import androidx.room.InvalidationTracker;
import e.c.d.a;
import h.g.b.x;
import h.n.o;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ObserverWrapper {
    private final InvalidationTracker.Observer observer;
    private final Set<String> singleTableSet;
    private final int[] tableIds;
    private final String[] tableNames;

    public ObserverWrapper(InvalidationTracker.Observer observer, int[] iArr, String[] strArr) {
        x.f(observer, "observer");
        x.f(iArr, "tableIds");
        x.f(strArr, "tableNames");
        this.observer = observer;
        this.tableIds = iArr;
        this.tableNames = strArr;
        int length = iArr.length;
        int length2 = strArr.length;
        if (length != length2) {
            throw new IllegalStateException("Check failed.");
        }
        this.singleTableSet = length2 == 0 ? a.p() : a.o(strArr[0]);
    }

    public final InvalidationTracker.Observer getObserver$room_runtime() {
        return this.observer;
    }

    public final int[] getTableIds$room_runtime() {
        return this.tableIds;
    }

    public final void notifyByTableIds$room_runtime(Set<Integer> set) {
        Set<String> setP;
        x.f(set, "invalidatedTablesIds");
        int[] iArr = this.tableIds;
        int length = iArr.length;
        if (length != 0) {
            int i2 = 0;
            if (length != 1) {
                Set setM = a.m();
                int i3 = 0;
                while (i2 < length) {
                    int i4 = i3 + 1;
                    if (set.contains(Integer.valueOf(iArr[i2]))) {
                        setM.add(this.tableNames[i3]);
                    }
                    i2++;
                    i3 = i4;
                }
                setP = a.l(setM);
            } else {
                setP = set.contains(Integer.valueOf(iArr[0])) ? this.singleTableSet : a.p();
            }
        } else {
            setP = a.p();
        }
        if (setP.isEmpty()) {
            return;
        }
        this.observer.onInvalidated(setP);
    }

    public final void notifyByTableNames$room_runtime(Set<String> set) {
        Set<String> setP;
        x.f(set, "invalidatedTablesNames");
        int length = this.tableNames.length;
        if (length == 0) {
            setP = a.p();
        } else if (length != 1) {
            Set setM = a.m();
            for (String str : set) {
                String[] strArr = this.tableNames;
                int length2 = strArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length2) {
                        String str2 = strArr[i2];
                        if (o.m(str2, str, true)) {
                            setM.add(str2);
                            break;
                        }
                        i2++;
                    }
                }
            }
            setP = a.l(setM);
        } else {
            Set<String> set2 = set;
            if ((set2 instanceof Collection) && set2.isEmpty()) {
                setP = a.p();
            } else {
                Iterator<T> it = set2.iterator();
                while (it.hasNext()) {
                    if (o.m((String) it.next(), this.tableNames[0], true)) {
                        setP = this.singleTableSet;
                        break;
                    }
                }
                setP = a.p();
            }
        }
        if (setP.isEmpty()) {
            return;
        }
        this.observer.onInvalidated(setP);
    }
}
