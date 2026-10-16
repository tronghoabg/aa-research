package androidx.compose.ui;

import h.g.a;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface UiMediaScope {
    boolean getHasCamera();

    boolean getHasMicrophone();

    /* renamed from: getKeyboardKind-J9_QTjY, reason: not valid java name */
    String mo7671getKeyboardKindJ9_QTjY();

    /* renamed from: getPointerPrecision-fpxItnM, reason: not valid java name */
    String mo7672getPointerPrecisionfpxItnM();

    /* renamed from: getViewingDistance-tKro-MQ, reason: not valid java name */
    String mo7673getViewingDistancetKroMQ();

    /* renamed from: getWindowHeight-D9Ej5fM, reason: not valid java name */
    float mo7674getWindowHeightD9Ej5fM();

    /* renamed from: getWindowPosture-m18o9QQ, reason: not valid java name */
    String mo7675getWindowPosturem18o9QQ();

    /* renamed from: getWindowWidth-D9Ej5fM, reason: not valid java name */
    float mo7676getWindowWidthD9Ej5fM();

    /* compiled from: WazeSource */
    @a
    public final class KeyboardKind {
        private final String description;
        public static final Companion Companion = new Companion(null);
        private static final String Physical = "Physical";
        private static final String Virtual = "Virtual";
        private static final String None = "None";

        private /* synthetic */ KeyboardKind(String str) {
            this.description = str;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ KeyboardKind m7677boximpl(String str) {
            return new KeyboardKind(str);
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m7679equalsimpl(String str, Object obj) {
            return (obj instanceof KeyboardKind) && x.n(str, ((KeyboardKind) obj).m7683unboximpl());
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m7680equalsimpl0(String str, String str2) {
            return x.n(str, str2);
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m7681hashCodeimpl(String str) {
            return str.hashCode();
        }

        public boolean equals(Object obj) {
            return m7679equalsimpl(this.description, obj);
        }

        public int hashCode() {
            return m7681hashCodeimpl(this.description);
        }

        public String toString() {
            return this.description;
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ String m7683unboximpl() {
            return this.description;
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            /* renamed from: getNone-J9_QTjY, reason: not valid java name */
            public final String m7684getNoneJ9_QTjY() {
                return KeyboardKind.None;
            }

            /* renamed from: getPhysical-J9_QTjY, reason: not valid java name */
            public final String m7685getPhysicalJ9_QTjY() {
                return KeyboardKind.Physical;
            }

            /* renamed from: getVirtual-J9_QTjY, reason: not valid java name */
            public final String m7686getVirtualJ9_QTjY() {
                return KeyboardKind.Virtual;
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        private static String m7678constructorimpl(String str) {
            return str;
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m7682toStringimpl(String str) {
            return str;
        }
    }

    /* compiled from: WazeSource */
    @a
    public final class PointerPrecision {
        private final String description;
        public static final Companion Companion = new Companion(null);
        private static final String Fine = "Fine";
        private static final String Coarse = "Coarse";
        private static final String Blunt = "Blunt";
        private static final String None = "None";

        private /* synthetic */ PointerPrecision(String str) {
            this.description = str;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ PointerPrecision m7687boximpl(String str) {
            return new PointerPrecision(str);
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m7689equalsimpl(String str, Object obj) {
            return (obj instanceof PointerPrecision) && x.n(str, ((PointerPrecision) obj).m7693unboximpl());
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m7690equalsimpl0(String str, String str2) {
            return x.n(str, str2);
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m7691hashCodeimpl(String str) {
            return str.hashCode();
        }

        public boolean equals(Object obj) {
            return m7689equalsimpl(this.description, obj);
        }

        public int hashCode() {
            return m7691hashCodeimpl(this.description);
        }

        public String toString() {
            return this.description;
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ String m7693unboximpl() {
            return this.description;
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            /* renamed from: getBlunt-fpxItnM, reason: not valid java name */
            public final String m7694getBluntfpxItnM() {
                return PointerPrecision.Blunt;
            }

            /* renamed from: getCoarse-fpxItnM, reason: not valid java name */
            public final String m7695getCoarsefpxItnM() {
                return PointerPrecision.Coarse;
            }

            /* renamed from: getFine-fpxItnM, reason: not valid java name */
            public final String m7696getFinefpxItnM() {
                return PointerPrecision.Fine;
            }

            /* renamed from: getNone-fpxItnM, reason: not valid java name */
            public final String m7697getNonefpxItnM() {
                return PointerPrecision.None;
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        private static String m7688constructorimpl(String str) {
            return str;
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m7692toStringimpl(String str) {
            return str;
        }
    }

    /* compiled from: WazeSource */
    @a
    public final class Posture {
        private final String description;
        public static final Companion Companion = new Companion(null);
        private static final String Flat = "Flat";
        private static final String Tabletop = "Tabletop";
        private static final String Book = "Book";

        private /* synthetic */ Posture(String str) {
            this.description = str;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Posture m7698boximpl(String str) {
            return new Posture(str);
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m7700equalsimpl(String str, Object obj) {
            return (obj instanceof Posture) && x.n(str, ((Posture) obj).m7704unboximpl());
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m7701equalsimpl0(String str, String str2) {
            return x.n(str, str2);
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m7702hashCodeimpl(String str) {
            return str.hashCode();
        }

        public boolean equals(Object obj) {
            return m7700equalsimpl(this.description, obj);
        }

        public int hashCode() {
            return m7702hashCodeimpl(this.description);
        }

        public String toString() {
            return this.description;
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ String m7704unboximpl() {
            return this.description;
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            /* renamed from: getBook-m18o9QQ, reason: not valid java name */
            public final String m7705getBookm18o9QQ() {
                return Posture.Book;
            }

            /* renamed from: getFlat-m18o9QQ, reason: not valid java name */
            public final String m7706getFlatm18o9QQ() {
                return Posture.Flat;
            }

            /* renamed from: getTabletop-m18o9QQ, reason: not valid java name */
            public final String m7707getTabletopm18o9QQ() {
                return Posture.Tabletop;
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        private static String m7699constructorimpl(String str) {
            return str;
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m7703toStringimpl(String str) {
            return str;
        }
    }

    /* compiled from: WazeSource */
    @a
    public final class ViewingDistance {
        private final String description;
        public static final Companion Companion = new Companion(null);
        private static final String Near = "Near";
        private static final String Medium = "Medium";
        private static final String Far = "Far";

        private /* synthetic */ ViewingDistance(String str) {
            this.description = str;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ ViewingDistance m7708boximpl(String str) {
            return new ViewingDistance(str);
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m7710equalsimpl(String str, Object obj) {
            return (obj instanceof ViewingDistance) && x.n(str, ((ViewingDistance) obj).m7714unboximpl());
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m7711equalsimpl0(String str, String str2) {
            return x.n(str, str2);
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m7712hashCodeimpl(String str) {
            return str.hashCode();
        }

        public boolean equals(Object obj) {
            return m7710equalsimpl(this.description, obj);
        }

        public int hashCode() {
            return m7712hashCodeimpl(this.description);
        }

        public String toString() {
            return this.description;
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ String m7714unboximpl() {
            return this.description;
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            /* renamed from: getFar-tKro-MQ, reason: not valid java name */
            public final String m7715getFartKroMQ() {
                return ViewingDistance.Far;
            }

            /* renamed from: getMedium-tKro-MQ, reason: not valid java name */
            public final String m7716getMediumtKroMQ() {
                return ViewingDistance.Medium;
            }

            /* renamed from: getNear-tKro-MQ, reason: not valid java name */
            public final String m7717getNeartKroMQ() {
                return ViewingDistance.Near;
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        private static String m7709constructorimpl(String str) {
            return str;
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m7713toStringimpl(String str) {
            return str;
        }
    }
}
