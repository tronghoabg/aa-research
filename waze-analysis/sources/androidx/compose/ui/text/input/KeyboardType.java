package androidx.compose.ui.text.input;

import androidx.exifinterface.media.ExifInterface;
import h.g.a;
import h.g.b.o;

/* compiled from: WazeSource */
@a
/* loaded from: classes.dex */
public final class KeyboardType {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Unspecified = 0;
    private static final int Text = 1;
    private static final int Ascii = 2;
    private static final int Number = 3;
    private static final int Phone = 4;
    private static final int Uri = 5;
    private static final int Email = 6;
    private static final int Password = 7;
    private static final int NumberPassword = 8;
    private static final int Decimal = 9;
    private static final int PasswordVisible = 10;
    private static final int PostalAddress = 11;
    private static final int PersonName = 12;
    private static final int EmailSubject = 13;
    private static final int ShortMessage = 14;
    private static final int LongMessage = 15;
    private static final int Filter = 16;
    private static final int Phonetic = 17;
    private static final int DateTime = 18;
    private static final int Date = 19;
    private static final int Time = 20;
    private static final int NumberSigned = 21;
    private static final int DecimalSigned = 22;
    private static final int DecimalPassword = 23;
    private static final int NumberPasswordSigned = 24;
    private static final int DecimalPasswordSigned = 25;

