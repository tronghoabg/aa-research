package androidx.constraintlayout.core.parser;

import java.util.ArrayList;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public class CLArray extends CLContainer {
    public CLArray(char[] cArr) {
        super(cArr);
    }

    public static CLElement allocate(char[] cArr) {
        return new CLArray(cArr);
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    protected String toFormattedJSON(int i2, int i3) {
        StringBuilder sb = new StringBuilder();
        String json = toJSON();
        if (i3 > 0 || json.length() + i2 >= sMaxLine) {
            sb.append("[\n");
            ArrayList<CLElement> arrayList = this.mElements;
            int size = arrayList.size();
            boolean z = true;
            int i4 = 0;
            while (i4 < size) {
                CLElement cLElement = arrayList.get(i4);
                if (!z) {
                    sb.append(",\n");
                }
                addIndent(sb, sBaseIndent + i2);
                sb.append(cLElement.toFormattedJSON(sBaseIndent + i2, i3 - 1));
                i4++;
                z = false;
            }
            sb.append("\n");
            addIndent(sb, i2);
            sb.append("]");
        } else {
            sb.append(json);
        }
        return sb.toString();
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    protected String toJSON() {
        StringBuilder sb = new StringBuilder(String.valueOf(getDebugName()).concat("["));
        boolean z = true;
        int i2 = 0;
        while (i2 < this.mElements.size()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(this.mElements.get(i2).toJSON());
            i2++;
            z = false;
        }
        sb.toString();
        return sb.toString().concat("]");
    }
}
