package androidx.compose.runtime.tooling;

import androidx.compose.runtime.Anchor;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.composer.GroupSourceInformation;
import h.g.b.x;
import h.n.o;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public abstract class ComposeStackTraceBuilder {
    public static final int $stable = 8;
    private final List<ComposeStackTraceFrame> _trace = new ArrayList();

    private final boolean appendGroupSourceInformation(int i2, GroupSourceInformation groupSourceInformation, Object obj) {
        ArrayList<Object> groups = groupSourceInformation.getGroups();
        boolean z = false;
        if (groups == null) {
            if (!groupSourceInformation.getClosed()) {
                appendTraceFrame(i2, groupSourceInformation, null);
                return true;
            }
            int dataStartOffset = groupSourceInformation.getDataStartOffset();
            int dataEndOffset = groupSourceInformation.getDataEndOffset();
            if (obj instanceof Integer) {
                Number number = (Number) obj;
                int iIntValue = number.intValue();
                if ((dataStartOffset <= iIntValue && iIntValue < dataEndOffset) || (dataStartOffset == dataEndOffset && dataStartOffset == number.intValue())) {
                    z = true;
                }
                if (z) {
                    appendTraceFrame(groupSourceInformation.getKey(), groupSourceInformation, null);
                }
            }
            return z;
        }
        ArrayList<Object> arrayList = groups;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            Object obj2 = arrayList.get(i3);
            if (obj2 instanceof Anchor) {
                if (x.n(obj2, obj)) {
                    appendTraceFrame(groupSourceInformation.getKey(), groupSourceInformation, obj2);
                    return true;
                }
            } else {
                if (!(obj2 instanceof GroupSourceInformation)) {
                    Objects.toString(obj2);
                    throw new IllegalStateException("Unexpected child source info ".concat(String.valueOf(obj2)));
                }
                if (appendGroupSourceInformation(i2, (GroupSourceInformation) obj2, obj)) {
                    appendTraceFrame(groupSourceInformation.getKey(), groupSourceInformation, obj2);
                    return true;
                }
            }
        }
        return false;
    }

    private final void appendTraceFrame(int i2, GroupSourceInformation groupSourceInformation, Object obj) {
        this._trace.add(extractTraceFrame(i2, groupSourceInformation, obj));
    }

    private final ComposeStackTraceFrame extractTraceFrame(int i2, GroupSourceInformation groupSourceInformation, Object obj) {
        String sourceInformation;
        SourceInformation sourceInformation2 = (groupSourceInformation == null || (sourceInformation = groupSourceInformation.getSourceInformation()) == null) ? null : SourceInformationKt.parseSourceInformation(sourceInformation);
        if (sourceInformation2 == null) {
            return new ComposeStackTraceFrame(i2, null, null);
        }
        if (obj == null) {
            return new ComposeStackTraceFrame(i2, sourceInformation2, null);
        }
        ArrayList<Object> groups = groupSourceInformation.getGroups();
        int i3 = 0;
        if (groups != null) {
            int size = groups.size();
            int i4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                Object obj2 = groups.get(i5);
                if (x.n(obj2, obj)) {
                    break;
                }
                GroupSourceInformation groupSourceInformationSourceInformationOf = sourceInformationOf(obj2);
                if (groupSourceInformationSourceInformationOf != null && ((groupSourceInformationSourceInformationOf.getKey() == -127 || (groupSourceInformationSourceInformationOf.getKey() == 0 && (obj2 instanceof Anchor) && groupKeyOf((Anchor) obj2) == -127)) && groupSourceInformationSourceInformationOf.getSourceInformation() == null)) {
                    ArrayList<Object> groups2 = groupSourceInformationSourceInformationOf.getGroups();
                    if (groups2 != null) {
                        ArrayList<Object> arrayList = groups2;
                        int size2 = arrayList.size();
                        for (int i6 = 0; i6 < size2; i6++) {
                            GroupSourceInformation groupSourceInformationSourceInformationOf2 = sourceInformationOf(arrayList.get(i6));
                            if (groupSourceInformationSourceInformationOf2 != null && isCall(groupSourceInformationSourceInformationOf2)) {
                                i4++;
                            }
                        }
                    }
                } else if (groupSourceInformationSourceInformationOf != null && isCall(groupSourceInformationSourceInformationOf)) {
                    i4++;
                }
            }
            i3 = i4;
        }
        return new ComposeStackTraceFrame(i2, sourceInformation2, Integer.valueOf(i3));
    }

    private final boolean isCall(GroupSourceInformation groupSourceInformation) {
        String sourceInformation = groupSourceInformation.getSourceInformation();
        return sourceInformation != null && o.ah(sourceInformation, "C");
    }

    private final GroupSourceInformation sourceInformationOf(Object obj) {
        if (obj instanceof Anchor) {
            return sourceInformationOf((Anchor) obj);
        }
        if (obj instanceof GroupSourceInformation) {
            return (GroupSourceInformation) obj;
        }
        Objects.toString(obj);
        throw new IllegalStateException("Unexpected child source info ".concat(String.valueOf(obj)));
    }

    public abstract int groupKeyOf(Anchor anchor);

    public final void processEdge(int i2, Object obj, GroupSourceInformation groupSourceInformation, Object obj2) {
        if (groupSourceInformation != null || x.n(obj, Composer.Companion.getEmpty())) {
            if (obj2 == null || groupSourceInformation == null) {
                appendTraceFrame(i2, groupSourceInformation, null);
            } else {
                if (appendGroupSourceInformation(i2, groupSourceInformation, obj2) || groupSourceInformation.getClosed()) {
                    return;
                }
                appendTraceFrame(i2, groupSourceInformation, obj2);
            }
        }
    }

    public abstract GroupSourceInformation sourceInformationOf(Anchor anchor);

    public final List<ComposeStackTraceFrame> trace() {
        return this._trace;
    }
}
