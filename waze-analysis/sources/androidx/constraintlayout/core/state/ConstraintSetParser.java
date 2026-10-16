package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.motion.utils.TypedBundle;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.parser.CLArray;
import androidx.constraintlayout.core.parser.CLElement;
import androidx.constraintlayout.core.parser.CLKey;
import androidx.constraintlayout.core.parser.CLNumber;
import androidx.constraintlayout.core.parser.CLObject;
import androidx.constraintlayout.core.parser.CLParser;
import androidx.constraintlayout.core.parser.CLParsingException;
import androidx.constraintlayout.core.parser.CLString;
import androidx.constraintlayout.core.state.State;
import androidx.constraintlayout.core.state.helpers.BarrierReference;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public class ConstraintSetParser {
    private static final boolean PARSER_DEBUG = false;

    /* compiled from: WazeSource */
    public class DesignElement {
        String mId;
        HashMap<String, String> mParams;
        String mType;

        DesignElement(String str, String str2, HashMap<String, String> map) {
            this.mId = str;
            this.mType = str2;
            this.mParams = map;
        }

        public String getId() {
            return this.mId;
        }

        public HashMap<String, String> getParams() {
            return this.mParams;
        }

        public String getType() {
            return this.mType;
        }
    }

    /* compiled from: WazeSource */
    class FiniteGenerator implements GeneratedValue {
        float mFrom;
        float mInitial;
        float mMax;
        String mPostfix;
        String mPrefix;
        float mStep;
        float mTo;
        boolean mStop = false;
        float mCurrent = 0.0f;

        FiniteGenerator(float f2, float f3, float f4, String str, String str2) {
            this.mFrom = f2;
            this.mTo = f3;
            this.mStep = f4;
            this.mPrefix = str == null ? "" : str;
            this.mPostfix = str2 == null ? "" : str2;
            this.mMax = f3;
            this.mInitial = f2;
        }

        public ArrayList<String> array() {
            ArrayList<String> arrayList = new ArrayList<>();
            int i2 = (int) this.mInitial;
            int i3 = (int) this.mMax;
            int i4 = i2;
            while (i2 <= i3) {
                arrayList.add(this.mPrefix + i4 + this.mPostfix);
                i4 += (int) this.mStep;
                i2++;
            }
            return arrayList;
        }

        @Override // androidx.constraintlayout.core.state.ConstraintSetParser.GeneratedValue
        public float value() {
            float f2 = this.mCurrent;
            if (f2 >= this.mMax) {
                this.mStop = true;
            }
            if (this.mStop) {
                return f2;
            }
            float f3 = f2 + this.mStep;
            this.mCurrent = f3;
            return f3;
        }
    }

    /* compiled from: WazeSource */
    interface GeneratedValue {
        float value();
    }

    /* compiled from: WazeSource */
    class Generator implements GeneratedValue {
        float mCurrent;
        float mIncrementBy;
        float mStart;
        boolean mStop = false;

        Generator(float f2, float f3) {
            this.mStart = f2;
            this.mIncrementBy = f3;
            this.mCurrent = f2;
        }

        @Override // androidx.constraintlayout.core.state.ConstraintSetParser.GeneratedValue
        public float value() {
            if (!this.mStop) {
                this.mCurrent += this.mIncrementBy;
            }
            return this.mCurrent;
        }
    }

    /* compiled from: WazeSource */
    public enum MotionLayoutDebugFlags {
        NONE,
        SHOW_ALL,
        UNKNOWN
    }

    /* compiled from: WazeSource */
    class OverrideValue implements GeneratedValue {
        float mValue;

        OverrideValue(float f2) {
            this.mValue = f2;
        }

        @Override // androidx.constraintlayout.core.state.ConstraintSetParser.GeneratedValue
        public float value() {
            return this.mValue;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    static void applyAttribute(State state, LayoutVariables layoutVariables, ConstraintReference constraintReference, CLObject cLObject, String str) throws CLParsingException {
        switch (str.hashCode()) {
            case -1448775240:
                if (str.equals("centerVertically")) {
                    String string = cLObject.getString(str);
                    boolean zEquals = string.equals("parent");
                    Object obj = string;
                    if (zEquals) {
                        obj = State.PARENT;
                    }
                    ConstraintReference constraintReferenceConstraints = state.constraints(obj);
                    constraintReference.topToTop(constraintReferenceConstraints);
                    constraintReference.bottomToBottom(constraintReferenceConstraints);
                    return;
                }
                break;
            case -1364013995:
                if (str.equals(TtmlNode.CENTER)) {
                    String string2 = cLObject.getString(str);
                    ConstraintReference constraintReferenceConstraints2 = string2.equals("parent") ? state.constraints(State.PARENT) : state.constraints(string2);
                    constraintReference.startToStart(constraintReferenceConstraints2);
                    constraintReference.endToEnd(constraintReferenceConstraints2);
                    constraintReference.topToTop(constraintReferenceConstraints2);
                    constraintReference.bottomToBottom(constraintReferenceConstraints2);
                    return;
                }
                break;
            case -1349088399:
                if (str.equals("custom")) {
                    parseCustomProperties(cLObject, constraintReference, str);
                    return;
                }
                break;
            case -1249320806:
                if (str.equals("rotationX")) {
                    constraintReference.rotationX(layoutVariables.get(cLObject.get(str)));
                    return;
                }
                break;
            case -1249320805:
                if (str.equals("rotationY")) {
                    constraintReference.rotationY(layoutVariables.get(cLObject.get(str)));
                    return;
                }
                break;
            case -1249320804:
                if (str.equals("rotationZ")) {
                    constraintReference.rotationZ(layoutVariables.get(cLObject.get(str)));
                    return;
                }
                break;
            case -1225497657:
                if (str.equals("translationX")) {
                    constraintReference.translationX(toPix(state, layoutVariables.get(cLObject.get(str))));
                    return;
                }
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    constraintReference.translationY(toPix(state, layoutVariables.get(cLObject.get(str))));
                    return;
                }
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    constraintReference.translationZ(toPix(state, layoutVariables.get(cLObject.get(str))));
                    return;
                }
                break;
            case -1221029593:
                if (str.equals("height")) {
                    constraintReference.setHeight(parseDimension(cLObject, str, state, state.getDpToPixel()));
                    return;
                }
                break;
            case -1068318794:
                if (str.equals("motion")) {
                    parseMotionProperties(cLObject.get(str), constraintReference);
                    return;
                }
                break;
            case -987906986:
                if (str.equals("pivotX")) {
                    constraintReference.pivotX(layoutVariables.get(cLObject.get(str)));
                    return;
                }
                break;
            case -987906985:
                if (str.equals("pivotY")) {
                    constraintReference.pivotY(layoutVariables.get(cLObject.get(str)));
                    return;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    constraintReference.scaleX(layoutVariables.get(cLObject.get(str)));
                    return;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    constraintReference.scaleY(layoutVariables.get(cLObject.get(str)));
                    return;
                }
                break;
            case -247669061:
                if (str.equals("hRtlBias")) {
                    float f2 = layoutVariables.get(cLObject.get(str));
                    if (state.isRtl()) {
                        f2 = 1.0f - f2;
                    }
                    constraintReference.horizontalBias(f2);
                    return;
                }
                break;
            case -61505906:
                if (str.equals("vWeight")) {
                    constraintReference.setVerticalChainWeight(layoutVariables.get(cLObject.get(str)));
                    return;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    constraintReference.alpha(layoutVariables.get(cLObject.get(str)));
                    return;
                }
                break;
            case 98116417:
                if (str.equals("hBias")) {
                    constraintReference.horizontalBias(layoutVariables.get(cLObject.get(str)));
                    return;
                }
                break;
            case 111045711:
                if (str.equals("vBias")) {
                    constraintReference.verticalBias(layoutVariables.get(cLObject.get(str)));
                    return;
                }
                break;
            case 113126854:
                if (str.equals("width")) {
                    constraintReference.setWidth(parseDimension(cLObject, str, state, state.getDpToPixel()));
                    return;
                }
                break;
            case 398344448:
                if (str.equals("hWeight")) {
                    constraintReference.setHorizontalChainWeight(layoutVariables.get(cLObject.get(str)));
                    return;
                }
                break;
            case 1404070310:
                if (str.equals("centerHorizontally")) {
                    String string3 = cLObject.getString(str);
                    boolean zEquals2 = string3.equals("parent");
                    Object obj2 = string3;
                    if (zEquals2) {
                        obj2 = State.PARENT;
                    }
                    ConstraintReference constraintReferenceConstraints3 = state.constraints(obj2);
                    constraintReference.startToStart(constraintReferenceConstraints3);
                    constraintReference.endToEnd(constraintReferenceConstraints3);
                    return;
                }
                break;
            case 1941332754:
                if (str.equals("visibility")) {
                    String string4 = cLObject.getString(str);
                    int iHashCode = string4.hashCode();
                    if (iHashCode == -1901805651) {
                        if (string4.equals("invisible")) {
                            constraintReference.visibility(4);
                            constraintReference.alpha(0.0f);
                            return;
                        }
                        return;
                    }
                    if (iHashCode == 3178655) {
                        if (string4.equals("gone")) {
                            constraintReference.visibility(8);
                            return;
                        }
                        return;
                    } else {
                        if (iHashCode == 466743410 && string4.equals("visible")) {
                            constraintReference.visibility(0);
                            return;
                        }
                        return;
                    }
                }
                break;
        }
        parseConstraint(state, layoutVariables, cLObject, constraintReference, str);
    }

    private static int indexOf(String str, String... strArr) {
        for (int i2 = 0; i2 < strArr.length; i2++) {
            if (strArr[i2].equals(str)) {
                return i2;
            }
        }
        return -1;
    }

    static String lookForType(CLObject cLObject) {
        ArrayList<String> arrayListNames = cLObject.names();
        int size = arrayListNames.size();
        int i2 = 0;
        while (i2 < size) {
            boolean zEquals = arrayListNames.get(i2).equals(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
            i2++;
            if (zEquals) {
                return cLObject.getString(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static void override(androidx.constraintlayout.core.parser.CLObject r8, java.lang.String r9, androidx.constraintlayout.core.parser.CLObject r10) throws androidx.constraintlayout.core.parser.CLParsingException {
        /*
            boolean r0 = r8.has(r9)
            if (r0 != 0) goto La
            r8.put(r9, r10)
            return
        La:
            androidx.constraintlayout.core.parser.CLObject r8 = r8.getObject(r9)
            java.util.ArrayList r9 = r10.names()
            int r0 = r9.size()
            r1 = 0
            r2 = r1
        L18:
            if (r2 >= r0) goto Le8
            java.lang.Object r3 = r9.get(r2)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = "clear"
            boolean r5 = r3.equals(r4)
            if (r5 != 0) goto L31
            androidx.constraintlayout.core.parser.CLElement r4 = r10.get(r3)
            r8.put(r3, r4)
            goto Le4
        L31:
            androidx.constraintlayout.core.parser.CLArray r3 = r10.getArray(r4)
            r4 = r1
        L36:
            int r5 = r3.size()
            if (r4 >= r5) goto Le4
            java.lang.String r5 = r3.getStringOrNull(r4)
            if (r5 != 0) goto L44
            goto Le0
        L44:
            int r6 = r5.hashCode()
            r7 = -1727069561(0xffffffff990f0287, float:-7.393437E-24)
            if (r6 == r7) goto L9d
            r7 = -1606703562(0xffffffffa03ba636, float:-1.5894511E-19)
            if (r6 == r7) goto L6c
            r7 = 414334925(0x18b23fcd, float:4.6076344E-24)
            if (r6 == r7) goto L59
            goto Ldd
        L59:
            java.lang.String r6 = "dimensions"
            boolean r6 = r5.equals(r6)
            if (r6 == 0) goto Ldd
            java.lang.String r5 = "width"
            r8.remove(r5)
            java.lang.String r5 = "height"
            r8.remove(r5)
            goto Le0
        L6c:
            java.lang.String r6 = "constraints"
            boolean r6 = r5.equals(r6)
            if (r6 == 0) goto Ldd
            java.lang.String r5 = "start"
            r8.remove(r5)
            java.lang.String r5 = "end"
            r8.remove(r5)
            java.lang.String r5 = "top"
            r8.remove(r5)
            java.lang.String r5 = "bottom"
            r8.remove(r5)
            java.lang.String r5 = "baseline"
            r8.remove(r5)
            java.lang.String r5 = "center"
            r8.remove(r5)
            java.lang.String r5 = "centerHorizontally"
            r8.remove(r5)
            java.lang.String r5 = "centerVertically"
            r8.remove(r5)
            goto Le0
        L9d:
            java.lang.String r6 = "transforms"
            boolean r6 = r5.equals(r6)
            if (r6 == 0) goto Ldd
            java.lang.String r5 = "visibility"
            r8.remove(r5)
            java.lang.String r5 = "alpha"
            r8.remove(r5)
            java.lang.String r5 = "pivotX"
            r8.remove(r5)
            java.lang.String r5 = "pivotY"
            r8.remove(r5)
            java.lang.String r5 = "rotationX"
            r8.remove(r5)
            java.lang.String r5 = "rotationY"
            r8.remove(r5)
            java.lang.String r5 = "rotationZ"
            r8.remove(r5)
            java.lang.String r5 = "scaleX"
            r8.remove(r5)
            java.lang.String r5 = "scaleY"
            r8.remove(r5)
            java.lang.String r5 = "translationX"
            r8.remove(r5)
            java.lang.String r5 = "translationY"
            r8.remove(r5)
            goto Le0
        Ldd:
            r8.remove(r5)
        Le0:
            int r4 = r4 + 1
            goto L36
        Le4:
            int r2 = r2 + 1
            goto L18
        Le8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.state.ConstraintSetParser.override(androidx.constraintlayout.core.parser.CLObject, java.lang.String, androidx.constraintlayout.core.parser.CLObject):void");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    static void parseBarrier(State state, String str, CLObject cLObject) throws CLParsingException {
        CLArray arrayOrNull;
        boolean zIsRtl = state.isRtl();
        BarrierReference barrierReferenceBarrier = state.barrier(str, State.Direction.END);
        ArrayList<String> arrayListNames = cLObject.names();
        if (arrayListNames == null) {
            return;
        }
        int size = arrayListNames.size();
        for (int i2 = 0; i2 < size; i2++) {
            String str2 = arrayListNames.get(i2);
            int iHashCode = str2.hashCode();
            if (iHashCode != -1081309778) {
                if (iHashCode != -962590849) {
                    if (iHashCode == -567445985 && str2.equals("contains") && (arrayOrNull = cLObject.getArrayOrNull(str2)) != null) {
                        for (int i3 = 0; i3 < arrayOrNull.size(); i3++) {
                            barrierReferenceBarrier.add(state.constraints(arrayOrNull.get(i3).content()));
                        }
                    }
                } else if (str2.equals("direction")) {
                    String string = cLObject.getString(str2);
                    switch (string.hashCode()) {
                        case -1383228885:
                            if (string.equals("bottom")) {
                                barrierReferenceBarrier.setBarrierDirection(State.Direction.BOTTOM);
                                break;
                            } else {
                                break;
                            }
                        case 100571:
                            if (string.equals(TtmlNode.END)) {
                                if (zIsRtl) {
                                    barrierReferenceBarrier.setBarrierDirection(State.Direction.LEFT);
                                    break;
                                } else {
                                    barrierReferenceBarrier.setBarrierDirection(State.Direction.RIGHT);
                                    break;
                                }
                            } else {
                                break;
                            }
                        case 115029:
                            if (string.equals("top")) {
                                barrierReferenceBarrier.setBarrierDirection(State.Direction.TOP);
                                break;
                            } else {
                                break;
                            }
                        case 3317767:
                            if (string.equals(TtmlNode.LEFT)) {
                                barrierReferenceBarrier.setBarrierDirection(State.Direction.LEFT);
                                break;
                            } else {
                                break;
                            }
                        case 108511772:
                            if (string.equals(TtmlNode.RIGHT)) {
                                barrierReferenceBarrier.setBarrierDirection(State.Direction.RIGHT);
                                break;
                            } else {
                                break;
                            }
                        case 109757538:
                            if (string.equals(TtmlNode.START)) {
                                if (zIsRtl) {
                                    barrierReferenceBarrier.setBarrierDirection(State.Direction.RIGHT);
                                    break;
                                } else {
                                    barrierReferenceBarrier.setBarrierDirection(State.Direction.LEFT);
                                    break;
                                }
                            } else {
                                break;
                            }
                    }
                }
            } else if (str2.equals("margin")) {
                float floatOrNaN = cLObject.getFloatOrNaN(str2);
                if (!Float.isNaN(floatOrNaN)) {
                    barrierReferenceBarrier.margin(Float.valueOf(toPix(state, floatOrNaN)));
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static void parseChain(int r8, androidx.constraintlayout.core.state.State r9, androidx.constraintlayout.core.state.ConstraintSetParser.LayoutVariables r10, androidx.constraintlayout.core.parser.CLArray r11) throws androidx.constraintlayout.core.parser.CLParsingException {
        /*
            if (r8 != 0) goto L7
            androidx.constraintlayout.core.state.helpers.HorizontalChainReference r8 = r9.horizontalChain()
            goto Lb
        L7:
            androidx.constraintlayout.core.state.helpers.VerticalChainReference r8 = r9.verticalChain()
        Lb:
            r0 = 1
            androidx.constraintlayout.core.parser.CLElement r1 = r11.get(r0)
            boolean r2 = r1 instanceof androidx.constraintlayout.core.parser.CLArray
            if (r2 == 0) goto Lc0
            androidx.constraintlayout.core.parser.CLArray r1 = (androidx.constraintlayout.core.parser.CLArray) r1
            int r2 = r1.size()
            if (r2 <= 0) goto Lc0
            r2 = 0
            r3 = r2
        L1e:
            int r4 = r1.size()
            if (r3 >= r4) goto L32
            java.lang.String r4 = r1.getString(r3)
            java.lang.Object[] r5 = new java.lang.Object[r0]
            r5[r2] = r4
            r8.add(r5)
            int r3 = r3 + 1
            goto L1e
        L32:
            int r1 = r11.size()
            r3 = 2
            if (r1 <= r3) goto Lc0
            androidx.constraintlayout.core.parser.CLElement r11 = r11.get(r3)
            boolean r1 = r11 instanceof androidx.constraintlayout.core.parser.CLObject
            if (r1 != 0) goto L43
            goto Lc0
        L43:
            androidx.constraintlayout.core.parser.CLObject r11 = (androidx.constraintlayout.core.parser.CLObject) r11
            java.util.ArrayList r1 = r11.names()
            int r3 = r1.size()
            r4 = r2
        L4e:
            if (r4 >= r3) goto Lc0
            java.lang.Object r5 = r1.get(r4)
            java.lang.String r5 = (java.lang.String) r5
            int r6 = r5.hashCode()
            r7 = 109780401(0x68b1db1, float:5.2329616E-35)
            if (r6 == r7) goto L60
            goto Lba
        L60:
            java.lang.String r6 = "style"
            boolean r6 = r5.equals(r6)
            if (r6 == 0) goto Lba
            androidx.constraintlayout.core.parser.CLElement r5 = r11.get(r5)
            boolean r6 = r5 instanceof androidx.constraintlayout.core.parser.CLArray
            if (r6 == 0) goto L85
            r6 = r5
            androidx.constraintlayout.core.parser.CLArray r6 = (androidx.constraintlayout.core.parser.CLArray) r6
            int r7 = r6.size()
            if (r7 <= r0) goto L85
            java.lang.String r5 = r6.getString(r2)
            float r6 = r6.getFloat(r0)
            r8.bias(r6)
            goto L89
        L85:
            java.lang.String r5 = r5.content()
        L89:
            int r6 = r5.hashCode()
            r7 = -995865480(0xffffffffc4a44c78, float:-1314.3896)
            if (r6 == r7) goto La6
            r7 = 1311368264(0x4e29e448, float:7.1257754E8)
            if (r6 == r7) goto L98
            goto Lb4
        L98:
            java.lang.String r6 = "spread_inside"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto Lb4
            androidx.constraintlayout.core.state.State$Chain r5 = androidx.constraintlayout.core.state.State.Chain.SPREAD_INSIDE
            r8.style(r5)
            goto Lbd
        La6:
            java.lang.String r6 = "packed"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto Lb4
            androidx.constraintlayout.core.state.State$Chain r5 = androidx.constraintlayout.core.state.State.Chain.PACKED
            r8.style(r5)
            goto Lbd
        Lb4:
            androidx.constraintlayout.core.state.State$Chain r5 = androidx.constraintlayout.core.state.State.Chain.SPREAD
            r8.style(r5)
            goto Lbd
        Lba:
            parseConstraint(r9, r10, r11, r8, r5)
        Lbd:
            int r4 = r4 + 1
            goto L4e
        Lc0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.state.ConstraintSetParser.parseChain(int, androidx.constraintlayout.core.state.State, androidx.constraintlayout.core.state.ConstraintSetParser$LayoutVariables, androidx.constraintlayout.core.parser.CLArray):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009c, code lost:
    
        if (r6.equals(androidx.media3.extractor.text.ttml.TtmlNode.START) != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a5, code lost:
    
        if (r6.equals(androidx.media3.extractor.text.ttml.TtmlNode.RIGHT) != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a7, code lost:
    
        r16 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b1, code lost:
    
        if (r6.equals(androidx.media3.extractor.text.ttml.TtmlNode.LEFT) != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ba, code lost:
    
        if (r6.equals("top") != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c3, code lost:
    
        if (r6.equals(androidx.media3.extractor.text.ttml.TtmlNode.END) != false) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void parseChainType(java.lang.String r17, androidx.constraintlayout.core.state.State r18, java.lang.String r19, androidx.constraintlayout.core.state.ConstraintSetParser.LayoutVariables r20, androidx.constraintlayout.core.parser.CLObject r21) throws androidx.constraintlayout.core.parser.CLParsingException {
        /*
            Method dump skipped, instructions count: 520
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.state.ConstraintSetParser.parseChainType(java.lang.String, androidx.constraintlayout.core.state.State, java.lang.String, androidx.constraintlayout.core.state.ConstraintSetParser$LayoutVariables, androidx.constraintlayout.core.parser.CLObject):void");
    }

    static long parseColorString(String str) {
        if (!str.startsWith("#")) {
            return -1L;
        }
        String strSubstring = str.substring(1);
        if (strSubstring.length() == 6) {
            strSubstring = "FF".concat(String.valueOf(strSubstring));
        }
        return Long.parseLong(strSubstring, 16);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:19:0x0084. Please report as an issue. */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static void parseConstraint(androidx.constraintlayout.core.state.State r22, androidx.constraintlayout.core.state.ConstraintSetParser.LayoutVariables r23, androidx.constraintlayout.core.parser.CLObject r24, androidx.constraintlayout.core.state.ConstraintReference r25, java.lang.String r26) throws androidx.constraintlayout.core.parser.CLParsingException {
        /*
            Method dump skipped, instructions count: 692
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.state.ConstraintSetParser.parseConstraint(androidx.constraintlayout.core.state.State, androidx.constraintlayout.core.state.ConstraintSetParser$LayoutVariables, androidx.constraintlayout.core.parser.CLObject, androidx.constraintlayout.core.state.ConstraintReference, java.lang.String):void");
    }

    static void parseConstraintSets(CoreMotionScene coreMotionScene, CLObject cLObject) throws CLParsingException {
        ArrayList<String> arrayListNames = cLObject.names();
        if (arrayListNames == null) {
            return;
        }
        int size = arrayListNames.size();
        for (int i2 = 0; i2 < size; i2++) {
            String str = arrayListNames.get(i2);
            CLObject object = cLObject.getObject(str);
            String stringOrNull = object.getStringOrNull("Extends");
            if (stringOrNull == null || stringOrNull.isEmpty()) {
                coreMotionScene.setConstraintSetContent(str, object.toJSON());
            } else {
                String constraintSet = coreMotionScene.getConstraintSet(stringOrNull);
                if (constraintSet != null) {
                    CLObject cLObject2 = CLParser.parse(constraintSet);
                    ArrayList<String> arrayListNames2 = object.names();
                    if (arrayListNames2 != null) {
                        int size2 = arrayListNames2.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            String str2 = arrayListNames2.get(i3);
                            CLElement cLElement = object.get(str2);
                            if (cLElement instanceof CLObject) {
                                override(cLObject2, str2, (CLObject) cLElement);
                            }
                        }
                        coreMotionScene.setConstraintSetContent(str, cLObject2.toJSON());
                    }
                }
            }
        }
    }

    static void parseCustomProperties(CLObject cLObject, ConstraintReference constraintReference, String str) throws CLParsingException {
        ArrayList<String> arrayListNames;
        CLObject objectOrNull = cLObject.getObjectOrNull(str);
        if (objectOrNull == null || (arrayListNames = objectOrNull.names()) == null) {
            return;
        }
        int size = arrayListNames.size();
        for (int i2 = 0; i2 < size; i2++) {
            String str2 = arrayListNames.get(i2);
            CLElement cLElement = objectOrNull.get(str2);
            if (cLElement instanceof CLNumber) {
                constraintReference.addCustomFloat(str2, cLElement.getFloat());
            } else if (cLElement instanceof CLString) {
                long colorString = parseColorString(cLElement.content());
                if (colorString != -1) {
                    constraintReference.addCustomColor(str2, (int) colorString);
                }
            }
        }
    }

    public static void parseDesignElementsJSON(String str, ArrayList<DesignElement> arrayList) throws CLParsingException {
        CLObject cLObject = CLParser.parse(str);
        ArrayList<String> arrayListNames = cLObject.names();
        if (arrayListNames.size() > 0) {
            String str2 = arrayListNames.get(0);
            CLElement cLElement = cLObject.get(str2);
            if (str2.hashCode() == 2043588062 && str2.equals("Design") && (cLElement instanceof CLObject)) {
                CLObject cLObject2 = (CLObject) cLElement;
                ArrayList<String> arrayListNames2 = cLObject2.names();
                for (int i2 = 0; i2 < arrayListNames2.size(); i2++) {
                    String str3 = arrayListNames2.get(i2);
                    CLObject cLObject3 = (CLObject) cLObject2.get(str3);
                    System.out.printf("element found " + str3 + "", new Object[0]);
                    String stringOrNull = cLObject3.getStringOrNull(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
                    if (stringOrNull != null) {
                        HashMap map = new HashMap();
                        int size = cLObject3.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            CLKey cLKey = (CLKey) cLObject3.get(i2);
                            String strContent = cLKey.content();
                            String strContent2 = cLKey.getValue().content();
                            if (strContent2 != null) {
                                map.put(strContent, strContent2);
                            }
                        }
                        arrayList.add(new DesignElement(str2, stringOrNull, map));
                    }
                }
            }
        }
    }

    static Dimension parseDimension(CLObject cLObject, String str, State state, CorePixelDp corePixelDp) throws CLParsingException {
        CLElement cLElement = cLObject.get(str);
        boolean z = cLElement instanceof CLString;
        Dimension dimensionCreateFixed = Dimension.createFixed(0);
        if (z) {
            return parseDimensionMode(cLElement.content());
        }
        if (cLElement instanceof CLNumber) {
            return Dimension.createFixed(state.convertDimension(Float.valueOf(corePixelDp.toPixels(cLObject.getFloat(str)))));
        }
        if (cLElement instanceof CLObject) {
            CLObject cLObject2 = (CLObject) cLElement;
            String stringOrNull = cLObject2.getStringOrNull("value");
            if (stringOrNull != null) {
                dimensionCreateFixed = parseDimensionMode(stringOrNull);
            }
            CLElement orNull = cLObject2.getOrNull("min");
            if (orNull != null) {
                if (orNull instanceof CLNumber) {
                    dimensionCreateFixed.min(state.convertDimension(Float.valueOf(corePixelDp.toPixels(((CLNumber) orNull).getFloat()))));
                } else if (orNull instanceof CLString) {
                    dimensionCreateFixed.min(Dimension.WRAP_DIMENSION);
                }
            }
            CLElement orNull2 = cLObject2.getOrNull("max");
            if (orNull2 != null) {
                if (orNull2 instanceof CLNumber) {
                    dimensionCreateFixed.max(state.convertDimension(Float.valueOf(corePixelDp.toPixels(((CLNumber) orNull2).getFloat()))));
                    return dimensionCreateFixed;
                }
                if (orNull2 instanceof CLString) {
                    dimensionCreateFixed.max(Dimension.WRAP_DIMENSION);
                }
            }
        }
        return dimensionCreateFixed;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    static Dimension parseDimensionMode(String str) {
        Dimension dimensionCreateFixed = Dimension.createFixed(0);
        switch (str.hashCode()) {
            case -1460244870:
                if (str.equals("preferWrap")) {
                    return Dimension.createSuggested(Dimension.WRAP_DIMENSION);
                }
                break;
            case -995424086:
                if (str.equals("parent")) {
                    return Dimension.createParent();
                }
                break;
            case -895684237:
                if (str.equals("spread")) {
                    return Dimension.createSuggested(Dimension.SPREAD_DIMENSION);
                }
                break;
            case 3657802:
                if (str.equals("wrap")) {
                    return Dimension.createWrap();
                }
                break;
        }
        if (str.endsWith("%")) {
            Dimension dimensionCreatePercent = Dimension.createPercent(0, Float.parseFloat(str.substring(0, str.indexOf(37))) / 100.0f);
            dimensionCreatePercent.suggested(0);
            return dimensionCreatePercent;
        }
        if (!str.contains(":")) {
            return dimensionCreateFixed;
        }
        Dimension dimensionCreateRatio = Dimension.createRatio(str);
        dimensionCreateRatio.suggested(Dimension.SPREAD_DIMENSION);
        return dimensionCreateRatio;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x021b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void parseFlowType(java.lang.String r19, androidx.constraintlayout.core.state.State r20, java.lang.String r21, androidx.constraintlayout.core.state.ConstraintSetParser.LayoutVariables r22, androidx.constraintlayout.core.parser.CLObject r23) throws androidx.constraintlayout.core.parser.CLParsingException {
        /*
            Method dump skipped, instructions count: 1116
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.state.ConstraintSetParser.parseFlowType(java.lang.String, androidx.constraintlayout.core.state.State, java.lang.String, androidx.constraintlayout.core.state.ConstraintSetParser$LayoutVariables, androidx.constraintlayout.core.parser.CLObject):void");
    }

    static void parseGenerate(State state, LayoutVariables layoutVariables, CLObject cLObject) throws CLParsingException {
        ArrayList<String> arrayListNames = cLObject.names();
        if (arrayListNames == null) {
            return;
        }
        int size = arrayListNames.size();
        for (int i2 = 0; i2 < size; i2++) {
            String str = arrayListNames.get(i2);
            CLElement cLElement = cLObject.get(str);
            ArrayList<String> list = layoutVariables.getList(str);
            if (list != null && (cLElement instanceof CLObject)) {
                int size2 = list.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    parseWidget(state, layoutVariables, list.get(i3), (CLObject) cLElement);
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void parseGridType(java.lang.String r9, androidx.constraintlayout.core.state.State r10, java.lang.String r11, androidx.constraintlayout.core.state.ConstraintSetParser.LayoutVariables r12, androidx.constraintlayout.core.parser.CLObject r13) throws androidx.constraintlayout.core.parser.CLParsingException {
        /*
            Method dump skipped, instructions count: 552
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.state.ConstraintSetParser.parseGridType(java.lang.String, androidx.constraintlayout.core.state.State, java.lang.String, androidx.constraintlayout.core.state.ConstraintSetParser$LayoutVariables, androidx.constraintlayout.core.parser.CLObject):void");
    }

    static void parseGuideline(int i2, State state, CLArray cLArray) throws CLParsingException {
        CLObject cLObject;
        String stringOrNull;
        CLElement cLElement = cLArray.get(1);
        if ((cLElement instanceof CLObject) && (stringOrNull = (cLObject = (CLObject) cLElement).getStringOrNull(TtmlNode.ATTR_ID)) != null) {
            parseGuidelineParams(i2, state, stringOrNull, cLObject);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007c A[PHI: r8 r10 r11
  0x007c: PHI (r8v2 float) = 
  (r8v1 float)
  (r8v1 float)
  (r8v1 float)
  (r8v10 float)
  (r8v1 float)
  (r8v1 float)
  (r8v12 float)
  (r8v13 float)
  (r8v1 float)
 binds: [B:18:0x0046, B:36:0x0097, B:33:0x0084, B:30:0x007b, B:28:0x0070, B:25:0x005f, B:26:0x0061, B:23:0x0059, B:21:0x004e] A[DONT_GENERATE, DONT_INLINE]
  0x007c: PHI (r10v2 boolean) = 
  (r10v1 boolean)
  (r10v1 boolean)
  (r10v1 boolean)
  (r10v9 boolean)
  (r10v1 boolean)
  (r10v1 boolean)
  (r10v1 boolean)
  (r10v1 boolean)
  (r10v1 boolean)
 binds: [B:18:0x0046, B:36:0x0097, B:33:0x0084, B:30:0x007b, B:28:0x0070, B:25:0x005f, B:26:0x0061, B:23:0x0059, B:21:0x004e] A[DONT_GENERATE, DONT_INLINE]
  0x007c: PHI (r11v2 boolean) = 
  (r11v1 boolean)
  (r11v1 boolean)
  (r11v1 boolean)
  (r11v11 boolean)
  (r11v1 boolean)
  (r11v1 boolean)
  (r11v12 boolean)
  (r11v13 boolean)
  (r11v1 boolean)
 binds: [B:18:0x0046, B:36:0x0097, B:33:0x0084, B:30:0x007b, B:28:0x0070, B:25:0x005f, B:26:0x0061, B:23:0x0059, B:21:0x004e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c5 A[PHI: r11
  0x00c5: PHI (r11v5 boolean) = (r11v1 boolean), (r11v1 boolean), (r11v6 boolean), (r11v1 boolean), (r11v1 boolean), (r11v1 boolean), (r11v9 boolean) binds: [B:43:0x00ba, B:56:0x00de, B:57:0x00e0, B:53:0x00d4, B:50:0x00cb, B:46:0x00c2, B:47:0x00c4] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static void parseGuidelineParams(int r17, androidx.constraintlayout.core.state.State r18, java.lang.String r19, androidx.constraintlayout.core.parser.CLObject r20) throws androidx.constraintlayout.core.parser.CLParsingException {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.state.ConstraintSetParser.parseGuidelineParams(int, androidx.constraintlayout.core.state.State, java.lang.String, androidx.constraintlayout.core.parser.CLObject):void");
    }

    static void parseHeader(CoreMotionScene coreMotionScene, CLObject cLObject) {
        String stringOrNull = cLObject.getStringOrNull("export");
        if (stringOrNull != null) {
            coreMotionScene.setDebugName(stringOrNull);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    static void parseHelpers(State state, LayoutVariables layoutVariables, CLArray cLArray) throws CLParsingException {
        for (int i2 = 0; i2 < cLArray.size(); i2++) {
            CLElement cLElement = cLArray.get(i2);
            if (cLElement instanceof CLArray) {
                CLArray cLArray2 = (CLArray) cLElement;
                if (cLArray2.size() > 1) {
                    String string = cLArray2.getString(0);
                    switch (string.hashCode()) {
                        case -1785507558:
                            if (string.equals("vGuideline")) {
                                parseGuideline(1, state, cLArray2);
                                break;
                            } else {
                                break;
                            }
                        case -1252464839:
                            if (string.equals("hChain")) {
                                parseChain(0, state, layoutVariables, cLArray2);
                                break;
                            } else {
                                break;
                            }
                        case -851656725:
                            if (string.equals("vChain")) {
                                parseChain(1, state, layoutVariables, cLArray2);
                                break;
                            } else {
                                break;
                            }
                        case 965681512:
                            if (string.equals("hGuideline")) {
                                parseGuideline(0, state, cLArray2);
                                break;
                            } else {
                                break;
                            }
                    }
                }
            }
        }
    }

    public static void parseJSON(String str, Transition transition, int i2) {
        CLObject objectOrNull;
        try {
            CLObject cLObject = CLParser.parse(str);
            Iterator<String> it = cLObject.names().iterator();
            while (it.hasNext()) {
                String next = it.next();
                CLElement cLElement = cLObject.get(next);
                if ((cLElement instanceof CLObject) && (objectOrNull = ((CLObject) cLElement).getObjectOrNull("custom")) != null) {
                    Iterator<String> it2 = objectOrNull.names().iterator();
                    while (it2.hasNext()) {
                        String next2 = it2.next();
                        CLElement cLElement2 = objectOrNull.get(next2);
                        if (cLElement2 instanceof CLNumber) {
                            transition.addCustomFloat(i2, next, next2, cLElement2.getFloat());
                        } else if (cLElement2 instanceof CLString) {
                            long colorString = parseColorString(cLElement2.content());
                            if (colorString != -1) {
                                transition.addCustomColor(i2, next, next2, (int) colorString);
                            }
                        }
                    }
                }
            }
        } catch (CLParsingException e2) {
            PrintStream printStream = System.err;
            e2.toString();
            printStream.println("Error parsing JSON ".concat(e2.toString()));
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static void parseMotionProperties(CLElement cLElement, ConstraintReference constraintReference) throws CLParsingException {
        if (cLElement instanceof CLObject) {
            CLObject cLObject = (CLObject) cLElement;
            TypedBundle typedBundle = new TypedBundle();
            ArrayList<String> arrayListNames = cLObject.names();
            if (arrayListNames != null) {
                int size = arrayListNames.size();
                for (int i2 = 0; i2 < size; i2++) {
                    String str = arrayListNames.get(i2);
                    switch (str.hashCode()) {
                        case -1897525331:
                            if (str.equals("stagger")) {
                                typedBundle.add(600, cLObject.getFloat(str));
                                break;
                            } else {
                                break;
                            }
                        case -1310311125:
                            if (str.equals("easing")) {
                                typedBundle.add(603, cLObject.getString(str));
                                break;
                            } else {
                                break;
                            }
                        case -1285003983:
                            if (str.equals("quantize")) {
                                CLElement cLElement2 = cLObject.get(str);
                                if (cLElement2 instanceof CLArray) {
                                    CLArray cLArray = (CLArray) cLElement2;
                                    int size2 = cLArray.size();
                                    if (size2 > 0) {
                                        typedBundle.add(610, cLArray.getInt(0));
                                        if (size2 > 1) {
                                            typedBundle.add(611, cLArray.getString(1));
                                            if (size2 > 2) {
                                                typedBundle.add(602, cLArray.getFloat(2));
                                                break;
                                            } else {
                                                break;
                                            }
                                        } else {
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                } else {
                                    typedBundle.add(610, cLObject.getInt(str));
                                    break;
                                }
                            } else {
                                break;
                            }
                        case -791482387:
                            if (str.equals("pathArc")) {
                                String string = cLObject.getString(str);
                                int iIndexOf = indexOf(string, "none", "startVertical", "startHorizontal", "flip", "below", "above");
                                if (iIndexOf == -1) {
                                    System.err.println(cLObject.getLine() + " pathArc = '" + string + "'");
                                    break;
                                } else {
                                    typedBundle.add(607, iIndexOf);
                                    break;
                                }
                            } else {
                                break;
                            }
                        case -236944793:
                            if (str.equals("relativeTo")) {
                                typedBundle.add(605, cLObject.getString(str));
                                break;
                            } else {
                                break;
                            }
                    }
                }
                constraintReference.mMotionProperties = typedBundle;
            }
        }
    }

    public static void parseMotionSceneJSON(CoreMotionScene coreMotionScene, String str) {
        try {
            CLObject cLObject = CLParser.parse(str);
            Iterator<String> it = cLObject.names().iterator();
            while (it.hasNext()) {
                String next = it.next();
                CLElement cLElement = cLObject.get(next);
                if (cLElement instanceof CLObject) {
                    CLObject cLObject2 = (CLObject) cLElement;
                    int iHashCode = next.hashCode();
                    if (iHashCode != -2137403731) {
                        if (iHashCode != -241441378) {
                            if (iHashCode == 1101852654 && next.equals("ConstraintSets")) {
                                parseConstraintSets(coreMotionScene, cLObject2);
                            }
                        } else if (next.equals("Transitions")) {
                            parseTransitions(coreMotionScene, cLObject2);
                        }
                    } else if (next.equals("Header")) {
                        parseHeader(coreMotionScene, cLObject2);
                    }
                }
            }
        } catch (CLParsingException e2) {
            PrintStream printStream = System.err;
            e2.toString();
            printStream.println("Error parsing JSON ".concat(e2.toString()));
        }
    }

    static void parseTransitions(CoreMotionScene coreMotionScene, CLObject cLObject) {
        ArrayList<String> arrayListNames = cLObject.names();
        if (arrayListNames == null) {
            return;
        }
        int size = arrayListNames.size();
        for (int i2 = 0; i2 < size; i2++) {
            String str = arrayListNames.get(i2);
            coreMotionScene.setTransitionContent(str, cLObject.getObject(str).toJSON());
        }
    }

    private static void parseVariables(State state, LayoutVariables layoutVariables, CLObject cLObject) throws CLParsingException {
        ArrayList<String> arrayListNames = cLObject.names();
        if (arrayListNames == null) {
            return;
        }
        int size = arrayListNames.size();
        for (int i2 = 0; i2 < size; i2++) {
            String str = arrayListNames.get(i2);
            CLElement cLElement = cLObject.get(str);
            if (cLElement instanceof CLNumber) {
                layoutVariables.put(str, cLElement.getInt());
            } else if (cLElement instanceof CLObject) {
                CLObject cLObject2 = (CLObject) cLElement;
                if (cLObject2.has(TypedValues.TransitionType.S_FROM) && cLObject2.has(TypedValues.TransitionType.S_TO)) {
                    layoutVariables.put(str, layoutVariables.get(cLObject2.get(TypedValues.TransitionType.S_FROM)), layoutVariables.get(cLObject2.get(TypedValues.TransitionType.S_TO)), 1.0f, cLObject2.getStringOrNull("prefix"), cLObject2.getStringOrNull("postfix"));
                } else if (cLObject2.has(TypedValues.TransitionType.S_FROM) && cLObject2.has("step")) {
                    layoutVariables.put(str, layoutVariables.get(cLObject2.get(TypedValues.TransitionType.S_FROM)), layoutVariables.get(cLObject2.get("step")));
                } else if (cLObject2.has("ids")) {
                    CLArray array = cLObject2.getArray("ids");
                    ArrayList<String> arrayList = new ArrayList<>();
                    for (int i3 = 0; i3 < array.size(); i3++) {
                        arrayList.add(array.getString(i3));
                    }
                    layoutVariables.put(str, arrayList);
                } else if (cLObject2.has("tag")) {
                    layoutVariables.put(str, state.getIdsForTag(cLObject2.getString("tag")));
                }
            }
        }
    }

    static void parseWidget(State state, LayoutVariables layoutVariables, ConstraintReference constraintReference, CLObject cLObject) throws CLParsingException {
        if (constraintReference.getWidth() == null) {
            constraintReference.setWidth(Dimension.createWrap());
        }
        if (constraintReference.getHeight() == null) {
            constraintReference.setHeight(Dimension.createWrap());
        }
        ArrayList<String> arrayListNames = cLObject.names();
        if (arrayListNames == null) {
            return;
        }
        int size = arrayListNames.size();
        for (int i2 = 0; i2 < size; i2++) {
            applyAttribute(state, layoutVariables, constraintReference, cLObject, arrayListNames.get(i2));
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void populateState(androidx.constraintlayout.core.parser.CLObject r8, androidx.constraintlayout.core.state.State r9, androidx.constraintlayout.core.state.ConstraintSetParser.LayoutVariables r10) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.state.ConstraintSetParser.populateState(androidx.constraintlayout.core.parser.CLObject, androidx.constraintlayout.core.state.State, androidx.constraintlayout.core.state.ConstraintSetParser$LayoutVariables):void");
    }

    private static float toPix(State state, float f2) {
        return state.getDpToPixel().toPixels(f2);
    }

    /* compiled from: WazeSource */
    public class LayoutVariables {
        HashMap<String, Integer> mMargins = new HashMap<>();
        HashMap<String, GeneratedValue> mGenerators = new HashMap<>();
        HashMap<String, ArrayList<String>> mArrayIds = new HashMap<>();

        float get(Object obj) {
            if (!(obj instanceof CLString)) {
                if (obj instanceof CLNumber) {
                    return ((CLNumber) obj).getFloat();
                }
                return 0.0f;
            }
            String strContent = ((CLString) obj).content();
            if (this.mGenerators.containsKey(strContent)) {
                return this.mGenerators.get(strContent).value();
            }
            if (this.mMargins.containsKey(strContent)) {
                return this.mMargins.get(strContent).floatValue();
            }
            return 0.0f;
        }

        ArrayList<String> getList(String str) {
            if (this.mArrayIds.containsKey(str)) {
                return this.mArrayIds.get(str);
            }
            return null;
        }

        void put(String str, float f2, float f3, float f4, String str2, String str3) {
            if (this.mGenerators.containsKey(str) && (this.mGenerators.get(str) instanceof OverrideValue)) {
                return;
            }
            FiniteGenerator finiteGenerator = new FiniteGenerator(f2, f3, f4, str2, str3);
            this.mGenerators.put(str, finiteGenerator);
            this.mArrayIds.put(str, finiteGenerator.array());
        }

        public void putOverride(String str, float f2) {
            this.mGenerators.put(str, new OverrideValue(f2));
        }

        void put(String str, float f2, float f3) {
            if (this.mGenerators.containsKey(str) && (this.mGenerators.get(str) instanceof OverrideValue)) {
                return;
            }
            this.mGenerators.put(str, new Generator(f2, f3));
        }

        void put(String str, int i2) {
            this.mMargins.put(str, Integer.valueOf(i2));
        }

        void put(String str, ArrayList<String> arrayList) {
            this.mArrayIds.put(str, arrayList);
        }
    }

    static void parseWidget(State state, LayoutVariables layoutVariables, String str, CLObject cLObject) throws CLParsingException {
        parseWidget(state, layoutVariables, state.constraints(str), cLObject);
    }

    public static void parseJSON(String str, State state, LayoutVariables layoutVariables) {
        try {
            populateState(CLParser.parse(str), state, layoutVariables);
        } catch (CLParsingException e2) {
            PrintStream printStream = System.err;
            e2.toString();
            printStream.println("Error parsing JSON ".concat(e2.toString()));
        }
    }
}
