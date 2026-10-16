package defpackage;

import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
public final class ahmo extends ahmq {
    private final ahmg types;

    /* JADX WARN: Illegal instructions before constructor call */
    public ahmo(ahmg ahmgVar, String[] strArr) {
        Set setCl;
        ahmgVar.getClass();
        strArr.getClass();
        List<Integer> localNameList = ahmgVar.getLocalNameList();
        if (localNameList.isEmpty()) {
            setCl = afbg.a;
        } else {
            localNameList.getClass();
            setCl = woy.cl(localNameList);
        }
        List<ahmf> recordList = ahmgVar.getRecordList();
        recordList.getClass();
        super(strArr, setCl, ahmr.toExpandedRecordsList(recordList));
        this.types = ahmgVar;
    }
}
