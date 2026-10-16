package androidx.compose.runtime.composer.gapbuffer;

import androidx.compose.runtime.composer.GroupSourceInformation;
import h.g.b.x;
import java.util.ArrayList;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class GapGroupSourceInformation implements GroupSourceInformation {
    public static final int $stable = 8;
    private boolean closed;
    private int dataEndOffset;
    private final int dataStartOffset;
    private ArrayList<Object> groups;
    private final int key;
    private String sourceInformation;

    public GapGroupSourceInformation(int i2, String str, int i3) {
        this.key = i2;
        this.sourceInformation = str;
        this.dataStartOffset = i3;
    }

    private final void add(Object obj) {
        ArrayList<Object> groups = getGroups();
        if (groups == null) {
            groups = new ArrayList<>();
        }
        setGroups(groups);
        groups.add(obj);
    }

    private final boolean hasAnchor(GapAnchor gapAnchor) {
        ArrayList<Object> groups = getGroups();
        if (groups != null) {
            ArrayList<Object> arrayList = groups;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                Object obj = arrayList.get(i2);
                if (x.n(obj, gapAnchor)) {
                    return true;
                }
                if ((obj instanceof GapGroupSourceInformation) && ((GapGroupSourceInformation) obj).hasAnchor(gapAnchor)) {
                    return true;
                }
            }
        }
        return false;
    }

    private final GapGroupSourceInformation openInformation() {
        Object obj;
        ArrayList<Object> groups = getGroups();
        if (groups != null) {
            int size = groups.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                obj = groups.get(size);
                if ((obj instanceof GapGroupSourceInformation) && !((GapGroupSourceInformation) obj).getClosed()) {
                    break;
                }
            }
        } else {
            obj = null;
        }
        GapGroupSourceInformation gapGroupSourceInformation = obj instanceof GapGroupSourceInformation ? (GapGroupSourceInformation) obj : null;
        return gapGroupSourceInformation != null ? gapGroupSourceInformation.openInformation() : this;
    }

    public final void addGroupAfter(SlotWriter slotWriter, int i2, int i3) {
        GapAnchor gapAnchorTryAnchor$runtime;
        ArrayList<Object> groups = getGroups();
        if (groups == null) {
            groups = new ArrayList<>();
            setGroups(groups);
        }
        int i4 = 0;
        if (i2 >= 0 && (gapAnchorTryAnchor$runtime = slotWriter.tryAnchor$runtime(i2)) != null) {
            int size = groups.size();
            while (true) {
                if (i4 >= size) {
                    i4 = -1;
                    break;
                }
                Object obj = groups.get(i4);
                if (x.n(obj, gapAnchorTryAnchor$runtime) || ((obj instanceof GapGroupSourceInformation) && ((GapGroupSourceInformation) obj).hasAnchor(gapAnchorTryAnchor$runtime))) {
                    break;
                } else {
                    i4++;
                }
            }
        }
        groups.add(i4, slotWriter.anchor(i3));
    }

    public final void close(int i2) {
        setClosed(true);
        setDataEndOffset(i2);
    }

    public final void endGrouplessCall(int i2) {
        openInformation().close(i2);
    }

    @Override // androidx.compose.runtime.composer.GroupSourceInformation
    public boolean getClosed() {
        return this.closed;
    }

    @Override // androidx.compose.runtime.composer.GroupSourceInformation
    public int getDataEndOffset() {
        return this.dataEndOffset;
    }

    @Override // androidx.compose.runtime.composer.GroupSourceInformation
    public int getDataStartOffset() {
        return this.dataStartOffset;
    }

    @Override // androidx.compose.runtime.composer.GroupSourceInformation
    public ArrayList<Object> getGroups() {
        return this.groups;
    }

    @Override // androidx.compose.runtime.composer.GroupSourceInformation
    public int getKey() {
        return this.key;
    }

    @Override // androidx.compose.runtime.composer.GroupSourceInformation
    public String getSourceInformation() {
        return this.sourceInformation;
    }

    public final boolean removeAnchor(GapAnchor gapAnchor) {
        ArrayList<Object> groups = getGroups();
        if (groups == null) {
            return true;
        }
        int size = groups.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            Object obj = groups.get(size);
            if (obj instanceof GapAnchor) {
                if (x.n(obj, gapAnchor)) {
                    groups.remove(size);
                }
            } else if ((obj instanceof GapGroupSourceInformation) && !((GapGroupSourceInformation) obj).removeAnchor(gapAnchor)) {
                groups.remove(size);
            }
        }
        if (!groups.isEmpty()) {
            return true;
        }
        setGroups(null);
        return false;
    }

    public final void reportGroup(SlotTable slotTable, int i2) {
        openInformation().add(slotTable.anchor(i2));
    }

    public void setClosed(boolean z) {
        this.closed = z;
    }

    public void setDataEndOffset(int i2) {
        this.dataEndOffset = i2;
    }

    public void setGroups(ArrayList<Object> arrayList) {
        this.groups = arrayList;
    }

    public void setSourceInformation(String str) {
        this.sourceInformation = str;
    }

    public final void startGrouplessCall(int i2, String str, int i3) {
        openInformation().add(new GapGroupSourceInformation(i2, str, i3));
    }

    public final void reportGroup(SlotWriter slotWriter, int i2) {
        openInformation().add(slotWriter.anchor(i2));
    }
}
