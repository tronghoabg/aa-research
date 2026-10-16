package defpackage;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.animation.AnticipateOvershootInterpolator;
import android.view.animation.PathInterpolator;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes2.dex */
public final class aim {
    public static final aik a = aik.a;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final aes a(TypedArray typedArray, Resources resources, Resources.Theme theme, int i, aes aesVar) throws XmlPullParserException, Resources.NotFoundException, IOException {
        TypedArray typedArrayObtainAttributes;
        final int i2 = 0;
        int resourceId = typedArray.getResourceId(i, 0);
        if (resourceId == 0) {
            return aesVar;
        }
        aes aesVar2 = (aes) ahj.e.get(Integer.valueOf(resourceId));
        if (aesVar2 != null) {
            return aesVar2;
        }
        XmlResourceParser xml = resources.getXml(resourceId);
        a.an(xml);
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        String name = xml.getName();
        if (name != null) {
            final int i3 = 4;
            final int i4 = 3;
            final int i5 = 2;
            final int i6 = 1;
            switch (name.hashCode()) {
                case -2140409460:
                    if (name.equals("pathInterpolator")) {
                        int[] iArr = aij.a;
                        int[] iArr2 = aij.m;
                        if (theme == null || (typedArrayObtainAttributes = theme.obtainStyledAttributes(attributeSetAsAttributeSet, iArr2, 0, 0)) == null) {
                            TypedArray typedArrayObtainAttributes2 = resources.obtainAttributes(attributeSetAsAttributeSet, iArr2);
                        }
                        try {
                            String string = typedArrayObtainAttributes.getString(4);
                            return string != null ? new ahg(new PathInterpolator(dtd.b(string))) : (typedArrayObtainAttributes.hasValue(2) && typedArrayObtainAttributes.hasValue(3)) ? new aen(typedArrayObtainAttributes.getFloat(0, BitmapDescriptorFactory.HUE_RED), typedArrayObtainAttributes.getFloat(1, BitmapDescriptorFactory.HUE_RED), typedArrayObtainAttributes.getFloat(2, 1.0f), typedArrayObtainAttributes.getFloat(3, 1.0f)) : new ahg(new PathInterpolator(typedArrayObtainAttributes.getFloat(0, BitmapDescriptorFactory.HUE_RED), typedArrayObtainAttributes.getFloat(1, BitmapDescriptorFactory.HUE_RED)));
                        } finally {
                        }
                    }
                    break;
                case -2120889007:
                    if (name.equals("anticipateInterpolator")) {
                        int[] iArr3 = aij.a;
                        int[] iArr4 = aij.h;
                        if (theme == null || (typedArrayObtainAttributes = theme.obtainStyledAttributes(attributeSetAsAttributeSet, iArr4, 0, 0)) == null) {
                            TypedArray typedArrayObtainAttributes3 = resources.obtainAttributes(attributeSetAsAttributeSet, iArr4);
                        }
                        try {
                            final float f = typedArrayObtainAttributes.getFloat(0, 2.0f);
                            return new aes() { // from class: ahh
                                @Override // defpackage.aes
                                public final float a(float f2) {
                                    double dPow;
                                    int i7 = i6;
                                    if (i7 == 0) {
                                        double d = f2;
                                        float f3 = f;
                                        aes aesVar3 = ahj.a;
                                        dPow = Math.pow(d, f3 + f3);
                                    } else {
                                        if (i7 == 1) {
                                            aes aesVar4 = ahj.a;
                                            float f4 = f;
                                            return f2 * f2 * (((1.0f + f4) * f2) - f4);
                                        }
                                        if (i7 == 2) {
                                            aes aesVar5 = ahj.a;
                                            float f5 = f2 - 1.0f;
                                            float f6 = f;
                                            return (f5 * f5 * (((f6 + 1.0f) * f5) + f6)) + 1.0f;
                                        }
                                        float f7 = f;
                                        if (i7 != 3) {
                                            aes aesVar6 = ahj.a;
                                            return 1.0f - ((float) Math.pow(1.0f - f2, f7 + f7));
                                        }
                                        aes aesVar7 = ahj.a;
                                        dPow = Math.sin((f7 + f7) * 3.141592653589793d * f2);
                                    }
                                    return (float) dPow;
                                }
                            };
                        } finally {
                        }
                    }
                    break;
                case -1248486260:
                    if (name.equals("linearInterpolator")) {
                        return aev.d;
                    }
                    break;
                case -935873468:
                    if (name.equals("accelerateInterpolator")) {
                        int[] iArr5 = aij.a;
                        int[] iArr6 = aij.i;
                        if (theme == null || (typedArrayObtainAttributes = theme.obtainStyledAttributes(attributeSetAsAttributeSet, iArr6, 0, 0)) == null) {
                            typedArrayObtainAttributes = resources.obtainAttributes(attributeSetAsAttributeSet, iArr6);
                        }
                        try {
                            final float f2 = typedArrayObtainAttributes.getFloat(0, 1.0f);
                            return f2 == 1.0f ? ahj.b : new aes() { // from class: ahh
                                @Override // defpackage.aes
                                public final float a(float f22) {
                                    double dPow;
                                    int i7 = i2;
                                    if (i7 == 0) {
                                        double d = f22;
                                        float f3 = f2;
                                        aes aesVar3 = ahj.a;
                                        dPow = Math.pow(d, f3 + f3);
                                    } else {
                                        if (i7 == 1) {
                                            aes aesVar4 = ahj.a;
                                            float f4 = f2;
                                            return f22 * f22 * (((1.0f + f4) * f22) - f4);
                                        }
                                        if (i7 == 2) {
                                            aes aesVar5 = ahj.a;
                                            float f5 = f22 - 1.0f;
                                            float f6 = f2;
                                            return (f5 * f5 * (((f6 + 1.0f) * f5) + f6)) + 1.0f;
                                        }
                                        float f7 = f2;
                                        if (i7 != 3) {
                                            aes aesVar6 = ahj.a;
                                            return 1.0f - ((float) Math.pow(1.0f - f22, f7 + f7));
                                        }
                                        aes aesVar7 = ahj.a;
                                        dPow = Math.sin((f7 + f7) * 3.141592653589793d * f22);
                                    }
                                    return (float) dPow;
                                }
                            };
                        } finally {
                        }
                    }
                    break;
                case -425326737:
                    if (name.equals("bounceInterpolator")) {
                        return ahj.c;
                    }
                    break;
                case 1192587314:
                    if (name.equals("overshootInterpolator")) {
                        int[] iArr7 = aij.a;
                        int[] iArr8 = aij.l;
                        if (theme == null || (typedArrayObtainAttributes = theme.obtainStyledAttributes(attributeSetAsAttributeSet, iArr8, 0, 0)) == null) {
                            TypedArray typedArrayObtainAttributes4 = resources.obtainAttributes(attributeSetAsAttributeSet, iArr8);
                        }
                        try {
                            final float f3 = typedArrayObtainAttributes.getFloat(0, 2.0f);
                            return new aes() { // from class: ahh
                                @Override // defpackage.aes
                                public final float a(float f22) {
                                    double dPow;
                                    int i7 = i5;
                                    if (i7 == 0) {
                                        double d = f22;
                                        float f32 = f3;
                                        aes aesVar3 = ahj.a;
                                        dPow = Math.pow(d, f32 + f32);
                                    } else {
                                        if (i7 == 1) {
                                            aes aesVar4 = ahj.a;
                                            float f4 = f3;
                                            return f22 * f22 * (((1.0f + f4) * f22) - f4);
                                        }
                                        if (i7 == 2) {
                                            aes aesVar5 = ahj.a;
                                            float f5 = f22 - 1.0f;
                                            float f6 = f3;
                                            return (f5 * f5 * (((f6 + 1.0f) * f5) + f6)) + 1.0f;
                                        }
                                        float f7 = f3;
                                        if (i7 != 3) {
                                            aes aesVar6 = ahj.a;
                                            return 1.0f - ((float) Math.pow(1.0f - f22, f7 + f7));
                                        }
                                        aes aesVar7 = ahj.a;
                                        dPow = Math.sin((f7 + f7) * 3.141592653589793d * f22);
                                    }
                                    return (float) dPow;
                                }
                            };
                        } finally {
                        }
                    }
                    break;
                case 1472030440:
                    if (name.equals("anticipateOvershootInterpolator")) {
                        int[] iArr9 = aij.a;
                        int[] iArr10 = aij.h;
                        if (theme == null || (typedArrayObtainAttributes = theme.obtainStyledAttributes(attributeSetAsAttributeSet, iArr10, 0, 0)) == null) {
                            TypedArray typedArrayObtainAttributes5 = resources.obtainAttributes(attributeSetAsAttributeSet, iArr10);
                        }
                        try {
                            return new ahg(new AnticipateOvershootInterpolator(typedArrayObtainAttributes.getFloat(0, 2.0f), typedArrayObtainAttributes.getFloat(1, 1.5f)));
                        } finally {
                        }
                    }
                    break;
                case 1962594083:
                    if (name.equals("decelerateInterpolator")) {
                        int[] iArr11 = aij.a;
                        int[] iArr12 = aij.j;
                        if (theme == null || (typedArrayObtainAttributes = theme.obtainStyledAttributes(attributeSetAsAttributeSet, iArr12, 0, 0)) == null) {
                            TypedArray typedArrayObtainAttributes6 = resources.obtainAttributes(attributeSetAsAttributeSet, iArr12);
                        }
                        try {
                            final float f4 = typedArrayObtainAttributes.getFloat(0, 1.0f);
                            return f4 == 1.0f ? ahj.d : new aes() { // from class: ahh
                                @Override // defpackage.aes
                                public final float a(float f22) {
                                    double dPow;
                                    int i7 = i3;
                                    if (i7 == 0) {
                                        double d = f22;
                                        float f32 = f4;
                                        aes aesVar3 = ahj.a;
                                        dPow = Math.pow(d, f32 + f32);
                                    } else {
                                        if (i7 == 1) {
                                            aes aesVar4 = ahj.a;
                                            float f42 = f4;
                                            return f22 * f22 * (((1.0f + f42) * f22) - f42);
                                        }
                                        if (i7 == 2) {
                                            aes aesVar5 = ahj.a;
                                            float f5 = f22 - 1.0f;
                                            float f6 = f4;
                                            return (f5 * f5 * (((f6 + 1.0f) * f5) + f6)) + 1.0f;
                                        }
                                        float f7 = f4;
                                        if (i7 != 3) {
                                            aes aesVar6 = ahj.a;
                                            return 1.0f - ((float) Math.pow(1.0f - f22, f7 + f7));
                                        }
                                        aes aesVar7 = ahj.a;
                                        dPow = Math.sin((f7 + f7) * 3.141592653589793d * f22);
                                    }
                                    return (float) dPow;
                                }
                            };
                        } finally {
                        }
                    }
                    break;
                case 2019672672:
                    if (name.equals("accelerateDecelerateInterpolator")) {
                        return ahj.a;
                    }
                    break;
                case 2038238413:
                    if (name.equals("cycleInterpolator")) {
                        int[] iArr13 = aij.a;
                        int[] iArr14 = aij.k;
                        if (theme == null || (typedArrayObtainAttributes = theme.obtainStyledAttributes(attributeSetAsAttributeSet, iArr14, 0, 0)) == null) {
                            TypedArray typedArrayObtainAttributes7 = resources.obtainAttributes(attributeSetAsAttributeSet, iArr14);
                        }
                        try {
                            final float f5 = typedArrayObtainAttributes.getFloat(0, 1.0f);
                            return new aes() { // from class: ahh
                                @Override // defpackage.aes
                                public final float a(float f22) {
                                    double dPow;
                                    int i7 = i4;
                                    if (i7 == 0) {
                                        double d = f22;
                                        float f32 = f5;
                                        aes aesVar3 = ahj.a;
                                        dPow = Math.pow(d, f32 + f32);
                                    } else {
                                        if (i7 == 1) {
                                            aes aesVar4 = ahj.a;
                                            float f42 = f5;
                                            return f22 * f22 * (((1.0f + f42) * f22) - f42);
                                        }
                                        if (i7 == 2) {
                                            aes aesVar5 = ahj.a;
                                            float f52 = f22 - 1.0f;
                                            float f6 = f5;
                                            return (f52 * f52 * (((f6 + 1.0f) * f52) + f6)) + 1.0f;
                                        }
                                        float f7 = f5;
                                        if (i7 != 3) {
                                            aes aesVar6 = ahj.a;
                                            return 1.0f - ((float) Math.pow(1.0f - f22, f7 + f7));
                                        }
                                        aes aesVar7 = ahj.a;
                                        dPow = Math.sin((f7 + f7) * 3.141592653589793d * f22);
                                    }
                                    return (float) dPow;
                                }
                            };
                        } finally {
                        }
                    }
                    break;
            }
        }
        throw new RuntimeException("Unknown interpolator: ".concat(String.valueOf(xml.getName())));
    }

