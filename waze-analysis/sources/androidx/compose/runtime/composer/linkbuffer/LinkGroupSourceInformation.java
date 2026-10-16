package androidx.compose.runtime.composer.linkbuffer;

import androidx.compose.runtime.composer.GroupSourceInformation;
import h.g.b.x;
import java.util.ArrayList;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LinkGroupSourceInformation implements GroupSourceInformation {
    public static final int $stable = 8;
    private boolean closed;
    private int dataEndOffset;
    private final int dataStartOffset;
    private ArrayList<Object> groups;
    private final int key;
    private String sourceInformation;

    public LinkGroupSourceInformation(int i2, String str, int i3) {
        this.key = i2;
        this.sourceInformation = str;
        this.dataStartOffset = i3;
    }

    private final void add(Object obj) {
        ArrayList<Object> groups = getGroups();
        if (groups == null) {
            groups = new ArrayList<>();
            this.groups = groups;
        }
        groups.add(obj);
    }

    private final boolean hasGroup(LinkAnchor linkAnchor) {
        ArrayList<Object> groups = getGroups();
        if (groups != null) {
            ArrayList<Object> arrayList = groups;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                Object obj = arrayList.get(i2);
                if (x.n(obj, linkAnchor)) {
                    return true;
                }
                if ((obj instanceof LinkGroupSourceInformation) && ((LinkGroupSourceInformation) obj).hasGroup(linkAnchor)) {
                    return true;
                }
            }
        }
        return false;
    }

    private final LinkGroupSourceInformation openInformation() {
        ArrayList<Object> groups = getGroups();
        Object obj = null;
        if (groups != null) {
            int size = groups.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                Object obj2 = groups.get(size);
                if ((obj2 instanceof LinkGroupSourceInformation) && !((LinkGroupSourceInformation) obj2).getClosed()) {
                    obj = obj2;
                    break;
                }
            }
        }
        LinkGroupSourceInformation linkGroupSourceInformation = (LinkGroupSourceInformation) obj;
        return linkGroupSourceInformation != null ? linkGroupSourceInformation.openInformation() : this;
    }

    public final void addGroupAfter(LinkAnchor linkAnchor, LinkAnchor linkAnchor2) {
        ArrayList<Object> groups = getGroups();
        if (groups == null) {
            groups = new ArrayList<>();
            this.groups = groups;
        }
        int i2 = 0;
        if (linkAnchor != null) {
            int size = groups.size();
            while (true) {
                if (i2 >= size) {
                    i2 = -1;
                    break;
                }
                Object obj = groups.get(i2);
                if (x.n(obj, linkAnchor) || ((obj instanceof LinkGroupSourceInformation) && ((LinkGroupSourceInformation) obj).hasGroup(linkAnchor))) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        groups.add(i2, linkAnchor2);
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

    public final boolean removeGroup(LinkAnchor linkAnchor) {
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
            if (obj instanceof LinkAnchor) {
                if (x.n(obj, linkAnchor)) {
                    groups.remove(size);
                }
            } else if ((obj instanceof LinkGroupSourceInformation) && !((LinkGroupSourceInformation) obj).removeGroup(linkAnchor)) {
                groups.remove(size);
            }
        }
        if (!groups.isEmpty()) {
            return true;
        }
        this.groups = null;
        return false;
    }

    public final void reportGroup(LinkAnchor linkAnchor) {
        openInformation().add(linkAnchor);
    }

    public void setClosed(boolean z) {
        this.closed = z;
    }

    public void setDataEndOffset(int i2) {
        this.dataEndOffset = i2;
    }

    public void setSourceInformation(String str) {
        this.sourceInformation = str;
    }

    public final void startGrouplessCall(int i2, String str, int i3) {
        openInformation().add(new LinkGroupSourceInformation(i2, str, i3));
    }
}
