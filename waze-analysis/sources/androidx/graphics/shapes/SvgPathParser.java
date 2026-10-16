package androidx.graphics.shapes;

import androidx.collection.FloatFloatPair;
import androidx.graphics.shapes.SvgPathParser;
import h.a.c;
import h.a.i;
import h.a.r;
import h.e.b;
import h.g.a.l;
import h.g.a.p;
import h.g.a.q;
import h.g.b.x;
import h.k;
import h.k.j;
import h.k.n;
import h.n.o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class SvgPathParser {
    public static final Companion Companion = new Companion(null);
    private final List<Cubic> cubics;
    private Command previousCommand;
    private final long start;

    private SvgPathParser(long j2) {
        this.cubics = new ArrayList();
        this.start = j2;
        this.previousCommand = new Command('I', false, new float[0], 0, 0L, 16, null);
    }

    /* renamed from: curveToCubic-ArktYTI, reason: not valid java name */
    private final Cubic m11960curveToCubicArktYTI(long j2, long j3, long j4, long j5) {
        return new Cubic(new float[]{PointKt.m11940getXDnnuFBc(j2), PointKt.m11941getYDnnuFBc(j2), PointKt.m11940getXDnnuFBc(j3), PointKt.m11941getYDnnuFBc(j3), PointKt.m11940getXDnnuFBc(j4), PointKt.m11941getYDnnuFBc(j4), PointKt.m11940getXDnnuFBc(j5), PointKt.m11941getYDnnuFBc(j5)});
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getPosition-1ufDz9w, reason: not valid java name */
    public final long m11961getPosition1ufDz9w() {
        Cubic cubic = (Cubic) i.U(this.cubics);
        return cubic != null ? FloatFloatPair.m1675constructorimpl(cubic.getAnchor1X(), cubic.getAnchor1Y()) : this.start;
    }

    /* renamed from: getReflectedPreviousControlPoint-1ufDz9w, reason: not valid java name */
    private final long m11962getReflectedPreviousControlPoint1ufDz9w() {
        return PointKt.m11944plusybeJwSQ(m11961getPosition1ufDz9w(), PointKt.m11943minusybeJwSQ(m11961getPosition1ufDz9w(), FloatFloatPair.m1675constructorimpl(((Cubic) i.T(this.cubics)).getControl1X(), ((Cubic) i.T(this.cubics)).getControl1Y())));
    }

    /* renamed from: lineToCubic-ybeJwSQ, reason: not valid java name */
    private final Cubic m11963lineToCubicybeJwSQ(long j2, long j3) {
        return Cubic.Companion.straightLine(PointKt.m11940getXDnnuFBc(j2), PointKt.m11941getYDnnuFBc(j2), PointKt.m11940getXDnnuFBc(j3), PointKt.m11941getYDnnuFBc(j3));
    }

    private final void parseArc(Command command) {
        long jM11970xyXgqJiTY = command.m11970xyXgqJiTY(5, 6);
        this.cubics.addAll(ArcConverter.Companion.arcToCubics(PointKt.m11940getXDnnuFBc(m11961getPosition1ufDz9w()), PointKt.m11941getYDnnuFBc(m11961getPosition1ufDz9w()), PointKt.m11940getXDnnuFBc(jM11970xyXgqJiTY), PointKt.m11941getYDnnuFBc(jM11970xyXgqJiTY), command.get(0), command.get(1), command.get(2), command.get(3) != 0.0f, command.get(4) != 0.0f));
    }

    private final void parseAtomicCommand(Command command) {
        if (command.isLineCommand()) {
            parseLine(command);
        } else if (command.isCurveCommand()) {
            parseCurve(command);
        } else if (command.isArcCommand()) {
            parseArc(command);
        }
        this.previousCommand = command;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void parseCommand(Command command) {
        if (command.isCloseCommand()) {
            this.cubics.add(m11963lineToCubicybeJwSQ(m11961getPosition1ufDz9w(), this.start));
            return;
        }
        int iX = c.x(command.getParameters());
        int paramsCount = command.getParamsCount();
        if (paramsCount <= 0) {
            throw new IllegalArgumentException("Step must be positive, was: " + paramsCount + ".");
        }
        int i2 = 0;
        int iD = b.d(0, iX, paramsCount);
        if (iD < 0) {
            return;
        }
        while (true) {
            parseAtomicCommand(command.m11966chunkHiPawso(i2, m11961getPosition1ufDz9w()));
            if (i2 == iD) {
                return;
            } else {
                i2 += paramsCount;
            }
        }
    }

    private final void parseCurve(Command command) {
        q qVar = new q() { // from class: androidx.graphics.shapes.SvgPathParser$$ExternalSyntheticLambda1
            @Override // h.g.a.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                SvgPathParser svgPathParser = this.f$0;
                return Boolean.valueOf(svgPathParser.cubics.add(svgPathParser.m11960curveToCubicArktYTI(svgPathParser.m11961getPosition1ufDz9w(), ((FloatFloatPair) obj).m1683unboximpl(), ((FloatFloatPair) obj2).m1683unboximpl(), ((FloatFloatPair) obj3).m1683unboximpl())));
            }
        };
        char letter = command.getLetter();
        if (letter == 'c') {
            qVar.invoke(FloatFloatPair.m1672boximpl(command.m11970xyXgqJiTY(0, 1)), FloatFloatPair.m1672boximpl(command.m11970xyXgqJiTY(2, 3)), FloatFloatPair.m1672boximpl(command.m11970xyXgqJiTY(4, 5)));
            return;
        }
        if (letter == 'q') {
            qVar.invoke(FloatFloatPair.m1672boximpl(command.m11970xyXgqJiTY(0, 1)), FloatFloatPair.m1672boximpl(command.m11970xyXgqJiTY(0, 1)), FloatFloatPair.m1672boximpl(command.m11970xyXgqJiTY(2, 3)));
            return;
        }
        if (letter == 's') {
            qVar.invoke(FloatFloatPair.m1672boximpl(this.previousCommand.isBezierCommand() ? m11962getReflectedPreviousControlPoint1ufDz9w() : m11961getPosition1ufDz9w()), FloatFloatPair.m1672boximpl(command.m11970xyXgqJiTY(0, 1)), FloatFloatPair.m1672boximpl(command.m11970xyXgqJiTY(2, 3)));
        } else {
            if (letter != 't') {
                return;
            }
            long jM11962getReflectedPreviousControlPoint1ufDz9w = this.previousCommand.isQuadraticCurveCommand() ? m11962getReflectedPreviousControlPoint1ufDz9w() : m11961getPosition1ufDz9w();
            qVar.invoke(FloatFloatPair.m1672boximpl(jM11962getReflectedPreviousControlPoint1ufDz9w), FloatFloatPair.m1672boximpl(jM11962getReflectedPreviousControlPoint1ufDz9w), FloatFloatPair.m1672boximpl(command.m11970xyXgqJiTY(0, 1)));
        }
    }

    public static final List<Feature> parseFeatures(String str) {
        return Companion.parseFeatures(str);
    }

    private final void parseLine(Command command) {
        l lVar = new l() { // from class: androidx.graphics.shapes.SvgPathParser$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                SvgPathParser svgPathParser = this.f$0;
                return Boolean.valueOf(svgPathParser.cubics.add(svgPathParser.m11963lineToCubicybeJwSQ(svgPathParser.m11961getPosition1ufDz9w(), ((FloatFloatPair) obj).m1683unboximpl())));
            }
        };
        char letter = command.getLetter();
        if (letter == 'h') {
            lVar.invoke(FloatFloatPair.m1672boximpl(FloatFloatPair.m1675constructorimpl(command.x(0), PointKt.m11941getYDnnuFBc(command.m11969getStart1ufDz9w()))));
        } else if (letter == 'l') {
            lVar.invoke(FloatFloatPair.m1672boximpl(command.m11970xyXgqJiTY(0, 1)));
        } else {
            if (letter != 'v') {
                return;
            }
            lVar.invoke(FloatFloatPair.m1672boximpl(FloatFloatPair.m1675constructorimpl(PointKt.m11940getXDnnuFBc(command.m11969getStart1ufDz9w()), command.y(0))));
        }
    }

    /* compiled from: WazeSource */
    final class Command {
        public static final Factory Factory = new Factory(null);
        private static final Map<Character, Integer> commandToParamsCount = r.k(new k('m', 2), new k('l', 2), new k('h', 1), new k('v', 1), new k('c', 6), new k('s', 4), new k('q', 4), new k('t', 2), new k('a', 7));
        private final boolean isArcCommand;
        private final boolean isBezierCommand;
        private final boolean isCloseCommand;
        private final boolean isCurveCommand;
        private final boolean isLineCommand;
        private final boolean isQuadraticCurveCommand;
        private final boolean isRelative;
        private final char letter;
        private final float[] parameters;
        private final int paramsCount;
        private final long start;

        private Command(char c2, boolean z, float[] fArr, int i2, long j2) {
            x.f(fArr, "parameters");
            this.letter = c2;
            this.isRelative = z;
            this.parameters = fArr;
            this.paramsCount = i2;
            this.start = j2;
            this.isLineCommand = c.ag(new char[]{'l', 'h', 'v'}, c2);
            this.isBezierCommand = c.ag(new char[]{'c', 's'}, c2);
            this.isQuadraticCurveCommand = c.ag(new char[]{'q', 't'}, c2);
            this.isCurveCommand = c.ag(new char[]{'c', 's', 'q', 't'}, c2);
            this.isArcCommand = c2 == 'a';
            this.isCloseCommand = c2 == 'z';
        }

        /* renamed from: copy-teZZwEo$default, reason: not valid java name */
        public static /* synthetic */ Command m11964copyteZZwEo$default(Command command, char c2, boolean z, float[] fArr, int i2, long j2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                c2 = command.letter;
            }
            if ((i3 & 2) != 0) {
                z = command.isRelative;
            }
            if ((i3 & 4) != 0) {
                fArr = command.parameters;
            }
            if ((i3 & 8) != 0) {
                i2 = command.paramsCount;
            }
            if ((i3 & 16) != 0) {
                j2 = command.start;
            }
            long j3 = j2;
            return command.m11968copyteZZwEo(c2, z, fArr, i2, j3);
        }

        /* renamed from: asLine-DnnuFBc, reason: not valid java name */
        public final Command m11965asLineDnnuFBc(long j2) {
            ArrayList arrayListD;
            float[] fArr = this.parameters;
            x.f(fArr, "<this>");
            int i2 = this.paramsCount;
            if (i2 < 0) {
                throw new IllegalArgumentException("Requested element count " + i2 + " is less than zero.");
            }
            int length = fArr.length;
            x.f(fArr, "<this>");
            int iH = n.h(length - i2, 0);
            if (iH < 0) {
                throw new IllegalArgumentException("Requested element count " + iH + " is less than zero.");
            }
            if (iH == 0) {
                arrayListD = i.h();
            } else if (iH >= length) {
                arrayListD = c.U(fArr);
            } else if (iH == 1) {
                arrayListD = i.d(Float.valueOf(fArr[length - 1]));
            } else {
                ArrayList arrayList = new ArrayList(iH);
                for (int i3 = length - iH; i3 < length; i3++) {
                    arrayList.add(Float.valueOf(fArr[i3]));
                }
                arrayListD = arrayList;
            }
            return new Command('l', this.isRelative, i.az(arrayListD), 2, j2, null);
        }

        /* renamed from: chunk-HiPawso, reason: not valid java name */
        public final Command m11966chunkHiPawso(int i2, long j2) {
            float[] fArr = this.parameters;
            j jVarU = n.u(i2, this.paramsCount + i2);
            x.f(fArr, "<this>");
            x.f(jVarU, "indices");
            float[] fArrN = jVarU.isEmpty() ? new float[0] : c.n(fArr, jVarU.getStart().intValue(), jVarU.getEndInclusive().intValue() + 1);
            int i3 = this.paramsCount;
            return new Command(this.letter, this.isRelative, fArrN, i3, j2, null);
        }

        public final char component1() {
            return this.letter;
        }

        public final boolean component2() {
            return this.isRelative;
        }

        public final float[] component3() {
            return this.parameters;
        }

        public final int component4() {
            return this.paramsCount;
        }

        /* renamed from: component5-1ufDz9w, reason: not valid java name */
        public final long m11967component51ufDz9w() {
            return this.start;
        }

        /* renamed from: copy-teZZwEo, reason: not valid java name */
        public final Command m11968copyteZZwEo(char c2, boolean z, float[] fArr, int i2, long j2) {
            x.f(fArr, "parameters");
            return new Command(c2, z, fArr, i2, j2, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Command command = (Command) obj;
            return this.letter == command.letter && Arrays.equals(this.parameters, command.parameters) && this.paramsCount == command.paramsCount;
        }

        public final float get(int i2) {
            return this.parameters[i2];
        }

        public final char getLetter() {
            return this.letter;
        }

        public final float[] getParameters() {
            return this.parameters;
        }

        public final int getParamsCount() {
            return this.paramsCount;
        }

        /* renamed from: getStart-1ufDz9w, reason: not valid java name */
        public final long m11969getStart1ufDz9w() {
            return this.start;
        }

        public int hashCode() {
            return (((this.letter * 31) + Arrays.hashCode(this.parameters)) * 31) + this.paramsCount;
        }

        public final boolean isArcCommand() {
            return this.isArcCommand;
        }

        public final boolean isBezierCommand() {
            return this.isBezierCommand;
        }

        public final boolean isCloseCommand() {
            return this.isCloseCommand;
        }

        public final boolean isCurveCommand() {
            return this.isCurveCommand;
        }

        public final boolean isLineCommand() {
            return this.isLineCommand;
        }

        public final boolean isQuadraticCurveCommand() {
            return this.isQuadraticCurveCommand;
        }

        public final boolean isRelative() {
            return this.isRelative;
        }

        public String toString() {
            long j2 = this.start;
            return "Command(letter=" + this.letter + ", isRelative=" + this.isRelative + ", parameters=" + Arrays.toString(this.parameters) + ", paramsCount=" + this.paramsCount + ", start=" + FloatFloatPair.m1682toStringimpl(j2) + ")";
        }

        public final float x(int i2) {
            boolean z = this.isRelative;
            float f2 = get(i2);
            return z ? PointKt.m11940getXDnnuFBc(this.start) + f2 : f2;
        }

        /* renamed from: xy-XgqJiTY, reason: not valid java name */
        public final long m11970xyXgqJiTY(int i2, int i3) {
            long jM1675constructorimpl = FloatFloatPair.m1675constructorimpl(get(i2), get(i3));
            return this.isRelative ? PointKt.m11944plusybeJwSQ(this.start, jM1675constructorimpl) : jM1675constructorimpl;
        }

        public final float y(int i2) {
            boolean z = this.isRelative;
            float f2 = get(i2);
            return z ? PointKt.m11941getYDnnuFBc(this.start) + f2 : f2;
        }

        /* compiled from: WazeSource */
        public final class Factory {
            private Factory() {
            }

            /* renamed from: parse-HiPawso, reason: not valid java name */
            public final Command m11971parseHiPawso(String str, long j2) {
                x.f(str, "input");
                String str2 = str;
                x.f(str2, "<this>");
                if (str2.length() == 0) {
                    throw new NoSuchElementException("Char sequence is empty.");
                }
                char cCharAt = str2.charAt(0);
                boolean zIsLowerCase = Character.isLowerCase(cCharAt);
                List listAf = o.af(o.M(str, 1), new String[]{" ", ","}, 0, 6);
                ArrayList arrayList = new ArrayList();
                for (Object obj : listAf) {
                    if (!o.G((String) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = arrayList;
                ArrayList arrayList3 = new ArrayList(i.q(arrayList2, 10));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(Float.valueOf(Float.parseFloat(o.v((String) it.next()).toString())));
                }
                float[] fArrAz = i.az(arrayList3);
                char lowerCase = Character.toLowerCase(cCharAt);
                Integer num = (Integer) Command.commandToParamsCount.get(Character.valueOf(Character.toLowerCase(cCharAt)));
                int iIntValue = num != null ? num.intValue() : 0;
                if (!zIsLowerCase) {
                    j2 = FloatFloatPair.m1675constructorimpl(0.0f, 0.0f);
                }
                return new Command(lowerCase, zIsLowerCase, fArrAz, iIntValue, j2, null);
            }

            public /* synthetic */ Factory(h.g.b.o oVar) {
                this();
            }
        }

        public /* synthetic */ Command(char c2, boolean z, float[] fArr, int i2, long j2, h.g.b.o oVar) {
            this(c2, z, fArr, i2, j2);
        }

        public /* synthetic */ Command(char c2, boolean z, float[] fArr, int i2, long j2, int i3, h.g.b.o oVar) {
            this(c2, z, fArr, i2, (i3 & 16) != 0 ? FloatFloatPair.m1675constructorimpl(0.0f, 0.0f) : j2, null);
        }
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        static final boolean parseFeatures$lambda$0(Cubic cubic, Cubic cubic2) {
            x.f(cubic, "first");
            x.f(cubic2, "second");
            return Math.abs(cubic2.getAnchor0X() - cubic.getAnchor1X()) < 1.0E-4f && Math.abs(cubic2.getAnchor0Y() - cubic.getAnchor1Y()) < 1.0E-4f;
        }

        public final List<Cubic> parseCubics$graphics_shapes(String str) {
            x.f(str, "svgPath");
            List listJ = new h.n.l("(?=[mM])").j(str);
            ArrayList arrayList = new ArrayList();
            for (Object obj : listJ) {
                if (!o.G((String) obj)) {
                    arrayList.add(obj);
                }
            }
            long jM1675constructorimpl = FloatFloatPair.m1675constructorimpl(0.0f, 0.0f);
            List listB = i.b();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                List listJ2 = new h.n.l("(?=[a-zA-Z])").j((String) it.next());
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : listJ2) {
                    if (!o.G((String) obj2)) {
                        arrayList2.add(obj2);
                    }
                }
                ArrayList arrayList3 = arrayList2;
                Command commandM11971parseHiPawso = Command.Factory.m11971parseHiPawso((String) i.P(arrayList3), jM1675constructorimpl);
                long jM11944plusybeJwSQ = PointKt.m11944plusybeJwSQ(commandM11971parseHiPawso.m11969getStart1ufDz9w(), FloatFloatPair.m1675constructorimpl(commandM11971parseHiPawso.get(0), commandM11971parseHiPawso.get(1)));
                SvgPathParser svgPathParser = new SvgPathParser(jM11944plusybeJwSQ, null);
                svgPathParser.parseCommand(commandM11971parseHiPawso.m11965asLineDnnuFBc(jM11944plusybeJwSQ));
                Iterator it2 = i.ab(arrayList3, 1).iterator();
                while (it2.hasNext()) {
                    svgPathParser.parseCommand(Command.Factory.m11971parseHiPawso((String) it2.next(), svgPathParser.m11961getPosition1ufDz9w()));
                }
                listB.addAll(svgPathParser.cubics);
                jM1675constructorimpl = jM11944plusybeJwSQ;
            }
            return i.a(listB);
        }

        public final List<Feature> parseFeatures(String str) {
            x.f(str, "svgPath");
            List<Cubic> cubics$graphics_shapes = parseCubics$graphics_shapes(str);
            p pVar = new p() { // from class: androidx.graphics.shapes.SvgPathParser$Companion$$ExternalSyntheticLambda0
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return Boolean.valueOf(SvgPathParser.Companion.parseFeatures$lambda$0((Cubic) obj, (Cubic) obj2));
                }
            };
            int size = cubics$graphics_shapes.size();
            int iE = i.e(cubics$graphics_shapes);
            int i2 = 0;
            while (true) {
                if (i2 >= iE) {
                    break;
                }
                int i3 = i2 + 1;
                if (!((Boolean) pVar.invoke(cubics$graphics_shapes.get(i2), cubics$graphics_shapes.get(i3))).booleanValue()) {
                    size = i2;
                    break;
                }
                i2 = i3;
            }
            return PolygonValidator.Companion.fix(RoundedPolygonKt.RoundedPolygon$default(FeatureDetectorKt.detectFeatures(i.am(cubics$graphics_shapes, size)), 0.0f, 0.0f, 6, null)).getFeatures();
        }

        public /* synthetic */ Companion(h.g.b.o oVar) {
            this();
        }
    }

    public /* synthetic */ SvgPathParser(long j2, h.g.b.o oVar) {
        this(j2);
    }
}
