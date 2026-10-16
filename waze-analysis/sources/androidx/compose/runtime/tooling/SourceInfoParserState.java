package androidx.compose.runtime.tooling;

import h.e;
import h.g.b.x;
import h.n.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class SourceInfoParserState {
    private final String data;

    /* renamed from: i, reason: collision with root package name */
    private int f1672i;

    public SourceInfoParserState(String str) {
        this.data = str;
    }

    public static /* synthetic */ void advance$default(SourceInfoParserState sourceInfoParserState, int i2, int i3, Object obj) {
        if (1 == (i3 & 1)) {
            i2 = 1;
        }
        sourceInfoParserState.advance(i2);
    }

    public final void advance(int i2) {
        this.f1672i += i2;
    }

    public final boolean atEnd() {
        return this.f1672i >= this.data.length();
    }

    public final char current() {
        return this.data.charAt(this.f1672i);
    }

    public final void expect(char c2) throws ParseException {
        if (matches(c2)) {
            return;
        }
        throwParseError("expected " + c2);
        throw new e();
    }

    public final String getData() {
        return this.data;
    }

    public final int getI() {
        return this.f1672i;
    }

    public final boolean matches(char c2) {
        return this.f1672i < this.data.length() && this.data.charAt(this.f1672i) == c2;
    }

    public final void setI(int i2) {
        this.f1672i = i2;
    }

    public final void skipUntil(String str) {
        while (this.f1672i < this.data.length() && !o.O(str, this.data.charAt(this.f1672i))) {
            this.f1672i++;
        }
    }

    public final int takeIntUntil(String str) throws ParseException {
        Integer numF = o.f(takeUntil(str));
        if (numF != null) {
            return numF.intValue();
        }
        throwParseError("expected int");
        throw new e();
    }

    public final String takeUntil(String str) {
        int i2 = this.f1672i;
        skipUntil(str);
        int i3 = this.f1672i;
        if (i3 <= i2) {
            return "";
        }
        String strSubstring = this.data.substring(i2, i3);
        x.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final String takeUntilEnd() {
        String str = this.data;
        String strSubstring = str.substring(this.f1672i, str.length());
        x.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final Void throwParseError(String str) throws ParseException {
        int iMin = Math.min(this.f1672i, this.data.length());
        StringBuilder sb = new StringBuilder("Error while parsing source information: ");
        sb.append(str);
        sb.append(" at ");
        String strSubstring = this.data.substring(0, iMin);
        x.e(strSubstring, "substring(...)");
        sb.append(strSubstring);
        sb.append('|');
        String strSubstring2 = this.data.substring(iMin);
        x.e(strSubstring2, "substring(...)");
        sb.append(strSubstring2);
        throw new ParseException(sb.toString());
    }
}
