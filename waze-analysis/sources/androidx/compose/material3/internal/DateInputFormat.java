package androidx.compose.material3.internal;

import h.g.b.x;
import h.n.o;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class DateInputFormat {
    public static final int $stable = 0;
    private final char delimiter;
    private final String patternWithDelimiters;
    private final String patternWithoutDelimiters;

    public DateInputFormat(String str, char c2) {
        this.patternWithDelimiters = str;
        this.delimiter = c2;
        this.patternWithoutDelimiters = o.ac(str, String.valueOf(c2), "");
    }

    public static /* synthetic */ DateInputFormat copy$default(DateInputFormat dateInputFormat, String str, char c2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = dateInputFormat.patternWithDelimiters;
        }
        if ((i2 & 2) != 0) {
            c2 = dateInputFormat.delimiter;
        }
        return dateInputFormat.copy(str, c2);
    }

    public final String component1() {
        return this.patternWithDelimiters;
    }

    public final char component2() {
        return this.delimiter;
    }

    public final DateInputFormat copy(String str, char c2) {
        return new DateInputFormat(str, c2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DateInputFormat)) {
            return false;
        }
        DateInputFormat dateInputFormat = (DateInputFormat) obj;
        return x.n(this.patternWithDelimiters, dateInputFormat.patternWithDelimiters) && this.delimiter == dateInputFormat.delimiter;
    }

    public final char getDelimiter() {
        return this.delimiter;
    }

    public final String getPatternWithDelimiters() {
        return this.patternWithDelimiters;
    }

    public final String getPatternWithoutDelimiters() {
        return this.patternWithoutDelimiters;
    }

    public int hashCode() {
        return (this.patternWithDelimiters.hashCode() * 31) + this.delimiter;
    }

    public String toString() {
        return "DateInputFormat(patternWithDelimiters=" + this.patternWithDelimiters + ", delimiter=" + this.delimiter + ')';
    }
}
