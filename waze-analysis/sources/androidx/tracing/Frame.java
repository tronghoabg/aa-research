package androidx.tracing;

import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
@DelicateTracingApi
/* loaded from: classes4.dex */
public final class Frame {
    public int lineNumber;
    public String name;
    public String sourceFile;

    public /* synthetic */ Frame(String str, String str2, int i2, int i3, o oVar) {
        this(1 == (i3 & 1) ? null : str, (i3 & 2) != 0 ? null : str2, (i3 & 4) != 0 ? -1 : i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        Frame frame = (Frame) obj;
        return frame != null && this.lineNumber == frame.lineNumber && x.n(this.name, frame.name) && x.n(this.sourceFile, frame.sourceFile);
    }

    public int hashCode() {
        int i2 = this.lineNumber * 31;
        String str = this.name;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.sourceFile;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final void reset() {
        this.name = null;
        this.sourceFile = null;
        this.lineNumber = -1;
    }

    public String toString() {
        return "Frame(name=" + this.name + ", sourceFile=" + this.sourceFile + ", lineNumber=" + this.lineNumber + ")";
    }

    public Frame(String str, String str2, int i2) {
        this.name = str;
        this.sourceFile = str2;
        this.lineNumber = i2;
    }

    public Frame() {
        this(null, null, 0, 7, null);
    }
}
