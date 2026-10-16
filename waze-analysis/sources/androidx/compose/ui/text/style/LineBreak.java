package androidx.compose.ui.text.style;

import h.g.a;
import h.g.b.o;

/* compiled from: WazeSource */
@a
/* loaded from: classes.dex */
public final class LineBreak {
    private final int mask;
    public static final Companion Companion = new Companion(null);
    private static final int Simple = LineBreak_androidKt.packBytes(Strategy.Companion.m10939getSimplefcGXIks(), Strictness.Companion.m10950getNormalusljTpc(), WordBreak.Companion.m10960getDefaultjp8hJ3c());
    private static final int Heading = LineBreak_androidKt.packBytes(Strategy.Companion.m10937getBalancedfcGXIks(), Strictness.Companion.m10949getLooseusljTpc(), WordBreak.Companion.m10961getPhrasejp8hJ3c());
    private static final int Paragraph = LineBreak_androidKt.packBytes(Strategy.Companion.m10938getHighQualityfcGXIks(), Strictness.Companion.m10951getStrictusljTpc(), WordBreak.Companion.m10960getDefaultjp8hJ3c());
    private static final int Unspecified = 0;

    private /* synthetic */ LineBreak(int i2) {
        this.mask = i2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ LineBreak m10909boximpl(int i2) {
        return new LineBreak(i2);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m10911constructorimpl(int i2, int i3, int i4) {
        return LineBreak_androidKt.packBytes(i2, i3, i4);
    }

    /* renamed from: copy-gijOMQM, reason: not valid java name */
    public static final int m10912copygijOMQM(int i2, int i3, int i4, int i5) {
        return m10911constructorimpl(i3, i4, i5);
    }

    /* renamed from: copy-gijOMQM$default, reason: not valid java name */
    public static /* synthetic */ int m10913copygijOMQM$default(int i2, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i3 = m10916getStrategyfcGXIks(i2);
        }
        if ((i6 & 2) != 0) {
            i4 = m10917getStrictnessusljTpc(i2);
        }
        if ((i6 & 4) != 0) {
            i5 = m10918getWordBreakjp8hJ3c(i2);
        }
        return m10912copygijOMQM(i2, i3, i4, i5);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m10914equalsimpl(int i2, Object obj) {
        return (obj instanceof LineBreak) && i2 == ((LineBreak) obj).m10921unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m10915equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: getStrategy-fcGXIks, reason: not valid java name */
    public static final int m10916getStrategyfcGXIks(int i2) {
        return LineBreak_androidKt.unpackByte1(i2);
    }

    /* renamed from: getStrictness-usljTpc, reason: not valid java name */
    public static final int m10917getStrictnessusljTpc(int i2) {
        return LineBreak_androidKt.unpackByte2(i2);
    }

    /* renamed from: getWordBreak-jp8hJ3c, reason: not valid java name */
    public static final int m10918getWordBreakjp8hJ3c(int i2) {
        return LineBreak_androidKt.unpackByte3(i2);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m10920toStringimpl(int i2) {
        return "LineBreak(strategy=" + ((Object) Strategy.m10935toStringimpl(m10916getStrategyfcGXIks(i2))) + ", strictness=" + ((Object) Strictness.m10946toStringimpl(m10917getStrictnessusljTpc(i2))) + ", wordBreak=" + ((Object) WordBreak.m10958toStringimpl(m10918getWordBreakjp8hJ3c(i2))) + ')';
    }

    public boolean equals(Object obj) {
        return m10914equalsimpl(this.mask, obj);
    }

    public int hashCode() {
        return this.mask;
    }

    public String toString() {
        return m10920toStringimpl(this.mask);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m10921unboximpl() {
        return this.mask;
    }

    /* compiled from: WazeSource */
    @a
    public final class Strategy {
        private final int value;
        public static final Companion Companion = new Companion(null);
        private static final int Simple = 1;
        private static final int HighQuality = 2;
        private static final int Balanced = 3;
        private static final int Unspecified = 0;

        private /* synthetic */ Strategy(int i2) {
            this.value = i2;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Strategy m10930boximpl(int i2) {
            return new Strategy(i2);
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m10932equalsimpl(int i2, Object obj) {
            return (obj instanceof Strategy) && i2 == ((Strategy) obj).m10936unboximpl();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m10933equalsimpl0(int i2, int i3) {
            return i2 == i3;
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m10935toStringimpl(int i2) {
            return m10933equalsimpl0(i2, Simple) ? "Strategy.Simple" : m10933equalsimpl0(i2, HighQuality) ? "Strategy.HighQuality" : m10933equalsimpl0(i2, Balanced) ? "Strategy.Balanced" : m10933equalsimpl0(i2, Unspecified) ? "Strategy.Unspecified" : "Invalid";
        }

        public boolean equals(Object obj) {
            return m10932equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return this.value;
        }

        public String toString() {
            return m10935toStringimpl(this.value);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m10936unboximpl() {
            return this.value;
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            /* renamed from: getBalanced-fcGXIks, reason: not valid java name */
            public final int m10937getBalancedfcGXIks() {
                return Strategy.Balanced;
            }

            /* renamed from: getHighQuality-fcGXIks, reason: not valid java name */
            public final int m10938getHighQualityfcGXIks() {
                return Strategy.HighQuality;
            }

            /* renamed from: getSimple-fcGXIks, reason: not valid java name */
            public final int m10939getSimplefcGXIks() {
                return Strategy.Simple;
            }

            /* renamed from: getUnspecified-fcGXIks, reason: not valid java name */
            public final int m10940getUnspecifiedfcGXIks() {
                return Strategy.Unspecified;
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static int m10931constructorimpl(int i2) {
            return i2;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m10934hashCodeimpl(int i2) {
            return i2;
        }
    }

    /* compiled from: WazeSource */
    @a
    public final class Strictness {
        public static final Companion Companion = new Companion(null);
        private static final int Default = 1;
        private static final int Loose = 2;
        private static final int Normal = 3;
        private static final int Strict = 4;
        private static final int Unspecified = 0;
        private final int value;

        private /* synthetic */ Strictness(int i2) {
            this.value = i2;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Strictness m10941boximpl(int i2) {
            return new Strictness(i2);
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m10943equalsimpl(int i2, Object obj) {
            return (obj instanceof Strictness) && i2 == ((Strictness) obj).m10947unboximpl();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m10944equalsimpl0(int i2, int i3) {
            return i2 == i3;
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m10946toStringimpl(int i2) {
            return m10944equalsimpl0(i2, Default) ? "Strictness.None" : m10944equalsimpl0(i2, Loose) ? "Strictness.Loose" : m10944equalsimpl0(i2, Normal) ? "Strictness.Normal" : m10944equalsimpl0(i2, Strict) ? "Strictness.Strict" : m10944equalsimpl0(i2, Unspecified) ? "Strictness.Unspecified" : "Invalid";
        }

        public boolean equals(Object obj) {
            return m10943equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return this.value;
        }

        public String toString() {
            return m10946toStringimpl(this.value);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m10947unboximpl() {
            return this.value;
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            /* renamed from: getDefault-usljTpc, reason: not valid java name */
            public final int m10948getDefaultusljTpc() {
                return Strictness.Default;
            }

            /* renamed from: getLoose-usljTpc, reason: not valid java name */
            public final int m10949getLooseusljTpc() {
                return Strictness.Loose;
            }

            /* renamed from: getNormal-usljTpc, reason: not valid java name */
            public final int m10950getNormalusljTpc() {
                return Strictness.Normal;
            }

            /* renamed from: getStrict-usljTpc, reason: not valid java name */
            public final int m10951getStrictusljTpc() {
                return Strictness.Strict;
            }

            /* renamed from: getUnspecified-usljTpc, reason: not valid java name */
            public final int m10952getUnspecifiedusljTpc() {
                return Strictness.Unspecified;
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static int m10942constructorimpl(int i2) {
            return i2;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m10945hashCodeimpl(int i2) {
            return i2;
        }
    }

    /* compiled from: WazeSource */
    @a
    public final class WordBreak {
        public static final Companion Companion = new Companion(null);
        private static final int Default = 1;
        private static final int Phrase = 2;
        private static final int Unspecified = 0;
        private final int value;

        private /* synthetic */ WordBreak(int i2) {
            this.value = i2;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ WordBreak m10953boximpl(int i2) {
            return new WordBreak(i2);
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m10955equalsimpl(int i2, Object obj) {
            return (obj instanceof WordBreak) && i2 == ((WordBreak) obj).m10959unboximpl();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m10956equalsimpl0(int i2, int i3) {
            return i2 == i3;
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m10958toStringimpl(int i2) {
            return m10956equalsimpl0(i2, Default) ? "WordBreak.None" : m10956equalsimpl0(i2, Phrase) ? "WordBreak.Phrase" : m10956equalsimpl0(i2, Unspecified) ? "WordBreak.Unspecified" : "Invalid";
        }

        public boolean equals(Object obj) {
            return m10955equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return this.value;
        }

        public String toString() {
            return m10958toStringimpl(this.value);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m10959unboximpl() {
            return this.value;
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            /* renamed from: getDefault-jp8hJ3c, reason: not valid java name */
            public final int m10960getDefaultjp8hJ3c() {
                return WordBreak.Default;
            }

            /* renamed from: getPhrase-jp8hJ3c, reason: not valid java name */
            public final int m10961getPhrasejp8hJ3c() {
                return WordBreak.Phrase;
            }

            /* renamed from: getUnspecified-jp8hJ3c, reason: not valid java name */
            public final int m10962getUnspecifiedjp8hJ3c() {
                return WordBreak.Unspecified;
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static int m10954constructorimpl(int i2) {
            return i2;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m10957hashCodeimpl(int i2) {
            return i2;
        }
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getHeading-rAG3T2k, reason: not valid java name */
        public final int m10926getHeadingrAG3T2k() {
            return LineBreak.Heading;
        }

        /* renamed from: getParagraph-rAG3T2k, reason: not valid java name */
        public final int m10927getParagraphrAG3T2k() {
            return LineBreak.Paragraph;
        }

        /* renamed from: getSimple-rAG3T2k, reason: not valid java name */
        public final int m10928getSimplerAG3T2k() {
            return LineBreak.Simple;
        }

        /* renamed from: getUnspecified-rAG3T2k, reason: not valid java name */
        public final int m10929getUnspecifiedrAG3T2k() {
            return LineBreak.Unspecified;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }

        /* renamed from: getHeading-rAG3T2k$annotations, reason: not valid java name */
        public static /* synthetic */ void m10922getHeadingrAG3T2k$annotations() {
        }

        /* renamed from: getParagraph-rAG3T2k$annotations, reason: not valid java name */
        public static /* synthetic */ void m10923getParagraphrAG3T2k$annotations() {
        }

        /* renamed from: getSimple-rAG3T2k$annotations, reason: not valid java name */
        public static /* synthetic */ void m10924getSimplerAG3T2k$annotations() {
        }

        /* renamed from: getUnspecified-rAG3T2k$annotations, reason: not valid java name */
        public static /* synthetic */ void m10925getUnspecifiedrAG3T2k$annotations() {
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m10910constructorimpl(int i2) {
        return i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m10919hashCodeimpl(int i2) {
        return i2;
    }
}