    public static final ahm b(XmlPullParser xmlPullParser, Resources resources, Resources.Theme theme, AttributeSet attributeSet) {
        TypedArray typedArrayObtainAttributes;
        int i;
        int[] iArr = aij.a;
        int[] iArr2 = aij.d;
        if (theme == null || (typedArrayObtainAttributes = theme.obtainStyledAttributes(attributeSet, iArr2, 0, 0)) == null) {
            typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, iArr2);
        }
        try {
            int i2 = typedArrayObtainAttributes.getInt(0, 0);
            ArrayList arrayList = new ArrayList();
            xmlPullParser.next();
            while (true) {
                i = 2;
                if (a.b(xmlPullParser) || (xmlPullParser.getEventType() == 3 && affa.f(xmlPullParser.getName(), "set"))) {
                    break;
                }
                if (xmlPullParser.getEventType() == 2) {
                    String name = xmlPullParser.getName();
                    if (affa.f(name, "set")) {
                        arrayList.add(b(xmlPullParser, resources, theme, attributeSet));
                    } else if (affa.f(name, "objectAnimator")) {
                        arrayList.add(d(xmlPullParser, resources, theme, attributeSet));
                    }
                }
                xmlPullParser.next();
            }
            if (i2 == 0) {
                i = 1;
            }
            return new ahm(arrayList, i);
        } finally {
            typedArrayObtainAttributes.recycle();
        }
    }

    public static final ahs c(TypedArray typedArray, float f, aes aesVar, aik aikVar, int i) {
        int iOrdinal = aikVar.ordinal();
        if (iOrdinal == 0) {
            return new ahs(f, Float.valueOf(typedArray.getFloat(i, BitmapDescriptorFactory.HUE_RED)), aesVar);
        }
        if (iOrdinal == 1) {
            return new ahs(f, Integer.valueOf(typedArray.getInt(i, 0)), aesVar);
        }
        if (iOrdinal == 2) {
            return new ahs(f, new cjv(cjn.i(typedArray.getColor(i, 0))), aesVar);
        }
        if (iOrdinal == 3) {
            return new ahs(f, com.a(typedArray.getString(i)), aesVar);
        }
        throw new aezs();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public static final defpackage.aht d(org.xmlpull.v1.XmlPullParser r19, android.content.res.Resources r20, android.content.res.Resources.Theme r21, android.util.AttributeSet r22) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aim.d(org.xmlpull.v1.XmlPullParser, android.content.res.Resources, android.content.res.Resources$Theme, android.util.AttributeSet):aht");
    }

    public static final aik e(int i, int... iArr) {
        if (i == 0) {
            return aik.a;
        }
        if (i == 1) {
            return aik.b;
        }
        if (i == 2) {
            return aik.d;
        }
        if (i == 3) {
            return aik.c;
        }
        for (int i2 : iArr) {
            if (i2 < 28 || i2 >= 32) {
                return null;
            }
        }
        return aik.c;
    }

    private static final ahx f(TypedArray typedArray, String str, int i, int i2, int i3, aes aesVar, afeg afegVar) {
        int i4 = typedArray.getInt(i, 4);
        TypedValue typedValuePeekValue = typedArray.peekValue(i2);
        boolean z = typedValuePeekValue == null;
        int i5 = typedValuePeekValue != null ? typedValuePeekValue.type : 4;
        TypedValue typedValuePeekValue2 = typedArray.peekValue(i3);
        boolean z2 = typedValuePeekValue2 != null;
        aik aikVarE = e(i4, i5, typedValuePeekValue2 != null ? typedValuePeekValue2.type : 4);
        ArrayList arrayList = new ArrayList();
        if (aikVarE == null && (!z || z2)) {
            aikVarE = aik.a;
        }
        if (!z) {
            aikVarE.getClass();
            arrayList.add(c(typedArray, BitmapDescriptorFactory.HUE_RED, aesVar, aikVarE, i2));
        }
        if (z2) {
            aikVarE.getClass();
            arrayList.add(c(typedArray, 1.0f, aesVar, aikVarE, i3));
        }
        aik aikVar = (aik) afegVar.invoke(aikVarE, arrayList);
        if (arrayList.size() > 1) {
            woy.bs(arrayList, new ail(0));
        }
        int iOrdinal = aikVar.ordinal();
        if (iOrdinal == 0) {
            return new aib(str, arrayList);
        }
        if (iOrdinal == 1) {
            return new aic(str);
        }
        if (iOrdinal == 2) {
            return new ahz(str, arrayList);
        }
        if (iOrdinal == 3) {
            return new aid(str, arrayList);
        }
        throw new aezs();
    }
}
