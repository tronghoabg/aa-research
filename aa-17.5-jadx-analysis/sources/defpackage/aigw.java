package defpackage;

import java.io.IOException;
import java.util.Iterator;

/* loaded from: classes3.dex */
public abstract class aigw extends aijf implements aily, ailz {
    public aigw() {
        super(null);
    }

    @Override // defpackage.aijf
    public abstract aigw makeNullableAsSpecified(boolean z);

    @Override // defpackage.aijf
    public abstract aigw replaceAttributes(aihr aihrVar);

    public String toString() throws IOException {
        StringBuilder sb = new StringBuilder();
        Iterator<agfc> it = getAnnotations().iterator();
        while (it.hasNext()) {
            String[] strArr = {"[", ahre.renderAnnotation$default(ahre.DEBUG_TEXT, it.next(), null, 2, null), "] "};
            for (int i = 0; i < 3; i++) {
                sb.append(strArr[i]);
            }
        }
        sb.append(getConstructor());
        if (!getArguments().isEmpty()) {
            woy.ct(getArguments(), sb, ", ", "<", ">", -1, "...", null);
        }
        if (isMarkedNullable()) {
            sb.append("?");
        }
        return sb.toString();
    }
}
