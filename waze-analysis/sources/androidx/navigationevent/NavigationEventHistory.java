package androidx.navigationevent;

import h.a.i;
import h.g.b.o;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class NavigationEventHistory {
    private List<? extends NavigationEventInfo> _mergedHistory;
    private final List<NavigationEventInfo> backInfo;
    private final int currentIndex;
    private final NavigationEventInfo currentInfo;
    private final List<NavigationEventInfo> forwardInfo;

    /* synthetic */ NavigationEventHistory(NavigationEventInfo navigationEventInfo, List list, List list2, int i2, int i3, o oVar) {
        this(1 == (i3 & 1) ? null : navigationEventInfo, (i3 & 2) != 0 ? i.h() : list, (i3 & 4) != 0 ? i.h() : list2, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NavigationEventHistory navigationEventHistory = (NavigationEventHistory) obj;
        return this.currentIndex == navigationEventHistory.currentIndex && x.n(getMergedHistory(), navigationEventHistory.getMergedHistory());
    }

    public final int getCurrentIndex() {
        return this.currentIndex;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List<NavigationEventInfo> getMergedHistory() {
        List list = this._mergedHistory;
        List list2 = list;
        if (list == null) {
            List<NavigationEventInfo> list3 = this.backInfo;
            List listB = i.b();
            listB.addAll(list3);
            NavigationEventInfo navigationEventInfo = this.currentInfo;
            if (navigationEventInfo != null) {
                listB.add(navigationEventInfo);
            }
            listB.addAll(this.forwardInfo);
            List listA = i.a(listB);
            this._mergedHistory = listA;
            list2 = listA;
        }
        x.c(list2);
        return list2;
    }

    public int hashCode() {
        return (this.currentIndex * 31) + getMergedHistory().hashCode();
    }

    public String toString() {
        return "NavigationEventHistory(currentIndex=" + this.currentIndex + ", mergedHistory=" + getMergedHistory() + ")";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NavigationEventHistory(NavigationEventInfo navigationEventInfo, List<? extends NavigationEventInfo> list) {
        this(navigationEventInfo, list, null, 4, null);
        x.f(navigationEventInfo, "currentInfo");
        x.f(list, "backInfo");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private NavigationEventHistory(NavigationEventInfo navigationEventInfo, List<? extends NavigationEventInfo> list, List<? extends NavigationEventInfo> list2, int i2) {
        this.currentInfo = navigationEventInfo;
        this.backInfo = list;
        this.forwardInfo = list2;
        this.currentIndex = i2;
    }

    public NavigationEventHistory() {
        this(null, null, null, -1, 7, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NavigationEventHistory(NavigationEventInfo navigationEventInfo, List<? extends NavigationEventInfo> list, List<? extends NavigationEventInfo> list2) {
        this(navigationEventInfo, list, list2, list.size());
        x.f(navigationEventInfo, "currentInfo");
        x.f(list, "backInfo");
        x.f(list2, "forwardInfo");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NavigationEventHistory(NavigationEventInfo navigationEventInfo) {
        this(navigationEventInfo, null, null, 6, null);
        x.f(navigationEventInfo, "currentInfo");
    }

    public /* synthetic */ NavigationEventHistory(NavigationEventInfo navigationEventInfo, List list, List list2, int i2, o oVar) {
        this(navigationEventInfo, (i2 & 2) != 0 ? i.h() : list, (i2 & 4) != 0 ? i.h() : list2);
    }
}
