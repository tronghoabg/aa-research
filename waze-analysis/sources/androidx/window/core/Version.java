package androidx.window.core;

import com.waze.strings.DisplayStrings;
import h.f;
import h.g;
import h.g.a.a;
import h.g.b.x;
import h.n.o;
import java.math.BigInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class Version implements Comparable<Version> {
    private static final Version CURRENT;
    public static final Companion Companion = new Companion(null);
    private static final Version UNKNOWN = new Version(0, 0, 0, "");
    private static final Version VERSION_0_1 = new Version(0, 1, 0, "");
    private static final Version VERSION_1_0;
    private static final String VERSION_PATTERN_STRING = "(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?";
    private final f bigInteger$delegate;
    private final String description;
    private final int major;
    private final int minor;
    private final int patch;

    static {
        Version version = new Version(1, 0, 0, "");
        VERSION_1_0 = version;
        CURRENT = version;
    }

    private Version(int i2, int i3, int i4, String str) {
        this.major = i2;
        this.minor = i3;
        this.patch = i4;
        this.description = str;
        this.bigInteger$delegate = g.a(new a() { // from class: androidx.window.core.Version$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                Version version = this.f$0;
                return BigInteger.valueOf(version.major).shiftLeft(32).or(BigInteger.valueOf(version.minor)).shiftLeft(32).or(BigInteger.valueOf(version.patch));
            }
        });
    }

    private final BigInteger getBigInteger() {
        Object value = this.bigInteger$delegate.getValue();
        x.e(value, "getValue(...)");
        return (BigInteger) value;
    }

    public static final Version parse(String str) {
        return Companion.parse(str);
    }

    @Override // java.lang.Comparable
    public int compareTo(Version version) {
        x.f(version, "other");
        return getBigInteger().compareTo(version.getBigInteger());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Version)) {
            return false;
        }
        Version version = (Version) obj;
        return this.major == version.major && this.minor == version.minor && this.patch == version.patch;
    }

    public final String getDescription() {
        return this.description;
    }

    public final int getMajor() {
        return this.major;
    }

    public final int getMinor() {
        return this.minor;
    }

    public final int getPatch() {
        return this.patch;
    }

    public int hashCode() {
        return ((((this.major + DisplayStrings.DS_REPORT_MENU_V2_ANIMAL_ON_SHOULDER_LABEL) * 31) + this.minor) * 31) + this.patch;
    }

    public String toString() {
        String strConcat = !o.G(this.description) ? "-".concat(String.valueOf(this.description)) : "";
        return this.major + "." + this.minor + "." + this.patch + strConcat;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final Version getCURRENT() {
            return Version.CURRENT;
        }

        public final Version getUNKNOWN() {
            return Version.UNKNOWN;
        }

        public final Version getVERSION_0_1() {
            return Version.VERSION_0_1;
        }

        public final Version getVERSION_1_0() {
            return Version.VERSION_1_0;
        }

        public final Version parse(String str) throws NumberFormatException {
            String strGroup;
            if (str == null) {
                return null;
            }
            String str2 = str;
            if (o.G(str2)) {
                return null;
            }
            Matcher matcher = Pattern.compile(Version.VERSION_PATTERN_STRING).matcher(str2);
            if (!matcher.matches() || (strGroup = matcher.group(1)) == null) {
                return null;
            }
            int i2 = Integer.parseInt(strGroup);
            String strGroup2 = matcher.group(2);
            if (strGroup2 == null) {
                return null;
            }
            int i3 = Integer.parseInt(strGroup2);
            String strGroup3 = matcher.group(3);
            if (strGroup3 == null) {
                return null;
            }
            int i4 = Integer.parseInt(strGroup3);
            String strGroup4 = matcher.group(4) != null ? matcher.group(4) : "";
            x.c(strGroup4);
            return new Version(i2, i3, i4, strGroup4, null);
        }

        public /* synthetic */ Companion(h.g.b.o oVar) {
            this();
        }
    }

    public /* synthetic */ Version(int i2, int i3, int i4, String str, h.g.b.o oVar) {
        this(i2, i3, i4, str);
    }
}
