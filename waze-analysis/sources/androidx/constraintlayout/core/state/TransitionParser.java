package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.motion.CustomVariable;
import androidx.constraintlayout.core.motion.utils.TypedBundle;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.parser.CLArray;
import androidx.constraintlayout.core.parser.CLContainer;
import androidx.constraintlayout.core.parser.CLElement;
import androidx.constraintlayout.core.parser.CLKey;
import androidx.constraintlayout.core.parser.CLNumber;
import androidx.constraintlayout.core.parser.CLObject;
import androidx.constraintlayout.core.parser.CLParsingException;
import androidx.constraintlayout.core.state.Transition;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import java.lang.reflect.Array;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public class TransitionParser {
    private static void map(TypedBundle typedBundle, int i2, String str, String... strArr) {
        for (int i3 = 0; i3 < strArr.length; i3++) {
            if (strArr[i3].equals(str)) {
                typedBundle.add(i2, i3);
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void parse(androidx.constraintlayout.core.parser.CLObject r6, androidx.constraintlayout.core.state.Transition r7) throws androidx.constraintlayout.core.parser.CLParsingException {
        /*
            r7.resetProperties()
            java.lang.String r0 = "pathMotionArc"
            java.lang.String r0 = r6.getStringOrNull(r0)
            androidx.constraintlayout.core.motion.utils.TypedBundle r1 = new androidx.constraintlayout.core.motion.utils.TypedBundle
            r1.<init>()
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L69
            int r4 = r0.hashCode()
            r5 = 509(0x1fd, float:7.13E-43)
            switch(r4) {
                case -1857024520: goto L5d;
                case -1007052250: goto L50;
                case 3145837: goto L43;
                case 3387192: goto L36;
                case 92611485: goto L29;
                case 93621297: goto L1c;
                default: goto L1b;
            }
        L1b:
            goto L41
        L1c:
            java.lang.String r2 = "below"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L41
            r0 = 4
            r1.add(r5, r0)
            goto L41
        L29:
            java.lang.String r2 = "above"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L41
            r0 = 5
            r1.add(r5, r0)
            goto L41
        L36:
            java.lang.String r4 = "none"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L41
            r1.add(r5, r2)
        L41:
            r2 = r3
            goto L69
        L43:
            java.lang.String r2 = "flip"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L41
            r0 = 3
            r1.add(r5, r0)
            goto L41
        L50:
            java.lang.String r2 = "startHorizontal"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L41
            r0 = 2
            r1.add(r5, r0)
            goto L41
        L5d:
            java.lang.String r2 = "startVertical"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L41
            r1.add(r5, r3)
            goto L41
        L69:
            java.lang.String r0 = "interpolator"
            java.lang.String r0 = r6.getStringOrNull(r0)
            if (r0 == 0) goto L77
            r2 = 705(0x2c1, float:9.88E-43)
            r1.add(r2, r0)
            goto L78
        L77:
            r3 = r2
        L78:
            java.lang.String r0 = "staggered"
            float r0 = r6.getFloatOrNaN(r0)
            boolean r2 = java.lang.Float.isNaN(r0)
            if (r2 != 0) goto L8a
            r2 = 706(0x2c2, float:9.9E-43)
            r1.add(r2, r0)
            goto L8c
        L8a:
            if (r3 == 0) goto L8f
        L8c:
            r7.setTransitionProperties(r1)
        L8f:
            java.lang.String r0 = "onSwipe"
            androidx.constraintlayout.core.parser.CLObject r0 = r6.getObjectOrNull(r0)
            if (r0 == 0) goto L9a
            parseOnSwipe(r0, r7)
        L9a:
            parseKeyFrames(r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.state.TransitionParser.parse(androidx.constraintlayout.core.parser.CLObject, androidx.constraintlayout.core.state.Transition):void");
    }

    private static void parseKeyAttribute(CLObject cLObject, Transition transition) throws CLParsingException {
        CLArray arrayOrNull;
        CustomVariable[][] customVariableArr;
        CLObject cLObject2;
        int i2;
        String[] strArr;
        CLArray arrayOrNull2 = cLObject.getArrayOrNull(TypedValues.AttributesType.S_TARGET);
        if (arrayOrNull2 == null || (arrayOrNull = cLObject.getArrayOrNull("frames")) == null) {
            return;
        }
        String stringOrNull = cLObject.getStringOrNull("transitionEasing");
        String[] strArr2 = {"scaleX", "scaleY", "translationX", "translationY", "translationZ", "rotationX", "rotationY", "rotationZ", "alpha"};
        int[] iArr = {311, 312, 304, 305, 306, 308, 309, 310, 303};
        boolean[] zArr = {false, false, true, true, true, false, false, false, false};
        int size = arrayOrNull.size();
        TypedBundle[] typedBundleArr = new TypedBundle[size];
        for (int i3 = 0; i3 < arrayOrNull.size(); i3++) {
            typedBundleArr[i3] = new TypedBundle();
        }
        int i4 = 0;
        for (int i5 = 9; i4 < i5; i5 = 9) {
            String str = strArr2[i4];
            int i6 = iArr[i4];
            boolean z = zArr[i4];
            CLArray arrayOrNull3 = cLObject.getArrayOrNull(str);
            if (arrayOrNull3 != null && arrayOrNull3.size() != size) {
                throw new CLParsingException("incorrect size for " + str + " array, not matching targets array!", cLObject);
            }
            if (arrayOrNull3 != null) {
                int i7 = 0;
                while (i7 < size) {
                    float pixels = arrayOrNull3.getFloat(i7);
                    String[] strArr3 = strArr2;
                    if (z) {
                        pixels = transition.mToPixel.toPixels(pixels);
                    }
                    typedBundleArr[i7].add(i6, pixels);
                    i7++;
                    strArr2 = strArr3;
                }
                strArr = strArr2;
            } else {
                strArr = strArr2;
                float floatOrNaN = cLObject.getFloatOrNaN(str);
                if (!Float.isNaN(floatOrNaN)) {
                    if (z) {
                        floatOrNaN = transition.mToPixel.toPixels(floatOrNaN);
                    }
                    for (int i8 = 0; i8 < size; i8++) {
                        typedBundleArr[i8].add(i6, floatOrNaN);
                    }
                }
            }
            i4++;
            strArr2 = strArr;
        }
        int i9 = 0;
        CLElement orNull = cLObject.getOrNull("custom");
        if (orNull == null || !(orNull instanceof CLObject)) {
            customVariableArr = null;
        } else {
            CLObject cLObject3 = (CLObject) orNull;
            int size2 = cLObject3.size();
            customVariableArr = (CustomVariable[][]) Array.newInstance((Class<?>) CustomVariable.class, arrayOrNull.size(), size2);
            int i10 = 0;
            while (i10 < size2) {
                CLKey cLKey = (CLKey) cLObject3.get(i10);
                String strContent = cLKey.content();
                if (cLKey.getValue() instanceof CLArray) {
                    CLArray cLArray = (CLArray) cLKey.getValue();
                    int size3 = cLArray.size();
                    if (size3 != size || size3 <= 0) {
                        cLObject2 = cLObject3;
                    } else {
                        int i11 = i9;
                        if (cLArray.get(i11) instanceof CLNumber) {
                            int i12 = i11;
                            while (i12 < size) {
                                customVariableArr[i12][i10] = new CustomVariable(strContent, 901, cLArray.get(i12).getFloat());
                                i12++;
                                cLObject3 = cLObject3;
                            }
                            cLObject2 = cLObject3;
                        } else {
                            cLObject2 = cLObject3;
                            int i13 = 0;
                            while (i13 < size) {
                                long colorString = ConstraintSetParser.parseColorString(cLArray.get(i13).content());
                                if (colorString != -1) {
                                    i2 = i13;
                                    customVariableArr[i13][i10] = new CustomVariable(strContent, 902, (int) colorString);
                                } else {
                                    i2 = i13;
                                }
                                i13 = i2 + 1;
                            }
                        }
                    }
                } else {
                    cLObject2 = cLObject3;
                    CLElement value = cLKey.getValue();
                    if (value instanceof CLNumber) {
                        float f2 = value.getFloat();
                        for (int i14 = 0; i14 < size; i14++) {
                            customVariableArr[i14][i10] = new CustomVariable(strContent, 901, f2);
                        }
                    } else {
                        long colorString2 = ConstraintSetParser.parseColorString(value.content());
                        if (colorString2 != -1) {
                            int i15 = 0;
                            while (i15 < size) {
                                customVariableArr[i15][i10] = new CustomVariable(strContent, 902, (int) colorString2);
                                i15++;
                                colorString2 = colorString2;
                            }
                        }
                    }
                }
                i10++;
                cLObject3 = cLObject2;
                i9 = 0;
            }
        }
        String stringOrNull2 = cLObject.getStringOrNull("curveFit");
        for (int i16 = 0; i16 < arrayOrNull2.size(); i16++) {
            for (int i17 = 0; i17 < size; i17++) {
                String string = arrayOrNull2.getString(i16);
                TypedBundle typedBundle = typedBundleArr[i17];
                if (stringOrNull2 != null) {
                    typedBundle.add(508, map(stringOrNull2, "spline", "linear"));
                }
                typedBundle.addIfNotNull(501, stringOrNull);
                typedBundle.add(100, arrayOrNull.getInt(i17));
                transition.addKeyAttribute(string, typedBundle, customVariableArr != null ? customVariableArr[i17] : null);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0160 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void parseKeyCycle(androidx.constraintlayout.core.parser.CLObject r19, androidx.constraintlayout.core.state.Transition r20) throws androidx.constraintlayout.core.parser.CLParsingException {
        /*
            Method dump skipped, instructions count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.state.TransitionParser.parseKeyCycle(androidx.constraintlayout.core.parser.CLObject, androidx.constraintlayout.core.state.Transition):void");
    }

    public static void parseKeyFrames(CLObject cLObject, Transition transition) throws CLParsingException {
        CLObject objectOrNull = cLObject.getObjectOrNull("KeyFrames");
        if (objectOrNull == null) {
            return;
        }
        CLArray arrayOrNull = objectOrNull.getArrayOrNull("KeyPositions");
        if (arrayOrNull != null) {
            for (int i2 = 0; i2 < arrayOrNull.size(); i2++) {
                CLElement cLElement = arrayOrNull.get(i2);
                if (cLElement instanceof CLObject) {
                    parseKeyPosition((CLObject) cLElement, transition);
                }
            }
        }
        CLArray arrayOrNull2 = objectOrNull.getArrayOrNull("KeyAttributes");
        if (arrayOrNull2 != null) {
            for (int i3 = 0; i3 < arrayOrNull2.size(); i3++) {
                CLElement cLElement2 = arrayOrNull2.get(i3);
                if (cLElement2 instanceof CLObject) {
                    parseKeyAttribute((CLObject) cLElement2, transition);
                }
            }
        }
        CLArray arrayOrNull3 = objectOrNull.getArrayOrNull("KeyCycles");
        if (arrayOrNull3 != null) {
            for (int i4 = 0; i4 < arrayOrNull3.size(); i4++) {
                CLElement cLElement3 = arrayOrNull3.get(i4);
                if (cLElement3 instanceof CLObject) {
                    parseKeyCycle((CLObject) cLElement3, transition);
                }
            }
        }
    }

    private static void parseKeyPosition(CLObject cLObject, Transition transition) throws CLParsingException {
        TypedBundle typedBundle = new TypedBundle();
        CLArray array = cLObject.getArray(TypedValues.AttributesType.S_TARGET);
        CLArray array2 = cLObject.getArray("frames");
        CLArray arrayOrNull = cLObject.getArrayOrNull("percentX");
        CLArray arrayOrNull2 = cLObject.getArrayOrNull("percentY");
        CLArray arrayOrNull3 = cLObject.getArrayOrNull("percentWidth");
        CLArray arrayOrNull4 = cLObject.getArrayOrNull("percentHeight");
        String stringOrNull = cLObject.getStringOrNull(TypedValues.TransitionType.S_PATH_MOTION_ARC);
        String stringOrNull2 = cLObject.getStringOrNull("transitionEasing");
        String stringOrNull3 = cLObject.getStringOrNull("curveFit");
        String stringOrNull4 = cLObject.getStringOrNull(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        if (stringOrNull4 == null) {
            stringOrNull4 = "parentRelative";
        }
        if (arrayOrNull == null || array2.size() == arrayOrNull.size()) {
            if (arrayOrNull2 == null || array2.size() == arrayOrNull2.size()) {
                int i2 = 0;
                while (i2 < array.size()) {
                    String string = array.getString(i2);
                    int map = map(stringOrNull4, "deltaRelative", "pathRelative", "parentRelative");
                    typedBundle.clear();
                    typedBundle.add(510, map);
                    if (stringOrNull3 != null) {
                        map(typedBundle, 508, stringOrNull3, "spline", "linear");
                    }
                    typedBundle.addIfNotNull(501, stringOrNull2);
                    if (stringOrNull != null) {
                        map(typedBundle, 509, stringOrNull, "none", "startVertical", "startHorizontal", "flip", "below", "above");
                    }
                    int i3 = 0;
                    while (i3 < array2.size()) {
                        typedBundle.add(100, array2.getInt(i3));
                        set(typedBundle, 506, arrayOrNull, i3);
                        set(typedBundle, 507, arrayOrNull2, i3);
                        set(typedBundle, 503, arrayOrNull3, i3);
                        set(typedBundle, 504, arrayOrNull4, i3);
                        transition.addKeyPosition(string, typedBundle);
                        i3++;
                        stringOrNull4 = stringOrNull4;
                    }
                    i2++;
                    stringOrNull4 = stringOrNull4;
                }
            }
        }
    }

    private static void parseOnSwipe(CLContainer cLContainer, Transition transition) {
        String stringOrNull = cLContainer.getStringOrNull("anchor");
        int map = map(cLContainer.getStringOrNull("side"), Transition.OnSwipe.SIDES);
        int map2 = map(cLContainer.getStringOrNull("direction"), Transition.OnSwipe.DIRECTIONS);
        float floatOrNaN = cLContainer.getFloatOrNaN("scale");
        float floatOrNaN2 = cLContainer.getFloatOrNaN("threshold");
        float floatOrNaN3 = cLContainer.getFloatOrNaN("maxVelocity");
        float floatOrNaN4 = cLContainer.getFloatOrNaN("maxAccel");
        String stringOrNull2 = cLContainer.getStringOrNull("limitBounds");
        int map3 = map(cLContainer.getStringOrNull("mode"), Transition.OnSwipe.MODE);
        int map4 = map(cLContainer.getStringOrNull("touchUp"), Transition.OnSwipe.TOUCH_UP);
        float floatOrNaN5 = cLContainer.getFloatOrNaN("springMass");
        float floatOrNaN6 = cLContainer.getFloatOrNaN("springStiffness");
        float floatOrNaN7 = cLContainer.getFloatOrNaN("springDamping");
        float floatOrNaN8 = cLContainer.getFloatOrNaN("stopThreshold");
        int map5 = map(cLContainer.getStringOrNull("springBoundary"), Transition.OnSwipe.BOUNDARY);
        String stringOrNull3 = cLContainer.getStringOrNull("around");
        Transition.OnSwipe onSwipeCreateOnSwipe = transition.createOnSwipe();
        onSwipeCreateOnSwipe.setAnchorId(stringOrNull);
        onSwipeCreateOnSwipe.setAnchorSide(map);
        onSwipeCreateOnSwipe.setDragDirection(map2);
        onSwipeCreateOnSwipe.setDragScale(floatOrNaN);
        onSwipeCreateOnSwipe.setDragThreshold(floatOrNaN2);
        onSwipeCreateOnSwipe.setMaxVelocity(floatOrNaN3);
        onSwipeCreateOnSwipe.setMaxAcceleration(floatOrNaN4);
        onSwipeCreateOnSwipe.setLimitBoundsTo(stringOrNull2);
        onSwipeCreateOnSwipe.setAutoCompleteMode(map3);
        onSwipeCreateOnSwipe.setOnTouchUp(map4);
        onSwipeCreateOnSwipe.setSpringMass(floatOrNaN5);
        onSwipeCreateOnSwipe.setSpringStiffness(floatOrNaN6);
        onSwipeCreateOnSwipe.setSpringDamping(floatOrNaN7);
        onSwipeCreateOnSwipe.setSpringStopThreshold(floatOrNaN8);
        onSwipeCreateOnSwipe.setSpringBoundary(map5);
        onSwipeCreateOnSwipe.setRotationCenterId(stringOrNull3);
    }

    private static void set(TypedBundle typedBundle, int i2, CLArray cLArray, int i3) {
        if (cLArray != null) {
            typedBundle.add(i2, cLArray.getFloat(i3));
        }
    }

    private static int map(String str, String... strArr) {
        for (int i2 = 0; i2 < strArr.length; i2++) {
            if (strArr[i2].equals(str)) {
                return i2;
            }
        }
        return 0;
    }

    @Deprecated
    public static void parse(CLObject cLObject, Transition transition, CorePixelDp corePixelDp) throws CLParsingException {
        parse(cLObject, transition);
    }
}