    private /* synthetic */ KeyboardType(int i2) {
        this.value = i2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ KeyboardType m10767boximpl(int i2) {
        return new KeyboardType(i2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m10769equalsimpl(int i2, Object obj) {
        return (obj instanceof KeyboardType) && i2 == ((KeyboardType) obj).m10773unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m10770equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m10772toStringimpl(int i2) {
        return m10770equalsimpl0(i2, Unspecified) ? "Unspecified" : m10770equalsimpl0(i2, Text) ? "Text" : m10770equalsimpl0(i2, Ascii) ? "Ascii" : m10770equalsimpl0(i2, Number) ? "Number" : m10770equalsimpl0(i2, Phone) ? "Phone" : m10770equalsimpl0(i2, Uri) ? "Uri" : m10770equalsimpl0(i2, Email) ? "Email" : m10770equalsimpl0(i2, Password) ? "Password" : m10770equalsimpl0(i2, NumberPassword) ? "NumberPassword" : m10770equalsimpl0(i2, Decimal) ? "Decimal" : m10770equalsimpl0(i2, PasswordVisible) ? "PasswordVisible" : m10770equalsimpl0(i2, PostalAddress) ? "PostalAddress" : m10770equalsimpl0(i2, PersonName) ? "PersonName" : m10770equalsimpl0(i2, EmailSubject) ? "EmailSubject" : m10770equalsimpl0(i2, ShortMessage) ? "ShortMessage" : m10770equalsimpl0(i2, LongMessage) ? "LongMessage" : m10770equalsimpl0(i2, Filter) ? "Filter" : m10770equalsimpl0(i2, Phonetic) ? "Phonetic" : m10770equalsimpl0(i2, DateTime) ? ExifInterface.TAG_DATETIME : m10770equalsimpl0(i2, Date) ? "Date" : m10770equalsimpl0(i2, Time) ? "Time" : m10770equalsimpl0(i2, NumberSigned) ? "NumberSigned" : m10770equalsimpl0(i2, DecimalSigned) ? "DecimalSigned" : m10770equalsimpl0(i2, DecimalPassword) ? "DecimalPassword" : m10770equalsimpl0(i2, NumberPasswordSigned) ? "NumberPasswordSigned" : m10770equalsimpl0(i2, DecimalPasswordSigned) ? "DecimalPasswordSigned" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m10769equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return this.value;
    }

    public String toString() {
        return m10772toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m10773unboximpl() {
        return this.value;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getAscii-PjHm6EE, reason: not valid java name */
        public final int m10800getAsciiPjHm6EE() {
            return KeyboardType.Ascii;
        }

        /* renamed from: getDate-PjHm6EE, reason: not valid java name */
        public final int m10801getDatePjHm6EE() {
            return KeyboardType.Date;
        }

        /* renamed from: getDateTime-PjHm6EE, reason: not valid java name */
        public final int m10802getDateTimePjHm6EE() {
            return KeyboardType.DateTime;
        }

        /* renamed from: getDecimal-PjHm6EE, reason: not valid java name */
        public final int m10803getDecimalPjHm6EE() {
            return KeyboardType.Decimal;
        }

        /* renamed from: getDecimalPassword-PjHm6EE, reason: not valid java name */
        public final int m10804getDecimalPasswordPjHm6EE() {
            return KeyboardType.DecimalPassword;
        }

        /* renamed from: getDecimalPasswordSigned-PjHm6EE, reason: not valid java name */
        public final int m10805getDecimalPasswordSignedPjHm6EE() {
            return KeyboardType.DecimalPasswordSigned;
        }

        /* renamed from: getDecimalSigned-PjHm6EE, reason: not valid java name */
        public final int m10806getDecimalSignedPjHm6EE() {
            return KeyboardType.DecimalSigned;
        }

        /* renamed from: getEmail-PjHm6EE, reason: not valid java name */
        public final int m10807getEmailPjHm6EE() {
            return KeyboardType.Email;
        }

        /* renamed from: getEmailSubject-PjHm6EE, reason: not valid java name */
        public final int m10808getEmailSubjectPjHm6EE() {
            return KeyboardType.EmailSubject;
        }

        /* renamed from: getFilter-PjHm6EE, reason: not valid java name */
        public final int m10809getFilterPjHm6EE() {
            return KeyboardType.Filter;
        }

        /* renamed from: getLongMessage-PjHm6EE, reason: not valid java name */
        public final int m10810getLongMessagePjHm6EE() {
            return KeyboardType.LongMessage;
        }

        /* renamed from: getNumber-PjHm6EE, reason: not valid java name */
        public final int m10811getNumberPjHm6EE() {
            return KeyboardType.Number;
        }

        /* renamed from: getNumberPassword-PjHm6EE, reason: not valid java name */
        public final int m10812getNumberPasswordPjHm6EE() {
            return KeyboardType.NumberPassword;
        }

        /* renamed from: getNumberPasswordSigned-PjHm6EE, reason: not valid java name */
        public final int m10813getNumberPasswordSignedPjHm6EE() {
            return KeyboardType.NumberPasswordSigned;
        }

        /* renamed from: getNumberSigned-PjHm6EE, reason: not valid java name */
        public final int m10814getNumberSignedPjHm6EE() {
            return KeyboardType.NumberSigned;
        }

        /* renamed from: getPassword-PjHm6EE, reason: not valid java name */
        public final int m10815getPasswordPjHm6EE() {
            return KeyboardType.Password;
        }

        /* renamed from: getPasswordVisible-PjHm6EE, reason: not valid java name */
        public final int m10816getPasswordVisiblePjHm6EE() {
            return KeyboardType.PasswordVisible;
        }

        /* renamed from: getPersonName-PjHm6EE, reason: not valid java name */
        public final int m10817getPersonNamePjHm6EE() {
            return KeyboardType.PersonName;
        }

        /* renamed from: getPhone-PjHm6EE, reason: not valid java name */
        public final int m10818getPhonePjHm6EE() {
            return KeyboardType.Phone;
        }

        /* renamed from: getPhonetic-PjHm6EE, reason: not valid java name */
        public final int m10819getPhoneticPjHm6EE() {
            return KeyboardType.Phonetic;
        }

        /* renamed from: getPostalAddress-PjHm6EE, reason: not valid java name */
        public final int m10820getPostalAddressPjHm6EE() {
            return KeyboardType.PostalAddress;
        }

        /* renamed from: getShortMessage-PjHm6EE, reason: not valid java name */
        public final int m10821getShortMessagePjHm6EE() {
            return KeyboardType.ShortMessage;
        }

        /* renamed from: getText-PjHm6EE, reason: not valid java name */
        public final int m10822getTextPjHm6EE() {
            return KeyboardType.Text;
        }

        /* renamed from: getTime-PjHm6EE, reason: not valid java name */
        public final int m10823getTimePjHm6EE() {
            return KeyboardType.Time;
        }

        /* renamed from: getUnspecified-PjHm6EE, reason: not valid java name */
        public final int m10824getUnspecifiedPjHm6EE() {
            return KeyboardType.Unspecified;
        }

        /* renamed from: getUri-PjHm6EE, reason: not valid java name */
        public final int m10825getUriPjHm6EE() {
            return KeyboardType.Uri;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }

        /* renamed from: getAscii-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m10774getAsciiPjHm6EE$annotations() {
        }

        /* renamed from: getDate-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m10775getDatePjHm6EE$annotations() {
        }

        /* renamed from: getDateTime-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m10776getDateTimePjHm6EE$annotations() {
        }

        /* renamed from: getDecimal-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m10777getDecimalPjHm6EE$annotations() {
        }

        /* renamed from: getDecimalPassword-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m10778getDecimalPasswordPjHm6EE$annotations() {
        }

        /* renamed from: getDecimalPasswordSigned-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m10779getDecimalPasswordSignedPjHm6EE$annotations() {
        }

        /* renamed from: getDecimalSigned-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m10780getDecimalSignedPjHm6EE$annotations() {
        }

        /* renamed from: getEmail-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m10781getEmailPjHm6EE$annotations() {
        }

        /* renamed from: getEmailSubject-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m10782getEmailSubjectPjHm6EE$annotations() {
        }

        /* renamed from: getFilter-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m10783getFilterPjHm6EE$annotations() {
        }

        /* renamed from: getLongMessage-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m10784getLongMessagePjHm6EE$annotations() {
        }

        /* renamed from: getNumber-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m10785getNumberPjHm6EE$annotations() {
        }

        /* renamed from: getNumberPassword-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m10786getNumberPasswordPjHm6EE$annotations() {
        }

        /* renamed from: getNumberPasswordSigned-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m10787getNumberPasswordSignedPjHm6EE$annotations() {
        }

        /* renamed from: getNumberSigned-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m10788getNumberSignedPjHm6EE$annotations() {
        }

        /* renamed from: getPassword-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m10789getPasswordPjHm6EE$annotations() {
        }

        /* renamed from: getPasswordVisible-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m10790getPasswordVisiblePjHm6EE$annotations() {
        }

        /* renamed from: getPersonName-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m10791getPersonNamePjHm6EE$annotations() {
        }

        /* renamed from: getPhone-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m10792getPhonePjHm6EE$annotations() {
        }

        /* renamed from: getPhonetic-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m10793getPhoneticPjHm6EE$annotations() {
        }

        /* renamed from: getPostalAddress-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m10794getPostalAddressPjHm6EE$annotations() {
        }

        /* renamed from: getShortMessage-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m10795getShortMessagePjHm6EE$annotations() {
        }

        /* renamed from: getText-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m10796getTextPjHm6EE$annotations() {
        }

        /* renamed from: getTime-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m10797getTimePjHm6EE$annotations() {
        }

        /* renamed from: getUnspecified-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m10798getUnspecifiedPjHm6EE$annotations() {
        }

        /* renamed from: getUri-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m10799getUriPjHm6EE$annotations() {
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m10768constructorimpl(int i2) {
        return i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m10771hashCodeimpl(int i2) {
        return i2;
    }
}
