package androidx.constraintlayout.core.dsl;

import java.util.ArrayList;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public class KeyFrames {
    ArrayList<Keys> mKeys = new ArrayList<>();

    public void add(Keys keys) {
        this.mKeys.add(keys);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.mKeys.isEmpty()) {
            sb.append("keyFrames:{\n");
            ArrayList<Keys> arrayList = this.mKeys;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                sb.append(arrayList.get(i2).toString());
            }
            sb.append("},\n");
        }
        return sb.toString();
    }
}
