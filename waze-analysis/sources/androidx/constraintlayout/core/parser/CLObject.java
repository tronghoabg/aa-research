package androidx.constraintlayout.core.parser;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public class CLObject extends CLContainer implements Iterable<CLKey> {

    /* compiled from: WazeSource */
    class CLObjectIterator implements Iterator<CLKey> {
        int mIndex = 0;
        CLObject mObject;

        CLObjectIterator(CLObject cLObject) {
            this.mObject = cLObject;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.mIndex < this.mObject.size();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Iterator
        public CLKey next() {
            CLKey cLKey = (CLKey) this.mObject.mElements.get(this.mIndex);
            this.mIndex++;
            return cLKey;
        }
    }

    public CLObject(char[] cArr) {
        super(cArr);
    }

    public static CLObject allocate(char[] cArr) {
        return new CLObject(cArr);
    }

    @Override // androidx.constraintlayout.core.parser.CLContainer, androidx.constraintlayout.core.parser.CLElement
    /* renamed from: clone */
    public CLObject mo11647clone() {
        return (CLObject) super.mo11647clone();
    }

    @Override // java.lang.Iterable
    public Iterator<CLKey> iterator() {
        return new CLObjectIterator(this);
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public String toFormattedJSON(int i2, int i3) {
        StringBuilder sb = new StringBuilder(getDebugName());
        sb.append("{\n");
        ArrayList<CLElement> arrayList = this.mElements;
        int size = arrayList.size();
        boolean z = true;
        int i4 = 0;
        while (i4 < size) {
            CLElement cLElement = arrayList.get(i4);
            if (!z) {
                sb.append(",\n");
            }
            sb.append(cLElement.toFormattedJSON(sBaseIndent + i2, i3 - 1));
            i4++;
            z = false;
        }
        sb.append("\n");
        addIndent(sb, i2);
        sb.append("}");
        return sb.toString();
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public String toJSON() {
        StringBuilder sb = new StringBuilder(String.valueOf(getDebugName()).concat("{ "));
        ArrayList<CLElement> arrayList = this.mElements;
        int size = arrayList.size();
        boolean z = true;
        int i2 = 0;
        while (i2 < size) {
            CLElement cLElement = arrayList.get(i2);
            if (!z) {
                sb.append(", ");
            }
            sb.append(cLElement.toJSON());
            i2++;
            z = false;
        }
        sb.append(" }");
        return sb.toString();
    }

    public String toFormattedJSON() {
        return toFormattedJSON(0, 0);
    }
}
