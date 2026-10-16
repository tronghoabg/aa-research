package androidx.constraintlayout.core.parser;

import j$.util.Objects;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public class CLElement implements Cloneable {
    protected static int sBaseIndent = 2;
    protected static int sMaxLine = 80;
    protected CLContainer mContainer;
    private final char[] mContent;
    private int mLine;
    protected long mStart = -1;
    protected long mEnd = Long.MAX_VALUE;
    int mDepth = 0;

    public CLElement(char[] cArr) {
        this.mContent = cArr;
    }

    protected void addIndent(StringBuilder sb, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            sb.append(' ');
        }
    }

    @Override // 
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public CLElement mo11647clone() {
        try {
            return (CLElement) super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new AssertionError();
        }
    }

    public String content() {
        char[] cArr = this.mContent;
        if (cArr == null || cArr.length == 0) {
            return "";
        }
        long j2 = this.mStart;
        if (j2 == -1) {
            return "";
        }
        long j3 = this.mEnd;
        int i2 = (int) j2;
        if (j3 == Long.MAX_VALUE || j3 < j2) {
            return new String(cArr, i2, 1);
        }
        int i3 = (int) ((j3 - j2) + 1);
        if (i3 > 1000) {
            i3 = 1000;
        }
        return new String(cArr, i2, i3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CLElement)) {
            return false;
        }
        CLElement cLElement = (CLElement) obj;
        if (this.mStart == cLElement.mStart && this.mEnd == cLElement.mEnd && this.mLine == cLElement.mLine && Arrays.equals(this.mContent, cLElement.mContent)) {
            return Objects.equals(this.mContainer, cLElement.mContainer);
        }
        return false;
    }

    public CLElement getContainer() {
        return this.mContainer;
    }

    protected String getDebugName() {
        return CLParser.sDebug ? String.valueOf(getStrClass()).concat(" -> ") : "";
    }

    public long getEnd() {
        return this.mEnd;
    }

    public float getFloat() {
        if (this instanceof CLNumber) {
            return ((CLNumber) this).getFloat();
        }
        return Float.NaN;
    }

    public int getInt() {
        if (this instanceof CLNumber) {
            return ((CLNumber) this).getInt();
        }
        return 0;
    }

    public int getLine() {
        return this.mLine;
    }

    public long getStart() {
        return this.mStart;
    }

    protected String getStrClass() {
        String string = getClass().toString();
        return string.substring(string.lastIndexOf(46) + 1);
    }

    public boolean hasContent() {
        char[] cArr = this.mContent;
        return cArr != null && cArr.length > 0;
    }

    public int hashCode() {
        int iHashCode = Arrays.hashCode(this.mContent) * 31;
        long j2 = this.mStart;
        long j3 = j2 ^ (j2 >>> 32);
        long j4 = this.mEnd;
        long j5 = j4 ^ (j4 >>> 32);
        CLContainer cLContainer = this.mContainer;
        return ((((((iHashCode + ((int) j3)) * 31) + ((int) j5)) * 31) + (cLContainer != null ? cLContainer.hashCode() : 0)) * 31) + this.mLine;
    }

    public boolean isDone() {
        return this.mEnd != Long.MAX_VALUE;
    }

    public boolean isStarted() {
        return this.mStart > -1;
    }

    public boolean notStarted() {
        return this.mStart == -1;
    }

    public void setContainer(CLContainer cLContainer) {
        this.mContainer = cLContainer;
        if (cLContainer != null) {
            this.mDepth = cLContainer.mDepth + 1;
        }
    }

    public void setEnd(long j2) {
        if (this.mEnd != Long.MAX_VALUE) {
            return;
        }
        this.mEnd = j2;
        if (CLParser.sDebug) {
            System.out.println("closing " + hashCode() + " -> " + this);
        }
        CLContainer cLContainer = this.mContainer;
        if (cLContainer != null) {
            cLContainer.add(this);
        }
    }

    public void setLine(int i2) {
        this.mLine = i2;
    }

    public void setStart(long j2) {
        this.mStart = j2;
    }

    protected String toFormattedJSON(int i2, int i3) {
        return "";
    }

    protected String toJSON() {
        return "";
    }

    public String toString() {
        long j2 = this.mStart;
        long j3 = this.mEnd;
        if (j2 > j3 || j3 == Long.MAX_VALUE) {
            return getClass() + " (INVALID, " + this.mStart + "-" + this.mEnd + ")";
        }
        int i2 = (int) ((j3 - j2) + 1);
        if (i2 > 1000) {
            i2 = 1000;
        }
        return getStrClass() + " (" + this.mStart + " : " + this.mEnd + ") <<" + new String(this.mContent, (int) j2, i2) + ">>";
    }
}
