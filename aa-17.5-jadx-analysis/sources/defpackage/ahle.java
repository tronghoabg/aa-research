package defpackage;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes3.dex */
public final class ahle implements ahld {
    private final ahja qualifiedNames;
    private final ahjf strings;

    public ahle(ahjf ahjfVar, ahja ahjaVar) {
        ahjfVar.getClass();
        ahjaVar.getClass();
        this.strings = ahjfVar;
        this.qualifiedNames = ahjaVar;
    }

    private final aezz<List<String>, List<String>, Boolean> traverseIds(int i) {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        boolean z = false;
        while (i != -1) {
            ahja ahjaVar = this.qualifiedNames;
            ahjf ahjfVar = this.strings;
            ahiz qualifiedName = ahjaVar.getQualifiedName(i);
            String string = ahjfVar.getString(qualifiedName.getShortName());
            ahiy kind = qualifiedName.getKind();
            kind.getClass();
            int iOrdinal = kind.ordinal();
            if (iOrdinal == 0) {
                linkedList2.addFirst(string);
            } else if (iOrdinal == 1) {
                linkedList.addFirst(string);
            } else {
                if (iOrdinal != 2) {
                    throw new aezs();
                }
                linkedList2.addFirst(string);
                z = true;
            }
            i = qualifiedName.getParentQualifiedName();
        }
        return new aezz<>(linkedList, linkedList2, Boolean.valueOf(z));
    }

    @Override // defpackage.ahld
    public String getQualifiedClassName(int i) throws IOException {
        aezz<List<String>, List<String>, Boolean> aezzVarTraverseIds = traverseIds(i);
        List list = (List) aezzVarTraverseIds.a;
        String strCu = woy.cu((List) aezzVarTraverseIds.b, ".", null, null, null, 62);
        if (list.isEmpty()) {
            return strCu;
        }
        return woy.cu(list, "/", null, null, null, 62) + '/' + strCu;
    }

    @Override // defpackage.ahld
    public String getString(int i) {
        String string = this.strings.getString(i);
        string.getClass();
        return string;
    }

    @Override // defpackage.ahld
    public boolean isLocalClassName(int i) {
        return ((Boolean) traverseIds(i).c).booleanValue();
    }
}
