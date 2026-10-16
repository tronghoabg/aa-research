package com.google.android.material.k;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import com.waze.R;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ad {

    /* renamed from: a, reason: collision with root package name */
    private int f6638a;

    /* renamed from: b, reason: collision with root package name */
    private r f6639b;

    /* renamed from: c, reason: collision with root package name */
    private int[][] f6640c;

    /* renamed from: d, reason: collision with root package name */
    private r[] f6641d;

    private ad(Context context, int i2) throws Resources.NotFoundException {
        int next;
        int depth;
        f();
        try {
            XmlResourceParser xml = context.getResources().getXml(i2);
            try {
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        if (xml.getName().equals("selector")) {
                            Resources.Theme theme = context.getTheme();
                            int depth2 = xml.getDepth() + 1;
                            while (true) {
                                int next2 = xml.next();
                                if (next2 == 1 || ((depth = xml.getDepth()) < depth2 && next2 == 3)) {
                                    break;
                                }
                                if (next2 == 2 && depth <= depth2 && xml.getName().equals("item")) {
                                    TypedArray typedArrayObtainAttributes = theme == null ? context.getResources().obtainAttributes(attributeSetAsAttributeSet, l.f6678a) : theme.obtainStyledAttributes(attributeSetAsAttributeSet, l.f6678a, 0, 0);
                                    r rVar = new r(r.l(context, typedArrayObtainAttributes.getResourceId(0, 0), typedArrayObtainAttributes.getResourceId(1, 0)), null);
                                    typedArrayObtainAttributes.recycle();
                                    int attributeCount = attributeSetAsAttributeSet.getAttributeCount();
                                    int[] iArr = new int[attributeCount];
                                    int i3 = 0;
                                    for (int i4 = 0; i4 < attributeCount; i4++) {
                                        int attributeNameResource = attributeSetAsAttributeSet.getAttributeNameResource(i4);
                                        if (attributeNameResource != R.attr.shapeAppearance && attributeNameResource != R.attr.shapeAppearanceOverlay) {
                                            int i5 = i3 + 1;
                                            iArr[i3] = attributeSetAsAttributeSet.getAttributeBooleanValue(i4, false) ? attributeNameResource : -attributeNameResource;
                                            i3 = i5;
                                        }
                                    }
                                    int[] iArrTrimStateSet = StateSet.trimStateSet(iArr, i3);
                                    int i6 = this.f6638a;
                                    if (i6 == 0 || iArrTrimStateSet.length == 0) {
                                        this.f6639b = rVar;
                                    }
                                    int[][] iArr2 = this.f6640c;
                                    if (i6 >= iArr2.length) {
                                        int i7 = i6 + 10;
                                        int[][] iArr3 = new int[i7][];
                                        System.arraycopy(iArr2, 0, iArr3, 0, i6);
                                        this.f6640c = iArr3;
                                        r[] rVarArr = new r[i7];
                                        System.arraycopy(this.f6641d, 0, rVarArr, 0, i6);
                                        this.f6641d = rVarArr;
                                    }
                                    int[][] iArr4 = this.f6640c;
                                    int i8 = this.f6638a;
                                    iArr4[i8] = iArrTrimStateSet;
                                    this.f6641d[i8] = rVar;
                                    this.f6638a = i8 + 1;
                                }
                            }
                        }
                        if (xml != null) {
                            xml.close();
                            return;
                        }
                        return;
                    }
                } while (next != 1);
                throw new XmlPullParserException("No start tag found");
            } finally {
            }
        } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
            f();
        }
    }

    private final void f() {
        this.f6639b = new r();
        this.f6640c = new int[10][];
        this.f6641d = new r[10];
    }

    public final ae c() {
        if (this.f6638a == 0) {
            return null;
        }
        return new ae(this);
    }

    /* synthetic */ ad(Context context, int i2, byte[] bArr) {
        this(context, i2);
    }

    public ad(ae aeVar) {
        int i2 = aeVar.f6642a;
        this.f6638a = i2;
        this.f6639b = aeVar.f6643b;
        this.f6640c = new int[aeVar.f6644c.length][];
        this.f6641d = new r[aeVar.f6645d.length];
        System.arraycopy(aeVar.f6644c, 0, this.f6640c, 0, i2);
        System.arraycopy(aeVar.f6645d, 0, this.f6641d, 0, this.f6638a);
    }
}
