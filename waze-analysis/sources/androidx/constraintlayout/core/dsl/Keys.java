package androidx.constraintlayout.core.dsl;

import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public class Keys {
    protected void append(StringBuilder sb, String str, float f2) {
        if (Float.isNaN(f2)) {
            return;
        }
        sb.append(str);
        sb.append(":");
        sb.append(f2);
        sb.append(",\n");
    }

    protected String unpack(String[] strArr) {
        StringBuilder sb = new StringBuilder("[");
        int i2 = 0;
        while (i2 < strArr.length) {
            sb.append(i2 == 0 ? "'" : ",'");
            sb.append(strArr[i2]);
            sb.append("'");
            i2++;
        }
        sb.append("]");
        return sb.toString();
    }

    protected void append(StringBuilder sb, String str, int i2) {
        if (i2 != Integer.MIN_VALUE) {
            sb.append(str);
            sb.append(":'");
            sb.append(i2);
            sb.append("',\n");
        }
    }

    protected void append(StringBuilder sb, String str, String str2) {
        if (str2 != null) {
            sb.append(str);
            sb.append(":'");
            sb.append(str2);
            sb.append("',\n");
        }
    }

    protected void append(StringBuilder sb, String str, float[] fArr) {
        if (fArr != null) {
            sb.append(str);
            sb.append("percentWidth:");
            sb.append(Arrays.toString(fArr));
            sb.append(",\n");
        }
    }

    protected void append(StringBuilder sb, String str, String[] strArr) {
        if (strArr != null) {
            sb.append(str);
            sb.append(":");
            sb.append(unpack(strArr));
            sb.append(",\n");
        }
    }
}
