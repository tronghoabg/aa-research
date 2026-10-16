package androidx.compose.ui.tooling;

import androidx.compose.ui.tooling.data.SourceLocation;
import androidx.compose.ui.unit.IntRect;
import h.a.i;
import h.g.b.x;
import h.n.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class ViewInfo {
    public static final int $stable = 8;
    private final IntRect bounds;
    private final List<ViewInfo> children;
    private final String fileName;
    private final Object layoutInfo;
    private final int lineNumber;
    private final SourceLocation location;
    private final String name;

    public ViewInfo(String str, int i2, IntRect intRect, SourceLocation sourceLocation, List<ViewInfo> list, Object obj, String str2) {
        this.fileName = str;
        this.lineNumber = i2;
        this.bounds = intRect;
        this.location = sourceLocation;
        this.children = list;
        this.layoutInfo = obj;
        this.name = str2;
    }

    public static /* synthetic */ ViewInfo copy$default(ViewInfo viewInfo, String str, int i2, IntRect intRect, SourceLocation sourceLocation, List list, Object obj, String str2, int i3, Object obj2) {
        if ((i3 & 1) != 0) {
            str = viewInfo.fileName;
        }
        if ((i3 & 2) != 0) {
            i2 = viewInfo.lineNumber;
        }
        if ((i3 & 4) != 0) {
            intRect = viewInfo.bounds;
        }
        if ((i3 & 8) != 0) {
            sourceLocation = viewInfo.location;
        }
        if ((i3 & 16) != 0) {
            list = viewInfo.children;
        }
        if ((i3 & 32) != 0) {
            obj = viewInfo.layoutInfo;
        }
        if ((i3 & 64) != 0) {
            str2 = viewInfo.name;
        }
        Object obj3 = obj;
        String str3 = str2;
        List list2 = list;
        IntRect intRect2 = intRect;
        return viewInfo.copy(str, i2, intRect2, sourceLocation, list2, obj3, str3);
    }

    public final List<ViewInfo> allChildren() {
        List<ViewInfo> list = this.children;
        List<ViewInfo> list2 = list;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            i.aD(arrayList, ((ViewInfo) it.next()).allChildren());
        }
        return i.af(list2, arrayList);
    }

    public final String component1() {
        return this.fileName;
    }

    public final int component2() {
        return this.lineNumber;
    }

    public final IntRect component3() {
        return this.bounds;
    }

    public final SourceLocation component4() {
        return this.location;
    }

    public final List<ViewInfo> component5() {
        return this.children;
    }

    public final Object component6() {
        return this.layoutInfo;
    }

    public final String component7() {
        return this.name;
    }

    public final ViewInfo copy(String str, int i2, IntRect intRect, SourceLocation sourceLocation, List<ViewInfo> list, Object obj, String str2) {
        return new ViewInfo(str, i2, intRect, sourceLocation, list, obj, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ViewInfo)) {
            return false;
        }
        ViewInfo viewInfo = (ViewInfo) obj;
        return x.n(this.fileName, viewInfo.fileName) && this.lineNumber == viewInfo.lineNumber && x.n(this.bounds, viewInfo.bounds) && x.n(this.location, viewInfo.location) && x.n(this.children, viewInfo.children) && x.n(this.layoutInfo, viewInfo.layoutInfo) && x.n(this.name, viewInfo.name);
    }

    public final IntRect getBounds() {
        return this.bounds;
    }

    public final List<ViewInfo> getChildren() {
        return this.children;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final Object getLayoutInfo() {
        return this.layoutInfo;
    }

    public final int getLineNumber() {
        return this.lineNumber;
    }

    public final SourceLocation getLocation() {
        return this.location;
    }

    public final String getName() {
        return this.name;
    }

    public final boolean hasBounds() {
        return (this.bounds.getBottom() == 0 || this.bounds.getRight() == 0) ? false : true;
    }

    public int hashCode() {
        int iHashCode = (((this.fileName.hashCode() * 31) + this.lineNumber) * 31) + this.bounds.hashCode();
        SourceLocation sourceLocation = this.location;
        int iHashCode2 = ((((iHashCode * 31) + (sourceLocation == null ? 0 : sourceLocation.hashCode())) * 31) + this.children.hashCode()) * 31;
        Object obj = this.layoutInfo;
        int iHashCode3 = (iHashCode2 + (obj == null ? 0 : obj.hashCode())) * 31;
        String str = this.name;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("(");
        sb.append(this.fileName);
        sb.append(':');
        sb.append(this.lineNumber);
        sb.append(",\n            |bounds=(top=");
        sb.append(this.bounds.getTop());
        sb.append(", left=");
        sb.append(this.bounds.getLeft());
        sb.append(",\n            |location=");
        SourceLocation sourceLocation = this.location;
        if (sourceLocation != null) {
            str = "(" + sourceLocation.getOffset() + 'L' + sourceLocation.getLength();
        } else {
            str = "<none>";
        }
        sb.append(str);
        sb.append("\n            |bottom=");
        sb.append(this.bounds.getBottom());
        sb.append(", right=");
        sb.append(this.bounds.getRight());
        sb.append("),\n            |childrenCount=");
        sb.append(this.children.size());
        sb.append(')');
        return o.al(sb.toString());
    }
}
