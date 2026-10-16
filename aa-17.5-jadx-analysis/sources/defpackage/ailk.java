package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* loaded from: classes3.dex */
public final class ailk implements aiid {
    private final String debugText;
    private final String[] formatParams;
    private final aill kind;

    public ailk(aill aillVar, String... strArr) {
        aillVar.getClass();
        strArr.getClass();
        this.kind = aillVar;
        this.formatParams = strArr;
        String debugText = ailb.ERROR_TYPE.getDebugText();
        String debugMessage = aillVar.getDebugMessage();
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
        String str = String.format(debugMessage, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        str.getClass();
        String str2 = String.format(debugText, Arrays.copyOf(new Object[]{str}, 1));
        str2.getClass();
        this.debugText = str2;
    }

    @Override // defpackage.aiid
    public afye getBuiltIns() {
        return afxw.Companion.getInstance();
    }

    @Override // defpackage.aiid
    public agbd getDeclarationDescriptor() {
        return ailm.INSTANCE.getErrorClass();
    }

    public final aill getKind() {
        return this.kind;
    }

    public final String getParam(int i) {
        return this.formatParams[i];
    }

    @Override // defpackage.aiid
    public List<agee> getParameters() {
        return afbe.a;
    }

    @Override // defpackage.aiid
    /* renamed from: getSupertypes */
    public Collection<aigl> mo89getSupertypes() {
        return afbe.a;
    }

    @Override // defpackage.aiid
    public boolean isDenotable() {
        return false;
    }

    @Override // defpackage.aiid
    public aiid refine(aiju aijuVar) {
        aijuVar.getClass();
        return this;
    }

    public String toString() {
        return this.debugText;
    }
}
