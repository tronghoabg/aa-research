package androidx.compose.ui.tooling.data;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class SourceLocation {
    public static final int $stable = 0;
    private final int length;
    private final int lineNumber;
    private final int offset;
    private final int packageHash;
    private final String sourceFile;

    public SourceLocation(int i2, int i3, int i4, String str, int i5) {
        this.lineNumber = i2;
        this.offset = i3;
        this.length = i4;
        this.sourceFile = str;
        this.packageHash = i5;
    }

    public static /* synthetic */ SourceLocation copy$default(SourceLocation sourceLocation, int i2, int i3, int i4, String str, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i2 = sourceLocation.lineNumber;
        }
        if ((i6 & 2) != 0) {
            i3 = sourceLocation.offset;
        }
        if ((i6 & 4) != 0) {
            i4 = sourceLocation.length;
        }
        if ((i6 & 8) != 0) {
            str = sourceLocation.sourceFile;
        }
        if ((i6 & 16) != 0) {
            i5 = sourceLocation.packageHash;
        }
        int i7 = i5;
        int i8 = i4;
        return sourceLocation.copy(i2, i3, i8, str, i7);
    }

    public final int component1() {
        return this.lineNumber;
    }

    public final int component2() {
        return this.offset;
    }

    public final int component3() {
        return this.length;
    }

    public final String component4() {
        return this.sourceFile;
    }

    public final int component5() {
        return this.packageHash;
    }

    public final SourceLocation copy(int i2, int i3, int i4, String str, int i5) {
        return new SourceLocation(i2, i3, i4, str, i5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SourceLocation)) {
            return false;
        }
        SourceLocation sourceLocation = (SourceLocation) obj;
        return this.lineNumber == sourceLocation.lineNumber && this.offset == sourceLocation.offset && this.length == sourceLocation.length && x.n(this.sourceFile, sourceLocation.sourceFile) && this.packageHash == sourceLocation.packageHash;
    }

    public final int getLength() {
        return this.length;
    }

    public final int getLineNumber() {
        return this.lineNumber;
    }

    public final int getOffset() {
        return this.offset;
    }

    public final int getPackageHash() {
        return this.packageHash;
    }

    public final String getSourceFile() {
        return this.sourceFile;
    }

    public int hashCode() {
        String str = this.sourceFile;
        return (((((((this.lineNumber * 31) + this.offset) * 31) + this.length) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.packageHash;
    }

    public String toString() {
        return "SourceLocation(lineNumber=" + this.lineNumber + ", offset=" + this.offset + ", length=" + this.length + ", sourceFile=" + this.sourceFile + ", packageHash=" + this.packageHash + ')';
    }
}
